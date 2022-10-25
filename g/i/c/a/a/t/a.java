package g.i.c.a.a.t;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import g.c.b.b.f;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.h.d;
import g.i.c.a.a.i.b;
import g.i.c.a.a.n.f.d;
import g.i.c.a.a.n.g.a.g;
import g.i.c.a.a.r.e;
import g.i.c.a.a.w.a;
import g.i.c.a.a.y.b;
import java.util.HashSet;
import java.util.Objects;
import org.slf4j.Logger;

public class a extends g.i.c.a.a.i.a {
    public int a = 0;
    public int b = 0;
    public long c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4513d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4514e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4515f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4516g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4517h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4518i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4519j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4520k = true;

    /* renamed from: l  reason: collision with root package name */
    public String f4521l = "";

    /* renamed from: m  reason: collision with root package name */
    public long f4522m = 0;
    public String n = "";
    public String o = "";
    public long p = System.currentTimeMillis();
    public long q = -1;
    public long r = 0;
    public final g.i.c.a.a.b0.e<d> s = new g.i.c.a.a.b0.e<>();
    public final g.i.c.a.a.b0.e<g.i.c.a.a.e> t = new g.i.c.a.a.b0.e<>();
    public final HashSet<Integer> u = new HashSet<>();
    public g.i.c.a.a.b v;
    public g w;
    public g.i.c.a.a.m.c x = new g.i.c.a.a.m.c();
    public Runnable y = new C0177a();
    public Runnable z = new b();

    /* renamed from: g.i.c.a.a.t.a$a  reason: collision with other inner class name */
    public class C0177a implements Runnable {
        public C0177a() {
        }

        public void run() {
            if (e.b.a.a) {
                f.K("AppEventReporter", "appInDataSender: 前台上报");
            }
            a aVar = a.this;
            g gVar = aVar.w;
            if (gVar == null) {
                aVar.w = new g(aVar.x);
            } else {
                gVar.d();
            }
            g gVar2 = aVar.w;
            synchronized (gVar2) {
                if (gVar2.f4474h == 0) {
                    gVar2.e(0);
                }
                gVar2.f4474h = 0;
                gVar2.f4475i = SystemClock.uptimeMillis();
                g.i.c.a.a.m.c cVar = gVar2.f4472f;
                cVar.c = true;
                cVar.t();
                gVar2.f4472f.u("inquire");
                g.i.c.a.a.y.b bVar = b.C0187b.a;
                g.i.c.a.a.n.g.a.b bVar2 = new g.i.c.a.a.n.g.a.b(gVar2);
                long j2 = gVar2.f4470d;
                gVar2.f4473g = bVar.a(bVar2, j2, j2);
                gVar2.b.c();
                gVar2.b();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            if (a.this.b == 0) {
                if (e.b.a.a) {
                    f.K("AppEventReporter", "满足条件，补充appOut事件");
                }
                a.this.t(true);
            }
        }
    }

    public class c implements e.b<d> {
        public c(a aVar) {
        }

        public void a(Object obj) {
            ((d) obj).q(true);
        }
    }

    public interface d {
        void b();

        void q(boolean z);
    }

    public static class e {
        public static final a a;

        static {
            a aVar = new a((C0177a) null);
            a = aVar;
            Objects.requireNonNull(aVar);
            b.C0166b.a.b.c.a(aVar);
        }
    }

    public a(C0177a aVar) {
    }

    public static a v() {
        return e.a;
    }

    public final void A(Activity activity) {
        String str;
        g.i.c.a.a.n.b.b bVar = d.b.a.a;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
            this.o = null;
        }
        if (activity == null) {
            str = "";
        } else {
            str = activity.getClass().getCanonicalName();
        }
        this.n = str;
    }

    public void k(Activity activity) {
        if (e.b.a.a) {
            f.w("AppEventReporter", "onActivityPause: activity=" + activity);
        }
        this.b--;
        this.r = SystemClock.uptimeMillis();
        g.i.c.a.a.y.a.f(this.z, 2000);
    }

