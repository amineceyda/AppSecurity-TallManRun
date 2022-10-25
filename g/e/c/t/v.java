package g.e.c.t;

import java.lang.reflect.Method;

public class v extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ int b;

    public v(Method method, int i2) {
        this.a = method;
        this.b = i2;
    }

    public <T> T b(Class<T> cls) throws Exception {
        y.a(cls);
        return this.a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.b)});
    }
}
