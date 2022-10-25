package g.d.a.p.i;

import android.graphics.drawable.Drawable;
import g.d.a.p.b;
import g.d.a.p.g;
import g.d.a.r.j;

public abstract class c<T> implements h<T> {
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public b f2675d;

    public c() {
        if (j.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + Integer.MIN_VALUE + " and height: " + Integer.MIN_VALUE);
    }

    public void a() {
    }

    public final void b(g gVar) {
    }

    public void d(Drawable drawable) {
    }

    public void e() {
    }

    public void f(Drawable drawable) {
    }

    public final b g() {
        return this.f2675d;
    }

    public final void i(g gVar) {
        ((g) gVar).a(this.b, this.c);
    }

    public final void j(b bVar) {
        this.f2675d = bVar;
    }

    public void k() {
    }
}
