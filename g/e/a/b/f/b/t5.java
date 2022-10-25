package g.e.a.b.f.b;

public final class t5 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q6 c;

    public t5(q6 q6Var, boolean z) {
        this.c = q6Var;
        this.b = z;
    }

    public final void run() {
        boolean g2 = this.c.a.g();
        boolean a = this.c.a.a();
        this.c.a.A = Boolean.valueOf(this.b);
        if (a == this.b) {
            this.c.a.d().n.b("Default data collection state already set to", Boolean.valueOf(this.b));
        }
        if (this.c.a.g() == g2 || this.c.a.g() != this.c.a.a()) {
            this.c.a.d().f3141k.c("Default data collection is different than actual status", Boolean.valueOf(this.b), Boolean.valueOf(g2));
        }
        this.c.E();
    }
}
