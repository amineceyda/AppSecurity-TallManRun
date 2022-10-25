package g.d.a.r;

import android.os.SystemClock;

public final class f {
    public static final double a = (1.0d / Math.pow(10.0d, 6.0d));
    public static final /* synthetic */ int b = 0;

    public static double a(long j2) {
        double elapsedRealtimeNanos = (double) (SystemClock.elapsedRealtimeNanos() - j2);
        double d2 = a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d2;
    }
}
