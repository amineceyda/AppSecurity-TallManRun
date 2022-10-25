package e.b.e.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import e.b.e.a.d;
import java.util.Objects;

public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int n = 0;
    public c b;
    public Rect c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f963d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f964e;

    /* renamed from: f  reason: collision with root package name */
    public int f965f = 255;

    /* renamed from: g  reason: collision with root package name */
    public boolean f966g;

    /* renamed from: h  reason: collision with root package name */
    public int f967h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f968i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f969j;

    /* renamed from: k  reason: collision with root package name */
    public long f970k;

    /* renamed from: l  reason: collision with root package name */
    public long f971l;

    /* renamed from: m  reason: collision with root package name */
    public C0035b f972m;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e.b.e.a.b$b  reason: collision with other inner class name */
    public static class C0035b implements Drawable.Callback {
        public Drawable.Callback b;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A = 0;
        public int B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;
        public Resources b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f973d;

        /* renamed from: e  reason: collision with root package name */
        public int f974e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f975f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f976g;

        /* renamed from: h  reason: collision with root package name */
        public int f977h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f978i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f979j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f980k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f981l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f982m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x = true;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            this.a = bVar;
            Rect rect = null;
            this.b = resources != null ? resources : cVar != null ? cVar.b : null;
            int i2 = cVar != null ? cVar.c : 0;
            int i3 = b.n;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? 160 : i2;
            this.c = i2;
            if (cVar != null) {
                this.f973d = cVar.f973d;
                this.f974e = cVar.f974e;
                this.v = true;
                this.w = true;
                this.f978i = cVar.f978i;
                this.f981l = cVar.f981l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.c == i2) {
                    if (cVar.f979j) {
                        this.f980k = cVar.f980k != null ? new Rect(cVar.f980k) : rect;
                        this.f979j = true;
                    }
                    if (cVar.f982m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.f982m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.f976g;
                this.f976g = new Drawable[drawableArr.length];
                this.f977h = cVar.f977h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f975f;
                this.f975f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f977h);
                int i4 = this.f977h;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5] != null) {
                        Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                        if (constantState != null) {
                            this.f975f.put(i5, constantState);
                        } else {
                            this.f976g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.f976g = new Drawable[10];
            this.f977h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f977h;
            if (i2 >= this.f976g.length) {
                int i3 = i2 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                Drawable[] drawableArr2 = aVar.f976g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
                }
                aVar.f976g = drawableArr;
                int[][] iArr = new int[i3][];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f976g[i2] = drawable;
            this.f977h++;
            this.f974e = drawable.getChangingConfigurations() | this.f974e;
            this.r = false;
            this.t = false;
            this.f980k = null;
            this.f979j = false;
            this.f982m = false;
            this.v = false;
            return i2;
        }

        public void b() {
            this.f982m = true;
            c();
            int i2 = this.f977h;
            Drawable[] drawableArr = this.f976g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f975f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f975f.keyAt(i2);
                    Drawable[] drawableArr = this.f976g;
                    Drawable newDrawable = this.f975f.valueAt(i2).newDrawable(this.b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        e.e.d.l.a.A0(newDrawable, this.z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.a);
                    drawableArr[keyAt] = mutate;
                }
                this.f975f = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.f977h;
            Drawable[] drawableArr = this.f976g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f975f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (e.e.d.l.a.h(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i2) {
            int indexOfKey;
            Drawable drawable = this.f976g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f975f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f975f.valueAt(indexOfKey).newDrawable(this.b);
            if (Build.VERSION.SDK_INT >= 23) {
                e.e.d.l.a.A0(newDrawable, this.z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.a);
            this.f976g[i2] = mutate;
            this.f975f.removeAt(indexOfKey);
            if (this.f975f.size() == 0) {
                this.f975f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int i2 = b.n;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = this.c;
                this.c = i3;
                if (i4 != i3) {
                    this.f982m = false;
                    this.f979j = false;
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f973d | this.f974e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f966g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f963d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f970k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f965f
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.b.e.a.b$c r9 = r13.b
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f965f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f970k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f964e
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f971l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f964e = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b.e.a.b$c r4 = r13.b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f965f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f971l = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f969j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.e.a.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        c cVar = this.b;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i2 = cVar.f977h;
            Drawable[] drawableArr = cVar.f976g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && e.e.d.l.a.h(drawableArr[i3])) {
                    e.e.d.l.a.d(drawableArr[i3], theme);
                    cVar.f974e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f972m == null) {
            this.f972m = new C0035b();
        }
        C0035b bVar = this.f972m;
        bVar.b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.b.A <= 0 && this.f966g) {
                drawable.setAlpha(this.f965f);
            }
            c cVar = this.b;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    e.e.d.l.a.F0(drawable, cVar.F);
                }
                c cVar2 = this.b;
                if (cVar2.I) {
                    e.e.d.l.a.G0(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                e.e.d.l.a.A0(drawable, e.e.d.l.a.E(this));
            }
            drawable.setAutoMirrored(this.b.C);
            Rect rect = this.c;
            if (i2 >= 21 && rect != null) {
                e.e.d.l.a.x0(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0035b bVar2 = this.f972m;
            Drawable.Callback callback = bVar2.b;
            bVar2.b = null;
            drawable.setCallback(callback);
        }
    }

    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f967h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b.e.a.b$c r0 = r9.b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f964e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f963d
            if (r0 == 0) goto L_0x0029
            r9.f964e = r0
            e.b.e.a.b$c r0 = r9.b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f971l = r0
            goto L_0x0035
        L_0x0029:
            r9.f964e = r4
            r9.f971l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f963d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.b.e.a.b$c r0 = r9.b
            int r1 = r0.f977h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f963d = r0
            r9.f967h = r10
            if (r0 == 0) goto L_0x005a
            e.b.e.a.b$c r10 = r9.b
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f970k = r2
        L_0x0051:
            r9.c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f963d = r4
            r10 = -1
            r9.f967h = r10
        L_0x005a:
            long r0 = r9.f970k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f971l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f969j
            if (r0 != 0) goto L_0x0073
            e.b.e.a.b$a r0 = new e.b.e.a.b$a
            r0.<init>()
            r9.f969j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.e.a.b.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f963d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f964e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    public int getAlpha() {
        return this.f965f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        c cVar = this.b;
        boolean z = false;
        if (!cVar.v) {
            cVar.c();
            cVar.v = true;
            int i2 = cVar.f977h;
            Drawable[] drawableArr = cVar.f976g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    cVar.w = true;
                    z = true;
                    break;
                } else if (drawableArr[i3].getConstantState() == null) {
                    cVar.w = false;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z = cVar.w;
        }
        if (!z) {
            return null;
        }
        this.b.f973d = getChangingConfigurations();
        return this.b;
    }

    public Drawable getCurrent() {
        return this.f963d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        c cVar = this.b;
        if (cVar.f981l) {
            if (!cVar.f982m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.f963d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        c cVar = this.b;
        if (cVar.f981l) {
            if (!cVar.f982m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.f963d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        c cVar = this.b;
        if (cVar.f981l) {
            if (!cVar.f982m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.f963d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        c cVar = this.b;
        if (cVar.f981l) {
            if (!cVar.f982m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.f963d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f963d;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.b;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i3 = cVar.f977h;
        Drawable[] drawableArr = cVar.f976g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        cVar.s = i2;
        cVar.r = true;
        return i2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f963d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        c cVar = this.b;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.f978i) {
            Rect rect3 = cVar.f980k;
            if (rect3 != null || cVar.f979j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i2 = cVar.f977h;
                Drawable[] drawableArr = cVar.f976g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.f979j = true;
                cVar.f980k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f963d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.b.C || e.e.d.l.a.E(this) != 1) {
            z2 = false;
        }
        if (z2) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable == this.f963d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.b.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f964e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f964e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f963d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f966g) {
                this.f963d.setAlpha(this.f965f);
            }
        }
        if (this.f971l != 0) {
            this.f971l = 0;
            z = true;
        }
        if (this.f970k != 0) {
            this.f970k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f968i && super.mutate() == this) {
            c b2 = b();
            b2.e();
            e(b2);
            this.f968i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f964e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f963d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.b;
        int i3 = this.f967h;
        int i4 = cVar.f977h;
        Drawable[] drawableArr = cVar.f976g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean A0 = Build.VERSION.SDK_INT >= 23 ? e.e.d.l.a.A0(drawableArr[i5], i2) : false;
                if (i5 == i3) {
                    z = A0;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f964e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f963d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f964e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f963d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f963d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f966g || this.f965f != i2) {
            this.f966g = true;
            this.f965f = i2;
            Drawable drawable = this.f963d;
            if (drawable == null) {
                return;
            }
            if (this.f970k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.b;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f963d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f963d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.b;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f963d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f963d;
        if (drawable != null) {
            e.e.d.l.a.w0(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f963d;
        if (drawable != null) {
            e.e.d.l.a.x0(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            e.e.d.l.a.F0(this.f963d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            e.e.d.l.a.G0(this.f963d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f964e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f963d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f963d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
