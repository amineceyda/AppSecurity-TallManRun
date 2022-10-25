package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class c0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f3899d = new c0();

    public c0() {
        super(k.INTEGER, new Class[]{Integer.class});
    }

    public c0(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object b(Number number) {
        return Integer.valueOf(number.intValue());
    }

    public Object h(i iVar, String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public boolean k() {
        return false;
    }

    public boolean n() {
        return true;
    }

    public Object q(Object obj) {
        if (obj == null) {
            return 1;
        }
        return Integer.valueOf(((Integer) obj).intValue() + 1);
    }

    public boolean x() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Integer.valueOf(((d) eVar).n(i2));
    }
}
