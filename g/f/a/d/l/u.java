package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class u extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final u f3938d = new u();

    public u() {
        super(k.DOUBLE, new Class[]{Double.class});
    }

    public u(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object h(i iVar, String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    public boolean k() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Double.valueOf(((d) eVar).j(i2));
    }
}
