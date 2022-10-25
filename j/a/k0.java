package j.a;

import g.a.a.a.a;
import org.slf4j.helpers.MessageFormatter;

public final class k0 implements t0 {
    public final boolean b;

    public k0(boolean z) {
        this.b = z;
    }

    public boolean a() {
        return this.b;
    }

    public g1 c() {
        return null;
    }

    public String toString() {
        StringBuilder i2 = a.i("Empty{");
        i2.append(this.b ? "Active" : "New");
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
