package g.i.b.e.f;

import g.i.b.e.f.a.b;
import g.i.b.e.f.a.c;
import g.i.b.e.f.a.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class i implements b, d {

    /* renamed from: d  reason: collision with root package name */
    public static volatile i f4216d;
    public Map<String, b> b;
    public e c;

    public i() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.b = concurrentHashMap;
        concurrentHashMap.put("state", new d());
        this.b.put("settings", new c());
        this.b.put("accessscheduler", new g.i.b.e.f.a.a.b());
    }

    public static i e() {
        if (f4216d == null) {
            synchronized (i.class) {
                if (f4216d == null) {
                    f4216d = new i();
                }
            }
        }
        return f4216d;
    }

    public final void a() {
        this.c.a();
    }

    public final void b() {
        this.c.b();
    }

    public final void b(String str, String str2) {
        for (b b2 : this.b.values()) {
            b2.b(str, str2);
        }
    }

    public final void c() {
        for (b c2 : this.b.values()) {
            c2.c();
        }
    }

    public final void c(String str, byte[] bArr, String str2) {
        for (b c2 : this.b.values()) {
            c2.c(str, bArr, str2);
        }
    }

    public final f f() {
        return (f) this.b.get("accessscheduler");
    }
}
