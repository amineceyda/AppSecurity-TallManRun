package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import e.b.b;
import e.e.c.c.g;
import e.e.j.q;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

public class x {
    public final TextView a;
    public v0 b;
    public v0 c;

    /* renamed from: d  reason: collision with root package name */
    public v0 f1201d;

    /* renamed from: e  reason: collision with root package name */
    public v0 f1202e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f1203f;

    /* renamed from: g  reason: collision with root package name */
    public v0 f1204g;

    /* renamed from: h  reason: collision with root package name */
    public v0 f1205h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f1206i;

    /* renamed from: j  reason: collision with root package name */
    public int f1207j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1208k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1209l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1210m;

    public class a extends g {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.c = weakReference;
        }

        public void d(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            x xVar = x.this;
            WeakReference weakReference = this.c;
            if (xVar.f1210m) {
                xVar.f1209l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, String> weakHashMap = q.a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new y(xVar, textView, typeface, xVar.f1207j));
                    } else {
                        textView.setTypeface(typeface, xVar.f1207j);
                    }
                }
            }
        }
    }

    public x(TextView textView) {
        this.a = textView;
        this.f1206i = new a0(textView);
    }

    public static v0 c(Context context, i iVar, int i2) {
        ColorStateList c2 = iVar.c(context, i2);
        if (c2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.f1200d = true;
        v0Var.a = c2;
        return v0Var;
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            i.e(drawable, v0Var, this.a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.b == null && this.c == null && this.f1201d == null && this.f1202e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f1201d);
            a(compoundDrawables[3], this.f1202e);
        }
        if (this.f1203f != null || this.f1204g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1203f);
            a(compoundDrawablesRelative[2], this.f1204g);
        }
    }

    public boolean d() {
        a0 a0Var = this.f1206i;
        return a0Var.i() && a0Var.a != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r8 = r26
            r9 = r27
            android.widget.TextView r1 = r0.a
            android.content.Context r10 = r1.getContext()
            e.b.h.i r11 = e.b.h.i.a()
            int[] r3 = e.b.b.f933h
            r12 = 0
            e.b.h.x0 r13 = e.b.h.x0.o(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.b
            r7 = 0
            r4 = r26
            r6 = r27
            e.e.j.q.m(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.j(r12, r14)
            r15 = 3
            boolean r2 = r13.m(r15)
            if (r2 == 0) goto L_0x003d
            int r2 = r13.j(r15, r12)
            e.b.h.v0 r2 = c(r10, r11, r2)
            r0.b = r2
        L_0x003d:
            r7 = 1
            boolean r2 = r13.m(r7)
            if (r2 == 0) goto L_0x004e
            int r2 = r13.j(r7, r12)
            e.b.h.v0 r2 = c(r10, r11, r2)
            r0.c = r2
        L_0x004e:
            r6 = 4
            boolean r2 = r13.m(r6)
            if (r2 == 0) goto L_0x005f
            int r2 = r13.j(r6, r12)
            e.b.h.v0 r2 = c(r10, r11, r2)
            r0.f1201d = r2
        L_0x005f:
            r5 = 2
            boolean r2 = r13.m(r5)
            if (r2 == 0) goto L_0x0070
            int r2 = r13.j(r5, r12)
            e.b.h.v0 r2 = c(r10, r11, r2)
            r0.f1202e = r2
        L_0x0070:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 5
            boolean r3 = r13.m(r4)
            if (r3 == 0) goto L_0x0083
            int r3 = r13.j(r4, r12)
            e.b.h.v0 r3 = c(r10, r11, r3)
            r0.f1203f = r3
        L_0x0083:
            r3 = 6
            boolean r16 = r13.m(r3)
            if (r16 == 0) goto L_0x0094
            int r5 = r13.j(r3, r12)
            e.b.h.v0 r5 = c(r10, r11, r5)
            r0.f1204g = r5
        L_0x0094:
            android.content.res.TypedArray r5 = r13.b
            r5.recycle()
            android.widget.TextView r5 = r0.a
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r13 = 23
            r3 = 14
            if (r1 == r14) goto L_0x011e
            int[] r7 = e.b.b.v
            e.b.h.x0 r14 = new e.b.h.x0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r7)
            r14.<init>(r10, r1)
            if (r5 != 0) goto L_0x00c0
            boolean r1 = r14.m(r3)
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r14.a(r3, r12)
            r7 = 1
            goto L_0x00c2
        L_0x00c0:
            r1 = 0
            r7 = 0
        L_0x00c2:
            r0.m(r10, r14)
            if (r2 >= r13) goto L_0x00ee
            boolean r20 = r14.m(r15)
            if (r20 == 0) goto L_0x00d2
            android.content.res.ColorStateList r20 = r14.b(r15)
            goto L_0x00d4
        L_0x00d2:
            r20 = 0
        L_0x00d4:
            boolean r21 = r14.m(r6)
            if (r21 == 0) goto L_0x00df
            android.content.res.ColorStateList r21 = r14.b(r6)
            goto L_0x00e1
        L_0x00df:
            r21 = 0
        L_0x00e1:
            boolean r22 = r14.m(r4)
            if (r22 == 0) goto L_0x00f2
            android.content.res.ColorStateList r22 = r14.b(r4)
            r4 = 15
            goto L_0x00f6
        L_0x00ee:
            r20 = 0
            r21 = 0
        L_0x00f2:
            r4 = 15
            r22 = 0
        L_0x00f6:
            boolean r18 = r14.m(r4)
            if (r18 == 0) goto L_0x0103
            java.lang.String r23 = r14.k(r4)
            r4 = 26
            goto L_0x0107
        L_0x0103:
            r4 = 26
            r23 = 0
        L_0x0107:
            if (r2 < r4) goto L_0x0116
            r4 = 13
            boolean r19 = r14.m(r4)
            if (r19 == 0) goto L_0x0116
            java.lang.String r24 = r14.k(r4)
            goto L_0x0118
        L_0x0116:
            r24 = 0
        L_0x0118:
            android.content.res.TypedArray r4 = r14.b
            r4.recycle()
            goto L_0x012a
        L_0x011e:
            r1 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x012a:
            int[] r4 = e.b.b.v
            e.b.h.x0 r14 = new e.b.h.x0
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r8, r4, r9, r12)
            r14.<init>(r10, r4)
            if (r5 != 0) goto L_0x0142
            boolean r4 = r14.m(r3)
            if (r4 == 0) goto L_0x0142
            boolean r1 = r14.a(r3, r12)
            r7 = 1
        L_0x0142:
            if (r2 >= r13) goto L_0x0163
            boolean r4 = r14.m(r15)
            if (r4 == 0) goto L_0x014e
            android.content.res.ColorStateList r20 = r14.b(r15)
        L_0x014e:
            boolean r4 = r14.m(r6)
            if (r4 == 0) goto L_0x0158
            android.content.res.ColorStateList r21 = r14.b(r6)
        L_0x0158:
            r4 = 5
            boolean r13 = r14.m(r4)
            if (r13 == 0) goto L_0x0163
            android.content.res.ColorStateList r22 = r14.b(r4)
        L_0x0163:
            r13 = r20
            r3 = r21
            r4 = r22
            r6 = 15
            boolean r21 = r14.m(r6)
            if (r21 == 0) goto L_0x0175
            java.lang.String r23 = r14.k(r6)
        L_0x0175:
            r6 = r23
            r15 = 26
            if (r2 < r15) goto L_0x0188
            r15 = 13
            boolean r19 = r14.m(r15)
            if (r19 == 0) goto L_0x018a
            java.lang.String r24 = r14.k(r15)
            goto L_0x018a
        L_0x0188:
            r15 = 13
        L_0x018a:
            r21 = r11
            r15 = r24
            r11 = 28
            if (r2 < r11) goto L_0x01a5
            boolean r11 = r14.m(r12)
            if (r11 == 0) goto L_0x01a5
            r11 = -1
            int r22 = r14.d(r12, r11)
            if (r22 != 0) goto L_0x01a5
            android.widget.TextView r11 = r0.a
            r8 = 0
            r11.setTextSize(r12, r8)
        L_0x01a5:
            r0.m(r10, r14)
            android.content.res.TypedArray r8 = r14.b
            r8.recycle()
            if (r13 == 0) goto L_0x01b4
            android.widget.TextView r8 = r0.a
            r8.setTextColor(r13)
        L_0x01b4:
            if (r3 == 0) goto L_0x01bb
            android.widget.TextView r8 = r0.a
            r8.setHintTextColor(r3)
        L_0x01bb:
            if (r4 == 0) goto L_0x01c2
            android.widget.TextView r3 = r0.a
            r3.setLinkTextColor(r4)
        L_0x01c2:
            if (r5 != 0) goto L_0x01cb
            if (r7 == 0) goto L_0x01cb
            android.widget.TextView r3 = r0.a
            r3.setAllCaps(r1)
        L_0x01cb:
            android.graphics.Typeface r1 = r0.f1209l
            if (r1 == 0) goto L_0x01e1
            int r3 = r0.f1208k
            r4 = -1
            if (r3 != r4) goto L_0x01dc
            android.widget.TextView r3 = r0.a
            int r4 = r0.f1207j
            r3.setTypeface(r1, r4)
            goto L_0x01e1
        L_0x01dc:
            android.widget.TextView r3 = r0.a
            r3.setTypeface(r1)
        L_0x01e1:
            if (r15 == 0) goto L_0x01e8
            android.widget.TextView r1 = r0.a
            r1.setFontVariationSettings(r15)
        L_0x01e8:
            r8 = 24
            if (r6 == 0) goto L_0x020f
            if (r2 < r8) goto L_0x01f8
            android.widget.TextView r1 = r0.a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r6)
            r1.setTextLocales(r2)
            goto L_0x020f
        L_0x01f8:
            r1 = 21
            if (r2 < r1) goto L_0x020f
            r1 = 44
            int r1 = r6.indexOf(r1)
            java.lang.String r1 = r6.substring(r12, r1)
            android.widget.TextView r2 = r0.a
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            r2.setTextLocale(r1)
        L_0x020f:
            e.b.h.a0 r11 = r0.f1206i
            android.content.Context r1 = r11.f1103j
            int[] r3 = e.b.b.f934i
            r13 = r26
            android.content.res.TypedArray r14 = r1.obtainStyledAttributes(r13, r3, r9, r12)
            android.widget.TextView r1 = r11.f1102i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r6 = 6
            r15 = 14
            r5 = 5
            r4 = r26
            r8 = 2
            r15 = 5
            r5 = r14
            r8 = 4
            r6 = r27
            r9 = 1
            e.e.j.q.m(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r14.hasValue(r15)
            if (r1 == 0) goto L_0x023e
            int r1 = r14.getInt(r15, r12)
            r11.a = r1
        L_0x023e:
            boolean r1 = r14.hasValue(r8)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x024b
            float r1 = r14.getDimension(r8, r2)
            goto L_0x024d
        L_0x024b:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x024d:
            r3 = 2
            boolean r4 = r14.hasValue(r3)
            if (r4 == 0) goto L_0x0259
            float r4 = r14.getDimension(r3, r2)
            goto L_0x025b
        L_0x0259:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x025b:
            boolean r3 = r14.hasValue(r9)
            if (r3 == 0) goto L_0x0266
            float r3 = r14.getDimension(r9, r2)
            goto L_0x0268
        L_0x0266:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0268:
            r5 = 3
            boolean r6 = r14.hasValue(r5)
            if (r6 == 0) goto L_0x029e
            int r6 = r14.getResourceId(r5, r12)
            if (r6 <= 0) goto L_0x029e
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.TypedArray r5 = r5.obtainTypedArray(r6)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x029b
            r8 = 0
        L_0x0286:
            if (r8 >= r6) goto L_0x0292
            r15 = -1
            int r17 = r5.getDimensionPixelSize(r8, r15)
            r7[r8] = r17
            int r8 = r8 + 1
            goto L_0x0286
        L_0x0292:
            int[] r6 = r11.b(r7)
            r11.f1099f = r6
            r11.h()
        L_0x029b:
            r5.recycle()
        L_0x029e:
            r14.recycle()
            boolean r5 = r11.i()
            if (r5 == 0) goto L_0x02dd
            int r5 = r11.a
            if (r5 != r9) goto L_0x02df
            boolean r5 = r11.f1100g
            if (r5 != 0) goto L_0x02d9
            android.content.Context r5 = r11.f1103j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02c5
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = 2
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
            goto L_0x02c6
        L_0x02c5:
            r6 = 2
        L_0x02c6:
            int r7 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x02d0
            r3 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r6, r3, r5)
        L_0x02d0:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x02d6
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02d6:
            r11.j(r4, r3, r1)
        L_0x02d9:
            r11.g()
            goto L_0x02df
        L_0x02dd:
            r11.a = r12
        L_0x02df:
            boolean r1 = e.e.k.b.D
            if (r1 == 0) goto L_0x031c
            e.b.h.a0 r1 = r0.f1206i
            int r3 = r1.a
            if (r3 == 0) goto L_0x031c
            int[] r1 = r1.f1099f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x031c
            android.widget.TextView r3 = r0.a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0317
            android.widget.TextView r1 = r0.a
            e.b.h.a0 r2 = r0.f1206i
            float r2 = r2.f1097d
            int r2 = java.lang.Math.round(r2)
            e.b.h.a0 r3 = r0.f1206i
            float r3 = r3.f1098e
            int r3 = java.lang.Math.round(r3)
            e.b.h.a0 r4 = r0.f1206i
            float r4 = r4.c
            int r4 = java.lang.Math.round(r4)
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r12)
            goto L_0x031c
        L_0x0317:
            android.widget.TextView r2 = r0.a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r12)
        L_0x031c:
            int[] r1 = e.b.b.f934i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r13, r1)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0334
            r4 = r21
            android.graphics.drawable.Drawable r7 = r4.b(r10, r2)
            r2 = 13
            goto L_0x0339
        L_0x0334:
            r4 = r21
            r2 = 13
            r7 = 0
        L_0x0339:
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0344
            android.graphics.drawable.Drawable r2 = r4.b(r10, r2)
            goto L_0x0345
        L_0x0344:
            r2 = 0
        L_0x0345:
            r5 = 9
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0352
            android.graphics.drawable.Drawable r5 = r4.b(r10, r5)
            goto L_0x0353
        L_0x0352:
            r5 = 0
        L_0x0353:
            r6 = 6
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x035f
            android.graphics.drawable.Drawable r6 = r4.b(r10, r6)
            goto L_0x0360
        L_0x035f:
            r6 = 0
        L_0x0360:
            r8 = 10
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x036d
            android.graphics.drawable.Drawable r8 = r4.b(r10, r8)
            goto L_0x036e
        L_0x036d:
            r8 = 0
        L_0x036e:
            r11 = 7
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x037a
            android.graphics.drawable.Drawable r3 = r4.b(r10, r11)
            goto L_0x037b
        L_0x037a:
            r3 = 0
        L_0x037b:
            if (r8 != 0) goto L_0x03d0
            if (r3 == 0) goto L_0x0380
            goto L_0x03d0
        L_0x0380:
            if (r7 != 0) goto L_0x0388
            if (r2 != 0) goto L_0x0388
            if (r5 != 0) goto L_0x0388
            if (r6 == 0) goto L_0x03f1
        L_0x0388:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r4 = r3[r12]
            if (r4 != 0) goto L_0x03ba
            r4 = 2
            r8 = r3[r4]
            if (r8 == 0) goto L_0x0398
            goto L_0x03ba
        L_0x0398:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r4 = r0.a
            if (r7 == 0) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            r7 = r3[r12]
        L_0x03a5:
            if (r2 == 0) goto L_0x03a8
            goto L_0x03aa
        L_0x03a8:
            r2 = r3[r9]
        L_0x03aa:
            if (r5 == 0) goto L_0x03ad
            goto L_0x03b0
        L_0x03ad:
            r5 = 2
            r5 = r3[r5]
        L_0x03b0:
            if (r6 == 0) goto L_0x03b3
            goto L_0x03b6
        L_0x03b3:
            r6 = 3
            r6 = r3[r6]
        L_0x03b6:
            r4.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
            goto L_0x03f1
        L_0x03ba:
            android.widget.TextView r4 = r0.a
            r5 = r3[r12]
            if (r2 == 0) goto L_0x03c1
            goto L_0x03c3
        L_0x03c1:
            r2 = r3[r9]
        L_0x03c3:
            r7 = 2
            r7 = r3[r7]
            if (r6 == 0) goto L_0x03c9
            goto L_0x03cc
        L_0x03c9:
            r6 = 3
            r6 = r3[r6]
        L_0x03cc:
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r2, r7, r6)
            goto L_0x03f1
        L_0x03d0:
            android.widget.TextView r4 = r0.a
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            android.widget.TextView r5 = r0.a
            if (r8 == 0) goto L_0x03db
            goto L_0x03dd
        L_0x03db:
            r8 = r4[r12]
        L_0x03dd:
            if (r2 == 0) goto L_0x03e0
            goto L_0x03e2
        L_0x03e0:
            r2 = r4[r9]
        L_0x03e2:
            if (r3 == 0) goto L_0x03e5
            goto L_0x03e8
        L_0x03e5:
            r3 = 2
            r3 = r4[r3]
        L_0x03e8:
            if (r6 == 0) goto L_0x03eb
            goto L_0x03ee
        L_0x03eb:
            r6 = 3
            r6 = r4[r6]
        L_0x03ee:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r3, r6)
        L_0x03f1:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0428
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x040c
            int r3 = r1.getResourceId(r2, r12)
            if (r3 == 0) goto L_0x040c
            android.content.res.ColorStateList r3 = e.b.d.a.a.a(r10, r3)
            if (r3 == 0) goto L_0x040c
            goto L_0x0410
        L_0x040c:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x0410:
            android.widget.TextView r2 = r0.a
            java.util.Objects.requireNonNull(r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x041f
            r2.setCompoundDrawableTintList(r3)
            goto L_0x0428
        L_0x041f:
            boolean r4 = r2 instanceof e.e.k.g
            if (r4 == 0) goto L_0x0428
            e.e.k.g r2 = (e.e.k.g) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0428:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0452
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = e.b.h.e0.c(r2, r3)
            android.widget.TextView r3 = r0.a
            java.util.Objects.requireNonNull(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0449
            r3.setCompoundDrawableTintMode(r2)
            goto L_0x0452
        L_0x0449:
            boolean r4 = r3 instanceof e.e.k.g
            if (r4 == 0) goto L_0x0452
            e.e.k.g r3 = (e.e.k.g) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x0452:
            r2 = 14
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r4 = 17
            int r4 = r1.getDimensionPixelSize(r4, r3)
            r5 = 18
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x046f
            android.widget.TextView r1 = r0.a
            e.e.d.l.a.v0(r1, r2)
        L_0x046f:
            if (r4 == r3) goto L_0x0476
            android.widget.TextView r1 = r0.a
            e.e.d.l.a.z0(r1, r4)
        L_0x0476:
            if (r5 == r3) goto L_0x047d
            android.widget.TextView r1 = r0.a
            e.e.d.l.a.B0(r1, r5)
        L_0x047d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.x.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String k2;
        ColorStateList b2;
        ColorStateList b3;
        ColorStateList b4;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i2, b.v));
        if (x0Var.m(14)) {
            this.a.setAllCaps(x0Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (x0Var.m(3) && (b4 = x0Var.b(3)) != null) {
                this.a.setTextColor(b4);
            }
            if (x0Var.m(5) && (b3 = x0Var.b(5)) != null) {
                this.a.setLinkTextColor(b3);
            }
            if (x0Var.m(4) && (b2 = x0Var.b(4)) != null) {
                this.a.setHintTextColor(b2);
            }
        }
        if (x0Var.m(0) && x0Var.d(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        m(context, x0Var);
        if (i3 >= 26 && x0Var.m(13) && (k2 = x0Var.k(13)) != null) {
            this.a.setFontVariationSettings(k2);
        }
        x0Var.b.recycle();
        Typeface typeface = this.f1209l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f1207j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                e.e.d.l.a.y0(editorInfo, text, 0);
                return;
            }
            Objects.requireNonNull(text);
            if (i2 >= 30) {
                e.e.d.l.a.y0(editorInfo, text, 0);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
            int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
            int length = text.length();
            if (i5 >= 0 && i6 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (!(i7 == 129 || i7 == 225 || i7 == 18)) {
                    if (length <= 2048) {
                        e.e.j.z.a.b(editorInfo, text, i5, i6);
                        return;
                    }
                    int i8 = i6 - i5;
                    int i9 = i8 > 1024 ? 0 : i8;
                    int i10 = 2048 - i9;
                    double d2 = (double) i10;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (d2 * 0.8d)));
                    int min2 = Math.min(i5, i10 - min);
                    int i11 = i5 - min2;
                    if (e.e.j.z.a.a(text, i11, 0)) {
                        i11++;
                        min2--;
                    }
                    if (e.e.j.z.a.a(text, (i6 + min) - 1, 1)) {
                        min--;
                    }
                    CharSequence concat = i9 != i8 ? TextUtils.concat(new CharSequence[]{text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)}) : text.subSequence(i11, min2 + i9 + min + i11);
                    int i12 = min2 + 0;
                    e.e.j.z.a.b(editorInfo, concat, i12, i9 + i12);
                    return;
                }
            }
            e.e.j.z.a.b(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    public void h(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        a0 a0Var = this.f1206i;
        if (a0Var.i()) {
            DisplayMetrics displayMetrics = a0Var.f1103j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void i(int[] iArr, int i2) throws IllegalArgumentException {
        a0 a0Var = this.f1206i;
        if (a0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.f1103j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                a0Var.f1099f = a0Var.b(iArr2);
                if (!a0Var.h()) {
                    StringBuilder i4 = g.a.a.a.a.i("None of the preset sizes is valid: ");
                    i4.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(i4.toString());
                }
            } else {
                a0Var.f1100g = false;
            }
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void j(int i2) {
        a0 a0Var = this.f1206i;
        if (!a0Var.i()) {
            return;
        }
        if (i2 == 0) {
            a0Var.a = 0;
            a0Var.f1097d = -1.0f;
            a0Var.f1098e = -1.0f;
            a0Var.c = -1.0f;
            a0Var.f1099f = new int[0];
            a0Var.b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = a0Var.f1103j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a0Var.g()) {
                a0Var.a();
            }
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.q("Unknown auto-size text type: ", i2));
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f1205h == null) {
            this.f1205h = new v0();
        }
        v0 v0Var = this.f1205h;
        v0Var.a = colorStateList;
        v0Var.f1200d = colorStateList != null;
        this.b = v0Var;
        this.c = v0Var;
        this.f1201d = v0Var;
        this.f1202e = v0Var;
        this.f1203f = v0Var;
        this.f1204g = v0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f1205h == null) {
            this.f1205h = new v0();
        }
        v0 v0Var = this.f1205h;
        v0Var.b = mode;
        v0Var.c = mode != null;
        this.b = v0Var;
        this.c = v0Var;
        this.f1201d = v0Var;
        this.f1202e = v0Var;
        this.f1203f = v0Var;
        this.f1204g = v0Var;
    }

    public final void m(Context context, x0 x0Var) {
        String k2;
        Typeface typeface;
        Typeface typeface2;
        this.f1207j = x0Var.h(2, this.f1207j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 >= 28) {
            int h2 = x0Var.h(11, -1);
            this.f1208k = h2;
            if (h2 != -1) {
                this.f1207j = (this.f1207j & 2) | 0;
            }
        }
        int i3 = 10;
        if (x0Var.m(10) || x0Var.m(12)) {
            this.f1209l = null;
            if (x0Var.m(12)) {
                i3 = 12;
            }
            int i4 = this.f1208k;
            int i5 = this.f1207j;
            if (!context.isRestricted()) {
                try {
                    Typeface g2 = x0Var.g(i3, this.f1207j, new a(i4, i5, new WeakReference(this.a)));
                    if (g2 != null) {
                        if (i2 >= 28 && this.f1208k != -1) {
                            g2 = Typeface.create(Typeface.create(g2, 0), this.f1208k, (this.f1207j & 2) != 0);
                        }
                        this.f1209l = g2;
                    }
                    this.f1210m = this.f1209l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1209l == null && (k2 = x0Var.k(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1208k == -1) {
                    typeface = Typeface.create(k2, this.f1207j);
                } else {
                    Typeface create = Typeface.create(k2, 0);
                    int i6 = this.f1208k;
                    if ((this.f1207j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.f1209l = typeface;
            }
        } else if (x0Var.m(1)) {
            this.f1210m = false;
            int h3 = x0Var.h(1, 1);
            if (h3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (h3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (h3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1209l = typeface2;
        }
    }
}
