package g.d.a.l.t;

import e.e.i.c;
import g.d.a.r.k.a;
import g.d.a.r.k.d;
import java.util.Objects;

public final class u<Z> implements v<Z>, a.d {

    /* renamed from: f  reason: collision with root package name */
    public static final c<u<?>> f2527f = g.d.a.r.k.a.a(20, new a());
    public final d b = new d.b();
    public v<Z> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2528d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2529e;

    public class a implements a.b<u<?>> {
        public Object a() {
            return new u();
        }
    }

    public static <Z> u<Z> a(v<Z> vVar) {
        u<Z> b2 = f2527f.b();
        Objects.requireNonNull(b2, "Argument must not be null");
        b2.f2529e = false;
        b2.f2528d = true;
        b2.c = vVar;
        return b2;
    }

    public int b() {
        return this.c.b();
    }

    public Class<Z> c() {
        return this.c.c();
    }

    public synchronized void d() {
        this.b.a();
        this.f2529e = true;
        if (!this.f2528d) {
            this.c.d();
            this.c = null;
            f2527f.a(this);
        }
    }

    public d e() {
        return this.b;
    }

    public synchronized void f() {
        this.b.a();
        if (this.f2528d) {
            this.f2528d = false;
            if (this.f2529e) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.c.get();
    }
}
