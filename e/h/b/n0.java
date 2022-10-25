package e.h.b;

import android.view.View;
import e.e.j.q;
import java.util.ArrayList;
import java.util.Map;

public class n0 implements Runnable {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Map c;

    public n0(l0 l0Var, ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.c = map;
    }

    public void run() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.b.get(i2);
            q.p(view, (String) this.c.get(q.h(view)));
        }
    }
}
