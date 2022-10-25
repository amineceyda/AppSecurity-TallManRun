package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.e.a.b.e.c.c1;

public final class r9 implements Runnable {
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3325d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3326e;

    public r9(AppMeasurementDynamiteService appMeasurementDynamiteService, c1 c1Var, String str, String str2) {
        this.f3326e = appMeasurementDynamiteService;
        this.b = c1Var;
        this.c = str;
        this.f3325d = str2;
    }

    public final void run() {
        f8 y = this.f3326e.a.y();
        c1 c1Var = this.b;
        String str = this.c;
        String str2 = this.f3325d;
        y.h();
        y.i();
        y.t(new x7(y, str, str2, y.q(false), c1Var));
    }
}
