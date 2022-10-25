package l;

public abstract class k implements y {
    public final y b;

    public k(y yVar) {
        if (yVar != null) {
            this.b = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public z i() {
        return this.b.i();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.b.toString() + ")";
    }
}
