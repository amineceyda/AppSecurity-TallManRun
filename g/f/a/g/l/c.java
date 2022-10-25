package g.f.a.g.l;

import g.f.a.b.m;
import g.f.a.d.i;
import g.f.a.e.b;
import g.f.a.h.f;
import java.sql.SQLException;
import java.util.Objects;

public class c<T, ID> extends b<T, ID> {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f4001j = 0;

    /* renamed from: g  reason: collision with root package name */
    public final String f4002g;

    /* renamed from: h  reason: collision with root package name */
    public String f4003h;

    /* renamed from: i  reason: collision with root package name */
    public int f4004i;

    public static class b implements f {
        public Number a;

        public b() {
        }

        public b(a aVar) {
        }

        public void a(Number number) throws SQLException {
            if (this.a == null) {
                this.a = number;
                return;
            }
            StringBuilder i2 = g.a.a.a.a.i("generated key has already been set to ");
            i2.append(this.a);
            i2.append(", now set to ");
            i2.append(number);
            throw new SQLException(i2.toString());
        }
    }

    public c(g.f.a.i.c<T, ID> cVar, String str, i[] iVarArr, String str2, int i2) {
        super(cVar, str, iVarArr);
        this.f4003h = cVar.c.getSimpleName();
        this.f4002g = str2;
        this.f4004i = i2;
    }

    public static boolean f(g.f.a.c.c cVar, i iVar) {
        g.f.a.d.f fVar = iVar.f3876e;
        if (fVar.F || fVar.E) {
            return false;
        }
        Objects.requireNonNull(cVar);
        if (!iVar.f3878g || iVar.q() || iVar.f3876e.z) {
            return true;
        }
        return false;
    }

    public final void e(T t, Number number, String str, m mVar) throws SQLException {
        i iVar = this.c;
        Object b2 = iVar.f3883l.b(number);
        if (b2 != null) {
            iVar.b(t, b2, false, mVar);
            g.f.a.e.c cVar = b.f3998f;
            b.a aVar = b.a.DEBUG;
            if (cVar.a.a(aVar)) {
                g.f.a.e.c cVar2 = b.f3998f;
                Object[] objArr = {number, str, this.c.h(), this.f4003h};
                Object obj = g.f.a.e.c.b;
                cVar2.g(aVar, (Throwable) null, "assigned id '{}' from {} to '{}' in {} object", obj, obj, obj, objArr);
                return;
            }
            return;
        }
        StringBuilder i2 = g.a.a.a.a.i("Invalid class ");
        i2.append(iVar.f3883l);
        i2.append(" for sequence-id ");
        i2.append(iVar);
        throw new SQLException(i2.toString());
    }
}
