package f.a.a.a.n;

import f.a.a.a.c;
import f.a.a.a.j.a;
import f.a.a.b.z.m;
import java.lang.reflect.InvocationTargetException;

public class b {
    public static b c = new b();
    public a a;
    public Object b;

    public void a(c cVar, Object obj) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls;
        Object obj2 = this.b;
        if (obj2 == null) {
            this.b = obj;
        } else if (obj2 != obj) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String p = e.e.f.b.p("logback.ContextSelector");
        if (p == null) {
            this.a = new f.a.a.a.j.b(cVar);
        } else if (!p.equals("JNDI")) {
            if (!m.a) {
                try {
                    cls = Thread.currentThread().getContextClassLoader().loadClass(p);
                } catch (Throwable unused) {
                }
                this.a = (a) cls.getConstructor(new Class[]{c.class}).newInstance(new Object[]{cVar});
            }
            cls = Class.forName(p);
            this.a = (a) cls.getConstructor(new Class[]{c.class}).newInstance(new Object[]{cVar});
        } else {
            throw new RuntimeException("JNDI not supported");
        }
    }
}
