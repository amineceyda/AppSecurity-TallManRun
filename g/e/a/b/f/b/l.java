package g.e.a.b.f.b;

public final class l implements Runnable {
    public final /* synthetic */ j5 b;
    public final /* synthetic */ m c;

    public l(m mVar, j5 j5Var) {
        this.c = mVar;
        this.b = j5Var;
    }

    public final void run() {
        this.b.f();
        if (b.a()) {
            this.b.b().r(this);
            return;
        }
        boolean z = this.c.c != 0;
        this.c.c = 0;
        if (z) {
            this.c.b();
        }
    }
}
