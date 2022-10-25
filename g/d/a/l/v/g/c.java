package g.d.a.l.v.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import g.d.a.b;
import g.d.a.l.r;
import g.d.a.l.v.g.g;

public class c extends Drawable implements g.b, Animatable {
    public final a b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2607d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2608e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2609f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f2610g;

    /* renamed from: h  reason: collision with root package name */
    public int f2611h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2612i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f2613j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f2614k;

    public static final class a extends Drawable.ConstantState {
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, g.d.a.j.a aVar, r<Bitmap> rVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(b.b(context), aVar, i2, i3, rVar, bitmap));
        this.b = aVar2;
    }

    public void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.b.a;
        g.a aVar = gVar.f2620i;
        if ((aVar != null ? aVar.f2626f : -1) == gVar.a.d() - 1) {
            this.f2610g++;
        }
        int i2 = this.f2611h;
        if (i2 != -1 && this.f2610g >= i2) {
            stop();
        }
    }

    public Bitmap b() {
        return this.b.a.f2623l;
    }

    public final Paint c() {
        if (this.f2613j == null) {
            this.f2613j = new Paint(2);
        }
        return this.f2613j;
    }

    public final void d() {
        e.e.d.l.a.i(!this.f2608e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.b.a.a.d() != 1) {
            if (!this.c) {
                this.c = true;
                g gVar = this.b.a;
                if (gVar.f2621j) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                } else if (!gVar.c.contains(this)) {
                    boolean isEmpty = gVar.c.isEmpty();
                    gVar.c.add(this);
                    if (isEmpty && !gVar.f2617f) {
                        gVar.f2617f = true;
                        gVar.f2621j = false;
                        gVar.a();
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f2608e) {
            if (this.f2612i) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f2614k == null) {
                    this.f2614k = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2614k);
                this.f2612i = false;
            }
            g gVar = this.b.a;
            g.a aVar = gVar.f2620i;
            if (aVar != null) {
                bitmap = aVar.f2628h;
            } else {
                bitmap = gVar.f2623l;
            }
            if (this.f2614k == null) {
                this.f2614k = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f2614k, c());
        }
    }

    public final void e() {
        this.c = false;
        g gVar = this.b.a;
        gVar.c.remove(this);
        if (gVar.c.isEmpty()) {
            gVar.f2617f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    public int getIntrinsicHeight() {
        return this.b.a.q;
    }

    public int getIntrinsicWidth() {
        return this.b.a.p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.c;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2612i = true;
    }

    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        e.e.d.l.a.i(!this.f2608e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f2609f = z;
        if (!z) {
            e();
        } else if (this.f2607d) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f2607d = true;
        this.f2610g = 0;
        if (this.f2609f) {
            d();
        }
    }

    public void stop() {
        this.f2607d = false;
        e();
    }

    public c(a aVar) {
        this.b = aVar;
    }
}
