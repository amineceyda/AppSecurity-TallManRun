package g.e.a.b.f.b;

import android.os.Bundle;

public final class x5 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f3394d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Bundle f3395e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3396f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f3397g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3398h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3399i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q6 f3400j;

    public x5(q6 q6Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f3400j = q6Var;
        this.b = str;
        this.c = str2;
        this.f3394d = j2;
        this.f3395e = bundle;
        this.f3396f = z;
        this.f3397g = z2;
        this.f3398h = z3;
        this.f3399i = str3;
    }

    public final void run() {
        this.f3400j.q(this.b, this.c, this.f3394d, this.f3395e, this.f3396f, this.f3397g, this.f3398h, this.f3399i);
    }
}
