package g.i.c.a.a.i.e;

import android.widget.AbsListView;
import g.i.c.a.a.i.d;

public class e implements c {
    public AbsListView a;
    public int b;

    public void a(d dVar) {
        dVar.d(this.a, this.b);
    }

    public int b() {
        return 1;
    }

    public void c() {
        this.a = null;
    }

    public void d(AbsListView absListView, int i2) {
        this.a = absListView;
        this.b = i2;
    }
}
