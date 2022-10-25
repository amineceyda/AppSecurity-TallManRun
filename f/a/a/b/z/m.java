package f.a.a.b.z;

import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Objects;

public class m {
    public static boolean a = false;

    public static class a implements PrivilegedAction<Boolean> {
        public Object run() {
            try {
                AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                return Boolean.TRUE;
            } catch (SecurityException unused) {
                return Boolean.FALSE;
            }
        }
    }

    static {
        String str = null;
        try {
            str = System.getProperty("logback.ignoreTCL", (String) null);
        } catch (SecurityException unused) {
        }
        if (str != null) {
            a = Boolean.valueOf(str).booleanValue();
        }
        ((Boolean) AccessController.doPrivileged(new a())).booleanValue();
    }

    public static ClassLoader a(Object obj) {
        Objects.requireNonNull(obj, "Argument cannot be null");
        ClassLoader classLoader = obj.getClass().getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static URL b(String str) {
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            return classLoader.getResource(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
