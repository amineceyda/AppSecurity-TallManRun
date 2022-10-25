package g.e.a.b.e.c;

import android.os.RemoteException;
import java.util.Objects;

public final class p1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3016f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f3017g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(m2 m2Var, String str) {
        super(m2Var, true);
        this.f3017g = m2Var;
        this.f3016f = str;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3017g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.endAdUnitExposure(this.f3016f, this.c);
    }
}
