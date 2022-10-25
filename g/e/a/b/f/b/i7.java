package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class i7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ f8 c;

    public i7(f8 f8Var, zzp zzp) {
        this.c = f8Var;
        this.b = zzp;
    }

    public final void run() {
        f8 f8Var = this.c;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Objects.requireNonNull(this.b, "null reference");
            v2Var.i(this.b);
        } catch (RemoteException e2) {
            this.c.a.d().f3136f.b("Failed to reset data on the service: remote exception", e2);
        }
        this.c.s();
    }
}
