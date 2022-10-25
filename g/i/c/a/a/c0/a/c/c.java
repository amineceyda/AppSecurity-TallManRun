package g.i.c.a.a.c0.a.c;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import g.h.a.a;

public class c {
    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        if (b()) {
            int i2 = rect.top;
            Resources system = Resources.getSystem();
            rect.top = i2 - system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
        }
        rect.right = view.getWidth() + rect.left;
        rect.bottom = view.getHeight() + rect.top;
        rect.top = Math.max(rect.top, 0);
        return rect;
    }

    public static boolean b() {
        Activity K = a.K();
        if (K != null) {
            if ((K.getWindow().getAttributes().flags & 1024) == 0) {
                return true;
            }
        }
        return false;
    }
}
