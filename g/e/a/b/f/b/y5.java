package g.e.a.b.f.b;

public final class y5 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3409d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f3410e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q6 f3411f;

    public y5(q6 q6Var, String str, String str2, Object obj, long j2) {
        this.f3411f = q6Var;
        this.b = str;
        this.c = str2;
        this.f3409d = obj;
        this.f3410e = j2;
    }

    public final void run() {
        this.f3411f.B(this.b, this.c, this.f3409d, this.f3410e);
    }
}
