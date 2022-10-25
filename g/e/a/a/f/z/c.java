package g.e.a.a.f.z;

import g.e.a.a.f.a0.a;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.s;
import g.e.a.a.f.v.e;
import g.e.a.a.f.z.h.y;
import g.e.a.a.f.z.i.a0;
import g.e.b.l.j.o.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2793f = Logger.getLogger(s.class.getName());
    public final y a;
    public final Executor b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f2794d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2795e;

    public c(Executor executor, e eVar, y yVar, a0 a0Var, a aVar) {
        this.b = executor;
        this.c = eVar;
        this.a = yVar;
        this.f2794d = a0Var;
        this.f2795e = aVar;
    }

    public void a(p pVar, l lVar, b bVar) {
        this.b.execute(new a(this, pVar, bVar, lVar));
    }
}
