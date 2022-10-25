package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class v1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3052f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3053g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3054h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ v0 f3055i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m2 f3056j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1(m2 m2Var, String str, String str2, boolean z, v0 v0Var) {
        super(m2Var, true);
        this.f3056j = m2Var;
        this.f3052f = str;
        this.f3053g = str2;
        this.f3054h = z;
        this.f3055i = v0Var;
    }

    public final void a() throws RemoteException {
        z0 z0Var = this.f3056j.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.getUserProperties(this.f3052f, this.f3053g, this.f3054h, this.f3055i);
    }

    public final void b() {
        this.f3055i.a((Bundle) null);
    }
}
