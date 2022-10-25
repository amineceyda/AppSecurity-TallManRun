package g.f.a.d.l;

import g.f.a.d.k;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f3897d = new a("yyyy-MM-dd HH:mm:ss.SSSSSS");

    public static class a {
        public final ThreadLocal<DateFormat> a = new C0136a();
        public final String b;

        /* renamed from: g.f.a.d.l.b$a$a  reason: collision with other inner class name */
        public class C0136a extends ThreadLocal<DateFormat> {
            public C0136a() {
            }

            public Object initialValue() {
                return new SimpleDateFormat(a.this.b);
            }
        }

        public a(String str) {
            this.b = str;
        }

        public DateFormat a() {
            return this.a.get();
        }

        public String toString() {
            return this.b;
        }
    }

    public b(k kVar) {
        super(kVar);
    }

    public b(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (g.f.a.d.l.b.a) r0.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.f.a.d.l.b.a A(g.f.a.d.i r0, g.f.a.d.l.b.a r1) {
        /*
            if (r0 != 0) goto L_0x0003
            return r1
        L_0x0003:
            java.lang.Object r0 = r0.g()
            g.f.a.d.l.b$a r0 = (g.f.a.d.l.b.a) r0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.d.l.b.A(g.f.a.d.i, g.f.a.d.l.b$a):g.f.a.d.l.b$a");
    }

    public boolean n() {
        return true;
    }

    public boolean o(Field field) {
        return field.getType() == Date.class;
    }

    public Object q(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        return obj == null ? new Date(currentTimeMillis) : currentTimeMillis == ((Date) obj).getTime() ? new Date(currentTimeMillis + 1) : new Date(currentTimeMillis);
    }
}
