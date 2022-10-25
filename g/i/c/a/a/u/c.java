package g.i.c.a.a.u;

import g.i.c.a.a.j.a;
import java.util.Map;

public class c {
    public String a;
    public a b;
    public Map<String, Object> c = new e.d.a();

    public Map<String, Object> a() {
        return this.c;
    }

    public void b(String str, Object obj) {
        if (obj == null) {
            obj = "";
        }
        this.c.put(str, obj);
    }

    public void c(Map<String, ?> map) {
        if (map != null) {
            this.c.putAll(map);
        }
    }

    public void d() {
        this.a = null;
        this.b = null;
        this.c.clear();
    }

    public void e(String str) {
        this.a = str;
    }

    public void f(a aVar) {
        this.b = aVar;
    }
}
