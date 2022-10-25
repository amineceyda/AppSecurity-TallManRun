package g.e.a.b.f.b;

import android.os.Bundle;

public final class a7 implements Runnable {
    public final /* synthetic */ y6 b;
    public final /* synthetic */ y6 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f3107d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3108e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f7 f3109f;

    public a7(f7 f7Var, y6 y6Var, y6 y6Var2, long j2, boolean z) {
        this.f3109f = f7Var;
        this.b = y6Var;
        this.c = y6Var2;
        this.f3107d = j2;
        this.f3108e = z;
    }

    public final void run() {
        this.f3109f.m(this.b, this.c, this.f3107d, this.f3108e, (Bundle) null);
    }
}
