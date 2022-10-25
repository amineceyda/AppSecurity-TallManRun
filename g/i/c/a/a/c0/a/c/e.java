package g.i.c.a.a.c0.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

public class e {

    /* renamed from: g  reason: collision with root package name */
    public static volatile e f4417g;
    public Handler a;
    public b b = new b((d) null);
    public a c = new a((d) null);

    /* renamed from: d  reason: collision with root package name */
    public ViewTreeObserver f4418d;

    /* renamed from: e  reason: collision with root package name */
    public c f4419e;

    /* renamed from: f  reason: collision with root package name */
    public b f4420f;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
        public a(d dVar) {
        }

        public void onGlobalLayout() {
            e.a(e.this);
        }

        public void onScrollChanged() {
            e.a(e.this);
        }
    }

    public class b implements Runnable {
        public g.i.c.a.a.c0.a.b.a b;
        public List<g.i.c.a.a.c0.a.b.b> c;

        public class a {
            public View a;
            public int b;

            public a(b bVar, View view, int i2, d dVar) {
                this.a = view;
                this.b = i2;
            }
        }

        public b(d dVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:123:0x0080 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                android.app.Activity r0 = g.h.a.a.K()
                if (r0 == 0) goto L_0x02c8
                boolean r1 = r0.isFinishing()
                if (r1 == 0) goto L_0x000e
                goto L_0x02c8
            L_0x000e:
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                g.i.c.a.a.s.n r2 = g.i.c.a.a.s.n.d.a
                g.i.c.a.a.s.i r2 = r2.b
                r3 = 0
                if (r2 != 0) goto L_0x0023
                goto L_0x0053
            L_0x0023:
                android.view.View r4 = r2.e()
                if (r4 == 0) goto L_0x0053
                android.view.View r4 = r2.e()
                android.view.View r4 = r4.getRootView()
                if (r4 == r0) goto L_0x0034
                goto L_0x0053
            L_0x0034:
                if (r2 == 0) goto L_0x0053
                java.lang.Object r4 = r2.c()
                android.view.View r5 = r2.e()
                if (r4 == 0) goto L_0x0050
                if (r5 == 0) goto L_0x0050
                g.i.c.a.a.c0.a.b.a r6 = new g.i.c.a.a.c0.a.b.a
                r6.<init>(r4, r5)
                g.i.c.a.a.l.c.f(r4)
                g.i.c.a.a.l.c.a(r4, r3)
                r1.add(r6)
            L_0x0050:
                g.i.c.a.a.s.i r2 = r2.f4502d
                goto L_0x0034
            L_0x0053:
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L_0x0061
                java.lang.Object r1 = r1.get(r3)
                g.i.c.a.a.c0.a.b.a r1 = (g.i.c.a.a.c0.a.b.a) r1
                r13.b = r1
            L_0x0061:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 20
                r1.<init>(r2)
                r2 = 0
                r4 = 1
                if (r0 != 0) goto L_0x006e
                goto L_0x0161
            L_0x006e:
                java.util.Stack r5 = new java.util.Stack
                r5.<init>()
                android.util.SparseArray r6 = new android.util.SparseArray
                r6.<init>()
                g.i.c.a.a.c0.a.c.e$b$a r7 = new g.i.c.a.a.c0.a.c.e$b$a
                r7.<init>(r13, r0, r3, r2)
                r5.push(r7)
            L_0x0080:
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0161
                java.lang.Object r0 = r5.pop()
                g.i.c.a.a.c0.a.c.e$b$a r0 = (g.i.c.a.a.c0.a.c.e.b.a) r0
                android.view.View r7 = r0.a
                int r0 = r0.b
                java.lang.String r8 = g.i.c.a.a.l.c.b(r7)
                boolean r9 = android.text.TextUtils.isEmpty(r8)
                if (r9 == 0) goto L_0x009b
                goto L_0x00b1
            L_0x009b:
                r9 = r7
            L_0x009c:
                boolean r10 = r9 instanceof android.view.View
                if (r10 == 0) goto L_0x00ae
                android.view.View r9 = (android.view.View) r9
                g.i.c.a.a.s.i r10 = e.e.i.b.m(r9)
                if (r10 == 0) goto L_0x00a9
                goto L_0x00af
            L_0x00a9:
                android.view.ViewParent r9 = r9.getParent()
                goto L_0x009c
            L_0x00ae:
                r10 = r2
            L_0x00af:
                if (r10 != 0) goto L_0x00b3
            L_0x00b1:
                r9 = r2
                goto L_0x0123
            L_0x00b3:
                g.i.c.a.a.c0.a.b.b r9 = new g.i.c.a.a.c0.a.b.b
                r9.<init>(r7)
                r9.f4412e = r8
                g.i.c.a.a.l.b r8 = g.i.c.a.a.l.c.a(r7, r3)
                g.h.a.a.z(r8)
                java.lang.Object r8 = r10.c()
                g.i.c.a.a.l.c.f(r8)
                g.i.c.a.a.r.e r8 = g.i.c.a.a.r.e.b.a
                java.util.Objects.requireNonNull(r8)
                java.lang.Class<g.i.c.a.a.k.a> r10 = g.i.c.a.a.k.a.class
                java.lang.String r11 = "element_click_policy"
                java.lang.Object r10 = e.e.i.b.z(r7, r11, r10)
                g.i.c.a.a.k.a r10 = (g.i.c.a.a.k.a) r10
                if (r10 != 0) goto L_0x00df
                g.i.c.a.a.a r10 = r8.d()
                g.i.c.a.a.k.a r10 = r10.f4394j
            L_0x00df:
                g.i.c.a.a.k.a r11 = g.i.c.a.a.k.a.REPORT_NONE
                if (r10 == r11) goto L_0x00e5
                r10 = 1
                goto L_0x00e6
            L_0x00e5:
                r10 = 0
            L_0x00e6:
                r9.f4413f = r10
                java.lang.Class<g.i.c.a.a.k.c> r10 = g.i.c.a.a.k.c.class
                java.lang.String r11 = "element_expose_policy"
                java.lang.Object r10 = e.e.i.b.z(r7, r11, r10)
                g.i.c.a.a.k.c r10 = (g.i.c.a.a.k.c) r10
                if (r10 != 0) goto L_0x00fa
                g.i.c.a.a.a r10 = r8.d()
                g.i.c.a.a.k.c r10 = r10.f4395k
            L_0x00fa:
                g.i.c.a.a.k.c r11 = g.i.c.a.a.k.c.REPORT_NONE
                if (r10 == r11) goto L_0x0100
                r10 = 1
                goto L_0x0101
            L_0x0100:
                r10 = 0
            L_0x0101:
                r9.f4414g = r10
                java.lang.Class<g.i.c.a.a.k.b> r10 = g.i.c.a.a.k.b.class
                java.lang.String r11 = "element_end_expose_policy"
                java.lang.Object r10 = e.e.i.b.z(r7, r11, r10)
                g.i.c.a.a.k.b r10 = (g.i.c.a.a.k.b) r10
                if (r10 != 0) goto L_0x0115
                g.i.c.a.a.a r8 = r8.d()
                g.i.c.a.a.k.b r10 = r8.f4396l
            L_0x0115:
                g.i.c.a.a.k.b r8 = g.i.c.a.a.k.b.REPORT_NONE
                if (r10 == r8) goto L_0x011b
                r8 = 1
                goto L_0x011c
            L_0x011b:
                r8 = 0
            L_0x011c:
                r9.f4415h = r8
                r7.hasOnClickListeners()
                g.i.c.a.a.q.a.a = r4
            L_0x0123:
                if (r9 == 0) goto L_0x013a
                int r8 = r0 + -1
            L_0x0127:
                if (r8 < 0) goto L_0x0137
                java.lang.Object r10 = r6.get(r8)
                g.i.c.a.a.c0.a.b.b r10 = (g.i.c.a.a.c0.a.b.b) r10
                if (r10 == 0) goto L_0x0134
                r9.f4411d = r10
                goto L_0x0137
            L_0x0134:
                int r8 = r8 + -1
                goto L_0x0127
            L_0x0137:
                r1.add(r9)
            L_0x013a:
                r6.put(r0, r9)
                boolean r8 = r7 instanceof android.view.ViewGroup
                if (r8 == 0) goto L_0x0080
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r8 = r7.getChildCount()
                int r8 = r8 - r4
            L_0x0148:
                if (r8 < 0) goto L_0x0080
                android.view.View r9 = r7.getChildAt(r8)
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L_0x015e
                g.i.c.a.a.c0.a.c.e$b$a r10 = new g.i.c.a.a.c0.a.c.e$b$a
                int r11 = r0 + 1
                r10.<init>(r13, r9, r11, r2)
                r5.push(r10)
            L_0x015e:
                int r8 = r8 + -1
                goto L_0x0148
            L_0x0161:
                r13.c = r1
                g.i.c.a.a.c0.a.c.e r0 = g.i.c.a.a.c0.a.c.e.this
                g.i.c.a.a.c0.a.c.e$c r0 = r0.f4419e
                if (r0 == 0) goto L_0x02c8
                g.i.c.a.a.c0.a.a$a r0 = (g.i.c.a.a.c0.a.a.C0165a) r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                android.content.Context r6 = g.i.c.a.a.b0.f.c()
                java.lang.String r7 = "window"
                java.lang.Object r6 = r6.getSystemService(r7)
                android.view.WindowManager r6 = (android.view.WindowManager) r6
                r8 = -1
                if (r6 != 0) goto L_0x0186
                r6 = -1
                goto L_0x0194
            L_0x0186:
                android.graphics.Point r9 = new android.graphics.Point
                r9.<init>()
                android.view.Display r6 = r6.getDefaultDisplay()
                r6.getSize(r9)
                int r6 = r9.x
            L_0x0194:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.String r9 = "width"
                r5.put(r9, r6)
                android.content.Context r6 = g.i.c.a.a.b0.f.c()
                java.lang.Object r6 = r6.getSystemService(r7)
                android.view.WindowManager r6 = (android.view.WindowManager) r6
                if (r6 != 0) goto L_0x01ab
                r6 = -1
                goto L_0x01b9
            L_0x01ab:
                android.graphics.Point r7 = new android.graphics.Point
                r7.<init>()
                android.view.Display r6 = r6.getDefaultDisplay()
                r6.getSize(r7)
                int r6 = r7.y
            L_0x01b9:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.String r7 = "height"
                r5.put(r7, r6)
                g.i.c.a.a.t.a r6 = g.i.c.a.a.t.a.e.a
                java.lang.String r6 = r6.f4521l
                java.lang.String r7 = "sessionId"
                r5.put(r7, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x01d4:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L_0x02a2
                java.lang.Object r7 = r1.next()
                g.i.c.a.a.c0.a.b.b r7 = (g.i.c.a.a.c0.a.b.b) r7
                java.lang.ref.WeakReference<android.view.View> r9 = r7.a
                if (r9 == 0) goto L_0x01eb
                java.lang.Object r9 = r9.get()
                android.view.View r9 = (android.view.View) r9
                goto L_0x01ec
            L_0x01eb:
                r9 = r2
            L_0x01ec:
                g.i.c.a.a.c0.a.b.b r10 = r7.f4411d
                if (r10 == 0) goto L_0x01fb
                java.lang.ref.WeakReference<android.view.View> r10 = r10.a
                if (r10 == 0) goto L_0x01fb
                java.lang.Object r10 = r10.get()
                android.view.View r10 = (android.view.View) r10
                goto L_0x01fc
            L_0x01fb:
                r10 = r2
            L_0x01fc:
                boolean r11 = r7.f4413f
                int r11 = r11 + r3
                boolean r12 = r7.f4414g
                if (r12 == 0) goto L_0x0205
                r12 = 2
                goto L_0x0206
            L_0x0205:
                r12 = 0
            L_0x0206:
                int r11 = r11 + r12
                boolean r12 = r7.f4415h
                if (r12 == 0) goto L_0x020d
                r12 = 4
                goto L_0x020e
            L_0x020d:
                r12 = 0
            L_0x020e:
                int r11 = r11 + r12
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                if (r9 == 0) goto L_0x021b
                int r9 = r9.hashCode()
                goto L_0x021c
            L_0x021b:
                r9 = -1
            L_0x021c:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                if (r10 == 0) goto L_0x022a
                int r9 = r10.hashCode()
                goto L_0x022b
            L_0x022a:
                r9 = -1
            L_0x022b:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
                r12.add(r9)
                android.graphics.Rect r9 = r7.b
                int r9 = r9.top
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.b
                int r9 = r9.bottom
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.b
                int r9 = r9.left
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.b
                int r9 = r9.right
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.c
                int r9 = r9.top
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.c
                int r9 = r9.bottom
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.c
                int r9 = r9.left
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                android.graphics.Rect r9 = r7.c
                int r9 = r9.right
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r12.add(r9)
                java.lang.String r7 = r7.f4412e
                r12.add(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
                r12.add(r7)
                r6.add(r12)
                goto L_0x01d4
            L_0x02a2:
                java.lang.String r1 = "elements"
                r5.put(r1, r6)
                java.lang.String r1 = "dt_visual"
                r0.put(r1, r5)
                r1 = 6
                java.lang.Object r1 = g.i.c.a.a.b0.g.a(r1)
                g.i.c.a.a.u.c r1 = (g.i.c.a.a.u.c) r1
                java.lang.String r4 = "dt_screen_dom"
                r1.a = r4
                r1.c(r0)
                g.i.c.a.a.r.e r0 = g.i.c.a.a.r.e.b.a
                g.i.c.a.a.c r0 = r0.f4498g
                if (r0 == 0) goto L_0x02c5
                java.util.Map<java.lang.String, java.lang.Object> r5 = r1.c
                r0.b(r4, r5)
            L_0x02c5:
                g.i.c.a.a.t.g.d(r2, r1, r3, r3)
            L_0x02c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.c0.a.c.e.b.run():void");
        }
    }

    public interface c {
    }

    public e() {
        HandlerThread handlerThread = new HandlerThread("ViewScanThread");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public static void a(e eVar) {
        if (eVar.f4420f == null) {
            eVar.f4420f = new b(new d(eVar), 300);
        }
        b bVar = eVar.f4420f;
        if (!bVar.f4416d) {
            bVar.f4416d = true;
            bVar.a.schedule(new a(bVar), bVar.b.longValue());
        }
    }

    public static e b() {
        if (f4417g == null) {
            synchronized (e.class) {
                if (f4417g == null) {
                    f4417g = new e();
                }
            }
        }
        return f4417g;
    }
}
