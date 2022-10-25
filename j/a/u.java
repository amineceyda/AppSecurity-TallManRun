package j.a;

import i.m.f;
import i.o.b.l;
import i.o.c.i;

public final class u extends i implements l<f.a, v> {
    public static final u b = new u();

    public u() {
        super(1);
    }

    public Object g(Object obj) {
        f.a aVar = (f.a) obj;
        if (!(aVar instanceof v)) {
            aVar = null;
        }
        return (v) aVar;
    }
}
