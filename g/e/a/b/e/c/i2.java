package g.e.a.b.e.c;

import android.app.Activity;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class i2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f2952f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l2 f2953g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2(l2 l2Var, Activity activity) {
        super(l2Var.b, true);
        this.f2953g = l2Var;
        this.f2952f = activity;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2953g.b.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.onActivityStopped(new b(this.f2952f), this.c);
    }
}
