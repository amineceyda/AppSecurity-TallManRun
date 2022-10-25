package g.e.a.b.f.b;

import java.util.concurrent.atomic.AtomicReference;

public final class d6 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3127d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q6 f3128e;

    public d6(q6 q6Var, AtomicReference atomicReference, String str, String str2) {
        this.f3128e = q6Var;
        this.b = atomicReference;
        this.c = str;
        this.f3127d = str2;
    }

    public final void run() {
        f8 y = this.f3128e.a.y();
        AtomicReference atomicReference = this.b;
        String str = this.c;
        String str2 = this.f3127d;
        y.h();
        y.i();
        y.t(new w7(y, atomicReference, str, str2, y.q(false)));
    }
}
