package g.e.a.b.e.c;

import android.os.RemoteException;
import java.util.Objects;

public final class z1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c2 f3090f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f3091g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z1(m2 m2Var, c2 c2Var) {
        super(m2Var, true);
        this.f3091g = m2Var;
        this.f3090f = c2Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3091g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.registerOnMeasurementEventListener(this.f3090f);
    }
}
