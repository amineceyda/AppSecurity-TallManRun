package g.e.a.b.e.c;

import android.os.RemoteException;
import java.util.Objects;

public final class o1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3013f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f3014g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o1(m2 m2Var, String str) {
        super(m2Var, true);
        this.f3014g = m2Var;
        this.f3013f = str;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3014g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.beginAdUnitExposure(this.f3013f, this.c);
    }
}
