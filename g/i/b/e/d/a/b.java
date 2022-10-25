package g.i.b.e.d.a;

import g.h.a.a;
import java.net.URL;

public final class b {
    public boolean a;
    public boolean b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public int f4141d;

    /* renamed from: e  reason: collision with root package name */
    public URL f4142e;

    /* renamed from: f  reason: collision with root package name */
    public String f4143f;

    /* renamed from: g  reason: collision with root package name */
    public int f4144g;

    public b(URL url, String str) {
        boolean z = false;
        this.a = a.b("direct_access_use_schedule", 0, 1, 1) == 1;
        this.b = a.b("direct_https_use_sche", 0, 1, 1) == 1 ? true : z;
        this.c = "";
        this.f4141d = a.b("direct_access_domain_try_times", 1, 8, 2);
        this.f4142e = url;
        this.f4143f = str;
    }
}
