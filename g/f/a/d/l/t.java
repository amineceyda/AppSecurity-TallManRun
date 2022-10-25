package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.d.l.b;
import g.f.a.h.e;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;

public class t extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final t f3937e = new t();

    public t() {
        super(k.DATE, new Class[]{Date.class});
    }

    public t(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public b.a B() {
        return b.f3897d;
    }

    public Object h(i iVar, String str) throws SQLException {
        b.a A = b.A(iVar, B());
        try {
            return new Timestamp(A.a().parse(str).getTime());
        } catch (ParseException e2) {
            throw e.e.i.b.j("Problems parsing default date string '" + str + "' using '" + A + '\'', e2);
        }
    }

    public Object m(i iVar, Object obj) {
        return new Timestamp(((Date) obj).getTime());
    }

    public boolean r() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        Objects.requireNonNull((d) eVar);
        throw new SQLException("Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types");
    }

    public Object z(i iVar, Object obj, int i2) {
        return new Date(((Timestamp) obj).getTime());
    }
}
