package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class r1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v0 f3043f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m2 f3044g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1(m2 m2Var, v0 v0Var) {
        super(m2Var, true);
        this.f3044g = m2Var;
        this.f3043f = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3044g.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.getCachedAppInstanceId(this.f3043f);
    }

    public final void b() {
        this.f3043f.a((Bundle) null);
    }
}
