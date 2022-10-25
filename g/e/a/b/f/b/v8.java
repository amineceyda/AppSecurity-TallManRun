package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class v8 implements Runnable {
    public final /* synthetic */ t9 b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public v8(AppMeasurementDynamiteService appMeasurementDynamiteService, t9 t9Var) {
        this.c = appMeasurementDynamiteService;
        this.b = t9Var;
    }

    public final void run() {
        this.c.a.v().x(this.b);
    }
}
