package g.f.a.d;

import g.f.a.d.l.x;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class c {
    public static final b a = x.f3941d;
    public static final Map<String, b> b = new HashMap();

    static {
        d[] values = d.values();
        for (int i2 = 0; i2 < 39; i2++) {
            b a2 = values[i2].a();
            if (a2 != null) {
                for (Class name : a2.f()) {
                    b.put(name.getName(), a2);
                }
                if (a2.d() != null) {
                    for (String put : a2.d()) {
                        b.put(put, a2);
                    }
                }
            }
        }
    }

    public static b a(Field field) {
        b bVar = b.get(field.getType().getName());
        if (bVar != null) {
            return bVar;
        }
        if (field.getType().isEnum()) {
            return a;
        }
        return null;
    }
}
