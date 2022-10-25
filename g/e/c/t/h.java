package g.e.c.t;

import g.a.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class h implements s<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    public T a() {
        try {
            return this.a.newInstance((Object[]) null);
        } catch (InstantiationException e2) {
            StringBuilder i2 = a.i("Failed to invoke ");
            i2.append(this.a);
            i2.append(" with no args");
            throw new RuntimeException(i2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder i3 = a.i("Failed to invoke ");
            i3.append(this.a);
            i3.append(" with no args");
            throw new RuntimeException(i3.toString(), e3.getTargetException());
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }
}
