package g.i.c.a.a.l;

import android.text.TextUtils;
import android.view.View;
import g.h.a.a;
import java.util.HashMap;
import java.util.Map;

public class c {
    public static b a(Object obj, boolean z) {
        b a = a.a(obj);
        if (a == null && z) {
            a = new b();
            if (obj != null) {
                (obj instanceof View ? a.a : a.b).b(obj, a);
            }
        }
        return a;
    }

    public static String b(Object obj) {
        return a.y(a(obj, false));
    }

    public static g.i.c.a.a.j.a c(Object obj) {
        return (g.i.c.a.a.j.a) a.C(a(obj, false), "element_event_type");
    }

    public static Object d(Object obj, String str) {
        return a.A(a(obj, true), str);
    }

    public static Object e(Object obj, String str) {
        return a.C(a(obj, true), str);
    }

    public static String f(Object obj) {
        return a.G(a(obj, false));
    }

    public static void g(b bVar, String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            if (bVar.f4461k == null) {
                bVar.f4461k = new HashMap(1);
            }
            bVar.f4461k.put(str, obj);
        }
    }

    public static void h(Object obj, String str) {
        b a = a(obj, true);
        if (a != null) {
            a.a = str;
        }
    }

    public static void i(Object obj, Map<String, ?> map) {
        b a = a(obj, true);
        if (a != null && map != null) {
            if (a.b == null) {
                a.b = new HashMap(1);
            }
            a.b.putAll(map);
        }
    }

    public static void j(Object obj, String str, Object obj2) {
        a.V(a(obj, true), str, obj2);
    }

    public static void k(Object obj, String str) {
        b a = a(obj, true);
        if (a != null) {
            a.f4457g = str;
        }
    }

    public static void l(Object obj, String str) {
        b a = a(obj, true);
        if (a != null) {
            a.f4456f = str;
        }
    }

    public static void m(Object obj, String str, Object obj2) {
        b a = a(obj, true);
        if (a != null && !TextUtils.isEmpty(str)) {
            if (a.f4458h == null) {
                a.f4458h = new HashMap(1);
            }
            a.f4458h.put(str, obj2);
        }
    }
}
