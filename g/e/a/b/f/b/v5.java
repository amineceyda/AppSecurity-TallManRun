package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.e.a.b.e.c.c1;

public final class v5 implements Runnable {
    public final /* synthetic */ c1 b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public v5(AppMeasurementDynamiteService appMeasurementDynamiteService, c1 c1Var) {
        this.c = appMeasurementDynamiteService;
        this.b = c1Var;
    }

    public final void run() {
        f8 y = this.c.a.y();
        c1 c1Var = this.b;
        y.h();
        y.i();
        y.t(new k7(y, y.q(false), c1Var));
    }
}
