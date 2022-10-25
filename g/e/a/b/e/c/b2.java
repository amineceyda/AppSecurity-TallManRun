package g.e.a.b.e.c;

import android.os.RemoteException;
import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.Objects;

public abstract class b2 implements Runnable {
    public final long b = System.currentTimeMillis();
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2896d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m2 f2897e;

    public b2(m2 m2Var, boolean z) {
        this.f2897e = m2Var;
        Objects.requireNonNull((c) m2Var.b);
        Objects.requireNonNull((c) m2Var.b);
        this.c = SystemClock.elapsedRealtime();
        this.f2896d = z;
    }

    public abstract void a() throws RemoteException;

    public void b() {
    }

    public final void run() {
        if (this.f2897e.f2999g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e2) {
            this.f2897e.a(e2, false, this.f2896d);
            b();
        }
    }
}
