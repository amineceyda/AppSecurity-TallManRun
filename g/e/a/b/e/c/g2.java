package g.e.a.b.e.c;

import android.app.Activity;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class g2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f2930f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l2 f2931g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2(l2 l2Var, Activity activity) {
        super(l2Var.b, true);
        this.f2931g = l2Var;
        this.f2930f = activity;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2931g.b.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.onActivityPaused(new b(this.f2930f), this.c);
    }
}
