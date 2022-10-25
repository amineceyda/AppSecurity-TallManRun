package g.c.b.a;

import i.o.c.h;

public final class d<T> {
    public final c a;
    public final T b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2205d;

    public d(c cVar, T t, int i2, String str) {
        h.e(cVar, "request");
        h.e(str, "message");
        this.a = cVar;
        this.b = t;
        this.c = i2;
        this.f2205d = str;
    }

    public final int a() {
        return this.c;
    }

    public final T b() {
        return this.b;
    }

    public final String c() {
        return this.f2205d;
    }

    public final boolean d() {
        return this.c == 0;
    }
}
