package g.c.a.o.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class a extends ViewGroup {
    public List<List<View>> b;
    public List<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f2121d;

    /* renamed from: e  reason: collision with root package name */
    public int f2122e;

    /* renamed from: f  reason: collision with root package name */
    public List<View> f2123f;

    /* renamed from: g  reason: collision with root package name */
    public int f2124g;

    /* renamed from: h  reason: collision with root package name */
    public int f2125h;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f2121d = new ArrayList();
        this.f2123f = new ArrayList();
        this.f2124g = 0;
        this.f2125h = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.c.a.a.b);
        this.f2122e = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getDisplayMaxLines() {
        return this.f2124g;
    }

    public int getGravity() {
        return this.f2122e;
    }

    public int getMaxLines() {
        return this.f2125h;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        this.b.clear();
        this.c.clear();
        this.f2121d.clear();
        this.f2123f.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i9 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    this.c.add(Integer.valueOf(i8));
                    this.b.add(this.f2123f);
                    this.f2121d.add(Integer.valueOf(i9));
                    i8 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f2123f = new ArrayList();
                    i9 = 0;
                }
                i9 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i8 = Math.max(i8, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f2123f.add(childAt);
            }
        }
        this.c.add(Integer.valueOf(i8));
        this.f2121d.add(Integer.valueOf(i9));
        this.b.add(this.f2123f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.b.size();
        int i11 = 0;
        while (i11 < size && i11 < this.f2125h) {
            this.f2123f = this.b.get(i11);
            int intValue = this.c.get(i11).intValue();
            int intValue2 = this.f2121d.get(i11).intValue();
            int i12 = this.f2122e;
            boolean z2 = true;
            if (i12 != -1) {
                if (i12 == 0) {
                    i6 = (width - intValue2) / 2;
                } else if (i12 == 1) {
                    i6 = width - intValue2;
                }
                paddingLeft = i6 + getPaddingLeft();
            } else {
                paddingLeft = getPaddingLeft();
            }
            int i13 = 0;
            while (i13 < this.f2123f.size()) {
                View view = this.f2123f.get(i13);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (z2) {
                        marginLayoutParams2.leftMargin = i7;
                        z2 = false;
                    }
                    int i14 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i15 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i14, i15, view.getMeasuredWidth() + i14, view.getMeasuredHeight() + i15);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                i13++;
                i7 = 0;
            }
            paddingTop += intValue;
            i11++;
            i7 = 0;
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int childCount = getChildCount();
        int i6 = 0;
        this.f2124g = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                if (i6 == childCount - 1) {
                    i7 = Math.max(i8, i7);
                    i11 += i9;
                }
                int i12 = i2;
                int i13 = i3;
                i5 = size2;
            } else {
                measureChild(childAt, i2, i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i5 = size2;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i14 = i8 + measuredWidth;
                if (i14 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i10++;
                    this.f2124g++;
                    if (i10 < this.f2125h) {
                        i7 = Math.max(i7, i8);
                        i11 += i9;
                        i9 = measuredHeight;
                        i8 = measuredWidth;
                    }
                } else {
                    i9 = Math.max(i9, measuredHeight);
                    i8 = i14;
                }
                if (i6 == childCount - 1) {
                    i11 += i9;
                    i7 = Math.max(i8, i7);
                }
            }
            i6++;
            size2 = i5;
        }
        int i15 = size2;
        if (mode != 1073741824) {
            size = getPaddingLeft() + i7 + getPaddingRight();
        }
        if (mode2 == 1073741824) {
            i4 = i15;
        } else {
            i4 = getPaddingBottom() + getPaddingTop() + i11;
        }
        setMeasuredDimension(size, i4);
    }

    public void setGravity(int i2) {
        this.f2122e = i2;
    }

    public void setMaxLines(int i2) {
        this.f2125h = i2;
    }
}
