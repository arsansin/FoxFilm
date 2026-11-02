package zakfilm.ir;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.widget.LinearLayout;

public class BlurUtil {

    // متد اصلی برای اعمال بلور روی لایوت
    public static void applyBlur(Context context, LinearLayout layout, float radius) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // 🔹 روش RenderEffect (اندروید 12+)
            layout.setRenderEffect(
                    RenderEffect.createBlurEffect(radius, radius, Shader.TileMode.CLAMP)
            );
        } else {
            // 🔹 روش Bitmap + RenderScript (قدیمی‌تر)
            Bitmap blurredBitmap = createBlurredBitmap(context, layout, radius);
            if (blurredBitmap != null) {
                layout.setBackground(new BitmapDrawable(context.getResources(), blurredBitmap));
            }
        }
    }

    // گرفتن Bitmap از ویو و بلور کردنش
    private static Bitmap createBlurredBitmap(Context context, View view, float radius) {
        try {
            // گرفتن اسکرین‌شات از ویو
            Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            view.draw(canvas);

            // RenderScript برای بلور
            RenderScript rs = RenderScript.create(context);
            Allocation input = Allocation.createFromBitmap(rs, bitmap);
            Allocation output = Allocation.createTyped(rs, input.getType());

            ScriptIntrinsicBlur script = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));
            script.setRadius(Math.min(25f, radius)); // محدودیت بلور بین 1 تا 25
            script.setInput(input);
            script.forEach(output);

            output.copyTo(bitmap);
            rs.destroy();

            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}