package g.f.a.g.l;

import g.a.a.a.a;
import g.f.a.d.i;
import g.f.a.e.c;
import g.f.a.e.d;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public abstract class b<T, ID> {

    /* renamed from: f  reason: collision with root package name */
    public static c f3998f = d.a(b.class);
    public final g.f.a.i.c<T, ID> a;
    public final Class<T> b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3999d;

    /* renamed from: e  reason: collision with root package name */
    public final i[] f4000e;

    public b(g.f.a.i.c<T, ID> cVar, String str, i[] iVarArr) {
        this.a = cVar;
        this.b = cVar.c;
        this.c = cVar.f4020g;
        this.f3999d = str;
        this.f4000e = iVarArr;
    }

    public static void b(g.f.a.c.c cVar, StringBuilder sb, i iVar, List<i> list) {
        ((g.f.a.c.d) cVar).b(sb, iVar.f3875d);
        if (list != null) {
            list.add(iVar);
        }
        sb.append(' ');
    }

    public static void c(g.f.a.c.c cVar, StringBuilder sb, String str, String str2) {
        sb.append(str);
        Objects.requireNonNull((g.f.a.c.d) cVar);
        sb.append('`');
        sb.append(str2);
        sb.append('`');
        sb.append(' ');
    }

    public Object[] d(Object obj) throws SQLException {
        Object[] objArr = new Object[this.f4000e.length];
        int i2 = 0;
        while (true) {
            i[] iVarArr = this.f4000e;
            if (i2 >= iVarArr.length) {
                return objArr;
            }
            i iVar = iVarArr[i2];
            if (iVar.f3876e.z) {
                Object e2 = iVar.e(obj);
                if (iVar.o(e2)) {
                    e2 = null;
                }
                objArr[i2] = e2;
            } else {
                objArr[i2] = iVar.d(iVar.e(obj));
            }
            if (objArr[i2] == null) {
                objArr[i2] = iVar.f3884m;
            }
            i2++;
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("MappedStatement: ");
        i2.append(this.f3999d);
        return i2.toString();
    }
}
