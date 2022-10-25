package g.d.a.p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import g.d.a.e;
import g.d.a.l.l;
import g.d.a.l.n;
import g.d.a.l.r;
import g.d.a.l.t.k;
import g.d.a.p.a;
import g.d.a.r.b;
import g.d.a.r.j;
import java.util.Map;
import java.util.Objects;

public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public int b;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public k f2642d = k.f2494d;

    /* renamed from: e  reason: collision with root package name */
    public e f2643e = e.NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2644f;

    /* renamed from: g  reason: collision with root package name */
    public int f2645g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2646h;

    /* renamed from: i  reason: collision with root package name */
    public int f2647i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2648j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f2649k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f2650l = -1;

    /* renamed from: m  reason: collision with root package name */
    public l f2651m;
    public boolean n;
    public boolean o;
    public Drawable p;
    public int q;
    public n r;
    public Map<Class<?>, r<?>> s;
    public Class<?> t;
    public boolean u;
    public Resources.Theme v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public a() {
        g.d.a.q.a aVar = g.d.a.q.a.b;
        this.f2651m = g.d.a.q.a.b;
        this.o = true;
        this.r = new n();
        this.s = new b();
        this.t = Object.class;
        this.z = true;
    }

    public static boolean f(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public T a(a<?> aVar) {
        if (this.w) {
            return clone().a(aVar);
        }
        if (f(aVar.b, 2)) {
            this.c = aVar.c;
        }
        if (f(aVar.b, 262144)) {
            this.x = aVar.x;
        }
        if (f(aVar.b, 1048576)) {
            this.A = aVar.A;
        }
        if (f(aVar.b, 4)) {
            this.f2642d = aVar.f2642d;
        }
        if (f(aVar.b, 8)) {
            this.f2643e = aVar.f2643e;
        }
        if (f(aVar.b, 16)) {
            this.f2644f = aVar.f2644f;
            this.f2645g = 0;
            this.b &= -33;
        }
        if (f(aVar.b, 32)) {
            this.f2645g = aVar.f2645g;
            this.f2644f = null;
            this.b &= -17;
        }
        if (f(aVar.b, 64)) {
            this.f2646h = aVar.f2646h;
            this.f2647i = 0;
            this.b &= -129;
        }
        if (f(aVar.b, 128)) {
            this.f2647i = aVar.f2647i;
            this.f2646h = null;
            this.b &= -65;
        }
        if (f(aVar.b, 256)) {
            this.f2648j = aVar.f2648j;
        }
        if (f(aVar.b, 512)) {
            this.f2650l = aVar.f2650l;
            this.f2649k = aVar.f2649k;
        }
        if (f(aVar.b, 1024)) {
            this.f2651m = aVar.f2651m;
        }
        if (f(aVar.b, 4096)) {
            this.t = aVar.t;
        }
        if (f(aVar.b, 8192)) {
            this.p = aVar.p;
            this.q = 0;
            this.b &= -16385;
        }
        if (f(aVar.b, 16384)) {
            this.q = aVar.q;
            this.p = null;
            this.b &= -8193;
        }
        if (f(aVar.b, 32768)) {
            this.v = aVar.v;
        }
        if (f(aVar.b, 65536)) {
            this.o = aVar.o;
        }
        if (f(aVar.b, 131072)) {
            this.n = aVar.n;
        }
        if (f(aVar.b, 2048)) {
            this.s.putAll(aVar.s);
            this.z = aVar.z;
        }
        if (f(aVar.b, 524288)) {
            this.y = aVar.y;
        }
        if (!this.o) {
            this.s.clear();
            int i2 = this.b & -2049;
            this.b = i2;
            this.n = false;
            this.b = i2 & -131073;
            this.z = true;
        }
        this.b |= aVar.b;
        this.r.d(aVar.r);
        k();
        return this;
    }

    /* renamed from: b */
    public T clone() {
        try {
            T t2 = (a) super.clone();
            n nVar = new n();
            t2.r = nVar;
            nVar.d(this.r);
            b bVar = new b();
            t2.s = bVar;
            bVar.putAll(this.s);
            t2.u = false;
            t2.w = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public T c(Class<?> cls) {
        if (this.w) {
            return clone().c(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.t = cls;
        this.b |= 4096;
        k();
        return this;
    }

    public T d(k kVar) {
        if (this.w) {
            return clone().d(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f2642d = kVar;
        this.b |= 4;
        k();
        return this;
    }

    public T e(int i2) {
        if (this.w) {
            return clone().e(i2);
        }
        this.f2645g = i2;
        int i3 = this.b | 32;
        this.b = i3;
        this.f2644f = null;
        this.b = i3 & -17;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.c, this.c) == 0 && this.f2645g == aVar.f2645g && j.b(this.f2644f, aVar.f2644f) && this.f2647i == aVar.f2647i && j.b(this.f2646h, aVar.f2646h) && this.q == aVar.q && j.b(this.p, aVar.p) && this.f2648j == aVar.f2648j && this.f2649k == aVar.f2649k && this.f2650l == aVar.f2650l && this.n == aVar.n && this.o == aVar.o && this.x == aVar.x && this.y == aVar.y && this.f2642d.equals(aVar.f2642d) && this.f2643e == aVar.f2643e && this.r.equals(aVar.r) && this.s.equals(aVar.s) && this.t.equals(aVar.t) && j.b(this.f2651m, aVar.f2651m) && j.b(this.v, aVar.v);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [g.d.a.l.r, g.d.a.l.r<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T g(g.d.a.l.v.c.k r3, g.d.a.l.r<android.graphics.Bitmap> r4) {
        /*
            r2 = this;
            boolean r0 = r2.w
            if (r0 == 0) goto L_0x000d
            g.d.a.p.a r0 = r2.clone()
            g.d.a.p.a r3 = r0.g(r3, r4)
            return r3
        L_0x000d:
            g.d.a.l.m<g.d.a.l.v.c.k> r0 = g.d.a.l.v.c.k.f2581f
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r1)
            r2.l(r0, r3)
            r3 = 0
            g.d.a.p.a r3 = r2.o(r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.a.g(g.d.a.l.v.c.k, g.d.a.l.r):g.d.a.p.a");
    }

    public T h(int i2, int i3) {
        if (this.w) {
            return clone().h(i2, i3);
        }
        this.f2650l = i2;
        this.f2649k = i3;
        this.b |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f2 = this.c;
        char[] cArr = j.a;
        return j.f(this.v, j.f(this.f2651m, j.f(this.t, j.f(this.s, j.f(this.r, j.f(this.f2643e, j.f(this.f2642d, (((((((((((((j.f(this.p, (j.f(this.f2646h, (j.f(this.f2644f, ((Float.floatToIntBits(f2) + 527) * 31) + this.f2645g) * 31) + this.f2647i) * 31) + this.q) * 31) + (this.f2648j ? 1 : 0)) * 31) + this.f2649k) * 31) + this.f2650l) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0))))))));
    }

    public T i(int i2) {
        if (this.w) {
            return clone().i(i2);
        }
        this.f2647i = i2;
        int i3 = this.b | 128;
        this.b = i3;
        this.f2646h = null;
        this.b = i3 & -65;
        k();
        return this;
    }

    public T j(e eVar) {
        if (this.w) {
            return clone().j(eVar);
        }
        Objects.requireNonNull(eVar, "Argument must not be null");
        this.f2643e = eVar;
        this.b |= 8;
        k();
        return this;
    }

    public final T k() {
        if (!this.u) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [g.d.a.l.m, java.lang.Object, g.d.a.l.m<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T l(g.d.a.l.m<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.w
            if (r0 == 0) goto L_0x000d
            g.d.a.p.a r0 = r1.clone()
            g.d.a.p.a r2 = r0.l(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            g.d.a.l.n r0 = r1.r
            e.d.a<g.d.a.l.m<?>, java.lang.Object> r0 = r0.b
            r0.put(r2, r3)
            r1.k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.a.l(g.d.a.l.m, java.lang.Object):g.d.a.p.a");
    }

    public T m(l lVar) {
        if (this.w) {
            return clone().m(lVar);
        }
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f2651m = lVar;
        this.b |= 1024;
        k();
        return this;
    }

    public T n(boolean z2) {
        if (this.w) {
            return clone().n(true);
        }
        this.f2648j = !z2;
        this.b |= 256;
        k();
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [g.d.a.l.r, g.d.a.l.r<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T o(g.d.a.l.r<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.w
            if (r0 == 0) goto L_0x000d
            g.d.a.p.a r0 = r2.clone()
            g.d.a.p.a r3 = r0.o(r3, r4)
            return r3
        L_0x000d:
            g.d.a.l.v.c.n r0 = new g.d.a.l.v.c.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.p(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.p(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.p(r1, r0, r4)
            java.lang.Class<g.d.a.l.v.g.c> r0 = g.d.a.l.v.g.c.class
            g.d.a.l.v.g.f r1 = new g.d.a.l.v.g.f
            r1.<init>(r3)
            r2.p(r0, r1, r4)
            r2.k()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.a.o(g.d.a.l.r, boolean):g.d.a.p.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.d.a.l.r<Y>, g.d.a.l.r, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T p(java.lang.Class<Y> r2, g.d.a.l.r<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.w
            if (r0 == 0) goto L_0x000d
            g.d.a.p.a r0 = r1.clone()
            g.d.a.p.a r2 = r0.p(r2, r3, r4)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Map<java.lang.Class<?>, g.d.a.l.r<?>> r0 = r1.s
            r0.put(r2, r3)
            int r2 = r1.b
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.b = r2
            r3 = 1
            r1.o = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.b = r2
            r0 = 0
            r1.z = r0
            if (r4 == 0) goto L_0x0034
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.b = r2
            r1.n = r3
        L_0x0034:
            r1.k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.a.p(java.lang.Class, g.d.a.l.r, boolean):g.d.a.p.a");
    }

    public T q(boolean z2) {
        if (this.w) {
            return clone().q(z2);
        }
        this.A = z2;
        this.b |= 1048576;
        k();
        return this;
    }
}
