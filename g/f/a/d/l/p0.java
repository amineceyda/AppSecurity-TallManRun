package g.f.a.d.l;

import g.f.a.d.i;
import g.f.a.d.k;
import java.lang.reflect.Field;
import java.sql.Timestamp;

public class p0 extends t {

    /* renamed from: f  reason: collision with root package name */
    public static final p0 f3928f = new p0();

    public p0() {
        super(k.DATE, new Class[]{Timestamp.class});
    }

    public Object m(i iVar, Object obj) {
        return obj;
    }

    public boolean o(Field field) {
        return field.getType() == Timestamp.class;
    }

    public Object q(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        return obj == null ? new Timestamp(currentTimeMillis) : currentTimeMillis == ((Timestamp) obj).getTime() ? new Timestamp(currentTimeMillis + 1) : new Timestamp(currentTimeMillis);
    }

    public Object z(i iVar, Object obj, int i2) {
        return obj;
    }
}
