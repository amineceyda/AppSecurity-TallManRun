package e.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e.e.h.a;
import e.e.j.p;
import e.e.k.b;
import e.e.k.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements p, g, b {
    public final d b;
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public final w f1213d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1214e;

    /* renamed from: f  reason: collision with root package name */
    public Future<a> f1215f;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i2) {
        super(u0.a(context), attributeSet, i2);
        this.f1214e = false;
        s0.a(this, getContext());
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, i2);
        x xVar = new x(this);
        this.c = xVar;
        xVar.e(attributeSet, i2);
        xVar.b();
        this.f1213d = new w(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.D) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.f1098e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.D) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.f1097d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.D) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.D) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.c;
        return xVar != null ? xVar.f1206i.f1099f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.D) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.c;
        if (xVar != null) {
            return xVar.f1206i.a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.c.f1205h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.c.f1205h;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<a> future = this.f1215f;
        if (future != null) {
            try {
                this.f1215f = null;
                e.e.d.l.a.D0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1213d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            e.b.h.w r0 = r2.f1213d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.z.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public a.C0043a getTextMetricsParamsCompat() {
        return e.e.d.l.a.K(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.c.g(this, onCreateInputConnection, editorInfo);
        e.b.a.q(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        x xVar = this.c;
        if (xVar != null && !b.D) {
            xVar.f1206i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        Future<a> future = this.f1215f;
        if (future != null) {
            try {
                this.f1215f = null;
                e.e.d.l.a.D0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.c;
        if (xVar != null && !b.D && xVar.d()) {
            this.c.f1206i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (b.D) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.h(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
        if (b.D) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.i(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.D) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.j(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? e.b.d.a.a.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? e.b.d.a.a.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? e.b.d.a.a.b(context, i4) : null;
        if (i5 != 0) {
            drawable = e.b.d.a.a.b(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? e.b.d.a.a.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? e.b.d.a.a.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? e.b.d.a.a.b(context, i4) : null;
        if (i5 != 0) {
            drawable = e.b.d.a.a.b(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.e.d.l.a.M0(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            e.e.d.l.a.v0(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            e.e.d.l.a.z0(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        e.e.d.l.a.B0(this, i2);
    }

    public void setPrecomputedText(a aVar) {
        e.e.d.l.a.D0(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.k(colorStateList);
        this.c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.l(mode);
        this.c.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1213d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.b = textClassifier;
        }
    }

    public void setTextFuture(Future<a> future) {
        this.f1215f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0043a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i3 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        if (i2 < 23) {
            float textScaleX = aVar.a.getTextScaleX();
            getPaint().set(aVar.a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.f1328d);
    }

    public void setTextSize(int i2, float f2) {
        boolean z = b.D;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.c;
        if (xVar != null && !z && !xVar.d()) {
            xVar.f1206i.f(i2, f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTypeface(android.graphics.Typeface r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f1214e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            if (r9 == 0) goto L_0x0050
            if (r10 <= 0) goto L_0x0050
            android.content.Context r1 = r8.getContext()
            e.e.d.j r2 = e.e.d.d.a
            if (r1 == 0) goto L_0x0048
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L_0x0043
            e.e.d.j r2 = e.e.d.d.a
            java.util.Objects.requireNonNull(r2)
            long r3 = e.e.d.j.g(r9)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0029
            r3 = r0
            goto L_0x0035
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, e.e.c.c.c> r5 = r2.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            e.e.c.c.c r3 = (e.e.c.c.c) r3
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.Typeface r0 = r2.a(r1, r3, r0, r10)
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            goto L_0x0050
        L_0x0043:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r9, r10)
            goto L_0x0050
        L_0x0048:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Context cannot be null"
            r9.<init>(r10)
            throw r9
        L_0x0050:
            r1 = 1
            r8.f1214e = r1
            if (r0 == 0) goto L_0x0056
            r9 = r0
        L_0x0056:
            r0 = 0
            super.setTypeface(r9, r10)     // Catch:{ all -> 0x005d }
            r8.f1214e = r0
            return
        L_0x005d:
            r9 = move-exception
            r8.f1214e = r0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.z.setTypeface(android.graphics.Typeface, int):void");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }
}
