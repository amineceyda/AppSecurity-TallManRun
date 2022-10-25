package g.e.a.b.e.c;

import java.io.IOException;

public final class r8 implements y8 {
    public final o8 a;
    public final l9 b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final c7 f3045d;

    public r8(l9 l9Var, c7 c7Var, o8 o8Var) {
        this.b = l9Var;
        this.c = c7Var.c(o8Var);
        this.f3045d = c7Var;
        this.a = o8Var;
    }

    public final void a(Object obj) {
        this.b.g(obj);
        this.f3045d.b(obj);
    }

    public final Object b() {
        return ((l7) this.a.a()).k();
    }

    public final boolean c(Object obj) {
        this.f3045d.a(obj);
        throw null;
    }

    public final void d(Object obj, byte[] bArr, int i2, int i3, k6 k6Var) throws IOException {
        o7 o7Var = (o7) obj;
        if (o7Var.zzc == m9.f3001f) {
            o7Var.zzc = m9.b();
        }
        m7 m7Var = (m7) obj;
        throw null;
    }

    public final int e(Object obj) {
        l9 l9Var = this.b;
        int b2 = l9Var.b(l9Var.c(obj));
        if (!this.c) {
            return b2;
        }
        this.f3045d.a(obj);
        throw null;
    }

    public final void f(Object obj, Object obj2) {
        l9 l9Var = this.b;
        Class cls = a9.a;
        l9Var.h(obj, l9Var.d(l9Var.c(obj), l9Var.c(obj2)));
        if (this.c) {
            this.f3045d.a(obj2);
            throw null;
        }
    }

    public final boolean g(Object obj, Object obj2) {
        if (!this.b.c(obj).equals(this.b.c(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.f3045d.a(obj);
        this.f3045d.a(obj2);
        throw null;
    }

    public final void h(Object obj, y6 y6Var) throws IOException {
        this.f3045d.a(obj);
        throw null;
    }

    public final int i(Object obj) {
        int hashCode = this.b.c(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.f3045d.a(obj);
        throw null;
    }
}
