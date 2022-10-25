package g.f.a.d.l;

import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.d.l.b;
import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.Timestamp;

public class l0 extends t {

    /* renamed from: f  reason: collision with root package name */
    public static final l0 f3919f = new l0();

    /* renamed from: g  reason: collision with root package name */
    public static final b.a f3920g = new b.a("yyyy-MM-dd");

    public l0() {
        super(k.DATE, new Class[]{Date.class});
    }

    public b.a B() {
        return f3920g;
    }

    public Object m(i iVar, Object obj) {
        return new Timestamp(((Date) obj).getTime());
    }

    public boolean o(Field field) {
        return field.getType() == Date.class;
    }

    public Object z(i iVar, Object obj, int i2) {
        return new Date(((Timestamp) obj).getTime());
    }
}
