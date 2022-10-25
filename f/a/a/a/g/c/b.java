package f.a.a.a.g.c;

import f.a.a.b.q.d.i;
import f.a.a.b.z.h;

public class b extends f.a.a.b.q.b.b {

    /* renamed from: e  reason: collision with root package name */
    public static final h f1626e = new h((long) 60000.0d);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: f.a.a.b.z.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: f.a.a.b.z.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: f.a.a.b.z.h} */
    /* JADX WARNING: type inference failed for: r5v4, types: [f.a.a.b.z.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(f.a.a.b.q.d.i r10, java.lang.String r11, org.xml.sax.Attributes r12) {
        /*
            r9 = this;
            java.lang.String r11 = "logback.debug"
            java.lang.String r11 = e.e.f.b.p(r11)
            if (r11 != 0) goto L_0x0012
            java.lang.String r11 = "debug"
            java.lang.String r11 = r12.getValue(r11)
            java.lang.String r11 = r10.w(r11)
        L_0x0012:
            boolean r0 = e.e.f.b.s(r11)
            java.lang.String r1 = "false"
            if (r0 != 0) goto L_0x003f
            boolean r0 = r11.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "null"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            f.a.a.b.d r11 = r9.c
            f.a.a.b.x.c r0 = new f.a.a.b.x.c
            r0.<init>()
            r0.g(r11)
            f.a.a.b.c r11 = r11.f1685d
            boolean r11 = r11.b(r0)
            if (r11 == 0) goto L_0x0044
            r0.start()
            goto L_0x0044
        L_0x003f:
            java.lang.String r11 = "debug attribute not set"
            r9.n(r11)
        L_0x0044:
            java.lang.String r11 = "scan"
            java.lang.String r11 = r12.getValue(r11)
            java.lang.String r11 = r10.w(r11)
            boolean r0 = e.e.f.b.s(r11)
            if (r0 != 0) goto L_0x0118
            boolean r11 = r1.equalsIgnoreCase(r11)
            if (r11 != 0) goto L_0x0118
            f.a.a.b.d r11 = r9.c
            java.util.concurrent.ScheduledExecutorService r0 = r11.d()
            f.a.a.b.d r11 = r9.c
            f.a.a.b.q.d.b r11 = f.a.a.b.q.e.a.c(r11)
            r1 = 0
            if (r11 != 0) goto L_0x006b
            r11 = r1
            goto L_0x006d
        L_0x006b:
            java.net.URL r11 = r11.f1736e
        L_0x006d:
            if (r11 != 0) goto L_0x0076
            java.lang.String r11 = "Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done."
            r9.p(r11)
            goto L_0x0118
        L_0x0076:
            f.a.a.a.g.b r2 = new f.a.a.a.g.b
            r2.<init>()
            f.a.a.b.d r3 = r9.c
            r2.g(r3)
            f.a.a.b.d r3 = r9.c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f1687f
            java.lang.String r4 = "RECONFIGURE_ON_CHANGE_TASK"
            r3.put(r4, r2)
            java.lang.String r3 = "scanPeriod"
            java.lang.String r3 = r12.getValue(r3)
            java.lang.String r3 = r10.w(r3)
            f.a.a.b.z.h r4 = f1626e
            boolean r5 = e.e.f.b.s(r3)
            if (r5 != 0) goto L_0x00c2
            f.a.a.b.z.h r5 = f.a.a.b.z.h.a(r3)     // Catch:{ IllegalArgumentException -> 0x00a2, IllegalStateException -> 0x00a0 }
            goto L_0x00a6
        L_0x00a0:
            r5 = move-exception
            goto L_0x00a3
        L_0x00a2:
            r5 = move-exception
        L_0x00a3:
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x00a6:
            if (r1 == 0) goto L_0x00c1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to parse 'scanPeriod' attribute ["
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = "]"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r9.q(r3, r1)
        L_0x00c1:
            r1 = r5
        L_0x00c2:
            if (r1 != 0) goto L_0x00d9
            java.lang.String r1 = "No 'scanPeriod' specified. Defaulting to "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r3 = r4.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r9.n(r1)
            goto L_0x00da
        L_0x00d9:
            r4 = r1
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Will scan for changes in ["
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = "] "
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r9.n(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Setting ReconfigureOnChangeTask scanning period to "
            r11.append(r1)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r9.n(r11)
            long r4 = r4.a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = r2
            r2 = r4
            java.util.concurrent.ScheduledFuture r11 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            f.a.a.b.d r0 = r9.c
            java.util.List<java.util.concurrent.ScheduledFuture<?>> r0 = r0.f1690i
            r0.add(r11)
        L_0x0118:
            f.a.a.b.z.f r11 = new f.a.a.b.z.f
            f.a.a.b.d r0 = r9.c
            r11.<init>(r0)
            f.a.a.b.d r11 = r11.c
            java.lang.String r0 = "HOSTNAME"
            java.lang.String r1 = "localhost"
            r11.h(r0, r1)
            f.a.a.b.d r11 = r9.c
            java.util.Stack<java.lang.Object> r0 = r10.f1739e
            r0.push(r11)
            f.a.a.b.d r11 = r9.c
            f.a.a.a.c r11 = (f.a.a.a.c) r11
            java.lang.String r0 = "packagingData"
            java.lang.String r12 = r12.getValue(r0)
            java.lang.String r10 = r10.w(r12)
            r12 = 0
            boolean r10 = e.e.f.b.z(r10, r12)
            r11.s = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.g.c.b.s(f.a.a.b.q.d.i, java.lang.String, org.xml.sax.Attributes):void");
    }

    public void u(i iVar, String str) {
        n("End of configuration.");
        iVar.v();
    }
}
