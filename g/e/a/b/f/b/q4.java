package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class q4 implements Runnable {
    public final /* synthetic */ zzab b;
    public final /* synthetic */ g5 c;

    public q4(g5 g5Var, zzab zzab) {
        this.c = g5Var;
        this.b = zzab;
    }

    public final void run() {
        this.c.a.a();
        if (this.b.zzc.c() == null) {
            k9 k9Var = this.c.a;
            zzab zzab = this.b;
            Objects.requireNonNull(k9Var);
            String str = zzab.zza;
            Objects.requireNonNull(str, "null reference");
            zzp z = k9Var.z(str);
            if (z != null) {
                k9Var.n(zzab, z);
                return;
            }
            return;
        }
        k9 k9Var2 = this.c.a;
        zzab zzab2 = this.b;
        Objects.requireNonNull(k9Var2);
        String str2 = zzab2.zza;
        Objects.requireNonNull(str2, "null reference");
        zzp z2 = k9Var2.z(str2);
        if (z2 != null) {
            k9Var2.r(zzab2, z2);
        }
    }
}
