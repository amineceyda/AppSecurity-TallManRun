package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;

public final class c5 implements Runnable {
    public final /* synthetic */ zzks b;
    public final /* synthetic */ zzp c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g5 f3119d;

    public c5(g5 g5Var, zzks zzks, zzp zzp) {
        this.f3119d = g5Var;
        this.b = zzks;
        this.c = zzp;
    }

    public final void run() {
        this.f3119d.a.a();
        if (this.b.c() == null) {
            this.f3119d.a.o(this.b, this.c);
        } else {
            this.f3119d.a.t(this.b, this.c);
        }
    }
}
