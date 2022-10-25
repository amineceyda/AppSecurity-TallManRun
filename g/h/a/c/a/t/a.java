package g.h.a.c.a.t;

import android.view.View;
import android.view.ViewGroup;
import g.h.a.c.a.r.c;
import i.o.c.h;
import java.util.HashSet;
import java.util.Set;

public final class a {
    public final View a;
    public boolean b;
    public final Set<c> c = new HashSet();

    public a(View view) {
        h.e(view, "targetView");
        this.a = view;
    }

    public final boolean a(c cVar) {
        h.e(cVar, "fullScreenListener");
        return this.c.add(cVar);
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.a.setLayoutParams(layoutParams);
            for (c i2 : this.c) {
                i2.i();
            }
        }
    }

    public final void c() {
        if (this.b) {
            this.b = false;
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.a.setLayoutParams(layoutParams);
            for (c c2 : this.c) {
                c2.c();
            }
        }
    }
}
