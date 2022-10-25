package g.f.a.d.l;

import g.f.a.d.i;
import g.f.a.d.k;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Date;

public class k0 extends r {

    /* renamed from: f  reason: collision with root package name */
    public static final k0 f3917f = new k0();

    public k0() {
        super(k.STRING);
    }

    public Object m(i iVar, Object obj) {
        return super.m(iVar, new Date(((java.sql.Date) obj).getTime()));
    }

    public boolean o(Field field) {
        return field.getType() == java.sql.Date.class;
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        return new java.sql.Date(((Date) super.z(iVar, obj, i2)).getTime());
    }
}
