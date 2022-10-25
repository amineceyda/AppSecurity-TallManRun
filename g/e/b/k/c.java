package g.e.b.k;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import g.e.b.q.b;
import java.lang.reflect.InvocationTargetException;

public final /* synthetic */ class c implements b {
    public final /* synthetic */ String a;

    public /* synthetic */ c(String str) {
        this.a = str;
    }

    public final Object get() {
        String str = this.a;
        try {
            Class<?> cls = Class.forName(str);
            if (q.class.isAssignableFrom(cls)) {
                return (q) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e5);
        }
    }
}
