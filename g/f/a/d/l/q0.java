package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.UUID;

public class q0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final q0 f3930d = new q0();

    public q0() {
        super(k.STRING, new Class[]{UUID.class});
    }

    public q0(k kVar) {
        super(kVar);
    }

    public Object h(i iVar, String str) {
        return str;
    }

    public boolean l() {
        return true;
    }

    public Object m(i iVar, Object obj) {
        return ((UUID) obj).toString();
    }

    public int p() {
        return 48;
    }

    public Object s() {
        return UUID.randomUUID();
    }

    public boolean x() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).s(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        String str = (String) obj;
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with column " + i2 + " parsing UUID-string '" + str + "'", e2);
        }
    }
}
