package zakfilm.ir;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class JsonParser {

    public static ArrayList<HashMap<String, Object>> parseList(String jsonString) {

        ArrayList<HashMap<String, Object>> result = new ArrayList<>();

        try {
            JSONObject root = new JSONObject(jsonString);
            JSONObject data = root.getJSONObject("data");
            JSONObject list = data.getJSONObject("list");
            JSONArray arr = list.getJSONArray("data");

            int limit = Math.min(arr.length(), 15);

            for (int i = 0; i < limit; i++) {
                JSONObject obj = arr.getJSONObject(i);

                HashMap<String, Object> map = new HashMap<>();
                Iterator<String> keys = obj.keys();

                while (keys.hasNext()) {
                    String key = keys.next();
                    map.put(key, obj.get(key));
                }

                result.add(map);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return result;
    }
}
