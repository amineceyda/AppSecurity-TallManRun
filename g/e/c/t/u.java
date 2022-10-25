package g.e.c.t;

import java.lang.reflect.Method;

public class u extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public u(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public <T> T b(Class<T> cls) throws Exception {
        y.a(cls);
        return this.a.invoke(this.b, new Object[]{cls});
    }
}
