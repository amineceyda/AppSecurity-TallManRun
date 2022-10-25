package g.e.c.t;

import g.a.a.a.a;
import java.lang.reflect.Modifier;

public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder i2 = a.i("Interface can't be instantiated! Interface name: ");
            i2.append(cls.getName());
            throw new UnsupportedOperationException(i2.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder i3 = a.i("Abstract class can't be instantiated! Class name: ");
            i3.append(cls.getName());
            throw new UnsupportedOperationException(i3.toString());
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
