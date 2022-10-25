package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class y1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3086f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ v0 f3087g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m2 f3088h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y1(m2 m2Var, String str, v0 v0Var) {
        super(m2Var, true);
        this.f3088h = m2Var;
        this.f3086f = str;
        this.f3087g = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3088h.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.getMaxUserProperties(this.f3086f, this.f3087g);
    }

    public final void b() {
        this.f3087g.a((Bundle) null);
    }
}
