package androidx.lifecycle;

import e.k.d;
import e.k.e;
import e.k.f;
import e.k.h;
import e.k.l;

public class CompositeGeneratedAdaptersObserver implements f {
    public final d[] b;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.b = dVarArr;
    }

    public void d(h hVar, e.a aVar) {
        l lVar = new l();
        for (d a : this.b) {
            a.a(hVar, aVar, false, lVar);
        }
        for (d a2 : this.b) {
            a2.a(hVar, aVar, true, lVar);
        }
    }
}
