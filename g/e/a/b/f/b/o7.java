package g.e.a.b.f.b;

public final class o7 extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f8 f3277e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o7(f8 f8Var, j5 j5Var) {
        super(j5Var);
        this.f3277e = f8Var;
    }

    public final void b() {
        f8 f8Var = this.f3277e;
        f8Var.h();
        if (f8Var.n()) {
            f8Var.a.d().n.a("Inactivity, disconnecting from the service");
            f8Var.x();
        }
    }
}
