package e.b.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import e.e.d.l.a;

public class h {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1133d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1134e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1135f;

    public h(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable A = a.A(this.a);
        if (A == null) {
            return;
        }
        if (this.f1133d || this.f1134e) {
            Drawable mutate = a.L0(A).mutate();
            if (this.f1133d) {
                a.F0(mutate, this.b);
            }
            if (this.f1134e) {
                a.G0(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[Catch:{ all -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = e.b.b.f937l
            r8 = 0
            e.b.h.x0 r0 = e.b.h.x0.o(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.b
            r7 = 0
            r4 = r10
            r6 = r11
            e.e.j.q.m(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.m(r10)     // Catch:{ all -> 0x0073 }
            if (r11 == 0) goto L_0x0036
            int r11 = r0.j(r10, r8)     // Catch:{ all -> 0x0073 }
            if (r11 == 0) goto L_0x0036
            android.widget.CompoundButton r1 = r9.a     // Catch:{ NotFoundException -> 0x0036 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0036 }
            android.graphics.drawable.Drawable r11 = e.b.d.a.a.b(r2, r11)     // Catch:{ NotFoundException -> 0x0036 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 != 0) goto L_0x0052
            boolean r10 = r0.m(r8)     // Catch:{ all -> 0x0073 }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.j(r8, r8)     // Catch:{ all -> 0x0073 }
            if (r10 == 0) goto L_0x0052
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0073 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0073 }
            android.graphics.drawable.Drawable r10 = e.b.d.a.a.b(r1, r10)     // Catch:{ all -> 0x0073 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0073 }
        L_0x0052:
            r10 = 2
            boolean r11 = r0.m(r10)     // Catch:{ all -> 0x0073 }
            r1 = 21
            if (r11 == 0) goto L_0x0075
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0073 }
            android.content.res.ColorStateList r10 = r0.b(r10)     // Catch:{ all -> 0x0073 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0073 }
            if (r2 < r1) goto L_0x0069
            r11.setButtonTintList(r10)     // Catch:{ all -> 0x0073 }
            goto L_0x0075
        L_0x0069:
            boolean r2 = r11 instanceof e.e.k.f     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x0075
            e.e.k.f r11 = (e.e.k.f) r11     // Catch:{ all -> 0x0073 }
            r11.setSupportButtonTintList(r10)     // Catch:{ all -> 0x0073 }
            goto L_0x0075
        L_0x0073:
            r10 = move-exception
            goto L_0x009f
        L_0x0075:
            r10 = 3
            boolean r11 = r0.m(r10)     // Catch:{ all -> 0x0073 }
            if (r11 == 0) goto L_0x0099
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0073 }
            r2 = -1
            int r10 = r0.h(r10, r2)     // Catch:{ all -> 0x0073 }
            r2 = 0
            android.graphics.PorterDuff$Mode r10 = e.b.h.e0.c(r10, r2)     // Catch:{ all -> 0x0073 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0073 }
            if (r2 < r1) goto L_0x0090
            r11.setButtonTintMode(r10)     // Catch:{ all -> 0x0073 }
            goto L_0x0099
        L_0x0090:
            boolean r1 = r11 instanceof e.e.k.f     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0099
            e.e.k.f r11 = (e.e.k.f) r11     // Catch:{ all -> 0x0073 }
            r11.setSupportButtonTintMode(r10)     // Catch:{ all -> 0x0073 }
        L_0x0099:
            android.content.res.TypedArray r10 = r0.b
            r10.recycle()
            return
        L_0x009f:
            android.content.res.TypedArray r11 = r0.b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.h.b(android.util.AttributeSet, int):void");
    }
}
