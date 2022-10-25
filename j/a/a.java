package j.a;

import i.m.d;
import i.m.f;

public abstract class a<T> extends c1 implements y0, d<T>, x {
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final f f4581d;

    public a(f fVar, boolean z) {
        super(z);
        this.f4581d = fVar;
        this.c = fVar.plus(this);
    }

    public final void G(Throwable th) {
        g.c.b.b.f.J(this.c, th);
    }

    public String L() {
        boolean z = t.a;
        return super.L();
    }

    public final void O(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            Throwable th = pVar.a;
            pVar.a();
        }
    }

    public final void P() {
        X();
    }

    public void V(Object obj) {
        m(obj);
    }

    public final void W() {
        H((y0) this.f4581d.get(y0.P));
    }

    public void X() {
    }

    public boolean a() {
        return super.a();
    }

    public final f c() {
        return this.c;
    }

    public f f() {
        return this.c;
    }

    public final void g(Object obj) {
        Object J = J(g.c.b.b.f.t0(obj));
        if (J != d1.b) {
            V(J);
        }
    }

    public String u() {
        return getClass().getSimpleName() + " was cancelled";
    }
}
