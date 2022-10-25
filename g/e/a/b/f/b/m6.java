package g.e.a.b.f.b;

public final class m6 implements Runnable {
    public final /* synthetic */ h b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f3246d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3247e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q6 f3248f;

    public m6(q6 q6Var, h hVar, int i2, long j2, boolean z) {
        this.f3248f = q6Var;
        this.b = hVar;
        this.c = i2;
        this.f3246d = j2;
        this.f3247e = z;
    }

    public final void run() {
        this.f3248f.y(this.b);
        q6.G(this.f3248f, this.b, this.c, this.f3246d, false, this.f3247e);
    }
}
