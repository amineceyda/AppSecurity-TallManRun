package g.e.a.b.f.b;

import android.content.ComponentName;
import android.content.Context;

public final class c8 implements Runnable {
    public final /* synthetic */ e8 b;

    public c8(e8 e8Var) {
        this.b = e8Var;
    }

    public final void run() {
        f8 f8Var = this.b.c;
        Context context = f8Var.a.a;
        b bVar = this.b.c.a.f3257f;
        f8.v(f8Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
