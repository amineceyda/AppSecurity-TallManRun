package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.d.l.b;
import g.f.a.h.e;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class r extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final r f3931e = new r();

    public r() {
        super(k.STRING);
    }

    public r(k kVar) {
        super(kVar);
    }

    public Object g(i iVar) {
        String i2 = iVar.i();
        return i2 == null ? b.f3897d : new b.a(i2);
    }

    public Object h(i iVar, String str) throws SQLException {
        b.a A = b.A(iVar, b.f3897d);
        try {
            DateFormat a = A.a();
            return a.format(a.parse(str));
        } catch (ParseException e2) {
            throw e.e.i.b.j("Problems with field " + iVar + " parsing default date-string '" + str + "' using '" + A + "'", e2);
        }
    }

    public Class<?> i() {
        return byte[].class;
    }

    public Object m(i iVar, Object obj) {
        return b.A(iVar, b.f3897d).a().format((Date) obj);
    }

    public int p() {
        return 50;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).s(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        String str = (String) obj;
        b.a A = b.A(iVar, b.f3897d);
        try {
            return A.a().parse(str);
        } catch (ParseException e2) {
            throw e.e.i.b.j("Problems with column " + i2 + " parsing date-string '" + str + "' using '" + A + "'", e2);
        }
    }
}
