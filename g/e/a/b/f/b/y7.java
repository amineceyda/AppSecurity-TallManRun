package g.e.a.b.f.b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class y7 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3415d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzp f3416e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3417f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f8 f3418g;

    public y7(f8 f8Var, AtomicReference atomicReference, String str, String str2, zzp zzp, boolean z) {
        this.f3418g = f8Var;
        this.b = atomicReference;
        this.c = str;
        this.f3415d = str2;
        this.f3416e = zzp;
        this.f3417f = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List h2;
        synchronized (this.b) {
            try {
                f8 f8Var = this.f3418g;
                v2 v2Var = f8Var.f3157d;
                if (v2Var == null) {
                    f8Var.a.d().f3136f.d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.c, this.f3415d);
                    this.b.set(Collections.emptyList());
                    this.b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f3416e, "null reference");
                    atomicReference2 = this.b;
                    h2 = v2Var.f(this.c, this.f3415d, this.f3417f, this.f3416e);
                } else {
                    atomicReference2 = this.b;
                    h2 = v2Var.h((String) null, this.c, this.f3415d, this.f3417f);
                }
                atomicReference2.set(h2);
                this.f3418g.s();
                atomicReference = this.b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3418g.a.d().f3136f.d("(legacy) Failed to get user properties; remote exception", (Object) null, this.c, e2);
                    this.b.set(Collections.emptyList());
                    atomicReference = this.b;
                } catch (Throwable th) {
                    this.b.notify();
                    throw th;
                }
            }
        }
    }
}
