package g.c.a.e.k.f;

import android.support.v4.media.session.PlaybackStateCompat;
import g.c.a.e.i.b.a;
import java.text.DecimalFormat;
import java.util.Locale;

public class b {
    public static final /* synthetic */ int a = 0;

    static {
        new DecimalFormat(".0m");
        new DecimalFormat(".0k");
    }

    public static String a(long j2) {
        return b(j2, "%.2f");
    }

    public static String b(long j2, String str) {
        if (j2 < 0) {
            return null;
        }
        if (j2 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            Locale c = a.c.c();
            String w = g.a.a.a.a.w(str, " KB");
            double d2 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d2);
            return String.format(c, w, new Object[]{Double.valueOf(d2 / 1024.0d)});
        }
        int i2 = (j2 > 1073741824 ? 1 : (j2 == 1073741824 ? 0 : -1));
        Locale c2 = a.c.c();
        StringBuilder i3 = g.a.a.a.a.i(str);
        if (i2 < 0) {
            i3.append(" MB");
            String sb = i3.toString();
            double d3 = (double) j2;
            Double.isNaN(d3);
            Double.isNaN(d3);
            return String.format(c2, sb, new Object[]{Double.valueOf(d3 / 1048576.0d)});
        }
        i3.append(" GB");
        String sb2 = i3.toString();
        double d4 = (double) j2;
        Double.isNaN(d4);
        Double.isNaN(d4);
        return String.format(c2, sb2, new Object[]{Double.valueOf(d4 / 1.073741824E9d)});
    }
}
