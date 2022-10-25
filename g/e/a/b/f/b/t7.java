package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class t7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzau f3357d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f8 f3358e;

    public t7(f8 f8Var, zzp zzp, boolean z, zzau zzau, String str) {
        this.f3358e = f8Var;
        this.b = zzp;
        this.c = z;
        this.f3357d = zzau;
    }

    public final void run() {
        f8 f8Var = this.f3358e;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Discarding data. Failed to send event to service");
            return;
        }
        Objects.requireNonNull(this.b, "null reference");
        this.f3358e.l(v2Var, this.c ? null : this.f3357d, this.b);
        this.f3358e.s();
    }
}
