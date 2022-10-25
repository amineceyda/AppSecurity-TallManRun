package g.e.a.b.f.b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class w7 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3387d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzp f3388e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f8 f3389f;

    public w7(f8 f8Var, AtomicReference atomicReference, String str, String str2, zzp zzp) {
        this.f3389f = f8Var;
        this.b = atomicReference;
        this.c = str;
        this.f3387d = str2;
        this.f3388e = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List r;
        synchronized (this.b) {
            try {
                f8 f8Var = this.f3389f;
                v2 v2Var = f8Var.f3157d;
                if (v2Var == null) {
                    f8Var.a.d().f3136f.d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.c, this.f3387d);
                    this.b.set(Collections.emptyList());
                    this.b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f3388e, "null reference");
                    atomicReference2 = this.b;
                    r = v2Var.u(this.c, this.f3387d, this.f3388e);
                } else {
                    atomicReference2 = this.b;
                    r = v2Var.r((String) null, this.c, this.f3387d);
                }
                atomicReference2.set(r);
                this.f3389f.s();
                atomicReference = this.b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3389f.a.d().f3136f.d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.c, e2);
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
