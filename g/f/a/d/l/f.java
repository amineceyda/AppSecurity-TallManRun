package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.math.BigInteger;
import java.sql.SQLException;

public class f extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final f f3904d = new f();

    public f() {
        super(k.STRING, new Class[]{BigInteger.class});
    }

    public Object b(Number number) {
        return BigInteger.valueOf(number.longValue());
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return new BigInteger(str).toString();
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with field " + iVar + " parsing default BigInteger string '" + str + "'", e2);
        }
    }

    public Object m(i iVar, Object obj) {
        return ((BigInteger) obj).toString();
    }

    public boolean n() {
        return true;
    }

    public Object q(Object obj) {
        return obj == null ? BigInteger.ONE : ((BigInteger) obj).add(BigInteger.ONE);
    }

    public boolean x() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).s(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        try {
            return new BigInteger((String) obj);
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with column " + i2 + " parsing BigInteger string '" + obj + "'", e2);
        }
    }
}
