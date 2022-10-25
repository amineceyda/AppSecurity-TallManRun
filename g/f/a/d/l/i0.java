package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class i0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final i0 f3913d = new i0();

    public i0() {
        super(k.SHORT, new Class[]{Short.class});
    }

    public i0(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object b(Number number) {
        return Short.valueOf(number.shortValue());
    }

    public Object h(i iVar, String str) {
        return Short.valueOf(Short.parseShort(str));
    }

    public boolean k() {
        return false;
    }

    public boolean n() {
        return true;
    }

    public Object q(Object obj) {
        if (obj == null) {
            return (short) 1;
        }
        return Short.valueOf((short) (((Short) obj).shortValue() + 1));
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Short.valueOf(((d) eVar).q(i2));
    }
}
