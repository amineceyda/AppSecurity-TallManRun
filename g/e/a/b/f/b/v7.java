package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class v7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzab f3366d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f8 f3367e;

    public v7(f8 f8Var, zzp zzp, boolean z, zzab zzab, zzab zzab2) {
        this.f3367e = f8Var;
        this.b = zzp;
        this.c = z;
        this.f3366d = zzab;
    }

    public final void run() {
        f8 f8Var = this.f3367e;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Objects.requireNonNull(this.b, "null reference");
        this.f3367e.l(v2Var, this.c ? null : this.f3366d, this.b);
        this.f3367e.s();
    }
}
