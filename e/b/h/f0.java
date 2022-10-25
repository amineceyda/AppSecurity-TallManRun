package e.b.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import e.e.k.c;
import java.lang.reflect.Field;

public class f0 extends ListView {
    public final Rect b = new Rect();
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1123d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1124e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1125f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1126g;

    /* renamed from: h  reason: collision with root package name */
    public Field f1127h;

    /* renamed from: i  reason: collision with root package name */
    public a f1128i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1129j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1130k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1131l;

    /* renamed from: m  reason: collision with root package name */
    public c f1132m;
    public b n;

    public static class a extends e.b.e.a.c {
        public boolean c = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.c) {
                this.b.draw(canvas);
            }
        }

        public void setHotspot(float f2, float f3) {
            if (this.c) {
                e.e.d.l.a.w0(this.b, f2, f3);
            }
        }

        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.c) {
                e.e.d.l.a.x0(this.b, i2, i3, i4, i5);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.c) {
                return this.b.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) {
        super(context, (AttributeSet) null, 2130968963);
        this.f1130k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1127h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1128i;
        if (aVar != null) {
            aVar.c = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x001d
            goto L_0x0129
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x012a
        L_0x0020:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            goto L_0x012b
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1131l = r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r0 < r11) goto L_0x004a
            r1.drawableHotspotChanged(r7, r6)
        L_0x004a:
            boolean r12 = r16.isPressed()
            if (r12 != 0) goto L_0x0053
            r1.setPressed(r5)
        L_0x0053:
            r16.layoutChildren()
            int r12 = r1.f1126g
            if (r12 == r9) goto L_0x0070
            int r13 = r16.getFirstVisiblePosition()
            int r12 = r12 - r13
            android.view.View r12 = r1.getChildAt(r12)
            if (r12 == 0) goto L_0x0070
            if (r12 == r10) goto L_0x0070
            boolean r13 = r12.isPressed()
            if (r13 == 0) goto L_0x0070
            r12.setPressed(r4)
        L_0x0070:
            r1.f1126g = r8
            int r12 = r10.getLeft()
            float r12 = (float) r12
            float r12 = r7 - r12
            int r13 = r10.getTop()
            float r13 = (float) r13
            float r13 = r6 - r13
            if (r0 < r11) goto L_0x0085
            r10.drawableHotspotChanged(r12, r13)
        L_0x0085:
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008e
            r10.setPressed(r5)
        L_0x008e:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0098
            if (r8 == r9) goto L_0x0098
            r12 = 1
            goto L_0x0099
        L_0x0098:
            r12 = 0
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r11.setVisible(r4, r4)
        L_0x009e:
            android.graphics.Rect r0 = r1.b
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.c
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f1123d
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f1124e
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f1125f
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f1127h     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.f1127h     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r0 != 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            if (r12 == 0) goto L_0x010e
            android.graphics.Rect r0 = r1.b
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0107
            r12 = 1
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            r11.setVisible(r12, r4)
            e.e.d.l.a.w0(r11, r5, r0)
        L_0x010e:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0119
            if (r8 == r9) goto L_0x0119
            e.e.d.l.a.w0(r0, r7, r6)
        L_0x0119:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L_0x0129
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0129:
            r0 = 1
        L_0x012a:
            r5 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x012f
            if (r5 == 0) goto L_0x0147
        L_0x012f:
            r1.f1131l = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f1126g
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0147
            r3.setPressed(r4)
        L_0x0147:
            if (r0 == 0) goto L_0x015f
            e.e.k.c r3 = r1.f1132m
            if (r3 != 0) goto L_0x0154
            e.e.k.c r3 = new e.e.k.c
            r3.<init>(r1)
            r1.f1132m = r3
        L_0x0154:
            e.e.k.c r3 = r1.f1132m
            boolean r4 = r3.q
            r5 = 1
            r3.q = r5
            r3.onTouch(r1, r2)
            goto L_0x016c
        L_0x015f:
            e.e.k.c r2 = r1.f1132m
            if (r2 == 0) goto L_0x016c
            boolean r3 = r2.q
            if (r3 == 0) goto L_0x016a
            r2.d()
        L_0x016a:
            r2.q = r4
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.f0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1131l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.f1130k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1130k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1130k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1130k && this.f1129j) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            b bVar = new b();
            this.n = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1126g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.n;
        if (bVar != null) {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1129j = z;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1128i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.c = rect.left;
        this.f1123d = rect.top;
        this.f1124e = rect.right;
        this.f1125f = rect.bottom;
    }
}
