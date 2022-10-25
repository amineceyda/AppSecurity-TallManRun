package g.e.b.k;

import g.e.b.q.b;
import java.util.Set;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ y b;
    public final /* synthetic */ b c;

    public /* synthetic */ f(y yVar, b bVar) {
        this.b = yVar;
        this.c = bVar;
    }

    public final void run() {
        Set set;
        Object obj;
        y yVar = this.b;
        b bVar = this.c;
        synchronized (yVar) {
            if (yVar.b == null) {
                set = yVar.a;
                obj = bVar;
            } else {
                set = yVar.b;
                obj = bVar.get();
            }
            set.add(obj);
        }
    }
}
