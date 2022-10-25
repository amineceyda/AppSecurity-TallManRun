package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class q1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v0 f3020f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f3021g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(m2 m2Var, v0 v0Var) {
        super(m2Var, true);
        this.f3021g = m2Var;
        this.f3020f = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3021g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.getGmpAppId(this.f3020f);
    }

    public final void b() {
        this.f3020f.a((Bundle) null);
    }
}
