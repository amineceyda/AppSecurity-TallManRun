package e.b.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class i0 extends ViewGroup {
    public boolean b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f1146d;

    /* renamed from: e  reason: collision with root package name */
    public int f1147e;

    /* renamed from: f  reason: collision with root package name */
    public int f1148f;

    /* renamed from: g  reason: collision with root package name */
    public int f1149g;

    /* renamed from: h  reason: collision with root package name */
    public float f1150h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1151i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f1152j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f1153k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f1154l;

    /* renamed from: m  reason: collision with root package name */
    public int f1155m;
    public int n;
    public int o;
    public int p;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public i0(Context context) {
        this(context, (AttributeSet) null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r14 = r3.getResourceId(5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.b = r0
            r1 = -1
            r11.c = r1
            r2 = 0
            r11.f1146d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f1148f = r3
            int[] r6 = e.b.b.f938m
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            e.e.j.q.m(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L_0x0029
            r11.setOrientation(r13)
        L_0x0029:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L_0x0032
            r11.setGravity(r13)
        L_0x0032:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L_0x003c
            r11.setBaselineAligned(r13)
        L_0x003c:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f1150h = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.c = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f1151i = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L_0x0065
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r12 = e.b.d.a.a.b(r12, r14)
            goto L_0x0069
        L_0x0065:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L_0x0069:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.o = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.p = r12
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.i0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void e(Canvas canvas, int i2) {
        this.f1154l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.f1154l.draw(canvas);
    }

    public void f(Canvas canvas, int i2) {
        this.f1154l.setBounds(i2, getPaddingTop() + this.p, this.f1155m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.f1154l.draw(canvas);
    }

    /* renamed from: g */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1147e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        int i2;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f1146d;
                if (this.f1147e == 1 && (i2 = this.f1148f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1149g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1149g;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.c;
    }

    public Drawable getDividerDrawable() {
        return this.f1154l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.f1155m;
    }

    public int getGravity() {
        return this.f1148f;
    }

    public int getOrientation() {
        return this.f1147e;
    }

    public int getShowDividers() {
        return this.o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1150h;
    }

    /* renamed from: h */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: i */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int j() {
        return 0;
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public boolean m(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void n(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public int o() {
        return 0;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.f1154l != null) {
            int i5 = 0;
            if (this.f1147e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !m(i5))) {
                        e(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.n);
                    }
                    i5++;
                }
                if (m(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.n : childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b2 = d1.b(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !m(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    f(canvas, b2 ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f1155m);
                }
                i5++;
            }
            if (m(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b2) {
                        i4 = childAt4.getLeft();
                        i3 = aVar2.leftMargin;
                    } else {
                        i2 = childAt4.getRight() + aVar2.rightMargin;
                        f(canvas, i2);
                    }
                } else if (b2) {
                    i2 = getPaddingLeft();
                    f(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.f1155m;
                f(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f1147e
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00c4
            int r1 = r23.getPaddingLeft()
            int r10 = r27 - r25
            int r11 = r23.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r23.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r23.getVirtualChildCount()
            int r13 = r0.f1148f
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r23.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r23.getPaddingTop()
            int r2 = r2 + r28
            int r2 = r2 - r26
            int r3 = r0.f1149g
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r23.getPaddingTop()
            int r3 = r28 - r26
            int r13 = r0.f1149g
            int r3 = r3 - r13
            int r3 = r3 / r8
            int r2 = r2 + r3
        L_0x004d:
            r7 = 0
        L_0x004e:
            if (r7 >= r12) goto L_0x01e9
            android.view.View r3 = r0.getChildAt(r7)
            if (r3 != 0) goto L_0x005c
            int r3 = r23.o()
            int r3 = r3 + r2
            goto L_0x00bd
        L_0x005c:
            int r13 = r3.getVisibility()
            if (r13 == r4) goto L_0x00be
            int r13 = r3.getMeasuredWidth()
            int r14 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            e.b.h.i0$a r15 = (e.b.h.i0.a) r15
            int r4 = r15.gravity
            if (r4 >= 0) goto L_0x0075
            r4 = r6
        L_0x0075:
            java.util.WeakHashMap<android.view.View, java.lang.String> r16 = e.e.j.q.a
            int r8 = r23.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r8)
            r4 = r4 & 7
            if (r4 == r9) goto L_0x008c
            if (r4 == r5) goto L_0x0089
            int r4 = r15.leftMargin
            int r4 = r4 + r1
            goto L_0x0097
        L_0x0089:
            int r4 = r11 - r13
            goto L_0x0094
        L_0x008c:
            int r4 = r10 - r13
            r8 = 2
            int r4 = r4 / r8
            int r4 = r4 + r1
            int r8 = r15.leftMargin
            int r4 = r4 + r8
        L_0x0094:
            int r8 = r15.rightMargin
            int r4 = r4 - r8
        L_0x0097:
            boolean r8 = r0.m(r7)
            if (r8 == 0) goto L_0x00a0
            int r8 = r0.n
            int r2 = r2 + r8
        L_0x00a0:
            int r8 = r15.topMargin
            int r2 = r2 + r8
            int r8 = r23.k()
            int r8 = r8 + r2
            int r13 = r13 + r4
            int r5 = r14 + r8
            r3.layout(r4, r8, r13, r5)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r3 = r23.l()
            int r3 = r3 + r14
            int r3 = r3 + r2
            int r2 = r23.j()
            int r2 = r2 + r7
            r7 = r2
        L_0x00bd:
            r2 = r3
        L_0x00be:
            int r7 = r7 + r9
            r4 = 8
            r5 = 5
            r8 = 2
            goto L_0x004e
        L_0x00c4:
            boolean r1 = e.b.h.d1.b(r23)
            int r4 = r23.getPaddingTop()
            int r5 = r28 - r26
            int r8 = r23.getPaddingBottom()
            int r8 = r5 - r8
            int r5 = r5 - r4
            int r10 = r23.getPaddingBottom()
            int r5 = r5 - r10
            int r10 = r23.getVirtualChildCount()
            int r11 = r0.f1148f
            r6 = r6 & r11
            r11 = r11 & 112(0x70, float:1.57E-43)
            boolean r12 = r0.b
            int[] r13 = r0.f1152j
            int[] r14 = r0.f1153k
            java.util.WeakHashMap<android.view.View, java.lang.String> r15 = e.e.j.q.a
            int r15 = r23.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r15)
            if (r6 == r9) goto L_0x0109
            r15 = 5
            if (r6 == r15) goto L_0x00fd
            int r6 = r23.getPaddingLeft()
            goto L_0x0115
        L_0x00fd:
            int r6 = r23.getPaddingLeft()
            int r6 = r6 + r27
            int r6 = r6 - r25
            int r15 = r0.f1149g
            int r6 = r6 - r15
            goto L_0x0115
        L_0x0109:
            int r6 = r23.getPaddingLeft()
            int r15 = r27 - r25
            int r7 = r0.f1149g
            int r15 = r15 - r7
            r7 = 2
            int r15 = r15 / r7
            int r6 = r6 + r15
        L_0x0115:
            if (r1 == 0) goto L_0x011e
            int r1 = r10 + -1
            r16 = r1
            r1 = 0
            r15 = -1
            goto L_0x0122
        L_0x011e:
            r1 = 0
            r15 = 1
            r16 = 0
        L_0x0122:
            if (r1 >= r10) goto L_0x01e9
            int r17 = r15 * r1
            int r9 = r17 + r16
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x013d
            int r2 = r23.o()
            int r2 = r2 + r6
            r6 = r2
        L_0x0134:
            r26 = r10
            r28 = r11
            r20 = r12
        L_0x013a:
            r2 = 1
            goto L_0x01db
        L_0x013d:
            int r3 = r2.getVisibility()
            r7 = 8
            if (r3 == r7) goto L_0x0134
            int r3 = r2.getMeasuredWidth()
            int r19 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r2.getLayoutParams()
            r7 = r20
            e.b.h.i0$a r7 = (e.b.h.i0.a) r7
            r26 = r10
            if (r12 == 0) goto L_0x0165
            int r10 = r7.height
            r28 = r11
            r11 = -1
            if (r10 == r11) goto L_0x0167
            int r11 = r2.getBaseline()
            goto L_0x0168
        L_0x0165:
            r28 = r11
        L_0x0167:
            r11 = -1
        L_0x0168:
            int r10 = r7.gravity
            if (r10 >= 0) goto L_0x016e
            r10 = r28
        L_0x016e:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r10 == r12) goto L_0x01a6
            r12 = 48
            if (r10 == r12) goto L_0x0197
            r12 = 80
            if (r10 == r12) goto L_0x0181
            r10 = r4
            r12 = -1
            goto L_0x01b2
        L_0x0181:
            int r10 = r8 - r19
            int r12 = r7.bottomMargin
            int r10 = r10 - r12
            r12 = -1
            if (r11 == r12) goto L_0x01b2
            int r21 = r2.getMeasuredHeight()
            int r21 = r21 - r11
            r11 = 2
            r22 = r14[r11]
            int r22 = r22 - r21
            int r10 = r10 - r22
            goto L_0x01b2
        L_0x0197:
            r12 = -1
            int r10 = r7.topMargin
            int r10 = r10 + r4
            if (r11 == r12) goto L_0x01b2
            r18 = 1
            r21 = r13[r18]
            int r21 = r21 - r11
            int r10 = r21 + r10
            goto L_0x01b2
        L_0x01a6:
            r12 = -1
            int r10 = r5 - r19
            r11 = 2
            int r10 = r10 / r11
            int r10 = r10 + r4
            int r11 = r7.topMargin
            int r10 = r10 + r11
            int r11 = r7.bottomMargin
            int r10 = r10 - r11
        L_0x01b2:
            boolean r9 = r0.m(r9)
            if (r9 == 0) goto L_0x01bb
            int r9 = r0.f1155m
            int r6 = r6 + r9
        L_0x01bb:
            int r9 = r7.leftMargin
            int r6 = r6 + r9
            int r9 = r23.k()
            int r9 = r9 + r6
            int r11 = r3 + r9
            int r12 = r19 + r10
            r2.layout(r9, r10, r11, r12)
            int r2 = r7.rightMargin
            int r3 = r3 + r2
            int r2 = r23.l()
            int r2 = r2 + r3
            int r6 = r6 + r2
            int r2 = r23.j()
            int r2 = r2 + r1
            r1 = r2
            goto L_0x013a
        L_0x01db:
            int r1 = r1 + r2
            r10 = r26
            r11 = r28
            r12 = r20
            r2 = 80
            r3 = 16
            r9 = 1
            goto L_0x0122
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.i0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c8, code lost:
        if (r13 < 0) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x075a, code lost:
        if (r7 < 0) goto L_0x075c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07e8  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0854  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f1147e
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x03a4
            r6.f1149g = r4
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.c
            boolean r9 = r6.f1151i
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x0186
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x004c
            int r4 = r6.f1149g
            int r26 = r38.o()
            int r4 = r26 + r4
            r6.f1149g = r4
            goto L_0x0057
        L_0x004c:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0063
            int r4 = r38.j()
            int r14 = r14 + r4
        L_0x0057:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r20
            r27 = 1
            goto L_0x0170
        L_0x0063:
            boolean r4 = r6.m(r14)
            if (r4 == 0) goto L_0x0070
            int r4 = r6.f1149g
            int r5 = r6.n
            int r4 = r4 + r5
            r6.f1149g = r4
        L_0x0070:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            e.b.h.i0$a r5 = (e.b.h.i0.a) r5
            float r4 = r5.weight
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x009f
            int r12 = r5.height
            if (r12 != 0) goto L_0x009f
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x009f
            int r4 = r6.f1149g
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f1149g = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00f5
        L_0x009f:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00ab
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ab
            r5.height = r10
            r12 = 0
            goto L_0x00ad
        L_0x00ab:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ad:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00b6
            int r15 = r6.f1149g
            r10 = r0
            goto L_0x00b8
        L_0x00b6:
            r10 = r0
            r15 = 0
        L_0x00b8:
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r4 = r40
            r13 = r5
            r27 = 1
            r5 = r15
            r0.n(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00d2
            r13.height = r12
        L_0x00d2:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f1149g
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r3 = r38.l()
            int r3 = r3 + r2
            int r1 = java.lang.Math.max(r1, r3)
            r6.f1149g = r1
            r4 = r18
            if (r9 == 0) goto L_0x00f3
            int r18 = java.lang.Math.max(r0, r4)
        L_0x00f3:
            r5 = r22
        L_0x00f5:
            if (r10 < 0) goto L_0x00ff
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00ff
            int r0 = r6.f1149g
            r6.f1146d = r0
        L_0x00ff:
            if (r14 >= r10) goto L_0x0111
            float r0 = r13.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            goto L_0x0111
        L_0x0109:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0111:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0120
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0120
            r1 = 1
            r25 = 1
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r20
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r23
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L_0x0144
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x0144
            r11 = 1
            goto L_0x0145
        L_0x0144:
            r11 = 0
        L_0x0145:
            float r13 = r13.weight
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0157
            if (r1 == 0) goto L_0x014f
            goto L_0x0150
        L_0x014f:
            r2 = r3
        L_0x0150:
            r13 = r17
            int r17 = java.lang.Math.max(r13, r2)
            goto L_0x0165
        L_0x0157:
            r13 = r17
            if (r1 == 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r2 = r3
        L_0x015d:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r17 = r13
        L_0x0165:
            int r1 = r38.j()
            int r14 = r14 + r1
            r22 = r5
            r24 = r11
            r23 = r12
        L_0x0170:
            int r14 = r14 + 1
            r2 = r0
            r20 = r4
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x0186:
            r29 = r1
            r0 = r2
            r31 = r3
            r13 = r17
            r4 = r18
            r1 = r19
            r12 = r20
            r15 = r23
            r27 = 1
            int r2 = r6.f1149g
            r10 = r31
            if (r2 <= 0) goto L_0x01aa
            boolean r2 = r6.m(r10)
            if (r2 == 0) goto L_0x01aa
            int r2 = r6.f1149g
            int r3 = r6.n
            int r2 = r2 + r3
            r6.f1149g = r2
        L_0x01aa:
            r2 = r29
            if (r9 == 0) goto L_0x01fa
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01b4
            if (r2 != 0) goto L_0x01fa
        L_0x01b4:
            r11 = 0
            r6.f1149g = r11
            r3 = 0
        L_0x01b8:
            if (r3 >= r10) goto L_0x01fa
            android.view.View r5 = r6.getChildAt(r3)
            if (r5 != 0) goto L_0x01ca
            int r5 = r6.f1149g
            int r14 = r38.o()
            int r14 = r14 + r5
            r6.f1149g = r14
            goto L_0x01f6
        L_0x01ca:
            int r14 = r5.getVisibility()
            r11 = 8
            if (r14 != r11) goto L_0x01d8
            int r5 = r38.j()
            int r3 = r3 + r5
            goto L_0x01f6
        L_0x01d8:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            e.b.h.i0$a r5 = (e.b.h.i0.a) r5
            int r11 = r6.f1149g
            int r18 = r11 + r4
            int r14 = r5.topMargin
            int r18 = r18 + r14
            int r5 = r5.bottomMargin
            int r18 = r18 + r5
            int r5 = r38.l()
            int r5 = r5 + r18
            int r5 = java.lang.Math.max(r11, r5)
            r6.f1149g = r5
        L_0x01f6:
            int r3 = r3 + 1
            r11 = 0
            goto L_0x01b8
        L_0x01fa:
            int r3 = r6.f1149g
            int r5 = r38.getPaddingTop()
            int r11 = r38.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.f1149g = r11
            int r3 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.f1149g
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x0267
            if (r5 == 0) goto L_0x0226
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0226
            goto L_0x0267
        L_0x0226:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x0263
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x0263
            r2 = 0
        L_0x0231:
            if (r2 >= r10) goto L_0x0263
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x0260
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0242
            goto L_0x0260
        L_0x0242:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            e.b.h.i0$a r9 = (e.b.h.i0.a) r9
            float r9 = r9.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0260
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x0260:
            int r2 = r2 + 1
            goto L_0x0231
        L_0x0263:
            r20 = r12
            goto L_0x0344
        L_0x0267:
            float r4 = r6.f1150h
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0270
            r21 = r4
        L_0x0270:
            r4 = 0
            r6.f1149g = r4
            r4 = 0
        L_0x0274:
            if (r4 >= r10) goto L_0x0334
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0286
            r29 = r2
            goto L_0x032e
        L_0x0286:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            e.b.h.i0$a r11 = (e.b.h.i0.a) r11
            float r13 = r11.weight
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02e0
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02c3
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02bf
            goto L_0x02c3
        L_0x02bf:
            if (r14 <= 0) goto L_0x02ca
            r13 = r14
            goto L_0x02cb
        L_0x02c3:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r14
            if (r13 >= 0) goto L_0x02cb
        L_0x02ca:
            r13 = 0
        L_0x02cb:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r9.measure(r5, r13)
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02e0:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02fd
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x0300
            r2 = 1
            goto L_0x0301
        L_0x02fd:
            r16 = r5
            r5 = -1
        L_0x0300:
            r2 = 0
        L_0x0301:
            if (r2 == 0) goto L_0x0304
            goto L_0x0305
        L_0x0304:
            r13 = r14
        L_0x0305:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L_0x0311
            int r2 = r11.width
            if (r2 != r5) goto L_0x0311
            r5 = 1
            goto L_0x0312
        L_0x0311:
            r5 = 0
        L_0x0312:
            int r2 = r6.f1149g
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            int r11 = r38.l()
            int r11 = r11 + r9
            int r2 = java.lang.Math.max(r2, r11)
            r6.f1149g = r2
            r24 = r5
            r5 = r16
        L_0x032e:
            int r4 = r4 + 1
            r2 = r29
            goto L_0x0274
        L_0x0334:
            int r2 = r6.f1149g
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.f1149g = r5
            goto L_0x0263
        L_0x0344:
            if (r24 != 0) goto L_0x034b
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x034b
            goto L_0x034d
        L_0x034b:
            r1 = r20
        L_0x034d:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r25 == 0) goto L_0x08ed
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0373:
            if (r9 >= r10) goto L_0x08ed
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x03a1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            e.b.h.i0$a r11 = (e.b.h.i0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x03a1
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x03a1:
            int r9 = r9 + 1
            goto L_0x0373
        L_0x03a4:
            r27 = 1
            r0 = 0
            r6.f1149g = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f1152j
            r12 = 4
            if (r0 == 0) goto L_0x03be
            int[] r0 = r6.f1153k
            if (r0 != 0) goto L_0x03c6
        L_0x03be:
            int[] r0 = new int[r12]
            r6.f1152j = r0
            int[] r0 = new int[r12]
            r6.f1153k = r0
        L_0x03c6:
            int[] r13 = r6.f1152j
            int[] r14 = r6.f1153k
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.b
            boolean r4 = r6.f1151i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03ea
            r18 = 1
            goto L_0x03ec
        L_0x03ea:
            r18 = 0
        L_0x03ec:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L_0x03f9:
            if (r3 >= r9) goto L_0x05ae
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x0410
            int r7 = r6.f1149g
            int r25 = r38.o()
            int r7 = r25 + r7
            r6.f1149g = r7
            r25 = r0
            r26 = r2
            goto L_0x0421
        L_0x0410:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x042b
            int r0 = r38.j()
            int r3 = r3 + r0
        L_0x0421:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x05a4
        L_0x042b:
            boolean r0 = r6.m(r3)
            if (r0 == 0) goto L_0x0438
            int r0 = r6.f1149g
            int r2 = r6.f1155m
            int r0 = r0 + r2
            r6.f1149g = r0
        L_0x0438:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            e.b.h.i0$a r2 = (e.b.h.i0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0496
            int r1 = r2.width
            if (r1 != 0) goto L_0x0496
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x0496
            if (r18 == 0) goto L_0x045f
            int r0 = r6.f1149g
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f1149g = r1
            goto L_0x046f
        L_0x045f:
            r30 = r3
            int r0 = r6.f1149g
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1149g = r0
        L_0x046f:
            if (r5 == 0) goto L_0x0486
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x0511
        L_0x0486:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = 1
            goto L_0x0515
        L_0x0496:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x04a6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a7
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x04a9
        L_0x04a6:
            r1 = 0
        L_0x04a7:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04a9:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04b2
            int r0 = r6.f1149g
            r31 = r0
            goto L_0x04b4
        L_0x04b2:
            r31 = 0
        L_0x04b4:
            r32 = 0
            r1 = r25
            r0 = r38
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r39
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r32
            r0.n(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04df
            r1 = r35
            r1.width = r0
            goto L_0x04e1
        L_0x04df:
            r1 = r35
        L_0x04e1:
            int r0 = r7.getMeasuredWidth()
            int r2 = r6.f1149g
            if (r18 == 0) goto L_0x04f8
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.l()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f1149g = r4
            goto L_0x050b
        L_0x04f8:
            int r3 = r2 + r0
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.l()
            int r4 = r4 + r3
            int r2 = java.lang.Math.max(r2, r4)
            r6.f1149g = r2
        L_0x050b:
            if (r26 == 0) goto L_0x0511
            int r8 = java.lang.Math.max(r0, r8)
        L_0x0511:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0515:
            if (r11 == r0) goto L_0x0520
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0520
            r0 = 1
            r24 = 1
            goto L_0x0521
        L_0x0520:
            r0 = 0
        L_0x0521:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L_0x0563
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x0563
            int r12 = r1.gravity
            if (r12 >= 0) goto L_0x0542
            int r12 = r6.f1148f
        L_0x0542:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x0565
        L_0x0563:
            r22 = r2
        L_0x0565:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x0572
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x0572
            r7 = 1
            goto L_0x0573
        L_0x0572:
            r7 = 0
        L_0x0573:
            float r1 = r1.weight
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0585
            if (r0 == 0) goto L_0x057e
            r3 = r22
        L_0x057e:
            r1 = r33
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x0594
        L_0x0585:
            r1 = r33
            if (r0 == 0) goto L_0x058b
            r3 = r22
        L_0x058b:
            r0 = r34
            int r0 = java.lang.Math.max(r0, r3)
            r34 = r0
            r0 = r1
        L_0x0594:
            int r1 = r38.j()
            int r3 = r1 + r25
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
            r2 = r34
        L_0x05a4:
            int r3 = r3 + 1
            r7 = r39
            r4 = r26
            r5 = r30
            goto L_0x03f9
        L_0x05ae:
            r26 = r4
            r30 = r5
            r37 = r2
            r2 = r0
            r0 = r37
            int r3 = r6.f1149g
            if (r3 <= 0) goto L_0x05c8
            boolean r3 = r6.m(r9)
            if (r3 == 0) goto L_0x05c8
            int r3 = r6.f1149g
            int r4 = r6.f1155m
            int r3 = r3 + r4
            r6.f1149g = r3
        L_0x05c8:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05df
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05df
            r3 = r13[r17]
            if (r3 != r4) goto L_0x05df
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05dc
            goto L_0x05e0
        L_0x05dc:
            r25 = r12
            goto L_0x0612
        L_0x05df:
            r3 = 3
        L_0x05e0:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r17]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r17]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x0612:
            if (r26 == 0) goto L_0x066b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x061a
            if (r10 != 0) goto L_0x066b
        L_0x061a:
            r3 = 0
            r6.f1149g = r3
            r4 = 0
        L_0x061e:
            if (r4 >= r9) goto L_0x066b
            android.view.View r3 = r6.getChildAt(r4)
            if (r3 != 0) goto L_0x0630
            int r3 = r6.f1149g
            int r5 = r38.o()
            int r5 = r5 + r3
            r6.f1149g = r5
            goto L_0x0668
        L_0x0630:
            int r5 = r3.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x063e
            int r3 = r38.j()
            int r4 = r4 + r3
            goto L_0x0668
        L_0x063e:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            e.b.h.i0$a r3 = (e.b.h.i0.a) r3
            int r5 = r6.f1149g
            if (r18 == 0) goto L_0x0655
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.l()
            int r3 = r3 + r7
            int r3 = r3 + r5
            goto L_0x0666
        L_0x0655:
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.l()
            int r3 = r3 + r7
            int r3 = java.lang.Math.max(r5, r3)
        L_0x0666:
            r6.f1149g = r3
        L_0x0668:
            int r4 = r4 + 1
            goto L_0x061e
        L_0x066b:
            int r3 = r6.f1149g
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f1149g = r5
            int r3 = r38.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r39
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f1149g
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06df
            if (r4 == 0) goto L_0x0699
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0699
            goto L_0x06df
        L_0x0699:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06d6
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06d6
            r4 = 0
        L_0x06a4:
            if (r4 >= r9) goto L_0x06d6
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06d3
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x06b5
            goto L_0x06d3
        L_0x06b5:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            e.b.h.i0$a r2 = (e.b.h.i0.a) r2
            float r2 = r2.weight
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06d3
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06d3:
            int r4 = r4 + 1
            goto L_0x06a4
        L_0x06d6:
            r8 = r40
            r22 = r9
            r12 = r25
        L_0x06dc:
            r5 = 0
            goto L_0x0884
        L_0x06df:
            float r2 = r6.f1150h
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x06e7
            r1 = r2
        L_0x06e7:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r17] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r17] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.f1149g = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x0701:
            if (r4 >= r9) goto L_0x082b
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x0817
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x0713
            goto L_0x0817
        L_0x0713:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            e.b.h.i0$a r5 = (e.b.h.i0.a) r5
            float r7 = r5.weight
            r20 = 0
            int r22 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0776
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r38.getPaddingTop()
            int r25 = r38.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0755
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0751
            goto L_0x0755
        L_0x0751:
            if (r9 <= 0) goto L_0x075c
            r7 = r9
            goto L_0x075d
        L_0x0755:
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x075d
        L_0x075c:
            r7 = 0
        L_0x075d:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r15.measure(r7, r1)
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x077b
        L_0x0776:
            r7 = r8
            r22 = r9
            r8 = r40
        L_0x077b:
            if (r18 == 0) goto L_0x0797
            int r9 = r6.f1149g
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r38.l()
            int r1 = r1 + r25
            int r1 = r1 + r9
            r25 = r7
            goto L_0x07b1
        L_0x0797:
            r26 = r1
            int r1 = r6.f1149g
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r7 = r38.l()
            int r7 = r7 + r9
            int r1 = java.lang.Math.max(r1, r7)
        L_0x07b1:
            r6.f1149g = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x07be
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07be
            r1 = 1
            goto L_0x07bf
        L_0x07be:
            r1 = 0
        L_0x07bf:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07d0
            goto L_0x07d1
        L_0x07d0:
            r7 = r9
        L_0x07d1:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x07de
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07df
            r1 = 1
            goto L_0x07e0
        L_0x07de:
            r7 = -1
        L_0x07df:
            r1 = 0
        L_0x07e0:
            if (r30 == 0) goto L_0x080c
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x080c
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x07ee
            int r5 = r6.f1148f
        L_0x07ee:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x0810
        L_0x080c:
            r21 = 4
            r28 = -2
        L_0x0810:
            r23 = r1
            r7 = r25
            r1 = r26
            goto L_0x0822
        L_0x0817:
            r7 = r8
            r22 = r9
            r20 = 0
            r21 = 4
            r28 = -2
            r8 = r40
        L_0x0822:
            int r4 = r4 + 1
            r8 = r7
            r9 = r22
            r7 = r39
            goto L_0x0701
        L_0x082b:
            r8 = r40
            r22 = r9
            int r1 = r6.f1149g
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.f1149g = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x0854
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x0854
            r1 = r13[r17]
            if (r1 != r4) goto L_0x0854
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0851
            goto L_0x0855
        L_0x0851:
            r15 = r2
            goto L_0x06dc
        L_0x0854:
            r1 = 3
        L_0x0855:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x0884:
            if (r23 != 0) goto L_0x088b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x088b
            goto L_0x088c
        L_0x088b:
            r0 = r15
        L_0x088c:
            int r1 = r38.getPaddingTop()
            int r2 = r38.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08ed
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
            r8 = 0
        L_0x08ba:
            if (r8 >= r9) goto L_0x08ed
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08e9
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            e.b.h.i0$a r11 = (e.b.h.i0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08ea
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08ea
        L_0x08e9:
            r12 = -1
        L_0x08ea:
            int r8 = r8 + 1
            goto L_0x08ba
        L_0x08ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.i0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder i3 = g.a.a.a.a.i("base aligned child index out of range (0, ");
            i3.append(getChildCount());
            i3.append(")");
            throw new IllegalArgumentException(i3.toString());
        }
        this.c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1154l) {
            this.f1154l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1155m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.f1155m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f1148f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1148f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1148f;
        if ((8388615 & i4) != i3) {
            this.f1148f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1151i = z;
    }

    public void setOrientation(int i2) {
        if (this.f1147e != i2) {
            this.f1147e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1148f;
        if ((i4 & 112) != i3) {
            this.f1148f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1150h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
