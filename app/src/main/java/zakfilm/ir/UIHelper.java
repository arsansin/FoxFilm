package zakfilm.ir;


import android.view.View;
public class UIHelper {
    

public static void hideViews(View... views) {
    for (View v : views) {
        if (v != null) v.setVisibility(View.GONE);
    }
}

public static void showViews(View... views) {
    for (View v : views) {
        if (v != null) v.setVisibility(View.VISIBLE);
    }
}
}