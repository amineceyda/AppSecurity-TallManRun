package g.e.a.b.f.b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class j7 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ zzp c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f8 f3206d;

    public j7(f8 f8Var, AtomicReference atomicReference, zzp zzp) {
        this.f3206d = f8Var;
        this.b = atomicReference;
        this.c = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.b) {
            try {
                if (!this.f3206d.a.t().p().e(g.ANALYTICS_STORAGE)) {
                    this.f3206d.a.d().f3141k.a("Analytics storage consent denied; will not get app instance id");
                    this.f3206d.a.v().f3305g.set((Object) null);
                    this.f3206d.a.t().f3340g.b((String) null);
                    this.b.set((Object) null);
                    this.b.notify();
                    return;
                }
                f8 f8Var = this.f3206d;
                v2 v2Var = f8Var.f3157d;
                if (v2Var == null) {
                    f8Var.a.d().f3136f.a("Failed to get app instance id");
                    this.b.notify();
                    return;
                }
                Objects.requireNonNull(this.c, "null reference");
                this.b.set(v2Var.o(this.c));
                String str = (String) this.b.get();
                if (str != null) {
                    this.f3206d.a.v().f3305g.set(str);
                    this.f3206d.a.t().f3340g.b(str);
                }
                this.f3206d.s();
                atomicReference = this.b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3206d.a.d().f3136f.b("Failed to get app instance id", e2);
                    atomicReference = this.b;
                } catch (Throwable th) {
                    this.b.notify();
                    throw th;
                }
            }
        }
    }
}
