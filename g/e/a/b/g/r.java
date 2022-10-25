package g.e.a.b.g;

import java.util.Objects;

public final class r implements Runnable {
    public final /* synthetic */ f b;
    public final /* synthetic */ s c;

    public r(s sVar, f fVar) {
        this.c = sVar;
        this.b = fVar;
    }

    public final void run() {
        synchronized (this.c.b) {
            c cVar = this.c.c;
            if (cVar != null) {
                Exception g2 = this.b.g();
                Objects.requireNonNull(g2, "null reference");
                cVar.d(g2);
            }
        }
    }
}
