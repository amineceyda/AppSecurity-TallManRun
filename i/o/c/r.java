package i.o.c;

import i.o.b.l;
import i.o.c.s.a;
import java.util.List;

public class r {
    public static List a(Object obj) {
        if (obj instanceof a) {
            c(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            h.i(e2, r.class.getName());
            throw e2;
        }
    }

    public static Object b(Object obj, int i2) {
        boolean z = true;
        if ((obj instanceof g ? ((g) obj).b() : obj instanceof i.o.b.a ? 0 : obj instanceof l ? 1 : 2) != i2) {
            z = false;
        }
        if (z) {
            return obj;
        }
        c(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(g.a.a.a.a.c(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.i(classCastException, r.class.getName());
        throw classCastException;
    }
}
