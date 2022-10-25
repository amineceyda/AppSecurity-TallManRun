package g.e.a.b.e.c;

import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class w1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3063f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3064g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m2 f3065h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w1(m2 m2Var, String str, Object obj) {
        super(m2Var, false);
        this.f3065h = m2Var;
        this.f3063f = str;
        this.f3064g = obj;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3065h.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.logHealthData(5, this.f3063f, new b(this.f3064g), new b(null), new b(null));
    }
}
