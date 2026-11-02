package zakfilm.ir;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FCMService extends FirebaseMessagingService {

    private static final String TAG = "FCMService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getData().size() > 0) {

            String title = remoteMessage.getData().get("title");
            String body = remoteMessage.getData().get("body");
            String imageUrl = remoteMessage.getData().get("image");
            String pageName = remoteMessage.getData().get("page");

            // ذخیره مقدار page در SharedPreferences با نام save
            SharedPreferences save = getSharedPreferences("save", MODE_PRIVATE);
            save.edit()
                    .putString("page", pageName != null ? pageName : "")
                    .apply();

            sendNotification(title, body, imageUrl, pageName);
        }
    }

    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "New token: " + token);
    }

    private void sendNotification(
            String title,
            String messageBody,
            String imageUrl,
            String pageName) {

        Intent intent;

        try {

            // اضافه کردن پکیج اپلیکیشن به اسم کلاس
            String fullClassName = getPackageName() + "." + pageName;

            Class<?> cls = Class.forName(fullClassName);

            intent = new Intent(this, cls);

        } catch (Exception e) {

            Log.e(TAG,
                    "Page class not found, using MainActivity instead",
                    e);

            intent = new Intent(this, MainActivity.class);
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(
                this,
                0,
                intent,
                PendingIntent.FLAG_ONE_SHOT |
                PendingIntent.FLAG_IMMUTABLE
        );

        String channelId = "channelID";

        Uri defaultSoundUri =
                RingtoneManager.getDefaultUri(
                        RingtoneManager.TYPE_NOTIFICATION
                );

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this, channelId)

                        .setSmallIcon(R.drawable.icon_fox)

                        .setContentTitle(
                                title != null ? title : ""
                        )

                        .setContentText(
                                messageBody != null ? messageBody : ""
                        )

                        .setAutoCancel(true)

                        .setSound(defaultSoundUri)

                        .setContentIntent(pendingIntent)

                        .setPriority(
                                NotificationCompat.PRIORITY_HIGH
                        )

                        .setStyle(
                                new NotificationCompat.BigTextStyle()
                                        .bigText(
                                                messageBody != null
                                                        ? messageBody
                                                        : ""
                                        )
                        );

        // Notification Channel برای Android 8+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            NotificationChannel channel =
                    new NotificationChannel(
                            channelId,
                            "FCM Service",
                            NotificationManager.IMPORTANCE_HIGH
                    );

            channel.enableLights(true);
            channel.enableVibration(true);

            channel.setVibrationPattern(
                    new long[]{100, 200, 300}
            );

            NotificationManager notificationManager =
                    getSystemService(NotificationManager.class);

            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }

        // اگر تصویر وجود نداشت
        if (imageUrl == null || imageUrl.isEmpty()) {

            NotificationManager notificationManager =
                    (NotificationManager)
                            getSystemService(
                                    Context.NOTIFICATION_SERVICE
                            );

            if (notificationManager != null) {

                notificationManager.notify(
                        (int) System.currentTimeMillis(),
                        notificationBuilder.build()
                );
            }

        } else {

            // دانلود تصویر
            new AsyncTask<String, Void, Bitmap>() {

                @Override
                protected Bitmap doInBackground(String... params) {

                    String url = params[0];

                    HttpURLConnection connection = null;
                    InputStream input = null;

                    try {

                        connection =
                                (HttpURLConnection)
                                        new URL(url).openConnection();

                        connection.setDoInput(true);

                        connection.setConnectTimeout(10000);
                        connection.setReadTimeout(15000);

                        connection.connect();

                        input =
                                connection.getInputStream();

                        return BitmapFactory.decodeStream(input);

                    } catch (Exception e) {

                        Log.e(
                                TAG,
                                "Error downloading image",
                                e
                        );

                        return null;

                    } finally {

                        try {

                            if (input != null) {
                                input.close();
                            }

                        } catch (Exception ignored) {
                        }

                        if (connection != null) {
                            connection.disconnect();
                        }
                    }
                }

                @Override
                protected void onPostExecute(Bitmap bitmap) {

                    NotificationManager notificationManager =
                            (NotificationManager)
                                    getSystemService(
                                            Context.NOTIFICATION_SERVICE
                                    );

                    if (bitmap != null) {

                        notificationBuilder
                                .setLargeIcon(bitmap);

                        notificationBuilder
                                .setStyle(
                                        new NotificationCompat
                                                .BigPictureStyle()
                                                .bigPicture(bitmap)
                                                .bigLargeIcon((Bitmap) null)
                                );
                    }

                    if (notificationManager != null) {

                        notificationManager.notify(
                                (int) System.currentTimeMillis(),
                                notificationBuilder.build()
                        );
                    }
                }

            }.execute(imageUrl);
        }
    }
}