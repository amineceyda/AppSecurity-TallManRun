package g.e.a.b.f.b;

public abstract class b9 extends a9 {
    public boolean c;

    public b9(k9 k9Var) {
        super(k9Var);
        this.b.q++;
    }

    public final void i() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.c) {
            k();
            this.b.r++;
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean k();
}
