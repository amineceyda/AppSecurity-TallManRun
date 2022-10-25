package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class z extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final z f3943d = new z();

    public z() {
        super(k.FLOAT, new Class[]{Float.class});
    }

    public z(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object h(i iVar, String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    public boolean k() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Float.valueOf(((d) eVar).k(i2));
    }
}
