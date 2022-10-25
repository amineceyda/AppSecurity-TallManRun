package g.e.b.l.j;

import g.e.b.k.z;
import g.e.b.l.j.l.c0;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements c {
    public static final g c = new b((a) null);
    public final g.e.b.q.a<c> a;
    public final AtomicReference<c> b = new AtomicReference<>((Object) null);

    public static final class b implements g {
        public b(a aVar) {
        }
    }

    public d(g.e.b.q.a<c> aVar) {
        this.a = aVar;
        ((z) aVar).a(new a(this));
    }

    public g a(String str) {
        c cVar = this.b.get();
        return cVar == null ? c : cVar.a(str);
    }

    public boolean b() {
        c cVar = this.b.get();
        return cVar != null && cVar.b();
    }

    public void c(String str, String str2, long j2, c0 c0Var) {
        f fVar = f.a;
        fVar.e("Deferring native open session: " + str);
        ((z) this.a).a(new b(str, str2, j2, c0Var));
    }

    public boolean d(String str) {
        c cVar = this.b.get();
        return cVar != null && cVar.d(str);
    }
}
