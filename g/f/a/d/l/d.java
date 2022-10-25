package g.f.a.d.l;

import e.e.i.b;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Objects;

public class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final d f3900d = new d();

    public d() {
        super(k.BIG_DECIMAL);
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return new BigDecimal(str);
        } catch (IllegalArgumentException e2) {
            throw b.j("Problems with field " + iVar + " parsing default BigDecimal string '" + str + "'", e2);
        }
    }

    public Class<?> i() {
        return BigDecimal.class;
    }

    public boolean k() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        Objects.requireNonNull((g.f.a.a.d) eVar);
        throw new SQLException("Android does not support BigDecimal type.  Use BIG_DECIMAL or BIG_DECIMAL_STRING types");
    }
}
