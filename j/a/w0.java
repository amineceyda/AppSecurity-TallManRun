package j.a;

import g.a.a.a.a;
import g.c.b.b.f;
import i.j;
import i.o.b.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class w0 extends z0<y0> {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4664g = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: f  reason: collision with root package name */
    public final l<Throwable, j> f4665f;

    public w0(y0 y0Var, l<? super Throwable, j> lVar) {
        super(y0Var);
        this.f4665f = lVar;
    }

    public /* bridge */ /* synthetic */ Object g(Object obj) {
        n((Throwable) obj);
        return j.a;
    }

    public void n(Throwable th) {
        if (f4664g.compareAndSet(this, 0, 1)) {
            this.f4665f.g(th);
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("InvokeOnCancelling[");
        i2.append(w0.class.getSimpleName());
        i2.append('@');
        i2.append(f.E(this));
        i2.append(']');
        return i2.toString();
    }
}
