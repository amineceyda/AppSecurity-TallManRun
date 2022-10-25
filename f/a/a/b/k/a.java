package f.a.a.b.k;

import java.lang.reflect.Method;

public class a {
    public static final a c = new a((ClassLoader) null);
    public Class<?> a;
    public Method b;

    public a(ClassLoader classLoader) {
        try {
            a((ClassLoader) null);
        } catch (Exception unused) {
        }
    }

    public void a(ClassLoader classLoader) throws ClassNotFoundException, SecurityException, NoSuchMethodException {
        Class<String> cls = String.class;
        if (classLoader == null) {
            classLoader = a.class.getClassLoader();
        }
        Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
        this.a = loadClass;
        this.b = loadClass.getMethod("get", new Class[]{cls, cls});
        this.a.getMethod("getBoolean", new Class[]{cls, Boolean.TYPE});
    }
}
