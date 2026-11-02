package zakfilm.ir;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import androidx.core.app.NotificationCompat;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    private final NotificationCompat.Builder notificationBuilder;
    private final Context context;

    public DownloadImageTask(Context context, NotificationCompat.Builder notificationBuilder) {
        this.context = context;
        this.notificationBuilder = notificationBuilder;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        String imageUrl = params[0];
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            bitmap = BitmapFactory.decodeStream(input);
        } catch (Exception e) {
            Log.e("DownloadImageTask", "Error downloading image", e);
        }
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (bitmap != null) {
            notificationBuilder.setLargeIcon(bitmap);
            notificationBuilder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap));
        } else {
            // Image download failed, set normal notification
            notificationBuilder.setStyle(new NotificationCompat.BigTextStyle().bigText("Failed to load image"));
        }
        notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
    }
}
