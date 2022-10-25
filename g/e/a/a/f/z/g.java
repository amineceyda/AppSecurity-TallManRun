package g.e.a.a.f.z;

import android.content.Context;
import android.os.Build;
import g.e.a.a.f.z.h.p;
import g.e.a.a.f.z.h.s;
import g.e.a.a.f.z.h.t;
import g.e.a.a.f.z.h.y;
import g.e.a.a.f.z.i.a0;
import h.a.a;

public final class g implements Object<y> {
    public final a<Context> a;
    public final a<a0> b;
    public final a<t> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<g.e.a.a.f.b0.a> f2798d;

    public g(a<Context> aVar, a<a0> aVar2, a<t> aVar3, a<g.e.a.a.f.b0.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2798d = aVar4;
    }

    public Object get() {
        Context context = this.a.get();
        a0 a0Var = this.b.get();
        t tVar = this.c.get();
        return Build.VERSION.SDK_INT >= 21 ? new s(context, a0Var, tVar) : new p(context, a0Var, this.f2798d.get(), tVar);
    }
}
