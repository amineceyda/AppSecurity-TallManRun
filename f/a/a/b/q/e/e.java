package f.a.a.b.q.e;

import f.a.a.b.w.c;
import f.a.a.b.w.d;
import g.a.a.a.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class e {
    public static final Class<?>[] a = {String.class};

    public static Object a(c cVar, String str, Class<?> cls) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return trim;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return Integer.valueOf(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return Long.valueOf(trim);
        }
        if (Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(trim);
        }
        if (Double.TYPE.isAssignableFrom(cls)) {
            return Double.valueOf(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if ("true".equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return Boolean.FALSE;
            }
            return null;
        } else if (cls.isEnum()) {
            return Enum.valueOf(cls, trim);
        } else {
            if (b(cls)) {
                try {
                    return cls.getMethod("valueOf", a).invoke((Object) null, new Object[]{trim});
                } catch (Exception unused) {
                    StringBuilder i2 = a.i("Failed to invoke valueOf{} method in class [");
                    i2.append(cls.getName());
                    i2.append("] with value [");
                    i2.append(trim);
                    i2.append("]");
                    ((d) cVar).m(i2.toString());
                    return null;
                }
            } else if (!Charset.class.isAssignableFrom(cls)) {
                return null;
            } else {
                try {
                    return Charset.forName(str);
                } catch (UnsupportedCharsetException e2) {
                    ((d) cVar).c(a.c("Failed to get charset [", str, "]"), e2);
                    return null;
                }
            }
        }
    }

    public static boolean b(Class<?> cls) {
        Method method;
        try {
            method = cls.getMethod("valueOf", a);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method == null) {
            return false;
        }
        return Modifier.isStatic(method.getModifiers());
    }
}
