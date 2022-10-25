package e.b.e.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import e.b.e.a.b;
import e.b.e.a.d;
import e.d.h;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements e.e.d.l.b {
    public c q;
    public g r;
    public int s;
    public int t;
    public boolean u;

    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super((C0034a) null);
            this.a = animatable;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    public static class c extends d.a {
        public e.d.d<Long> K;
        public h<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new e.d.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        public static long h(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.c(i2, 0).intValue();
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {
        public final e.q.a.a.b a;

        public d(e.q.a.a.b bVar) {
            super((C0034a) null);
            this.a = bVar;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((C0034a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.c);
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        public boolean a() {
            return this.b;
        }

        public void b() {
            this.a.reverse();
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.cancel();
        }
    }

    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.c = i2;
        }

        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * ((float) this.c)) + 0.5f);
            int i3 = this.b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.c) : 0.0f);
        }
    }

    public static abstract class g {
        public g(C0034a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public a(c cVar, Resources resources) {
        super((d.a) null);
        this.s = -1;
        this.t = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(g.a.a.a.a.h(r1, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.b.e.a.a g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = r21.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0240
            e.b.e.a.a r4 = new e.b.e.a.a
            r5 = 0
            r4.<init>(r5, r5)
            int[] r5 = e.b.f.a.a
            android.content.res.TypedArray r5 = e.e.c.c.h.e(r0, r3, r2, r5)
            r6 = 1
            boolean r7 = r5.getBoolean(r6, r6)
            r4.setVisible(r7, r6)
            e.b.e.a.a$c r7 = r4.q
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x0039
            int r8 = r7.f973d
            int r9 = r5.getChangingConfigurations()
            r8 = r8 | r9
            r7.f973d = r8
        L_0x0039:
            boolean r8 = r7.f978i
            r9 = 2
            boolean r8 = r5.getBoolean(r9, r8)
            r7.f978i = r8
            boolean r8 = r7.f981l
            r10 = 3
            boolean r8 = r5.getBoolean(r10, r8)
            r7.f981l = r8
            int r8 = r7.A
            r11 = 4
            int r8 = r5.getInt(r11, r8)
            r7.A = r8
            r8 = 5
            int r11 = r7.B
            int r8 = r5.getInt(r8, r11)
            r7.B = r8
            boolean r7 = r7.x
            r8 = 0
            boolean r7 = r5.getBoolean(r8, r7)
            r4.setDither(r7)
            e.b.e.a.b$c r7 = r4.b
            r7.f(r0)
            r5.recycle()
            int r5 = r21.getDepth()
            int r5 = r5 + r6
            r11 = r19
            r7 = r0
            r12 = r4
        L_0x0078:
            int r13 = r21.next()
            if (r13 == r6) goto L_0x0238
            int r14 = r21.getDepth()
            if (r14 >= r5) goto L_0x0086
            if (r13 == r10) goto L_0x0238
        L_0x0086:
            if (r13 == r9) goto L_0x0089
            goto L_0x0078
        L_0x0089:
            if (r14 <= r5) goto L_0x008c
            goto L_0x0078
        L_0x008c:
            java.lang.String r9 = r21.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            r10 = -1
            if (r9 == 0) goto L_0x0151
            int[] r9 = e.b.f.a.b
            android.content.res.TypedArray r9 = e.e.c.c.h.e(r7, r3, r2, r9)
            int r13 = r9.getResourceId(r8, r8)
            int r6 = r9.getResourceId(r6, r10)
            if (r6 <= 0) goto L_0x00b2
            e.b.h.n0 r10 = e.b.h.n0.d()
            android.graphics.drawable.Drawable r6 = r10.f(r11, r6)
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            r9.recycle()
            int r9 = r22.getAttributeCount()
            int[] r10 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00be:
            if (r14 >= r9) goto L_0x00e6
            int r0 = r2.getAttributeNameResource(r14)
            r16 = r5
            if (r0 == 0) goto L_0x00df
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r0 == r5) goto L_0x00df
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r0 == r5) goto L_0x00df
            int r5 = r15 + 1
            boolean r17 = r2.getAttributeBooleanValue(r14, r8)
            if (r17 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            int r0 = -r0
        L_0x00dc:
            r10[r15] = r0
            r15 = r5
        L_0x00df:
            int r14 = r14 + 1
            r0 = r20
            r5 = r16
            goto L_0x00be
        L_0x00e6:
            r16 = r5
            int[] r0 = android.util.StateSet.trimStateSet(r10, r15)
            java.lang.String r5 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x012b
        L_0x00f0:
            int r6 = r21.next()
            r8 = 4
            if (r6 != r8) goto L_0x00f8
            goto L_0x00f0
        L_0x00f8:
            r8 = 2
            if (r6 != r8) goto L_0x011c
            java.lang.String r6 = r21.getName()
            java.lang.String r8 = "vector"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x010c
            e.q.a.a.g r6 = e.q.a.a.g.a(r20, r21, r22, r23)
            goto L_0x012b
        L_0x010c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r6 < r8) goto L_0x0117
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L_0x012b
        L_0x0117:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
            goto L_0x012b
        L_0x011c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = g.a.a.a.a.h(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x012b:
            if (r6 == 0) goto L_0x0142
            e.b.e.a.a$c r5 = r12.q
            int r6 = r5.a(r6)
            int[][] r8 = r5.J
            r8[r6] = r0
            e.d.h<java.lang.Integer> r0 = r5.L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r0.d(r6, r5)
            goto L_0x022e
        L_0x0142:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = g.a.a.a.a.h(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r16 = r5
            java.lang.String r0 = r21.getName()
            java.lang.String r5 = "transition"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0229
            int[] r0 = e.b.f.a.c
            android.content.res.TypedArray r0 = e.e.c.c.h.e(r7, r3, r2, r0)
            r5 = 2
            int r5 = r0.getResourceId(r5, r10)
            r6 = 1
            int r6 = r0.getResourceId(r6, r10)
            int r9 = r0.getResourceId(r8, r10)
            if (r9 <= 0) goto L_0x017e
            e.b.h.n0 r13 = e.b.h.n0.d()
            android.graphics.drawable.Drawable r9 = r13.f(r11, r9)
            goto L_0x017f
        L_0x017e:
            r9 = 0
        L_0x017f:
            r13 = 3
            boolean r8 = r0.getBoolean(r13, r8)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r9 != 0) goto L_0x01cc
        L_0x018b:
            int r9 = r21.next()
            r13 = 4
            if (r9 != r13) goto L_0x0193
            goto L_0x018b
        L_0x0193:
            r13 = 2
            if (r9 != r13) goto L_0x01bd
            java.lang.String r9 = r21.getName()
            java.lang.String r13 = "animated-vector"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x01ac
            e.q.a.a.b r9 = new e.q.a.a.b
            r13 = 0
            r9.<init>(r11, r13, r13)
            r9.inflate(r7, r1, r2, r3)
            goto L_0x01cc
        L_0x01ac:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r7 < r9) goto L_0x01b7
            android.graphics.drawable.Drawable r7 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L_0x01bb
        L_0x01b7:
            android.graphics.drawable.Drawable r7 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
        L_0x01bb:
            r9 = r7
            goto L_0x01cc
        L_0x01bd:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = g.a.a.a.a.h(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x01cc:
            if (r9 == 0) goto L_0x021a
            if (r5 == r10) goto L_0x0209
            if (r6 == r10) goto L_0x0209
            e.b.e.a.a$c r0 = r12.q
            int r7 = r0.a(r9)
            long r9 = e.b.e.a.a.c.h(r5, r6)
            if (r8 == 0) goto L_0x01e4
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01e6
        L_0x01e4:
            r11 = 0
        L_0x01e6:
            e.d.d<java.lang.Long> r13 = r0.K
            long r14 = (long) r7
            long r17 = r14 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            r13.a(r9, r7)
            if (r8 == 0) goto L_0x0229
            long r5 = e.b.e.a.a.c.h(r6, r5)
            e.d.d<java.lang.Long> r0 = r0.K
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 | r14
            long r7 = r7 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a(r5, r7)
            goto L_0x0229
        L_0x0209:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = g.a.a.a.a.h(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x021a:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = g.a.a.a.a.h(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x0229:
            r11 = r19
            r7 = r20
            r12 = r4
        L_0x022e:
            r6 = 1
            r8 = 0
            r9 = 2
            r10 = 3
            r0 = r20
            r5 = r16
            goto L_0x0078
        L_0x0238:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0240:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r21.getPositionDescription()
            r2.append(r1)
            java.lang.String r1 = ": invalid animated-selector tag "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x025f
        L_0x025e:
            throw r0
        L_0x025f:
            goto L_0x025e
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.e.a.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):e.b.e.a.a");
    }

    public b.c b() {
        return new c(this.q, this, (Resources) null);
    }

    public void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.q = (c) cVar;
        }
    }

    public d.a f() {
        return new c(this.q, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.r;
        if (gVar != null) {
            gVar.d();
            this.r = null;
            d(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    public Drawable mutate() {
        if (!this.u) {
            super.mutate();
            if (this == this) {
                this.q.e();
                this.u = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        g gVar;
        int[] iArr2 = iArr;
        c cVar = this.q;
        int g2 = cVar.g(iArr2);
        if (g2 < 0) {
            g2 = cVar.g(StateSet.WILD_CARD);
        }
        int i2 = this.f967h;
        boolean z2 = false;
        if (g2 != i2) {
            g gVar2 = this.r;
            if (gVar2 != null) {
                if (g2 != this.s) {
                    if (g2 != this.t || !gVar2.a()) {
                        i2 = this.s;
                        gVar2.d();
                    } else {
                        gVar2.b();
                        this.s = this.t;
                        this.t = g2;
                    }
                }
                z = true;
                if (z || d(g2)) {
                    z2 = true;
                }
            }
            this.r = null;
            this.t = -1;
            this.s = -1;
            c cVar2 = this.q;
            int i3 = cVar2.i(i2);
            int i4 = cVar2.i(g2);
            if (!(i4 == 0 || i3 == 0)) {
                int longValue = (int) cVar2.K.d(c.h(i3, i4), -1L).longValue();
                if (longValue >= 0) {
                    boolean z3 = (cVar2.K.d(c.h(i3, i4), -1L).longValue() & 8589934592L) != 0;
                    d(longValue);
                    Drawable drawable = this.f963d;
                    if (drawable instanceof AnimationDrawable) {
                        gVar = new e((AnimationDrawable) drawable, (cVar2.K.d(c.h(i3, i4), -1L).longValue() & 4294967296L) != 0, z3);
                    } else if (drawable instanceof e.q.a.a.b) {
                        gVar = new d((e.q.a.a.b) drawable);
                    } else if (drawable instanceof Animatable) {
                        gVar = new b((Animatable) drawable);
                    }
                    gVar.c();
                    this.r = gVar;
                    this.t = i2;
                    this.s = g2;
                    z = true;
                    z2 = true;
                }
            }
            z = false;
            z2 = true;
        }
        Drawable drawable2 = this.f963d;
        return drawable2 != null ? z2 | drawable2.setState(iArr2) : z2;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
