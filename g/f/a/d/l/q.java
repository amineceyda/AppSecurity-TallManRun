package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.Date;

public class q extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final q f3929e = new q();

    public q() {
        super(k.LONG);
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e2) {
            throw b.j("Problems with field " + iVar + " parsing default date-long value: " + str, e2);
        }
    }

    public Class<?> i() {
        return Date.class;
    }

    public boolean k() {
        return false;
    }

    public Object m(i iVar, Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Long.valueOf(((d) eVar).o(i2));
    }

    public Object z(i iVar, Object obj, int i2) {
        return new Date(((Long) obj).longValue());
    }
}
