package e.e.d.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1313h = PorterDuff.Mode.SRC_IN;
    public int b;
    public PorterDuff.Mode c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1314d;

    /* renamed from: e  reason: collision with root package name */
    public f f1315e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1316f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1317g;

    public d(Drawable drawable) {
        this.f1315e = new f(this.f1315e);
        a(drawable);
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1317g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1317g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1315e;
            if (fVar != null) {
                fVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f1317g;
    }

    public boolean c() {
        return true;
    }

    public final boolean d(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f1315e;
        ColorStateList colorStateList = fVar.c;
        PorterDuff.Mode mode = fVar.f1319d;
        if (colorStateList == null || mode == null) {
            this.f1314d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1314d && colorForState == this.b && mode == this.c)) {
                setColorFilter(colorForState, mode);
                this.b = colorForState;
                this.c = mode;
                this.f1314d = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.f1317g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1315e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1317g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1315e;
        if (fVar == null) {
            return null;
        }
        if (!(fVar.b != null)) {
            return null;
        }
        fVar.a = getChangingConfigurations();
        return this.f1315e;
    }

    public Drawable getCurrent() {
        return this.f1317g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1317g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1317g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.E(this.f1317g);
    }

    public int getMinimumHeight() {
        return this.f1317g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1317g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1317g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1317g.getPadding(rect);
    }

    public int[] getState() {
        return this.f1317g.getState();
    }

    public Region getTransparentRegion() {
        return this.f1317g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1317g.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1315e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            e.e.d.l.f r0 = r1.f1315e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1317g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1317g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1316f && super.mutate() == this) {
            this.f1315e = new f(this.f1315e);
            Drawable drawable = this.f1317g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1315e;
            if (fVar != null) {
                Drawable drawable2 = this.f1317g;
                fVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1316f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1317g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return a.A0(this.f1317g, i2);
    }

    public boolean onLevelChange(int i2) {
        return this.f1317g.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f1317g.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.f1317g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.f1317g.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1317g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1317g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1317g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return d(iArr) || this.f1317g.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1315e.c = colorStateList;
        d(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1315e.f1319d = mode;
        d(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1317g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(f fVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f1315e = fVar;
        if (fVar != null && (constantState = fVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }
}
