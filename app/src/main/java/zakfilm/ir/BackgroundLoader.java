package zakfilm.ir;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.widget.LinearLayout;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BackgroundLoader extends AsyncTask<String, Void, Bitmap> {
    private LinearLayout linearLayout;

    public BackgroundLoader(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }

    @Override
    protected Bitmap doInBackground(String... urls) {
        String url = urls[0];
        Bitmap bitmap = null;
        try {
            URL imageUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            bitmap = BitmapFactory.decodeStream(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        if (bitmap != null) {
            BitmapDrawable drawable = new BitmapDrawable(linearLayout.getResources(), bitmap);
            linearLayout.setBackground(drawable);
        }
    }
}