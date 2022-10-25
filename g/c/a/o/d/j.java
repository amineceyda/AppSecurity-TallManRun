package g.c.a.o.d;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;

public class j implements View.OnTouchListener, View.OnLayoutChangeListener {
    public int A = 2;
    public boolean B = true;
    public ImageView.ScaleType C = ImageView.ScaleType.FIT_CENTER;
    public b Q = new a();
    public Interpolator b = new AccelerateDecelerateInterpolator();
    public int c = 200;

    /* renamed from: d  reason: collision with root package name */
    public float f2133d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2134e = 1.75f;

    /* renamed from: f  reason: collision with root package name */
    public float f2135f = 3.0f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2136g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2137h = false;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f2138i;

    /* renamed from: j  reason: collision with root package name */
    public GestureDetector f2139j;

    /* renamed from: k  reason: collision with root package name */
    public a f2140k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f2141l = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f2142m = new Matrix();
    public final Matrix n = new Matrix();
    public final RectF o = new RectF();
    public final float[] p = new float[9];
    public c q;
    public e r;
    public d s;
    public i t;
    public View.OnClickListener u;
    public View.OnLongClickListener v;
    public f w;
    public g x;
    public h y;
    public f z;

    public class a implements b {
        public a() {
        }

        public void a(float f2, float f3, float f4) {
            float h2 = j.this.h();
            j jVar = j.this;
            if (h2 < jVar.f2135f || f2 < 1.0f) {
                float h3 = jVar.h();
                j jVar2 = j.this;
                if (h3 > jVar2.f2133d || f2 > 1.0f) {
                    f fVar = jVar2.w;
                    if (fVar != null) {
                        ((g.c.a.d.a.j.c) fVar).a.f1931e.setFinger(Math.abs(f2 - 1.0f) < 0.001f);
                    }
                    j.this.n.postScale(f2, f2, f3, f4);
                    j.this.a();
                }
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            j jVar = j.this;
            if (jVar.x == null || jVar.h() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return j.this.x.onFling(motionEvent, motionEvent2, f2, f3);
        }

        public void onLongPress(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnLongClickListener onLongClickListener = jVar.v;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(jVar.f2138i);
            }
        }
    }

    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
            if (r1 < r4) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onDoubleTap(android.view.MotionEvent r7) {
            /*
                r6 = this;
                r0 = 1
                g.c.a.o.d.j r1 = g.c.a.o.d.j.this     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                float r1 = r1.h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                float r2 = r7.getX()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                float r7 = r7.getY()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                g.c.a.o.d.j r3 = g.c.a.o.d.j.this     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                float r4 = r3.f2134e     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x0018
                goto L_0x0022
            L_0x0018:
                int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r4 < 0) goto L_0x0026
                float r4 = r3.f2135f     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
            L_0x0022:
                r3.j(r4, r2, r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                goto L_0x002b
            L_0x0026:
                float r1 = r3.f2133d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
                r3.j(r1, r2, r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x002b }
            L_0x002b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.d.j.c.onDoubleTap(android.view.MotionEvent):boolean");
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnClickListener onClickListener = jVar.u;
            if (onClickListener != null) {
                onClickListener.onClick(jVar.f2138i);
            }
            RectF c = j.this.c();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            i iVar = j.this.t;
            if (iVar != null) {
                PictureBrowseActivity pictureBrowseActivity = ((g.c.a.d.a.b) ((g.c.a.d.a.j.a) iVar).a.f1936j).a;
                if (pictureBrowseActivity.x) {
                    pictureBrowseActivity.A();
                } else {
                    pictureBrowseActivity.z();
                }
            }
            if (c == null) {
                return false;
            }
            if (c.contains(x, y)) {
                float width = (x - c.left) / c.width();
                float height = (y - c.top) / c.height();
                j jVar2 = j.this;
                e eVar = jVar2.r;
                if (eVar == null) {
                    return true;
                }
                eVar.a(jVar2.f2138i, width, height);
                return true;
            }
            j jVar3 = j.this;
            d dVar = jVar3.s;
            if (dVar == null) {
                return false;
            }
            dVar.a(jVar3.f2138i);
            return false;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.d.j.d.<clinit>():void");
        }
    }

    public class e implements Runnable {
        public final float b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2143d = System.currentTimeMillis();

        /* renamed from: e  reason: collision with root package name */
        public final float f2144e;

        /* renamed from: f  reason: collision with root package name */
        public final float f2145f;

        public e(float f2, float f3, float f4, float f5) {
            this.b = f4;
            this.c = f5;
            this.f2144e = f2;
            this.f2145f = f3;
        }

        public void run() {
            float interpolation = j.this.b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f2143d)) * 1.0f) / ((float) j.this.c)));
            float f2 = this.f2144e;
            float h2 = (((this.f2145f - f2) * interpolation) + f2) / j.this.h();
            ((a) j.this.Q).a(h2, this.b, this.c);
            if (interpolation < 1.0f) {
                j.this.f2138i.postOnAnimation(this);
            }
        }
    }

    public class f implements Runnable {
        public final OverScroller b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2147d;

        public f(Context context) {
            this.b = new OverScroller(context);
        }

        public void run() {
            if (!this.b.isFinished() && this.b.computeScrollOffset()) {
                int currX = this.b.getCurrX();
                int currY = this.b.getCurrY();
                j.this.n.postTranslate((float) (this.c - currX), (float) (this.f2147d - currY));
                j.this.a();
                this.c = currX;
                this.f2147d = currY;
                j.this.f2138i.postOnAnimation(this);
            }
        }
    }

    public j(ImageView imageView) {
        this.f2138i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f2140k = new a(imageView.getContext(), this.Q);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
            this.f2139j = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new c());
        }
    }

    public final void a() {
        RectF d2;
        if (b()) {
            Matrix e2 = e();
            this.f2138i.setImageMatrix(e2);
            if (this.q != null && (d2 = d(e2)) != null) {
                this.q.a(d2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r11 = this;
            android.graphics.Matrix r0 = r11.e()
            android.graphics.RectF r0 = r11.d(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            float r2 = r0.height()
            float r3 = r0.width()
            android.widget.ImageView r4 = r11.f2138i
            int r4 = r11.f(r4)
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 3
            r7 = 2
            r8 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x003b
            int[] r9 = g.c.a.o.d.j.d.a
            android.widget.ImageView$ScaleType r10 = r11.C
            int r10 = r10.ordinal()
            r9 = r9[r10]
            if (r9 == r7) goto L_0x0038
            float r4 = r4 - r2
            if (r9 == r6) goto L_0x0034
            float r4 = r4 / r5
        L_0x0034:
            float r2 = r0.top
        L_0x0036:
            float r4 = r4 - r2
            goto L_0x004b
        L_0x0038:
            float r2 = r0.top
            goto L_0x0041
        L_0x003b:
            float r2 = r0.top
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0043
        L_0x0041:
            float r4 = -r2
            goto L_0x004b
        L_0x0043:
            float r2 = r0.bottom
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x004a
            goto L_0x0036
        L_0x004a:
            r4 = 0
        L_0x004b:
            android.widget.ImageView r2 = r11.f2138i
            int r2 = r11.g(r2)
            float r2 = (float) r2
            r9 = 1
            int r10 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0073
            int[] r1 = g.c.a.o.d.j.d.a
            android.widget.ImageView$ScaleType r8 = r11.C
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r7) goto L_0x006c
            float r2 = r2 - r3
            if (r1 == r6) goto L_0x0067
            float r2 = r2 / r5
        L_0x0067:
            float r0 = r0.left
            float r2 = r2 - r0
            r8 = r2
            goto L_0x0070
        L_0x006c:
            float r0 = r0.left
            float r0 = -r0
            r8 = r0
        L_0x0070:
            r11.A = r7
            goto L_0x008b
        L_0x0073:
            float r3 = r0.left
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x007d
            r11.A = r1
            float r8 = -r3
            goto L_0x008b
        L_0x007d:
            float r0 = r0.right
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0088
            float r8 = r2 - r0
            r11.A = r9
            goto L_0x008b
        L_0x0088:
            r0 = -1
            r11.A = r0
        L_0x008b:
            android.graphics.Matrix r0 = r11.n
            r0.postTranslate(r8, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.d.j.b():boolean");
    }

    public RectF c() {
        b();
        return d(e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.f2138i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.o.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.o);
        return this.o;
    }

    public final Matrix e() {
        this.f2142m.set(this.f2141l);
        this.f2142m.postConcat(this.n);
        return this.f2142m;
    }

    public final int f(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int g(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float h() {
        this.n.getValues(this.p);
        this.n.getValues(this.p);
        return (float) Math.sqrt((double) (((float) Math.pow((double) this.p[0], 2.0d)) + ((float) Math.pow((double) this.p[3], 2.0d))));
    }

    public final void i() {
        RectF d2;
        this.n.reset();
        this.n.postRotate(0.0f);
        a();
        Matrix e2 = e();
        this.f2138i.setImageMatrix(e2);
        if (!(this.q == null || (d2 = d(e2)) == null)) {
            this.q.a(d2);
        }
        b();
    }

    public void j(float f2, float f3, float f4, boolean z2) {
        if (f2 < this.f2133d || f2 > this.f2135f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z2) {
            this.f2138i.post(new e(h(), f2, f3, f4));
        } else {
            this.n.setScale(f2, f2, f3, f4);
            a();
        }
    }

    public void k() {
        if (this.B) {
            l(this.f2138i.getDrawable());
        } else {
            i();
        }
    }

    public final void l(Drawable drawable) {
        Matrix matrix;
        Matrix.ScaleToFit scaleToFit;
        float min;
        if (drawable != null) {
            float g2 = (float) g(this.f2138i);
            float f2 = (float) f(this.f2138i);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f2141l.reset();
            float f3 = (float) intrinsicWidth;
            float f4 = g2 / f3;
            float f5 = (float) intrinsicHeight;
            float f6 = f2 / f5;
            ImageView.ScaleType scaleType = this.C;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f2141l.postTranslate((g2 - f3) / 2.0f, (f2 - f5) / 2.0f);
            } else {
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    min = Math.max(f4, f6);
                } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                    min = Math.min(1.0f, Math.min(f4, f6));
                } else {
                    RectF rectF = new RectF(0.0f, 0.0f, f3, f5);
                    RectF rectF2 = new RectF(0.0f, 0.0f, g2, f2);
                    if (((int) 0.0f) % 180 != 0) {
                        rectF = new RectF(0.0f, 0.0f, f5, f3);
                    }
                    int i2 = d.a[this.C.ordinal()];
                    if (i2 == 1) {
                        matrix = this.f2141l;
                        scaleToFit = Matrix.ScaleToFit.CENTER;
                    } else if (i2 == 2) {
                        matrix = this.f2141l;
                        scaleToFit = Matrix.ScaleToFit.START;
                    } else if (i2 == 3) {
                        matrix = this.f2141l;
                        scaleToFit = Matrix.ScaleToFit.END;
                    } else if (i2 == 4) {
                        matrix = this.f2141l;
                        scaleToFit = Matrix.ScaleToFit.FILL;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                }
                this.f2141l.postScale(min, min);
                this.f2141l.postTranslate((g2 - (f3 * min)) / 2.0f, (f2 - (f5 * min)) / 2.0f);
            }
            i();
        }
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 != i6 || i3 != i7 || i4 != i8 || i5 != i9) {
            l(this.f2138i.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.B
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00c9
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00c9
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0070
            if (r0 == r2) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x0020
            goto L_0x0085
        L_0x0020:
            float r0 = r10.h()
            float r3 = r10.f2133d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0085
            g.c.a.o.d.j$e r9 = new g.c.a.o.d.j$e
            float r5 = r10.h()
            float r6 = r10.f2133d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            goto L_0x006b
        L_0x0046:
            float r0 = r10.h()
            float r3 = r10.f2135f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0085
            g.c.a.o.d.j$e r9 = new g.c.a.o.d.j$e
            float r5 = r10.h()
            float r6 = r10.f2135f
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
        L_0x006b:
            r11.post(r9)
            r11 = 1
            goto L_0x0086
        L_0x0070:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0079
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x0079:
            g.c.a.o.d.j$f r11 = r10.z
            if (r11 == 0) goto L_0x0085
            android.widget.OverScroller r11 = r11.b
            r11.forceFinished(r2)
            r11 = 0
            r10.z = r11
        L_0x0085:
            r11 = 0
        L_0x0086:
            g.c.a.o.d.a r0 = r10.f2140k
            if (r0 == 0) goto L_0x00bd
            boolean r11 = r0.c()
            g.c.a.o.d.a r0 = r10.f2140k
            boolean r3 = r0.f2127e
            android.view.ScaleGestureDetector r4 = r0.c     // Catch:{ IllegalArgumentException -> 0x009b }
            r4.onTouchEvent(r12)     // Catch:{ IllegalArgumentException -> 0x009b }
            r0.d(r12)     // Catch:{ IllegalArgumentException -> 0x009b }
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            if (r11 != 0) goto L_0x00a8
            g.c.a.o.d.a r11 = r10.f2140k
            boolean r11 = r11.c()
            if (r11 != 0) goto L_0x00a8
            r11 = 1
            goto L_0x00a9
        L_0x00a8:
            r11 = 0
        L_0x00a9:
            if (r3 != 0) goto L_0x00b3
            g.c.a.o.d.a r0 = r10.f2140k
            boolean r0 = r0.f2127e
            if (r0 != 0) goto L_0x00b3
            r0 = 1
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            if (r11 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            r1 = 1
        L_0x00b9:
            r10.f2137h = r1
            r1 = 1
            goto L_0x00be
        L_0x00bd:
            r1 = r11
        L_0x00be:
            android.view.GestureDetector r11 = r10.f2139j
            if (r11 == 0) goto L_0x00c9
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00c9
            r1 = 1
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.d.j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
