package g.f.a.g.l;

import g.f.a.e.b;
import g.f.a.g.a;
import g.f.a.g.d;
import g.f.a.g.i;
import g.f.a.h.b;
import g.f.a.i.c;
import java.sql.SQLException;

public class e<T, ID> extends a<T, ID> implements d<T>, Object<T> {

    /* renamed from: k  reason: collision with root package name */
    public final a[] f4006k;

    /* renamed from: l  reason: collision with root package name */
    public final Long f4007l = null;

    /* renamed from: m  reason: collision with root package name */
    public final i.a f4008m;
    public final boolean n;

    public e(c<T, ID> cVar, String str, g.f.a.d.i[] iVarArr, g.f.a.d.i[] iVarArr2, a[] aVarArr, Long l2, i.a aVar, boolean z) {
        super(cVar, str, iVarArr, iVarArr2);
        this.f4006k = aVarArr;
        this.f4008m = aVar;
        this.n = z;
    }

    public b e(g.f.a.h.d dVar, i.a aVar, int i2) throws SQLException {
        a[] aVarArr;
        if (this.f4008m == aVar) {
            b b = ((g.f.a.a.c) dVar).b(this.f3999d, aVar, this.f4000e, i2, this.n);
            try {
                Long l2 = this.f4007l;
                if (l2 != null) {
                    int intValue = l2.intValue();
                    g.f.a.a.a aVar2 = (g.f.a.a.a) b;
                    if (aVar2.f3829g == null) {
                        aVar2.f3831i = Integer.valueOf(intValue);
                    } else {
                        throw new SQLException("Query already run. Cannot add argument values.");
                    }
                }
                Object[] objArr = null;
                if (b.f3998f.a.a(b.a.TRACE)) {
                    a[] aVarArr2 = this.f4006k;
                    if (aVarArr2.length > 0) {
                        objArr = new Object[aVarArr2.length];
                    }
                }
                int i3 = 0;
                while (true) {
                    aVarArr = this.f4006k;
                    if (i3 >= aVarArr.length) {
                        break;
                    }
                    Object b2 = aVarArr[i3].b();
                    g.f.a.d.i iVar = this.f4000e[i3];
                    ((g.f.a.a.a) b).d(i3, b2, iVar == null ? this.f4006k[i3].a() : iVar.k());
                    if (objArr != null) {
                        objArr[i3] = b2;
                    }
                    i3++;
                }
                b.f3998f.c("prepared statement '{}' with {} args", this.f3999d, Integer.valueOf(aVarArr.length));
                if (objArr != null) {
                    b.f3998f.h("prepared statement arguments: {}", objArr);
                }
                return b;
            } catch (Throwable th) {
                e.e.i.b.d(b, "statement");
                throw th;
            }
        } else {
            StringBuilder i4 = g.a.a.a.a.i("Could not compile this ");
            i4.append(this.f4008m);
            i4.append(" statement since the caller is expecting a ");
            i4.append(aVar);
            i4.append(" statement.  Check your QueryBuilder methods.");
            throw new SQLException(i4.toString());
        }
    }
}
