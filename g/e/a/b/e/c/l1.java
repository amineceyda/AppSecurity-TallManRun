package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class l1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2984f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2985g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ v0 f2986h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m2 f2987i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(m2 m2Var, String str, String str2, v0 v0Var) {
        super(m2Var, true);
        this.f2987i = m2Var;
        this.f2984f = str;
        this.f2985g = str2;
        this.f2986h = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2987i.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.getConditionalUserProperties(this.f2984f, this.f2985g, this.f2986h);
    }

    public final void b() {
        this.f2986h.a((Bundle) null);
    }
}
