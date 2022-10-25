package g.f.a.d.l;

import e.e.i.b;
import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class s extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final s f3932d = new s();

    /* renamed from: e  reason: collision with root package name */
    public static Class<?> f3933e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f3934f;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor<?> f3935g;

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3936h = {"org.joda.time.DateTime"};

    public s() {
        super(k.LONG);
    }

    public final Object A(Long l2) throws SQLException {
        try {
            if (f3935g == null) {
                f3935g = C().getConstructor(new Class[]{Long.TYPE});
            }
            return f3935g.newInstance(new Object[]{l2});
        } catch (Exception e2) {
            throw b.j("Could not use reflection to construct a Joda DateTime", e2);
        }
    }

    public final Long B(Object obj) throws SQLException {
        try {
            if (f3934f == null) {
                f3934f = C().getMethod("getMillis", new Class[0]);
            }
            if (obj == null) {
                return null;
            }
            return (Long) f3934f.invoke(obj, new Object[0]);
        } catch (Exception e2) {
            throw b.j("Could not use reflection to get millis from Joda DateTime: " + obj, e2);
        }
    }

    public final Class<?> C() throws ClassNotFoundException {
        if (f3933e == null) {
            f3933e = Class.forName("org.joda.time.DateTime");
        }
        return f3933e;
    }

    public String[] d() {
        return f3936h;
    }

    public Object h(i iVar, String str) throws SQLException {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e2) {
            throw b.j("Problems with field " + iVar + " parsing default DateTime value: " + str, e2);
        }
    }

    public Class<?> i() {
        try {
            return C();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean k() {
        return false;
    }

    public Object m(i iVar, Object obj) throws SQLException {
        return B(obj);
    }

    public boolean n() {
        return true;
    }

    public Object q(Object obj) throws SQLException {
        long currentTimeMillis = System.currentTimeMillis();
        if (obj != null && currentTimeMillis == B(obj).longValue()) {
            currentTimeMillis++;
        }
        return A(Long.valueOf(currentTimeMillis));
    }

    public boolean t() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return Long.valueOf(((d) eVar).o(i2));
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        return A((Long) obj);
    }
}
