package g.e.a.a.f.z.i;

import android.content.Context;
import h.a.a;

public final class k0 implements Object<j0> {
    public final a<Context> a;
    public final a<String> b;
    public final a<Integer> c;

    public k0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new j0(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
