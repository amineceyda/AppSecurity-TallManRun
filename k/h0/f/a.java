package k.h0.f;

import java.io.IOException;
import java.util.Objects;
import k.c0;
import k.h0.g.c;
import k.h0.g.f;
import k.s;
import k.u;
import k.x;
import okhttp3.internal.connection.RouteException;

public final class a implements s {
    public final u a;

    public a(u uVar) {
        this.a = uVar;
    }

    public c0 a(s.a aVar) throws IOException {
        f fVar = (f) aVar;
        x xVar = fVar.f4764f;
        f fVar2 = fVar.b;
        boolean z = !xVar.b.equals("GET");
        u uVar = this.a;
        Objects.requireNonNull(fVar2);
        int i2 = fVar.f4767i;
        int i3 = fVar.f4768j;
        int i4 = fVar.f4769k;
        Objects.requireNonNull(uVar);
        try {
            c i5 = fVar2.e(i2, i3, i4, 0, uVar.u, z).i(uVar, aVar, fVar2);
            synchronized (fVar2.f4752d) {
                fVar2.n = i5;
            }
            return fVar.b(xVar, fVar2, i5, fVar2.b());
        } catch (IOException e2) {
            throw new RouteException(e2);
        }
    }
}
