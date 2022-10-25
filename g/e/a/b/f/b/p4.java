package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzp;

public final class p4 implements Runnable {
    public final /* synthetic */ zzab b;
    public final /* synthetic */ zzp c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g5 f3290d;

    public p4(g5 g5Var, zzab zzab, zzp zzp) {
        this.f3290d = g5Var;
        this.b = zzab;
        this.c = zzp;
    }

    public final void run() {
        this.f3290d.a.a();
        if (this.b.zzc.c() == null) {
            this.f3290d.a.n(this.b, this.c);
        } else {
            this.f3290d.a.r(this.b, this.c);
        }
    }
}
