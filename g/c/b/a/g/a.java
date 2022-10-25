package g.c.b.a.g;

import g.c.b.a.c;
import g.c.b.a.j.b;
import i.o.c.h;
import java.io.IOException;
import k.c0;
import k.d;
import k.e;
import k.e0;

public final class a implements e {
    public final /* synthetic */ b b;
    public final /* synthetic */ b.a c;

    public a(b bVar, b.a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public void onFailure(d dVar, IOException iOException) {
        h.e(dVar, "call");
        h.e(iOException, g.d.a.j.e.u);
        b bVar = this.b;
        b.a c2 = this.c.c();
        c b2 = this.c.b();
        String message = iOException.getMessage();
        if (message == null) {
            message = "unknown error.";
        }
        bVar.a(c2, new g.c.b.a.d(b2, null, 1, h.j("Network request error. ", message)));
    }

    public void onResponse(d dVar, c0 c0Var) {
        b bVar;
        g.c.b.a.d dVar2;
        b.a aVar;
        h.e(dVar, "call");
        h.e(c0Var, "response");
        if (c0Var.b()) {
            bVar = this.b;
            aVar = this.c.c();
            c b2 = this.c.b();
            e0 e0Var = c0Var.f4692h;
            String c0Var2 = c0Var.toString();
            h.d(c0Var2, "response.toString()");
            dVar2 = new g.c.b.a.d(b2, e0Var, 0, c0Var2);
        } else {
            bVar = this.b;
            aVar = this.c.c();
            c b3 = this.c.b();
            int i2 = c0Var.f4688d;
            String c0Var3 = c0Var.toString();
            h.d(c0Var3, "response.toString()");
            dVar2 = new g.c.b.a.d(b3, null, i2, c0Var3);
        }
        bVar.a(aVar, dVar2);
    }
}
