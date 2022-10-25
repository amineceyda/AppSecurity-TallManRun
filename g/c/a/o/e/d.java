package g.c.a.o.e;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class d extends Drawable implements Animatable {

    /* renamed from: h  reason: collision with root package name */
    public static final Interpolator f2150h = new LinearInterpolator();

    /* renamed from: i  reason: collision with root package name */
    public static final Interpolator f2151i = new e();

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2152j = {-16777216};
    public final a b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public Resources f2153d;

    /* renamed from: e  reason: collision with root package name */
    public Animator f2154e;

    /* renamed from: f  reason: collision with root package name */
    public float f2155f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2156g;

    public static class a {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f2157d;

        /* renamed from: e  reason: collision with root package name */
        public float f2158e;

        /* renamed from: f  reason: collision with root package name */
        public float f2159f;

        /* renamed from: g  reason: collision with root package name */
        public float f2160g;

        /* renamed from: h  reason: collision with root package name */
        public float f2161h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f2162i;

        /* renamed from: j  reason: collision with root package name */
        public int f2163j;

        /* renamed from: k  reason: collision with root package name */
        public float f2164k;

        /* renamed from: l  reason: collision with root package name */
        public float f2165l;

        /* renamed from: m  reason: collision with root package name */
        public float f2166m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public a() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.f2157d = paint3;
            this.f2158e = 0.0f;
            this.f2159f = 0.0f;
            this.f2160g = 0.0f;
            this.f2161h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void a(int i2) {
            this.f2163j = i2;
            this.u = this.f2162i[i2];
        }

        public void b(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }
    }

    public d(Context context) {
        this.f2153d = context.getResources();
        a aVar = new a();
        this.b = aVar;
        aVar.f2162i = f2152j;
        aVar.a(0);
        aVar.f2161h = 2.5f;
        aVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2150h);
        ofFloat.addListener(new c(this, aVar));
        this.f2154e = ofFloat;
    }

    public void a(float f2, a aVar, boolean z) {
        float f3;
        float f4;
        if (this.f2156g) {
            d(f2, aVar);
            float floor = (float) (Math.floor((double) (aVar.f2166m / 0.8f)) + 1.0d);
            float f5 = aVar.f2164k;
            float f6 = aVar.f2165l;
            aVar.f2158e = (((f6 - 0.01f) - f5) * f2) + f5;
            aVar.f2159f = f6;
            float f7 = aVar.f2166m;
            aVar.f2160g = ((floor - f7) * f2) + f7;
        } else if (f2 != 1.0f || z) {
            float f8 = aVar.f2166m;
            if (f2 < 0.5f) {
                f3 = aVar.f2164k;
                f4 = (f2151i.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                float f9 = aVar.f2164k + 0.79f;
                float f10 = f9;
                f3 = f9 - (((1.0f - f2151i.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f4 = f10;
            }
            aVar.f2158e = f3;
            aVar.f2159f = f4;
            aVar.f2160g = (0.20999998f * f2) + f8;
            this.c = (f2 + this.f2155f) * 216.0f;
        }
    }

    public final void b(float f2, float f3, float f4, float f5) {
        a aVar = this.b;
        float f6 = this.f2153d.getDisplayMetrics().density;
        float f7 = f3 * f6;
        aVar.f2161h = f7;
        aVar.b.setStrokeWidth(f7);
        aVar.q = f2 * f6;
        aVar.a(0);
        aVar.r = (int) (f4 * f6);
        aVar.s = (int) (f5 * f6);
    }

    public void c(int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (i2 == 0) {
            f2 = 11.0f;
            f5 = 3.0f;
            f4 = 12.0f;
            f3 = 6.0f;
        } else {
            f2 = 7.5f;
            f5 = 2.5f;
            f4 = 10.0f;
            f3 = 5.0f;
        }
        b(f2, f5, f4, f3);
        invalidateSelf();
    }

    public void d(float f2, a aVar) {
        int i2;
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int[] iArr = aVar.f2162i;
            int i3 = aVar.f2163j;
            int i4 = iArr[i3];
            int i5 = iArr[(i3 + 1) % iArr.length];
            int i6 = (i4 >> 24) & 255;
            int i7 = (i4 >> 16) & 255;
            int i8 = (i4 >> 8) & 255;
            int i9 = i4 & 255;
            i2 = ((i6 + ((int) (((float) (((i5 >> 24) & 255) - i6)) * f3))) << 24) | ((i7 + ((int) (((float) (((i5 >> 16) & 255) - i7)) * f3))) << 16) | ((i8 + ((int) (((float) (((i5 >> 8) & 255) - i8)) * f3))) << 8) | (i9 + ((int) (f3 * ((float) ((i5 & 255) - i9)))));
        } else {
            i2 = aVar.f2162i[aVar.f2163j];
        }
        aVar.u = i2;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.b;
        RectF rectF = aVar.a;
        float f2 = aVar.q;
        float f3 = (aVar.f2161h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.r) * aVar.p) / 2.0f, aVar.f2161h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f3, ((float) bounds.centerY()) - f3, ((float) bounds.centerX()) + f3, ((float) bounds.centerY()) + f3);
        float f4 = aVar.f2158e;
        float f5 = aVar.f2160g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((aVar.f2159f + f5) * 360.0f) - f6;
        aVar.b.setColor(aVar.u);
        aVar.b.setAlpha(aVar.t);
        float f8 = aVar.f2161h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f2157d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, aVar.b);
        if (aVar.n) {
            Path path = aVar.o;
            if (path == null) {
                Path path2 = new Path();
                aVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(((float) aVar.r) * aVar.p, 0.0f);
            Path path3 = aVar.o;
            float f10 = aVar.p;
            path3.lineTo((((float) aVar.r) * f10) / 2.0f, ((float) aVar.s) * f10);
            aVar.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) aVar.r) * aVar.p) / 2.0f), (aVar.f2161h / 2.0f) + rectF.centerY());
            aVar.o.close();
            aVar.c.setColor(aVar.u);
            aVar.c.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, aVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public int getAlpha() {
        return this.b.t;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f2154e.isRunning();
    }

    public void setAlpha(int i2) {
        this.b.t = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j2;
        Animator animator;
        this.f2154e.cancel();
        a aVar = this.b;
        float f2 = aVar.f2158e;
        aVar.f2164k = f2;
        float f3 = aVar.f2159f;
        aVar.f2165l = f3;
        aVar.f2166m = aVar.f2160g;
        if (f3 != f2) {
            this.f2156g = true;
            animator = this.f2154e;
            j2 = 666;
        } else {
            aVar.a(0);
            a aVar2 = this.b;
            aVar2.f2164k = 0.0f;
            aVar2.f2165l = 0.0f;
            aVar2.f2166m = 0.0f;
            aVar2.f2158e = 0.0f;
            aVar2.f2159f = 0.0f;
            aVar2.f2160g = 0.0f;
            animator = this.f2154e;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.f2154e.start();
    }

    public void stop() {
        this.f2154e.cancel();
        this.c = 0.0f;
        this.b.b(false);
        this.b.a(0);
        a aVar = this.b;
        aVar.f2164k = 0.0f;
        aVar.f2165l = 0.0f;
        aVar.f2166m = 0.0f;
        aVar.f2158e = 0.0f;
        aVar.f2159f = 0.0f;
        aVar.f2160g = 0.0f;
        invalidateSelf();
    }
}
