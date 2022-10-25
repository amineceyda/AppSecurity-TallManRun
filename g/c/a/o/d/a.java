package g.c.a.o.d;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import g.c.a.o.d.j;

public class a {
    public int a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f2126d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2127e;

    /* renamed from: f  reason: collision with root package name */
    public float f2128f;

    /* renamed from: g  reason: collision with root package name */
    public float f2129g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2130h;

    /* renamed from: i  reason: collision with root package name */
    public final float f2131i;

    /* renamed from: j  reason: collision with root package name */
    public b f2132j;

    /* renamed from: g.c.a.o.d.a$a  reason: collision with other inner class name */
    public class C0067a implements ScaleGestureDetector.OnScaleGestureListener {
        public C0067a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ((j.a) a.this.f2132j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public a(Context context, b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2131i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2130h = (float) viewConfiguration.getScaledTouchSlop();
        this.f2132j = bVar;
        this.c = new ScaleGestureDetector(context, new C0067a());
    }

    public final float a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean c() {
        return this.c.isInProgress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r2 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bf, code lost:
        if (r2 != null) goto L_0x01c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r24.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x01c7
            r6 = 0
            if (r2 == r4) goto L_0x00e9
            r7 = 2
            if (r2 == r7) goto L_0x0050
            r7 = 3
            if (r2 == r7) goto L_0x0048
            r6 = 6
            if (r2 == r6) goto L_0x001d
            goto L_0x01e6
        L_0x001d:
            int r2 = r24.getAction()
            r6 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r6
            int r2 = r2 >> 8
            int r6 = r1.getPointerId(r2)
            int r7 = r0.a
            if (r6 != r7) goto L_0x01e6
            if (r2 != 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            int r6 = r1.getPointerId(r2)
            r0.a = r6
            float r6 = r1.getX(r2)
            r0.f2128f = r6
            float r2 = r1.getY(r2)
            r0.f2129g = r2
            goto L_0x01e6
        L_0x0048:
            r0.a = r3
            android.view.VelocityTracker r2 = r0.f2126d
            if (r2 == 0) goto L_0x01e6
            goto L_0x01c1
        L_0x0050:
            float r2 = r23.a(r24)
            float r6 = r23.b(r24)
            float r8 = r0.f2128f
            float r8 = r2 - r8
            float r9 = r0.f2129g
            float r9 = r6 - r9
            boolean r10 = r0.f2127e
            if (r10 != 0) goto L_0x007a
            float r10 = r8 * r8
            float r11 = r9 * r9
            float r11 = r11 + r10
            double r10 = (double) r11
            double r10 = java.lang.Math.sqrt(r10)
            float r12 = r0.f2130h
            double r12 = (double) r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            r0.f2127e = r10
        L_0x007a:
            boolean r10 = r0.f2127e
            if (r10 == 0) goto L_0x01e6
            g.c.a.o.d.b r10 = r0.f2132j
            g.c.a.o.d.j$a r10 = (g.c.a.o.d.j.a) r10
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            g.c.a.o.d.a r11 = r11.f2140k
            boolean r11 = r11.c()
            if (r11 != 0) goto L_0x00dc
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            g.c.a.o.d.h r11 = r11.y
            if (r11 == 0) goto L_0x0095
            r11.a(r8, r9)
        L_0x0095:
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            android.graphics.Matrix r11 = r11.n
            r11.postTranslate(r8, r9)
            g.c.a.o.d.j r9 = g.c.a.o.d.j.this
            r9.a()
            g.c.a.o.d.j r9 = g.c.a.o.d.j.this
            android.widget.ImageView r9 = r9.f2138i
            android.view.ViewParent r9 = r9.getParent()
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            boolean r12 = r11.f2136g
            if (r12 == 0) goto L_0x00d7
            g.c.a.o.d.a r11 = r11.f2140k
            boolean r11 = r11.c()
            if (r11 != 0) goto L_0x00d7
            g.c.a.o.d.j r10 = g.c.a.o.d.j.this
            boolean r11 = r10.f2137h
            if (r11 != 0) goto L_0x00d7
            int r10 = r10.A
            if (r10 == r7) goto L_0x00d1
            if (r10 != 0) goto L_0x00c9
            r7 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00d1
        L_0x00c9:
            if (r10 != r4) goto L_0x00dc
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x00dc
        L_0x00d1:
            if (r9 == 0) goto L_0x00dc
            r9.requestDisallowInterceptTouchEvent(r5)
            goto L_0x00dc
        L_0x00d7:
            if (r9 == 0) goto L_0x00dc
            r9.requestDisallowInterceptTouchEvent(r4)
        L_0x00dc:
            r0.f2128f = r2
            r0.f2129g = r6
            android.view.VelocityTracker r2 = r0.f2126d
            if (r2 == 0) goto L_0x01e6
            r2.addMovement(r1)
            goto L_0x01e6
        L_0x00e9:
            r0.a = r3
            boolean r2 = r0.f2127e
            if (r2 == 0) goto L_0x01bd
            android.view.VelocityTracker r2 = r0.f2126d
            if (r2 == 0) goto L_0x01bd
            float r2 = r23.a(r24)
            r0.f2128f = r2
            float r2 = r23.b(r24)
            r0.f2129g = r2
            android.view.VelocityTracker r2 = r0.f2126d
            r2.addMovement(r1)
            android.view.VelocityTracker r2 = r0.f2126d
            r7 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r7)
            android.view.VelocityTracker r2 = r0.f2126d
            float r2 = r2.getXVelocity()
            android.view.VelocityTracker r7 = r0.f2126d
            float r7 = r7.getYVelocity()
            float r8 = java.lang.Math.abs(r2)
            float r9 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.max(r8, r9)
            float r9 = r0.f2131i
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x01bd
            g.c.a.o.d.b r8 = r0.f2132j
            float r2 = -r2
            float r7 = -r7
            g.c.a.o.d.j$a r8 = (g.c.a.o.d.j.a) r8
            g.c.a.o.d.j r9 = g.c.a.o.d.j.this
            g.c.a.o.d.j$f r10 = new g.c.a.o.d.j$f
            r9.getClass()
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            android.widget.ImageView r11 = r11.f2138i
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11)
            r9.z = r10
            g.c.a.o.d.j r9 = g.c.a.o.d.j.this
            g.c.a.o.d.j$f r10 = r9.z
            android.widget.ImageView r11 = r9.f2138i
            int r9 = r9.g(r11)
            g.c.a.o.d.j r11 = g.c.a.o.d.j.this
            android.widget.ImageView r12 = r11.f2138i
            int r11 = r11.f(r12)
            int r15 = (int) r2
            int r2 = (int) r7
            g.c.a.o.d.j r7 = g.c.a.o.d.j.this
            android.graphics.RectF r7 = r7.c()
            if (r7 == 0) goto L_0x01b4
            float r12 = r7.left
            float r12 = -r12
            int r13 = java.lang.Math.round(r12)
            float r9 = (float) r9
            float r12 = r7.width()
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x017b
            float r12 = r7.width()
            float r12 = r12 - r9
            int r9 = java.lang.Math.round(r12)
            r17 = 0
            goto L_0x017e
        L_0x017b:
            r9 = r13
            r17 = r9
        L_0x017e:
            float r12 = r7.top
            float r12 = -r12
            int r14 = java.lang.Math.round(r12)
            float r11 = (float) r11
            float r12 = r7.height()
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x019a
            float r7 = r7.height()
            float r7 = r7 - r11
            int r7 = java.lang.Math.round(r7)
            r19 = 0
            goto L_0x019d
        L_0x019a:
            r7 = r14
            r19 = r7
        L_0x019d:
            r10.c = r13
            r10.f2147d = r14
            if (r13 != r9) goto L_0x01a5
            if (r14 == r7) goto L_0x01b4
        L_0x01a5:
            android.widget.OverScroller r12 = r10.b
            r21 = 0
            r22 = 0
            r16 = r2
            r18 = r9
            r20 = r7
            r12.fling(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01b4:
            g.c.a.o.d.j r2 = g.c.a.o.d.j.this
            android.widget.ImageView r7 = r2.f2138i
            g.c.a.o.d.j$f r2 = r2.z
            r7.post(r2)
        L_0x01bd:
            android.view.VelocityTracker r2 = r0.f2126d
            if (r2 == 0) goto L_0x01e6
        L_0x01c1:
            r2.recycle()
            r0.f2126d = r6
            goto L_0x01e6
        L_0x01c7:
            int r2 = r1.getPointerId(r5)
            r0.a = r2
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f2126d = r2
            if (r2 == 0) goto L_0x01d8
            r2.addMovement(r1)
        L_0x01d8:
            float r2 = r23.a(r24)
            r0.f2128f = r2
            float r2 = r23.b(r24)
            r0.f2129g = r2
            r0.f2127e = r5
        L_0x01e6:
            int r2 = r0.a
            if (r2 == r3) goto L_0x01eb
            r5 = r2
        L_0x01eb:
            int r1 = r1.findPointerIndex(r5)
            r0.b = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.d.a.d(android.view.MotionEvent):boolean");
    }
}
