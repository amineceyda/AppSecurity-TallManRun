package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class a2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Long f2878f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2879g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2880h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f2881i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f2882j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f2883k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m2 f2884l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2(m2 m2Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(m2Var, true);
        this.f2884l = m2Var;
        this.f2878f = l2;
        this.f2879g = str;
        this.f2880h = str2;
        this.f2881i = bundle;
        this.f2882j = z;
        this.f2883k = z2;
    }

    public final void a() throws RemoteException {
        Long l2 = this.f2878f;
        long longValue = l2 == null ? this.b : l2.longValue();
        z0 z0Var = this.f2884l.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.logEvent(this.f2879g, this.f2880h, this.f2881i, this.f2882j, this.f2883k, longValue);
    }
}
