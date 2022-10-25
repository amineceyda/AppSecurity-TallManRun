package g.e.a.b.g;

public final class p implements Runnable {
    public final /* synthetic */ q b;

    public p(q qVar) {
        this.b = qVar;
    }

    public final void run() {
        synchronized (this.b.b) {
            b bVar = this.b.c;
            if (bVar != null) {
                bVar.a();
            }
        }
    }
}
