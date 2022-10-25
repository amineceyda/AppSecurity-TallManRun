package i.m.j.a;

import i.m.d;
import i.m.e;
import i.m.f;
import i.o.c.h;

public abstract class c extends a {
    private final f _context;
    public transient d<Object> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        super(dVar);
        f c = dVar != null ? dVar.c() : null;
        this._context = c;
    }

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this._context = fVar;
    }

    public f c() {
        f fVar = this._context;
        h.c(fVar);
        return fVar;
    }

    public void m() {
        d<Object> dVar = this.b;
        if (!(dVar == null || dVar == this)) {
            f fVar = this._context;
            h.c(fVar);
            int i2 = e.N;
            f.a aVar = fVar.get(e.a.a);
            h.c(aVar);
            ((e) aVar).b(dVar);
        }
        this.b = b.b;
    }

    public final d<Object> n() {
        d<Object> dVar = this.b;
        if (dVar == null) {
            f fVar = this._context;
            h.c(fVar);
            int i2 = e.N;
            e eVar = (e) fVar.get(e.a.a);
            if (eVar == null || (dVar = eVar.d(this)) == null) {
                dVar = this;
            }
            this.b = dVar;
        }
        return dVar;
    }
}
