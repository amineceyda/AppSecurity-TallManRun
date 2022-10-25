package g.e.a.b.e.c;

import android.app.Activity;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class f2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f2925f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l2 f2926g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f2(l2 l2Var, Activity activity) {
        super(l2Var.b, true);
        this.f2926g = l2Var;
        this.f2925f = activity;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2926g.b.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.onActivityResumed(new b(this.f2925f), this.c);
    }
}
