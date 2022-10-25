package g.c.a.o.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;

public class a {
    public View a;
    public Context b;
    public GradientDrawable c = new GradientDrawable();

    /* renamed from: d  reason: collision with root package name */
    public GradientDrawable f2169d = new GradientDrawable();

    /* renamed from: e  reason: collision with root package name */
    public int f2170e;

    /* renamed from: f  reason: collision with root package name */
    public int f2171f;

    /* renamed from: g  reason: collision with root package name */
    public int f2172g;

    /* renamed from: h  reason: collision with root package name */
    public int f2173h;

    /* renamed from: i  reason: collision with root package name */
    public int f2174i;

    /* renamed from: j  reason: collision with root package name */
    public int f2175j;

    /* renamed from: k  reason: collision with root package name */
    public int f2176k;

    /* renamed from: l  reason: collision with root package name */
    public int f2177l;

    /* renamed from: m  reason: collision with root package name */
    public int f2178m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public float[] s = new float[8];

    public a(View view, Context context, AttributeSet attributeSet) {
        this.a = view;
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.c.a.a.a);
        this.f2170e = obtainStyledAttributes.getColor(0, 0);
        this.f2171f = obtainStyledAttributes.getColor(1, Integer.MAX_VALUE);
        this.f2172g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2177l = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f2178m = obtainStyledAttributes.getColor(10, 0);
        this.n = obtainStyledAttributes.getColor(11, Integer.MAX_VALUE);
        this.o = obtainStyledAttributes.getColor(13, Integer.MAX_VALUE);
        this.p = obtainStyledAttributes.getBoolean(7, false);
        this.q = obtainStyledAttributes.getBoolean(9, false);
        this.f2173h = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f2174i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f2175j = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f2176k = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.r = obtainStyledAttributes.getBoolean(8, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007d, code lost:
        if (r14.n != Integer.MAX_VALUE) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r14 = this;
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            r3 = 2
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = 1
            r8 = 21
            if (r1 < r8) goto L_0x0065
            boolean r1 = r14.r
            if (r1 == 0) goto L_0x0065
            android.graphics.drawable.GradientDrawable r0 = r14.c
            int r1 = r14.f2170e
            int r8 = r14.f2178m
            r14.c(r0, r1, r8)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            int r1 = r14.f2170e
            int r8 = r14.f2171f
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            r10 = 4
            int[][] r11 = new int[r10][]
            int[] r12 = new int[r7]
            r12[r6] = r4
            r11[r6] = r12
            int[] r12 = new int[r7]
            r13 = 16842908(0x101009c, float:2.3693995E-38)
            r12[r6] = r13
            r11[r7] = r12
            int[] r12 = new int[r7]
            r13 = 16843518(0x10102fe, float:2.3695705E-38)
            r12[r6] = r13
            r11[r3] = r12
            int[] r12 = new int[r6]
            r13 = 3
            r11[r13] = r12
            int[] r10 = new int[r10]
            r10[r6] = r8
            r10[r7] = r8
            r10[r3] = r8
            r10[r13] = r1
            r9.<init>(r11, r10)
            android.graphics.drawable.GradientDrawable r1 = r14.c
            r8 = 0
            r0.<init>(r9, r1, r8)
        L_0x005f:
            android.view.View r1 = r14.a
            r1.setBackground(r0)
            goto L_0x0098
        L_0x0065:
            android.graphics.drawable.GradientDrawable r1 = r14.c
            int r8 = r14.f2170e
            int r9 = r14.f2178m
            r14.c(r1, r8, r9)
            int[] r1 = new int[r7]
            r1[r6] = r2
            android.graphics.drawable.GradientDrawable r8 = r14.c
            r0.addState(r1, r8)
            int r1 = r14.f2171f
            if (r1 != r5) goto L_0x007f
            int r8 = r14.n
            if (r8 == r5) goto L_0x005f
        L_0x007f:
            android.graphics.drawable.GradientDrawable r8 = r14.f2169d
            if (r1 != r5) goto L_0x0085
            int r1 = r14.f2170e
        L_0x0085:
            int r9 = r14.n
            if (r9 != r5) goto L_0x008b
            int r9 = r14.f2178m
        L_0x008b:
            r14.c(r8, r1, r9)
            int[] r1 = new int[r7]
            r1[r6] = r4
            android.graphics.drawable.GradientDrawable r8 = r14.f2169d
            r0.addState(r1, r8)
            goto L_0x005f
        L_0x0098:
            android.view.View r0 = r14.a
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x00ce
            int r1 = r14.o
            if (r1 == r5) goto L_0x00ce
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.ColorStateList r0 = r0.getTextColors()
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r5 = new int[r3][]
            int[] r8 = new int[r7]
            r8[r6] = r2
            r5[r6] = r8
            int[] r2 = new int[r7]
            r2[r6] = r4
            r5[r7] = r2
            int[] r2 = new int[r3]
            int r0 = r0.getDefaultColor()
            r2[r6] = r0
            int r0 = r14.o
            r2[r7] = r0
            r1.<init>(r5, r2)
            android.view.View r0 = r14.a
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.o.f.a.a():void");
    }

    public void b(int i2) {
        this.f2172g = (int) ((((float) i2) * this.b.getResources().getDisplayMetrics().density) + 0.5f);
        a();
    }

    public final void c(GradientDrawable gradientDrawable, int i2, int i3) {
        gradientDrawable.setColor(i2);
        int i4 = this.f2173h;
        if (i4 > 0 || this.f2174i > 0 || this.f2176k > 0 || this.f2175j > 0) {
            float[] fArr = this.s;
            fArr[0] = (float) i4;
            fArr[1] = (float) i4;
            int i5 = this.f2174i;
            fArr[2] = (float) i5;
            fArr[3] = (float) i5;
            int i6 = this.f2176k;
            fArr[4] = (float) i6;
            fArr[5] = (float) i6;
            int i7 = this.f2175j;
            fArr[6] = (float) i7;
            fArr[7] = (float) i7;
            gradientDrawable.setCornerRadii(fArr);
        } else {
            gradientDrawable.setCornerRadius((float) this.f2172g);
        }
        gradientDrawable.setStroke(this.f2177l, i3);
    }
}
