package poly.duantotnghiep.util;

import android.content.Context;

import poly.duantotnghiep.R;

public class TimeUtility {

    private static final long DAY_DURATION = 1000 * 60 * 60 * 24;
    private static final long HOUR_DURATION = 1000 * 60 * 60;
    private static final long MINUTE_DURATION = 1000 * 60;

    public static String getTimeString(Context context, long time) {
        long numberTime = System.currentTimeMillis() - time;
        if (numberTime < 0) {
            return "";
        }

        if (numberTime >= DAY_DURATION) {
            int day = (int) (numberTime / DAY_DURATION);
            return context.getString(R.string.day_time_format, day);
        }

        if (numberTime >= HOUR_DURATION) {
            int hour = (int) (numberTime / HOUR_DURATION);
            return context.getString(R.string.hour_time_format, hour);
        }

        int mm = (int) (numberTime / MINUTE_DURATION);
        if (mm == 0) {
            return context.getString(R.string.minute_time_format, 1);
        } else {
            return context.getString(R.string.minute_time_format, mm);
        }
    }
}
