package zakfilm.ir;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.concurrent.TimeUnit;

public class G {

    private static final OkHttpClient client = new OkHttpClient.Builder()
        .connectTimeout(2, TimeUnit.SECONDS)
        .writeTimeout(2, TimeUnit.SECONDS)
        .readTimeout(2, TimeUnit.SECONDS)
        .build();

    public static long getFileSizeFromURL(String fileUrl) {
        try {
            Request request = new Request.Builder()
                .url(fileUrl)
                .head()
                .header("User-Agent", "Mozilla/5.0")
                .build();

            Response response = client.newCall(request).execute();
            String contentLength = response.header("Content-Length");

            if (contentLength != null) {
                return Long.parseLong(contentLength);
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}