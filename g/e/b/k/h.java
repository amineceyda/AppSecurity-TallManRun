package g.e.b.k;

import g.e.b.o.a;
import g.e.b.o.b;
import java.util.Map;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ a c;

    public /* synthetic */ h(Map.Entry entry, a aVar) {
        this.b = entry;
        this.c = aVar;
    }

    public final void run() {
        Map.Entry entry = this.b;
        ((b) entry.getKey()).a(this.c);
    }
}
