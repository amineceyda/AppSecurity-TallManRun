package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.e.a.b.e.c.f1;

public final class u9 implements n5 {
    public final f1 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public u9(AppMeasurementDynamiteService appMeasurementDynamiteService, f1 f1Var) {
        this.b = appMeasurementDynamiteService;
        this.a = f1Var;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        try {
            this.a.d(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            n4 n4Var = this.b.a;
            if (n4Var != null) {
                n4Var.d().f3139i.b("Event listener threw exception", e2);
            }
        }
    }
}
