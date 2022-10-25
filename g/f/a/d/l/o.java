package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class o extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final o f3925d = new o();

    public o() {
        super(k.CHAR, new Class[]{Character.class});
    }

    public o(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public Object h(i iVar, String str) throws SQLException {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new SQLException("Problems with field " + iVar + ", default string to long for Character: '" + str + "'");
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Character.valueOf(((d) eVar).g(i2));
    }
}
