package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import java.math.BigDecimal;
import java.sql.SQLException;

public class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final e f3902d = new e();

    public e() {
        super(k.STRING, new Class[]{BigDecimal.class});
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return new BigDecimal(str).toString();
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with field " + iVar + " parsing default BigDecimal string '" + str + "'", e2);
        }
    }

    public Object m(i iVar, Object obj) {
        return ((BigDecimal) obj).toString();
    }

    public int p() {
        return 255;
    }

    public boolean t() {
        return false;
    }

    public Object y(i iVar, g.f.a.h.e eVar, int i2) throws SQLException {
        return ((d) eVar).s(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        try {
            return new BigDecimal((String) obj);
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with column " + i2 + " parsing BigDecimal string '" + obj + "'", e2);
        }
    }
}
