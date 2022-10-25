package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzau;
import g.e.a.b.b.b;
import g.e.a.b.e.c.c1;
import java.util.Objects;

public final class u6 implements Runnable {
    public final /* synthetic */ c1 b;
    public final /* synthetic */ zzau c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3361d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3362e;

    public u6(AppMeasurementDynamiteService appMeasurementDynamiteService, c1 c1Var, zzau zzau, String str) {
        this.f3362e = appMeasurementDynamiteService;
        this.b = c1Var;
        this.c = zzau;
        this.f3361d = str;
    }

    public final void run() {
        f8 y = this.f3362e.a.y();
        c1 c1Var = this.b;
        zzau zzau = this.c;
        String str = this.f3361d;
        y.h();
        y.i();
        q9 A = y.a.A();
        Objects.requireNonNull(A);
        if (b.b.a(A.a.a, 12451000) != 0) {
            y.a.d().f3139i.a("Not bundling data. Service unavailable or out of date");
            y.a.A().E(c1Var, new byte[0]);
            return;
        }
        y.t(new p7(y, zzau, str, c1Var));
    }
}
