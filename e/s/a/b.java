package e.s.a;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import e.e.j.l;
import e.e.j.q;
import e.e.j.x;

public class b implements l {
    public final Rect a = new Rect();
    public final /* synthetic */ ViewPager b;

    public b(ViewPager viewPager) {
        this.b = viewPager;
    }

    public x a(View view, x xVar) {
        x i2 = q.i(view, xVar);
        if (i2.a.i()) {
            return i2;
        }
        Rect rect = this.a;
        rect.left = i2.b();
        rect.top = i2.d();
        rect.right = i2.c();
        rect.bottom = i2.a();
        int childCount = this.b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            x c = q.c(this.b.getChildAt(i3), i2);
            rect.left = Math.min(c.b(), rect.left);
            rect.top = Math.min(c.d(), rect.top);
            rect.right = Math.min(c.c(), rect.right);
            rect.bottom = Math.min(c.a(), rect.bottom);
        }
        return i2.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
