package g.e.a.a.f.z.i;

import h.a.a;
import java.util.Objects;

public final class i0 implements Object<h0> {
    public final a<g.e.a.a.f.b0.a> a;
    public final a<g.e.a.a.f.b0.a> b;
    public final a<b0> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<j0> f2824d;

    /* renamed from: e  reason: collision with root package name */
    public final a<String> f2825e;

    public i0(a<g.e.a.a.f.b0.a> aVar, a<g.e.a.a.f.b0.a> aVar2, a<b0> aVar3, a<j0> aVar4, a<String> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2824d = aVar4;
        this.f2825e = aVar5;
    }

    public Object get() {
        g.e.a.a.f.w.b.a aVar;
        g.e.a.a.f.b0.a aVar2 = this.a.get();
        g.e.a.a.f.b0.a aVar3 = this.b.get();
        b0 b0Var = this.c.get();
        j0 j0Var = this.f2824d.get();
        a<String> aVar4 = this.f2825e;
        Object obj = g.e.a.a.f.w.b.a.c;
        if (aVar4 instanceof g.e.a.a.f.w.a) {
            aVar = (g.e.a.a.f.w.a) aVar4;
        } else {
            Objects.requireNonNull(aVar4);
            aVar = new g.e.a.a.f.w.b.a(aVar4);
        }
        return new h0(aVar2, aVar3, b0Var, j0Var, aVar);
    }
}
