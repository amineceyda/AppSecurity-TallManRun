package g.c.a.b.a.k.j;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import g.c.a.m.k;

public class p implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ r b;

    public p(r rVar) {
        this.b = rVar;
    }

    public void onGlobalLayout() {
        this.b.f1893f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.f1895h.getLayoutParams().height = this.b.f1896i.getHeight();
        this.b.f1895h.requestLayout();
        r rVar = this.b;
        rVar.q = rVar.a.findViewById(2131298648);
        ViewGroup.LayoutParams layoutParams = this.b.q.getLayoutParams();
        if (layoutParams != null) {
            int a = k.a(this.b.a);
            layoutParams.height = a;
            int b2 = k.b(this.b.a) + a;
            layoutParams.height = b2;
            layoutParams.height = b2 - this.b.f1895h.getHeight();
            this.b.q.setLayoutParams(layoutParams);
        }
    }
}
