package g.c.a.e.k.h;

import com.google.gson.Gson;
import g.c.b.b.f;
import g.e.c.e;

public class b {
    public static Gson a;

    public static Gson a() {
        try {
            if (a == null) {
                e eVar = new e();
                eVar.b();
                a = eVar.a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            a = null;
        }
        return a;
    }

    public static <T> T b(String str, Class<T> cls) {
        try {
            return f.y0(cls).cast(a().e(str, cls));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(Object obj) {
        return a().i(obj);
    }
}
