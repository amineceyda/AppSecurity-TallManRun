package g.f.a.c;

import g.f.a.d.f;
import g.f.a.h.c;
import g.f.a.i.b;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;

public class d extends b {
    public void b(StringBuilder sb, String str) {
        sb.append('`');
        sb.append(str);
        sb.append('`');
    }

    public <T> b<T> c(c cVar, Class<T> cls) throws SQLException {
        c cVar2 = ((g.f.a.a.b) cVar).f3835e;
        String c = b.c(cVar2, cls);
        ArrayList arrayList = new ArrayList();
        for (Class<T> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field f2 : cls2.getDeclaredFields()) {
                f f3 = f.f(cVar2, c, f2);
                if (f3 != null && f3.o) {
                    arrayList.add(f3);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return new b<>(cls, c, arrayList);
    }
}
