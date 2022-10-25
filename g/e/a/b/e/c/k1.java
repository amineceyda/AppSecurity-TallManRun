package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class k1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2966f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2967g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f2968h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m2 f2969i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(m2 m2Var, String str, String str2, Bundle bundle) {
        super(m2Var, true);
        this.f2969i = m2Var;
        this.f2966f = str;
        this.f2967g = str2;
        this.f2968h = bundle;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2969i.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.clearConditionalUserProperty(this.f2966f, this.f2967g, this.f2968h);
    }
}
