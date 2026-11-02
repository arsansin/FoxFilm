package zakfilm.ir;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CircleProgress extends View {

    private Paint progressPaint;
    private Paint backgroundPaint;
    private int progress = 0;
    private int max = 100;
    private float strokeWidthDp = 2; 
    private float marginDp = 5; // حاشیه داخلی

    public CircleProgress(Context context) {
        super(context);
        init(context);
    }

    public CircleProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        float density = context.getResources().getDisplayMetrics().density;
        float strokePx = strokeWidthDp * density;

        // رنگ پیشرفت
        progressPaint = new Paint();
        progressPaint.setColor(Color.parseColor("#448AFF"));
        progressPaint.setStrokeWidth(strokePx);
        progressPaint.setStyle(Paint.Style.STROKE);
        progressPaint.setAntiAlias(true);

        // رنگ باقی‌مانده
        backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.parseColor("#20FFFFFF"));
        backgroundPaint.setStrokeWidth(strokePx);
        backgroundPaint.setStyle(Paint.Style.STROKE);
        backgroundPaint.setAntiAlias(true);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setProgressColor(String hexColor) {
        progressPaint.setColor(Color.parseColor(hexColor));
        invalidate();
    }

    public void setBackgroundColorCircle(String hexColor) {
        backgroundPaint.setColor(Color.parseColor(hexColor));
        invalidate();
    }

    public void setStrokeWidthDp(float dp) {
        this.strokeWidthDp = dp;
        float px = dp * getContext().getResources().getDisplayMetrics().density;
        progressPaint.setStrokeWidth(px);
        backgroundPaint.setStrokeWidth(px);
        invalidate();
    }

    public void setMarginDp(float dp) {
        this.marginDp = dp;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float density = getContext().getResources().getDisplayMetrics().density;
        float marginPx = marginDp * density;
        float strokePx = strokeWidthDp * density;

        int size = Math.min(getWidth(), getHeight());
        RectF rect = new RectF(
                marginPx + strokePx / 2,
                marginPx + strokePx / 2,
                size - marginPx - strokePx / 2,
                size - marginPx - strokePx / 2
        );

        // دایره پس‌زمینه
        canvas.drawArc(rect, -90, 360, false, backgroundPaint);

        // دایره پیشرفت
        float angle = 360f * progress / max;
        canvas.drawArc(rect, -90, angle, false, progressPaint);
    }
}