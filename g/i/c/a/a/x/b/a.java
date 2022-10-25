package g.i.c.a.a.x.b;

import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static volatile a b;
    public final ConcurrentHashMap<Class<?>, String> a = new ConcurrentHashMap<>();

    public a() {
        new ConcurrentHashMap();
    }

    public static a b() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public String a(Class<?> cls) {
        if (cls != null) {
            String str = this.a.get(cls);
            if (str != null) {
                return str;
            }
            b bVar = null;
            for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                bVar = (b) cls2.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            String name = bVar == null ? cls.getName() : bVar.value();
            this.a.put(cls, name);
            return name;
        }
        throw new IllegalArgumentException("Class cannot be null.");
    }
}
