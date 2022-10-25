package e.h.b;

import android.view.View;
import e.e.j.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class m0 implements Runnable {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Map c;

    public m0(l0 l0Var, ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.c = map;
    }

    public void run() {
        String str;
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.b.get(i2);
            String h2 = q.h(view);
            if (h2 != null) {
                Iterator it = this.c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (h2.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                q.p(view, str);
            }
        }
    }
}
