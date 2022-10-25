package g.c.a.e.k.d;

import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.util.Locale;

public class b {
    public static final String a = "b";

    public static String a(long j2) {
        if (j2 <= 0) {
            return "0";
        }
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = d2 / 1.073741824E9d;
        if (d3 >= 1.0d) {
            return String.format(Locale.US, "%.2fGB", new Object[]{Double.valueOf(d3)});
        }
        Double.isNaN(d2);
        double d4 = d2 / 1048576.0d;
        Log.e("GB", "gbvalue=" + d4);
        if (d4 >= 1.0d) {
            return String.format(Locale.US, "%.2fMB", new Object[]{Double.valueOf(d4)});
        }
        return String.format(Locale.US, "%.2fKB", new Object[]{Double.valueOf((double) (j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID))});
    }

    public static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static long c(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
