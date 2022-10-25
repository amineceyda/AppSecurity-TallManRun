package g.i.c.a.a.w;

import android.app.Activity;
import android.content.Context;
import g.i.c.a.a.b0.f;
import g.i.c.a.a.i.b;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class e extends g.i.c.a.a.i.a {
    public g.i.c.a.a.x.a a;
    public Map<String, g.i.c.a.a.w.g.a> b;
    public volatile boolean c;

    public static class a {
        public static final e a;

        static {
            e eVar = new e((b) null);
            a = eVar;
            Objects.requireNonNull(eVar);
            eVar.b = new ConcurrentHashMap();
            Context c = f.c();
            Class<g.i.c.a.a.x.c.a> cls = g.i.c.a.a.x.c.a.class;
            if (g.i.c.a.a.x.d.a.b == null) {
                synchronized (cls) {
                    if (g.i.c.a.a.x.d.a.b == null) {
                        g.i.c.a.a.x.d.a.b = new g.i.c.a.a.x.d.a(c);
                    }
                }
            }
            eVar.a = g.i.c.a.a.x.d.a.b;
            b.C0166b.a.b.c.a(eVar);
        }
    }

    public e(b bVar) {
    }

    public static e t() {
        return a.a;
    }

    public void s(Activity activity) {
        g.i.c.a.a.y.a.a(new d(this));
    }
}
