package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import g.e.a.b.e.c.c1;
import java.util.Objects;

public final class k7 implements Runnable {
    public final /* synthetic */ zzp b;
    public final /* synthetic */ c1 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f8 f3229d;

    public k7(f8 f8Var, zzp zzp, c1 c1Var) {
        this.f3229d = f8Var;
        this.b = zzp;
        this.c = c1Var;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f3229d.a.t().p().e(g.ANALYTICS_STORAGE)) {
                this.f3229d.a.d().f3141k.a("Analytics storage consent denied; will not get app instance id");
                this.f3229d.a.v().f3305g.set((Object) null);
                this.f3229d.a.t().f3340g.b((String) null);
            } else {
                f8 f8Var = this.f3229d;
                v2 v2Var = f8Var.f3157d;
                if (v2Var == null) {
                    f8Var.a.d().f3136f.a("Failed to get app instance id");
                } else {
                    Objects.requireNonNull(this.b, "null reference");
                    str = v2Var.o(this.b);
                    if (str != null) {
                        this.f3229d.a.v().f3305g.set(str);
                        this.f3229d.a.t().f3340g.b(str);
                    }
                    this.f3229d.s();
                }
            }
        } catch (RemoteException e2) {
            this.f3229d.a.d().f3136f.b("Failed to get app instance id", e2);
        } catch (Throwable th) {
            this.f3229d.a.A().H(this.c, (String) null);
            throw th;
        }
        this.f3229d.a.A().H(this.c, str);
    }
}
