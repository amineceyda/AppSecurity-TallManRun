package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class g9 implements Callable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ k9 b;

    public g9(k9 k9Var, zzp zzp) {
        this.b = k9Var;
        this.a = zzp;
    }

    public final Object call() throws Exception {
        k9 k9Var = this.b;
        String str = this.a.zza;
        Objects.requireNonNull(str, "null reference");
        h L = k9Var.L(str);
        g gVar = g.ANALYTICS_STORAGE;
        if (L.e(gVar) && h.b(this.a.zzv).e(gVar)) {
            return this.b.J(this.a).M();
        }
        this.b.d().n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
