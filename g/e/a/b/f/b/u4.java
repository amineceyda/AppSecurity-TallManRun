package g.e.a.b.f.b;

import java.util.concurrent.Callable;

public final class u4 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g5 f3360d;

    public u4(g5 g5Var, String str, String str2, String str3) {
        this.f3360d = g5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object call() throws Exception {
        this.f3360d.a.a();
        k kVar = this.f3360d.a.c;
        k9.I(kVar);
        return kVar.K(this.a, this.b, this.c);
    }
}
