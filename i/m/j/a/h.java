package i.m.j.a;

import i.m.d;
import i.o.c.g;
import i.o.c.p;

public abstract class h extends c implements g<Object> {
    private final int arity;

    public h(int i2, d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }

    public int b() {
        return this.arity;
    }

    public String toString() {
        if (j() != null) {
            return super.toString();
        }
        String b = p.a.b(this);
        i.o.c.h.d(b, "Reflection.renderLambdaToString(this)");
        return b;
    }
}
