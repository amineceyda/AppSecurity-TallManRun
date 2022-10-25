package g.f.a.d.l;

import g.a.a.a.a;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;

public class g extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final g f3906f = new g();

    public g() {
        super(k.STRING);
    }

    public Object g(i iVar) throws SQLException {
        String i2 = iVar.i();
        if (i2 == null) {
            return "10";
        }
        if (i2.length() == 2 && i2.charAt(0) != i2.charAt(1)) {
            return i2;
        }
        throw new SQLException(a.w("Invalid boolean format must have 2 different characters that represent true/false like \"10\" or \"tf\": ", i2));
    }

    public Object h(i iVar, String str) {
        return m(iVar, Boolean.valueOf(Boolean.parseBoolean(str)));
    }

    public Object m(i iVar, Object obj) {
        return Character.valueOf(((String) iVar.g()).charAt(((Boolean) obj).booleanValue() ? 0 : 1));
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Character.valueOf(((d) eVar).g(i2));
    }

    public Object z(i iVar, Object obj, int i2) {
        return ((Character) obj).charValue() == ((String) iVar.g()).charAt(0) ? Boolean.TRUE : Boolean.FALSE;
    }
}
