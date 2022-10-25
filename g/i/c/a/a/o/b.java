package g.i.c.a.a.o;

import g.a.a.a.a;
import org.slf4j.helpers.MessageFormatter;

public class b {
    public final long a;
    public final long b;
    public final double c;

    public b(long j2, long j3, double d2) {
        this.a = j2;
        this.b = j3;
        this.c = d2;
    }

    public String toString() {
        StringBuilder i2 = a.i("ExposureInfo {viewArea = ");
        i2.append(this.a);
        i2.append(", exposureArea = ");
        i2.append(this.b);
        i2.append(", exposureRate = ");
        i2.append(this.c);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
