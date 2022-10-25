package g.e.a.b.g;

public final class t implements Runnable {
    public final /* synthetic */ f b;
    public final /* synthetic */ u c;

    public t(u uVar, f fVar) {
        this.c = uVar;
        this.b = fVar;
    }

    public final void run() {
        synchronized (this.c.b) {
            d<? super TResult> dVar = this.c.c;
            if (dVar != null) {
                dVar.c(this.b.h());
            }
        }
    }
}
