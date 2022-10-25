package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import g.e.a.b.e.c.c1;
import java.util.List;
import java.util.Objects;

public final class g7 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzp f3174d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3175e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f3176f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f8 f3177g;

    public g7(f8 f8Var, String str, String str2, zzp zzp, boolean z, c1 c1Var) {
        this.f3177g = f8Var;
        this.b = str;
        this.c = str2;
        this.f3174d = zzp;
        this.f3175e = z;
        this.f3176f = c1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e2;
        Bundle bundle2 = new Bundle();
        try {
            f8 f8Var = this.f3177g;
            v2 v2Var = f8Var.f3157d;
            if (v2Var == null) {
                f8Var.a.d().f3136f.c("Failed to get user properties; not connected to service", this.b, this.c);
                this.f3177g.a.A().D(this.f3176f, bundle2);
                return;
            }
            Objects.requireNonNull(this.f3174d, "null reference");
            List<zzks> f2 = v2Var.f(this.b, this.c, this.f3175e, this.f3174d);
            bundle = new Bundle();
            if (f2 != null) {
                for (zzks zzks : f2) {
                    String str = zzks.zze;
                    if (str != null) {
                        bundle.putString(zzks.zzb, str);
                    } else {
                        Long l2 = zzks.zzd;
                        if (l2 != null) {
                            bundle.putLong(zzks.zzb, l2.longValue());
                        } else {
                            Double d2 = zzks.zzg;
                            if (d2 != null) {
                                bundle.putDouble(zzks.zzb, d2.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f3177g.s();
                this.f3177g.a.A().D(this.f3176f, bundle);
            } catch (RemoteException e3) {
                e2 = e3;
                try {
                    this.f3177g.a.d().f3136f.c("Failed to get user properties; remote exception", this.b, e2);
                    this.f3177g.a.A().D(this.f3176f, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f3177g.a.A().D(this.f3176f, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e2 = e4;
            this.f3177g.a.d().f3136f.c("Failed to get user properties; remote exception", this.b, e2);
            this.f3177g.a.A().D(this.f3176f, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f3177g.a.A().D(this.f3176f, bundle2);
            throw th;
        }
    }
}
