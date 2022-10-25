package g.i.c.a.a.i.e;

import android.view.View;
import android.view.ViewGroup;
import g.i.c.a.a.i.d;

public class j implements c {
    public ViewGroup a;
    public View b;
    public long c = -1;

    public void a(d dVar) {
        dVar.f(this.a, this.b, this.c);
    }

    public int b() {
        return 5;
    }

    public void c() {
        this.a = null;
        this.b = null;
        this.c = -1;
    }

    public void d(ViewGroup viewGroup, View view, long j2) {
        this.a = viewGroup;
        this.b = view;
        this.c = j2;
    }
}
