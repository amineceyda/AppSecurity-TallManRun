package g.e.a.b.f.b;

public final class n6 implements Runnable {
    public final /* synthetic */ h b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f3265d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3266e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q6 f3267f;

    public n6(q6 q6Var, h hVar, int i2, long j2, boolean z) {
        this.f3267f = q6Var;
        this.b = hVar;
        this.c = i2;
        this.f3265d = j2;
        this.f3266e = z;
    }

    public final void run() {
        this.f3267f.y(this.b);
        q6.G(this.f3267f, this.b, this.c, this.f3265d, false, this.f3266e);
    }
}
