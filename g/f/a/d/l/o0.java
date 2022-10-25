package g.f.a.d.l;

import g.f.a.d.i;
import g.f.a.d.k;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class o0 extends r {

    /* renamed from: f  reason: collision with root package name */
    public static final o0 f3926f = new o0();

    public o0() {
        super(k.STRING);
    }

    public Object m(i iVar, Object obj) {
        return super.m(iVar, new Date(((Timestamp) obj).getTime()));
    }

    public boolean o(Field field) {
        return field.getType() == Timestamp.class;
    }

    public Object q(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        return obj == null ? new Timestamp(currentTimeMillis) : currentTimeMillis == ((Timestamp) obj).getTime() ? new Timestamp(currentTimeMillis + 1) : new Timestamp(currentTimeMillis);
    }

    public Object z(i iVar, Object obj, int i2) throws SQLException {
        return new Timestamp(((Date) super.z(iVar, obj, i2)).getTime());
    }
}
