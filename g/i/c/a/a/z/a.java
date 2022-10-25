package g.i.c.a.a.z;

import e.d.g;
import g.c.b.b.f;
import g.i.c.a.a.r.e;
import java.util.Map;

public class a {
    public static final Map<String, Long> a = new e.d.a();

    public static void a(String str) {
        if (e.b.a.a) {
            ((g) a).put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static long b(String str) {
        Long l2;
        if (!e.b.a.a || (l2 = (Long) ((g) a).remove(str)) == null) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
        f.K("SimpleTracer", str + " cost " + currentTimeMillis + " ms.");
        return currentTimeMillis;
    }
}
