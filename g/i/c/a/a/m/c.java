package g.i.c.a.a.m;

import android.app.Activity;
import android.os.SystemClock;
import g.i.c.a.a.i.b;
import g.i.c.a.a.t.a;
import java.util.Objects;

public class c extends g.i.c.a.a.i.a implements a.d {
    public String a;
    public long b = 0;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public a f4462d = new a();

    /* renamed from: e  reason: collision with root package name */
    public g.i.c.a.a.n.g.a.a f4463e = new g.i.c.a.a.n.g.a.a();

    public static class a {
    }

    public c() {
        b.C0166b.a.b.c.a(this);
    }

    public void b() {
        this.c = true;
        t();
    }

    public void k(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("activity pause: ");
        i2.append(this.a);
        u(i2.toString());
        Objects.requireNonNull(this.f4462d);
    }

    public void q(boolean z) {
        u("app out");
        Objects.requireNonNull(this.f4462d);
        this.c = false;
    }

    public void s(Activity activity) {
        this.a = activity.getClass().getCanonicalName();
        Objects.requireNonNull(this.f4462d);
    }

    public final void t() {
        this.b = SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void u(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.c     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0023
            g.i.c.a.a.r.e r0 = g.i.c.a.a.r.e.b.a     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "DetectInterceptorsMonitor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Interrupt intercept duration updating for app is background now, from: "
            r1.append(r2)     // Catch:{ all -> 0x0050 }
            r1.append(r4)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0050 }
            g.c.b.b.f.w(r0, r4)     // Catch:{ all -> 0x0050 }
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            g.i.c.a.a.m.c$a r0 = r3.f4462d     // Catch:{ all -> 0x0050 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0050 }
            g.i.c.a.a.r.e r0 = g.i.c.a.a.r.e.b.a     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "DetectInterceptorsMonitor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Interrupt intercept duration updating for activity not intercept, Activity: "
            r1.append(r2)     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = r3.a     // Catch:{ all -> 0x0050 }
            r1.append(r2)     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = ", from: "
            r1.append(r2)     // Catch:{ all -> 0x0050 }
            r1.append(r4)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0050 }
            g.c.b.b.f.w(r0, r4)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r3)
            return
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.m.c.u(java.lang.String):void");
    }
}