    public void l(Activity activity) {
        if (e.b.a.a) {
            f.w("AppEventReporter", "onActivityCreate: activity=" + activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (e.b.a.a) {
            f.w("AppEventReporter", "onActivityDestroyed: activity=" + activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        if (e.b.a.a) {
            f.K("AppEventReporter", "onActivityStarted: activity=" + activity);
        }
        this.a++;
        this.u.add(Integer.valueOf(activity.hashCode()));
    }

    public void onActivityStopped(Activity activity) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            f.K("AppEventReporter", "onActivityStopped: activity=" + activity);
        }
        if (!this.u.remove(Integer.valueOf(activity.hashCode()))) {
            String string = activity.getApplicationContext().getString(2131821052, new Object[]{activity.toString()});
            if (eVar.a) {
                Toast.makeText(activity.getApplicationContext(), string, 1).show();
            }
            f.x("AppEventReporter", string);
            return;
        }
        int i2 = this.a - 1;
        this.a = i2;
        if (i2 <= 0) {
            t(false);
        }
        g.i.c.a.a.y.a.d(this.z);
    }

    public void s(Activity activity) {
        boolean z2;
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            f.K("AppEventReporter", "onActivityResume: activity=" + activity);
        }
        this.b++;
        if (this.f4514e) {
            if (this.c == -1 || w()) {
                g.i.c.a.a.f fVar = this.c > 0 ? g.i.c.a.a.f.REENTER_FOREGROUND_AND_TIMEOUT : g.i.c.a.a.f.APP_START_UP;
                A(activity);
                x(fVar);
            } else {
                g.i.c.a.a.b bVar = this.v;
                if (bVar != null) {
                    g.i.c.a.a.n.f.a aVar = (g.i.c.a.a.n.f.a) bVar;
                    if (eVar.a) {
                        Log.i("DTAdditionalReportHandl", "shouldAdditionalReport: eventKey=origin_vst");
                    }
                    if (d.b.a.a != null) {
                        Logger logger = g.c.a.b.c.g.a;
                        synchronized (g.c.a.b.c.g.class) {
                        }
                        if (eVar.a) {
                            Log.i("DTAdditionalReportHandl", "handleAppVstEvent: startType=0, callFrom=null, callScheme=null");
                        }
                        if (aVar.a == 0 && TextUtils.equals(aVar.b, (CharSequence) null)) {
                            TextUtils.equals(aVar.c, (CharSequence) null);
                        }
                    }
                }
            }
        }
        this.f4514e = false;
        g.i.c.a.a.h.d dVar = d.c.a;
        dVar.a = 1;
        dVar.c();
        dVar.b();
        if (!this.f4518i) {
            A(activity);
            z("vst");
            this.f4518i = true;
        }
        if (!this.f4519j) {
            this.f4519j = true;
            g.i.c.a.a.y.a.b(this.y, true);
            this.s.b(new b(this));
        }
        g.i.c.a.a.w.a aVar2 = a.b.a;
        if (!aVar2.a.isEmpty()) {
            g.i.c.a.a.y.a.a(new a.C0185a());
        }
        if (!this.f4516g) {
            this.f4516g = true;
            g.i.c.a.a.y.a.e(new d(this));
        }
        if (!this.f4515f) {
            this.f4515f = true;
            if (g.i.c.a.a.b0.f.c() != null) {
                z2 = ((Boolean) e.e.i.b.n(g.i.c.a.a.b0.f.c(), (String) null, "pref_device_activated", Boolean.FALSE)).booleanValue();
                if (eVar.a) {
                    StringBuilder i2 = g.a.a.a.a.i("isDeviceActivated:");
                    i2.append(this.f4517h);
                    f.K("AppEventReporter", i2.toString());
                }
            } else {
                z2 = false;
            }
            this.f4517h = z2;
        }
        if (!this.f4517h) {
            if (g.i.c.a.a.b0.f.c() != null) {
                e.e.i.b.L(g.i.c.a.a.b0.f.c(), (String) null, "pref_device_activated", Boolean.TRUE);
            }
            if (eVar.a) {
                f.K("AppEventReporter", "appActivatedDataSender: 激活上报");
            }
            g.i.c.a.a.u.c u2 = u("act");
            g.i.c.a.a.c cVar = eVar.f4498g;
            if (cVar != null) {
                cVar.b("act", u2.c);
            }
            g.d((Object) null, u2, false, false);
            this.f4517h = true;
        }
    }

    public final void t(boolean z2) {
        if (this.f4519j) {
            this.f4519j = false;
            this.f4514e = true;
            this.c = SystemClock.uptimeMillis();
            if (e.b.a.a) {
                f.K("AppEventReporter", "appOutDataSender: 后台上报");
            }
            long uptimeMillis = z2 ? SystemClock.uptimeMillis() - this.r : 0;
            g.i.c.a.a.y.a.d(this.y);
            g gVar = this.w;
            if (gVar != null) {
                gVar.e(uptimeMillis);
            }
            g.i.c.a.a.h.d dVar = d.c.a;
            dVar.a = 2;
            dVar.c();
            dVar.b();
            this.s.b(new c(this));
        }
    }

    public final g.i.c.a.a.u.c u(String str) {
        g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.i.c.a.a.b0.g.a(6);
        cVar.b("dt_activity_name", this.n);
        cVar.b("dt_active_info", this.o);
        cVar.a = str;
        return cVar;
    }

    public final boolean w() {
        return SystemClock.uptimeMillis() > this.c + e.b.a.d().c;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void x(g.i.c.a.a.f r12) {
        /*
            r11 = this;
            g.i.c.a.a.f r0 = g.i.c.a.a.f.REENTER_FOREGROUND_AND_TIMEOUT
            r1 = 0
            if (r12 != r0) goto L_0x000d
            boolean r0 = r11.f4513d
            if (r0 == 0) goto L_0x000d
            r11.f4513d = r1
            goto L_0x00a5
        L_0x000d:
            g.i.c.a.a.f r0 = g.i.c.a.a.f.CALL_UP_FROM_OUTER
            r2 = 0
            r4 = 1
            if (r12 != r0) goto L_0x0022
            long r5 = r11.c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            boolean r0 = r11.w()
            if (r0 == 0) goto L_0x0022
            r11.f4513d = r4
        L_0x0022:
            g.i.c.a.a.f r0 = g.i.c.a.a.f.APP_START_UP
            if (r12 != r0) goto L_0x0030
            java.lang.String r5 = r11.f4521l
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0030
            goto L_0x00a5
        L_0x0030:
            java.lang.String r5 = g.i.c.a.a.b0.f.b()
            r11.f4521l = r5
            long r5 = java.lang.System.currentTimeMillis()
            r11.p = r5
            java.lang.Class<g.i.c.a.a.b0.o> r5 = g.i.c.a.a.b0.o.class
            monitor-enter(r5)
            long r6 = g.i.c.a.a.b0.o.a     // Catch:{ all -> 0x00d9 }
            r8 = 1
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0053
            long r2 = g.i.c.a.a.b0.o.a     // Catch:{ all -> 0x00d9 }
            monitor-enter(r5)     // Catch:{ all -> 0x00d9 }
            long r2 = r2 + r8
            g.i.c.a.a.b0.o.c(r2)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
            goto L_0x0082
        L_0x0050:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
            throw r12     // Catch:{ all -> 0x00d9 }
        L_0x0053:
            android.content.Context r6 = g.i.c.a.a.b0.f.c()     // Catch:{ all -> 0x00d9 }
            if (r6 != 0) goto L_0x005b
            r6 = r2
            goto L_0x0065
        L_0x005b:
            android.content.SharedPreferences r6 = g.i.c.a.a.b0.o.a(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r7 = "dt_ussn_sp_key"
            long r6 = r6.getLong(r7, r2)     // Catch:{ all -> 0x00d9 }
        L_0x0065:
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0075
            monitor-enter(r5)     // Catch:{ all -> 0x00d9 }
            long r6 = r6 + r8
            g.i.c.a.a.b0.o.c(r6)     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
            g.i.c.a.a.b0.o.a = r6     // Catch:{ all -> 0x00d9 }
            goto L_0x0084
        L_0x0072:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
            throw r12     // Catch:{ all -> 0x00d9 }
        L_0x0075:
            monitor-enter(r5)     // Catch:{ all -> 0x00d9 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d6 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            g.i.c.a.a.b0.o.c(r2)     // Catch:{ all -> 0x00d6 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
        L_0x0082:
            g.i.c.a.a.b0.o.a = r2     // Catch:{ all -> 0x00d9 }
        L_0x0084:
            long r2 = g.i.c.a.a.b0.o.a     // Catch:{ all -> 0x00d9 }
            monitor-exit(r5)
            r11.f4522m = r2
            long r2 = r11.q
            r5 = -1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0095
            long r2 = r11.p
            r11.q = r2
        L_0x0095:
            if (r12 != r0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            r11.f4520k = r4
            g.i.c.a.a.b0.e<g.i.c.a.a.e> r0 = r11.t
            g.i.c.a.a.t.c r2 = new g.i.c.a.a.t.c
            r2.<init>(r11, r12)
            r0.b(r2)
        L_0x00a5:
            r11.f4518i = r1
            g.i.c.a.a.s.n r12 = g.i.c.a.a.s.n.d.a
            java.util.Objects.requireNonNull(r12)
            g.i.c.a.a.r.e r0 = g.i.c.a.a.r.e.b.a
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "PageManager"
            java.lang.String r2 = "resetPagePath: "
            g.c.b.b.f.K(r0, r2)
        L_0x00b9:
            r12.f4504d = r1
            r0 = 0
            r12.a = r0
            r12.b = r0
            r12.c = r1
            g.i.c.a.a.s.e r0 = g.i.c.a.a.s.e.b.a
            android.util.SparseArray<g.i.c.a.a.s.d> r0 = r0.a
            r0.clear()
            android.os.Handler r0 = r12.f4505e
            g.i.c.a.a.s.n$c r12 = r12.f4506f
            r0.removeCallbacks(r12)
            java.lang.String r12 = "origin_vst"
            r11.z(r12)
            return
        L_0x00d6:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d9 }
            throw r12     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.a.x(g.i.c.a.a.f):void");
    }

    public void y(g.i.c.a.a.e eVar) {
        this.t.a(eVar);
    }

    public final void z(String str) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            f.w("AppEventReporter", "appStartDataSender: 启动上报");
        }
        g.i.c.a.a.u.c u2 = u(str);
        g.i.c.a.a.c cVar = eVar.f4498g;
        if (cVar != null) {
            cVar.b(str, u2.c);
        }
        g.d((Object) null, u2, false, false);
    }
}
