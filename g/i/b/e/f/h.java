package g.i.b.e.f;

import g.i.b.e.f.c.b.d;

public class h implements d, e {

    /* renamed from: e  reason: collision with root package name */
    public static volatile h f4214e;
    public e b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4215d = false;

    public final void a() {
        this.b.a();
    }

    public final void a(d dVar) {
        this.c = dVar;
    }

    public final void b() {
        this.b.b();
    }

    public final void b(String str, String str2) {
        this.c.b(str, str2);
    }

    public final void c() {
        this.c.c();
    }

    public final void c(String str, byte[] bArr, String str2) {
        this.c.c(str, bArr, str2);
    }

    public final synchronized void d() {
        if (!this.f4215d) {
            d e2 = d.e();
            this.b = e2;
            if (e2 != null) {
                e2.a(this);
                this.b.d();
            }
            this.f4215d = true;
        }
    }
}
