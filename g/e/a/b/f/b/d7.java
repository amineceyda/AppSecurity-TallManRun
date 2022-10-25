package g.e.a.b.f.b;

public final class d7 implements Runnable {
    public final /* synthetic */ y6 b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f7 f3129d;

    public d7(f7 f7Var, y6 y6Var, long j2) {
        this.f3129d = f7Var;
        this.b = y6Var;
        this.c = j2;
    }

    public final void run() {
        this.f3129d.n(this.b, false, this.c);
        f7 f7Var = this.f3129d;
        f7Var.f3148e = null;
        f8 y = f7Var.a.y();
        y.h();
        y.i();
        y.t(new m7(y, (y6) null));
    }
}
