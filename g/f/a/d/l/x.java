package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class x extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final x f3941d = new x();

    public x() {
        super(k.STRING, new Class[]{Enum.class});
    }

    public x(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public String B(Enum<?> enumR) {
        return enumR.name();
    }

    public Object g(i iVar) throws SQLException {
        HashMap hashMap = new HashMap();
        Enum[] enumArr = (Enum[]) iVar.l().getEnumConstants();
        if (enumArr != null) {
            for (Enum enumR : enumArr) {
                hashMap.put(B(enumR), enumR);
            }
            return hashMap;
        }
        throw new SQLException("Could not get enum-constants for field " + iVar + ", not an enum or maybe generic?");
    }

    public Object h(i iVar, String str) {
        return str;
    }

    public Object m(i iVar, Object obj) {
        return B((Enum) obj);
    }

    public int p() {
        return 100;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).s(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        if (iVar == null) {
            return obj;
        }
        String str = (String) obj;
        Map map = (Map) iVar.g();
        return c.A(iVar, str, map == null ? null : (Enum) map.get(str), iVar.n());
    }
}
