package g.e.a.b.e.c;

import android.app.Activity;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class m1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f2991f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2992g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2993h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m2 f2994i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(m2 m2Var, Activity activity, String str, String str2) {
        super(m2Var, true);
        this.f2994i = m2Var;
        this.f2991f = activity;
        this.f2992g = str;
        this.f2993h = str2;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f2994i.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.setCurrentScreen(new b(this.f2991f), this.f2992g, this.f2993h, this.b);
    }
}
