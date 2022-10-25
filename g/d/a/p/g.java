package g.d.a.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import g.d.a.e;
import g.d.a.l.n;
import g.d.a.l.r;
import g.d.a.l.t.k;
import g.d.a.l.t.l;
import g.d.a.l.t.v;
import g.d.a.p.i.h;
import g.d.a.p.j.c;
import g.d.a.r.f;
import g.d.a.r.j;
import g.d.a.r.k.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class g<R> implements b, g.d.a.p.i.g, f {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public RuntimeException C;
    public final String a;
    public final d b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final d<R> f2656d;

    /* renamed from: e  reason: collision with root package name */
    public final c f2657e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2658f;

    /* renamed from: g  reason: collision with root package name */
    public final g.d.a.d f2659g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f2660h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f2661i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f2662j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2663k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2664l;

    /* renamed from: m  reason: collision with root package name */
    public final e f2665m;
    public final h<R> n;
    public final List<d<R>> o;
    public final c<? super R> p;
    public final Executor q;
    public v<R> r;
    public l.d s;
    public long t;
    public volatile l u;
    public a v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public g(Context context, g.d.a.d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i2, int i3, e eVar, h<R> hVar, d<R> dVar2, List<d<R>> list, c cVar, l lVar, c<? super R> cVar2, Executor executor) {
        g.d.a.d dVar3 = dVar;
        this.a = D ? String.valueOf(hashCode()) : null;
        this.b = new d.b();
        this.c = obj;
        this.f2658f = context;
        this.f2659g = dVar3;
        this.f2660h = obj2;
        this.f2661i = cls;
        this.f2662j = aVar;
        this.f2663k = i2;
        this.f2664l = i3;
        this.f2665m = eVar;
        this.n = hVar;
        this.f2656d = dVar2;
        this.o = list;
        this.f2657e = cVar;
        this.u = lVar;
        this.p = cVar2;
        this.q = executor;
        this.v = a.PENDING;
        if (this.C == null && dVar3.f2338h) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public void a(int i2, int i3) {
        Object obj;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        a aVar;
        n nVar;
        l.d b2;
        int i5 = i2;
        int i6 = i3;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                boolean z5 = D;
                if (z5) {
                    n("Got onSizeReady in " + f.a(this.t));
                }
                if (this.v == a.WAITING_FOR_SIZE) {
                    a aVar2 = a.RUNNING;
                    this.v = aVar2;
                    float f2 = this.f2662j.c;
                    if (i5 != Integer.MIN_VALUE) {
                        i5 = Math.round(((float) i5) * f2);
                    }
                    this.z = i5;
                    if (i6 == Integer.MIN_VALUE) {
                        i4 = i6;
                    } else {
                        i4 = Math.round(f2 * ((float) i6));
                    }
                    this.A = i4;
                    if (z5) {
                        n("finished setup for calling load in " + f.a(this.t));
                    }
                    l lVar = this.u;
                    g.d.a.d dVar = this.f2659g;
                    Object obj3 = this.f2660h;
                    a<?> aVar3 = this.f2662j;
                    g.d.a.l.l lVar2 = aVar3.f2651m;
                    int i7 = this.z;
                    int i8 = this.A;
                    Class<?> cls = aVar3.t;
                    Class<R> cls2 = this.f2661i;
                    e eVar = this.f2665m;
                    k kVar = aVar3.f2642d;
                    Map<Class<?>, r<?>> map = aVar3.s;
                    boolean z6 = aVar3.n;
                    a aVar4 = aVar2;
                    boolean z7 = aVar3.z;
                    n nVar2 = aVar3.r;
                    Object obj4 = obj2;
                    try {
                        z2 = aVar3.f2648j;
                        z3 = aVar3.x;
                        z4 = aVar3.A;
                        aVar = aVar4;
                        nVar = nVar2;
                        obj = obj4;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        b2 = lVar.b(dVar, obj3, lVar2, i7, i8, cls, cls2, eVar, kVar, map, z6, z7, nVar, z2, z3, z4, aVar3.y, this, this.q);
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    try {
                        this.s = b2;
                        if (this.v != aVar) {
                            this.s = null;
                        }
                        if (z5) {
                            n("finished onSizeReady in " + f.a(this.t));
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public boolean c() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r5.u.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.f()     // Catch:{ all -> 0x0043 }
            g.d.a.r.k.d r1 = r5.b     // Catch:{ all -> 0x0043 }
            r1.a()     // Catch:{ all -> 0x0043 }
            g.d.a.p.g$a r1 = r5.v     // Catch:{ all -> 0x0043 }
            g.d.a.p.g$a r2 = g.d.a.p.g.a.CLEARED     // Catch:{ all -> 0x0043 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0013:
            r5.g()     // Catch:{ all -> 0x0043 }
            g.d.a.l.t.v<R> r1 = r5.r     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.r = r3     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            g.d.a.p.c r3 = r5.f2657e     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.l(r5)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            g.d.a.p.i.h<R> r3 = r5.n     // Catch:{ all -> 0x0043 }
            android.graphics.drawable.Drawable r4 = r5.j()     // Catch:{ all -> 0x0043 }
            r3.h(r4)     // Catch:{ all -> 0x0043 }
        L_0x0038:
            r5.v = r2     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0042
            g.d.a.l.t.l r0 = r5.u
            r0.f(r1)
        L_0x0042:
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.g.clear():void");
    }

    public boolean d(b bVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        e eVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        e eVar2;
        int size2;
        b bVar2 = bVar;
        if (!(bVar2 instanceof g)) {
            return false;
        }
        synchronized (this.c) {
            i2 = this.f2663k;
            i3 = this.f2664l;
            obj = this.f2660h;
            cls = this.f2661i;
            aVar = this.f2662j;
            eVar = this.f2665m;
            List<d<R>> list = this.o;
            size = list != null ? list.size() : 0;
        }
        g gVar = (g) bVar2;
        synchronized (gVar.c) {
            i4 = gVar.f2663k;
            i5 = gVar.f2664l;
            obj2 = gVar.f2660h;
            cls2 = gVar.f2661i;
            aVar2 = gVar.f2662j;
            eVar2 = gVar.f2665m;
            List<d<R>> list2 = gVar.o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i2 == i4 && i3 == i5) {
            char[] cArr = j.a;
            return (obj == null ? obj2 == null : obj instanceof g.d.a.l.u.l ? ((g.d.a.l.u.l) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && eVar == eVar2 && size == size2;
        }
    }

    public boolean e() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.CLEARED;
        }
        return z2;
    }

    public final void f() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void g() {
        f();
        this.b.a();
        this.n.b(this);
        l.d dVar = this.s;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.a.h(dVar.b);
            }
            this.s = null;
        }
    }

    public final Drawable h() {
        int i2;
        if (this.y == null) {
            a<?> aVar = this.f2662j;
            Drawable drawable = aVar.p;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.q) > 0) {
                this.y = m(i2);
            }
        }
        return this.y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.f()     // Catch:{ all -> 0x00b3 }
            g.d.a.r.k.d r1 = r5.b     // Catch:{ all -> 0x00b3 }
            r1.a()     // Catch:{ all -> 0x00b3 }
            int r1 = g.d.a.r.f.b     // Catch:{ all -> 0x00b3 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00b3 }
            r5.t = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f2660h     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003e
            int r1 = r5.f2663k     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f2664l     // Catch:{ all -> 0x00b3 }
            boolean r1 = g.d.a.r.j.i(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0029
            int r1 = r5.f2663k     // Catch:{ all -> 0x00b3 }
            r5.z = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f2664l     // Catch:{ all -> 0x00b3 }
            r5.A = r1     // Catch:{ all -> 0x00b3 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r5.h()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0031
            r1 = 5
            goto L_0x0032
        L_0x0031:
            r1 = 3
        L_0x0032:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.o(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003e:
            g.d.a.p.g$a r1 = r5.v     // Catch:{ all -> 0x00b3 }
            g.d.a.p.g$a r2 = g.d.a.p.g.a.RUNNING     // Catch:{ all -> 0x00b3 }
            if (r1 == r2) goto L_0x00ab
            g.d.a.p.g$a r3 = g.d.a.p.g.a.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r1 != r3) goto L_0x0051
            g.d.a.l.t.v<R> r1 = r5.r     // Catch:{ all -> 0x00b3 }
            g.d.a.l.a r2 = g.d.a.l.a.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r5.p(r1, r2)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0051:
            g.d.a.p.g$a r1 = g.d.a.p.g.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.v = r1     // Catch:{ all -> 0x00b3 }
            int r3 = r5.f2663k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f2664l     // Catch:{ all -> 0x00b3 }
            boolean r3 = g.d.a.r.j.i(r3, r4)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0067
            int r3 = r5.f2663k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f2664l     // Catch:{ all -> 0x00b3 }
            r5.a(r3, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x0067:
            g.d.a.p.i.h<R> r3 = r5.n     // Catch:{ all -> 0x00b3 }
            r3.i(r5)     // Catch:{ all -> 0x00b3 }
        L_0x006c:
            g.d.a.p.g$a r3 = r5.v     // Catch:{ all -> 0x00b3 }
            if (r3 == r2) goto L_0x0072
            if (r3 != r1) goto L_0x008b
        L_0x0072:
            g.d.a.p.c r1 = r5.f2657e     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007f
            boolean r1 = r1.f(r5)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r1 = 0
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            if (r1 == 0) goto L_0x008b
            g.d.a.p.i.h<R> r1 = r5.n     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.j()     // Catch:{ all -> 0x00b3 }
            r1.f(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = D     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.t     // Catch:{ all -> 0x00b3 }
            double r2 = g.d.a.r.f.a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.n(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.g.i():void");
    }

    public boolean isRunning() {
        boolean z2;
        synchronized (this.c) {
            a aVar = this.v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final Drawable j() {
        int i2;
        if (this.x == null) {
            a<?> aVar = this.f2662j;
            Drawable drawable = aVar.f2646h;
            this.x = drawable;
            if (drawable == null && (i2 = aVar.f2647i) > 0) {
                this.x = m(i2);
            }
        }
        return this.x;
    }

    public boolean k() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    public final boolean l() {
        c cVar = this.f2657e;
        return cVar == null || !cVar.h().c();
    }

    public final Drawable m(int i2) {
        Resources.Theme theme = this.f2662j.v;
        if (theme == null) {
            theme = this.f2658f.getTheme();
        }
        g.d.a.d dVar = this.f2659g;
        return g.d.a.l.v.e.a.a(dVar, dVar, i2, theme);
    }

    public final void n(String str) {
        StringBuilder l2 = g.a.a.a.a.l(str, " this: ");
        l2.append(this.a);
        Log.v("Request", l2.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void o(GlideException glideException, int i2) {
        boolean z2;
        this.b.a();
        synchronized (this.c) {
            glideException.j(this.C);
            int i3 = this.f2659g.f2339i;
            if (i3 <= i2) {
                Log.w("Glide", "Load failed for " + this.f2660h + " with size [" + this.z + "x" + this.A + "]", glideException);
                if (i3 <= 4) {
                    glideException.e("Glide");
                }
            }
            this.s = null;
            this.v = a.FAILED;
            boolean z3 = true;
            this.B = true;
            try {
                List<d<R>> list = this.o;
                if (list != null) {
                    z2 = false;
                    for (d<R> b2 : list) {
                        z2 |= b2.b(glideException, this.f2660h, this.n, l());
                    }
                } else {
                    z2 = false;
                }
                d<R> dVar = this.f2656d;
                if (dVar == null || !dVar.b(glideException, this.f2660h, this.n, l())) {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    r();
                }
                this.B = false;
                c cVar = this.f2657e;
                if (cVar != null) {
                    cVar.a(this);
                }
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    public void p(v<?> vVar, g.d.a.l.a aVar) {
        this.b.a();
        v<?> vVar2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.s = null;
                    if (vVar == null) {
                        o(new GlideException("Expected to receive a Resource<R> with an object of " + this.f2661i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = vVar.get();
                    if (obj != null) {
                        if (this.f2661i.isAssignableFrom(obj.getClass())) {
                            c cVar = this.f2657e;
                            if (!(cVar == null || cVar.g(this))) {
                                try {
                                    this.r = null;
                                    this.v = a.COMPLETE;
                                    this.u.f(vVar);
                                    return;
                                } catch (Throwable th) {
                                    vVar2 = vVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                q(vVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f2661i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(vVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    o(new GlideException(sb.toString()), 5);
                    this.u.f(vVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.u.f(vVar2);
            }
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2 A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(g.d.a.l.t.v<R> r11, R r12, g.d.a.l.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.l()
            g.d.a.p.g$a r0 = g.d.a.p.g.a.COMPLETE
            r10.v = r0
            r10.r = r11
            g.d.a.d r11 = r10.f2659g
            int r11 = r11.f2339i
            r0 = 3
            if (r11 > r0) goto L_0x0064
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = g.a.a.a.a.i(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f2660h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.t
            double r0 = g.d.a.r.f.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x0064:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<g.d.a.p.d<R>> r0 = r10.o     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x008b
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r0 = 0
            r9 = 0
        L_0x0072:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b8 }
            g.d.a.p.d r0 = (g.d.a.p.d) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r10.f2660h     // Catch:{ all -> 0x00b8 }
            g.d.a.p.i.h<R> r3 = r10.n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r9 = r9 | r0
            goto L_0x0072
        L_0x008b:
            r9 = 0
        L_0x008c:
            g.d.a.p.d<R> r0 = r10.f2656d     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r10.f2660h     // Catch:{ all -> 0x00b8 }
            g.d.a.p.i.h<R> r3 = r10.n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r13 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r13 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r11 = 0
        L_0x009f:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00ae
            g.d.a.p.j.c<? super R> r11 = r10.p     // Catch:{ all -> 0x00b8 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x00b8 }
            g.d.a.p.j.a<?> r11 = g.d.a.p.j.a.a     // Catch:{ all -> 0x00b8 }
            g.d.a.p.i.h<R> r13 = r10.n     // Catch:{ all -> 0x00b8 }
            r13.c(r12, r11)     // Catch:{ all -> 0x00b8 }
        L_0x00ae:
            r10.B = r7
            g.d.a.p.c r11 = r10.f2657e
            if (r11 == 0) goto L_0x00b7
            r11.j(r10)
        L_0x00b7:
            return
        L_0x00b8:
            r11 = move-exception
            r10.B = r7
            goto L_0x00bd
        L_0x00bc:
            throw r11
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.g.q(g.d.a.l.t.v, java.lang.Object, g.d.a.l.a):void");
    }

    public final void r() {
        int i2;
        c cVar = this.f2657e;
        if (cVar == null || cVar.f(this)) {
            Drawable drawable = null;
            if (this.f2660h == null) {
                drawable = h();
            }
            if (drawable == null) {
                if (this.w == null) {
                    a<?> aVar = this.f2662j;
                    Drawable drawable2 = aVar.f2644f;
                    this.w = drawable2;
                    if (drawable2 == null && (i2 = aVar.f2645g) > 0) {
                        this.w = m(i2);
                    }
                }
                drawable = this.w;
            }
            if (drawable == null) {
                drawable = j();
            }
            this.n.d(drawable);
        }
    }
}
