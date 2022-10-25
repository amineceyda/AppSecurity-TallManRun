package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.e.a.b.e.c.c1;

public final class u7 implements Runnable {
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3363d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3364e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3365f;

    public u7(AppMeasurementDynamiteService appMeasurementDynamiteService, c1 c1Var, String str, String str2, boolean z) {
        this.f3365f = appMeasurementDynamiteService;
        this.b = c1Var;
        this.c = str;
        this.f3363d = str2;
        this.f3364e = z;
    }

    public final void run() {
        f8 y = this.f3365f.a.y();
        c1 c1Var = this.b;
        String str = this.c;
        String str2 = this.f3363d;
        boolean z = this.f3364e;
        y.h();
        y.i();
        y.t(new g7(y, str, str2, y.q(false), z, c1Var));
    }
}
