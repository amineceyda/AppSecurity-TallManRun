package i.q;

public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.b == cVar.b && this.c == cVar.c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    public boolean isEmpty() {
        return this.b > this.c;
    }

    public String toString() {
        return this.b + ".." + this.c;
    }
}
