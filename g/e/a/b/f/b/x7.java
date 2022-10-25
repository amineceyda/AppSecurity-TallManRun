package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import g.e.a.b.e.c.c1;
import java.util.ArrayList;
import java.util.Objects;

public final class x7 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzp f3401d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c1 f3402e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f8 f3403f;

    public x7(f8 f8Var, String str, String str2, zzp zzp, c1 c1Var) {
        this.f3403f = f8Var;
        this.b = str;
        this.c = str2;
        this.f3401d = zzp;
        this.f3402e = c1Var;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            f8 f8Var = this.f3403f;
            v2 v2Var = f8Var.f3157d;
            if (v2Var == null) {
                f8Var.a.d().f3136f.c("Failed to get conditional properties; not connected to service", this.b, this.c);
            } else {
                Objects.requireNonNull(this.f3401d, "null reference");
                arrayList = q9.t(v2Var.u(this.b, this.c, this.f3401d));
                this.f3403f.s();
            }
        } catch (RemoteException e2) {
            this.f3403f.a.d().f3136f.d("Failed to get conditional properties; remote exception", this.b, this.c, e2);
        } catch (Throwable th) {
            this.f3403f.a.A().C(this.f3402e, arrayList);
            throw th;
        }
        this.f3403f.a.A().C(this.f3402e, arrayList);
    }
}
