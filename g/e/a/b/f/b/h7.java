package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;

public final class h7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzks f3178d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f8 f3179e;

    public h7(f8 f8Var, zzp zzp, boolean z, zzks zzks) {
        this.f3179e = f8Var;
        this.b = zzp;
        this.c = z;
        this.f3178d = zzks;
    }

    public final void run() {
        f8 f8Var = this.f3179e;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Discarding data. Failed to set user property");
            return;
        }
        Objects.requireNonNull(this.b, "null reference");
        this.f3179e.l(v2Var, this.c ? null : this.f3178d, this.b);
        this.f3179e.s();
    }
}
