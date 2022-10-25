package g.e.a.a.f.z.i;

import com.google.auto.value.AutoValue;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.a.a.a.a;
import g.e.a.a.f.z.i.x;

@AutoValue
public abstract class b0 {
    public static final b0 a;

    static {
        Long l2 = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf(AbstractNetAdapter.READ_TIMEOUT);
        Long l3 = 604800000L;
        Integer num2 = 81920;
        String str = l2 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = a.w(str, " loadBatchSize");
        }
        if (valueOf == null) {
            str = a.w(str, " criticalSectionEnterTimeoutMs");
        }
        if (l3 == null) {
            str = a.w(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = a.w(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            a = new x(l2.longValue(), num.intValue(), valueOf.intValue(), l3.longValue(), num2.intValue(), (x.a) null);
            return;
        }
        throw new IllegalStateException(a.w("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
