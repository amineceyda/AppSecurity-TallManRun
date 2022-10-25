package e.b.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import e.e.j.p;
import e.e.j.q;
import java.util.WeakHashMap;

public class d {
    public final View a;
    public final i b;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public v0 f1119d;

    /* renamed from: e  reason: collision with root package name */
    public v0 f1120e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f1121f;

    public d(View view) {
        this.a = view;
        this.b = i.a();
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 ? i2 == 21 : this.f1119d != null) {
                if (this.f1121f == null) {
                    this.f1121f = new v0();
                }
                v0 v0Var = this.f1121f;
                PorterDuff.Mode mode = null;
                v0Var.a = null;
                v0Var.f1200d = false;
                v0Var.b = null;
                v0Var.c = false;
                View view = this.a;
                WeakHashMap<View, String> weakHashMap = q.a;
                ColorStateList backgroundTintList = i2 >= 21 ? view.getBackgroundTintList() : view instanceof p ? ((p) view).getSupportBackgroundTintList() : null;
                if (backgroundTintList != null) {
                    v0Var.f1200d = true;
                    v0Var.a = backgroundTintList;
                }
                View view2 = this.a;
                if (i2 >= 21) {
                    mode = view2.getBackgroundTintMode();
                } else if (view2 instanceof p) {
                    mode = ((p) view2).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    v0Var.c = true;
                    v0Var.b = mode;
                }
                if (v0Var.f1200d || v0Var.c) {
                    i.e(background, v0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.f1120e;
            if (v0Var2 != null) {
                i.e(background, v0Var2, this.a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.f1119d;
            if (v0Var3 != null) {
                i.e(background, v0Var3, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        v0 v0Var = this.f1120e;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.f1120e;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[Catch:{ all -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = e.b.b.y
            r8 = 0
            e.b.h.x0 r0 = e.b.h.x0.o(r0, r10, r3, r11, r8)
            android.view.View r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.b
            r7 = 0
            r4 = r10
            r6 = r11
            e.e.j.q.m(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r0.m(r8)     // Catch:{ all -> 0x0079 }
            r11 = -1
            if (r10 == 0) goto L_0x003b
            int r10 = r0.j(r8, r11)     // Catch:{ all -> 0x0079 }
            r9.c = r10     // Catch:{ all -> 0x0079 }
            e.b.h.i r10 = r9.b     // Catch:{ all -> 0x0079 }
            android.view.View r1 = r9.a     // Catch:{ all -> 0x0079 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0079 }
            int r2 = r9.c     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r10 = r10.c(r1, r2)     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x003b
            r9.g(r10)     // Catch:{ all -> 0x0079 }
        L_0x003b:
            r10 = 1
            boolean r1 = r0.m(r10)     // Catch:{ all -> 0x0079 }
            r2 = 21
            if (r1 == 0) goto L_0x0088
            android.view.View r1 = r9.a     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r3 = r0.b(r10)     // Catch:{ all -> 0x0079 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            if (r4 < r2) goto L_0x007f
            r1.setBackgroundTintList(r3)     // Catch:{ all -> 0x0079 }
            if (r4 != r2) goto L_0x0088
            android.graphics.drawable.Drawable r3 = r1.getBackground()     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r4 = r1.getBackgroundTintList()     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0066
            android.graphics.PorterDuff$Mode r4 = r1.getBackgroundTintMode()     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r4 = 0
            goto L_0x0067
        L_0x0066:
            r4 = 1
        L_0x0067:
            if (r3 == 0) goto L_0x0088
            if (r4 == 0) goto L_0x0088
            boolean r4 = r3.isStateful()     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x007b
            int[] r4 = r1.getDrawableState()     // Catch:{ all -> 0x0079 }
            r3.setState(r4)     // Catch:{ all -> 0x0079 }
            goto L_0x007b
        L_0x0079:
            r10 = move-exception
            goto L_0x00d8
        L_0x007b:
            r1.setBackground(r3)     // Catch:{ all -> 0x0079 }
            goto L_0x0088
        L_0x007f:
            boolean r4 = r1 instanceof e.e.j.p     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0088
            e.e.j.p r1 = (e.e.j.p) r1     // Catch:{ all -> 0x0079 }
            r1.setSupportBackgroundTintList(r3)     // Catch:{ all -> 0x0079 }
        L_0x0088:
            r1 = 2
            boolean r3 = r0.m(r1)     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x00d2
            android.view.View r3 = r9.a     // Catch:{ all -> 0x0079 }
            int r11 = r0.h(r1, r11)     // Catch:{ all -> 0x0079 }
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = e.b.h.e0.c(r11, r1)     // Catch:{ all -> 0x0079 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            if (r1 < r2) goto L_0x00c9
            r3.setBackgroundTintMode(r11)     // Catch:{ all -> 0x0079 }
            if (r1 != r2) goto L_0x00d2
            android.graphics.drawable.Drawable r11 = r3.getBackground()     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x00b3
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x00b4
        L_0x00b3:
            r8 = 1
        L_0x00b4:
            if (r11 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            boolean r10 = r11.isStateful()     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x00c5
            int[] r10 = r3.getDrawableState()     // Catch:{ all -> 0x0079 }
            r11.setState(r10)     // Catch:{ all -> 0x0079 }
        L_0x00c5:
            r3.setBackground(r11)     // Catch:{ all -> 0x0079 }
            goto L_0x00d2
        L_0x00c9:
            boolean r10 = r3 instanceof e.e.j.p     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x00d2
            e.e.j.p r3 = (e.e.j.p) r3     // Catch:{ all -> 0x0079 }
            r3.setSupportBackgroundTintMode(r11)     // Catch:{ all -> 0x0079 }
        L_0x00d2:
            android.content.res.TypedArray r10 = r0.b
            r10.recycle()
            return
        L_0x00d8:
            android.content.res.TypedArray r11 = r0.b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.d.d(android.util.AttributeSet, int):void");
    }

    public void e() {
        this.c = -1;
        g((ColorStateList) null);
        a();
    }

    public void f(int i2) {
        this.c = i2;
        i iVar = this.b;
        g(iVar != null ? iVar.c(this.a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1119d == null) {
                this.f1119d = new v0();
            }
            v0 v0Var = this.f1119d;
            v0Var.a = colorStateList;
            v0Var.f1200d = true;
        } else {
            this.f1119d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1120e == null) {
            this.f1120e = new v0();
        }
        v0 v0Var = this.f1120e;
        v0Var.a = colorStateList;
        v0Var.f1200d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1120e == null) {
            this.f1120e = new v0();
        }
        v0 v0Var = this.f1120e;
        v0Var.b = mode;
        v0Var.c = true;
        a();
    }
}
