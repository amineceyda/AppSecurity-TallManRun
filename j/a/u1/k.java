package j.a.u1;

import g.c.b.b.f;
import j.a.t1.o;
import java.util.concurrent.TimeUnit;

public final class k {
    public static final long a = f.p0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f4660d = TimeUnit.SECONDS.toNanos(f.p0("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static l f4661e = f.a;

    static {
        f.o0("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i2 = o.a;
        int o0 = f.o0("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, (Object) null);
        b = o0;
        int i3 = i2 * 128;
        if (o0 <= 2097150) {
            c = f.o0("kotlinx.coroutines.scheduler.max.pool.size", i3 < o0 ? o0 : i3 > 2097150 ? 2097150 : i3, 0, 2097150, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + 2097150 + " is less than minimum " + o0 + '.');
    }
}
