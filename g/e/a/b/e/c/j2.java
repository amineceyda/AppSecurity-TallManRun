package g.e.a.b.e.c;

import android.app.Activity;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class j2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f2963f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ v0 f2964g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l2 f2965h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, Activity activity, v0 v0Var) {
        super(l2Var.b, true);
        this.f2965h = l2Var;
        this.f2963f = activity;
        this.f2964g = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2965h.b.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.onActivitySaveInstanceState(new b(this.f2963f), this.f2964g, this.c);
    }
}
