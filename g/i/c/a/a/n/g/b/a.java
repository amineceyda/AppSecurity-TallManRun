package g.i.c.a.a.n.g.b;

import g.i.c.a.a.n.g.a.c;
import g.i.c.a.a.n.g.a.d;
import g.i.c.a.a.n.g.a.e;
import g.i.c.a.a.n.g.a.g;
import g.i.c.a.a.y.b;
import java.util.HashMap;
import java.util.Objects;

public class a {
    public long a;
    public long b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public long f4476d;

    /* renamed from: e  reason: collision with root package name */
    public b f4477e;

    /* renamed from: f  reason: collision with root package name */
    public int f4478f = -1;

    /* renamed from: g  reason: collision with root package name */
    public b f4479g;

    /* renamed from: h  reason: collision with root package name */
    public String f4480h;

    /* renamed from: g.i.c.a.a.n.g.b.a$a  reason: collision with other inner class name */
    public class C0172a implements Runnable {
        public C0172a() {
        }

        public void run() {
            a.this.e(true);
        }
    }

    public interface b {
    }

    public a(boolean z, long j2) {
        this.f4476d = j2;
        this.f4477e = new b(z, j2);
        b();
    }

    public final void a() {
        b bVar = this.f4479g;
        if (bVar != null) {
            String str = this.f4480h;
            long j2 = this.a;
            e eVar = (e) bVar;
            Objects.requireNonNull(eVar);
            HashMap hashMap = new HashMap();
            hashMap.put("dt_app_sessionid", str);
            hashMap.put("dt_app_foreground_heartbeat_duration", Long.valueOf(j2));
            g.a(hashMap);
            g.i.c.a.a.y.a.a(new c(eVar, str));
        }
    }

    public synchronized void b() {
        if (this.f4478f == 0) {
            d();
        }
        this.f4478f = -1;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.f4477e.a();
    }

    public synchronized void c() {
        if (this.f4478f == 0) {
            d();
        }
        this.f4478f = 0;
        g.i.c.a.a.y.b bVar = b.C0187b.a;
        C0172a aVar = new C0172a();
        long j2 = this.f4476d;
        this.c = bVar.a(aVar, j2, j2);
        this.f4477e.b();
    }

    public synchronized void d() {
        if (this.f4478f == 0) {
            this.f4478f = 1;
            b.C0187b.a.b(this.c);
            this.c = null;
            e(false);
        }
    }

    public final synchronized void e(boolean z) {
        long j2;
        long j3;
        this.f4477e.c();
        long j4 = this.a;
        b bVar = this.f4477e;
        synchronized (bVar) {
            j2 = bVar.c;
        }
        this.a = j4 + j2;
        long j5 = this.b;
        b bVar2 = this.f4477e;
        synchronized (bVar2) {
            j3 = bVar2.f4481d;
        }
        this.b = j5 + j3;
        this.f4477e.a();
        if (!z) {
            a();
        } else if (this.f4478f == 0) {
            this.f4477e.b();
            b bVar3 = this.f4479g;
            if (bVar3 != null) {
                String str = this.f4480h;
                long j6 = this.a;
                e eVar = (e) bVar3;
                Objects.requireNonNull(eVar);
                g.i.c.a.a.y.a.a(new d(eVar, str, j6));
            }
        }
    }
}
