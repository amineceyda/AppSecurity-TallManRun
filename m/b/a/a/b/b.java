package m.b.a.a.b;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import m.b.a.a.a;
import m.b.a.a.b.g.c.b;
import m.b.a.a.b.g.c.f;
import m.b.a.a.b.h.c;
import m.b.a.a.b.h.d;

public class b implements a {

    /* renamed from: e  reason: collision with root package name */
    public static b f5248e;
    public final m.b.a.a.b.g.c.b a;
    public final f b = new f();
    public m.b.a.a.b.h.b c;

    /* renamed from: d  reason: collision with root package name */
    public Callable<Void> f5249d;

    public b(m.b.a.a.b.g.c.b bVar, d dVar) {
        this.a = bVar;
    }

    public m.b.a.a.b.h.b a() {
        String str = this.a.a.get("output");
        b.a valueOf = str == null ? b.a.file : b.a.valueOf(str);
        int ordinal = valueOf.ordinal();
        if (ordinal == 0) {
            return new m.b.a.a.b.h.a();
        }
        if (ordinal == 1) {
            return new m.b.a.a.b.h.f(d.a);
        }
        if (ordinal == 2) {
            return new d(d.a);
        }
        if (ordinal == 3) {
            return new c();
        }
        throw new AssertionError(valueOf);
    }

    public void b() {
        String str;
        try {
            String a2 = this.a.a("sessionid", (String) null);
            if (a2 == null) {
                try {
                    str = InetAddress.getLocalHost().getHostName();
                } catch (Exception unused) {
                    str = "unknownhost";
                }
                a2 = str + "-" + Integer.toHexString(m.b.a.a.b.g.c.a.a.nextInt());
            }
            this.b.c = a2;
            m.b.a.a.b.h.b a3 = a();
            this.c = a3;
            a3.a(this.a, this.b);
            if (this.a.b("jmx", false)) {
                this.f5249d = new e(this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
