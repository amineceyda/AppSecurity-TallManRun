package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class j1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f2961f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f2962g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(m2 m2Var, Bundle bundle) {
        super(m2Var, true);
        this.f2962g = m2Var;
        this.f2961f = bundle;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2962g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.setConditionalUserProperty(this.f2961f, this.b);
    }
}
