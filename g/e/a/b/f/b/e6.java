package g.e.a.b.f.b;

import java.util.concurrent.atomic.AtomicReference;

public final class e6 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3130d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3131e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q6 f3132f;

    public e6(q6 q6Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f3132f = q6Var;
        this.b = atomicReference;
        this.c = str;
        this.f3130d = str2;
        this.f3131e = z;
    }

    public final void run() {
        f8 y = this.f3132f.a.y();
        AtomicReference atomicReference = this.b;
        String str = this.c;
        String str2 = this.f3130d;
        boolean z = this.f3131e;
        y.h();
        y.i();
        y.t(new y7(y, atomicReference, str, str2, y.q(false), z));
    }
}
