package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class w extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final w f3940d = new w();

    public w() {
        super(k.INTEGER);
    }

    public Object g(i iVar) throws SQLException {
        HashMap hashMap = new HashMap();
        Enum[] enumArr = (Enum[]) iVar.l().getEnumConstants();
        if (enumArr != null) {
            for (Enum enumR : enumArr) {
                hashMap.put(Integer.valueOf(enumR.ordinal()), enumR);
            }
            return hashMap;
        }
        throw new SQLException("Could not get enum-constants for field " + iVar);
    }

    public Object h(i iVar, String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Class<?> i() {
        return Integer.TYPE;
    }

    public boolean k() {
        return false;
    }

    public Object m(i iVar, Object obj) {
        return Integer.valueOf(((Enum) obj).ordinal());
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Integer.valueOf(((d) eVar).n(i2));
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        if (iVar == null) {
            return obj;
        }
        Integer num = (Integer) obj;
        Map map = (Map) iVar.g();
        return c.A(iVar, num, map == null ? null : (Enum) map.get(num), iVar.n());
    }
}
