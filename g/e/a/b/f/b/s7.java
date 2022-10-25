package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class s7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ f8 c;

    public s7(f8 f8Var, zzp zzp) {
        this.c = f8Var;
        this.b = zzp;
    }

    public final void run() {
        f8 f8Var = this.c;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Failed to send consent settings to service");
            return;
        }
        try {
            Objects.requireNonNull(this.b, "null reference");
            v2Var.b(this.b);
            this.c.s();
        } catch (RemoteException e2) {
            this.c.a.d().f3136f.b("Failed to send consent settings to the service", e2);
        }
    }
}
