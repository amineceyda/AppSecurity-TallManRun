package e.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class a0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1095l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1096m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1097d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1098e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1099f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1100g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1101h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1102i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1103j;

    /* renamed from: k  reason: collision with root package name */
    public final c f1104k;

    public static class a extends c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) a0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public a0(TextView textView) {
        this.f1102i = textView;
        this.f1103j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.f1104k = i2 >= 29 ? new b() : i2 >= 23 ? new a() : new c();
    }

    public static Method d(String str) {
        try {
            Method method = f1096m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1096m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public void a() {
        if (i() && this.a != 0) {
            if (this.b) {
                if (this.f1102i.getMeasuredHeight() > 0 && this.f1102i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1104k.b(this.f1102i) ? 1048576 : (this.f1102i.getMeasuredWidth() - this.f1102i.getTotalPaddingLeft()) - this.f1102i.getTotalPaddingRight();
                    int height = (this.f1102i.getHeight() - this.f1102i.getCompoundPaddingBottom()) - this.f1102i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1095l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c2 = (float) c(rectF);
                            if (c2 != this.f1102i.getTextSize()) {
                                f(0, c2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(android.graphics.RectF r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.f1099f
            int r2 = r2.length
            if (r2 == 0) goto L_0x0131
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x012c
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r0.f1099f
            r7 = r7[r6]
            android.widget.TextView r8 = r0.f1102i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r0.f1102i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r0.f1102i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r10 = r0.f1102i
            int r15 = r10.getMaxLines()
            android.text.TextPaint r10 = r0.f1101h
            if (r10 != 0) goto L_0x0043
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r0.f1101h = r10
            goto L_0x0046
        L_0x0043:
            r10.reset()
        L_0x0046:
            android.text.TextPaint r10 = r0.f1101h
            android.widget.TextView r11 = r0.f1102i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r0.f1101h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r0.f1102i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.Object r7 = e(r7, r11, r10)
            r14 = r7
            android.text.Layout$Alignment r14 = (android.text.Layout.Alignment) r14
            float r7 = r1.right
            int r13 = java.lang.Math.round(r7)
            r7 = 23
            r12 = -1
            if (r9 < r7) goto L_0x00cb
            int r7 = r8.length()
            android.text.TextPaint r9 = r0.f1101h
            android.text.StaticLayout$Builder r7 = android.text.StaticLayout.Builder.obtain(r8, r4, r7, r9, r13)
            android.text.StaticLayout$Builder r9 = r7.setAlignment(r14)
            android.widget.TextView r10 = r0.f1102i
            float r10 = r10.getLineSpacingExtra()
            android.widget.TextView r11 = r0.f1102i
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r9 = r9.setLineSpacing(r10, r11)
            android.widget.TextView r10 = r0.f1102i
            boolean r10 = r10.getIncludeFontPadding()
            android.text.StaticLayout$Builder r9 = r9.setIncludePad(r10)
            android.widget.TextView r10 = r0.f1102i
            int r10 = r10.getBreakStrategy()
            android.text.StaticLayout$Builder r9 = r9.setBreakStrategy(r10)
            android.widget.TextView r10 = r0.f1102i
            int r10 = r10.getHyphenationFrequency()
            android.text.StaticLayout$Builder r9 = r9.setHyphenationFrequency(r10)
            if (r15 != r12) goto L_0x00b1
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00b1:
            r10 = r15
        L_0x00b2:
            r9.setMaxLines(r10)
            e.b.h.a0$c r9 = r0.f1104k     // Catch:{ ClassCastException -> 0x00bd }
            android.widget.TextView r10 = r0.f1102i     // Catch:{ ClassCastException -> 0x00bd }
            r9.a(r7, r10)     // Catch:{ ClassCastException -> 0x00bd }
            goto L_0x00c4
        L_0x00bd:
            java.lang.String r9 = "ACTVAutoSizeHelper"
            java.lang.String r10 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r9, r10)
        L_0x00c4:
            android.text.StaticLayout r7 = r7.build()
            r3 = r15
            r4 = -1
            goto L_0x00ee
        L_0x00cb:
            android.widget.TextView r7 = r0.f1102i
            float r7 = r7.getLineSpacingMultiplier()
            android.widget.TextView r9 = r0.f1102i
            float r16 = r9.getLineSpacingExtra()
            android.widget.TextView r9 = r0.f1102i
            boolean r17 = r9.getIncludeFontPadding()
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r11 = r0.f1101h
            r10 = r9
            r18 = r11
            r11 = r8
            r4 = -1
            r12 = r18
            r3 = r15
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r9
        L_0x00ee:
            if (r3 == r4) goto L_0x0109
            int r4 = r7.getLineCount()
            if (r4 > r3) goto L_0x0107
            int r3 = r7.getLineCount()
            r4 = 1
            int r3 = r3 - r4
            int r3 = r7.getLineEnd(r3)
            int r8 = r8.length()
            if (r3 == r8) goto L_0x010a
            goto L_0x0115
        L_0x0107:
            r4 = 1
            goto L_0x0115
        L_0x0109:
            r4 = 1
        L_0x010a:
            int r3 = r7.getHeight()
            float r3 = (float) r3
            float r7 = r1.bottom
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
        L_0x0115:
            r3 = 0
            goto L_0x0118
        L_0x0117:
            r3 = 1
        L_0x0118:
            if (r3 == 0) goto L_0x0125
            int r6 = r6 + 1
            r3 = 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x000e
        L_0x0125:
            int r6 = r6 + -1
            r2 = r6
            r3 = 1
            r4 = 0
            goto L_0x000e
        L_0x012c:
            int[] r1 = r0.f1099f
            r1 = r1[r6]
            return r1
        L_0x0131:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            goto L_0x013a
        L_0x0139:
            throw r1
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.a0.c(android.graphics.RectF):int");
    }

    public void f(int i2, float f2) {
        Context context = this.f1103j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1102i.getPaint().getTextSize()) {
            this.f1102i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f1102i.isInLayout();
            if (this.f1102i.getLayout() != null) {
                this.b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f1102i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f1102i.requestLayout();
                } else {
                    this.f1102i.forceLayout();
                }
                this.f1102i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.f1100g || this.f1099f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1098e - this.f1097d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.c) + this.f1097d);
                }
                this.f1099f = b(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    public final boolean h() {
        int[] iArr = this.f1099f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1100g = z;
        if (z) {
            this.a = 1;
            this.f1097d = (float) iArr[0];
            this.f1098e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.f1102i instanceof j);
    }

    public final void j(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.f1097d = f2;
            this.f1098e = f3;
            this.c = f4;
            this.f1100g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
