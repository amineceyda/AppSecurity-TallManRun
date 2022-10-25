package g.i.c.a.a.s;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import g.c.b.b.f;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.e;
import g.i.c.a.a.s.p;
import g.i.c.a.a.t.a;
import g.i.c.a.a.t.g;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class n implements p.d, a.d, g.d {
    public g.i.c.a.a.l.b a;
    public i b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f4504d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f4505e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public c f4506f = new c((m) null);

    /* renamed from: g  reason: collision with root package name */
    public e<b> f4507g = new e<>();

    public class a implements e.b<b> {
        public final /* synthetic */ i a;
        public final /* synthetic */ g.i.c.a.a.l.b b;
        public final /* synthetic */ Set c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f4508d;

        public a(n nVar, i iVar, g.i.c.a.a.l.b bVar, Set set, boolean z) {
            this.a = iVar;
            this.b = bVar;
            this.c = set;
            this.f4508d = z;
        }

        public void a(Object obj) {
            ((b) obj).c(this.a, this.b, this.c, this.f4508d);
        }
    }

    public interface b {
        void a(i iVar, Set<i> set, int i2);

        void c(i iVar, g.i.c.a.a.l.b bVar, Set<i> set, boolean z);

        void d(i iVar, int i2);
    }

    public class c implements Runnable {
        public i b;
        public int c = 0;

        public c(m mVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x009d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r16 = this;
                r0 = r16
                g.i.c.a.a.s.i r1 = r0.b
                android.view.View r2 = r1.e()
                java.lang.String r5 = "PageManager"
                if (r2 != 0) goto L_0x000e
                goto L_0x009a
            L_0x000e:
                g.i.c.a.a.r.e r6 = g.i.c.a.a.r.e.b.a
                g.i.c.a.a.a r7 = r6.d()
                double r7 = r7.f4389e
                android.graphics.Rect r9 = g.i.c.a.a.b0.n.a
                boolean r9 = r2.isShown()
                if (r9 == 0) goto L_0x0028
                android.graphics.Rect r9 = g.i.c.a.a.b0.n.a
                boolean r9 = r2.getGlobalVisibleRect(r9)
                if (r9 == 0) goto L_0x0028
                r9 = 1
                goto L_0x0029
            L_0x0028:
                r9 = 0
            L_0x0029:
                r10 = 0
                if (r9 != 0) goto L_0x002f
                r2 = r10
                goto L_0x0068
            L_0x002f:
                android.graphics.Rect r9 = g.i.c.a.a.b0.n.a
                int r12 = r9.width()
                long r12 = (long) r12
                int r9 = r9.height()
                long r14 = (long) r9
                long r12 = r12 * r14
                int r9 = r2.getWidth()
                long r14 = (long) r9
                int r2 = r2.getHeight()
                long r3 = (long) r2
                long r14 = r14 * r3
                double r2 = (double) r12
                r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                java.lang.Double.isNaN(r2)
                java.lang.Double.isNaN(r2)
                java.lang.Double.isNaN(r2)
                java.lang.Double.isNaN(r2)
                double r2 = r2 * r12
                double r12 = (double) r14
                java.lang.Double.isNaN(r12)
                java.lang.Double.isNaN(r12)
                java.lang.Double.isNaN(r12)
                java.lang.Double.isNaN(r12)
                double r2 = r2 / r12
            L_0x0068:
                boolean r4 = r6.a
                if (r4 == 0) goto L_0x0090
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "isPageVisible: pageInfo = "
                r4.append(r6)
                r4.append(r1)
                java.lang.String r1 = ", exposureMinRate = "
                r4.append(r1)
                r4.append(r7)
                java.lang.String r1 = ", exposureRate = "
                r4.append(r1)
                r4.append(r2)
                java.lang.String r1 = r4.toString()
                g.c.b.b.f.K(r5, r1)
            L_0x0090:
                int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r1 <= 0) goto L_0x009a
                int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r1 < 0) goto L_0x009a
                r1 = 1
                goto L_0x009b
            L_0x009a:
                r1 = 0
            L_0x009b:
                if (r1 != 0) goto L_0x009e
                return
            L_0x009e:
                g.i.c.a.a.s.n r1 = g.i.c.a.a.s.n.this
                boolean r2 = r1.c
                if (r2 != 0) goto L_0x00be
                g.i.c.a.a.s.i r1 = r1.b
                if (r1 == 0) goto L_0x00be
                java.lang.Object r1 = r1.c()
                g.i.c.a.a.s.i r2 = r0.b
                java.lang.Object r2 = r2.c()
                if (r1 == r2) goto L_0x00be
                g.i.c.a.a.s.n r1 = g.i.c.a.a.s.n.this
                g.i.c.a.a.s.i r2 = r0.b
                g.i.c.a.a.s.i r3 = r1.b
                r4 = 0
                r1.h(r2, r3, r4)
            L_0x00be:
                g.i.c.a.a.s.n r1 = g.i.c.a.a.s.n.this
                g.i.c.a.a.s.i r2 = r1.b
                g.i.c.a.a.s.i r3 = r0.b
                r1.b = r3
                boolean r1 = r1.c
                if (r2 != 0) goto L_0x00cb
                goto L_0x00d5
            L_0x00cb:
                java.lang.Object r3 = r3.c()
                java.lang.Object r4 = r2.c()
                if (r3 == r4) goto L_0x00d6
            L_0x00d5:
                r1 = 1
            L_0x00d6:
                g.i.c.a.a.s.n r3 = g.i.c.a.a.s.n.this
                if (r1 == 0) goto L_0x0175
                g.i.c.a.a.s.i r1 = r0.b
                int r4 = r0.c
                java.util.Objects.requireNonNull(r3)
                g.i.c.a.a.r.e r6 = g.i.c.a.a.r.e.b.a
                boolean r6 = r6.a
                if (r6 == 0) goto L_0x0113
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "onPageIn: pageInfo page="
                r6.append(r7)
                r6.append(r1)
                java.lang.String r7 = ", decorView="
                r6.append(r7)
                android.view.View r7 = r1.e()
                if (r7 == 0) goto L_0x0108
                android.view.View r7 = r1.e()
                android.view.View r7 = r7.getRootView()
                goto L_0x0109
            L_0x0108:
                r7 = 0
            L_0x0109:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                g.c.b.b.f.w(r5, r6)
            L_0x0113:
                int r5 = r3.f4504d
                r6 = 1
                int r5 = r5 + r6
                r3.f4504d = r5
                g.i.c.a.a.l.b r6 = r3.a
                java.lang.Object r7 = r1.c()
                g.i.c.a.a.l.b r7 = g.i.c.a.a.l.a.a(r7)
                g.i.c.a.a.s.i r8 = r1.f4502d
                r9 = r7
            L_0x0126:
                if (r8 == 0) goto L_0x013e
                java.lang.Object r10 = r8.c()
                if (r10 == 0) goto L_0x013e
                java.lang.Object r10 = r8.c()
                g.i.c.a.a.l.b r10 = g.i.c.a.a.l.a.a(r10)
                if (r9 == 0) goto L_0x013a
                r9.f4460j = r10
            L_0x013a:
                g.i.c.a.a.s.i r8 = r8.f4502d
                r9 = r10
                goto L_0x0126
            L_0x013e:
                r3.a = r7
                r3.i(r1, r2, r5, r6)
                java.util.Set r2 = r1.a(r2)
                g.i.c.a.a.l.b r5 = r3.a
                if (r5 == 0) goto L_0x0154
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f4459i
                if (r5 == 0) goto L_0x0154
                java.lang.String r6 = "last_click_element"
                r5.remove(r6)
            L_0x0154:
                java.lang.Object r5 = r1.c()
                java.util.Map<java.lang.Object, g.i.c.a.a.s.b> r6 = g.i.c.a.a.s.f.a
                if (r5 != 0) goto L_0x015d
                goto L_0x016a
            L_0x015d:
                java.util.Map<java.lang.Object, g.i.c.a.a.s.b> r6 = g.i.c.a.a.s.f.a
                java.lang.Object r6 = r6.get(r5)
                g.i.c.a.a.s.b r6 = (g.i.c.a.a.s.b) r6
                if (r6 == 0) goto L_0x016a
                r6.a(r5)
            L_0x016a:
                g.i.c.a.a.b0.e<g.i.c.a.a.s.n$b> r5 = r3.f4507g
                g.i.c.a.a.s.m r6 = new g.i.c.a.a.s.m
                r6.<init>(r3, r1, r2, r4)
                r5.b(r6)
                goto L_0x0191
            L_0x0175:
                g.i.c.a.a.s.i r1 = r0.b
                int r2 = r0.c
                java.util.Objects.requireNonNull(r3)
                g.i.c.a.a.r.e r4 = g.i.c.a.a.r.e.b.a
                boolean r4 = r4.a
                if (r4 == 0) goto L_0x0187
                java.lang.String r4 = "onPageUpdate: "
                g.c.b.b.f.w(r5, r4)
            L_0x0187:
                g.i.c.a.a.b0.e<g.i.c.a.a.s.n$b> r4 = r3.f4507g
                g.i.c.a.a.s.o r5 = new g.i.c.a.a.s.o
                r5.<init>(r3, r1, r2)
                r4.b(r5)
            L_0x0191:
                g.i.c.a.a.s.n r1 = g.i.c.a.a.s.n.this
                r2 = 0
                r1.c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.s.n.c.run():void");
        }
    }

    public static class d {
        public static final n a;

        static {
            n nVar = new n((m) null);
            a = nVar;
            Objects.requireNonNull(nVar);
            p.e.a.a.a(nVar);
            a.e.a.s.a(nVar);
            b.C0166b.a.b.c.a(new k(nVar));
            g.a.a(nVar);
        }
    }

    public n(m mVar) {
    }

    public static n g() {
        return d.a;
    }

    public void a(Object obj, g.i.c.a.a.u.c cVar, Map<String, Object> map) {
        if ("clck".equals(cVar.a) && (obj instanceof View)) {
            View view = (View) obj;
            if (!TextUtils.isEmpty(g.i.c.a.a.l.c.b(view))) {
                Map<String, Object> o = e.b.a.o("clck", view);
                if (o != null) {
                    o.remove("cur_pg");
                }
                if (!e.e.i.b.G(o)) {
                    o.remove("element_params");
                    g.h.a.a.V(this.a, "last_click_element", new l(o));
                }
            }
        }
    }

    public void b() {
    }

    public void c() {
        if (e.b.a.a) {
            f.K("PageManager", "onPageDisappear");
        }
        f();
    }

    public boolean d(View view) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onPageDestroyed, mCurrentPageInfo = ");
            i2.append(this.b);
            i2.append(", disappearingView = ");
            i2.append(view);
            f.K("PageManager", i2.toString());
        }
        i iVar = this.b;
        if (iVar == null || this.c) {
            return false;
        }
        View e2 = iVar.e();
        i iVar2 = iVar;
        while (true) {
            if (e2 == null) {
                break;
            }
            if (iVar2 != null && e2 == iVar2.e()) {
                iVar2 = iVar2.f4502d;
            }
            if (e2 == view) {
                iVar = iVar2;
                break;
            }
            ViewParent parent = e2.getParent();
            e2 = parent instanceof View ? (View) parent : null;
        }
        i iVar3 = this.b;
        boolean z = iVar != iVar3;
        if (z) {
            h(iVar, iVar3, true);
        }
        if (iVar == null) {
            this.c = true;
        } else {
            this.b = iVar;
            this.c = false;
        }
        if (e.b.a.a) {
            f.K("PageManager", "onPageDestroyed, hasNewPageOut = " + z);
        }
        return z;
    }

    public void e(i iVar, int i2) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            f.K("PageManager", "onPageAppear: page = " + iVar + ", pageStep = " + this.f4504d);
        }
        i iVar2 = this.b;
        boolean z = this.c;
        if (iVar2 == null || iVar.c() != iVar2.c()) {
            z = true;
        }
        if (z) {
            i(iVar, this.b, this.f4504d, this.a);
        }
        this.f4505e.removeCallbacks(this.f4506f);
        c cVar = this.f4506f;
        cVar.b = iVar;
        cVar.c = i2;
        this.f4505e.postDelayed(cVar, eVar.d().f4388d);
    }

    public final void f() {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("checkPageOut, mCurrentPageInfo = ");
            i2.append(this.b);
            f.K("PageManager", i2.toString());
        }
        if (this.b != null && !this.c) {
            c cVar = this.f4506f;
            if (cVar.b != null) {
                this.f4505e.removeCallbacks(cVar);
            }
            h((i) null, this.b, true);
            this.c = true;
        }
    }

    public final void h(i iVar, i iVar2, boolean z) {
        if (e.b.a.a) {
            f.w("PageManager", "onPageOut: ");
        }
        this.a = this.a.a();
        Set<i> b2 = iVar != null ? iVar.b(iVar2) : iVar2.b(iVar2);
        this.f4507g.b(new a(this, iVar2, this.a, b2, z));
        for (i next : b2) {
            if (next.c() == null) {
                e.b.a.a.remove(next.c);
            }
        }
    }

    public final void i(i iVar, i iVar2, int i2, g.i.c.a.a.l.b bVar) {
        if (iVar != null) {
            for (i next : iVar.a(iVar2)) {
                d dVar = new d(i2, g.i.c.a.a.l.a.a(next.c()), bVar);
                e eVar = e.b.a;
                eVar.a.put(next.c, dVar);
            }
        }
    }

    public void q(boolean z) {
        if (e.b.a.a) {
            f.K("PageManager", "onAppOut: ");
        }
        f();
    }
}
