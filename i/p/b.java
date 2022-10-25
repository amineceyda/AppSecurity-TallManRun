package i.p;

import i.o.c.h;
import java.util.Random;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final a f4577d = new a();

    public static final class a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    public Random d() {
        Object obj = this.f4577d.get();
        h.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
