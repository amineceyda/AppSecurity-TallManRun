package i.o.c;

import java.io.Serializable;

public abstract class i<R> implements g<R>, Serializable {
    private final int arity;

    public i(int i2) {
        this.arity = i2;
    }

    public int b() {
        return this.arity;
    }

    public String toString() {
        String b = p.a.b(this);
        h.d(b, "Reflection.renderLambdaToString(this)");
        return b;
    }
}
