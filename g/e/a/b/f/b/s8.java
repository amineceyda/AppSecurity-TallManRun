package g.e.a.b.f.b;

import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.Objects;

public final class s8 extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t8 f3352e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s8(t8 t8Var, j5 j5Var) {
        super(j5Var);
        this.f3352e = t8Var;
    }

    public final void b() {
        t8 t8Var = this.f3352e;
        t8Var.f3359d.h();
        Objects.requireNonNull((c) t8Var.f3359d.a.n);
        t8Var.a(false, false, SystemClock.elapsedRealtime());
        z1 n = t8Var.f3359d.a.n();
        Objects.requireNonNull((c) t8Var.f3359d.a.n);
        n.k(SystemClock.elapsedRealtime());
    }
}
