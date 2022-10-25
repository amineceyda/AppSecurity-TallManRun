package g.e.a.b.f.b;

public abstract class i5 extends h5 {
    public boolean b;

    public i5(n4 n4Var) {
        super(n4Var);
        this.a.E++;
    }

    public void i() {
    }

    public abstract boolean j();

    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            this.a.F.incrementAndGet();
            this.b = true;
        }
    }

    public final void m() {
        if (!this.b) {
            i();
            this.a.F.incrementAndGet();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean n() {
        return this.b;
    }
}
