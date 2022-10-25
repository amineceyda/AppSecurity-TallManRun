package g.d.a.l.t;

import g.d.a.l.t.a;
import java.util.Objects;

public class b implements Runnable {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    public void run() {
        a aVar = this.b;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
