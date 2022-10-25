package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.Map;

public final class j8 {
    public static final int a(int i2, Object obj, Object obj2) {
        i8 i8Var = (i8) obj;
        h8 h8Var = (h8) obj2;
        if (i8Var.isEmpty()) {
            return 0;
        }
        Iterator it = i8Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        i8 i8Var = (i8) obj;
        i8 i8Var2 = (i8) obj2;
        if (!i8Var2.isEmpty()) {
            if (!i8Var.b()) {
                i8Var = i8Var.isEmpty() ? new i8() : new i8(i8Var);
            }
            i8Var.d();
            if (!i8Var2.isEmpty()) {
                i8Var.putAll(i8Var2);
            }
        }
        return i8Var;
    }
}
