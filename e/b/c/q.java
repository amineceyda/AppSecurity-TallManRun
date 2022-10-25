package e.b.c;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import e.e.j.u;
import e.e.j.v;

public class q extends v {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public q(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public void b(View view) {
        this.a.p.setAlpha(1.0f);
        this.a.s.d((u) null);
        this.a.s = null;
    }

    public void c(View view) {
        this.a.p.setVisibility(0);
        this.a.p.sendAccessibilityEvent(32);
        if (this.a.p.getParent() instanceof View) {
            e.e.j.q.l((View) this.a.p.getParent());
        }
    }
}
