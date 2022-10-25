package androidx.lifecycle;

import e.k.c;
import e.k.e;
import e.k.f;
import e.k.h;

public class FullLifecycleObserverAdapter implements f {
    public final c b;
    public final f c;

    public FullLifecycleObserverAdapter(c cVar, f fVar) {
        this.b = cVar;
        this.c = fVar;
    }

    public void d(h hVar, e.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.b.c(hVar);
                break;
            case 1:
                this.b.f(hVar);
                break;
            case 2:
                this.b.a(hVar);
                break;
            case 3:
                this.b.e(hVar);
                break;
            case 4:
                this.b.g(hVar);
                break;
            case 5:
                this.b.b(hVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.c;
        if (fVar != null) {
            fVar.d(hVar, aVar);
        }
    }
}
