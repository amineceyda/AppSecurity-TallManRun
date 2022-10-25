package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import e.b.b;
import e.e.d.l.a;
import e.e.j.q;
import java.util.WeakHashMap;

public class u extends p {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1191d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1192e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1193f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1194g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1195h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1196i = false;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f1191d = seekBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f1191d.getContext();
        int[] iArr = b.f932g;
        x0 o = x0.o(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1191d;
        q.m(seekBar, seekBar.getContext(), iArr, attributeSet, o.b, i2, 0);
        Drawable f2 = o.f(0);
        if (f2 != null) {
            this.f1191d.setThumb(f2);
        }
        Drawable e2 = o.e(1);
        Drawable drawable = this.f1192e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1192e = e2;
        if (e2 != null) {
            e2.setCallback(this.f1191d);
            SeekBar seekBar2 = this.f1191d;
            WeakHashMap<View, String> weakHashMap = q.a;
            a.A0(e2, seekBar2.getLayoutDirection());
            if (e2.isStateful()) {
                e2.setState(this.f1191d.getDrawableState());
            }
            c();
        }
        this.f1191d.invalidate();
        if (o.m(3)) {
            this.f1194g = e0.c(o.h(3, -1), this.f1194g);
            this.f1196i = true;
        }
        if (o.m(2)) {
            this.f1193f = o.b(2);
            this.f1195h = true;
        }
        o.b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1192e;
        if (drawable == null) {
            return;
        }
        if (this.f1195h || this.f1196i) {
            Drawable L0 = a.L0(drawable.mutate());
            this.f1192e = L0;
            if (this.f1195h) {
                a.F0(L0, this.f1193f);
            }
            if (this.f1196i) {
                a.G0(this.f1192e, this.f1194g);
            }
            if (this.f1192e.isStateful()) {
                this.f1192e.setState(this.f1191d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1192e != null) {
            int max = this.f1191d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1192e.getIntrinsicWidth();
                int intrinsicHeight = this.f1192e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1192e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f1191d.getWidth() - this.f1191d.getPaddingLeft()) - this.f1191d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1191d.getPaddingLeft(), (float) (this.f1191d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1192e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
