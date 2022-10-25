package e.b.c;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import e.e.j.q;
import e.e.j.t;
import e.e.j.u;
import e.e.j.v;

public class p implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl b;

    public class a extends v {
        public a() {
        }

        public void b(View view) {
            p.this.b.p.setAlpha(1.0f);
            p.this.b.s.d((u) null);
            p.this.b.s = null;
        }

        public void c(View view) {
            p.this.b.p.setVisibility(0);
        }
    }

    public p(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.b = appCompatDelegateImpl;
    }

    public void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.b;
        appCompatDelegateImpl.q.showAtLocation(appCompatDelegateImpl.p, 55, 0, 0);
        this.b.I();
        if (this.b.V()) {
            this.b.p.setAlpha(0.0f);
            AppCompatDelegateImpl appCompatDelegateImpl2 = this.b;
            t b2 = q.b(appCompatDelegateImpl2.p);
            b2.a(1.0f);
            appCompatDelegateImpl2.s = b2;
            t tVar = this.b.s;
            a aVar = new a();
            View view = (View) tVar.a.get();
            if (view != null) {
                tVar.e(view, aVar);
                return;
            }
            return;
        }
        this.b.p.setAlpha(1.0f);
        this.b.p.setVisibility(0);
    }
}
