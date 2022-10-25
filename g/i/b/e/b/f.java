package g.i.b.e.b;

import g.i.b.e.b.a.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class f {
    public static volatile f b;
    public ThreadPoolExecutor a = ((ThreadPoolExecutor) Executors.newCachedThreadPool(new a(g.h.a.a.l("BusinessTaskPool"))));

    public static f a() {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }
}
