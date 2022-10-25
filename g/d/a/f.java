package g.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import g.d.a.l.t.k;
import g.d.a.l.t.l;
import g.d.a.m.n;
import g.d.a.p.b;
import g.d.a.p.c;
import g.d.a.p.d;
import g.d.a.p.e;
import g.d.a.p.g;
import g.d.a.p.i.h;
import g.d.a.r.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class f<TranscodeType> extends g.d.a.p.a<f<TranscodeType>> implements Cloneable {
    public final Context B;
    public final g C;
    public final Class<TranscodeType> Q;
    public final d R;
    public h<?, ? super TranscodeType> S;
    public Object T;
    public List<d<TranscodeType>> U;
    public f<TranscodeType> V;
    public boolean W = true;
    public boolean X;
    public boolean Y;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        static {
            /*
                g.d.a.e.values()
                r0 = 4
                int[] r1 = new int[r0]
                b = r1
                r2 = 1
                r3 = 3
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1 = 2
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0011 }
                r4[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x001a }
                r5 = 0
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x001a }
            L_0x001a:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003f }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x003f }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0076 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.d.a.f.a.<clinit>():void");
        }
    }

    static {
        e eVar = (e) ((e) ((e) new e().d(k.c)).j(e.LOW)).n(true);
    }

    @SuppressLint({"CheckResult"})
    public f(b bVar, g gVar, Class<TranscodeType> cls, Context context) {
        e eVar;
        this.C = gVar;
        this.Q = cls;
        this.B = context;
        d dVar = gVar.b.f2317d;
        h<?, ?> hVar = dVar.f2336f.get(cls);
        if (hVar == null) {
            for (Map.Entry next : dVar.f2336f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    hVar = (h) next.getValue();
                }
            }
        }
        this.S = hVar == null ? d.f2333k : hVar;
        this.R = bVar.f2317d;
        for (d next2 : gVar.f2352k) {
            if (next2 != null) {
                if (this.U == null) {
                    this.U = new ArrayList();
                }
                this.U.add(next2);
            }
        }
        synchronized (gVar) {
            eVar = gVar.f2353l;
        }
        a(eVar);
    }

    public g.d.a.p.a b() {
        f fVar = (f) super.clone();
        fVar.S = fVar.S.a();
        return fVar;
    }

    public Object clone() throws CloneNotSupportedException {
        f fVar = (f) super.clone();
        fVar.S = fVar.S.a();
        return fVar;
    }

    /* renamed from: r */
    public f<TranscodeType> a(g.d.a.p.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (f) super.a(aVar);
    }

    public final b s(Object obj, h<TranscodeType> hVar, d<TranscodeType> dVar, c cVar, h<?, ? super TranscodeType> hVar2, e eVar, int i2, int i3, g.d.a.p.a<?> aVar, Executor executor) {
        e eVar2;
        int i4;
        int i5;
        g.d.a.p.a<?> aVar2 = aVar;
        f<TranscodeType> fVar = this.V;
        if (fVar == null) {
            Object obj2 = obj;
            return w(obj, hVar, dVar, aVar, cVar, hVar2, eVar, i2, i3, executor);
        } else if (!this.Y) {
            h<?, ? super TranscodeType> hVar3 = fVar.W ? hVar2 : fVar.S;
            if (g.d.a.p.a.f(fVar.b, 8)) {
                eVar2 = this.V.f2643e;
                e eVar3 = eVar;
            } else {
                eVar2 = t(eVar);
            }
            e eVar4 = eVar2;
            f<TranscodeType> fVar2 = this.V;
            int i6 = fVar2.f2650l;
            int i7 = fVar2.f2649k;
            if (j.i(i2, i3)) {
                f<TranscodeType> fVar3 = this.V;
                if (!j.i(fVar3.f2650l, fVar3.f2649k)) {
                    i5 = aVar2.f2650l;
                    i4 = aVar2.f2649k;
                    Object obj3 = obj;
                    g.d.a.p.h hVar4 = new g.d.a.p.h(obj3, cVar);
                    b w = w(obj, hVar, dVar, aVar, hVar4, hVar2, eVar, i2, i3, executor);
                    this.Y = true;
                    f<TranscodeType> fVar4 = this.V;
                    g.d.a.p.h hVar5 = hVar4;
                    b s = fVar4.s(obj3, hVar, dVar, hVar5, hVar3, eVar4, i5, i4, fVar4, executor);
                    this.Y = false;
                    hVar5.c = w;
                    hVar5.f2671d = s;
                    return hVar5;
                }
            }
            i4 = i7;
            i5 = i6;
            Object obj32 = obj;
            g.d.a.p.h hVar42 = new g.d.a.p.h(obj32, cVar);
            b w2 = w(obj, hVar, dVar, aVar, hVar42, hVar2, eVar, i2, i3, executor);
            this.Y = true;
            f<TranscodeType> fVar42 = this.V;
            g.d.a.p.h hVar52 = hVar42;
            b s2 = fVar42.s(obj32, hVar, dVar, hVar52, hVar3, eVar4, i5, i4, fVar42, executor);
            this.Y = false;
            hVar52.c = w2;
            hVar52.f2671d = s2;
            return hVar52;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
    }

    public final e t(e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return e.IMMEDIATE;
        }
        if (ordinal == 2) {
            return e.HIGH;
        }
        if (ordinal == 3) {
            return e.NORMAL;
        }
        StringBuilder i2 = g.a.a.a.a.i("unknown priority: ");
        i2.append(this.f2643e);
        throw new IllegalArgumentException(i2.toString());
    }

    public final <Y extends h<TranscodeType>> Y u(Y y, d<TranscodeType> dVar, g.d.a.p.a<?> aVar, Executor executor) {
        Y y2 = y;
        g.d.a.p.a<?> aVar2 = aVar;
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.X) {
            b s = s(new Object(), y, dVar, (c) null, this.S, aVar2.f2643e, aVar2.f2650l, aVar2.f2649k, aVar, executor);
            b g2 = y.g();
            if (s.d(g2)) {
                if (!(!aVar2.f2648j && g2.k())) {
                    Objects.requireNonNull(g2, "Argument must not be null");
                    if (!g2.isRunning()) {
                        g2.i();
                    }
                    return y2;
                }
            }
            this.C.l(y);
            y.j(s);
            g gVar = this.C;
            synchronized (gVar) {
                gVar.f2348g.b.add(y);
                n nVar = gVar.f2346e;
                nVar.a.add(s);
                if (!nVar.c) {
                    s.i();
                } else {
                    s.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.b.add(s);
                }
            }
            return y2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r0 = r0.g(r2, r3);
        r0.z = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.d.a.p.i.i<android.widget.ImageView, TranscodeType> v(android.widget.ImageView r5) {
        /*
            r4 = this;
            g.d.a.r.j.a()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r4.b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = g.d.a.p.a.f(r0, r1)
            if (r0 != 0) goto L_0x006d
            boolean r0 = r4.o
            if (r0 == 0) goto L_0x006d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L_0x006d
            int[] r0 = g.d.a.f.a.a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L_0x005d;
                case 2: goto L_0x004b;
                case 3: goto L_0x0039;
                case 4: goto L_0x0039;
                case 5: goto L_0x0039;
                case 6: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x006d
        L_0x002d:
            g.d.a.p.a r0 = r4.b()
            g.d.a.l.v.c.k r2 = g.d.a.l.v.c.k.b
            g.d.a.l.v.c.j r3 = new g.d.a.l.v.c.j
            r3.<init>()
            goto L_0x0056
        L_0x0039:
            g.d.a.p.a r0 = r4.b()
            g.d.a.l.v.c.k r2 = g.d.a.l.v.c.k.a
            g.d.a.l.v.c.p r3 = new g.d.a.l.v.c.p
            r3.<init>()
            g.d.a.p.a r0 = r0.g(r2, r3)
            r0.z = r1
            goto L_0x006e
        L_0x004b:
            g.d.a.p.a r0 = r4.b()
            g.d.a.l.v.c.k r2 = g.d.a.l.v.c.k.b
            g.d.a.l.v.c.j r3 = new g.d.a.l.v.c.j
            r3.<init>()
        L_0x0056:
            g.d.a.p.a r0 = r0.g(r2, r3)
            r0.z = r1
            goto L_0x006e
        L_0x005d:
            g.d.a.p.a r0 = r4.b()
            g.d.a.l.v.c.k r1 = g.d.a.l.v.c.k.c
            g.d.a.l.v.c.i r2 = new g.d.a.l.v.c.i
            r2.<init>()
            g.d.a.p.a r0 = r0.g(r1, r2)
            goto L_0x006e
        L_0x006d:
            r0 = r4
        L_0x006e:
            g.d.a.d r1 = r4.R
            java.lang.Class<TranscodeType> r2 = r4.Q
            g.d.a.p.i.f r1 = r1.c
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0085
            g.d.a.p.i.b r1 = new g.d.a.p.i.b
            r1.<init>(r5)
            goto L_0x0092
        L_0x0085:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0099
            g.d.a.p.i.d r1 = new g.d.a.p.i.d
            r1.<init>(r5)
        L_0x0092:
            r5 = 0
            java.util.concurrent.Executor r2 = g.d.a.r.e.a
            r4.u(r1, r5, r0, r2)
            return r1
        L_0x0099:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.f.v(android.widget.ImageView):g.d.a.p.i.i");
    }

    public final b w(Object obj, h<TranscodeType> hVar, d<TranscodeType> dVar, g.d.a.p.a<?> aVar, c cVar, h<?, ? super TranscodeType> hVar2, e eVar, int i2, int i3, Executor executor) {
        Context context = this.B;
        d dVar2 = this.R;
        Object obj2 = this.T;
        Class<TranscodeType> cls = this.Q;
        List<d<TranscodeType>> list = this.U;
        l lVar = dVar2.f2337g;
        Objects.requireNonNull(hVar2);
        return new g(context, dVar2, obj, obj2, cls, aVar, i2, i3, eVar, hVar, dVar, list, cVar, lVar, g.d.a.p.j.a.b, executor);
    }
}
