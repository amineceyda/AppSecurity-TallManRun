package g.c.b.b.i.e;

import g.c.b.b.i.d;
import i.o.c.h;
import java.util.Objects;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ k b;

    public /* synthetic */ c(k kVar) {
        this.b = kVar;
    }

    public final void run() {
        k kVar = this.b;
        h.e(kVar, "this$0");
        d.b bVar = (d.b) kVar.f2269e.getValue();
        Objects.requireNonNull(bVar);
        try {
            if (d.b) {
                bVar.a.unregisterReceiver(bVar);
                d.b = false;
            }
        } catch (Exception unused) {
        }
    }
}
