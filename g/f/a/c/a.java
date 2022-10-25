package g.f.a.c;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.Locale;

public abstract class a implements c {

    /* renamed from: g.f.a.c.a$a  reason: collision with other inner class name */
    public static class C0135a extends g.f.a.d.a {
        public k a() {
            return k.BOOLEAN;
        }

        public Object h(i iVar, String str) {
            return Byte.valueOf(Boolean.parseBoolean(str) ? (byte) 1 : 0);
        }

        public Object m(i iVar, Object obj) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
        }

        public Object y(i iVar, e eVar, int i2) throws SQLException {
            return Byte.valueOf((byte) ((d) eVar).b.getShort(i2));
        }

        public Object z(i iVar, Object obj, int i2) {
            return ((Byte) obj).byteValue() == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public String a(String str, boolean z) {
        return z ? str.toLowerCase(Locale.ENGLISH) : str.toLowerCase();
    }
}
