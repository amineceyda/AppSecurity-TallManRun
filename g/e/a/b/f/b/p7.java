package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzau;
import g.e.a.b.e.c.c1;

public final class p7 implements Runnable {
    public final /* synthetic */ zzau b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c1 f3298d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f8 f3299e;

    public p7(f8 f8Var, zzau zzau, String str, c1 c1Var) {
        this.f3299e = f8Var;
        this.b = zzau;
        this.c = str;
        this.f3298d = c1Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            f8 f8Var = this.f3299e;
            v2 v2Var = f8Var.f3157d;
            if (v2Var == null) {
                f8Var.a.d().f3136f.a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = v2Var.x(this.b, this.c);
                this.f3299e.s();
            }
        } catch (RemoteException e2) {
            this.f3299e.a.d().f3136f.b("Failed to send event to the service to bundle", e2);
        } catch (Throwable th) {
            this.f3299e.a.A().E(this.f3298d, bArr);
            throw th;
        }
        this.f3299e.a.A().E(this.f3298d, bArr);
    }
}
