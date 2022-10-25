package g.e.a.b.g;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

public final class k implements j {
    public final Object a = new Object();
    public final int b;
    public final b0<Void> c;
    @GuardedBy("mLock")

    /* renamed from: d  reason: collision with root package name */
    public int f3435d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    public int f3436e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public int f3437f;
    @GuardedBy("mLock")

    /* renamed from: g  reason: collision with root package name */
    public Exception f3438g;
    @GuardedBy("mLock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f3439h;

    public k(int i2, b0<Void> b0Var) {
        this.b = i2;
        this.c = b0Var;
    }

    public final void a() {
        synchronized (this.a) {
            this.f3437f++;
            this.f3439h = true;
            b();
        }
    }

    @GuardedBy("mLock")
    public final void b() {
        if (this.f3435d + this.f3436e + this.f3437f != this.b) {
            return;
        }
        if (this.f3438g != null) {
            b0<Void> b0Var = this.c;
            int i2 = this.f3436e;
            int i3 = this.b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            b0Var.m(new ExecutionException(sb.toString(), this.f3438g));
        } else if (this.f3439h) {
            this.c.o();
        } else {
            this.c.n(null);
        }
    }

    public final void c(Object obj) {
        synchronized (this.a) {
            this.f3435d++;
            b();
        }
    }

    public final void d(Exception exc) {
        synchronized (this.a) {
            this.f3436e++;
            this.f3438g = exc;
            b();
        }
    }
}
