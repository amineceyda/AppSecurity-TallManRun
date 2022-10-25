package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class d0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final d0 f3901d = new d0();

    public d0() {
        super(k.LONG, new Class[]{Long.class});
    }

    public d0(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object b(Number number) {
        return Long.valueOf(number.longValue());
    }

    public Object h(i iVar, String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public boolean k() {
        return false;
    }

    public boolean n() {
        return true;
    }

    public Object q(Object obj) {
        if (obj == null) {
            return 1L;
        }
        return Long.valueOf(((Long) obj).longValue() + 1);
    }

    public boolean x() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Long.valueOf(((d) eVar).o(i2));
    }
}
