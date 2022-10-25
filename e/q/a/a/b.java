package e.q.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class b extends f implements Animatable {
    public C0054b c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1550d;

    /* renamed from: e  reason: collision with root package name */
    public ArgbEvaluator f1551e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable.Callback f1552f;

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.q.a.a.b$b  reason: collision with other inner class name */
    public static class C0054b extends Drawable.ConstantState {
        public int a;
        public g b;
        public AnimatorSet c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f1553d;

        /* renamed from: e  reason: collision with root package name */
        public e.d.a<Animator, String> f1554e;

        public C0054b(C0054b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                g gVar = bVar.b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    g gVar2 = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.b = gVar2;
                    gVar2.mutate();
                    this.b = gVar2;
                    gVar2.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.f1559g = false;
                }
                ArrayList<Animator> arrayList = bVar.f1553d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1553d = new ArrayList<>(size);
                    this.f1554e = new e.d.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f1553d.get(i2);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f1554e.getOrDefault(animator, null);
                        clone.setTarget(this.b.c.b.p.getOrDefault(orDefault, null));
                        this.f1553d.add(clone);
                        this.f1554e.put(clone, orDefault);
                    }
                    if (this.c == null) {
                        this.c = new AnimatorSet();
                    }
                    this.c.playTogether(this.f1553d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this((Context) null, (C0054b) null, (Resources) null);
    }

    public b(Context context, C0054b bVar, Resources resources) {
        this.f1551e = null;
        a aVar = new a();
        this.f1552f = aVar;
        this.f1550d = context;
        this.c = new C0054b((C0054b) null, aVar, (Resources) null);
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                a(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1551e == null) {
                    this.f1551e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1551e);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.d(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return e.e.d.l.a.h(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.c.b.draw(canvas);
        if (this.c.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.c.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.c.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getOpacity() : this.c.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[Catch:{ IOException | XmlPullParserException -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            android.graphics.drawable.Drawable r0 = r1.b
            r6 = 21
            if (r0 == 0) goto L_0x001c
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r6) goto L_0x0018
            r0.inflate(r2, r3, r4, r5)
            goto L_0x001b
        L_0x0018:
            r0.inflate(r2, r3, r4)
        L_0x001b:
            return
        L_0x001c:
            int r0 = r24.getEventType()
            int r7 = r24.getDepth()
            r8 = 1
            int r7 = r7 + r8
        L_0x0026:
            if (r0 == r8) goto L_0x01a1
            int r9 = r24.getDepth()
            if (r9 >= r7) goto L_0x0031
            r9 = 3
            if (r0 == r9) goto L_0x01a1
        L_0x0031:
            r9 = 2
            if (r0 != r9) goto L_0x0196
            java.lang.String r0 = r24.getName()
            java.lang.String r10 = "animated-vector"
            boolean r10 = r10.equals(r0)
            r11 = 24
            r12 = 0
            r13 = 0
            if (r10 == 0) goto L_0x00b1
            int[] r0 = e.q.a.a.a.f1542e
            android.content.res.TypedArray r10 = e.e.c.c.h.e(r2, r5, r4, r0)
            int r0 = r10.getResourceId(r13, r13)
            if (r0 == 0) goto L_0x00ac
            android.graphics.PorterDuff$Mode r14 = e.q.a.a.g.f1555k
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r11) goto L_0x006d
            e.q.a.a.g r9 = new e.q.a.a.g
            r9.<init>()
            android.graphics.drawable.Drawable r0 = e.e.c.c.h.a(r2, r0, r5)
            r9.b = r0
            e.q.a.a.g$i r0 = new e.q.a.a.g$i
            android.graphics.drawable.Drawable r11 = r9.b
            android.graphics.drawable.Drawable$ConstantState r11 = r11.getConstantState()
            r0.<init>(r11)
            goto L_0x0098
        L_0x006d:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
        L_0x0075:
            int r14 = r0.next()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            if (r14 == r9) goto L_0x007e
            if (r14 == r8) goto L_0x007e
            goto L_0x0075
        L_0x007e:
            if (r14 != r9) goto L_0x0085
            e.q.a.a.g r9 = e.q.a.a.g.a(r2, r0, r11, r5)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x0098
        L_0x0085:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            java.lang.String r9 = "No start tag found"
            r0.<init>(r9)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            throw r0     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
        L_0x008d:
            r0 = move-exception
            goto L_0x0090
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            java.lang.String r9 = "VectorDrawableCompat"
            java.lang.String r11 = "parser error"
            android.util.Log.e(r9, r11, r0)
            r9 = r12
        L_0x0098:
            r9.f1559g = r13
            android.graphics.drawable.Drawable$Callback r0 = r1.f1552f
            r9.setCallback(r0)
            e.q.a.a.b$b r0 = r1.c
            e.q.a.a.g r0 = r0.b
            if (r0 == 0) goto L_0x00a8
            r0.setCallback(r12)
        L_0x00a8:
            e.q.a.a.b$b r0 = r1.c
            r0.b = r9
        L_0x00ac:
            r10.recycle()
            goto L_0x0196
        L_0x00b1:
            java.lang.String r9 = "target"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0196
            int[] r0 = e.q.a.a.a.f1543f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r4, r0)
            java.lang.String r9 = r0.getString(r13)
            int r10 = r0.getResourceId(r8, r13)
            if (r10 == 0) goto L_0x0190
            android.content.Context r13 = r1.f1550d
            if (r13 == 0) goto L_0x0185
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 < r11) goto L_0x00d7
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r13, r10)
            r6 = r15
            goto L_0x00fa
        L_0x00d7:
            android.content.res.Resources r14 = r13.getResources()
            android.content.res.Resources$Theme r11 = r13.getTheme()
            java.lang.String r8 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r21 = r14.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x0160, IOException -> 0x0143 }
            android.util.AttributeSet r17 = android.util.Xml.asAttributeSet(r21)     // Catch:{ XmlPullParserException -> 0x013d, IOException -> 0x0139, all -> 0x0137 }
            r18 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r6 = r15
            r15 = r11
            r16 = r21
            android.animation.Animator r10 = e.q.a.a.c.a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ XmlPullParserException -> 0x013d, IOException -> 0x0139, all -> 0x0137 }
            r21.close()
        L_0x00fa:
            e.q.a.a.b$b r8 = r1.c
            e.q.a.a.g r8 = r8.b
            e.q.a.a.g$h r8 = r8.c
            e.q.a.a.g$g r8 = r8.b
            e.d.a<java.lang.String, java.lang.Object> r8 = r8.p
            java.lang.Object r8 = r8.getOrDefault(r9, r12)
            r10.setTarget(r8)
            r8 = 21
            if (r6 >= r8) goto L_0x0112
            r1.a(r10)
        L_0x0112:
            e.q.a.a.b$b r6 = r1.c
            java.util.ArrayList<android.animation.Animator> r11 = r6.f1553d
            if (r11 != 0) goto L_0x0128
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r6.f1553d = r11
            e.q.a.a.b$b r6 = r1.c
            e.d.a r11 = new e.d.a
            r11.<init>()
            r6.f1554e = r11
        L_0x0128:
            e.q.a.a.b$b r6 = r1.c
            java.util.ArrayList<android.animation.Animator> r6 = r6.f1553d
            r6.add(r10)
            e.q.a.a.b$b r6 = r1.c
            e.d.a<android.animation.Animator, java.lang.String> r6 = r6.f1554e
            r6.put(r10, r9)
            goto L_0x0192
        L_0x0137:
            r0 = move-exception
            goto L_0x017f
        L_0x0139:
            r0 = move-exception
            r12 = r21
            goto L_0x0144
        L_0x013d:
            r0 = move-exception
            r12 = r21
            goto L_0x0161
        L_0x0141:
            r0 = move-exception
            goto L_0x017d
        L_0x0143:
            r0 = move-exception
        L_0x0144:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r3.<init>()     // Catch:{ all -> 0x0141 }
            r3.append(r8)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0141 }
            r3.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0141 }
            r2.<init>(r3)     // Catch:{ all -> 0x0141 }
            r2.initCause(r0)     // Catch:{ all -> 0x0141 }
            throw r2     // Catch:{ all -> 0x0141 }
        L_0x0160:
            r0 = move-exception
        L_0x0161:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r3.<init>()     // Catch:{ all -> 0x0141 }
            r3.append(r8)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0141 }
            r3.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0141 }
            r2.<init>(r3)     // Catch:{ all -> 0x0141 }
            r2.initCause(r0)     // Catch:{ all -> 0x0141 }
            throw r2     // Catch:{ all -> 0x0141 }
        L_0x017d:
            r21 = r12
        L_0x017f:
            if (r21 == 0) goto L_0x0184
            r21.close()
        L_0x0184:
            throw r0
        L_0x0185:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0190:
            r8 = 21
        L_0x0192:
            r0.recycle()
            goto L_0x0198
        L_0x0196:
            r8 = 21
        L_0x0198:
            int r0 = r24.next()
            r6 = 21
            r8 = 1
            goto L_0x0026
        L_0x01a1:
            e.q.a.a.b$b r0 = r1.c
            android.animation.AnimatorSet r2 = r0.c
            if (r2 != 0) goto L_0x01ae
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.c = r2
        L_0x01ae:
            android.animation.AnimatorSet r2 = r0.c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f1553d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.c.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.isStateful() : this.c.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.b;
        return drawable != null ? drawable.setLevel(i2) : this.c.b.setLevel(i2);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.b;
        return drawable != null ? drawable.setState(iArr) : this.c.b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.c.b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        g gVar = this.c.b;
        Drawable drawable2 = gVar.b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            gVar.c.f1594e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        g gVar = this.c.b;
        Drawable drawable2 = gVar.b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        gVar.f1557e = colorFilter;
        gVar.invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.E0(drawable, i2);
        } else {
            this.c.b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.F0(drawable, colorStateList);
        } else {
            this.c.b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.G0(drawable, mode);
        } else {
            this.c.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.c.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.c.c.isStarted()) {
            this.c.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.c.end();
        }
    }

    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b((Context) null, (C0054b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable();
            bVar.b = newDrawable;
            newDrawable.setCallback(bVar.f1552f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b((Context) null, (C0054b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable(resources);
            bVar.b = newDrawable;
            newDrawable.setCallback(bVar.f1552f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b((Context) null, (C0054b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            bVar.b = newDrawable;
            newDrawable.setCallback(bVar.f1552f);
            return bVar;
        }
    }
}
