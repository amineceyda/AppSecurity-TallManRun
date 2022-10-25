package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.e.a.b.e.c.c1;

public final class s9 implements Runnable {
    public final /* synthetic */ c1 b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public s9(AppMeasurementDynamiteService appMeasurementDynamiteService, c1 c1Var) {
        this.c = appMeasurementDynamiteService;
        this.b = c1Var;
    }

    public final void run() {
        this.c.a.A().B(this.b, this.c.a.a());
    }
}
