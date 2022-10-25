package g.i.c.a.a.n.g.a;

import android.os.SystemClock;
import g.i.c.a.a.b0.f;
import g.i.c.a.a.m.c;
import g.i.c.a.a.n.g.b.a;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.n;
import g.i.c.a.a.t.a;
import g.i.c.a.a.t.i;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class g {
    public String a;
    public a b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f4470d;

    /* renamed from: e  reason: collision with root package name */
    public long f4471e;

    /* renamed from: f  reason: collision with root package name */
    public c f4472f;

    /* renamed from: g  reason: collision with root package name */
    public String f4473g;

    /* renamed from: h  reason: collision with root package name */
    public int f4474h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f4475i;

    public g(c cVar) {
        e eVar = e.b.a;
        this.f4470d = (long) (eVar.d().r * 1000);
        long j2 = (long) (eVar.d().s * 1000);
        this.c = j2;
        this.f4472f = cVar;
        if (this.f4470d <= 0) {
            this.f4470d = 60000;
        }
        if (j2 <= 0) {
            this.c = 5000;
        }
        if (this.c < 5000) {
            this.c = 5000;
        }
        long j3 = this.c;
        if (j3 > this.f4470d) {
            this.f4470d = j3;
        }
        a aVar = new a(true, j3);
        this.b = aVar;
        aVar.f4479g = new e(this);
        d();
    }

    public static void a(Map map) {
        g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.i.c.a.a.b0.g.a(6);
        cVar.a = "dt_app_heartbeat";
        cVar.c(map);
        g.i.c.a.a.c cVar2 = e.b.a.f4498g;
        if (cVar2 != null) {
            cVar2.b("dt_app_heartbeat", cVar.c);
        }
        g.i.c.a.a.t.g.d((Object) null, cVar, false, false);
    }

    public final void b() {
        g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.i.c.a.a.b0.g.a(6);
        cVar.a = "appin";
        cVar.b("dt_app_starttime", Long.valueOf(System.currentTimeMillis()));
        cVar.b("dt_sys_elapsed_realtime", Long.valueOf(SystemClock.elapsedRealtime()));
        cVar.b("dt_app_heartbeat_interval", Long.valueOf(this.f4470d / 1000));
        cVar.b("dt_app_file_interval", Long.valueOf(this.c / 1000));
        cVar.b("dt_app_sessionid", this.a);
        g.i.c.a.a.t.a aVar = a.e.a;
        cVar.b("dt_activity_name", aVar.n);
        cVar.b("dt_active_info", aVar.o);
        g.i.c.a.a.c cVar2 = e.b.a.f4498g;
        if (cVar2 != null) {
            cVar2.b("appin", cVar.c);
        }
        g.i.c.a.a.t.g.d((Object) null, cVar, false, false);
    }

    public final void c(long j2) {
        long j3;
        long uptimeMillis = (SystemClock.uptimeMillis() - this.f4475i) - j2;
        this.f4472f.u("inquire");
        long j4 = (uptimeMillis - 0) + 0;
        c cVar = this.f4472f;
        cVar.u("app out");
        Objects.requireNonNull(cVar.f4462d);
        cVar.c = false;
        LinkedHashSet<String> linkedHashSet = this.f4472f.f4463e.a;
        StringBuilder sb = new StringBuilder();
        for (String next : linkedHashSet) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(next);
        }
        String sb2 = sb.toString();
        this.f4472f.f4463e.a.clear();
        g.i.c.a.a.u.c cVar2 = (g.i.c.a.a.u.c) g.i.c.a.a.b0.g.a(6);
        cVar2.a = "appout";
        cVar2.b("lvtm", Long.valueOf(uptimeMillis));
        cVar2.b("dt_white_lvtm", Long.valueOf(j4));
        cVar2.b("dt_activity_blacklist", sb2);
        cVar2.b("dt_app_stoptime", Long.valueOf(System.currentTimeMillis() - j2));
        cVar2.b("dt_sys_elapsed_realtime", Long.valueOf(SystemClock.elapsedRealtime() - j2));
        cVar2.b("dt_app_sessionid", this.a);
        synchronized (this) {
            j3 = this.f4471e;
        }
        cVar2.b("dt_app_foreground_duration", Long.valueOf(j3 - j2));
        i iVar = i.b.a;
        Objects.requireNonNull(iVar);
        g.i.c.a.a.s.i iVar2 = n.d.a.b;
        cVar2.b("cur_pg", iVar2 == null ? new HashMap() : iVar.f("appout", iVar2));
        g.i.c.a.a.t.a aVar = a.e.a;
        cVar2.b("dt_activity_name", aVar.n);
        cVar2.b("dt_active_info", aVar.o);
        g.i.c.a.a.c cVar3 = e.b.a.f4498g;
        if (cVar3 != null) {
            cVar3.b("appout", cVar2.c);
        }
        g.i.c.a.a.t.g.d((Object) null, cVar2, true, false);
    }

    public synchronized void d() {
        if (this.f4474h == 0) {
            e(0);
        }
        this.f4474h = -1;
        this.a = f.b();
        this.f4471e = 0;
        this.f4473g = null;
        this.b.b();
        this.b.f4480h = this.a;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void e(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f4474h     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            monitor-enter(r2)     // Catch:{ all -> 0x0024 }
            int r0 = r2.f4474h     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r2.f4474h = r0     // Catch:{ all -> 0x001f }
            g.i.c.a.a.y.b r0 = g.i.c.a.a.y.b.C0187b.a     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r2.f4473g     // Catch:{ all -> 0x001f }
            r0.b(r1)     // Catch:{ all -> 0x001f }
            r0 = 0
            r2.f4473g = r0     // Catch:{ all -> 0x001f }
            r2.f()     // Catch:{ all -> 0x001f }
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            r2.c(r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.n.g.a.g.e(long):void");
    }

    public final synchronized void f() {
        long j2;
        this.b.d();
        long j3 = this.f4471e;
        g.i.c.a.a.n.g.b.a aVar = this.b;
        synchronized (aVar) {
            j2 = aVar.a;
        }
        this.f4471e = j3 + j2;
        this.b.b();
        if (this.f4474h == 0) {
            this.b.c();
        }
    }
}
