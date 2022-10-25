package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class h extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final Integer f3908f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final Integer f3909g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final h f3910h = new h();

    public h() {
        super(k.INTEGER);
    }

    public Object h(i iVar, String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str)).booleanValue() ? f3908f : f3909g;
    }

    public Object m(i iVar, Object obj) {
        return ((Boolean) obj).booleanValue() ? f3908f : f3909g;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Integer.valueOf(((d) eVar).n(i2));
    }

    public Object z(i iVar, Object obj, int i2) {
        return ((Integer) obj).intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }
}
