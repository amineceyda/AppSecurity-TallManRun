package e.k;

import android.app.Application;
import g.a.a.a.a;
import java.lang.reflect.InvocationTargetException;

public class t extends w {
    public static t c;
    public Application b;

    public t(Application application) {
        this.b = application;
    }

    public <T extends s> T a(Class<T> cls) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            return (s) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e5);
        }
    }
}
