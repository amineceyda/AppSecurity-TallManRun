package e.h.b;

import androidx.fragment.app.Fragment;
import e.k.e;
import e.k.i;
import e.k.y;
import e.k.z;
import e.p.a;
import e.p.b;
import e.p.c;

public class o0 implements c, z {
    public final y b;
    public i c = null;

    /* renamed from: d  reason: collision with root package name */
    public b f1489d = null;

    public o0(Fragment fragment, y yVar) {
        this.b = yVar;
    }

    public void a(e.a aVar) {
        i iVar = this.c;
        iVar.d("handleLifecycleEvent");
        iVar.g(aVar.a());
    }

    public void c() {
        if (this.c == null) {
            this.c = new i(this);
            this.f1489d = new b(this);
        }
    }

    public e getLifecycle() {
        c();
        return this.c;
    }

    public a getSavedStateRegistry() {
        c();
        return this.f1489d.b;
    }

    public y getViewModelStore() {
        c();
        return this.b;
    }
}
