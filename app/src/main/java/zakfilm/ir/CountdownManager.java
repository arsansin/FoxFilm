package zakfilm.ir;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

public class CountdownManager {
    private static final String PREFS_NAME = "TimerPrefs";
    private static final String KEY_LAST_DAY_COUNT = "last_day_count";
    private static final String KEY_LAST_SAVED_DATE = "last_saved_date";
    private static final long ONE_DAY_MILLIS = TimeUnit.DAYS.toMillis(1);
    private SharedPreferences prefs;
    
    // سازنده
    public CountdownManager(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }
    
    // دریافت شماره روز جاری
    public int getCurrentDayNumber() {
        // گرفتن تاریخ ذخیره شده از SharedPreferences
        long lastSavedDate = prefs.getLong(KEY_LAST_SAVED_DATE, -1);
        int lastDayCount = prefs.getInt(KEY_LAST_DAY_COUNT, 0);
        
        // اگر اولین بار است که برنامه اجرا می‌شود
        if (lastSavedDate == -1) {
            return 1;
        }
        
        // محاسبه تعداد روزهای گذشته از آخرین باری که برنامه ذخیره شده
        long now = System.currentTimeMillis();
        long diffInMillis = now - lastSavedDate;
        int daysPassed = (int) (diffInMillis / ONE_DAY_MILLIS);
        
        // محاسبه شماره روز جدید
        int newDayCount = lastDayCount + daysPassed;
        if (newDayCount < 1) newDayCount = 1;
        return newDayCount;
    }
    
    // ذخیره وضعیت فعلی
    public void saveState(int currentDayCount) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(KEY_LAST_SAVED_DATE, System.currentTimeMillis());
        editor.putInt(KEY_LAST_DAY_COUNT, currentDayCount);
        editor.apply();
    }
}