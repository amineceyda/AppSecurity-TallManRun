package g.f.a.g.l;

import g.f.a.a.d;
import g.f.a.b.j;
import g.f.a.b.l;
import g.f.a.b.m;
import g.f.a.d.f;
import g.f.a.d.i;
import g.f.a.g.c;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public abstract class a<T, ID> extends b<T, ID> implements c<T> {

    /* renamed from: g  reason: collision with root package name */
    public final i[] f3994g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Integer> f3995h = null;

    /* renamed from: i  reason: collision with root package name */
    public Object f3996i = null;

    /* renamed from: j  reason: collision with root package name */
    public Object f3997j = null;

    public a(g.f.a.i.c<T, ID> cVar, String str, i[] iVarArr, i[] iVarArr2) {
        super(cVar, str, iVarArr);
        this.f3994g = iVarArr2;
    }

    public T a(e eVar) throws SQLException {
        i[] iVarArr;
        int i2;
        Object obj;
        i iVar;
        j jVar;
        l lVar;
        i.a aVar;
        T b;
        e eVar2 = eVar;
        Map<String, Integer> map = this.f3995h;
        if (map == null) {
            map = new HashMap<>();
        }
        d dVar = (d) eVar2;
        m mVar = dVar.f3839e;
        if (mVar != null && (b = mVar.b(this.b, this.c.r(eVar2, map))) != null) {
            return b;
        }
        T a = this.a.a();
        boolean z = false;
        Object obj2 = null;
        for (i iVar2 : this.f3994g) {
            if (iVar2.f3876e.F) {
                z = true;
            } else {
                Object r = iVar2.r(eVar2, map);
                if (r == null || this.f3996i == null || iVar2.c.getType() != this.f3996i.getClass() || !r.equals(this.f3997j)) {
                    iVar2.b(a, r, false, mVar);
                } else {
                    iVar2.b(a, this.f3996i, true, mVar);
                }
                if (iVar2.f3877f) {
                    obj2 = r;
                }
            }
        }
        if (z) {
            i[] iVarArr2 = this.f3994g;
            int i3 = 0;
            for (int length = iVarArr2.length; i3 < length; length = i2) {
                i iVar3 = iVarArr2[i3];
                f fVar = iVar3.f3876e;
                if (fVar.F) {
                    i iVar4 = iVar3.s;
                    if (iVar4 == null) {
                        iVarArr = iVarArr2;
                        iVar = iVar3;
                        i2 = length;
                        obj = null;
                    } else {
                        g.f.a.b.a<?, ?> aVar2 = iVar3.t;
                        if (!fVar.G) {
                            iVarArr = iVarArr2;
                            iVar = iVar3;
                            lVar = new l(aVar2, a, obj2, iVar4, fVar.I, fVar.J);
                        } else {
                            iVarArr = iVarArr2;
                            iVar = iVar3;
                            ThreadLocal<i.a> threadLocal = i.v;
                            i.a aVar3 = threadLocal.get();
                            if (aVar3 == null) {
                                f fVar2 = iVar.f3876e;
                                if (fVar2.H == 0) {
                                    lVar = new l(aVar2, a, obj2, iVar.s, fVar2.I, fVar2.J);
                                } else {
                                    aVar3 = new i.a();
                                    threadLocal.set(aVar3);
                                }
                            }
                            i.a aVar4 = aVar3;
                            int i4 = aVar4.c;
                            if (i4 == 0) {
                                aVar4.f3885d = iVar.f3876e.H;
                            }
                            if (i4 >= aVar4.f3885d) {
                                i iVar5 = iVar.s;
                                f fVar3 = iVar.f3876e;
                                lVar = new l(aVar2, a, obj2, iVar5, fVar3.I, fVar3.J);
                            } else {
                                aVar4.c = i4 + 1;
                                try {
                                    i iVar6 = iVar.s;
                                    f fVar4 = iVar.f3876e;
                                    String str = fVar4.I;
                                    boolean z2 = fVar4.J;
                                    i2 = length;
                                    aVar = aVar4;
                                    try {
                                        j jVar2 = new j(aVar2, a, obj2, iVar6, str, z2);
                                        aVar.c--;
                                        jVar = jVar2;
                                        obj = jVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        aVar.c--;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar = aVar4;
                                    aVar.c--;
                                    throw th;
                                }
                            }
                        }
                        i2 = length;
                        jVar = lVar;
                        obj = jVar;
                    }
                    if (obj != null) {
                        iVar.b(a, obj, false, mVar);
                    }
                } else {
                    iVarArr = iVarArr2;
                    i2 = length;
                }
                i3++;
                iVarArr2 = iVarArr;
            }
        }
        m mVar2 = dVar.f3840f ? dVar.f3839e : null;
        if (!(mVar2 == null || obj2 == null)) {
            mVar2.a(this.b, obj2, a);
        }
        if (this.f3995h == null) {
            this.f3995h = map;
        }
        return a;
    }
}
