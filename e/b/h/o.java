package e.b.h;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

public class o extends PopupWindow {
    public static final boolean b = (Build.VERSION.SDK_INT < 21);
    public boolean a;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = e.b.b.r
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x001f
            boolean r4 = r3.getBoolean(r4, r0)
            boolean r5 = b
            if (r5 == 0) goto L_0x001c
            r1.a = r4
            goto L_0x001f
        L_0x001c:
            e.e.d.l.a.C0(r1, r4)
        L_0x001f:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0030
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0030
            android.graphics.drawable.Drawable r2 = e.b.d.a.a.b(r2, r4)
            goto L_0x0034
        L_0x0030:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x0034:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.o.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void showAsDropDown(View view, int i2, int i3) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    public void update(View view, int i2, int i3, int i4, int i5) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
