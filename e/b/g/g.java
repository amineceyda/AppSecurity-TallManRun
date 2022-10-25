package e.b.g;

import android.view.View;
import android.view.animation.Interpolator;
import e.e.j.t;
import e.e.j.u;
import e.e.j.v;
import java.util.ArrayList;
import java.util.Iterator;

public class g {
    public final ArrayList<t> a = new ArrayList<>();
    public long b = -1;
    public Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    public u f1005d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1006e;

    /* renamed from: f  reason: collision with root package name */
    public final v f1007f = new a();

    public class a extends v {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        public void b(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == g.this.a.size()) {
                u uVar = g.this.f1005d;
                if (uVar != null) {
                    uVar.b((View) null);
                }
                this.b = 0;
                this.a = false;
                g.this.f1006e = false;
            }
        }

        public void c(View view) {
            if (!this.a) {
                this.a = true;
                u uVar = g.this.f1005d;
                if (uVar != null) {
                    uVar.c((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.f1006e) {
            Iterator<t> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1006e = false;
        }
    }

    public void b() {
        View view;
        if (!this.f1006e) {
            Iterator<t> it = this.a.iterator();
            while (it.hasNext()) {
                t next = it.next();
                long j2 = this.b;
                if (j2 >= 0) {
                    next.c(j2);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) next.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f1005d != null) {
                    next.d(this.f1007f);
                }
                View view2 = (View) next.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f1006e = true;
        }
    }
}
