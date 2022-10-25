package e.e.k;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e.e.j.q;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class a implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();
    public final C0045a b;
    public final Interpolator c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    public final View f1362d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1363e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1364f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    public float[] f1365g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h  reason: collision with root package name */
    public int f1366h;

    /* renamed from: i  reason: collision with root package name */
    public int f1367i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f1368j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    public float[] f1369k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    public float[] f1370l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m  reason: collision with root package name */
    public boolean f1371m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* renamed from: e.e.k.a$a  reason: collision with other inner class name */
    public static class C0045a {
        public int a;
        public int b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f1372d;

        /* renamed from: e  reason: collision with root package name */
        public long f1373e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f1374f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f1375g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1376h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f1377i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1378j;

        /* renamed from: k  reason: collision with root package name */
        public int f1379k;

        public final float a(long j2) {
            long j3 = this.f1373e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f1377i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f1378j;
            return (a.b(((float) (j2 - j4)) / ((float) this.f1379k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    C0045a aVar2 = aVar.b;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f1373e = currentAnimationTimeMillis;
                    aVar2.f1377i = -1;
                    aVar2.f1374f = currentAnimationTimeMillis;
                    aVar2.f1378j = 0.5f;
                    aVar2.f1375g = 0;
                    aVar2.f1376h = 0;
                }
                C0045a aVar3 = a.this.b;
                if ((aVar3.f1377i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f1377i + ((long) aVar3.f1379k)) || !a.this.e()) {
                    a.this.p = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.o) {
                    aVar4.o = false;
                    Objects.requireNonNull(aVar4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f1362d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f1374f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f1374f = currentAnimationTimeMillis2;
                    float f2 = ((float) (currentAnimationTimeMillis2 - aVar3.f1374f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar3.f1375g = (int) (aVar3.c * f2);
                    int i2 = (int) (f2 * aVar3.f1372d);
                    aVar3.f1376h = i2;
                    ((c) a.this).s.scrollListBy(i2);
                    View view = a.this.f1362d;
                    WeakHashMap<View, String> weakHashMap = q.a;
                    view.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0045a aVar = new C0045a();
        this.b = aVar;
        this.f1362d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f1370l;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f1369k;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f1366h = 1;
        float[] fArr3 = this.f1365g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1364f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f1368j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f1367i = r;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1364f
            r0 = r0[r4]
            float[] r1 = r3.f1365g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.c
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.f1368j
            r6 = r6[r4]
            float[] r0 = r3.f1369k
            r0 = r0[r4]
            float[] r1 = r3.f1370l
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.k.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1366h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.p || i2 != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    public final void d() {
        int i2 = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        C0045a aVar = this.b;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f1373e);
        int i4 = aVar.b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f1379k = i2;
        aVar.f1378j = aVar.a(currentAnimationTimeMillis);
        aVar.f1377i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r9 = this;
            e.e.k.a$a r0 = r9.b
            float r1 = r0.f1372d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            e.e.k.c r4 = (e.e.k.c) r4
            android.widget.ListView r4 = r4.s
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.k.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.o = r2
            r5.f1371m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1362d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1362d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            e.e.k.a$a r7 = r5.b
            r7.c = r0
            r7.f1372d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.f1363e
            if (r6 != 0) goto L_0x0061
            e.e.k.a$b r6 = new e.e.k.a$b
            r6.<init>()
            r5.f1363e = r6
        L_0x0061:
            r5.p = r2
            r5.n = r2
            boolean r6 = r5.f1371m
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f1367i
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f1362d
            java.lang.Runnable r0 = r5.f1363e
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = e.e.j.q.a
            r7.postOnAnimationDelayed(r0, r3)
            goto L_0x007d
        L_0x0078:
            java.lang.Runnable r6 = r5.f1363e
            r6.run()
        L_0x007d:
            r5.f1371m = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.k.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
