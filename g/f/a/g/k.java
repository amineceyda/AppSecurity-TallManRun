package g.f.a.g;

import g.f.a.d.i;
import g.f.a.g.m.a;
import g.f.a.i.c;

public class k<T, ID> {
    public final c<T, ID> a;
    public final i<T, ID> b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public final g.f.a.c.c f3991d;

    /* renamed from: e  reason: collision with root package name */
    public a[] f3992e = new a[4];

    /* renamed from: f  reason: collision with root package name */
    public int f3993f;

    public k(c<T, ID> cVar, i<T, ID> iVar, g.f.a.c.c cVar2) {
        this.a = cVar;
        this.b = iVar;
        this.c = cVar.f4020g;
        this.f3991d = cVar2;
    }

    public String toString() {
        int i2 = this.f3993f;
        if (i2 == 0) {
            return "empty where clause";
        }
        a aVar = this.f3992e[i2 - 1];
        return "where clause: " + aVar;
    }
}
