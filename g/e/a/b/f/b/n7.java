package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class n7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f8 f3268d;

    public n7(f8 f8Var, zzp zzp, Bundle bundle) {
        this.f3268d = f8Var;
        this.b = zzp;
        this.c = bundle;
    }

    public final void run() {
        f8 f8Var = this.f3268d;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Failed to send default event parameters to service");
            return;
        }
        try {
            Objects.requireNonNull(this.b, "null reference");
            v2Var.e(this.c, this.b);
        } catch (RemoteException e2) {
            this.f3268d.a.d().f3136f.b("Failed to send default event parameters to service", e2);
        }
    }
}
