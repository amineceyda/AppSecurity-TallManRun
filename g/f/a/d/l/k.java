package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.h.e;
import java.sql.SQLException;

public class k extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final k f3916d = new k();

    public k() {
        super(g.f.a.d.k.BYTE_ARRAY);
    }

    public Object h(i iVar, String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }

    public Class<?> i() {
        return byte[].class;
    }

    public boolean r() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).f(i2);
    }
}
