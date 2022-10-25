package g.e.a.b.f.b;

import g.e.a.b.e.c.lc;

public final class f5 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3144d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f3145e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g5 f3146f;

    public f5(g5 g5Var, String str, String str2, String str3, long j2) {
        this.f3146f = g5Var;
        this.b = str;
        this.c = str2;
        this.f3144d = str3;
        this.f3145e = j2;
    }

    public final void run() {
        lc.b();
        if (this.f3146f.a.K().u((String) null, s2.r0)) {
            String str = this.b;
            if (str == null) {
                this.f3146f.a.q(this.c, (y6) null);
                return;
            }
            this.f3146f.a.q(this.c, new y6(this.f3144d, str, this.f3145e));
        } else if (this.b == null) {
            this.f3146f.a.f3238l.x().r(this.c, (y6) null);
        } else {
            f7 x = this.f3146f.a.f3238l.x();
            String str2 = this.c;
            x.h();
            synchronized (x) {
                String str3 = x.f3156m;
                if (str3 != null) {
                    boolean equals = str3.equals(str2);
                }
                x.f3156m = str2;
            }
        }
    }
}
