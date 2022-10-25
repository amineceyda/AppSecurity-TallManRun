package g.i.c.a.a.t.k;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import org.slf4j.helpers.MessageFormatter;

public class a {
    public static final long c = TimeUnit.MILLISECONDS.convert(30, TimeUnit.MINUTES);
    public long a;
    public boolean b;

    public boolean a() {
        return SystemClock.elapsedRealtime() - this.a > c;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("EleExposeInfo{mExposeTime=");
        i2.append(this.a);
        i2.append("reportOverTime=");
        i2.append(a());
        i2.append("mHasReport=");
        i2.append(this.b);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
