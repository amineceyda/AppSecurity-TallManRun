package g.c.b.a.g.c;

import i.o.c.h;
import java.io.IOException;
import java.util.logging.Logger;
import k.b0;
import k.t;
import l.f;
import l.m;
import l.q;
import l.s;

public final class a extends b0 {
    public final /* synthetic */ b0 a;

    public a(b0 b0Var) {
        this.a = b0Var;
    }

    public long a() {
        return -1;
    }

    public t b() {
        b0 b0Var = this.a;
        h.c(b0Var);
        return b0Var.b();
    }

    public void e(f fVar) throws IOException {
        h.e(fVar, "sink");
        m mVar = new m(fVar);
        Logger logger = q.a;
        s sVar = new s(mVar);
        b0 b0Var = this.a;
        h.c(b0Var);
        b0Var.e(sVar);
        sVar.close();
    }
}
