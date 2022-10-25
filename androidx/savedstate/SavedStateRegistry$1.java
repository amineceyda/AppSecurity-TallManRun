package androidx.savedstate;

import e.k.e;
import e.k.f;
import e.k.h;
import e.p.a;

public class SavedStateRegistry$1 implements f {
    public final /* synthetic */ a b;

    public SavedStateRegistry$1(a aVar) {
        this.b = aVar;
    }

    public void d(h hVar, e.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == e.a.ON_START) {
            aVar2 = this.b;
            z = true;
        } else if (aVar == e.a.ON_STOP) {
            aVar2 = this.b;
            z = false;
        } else {
            return;
        }
        aVar2.f1540e = z;
    }
}
