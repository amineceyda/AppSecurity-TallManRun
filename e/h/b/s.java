package e.h.b;

import androidx.fragment.app.Fragment;
import e.d.g;
import g.a.a.a.a;

public class s {
    public static final g<ClassLoader, g<String, Class<?>>> a = new g<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        g<ClassLoader, g<String, Class<?>>> gVar = a;
        g orDefault = gVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new g();
            gVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(a.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        } catch (ClassCastException e3) {
            throw new Fragment.InstantiationException(a.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
