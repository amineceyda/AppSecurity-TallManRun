package i.m.j.a;

import i.m.d;
import i.m.f;
import i.m.h;

public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.c() == h.b)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public f c() {
        return h.b;
    }
}
