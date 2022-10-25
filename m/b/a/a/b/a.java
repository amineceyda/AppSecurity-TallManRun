package m.b.a.a.b;

import java.util.Objects;
import java.util.concurrent.Callable;

public class a extends Thread {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public void run() {
        b bVar = this.b;
        Objects.requireNonNull(bVar);
        try {
            if (bVar.a.b("dumponexit", true)) {
                bVar.c.b(false);
            }
            bVar.c.shutdown();
            Callable<Void> callable = bVar.f5249d;
            if (callable != null) {
                callable.call();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
