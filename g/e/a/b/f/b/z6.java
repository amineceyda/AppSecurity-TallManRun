package g.e.a.b.f.b;

import android.os.Bundle;
import java.util.List;

public final class z6 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ y6 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y6 f3424d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f3425e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f7 f3426f;

    public z6(f7 f7Var, Bundle bundle, y6 y6Var, y6 y6Var2, long j2) {
        this.f3426f = f7Var;
        this.b = bundle;
        this.c = y6Var;
        this.f3424d = y6Var2;
        this.f3425e = j2;
    }

    public final void run() {
        f7 f7Var = this.f3426f;
        Bundle bundle = this.b;
        y6 y6Var = this.c;
        y6 y6Var2 = this.f3424d;
        long j2 = this.f3425e;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        f7Var.m(y6Var, y6Var2, j2, true, f7Var.a.A().r0((String) null, "screen_view", bundle, (List) null, false));
    }
}
