package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class m0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f3922d = new m0();

    public m0() {
        super(k.BYTE_ARRAY);
    }

    public final String A(i iVar) {
        return (iVar == null || iVar.i() == null) ? "Unicode" : iVar.i();
    }

    public Object h(i iVar, String str) throws SQLException {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(A(iVar));
        } catch (UnsupportedEncodingException e2) {
            throw b.j("Could not convert default string: " + str, e2);
        }
    }

    public Class<?> i() {
        return String.class;
    }

    public Object m(i iVar, Object obj) throws SQLException {
        String str = (String) obj;
        String A = A(iVar);
        try {
            return str.getBytes(A);
        } catch (UnsupportedEncodingException e2) {
            throw b.j("Could not convert string with charset name: " + A, e2);
        }
    }

    public boolean r() {
        return true;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).f(i2);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        byte[] bArr = (byte[]) obj;
        String A = A(iVar);
        try {
            return new String(bArr, A);
        } catch (UnsupportedEncodingException e2) {
            throw b.j("Could not convert string with charset name: " + A, e2);
        }
    }
}
