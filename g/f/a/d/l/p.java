package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.Date;

public class p extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final p f3927e = new p();

    public p() {
        super(k.INTEGER);
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e2) {
            throw b.j("Problems with field " + iVar + " parsing default date-integer value: " + str, e2);
        }
    }

    public Class<?> i() {
        return Date.class;
    }

    public boolean k() {
        return false;
    }

    public Object m(i iVar, Object obj) {
        return Integer.valueOf((int) (((Date) obj).getTime() / 1000));
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Integer.valueOf(((d) eVar).n(i2));
    }

    public Object z(i iVar, Object obj, int i2) {
        return new Date(((long) ((Integer) obj).intValue()) * 1000);
    }
}
