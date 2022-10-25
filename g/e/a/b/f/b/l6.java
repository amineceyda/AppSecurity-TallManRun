package g.e.a.b.f.b;

public final class l6 implements Runnable {
    public final /* synthetic */ h b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3241d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f3242e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3243f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q6 f3244g;

    public l6(q6 q6Var, h hVar, long j2, int i2, long j3, boolean z) {
        this.f3244g = q6Var;
        this.b = hVar;
        this.c = j2;
        this.f3241d = i2;
        this.f3242e = j3;
        this.f3243f = z;
    }

    public final void run() {
        this.f3244g.y(this.b);
        this.f3244g.r(this.c, false);
        q6.G(this.f3244g, this.b, this.f3241d, this.f3242e, true, this.f3243f);
    }
}
