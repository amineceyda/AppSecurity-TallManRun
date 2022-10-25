package g.e.a.b.f.b;

public abstract class w3 extends y2 {
    public boolean b;

    public w3(n4 n4Var) {
        super(n4Var);
        this.a.E++;
    }

    public final void i() {
        if (!this.b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!k()) {
            this.a.F.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean k();
}
