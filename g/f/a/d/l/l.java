package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class l extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final l f3918d = new l();

    public l() {
        super(k.BYTE, new Class[]{Byte.class});
    }

    public l(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object b(Number number) {
        return Byte.valueOf(number.byteValue());
    }

    public Object h(i iVar, String str) {
        return Byte.valueOf(Byte.parseByte(str));
    }

    public boolean k() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Byte.valueOf(((d) eVar).d(i2));
    }
}
