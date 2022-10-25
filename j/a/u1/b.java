package j.a.u1;

import g.c.b.b.f;
import j.a.t1.o;
import j.a.v;

public final class b extends c {

    /* renamed from: h  reason: collision with root package name */
    public static final v f4648h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f4649i;

    static {
        b bVar = new b();
        f4649i = bVar;
        int i2 = o.a;
        f4648h = new e(bVar, f.o0("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    public b() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
