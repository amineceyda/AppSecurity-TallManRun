package g.i.b.f.k.g;

import g.i.b.e.h.b;
import g.i.b.f.k.e;
import g.i.b.f.k.f.a;
import g.i.b.f.k.g.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class d implements b {
    public c a;
    public c b;
    public ArrayList<c> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public long f4386d = 0;

    /* renamed from: e  reason: collision with root package name */
    public e f4387e;

    public d(e eVar) {
        this.f4387e = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0163, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized g.i.b.e.h.d a(g.i.b.f.k.g.c r11, g.i.b.f.k.g.c.b r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            g.i.b.f.k.e r0 = r10.f4387e     // Catch:{ all -> 0x018c }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x018c }
            boolean r0 = r10.g(r11)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0182
            boolean r0 = r11.a()     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0182
            long r0 = r12.c     // Catch:{ all -> 0x018c }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x001c
            goto L_0x0182
        L_0x001c:
            g.i.b.e.h.d r0 = new g.i.b.e.h.d     // Catch:{ all -> 0x018c }
            java.lang.String r1 = ""
            r4 = 0
            r0.<init>(r4, r1)     // Catch:{ all -> 0x018c }
            g.i.b.f.k.e r1 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.a r5 = r1.f4311g     // Catch:{ all -> 0x018c }
            if (r5 == 0) goto L_0x0164
            g.i.b.f.k.g.a r6 = r11.b     // Catch:{ all -> 0x018c }
            g.i.b.f.k.a r6 = r6.f4368i     // Catch:{ all -> 0x018c }
            r7 = 1
            if (r6 != r5) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0038
            goto L_0x0164
        L_0x0038:
            long r5 = r1.w     // Catch:{ all -> 0x018c }
            r8 = -1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00af
            g.i.b.f.k.e r1 = r10.f4387e     // Catch:{ all -> 0x018c }
            java.lang.String r5 = r1.r     // Catch:{ all -> 0x018c }
            boolean r6 = r1.c0     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x004e
            boolean r6 = r1.e0     // Catch:{ all -> 0x018c }
            if (r6 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r7 = 0
        L_0x004e:
            if (r7 == 0) goto L_0x005d
            long r6 = r1.z     // Catch:{ all -> 0x018c }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0085
            long r1 = r12.c     // Catch:{ all -> 0x018c }
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            goto L_0x0081
        L_0x005d:
            long r6 = r1.R     // Catch:{ all -> 0x018c }
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0085
            long r6 = r12.c     // Catch:{ all -> 0x018c }
            g.i.b.f.k.e r1 = r10.f4387e     // Catch:{ all -> 0x018c }
            long r8 = r1.R     // Catch:{ all -> 0x018c }
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0085
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.b r11 = r11.f4310f     // Catch:{ all -> 0x018c }
            long r5 = r11.f4347g     // Catch:{ all -> 0x018c }
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            g.i.b.f.k.f.a r11 = r12.a     // Catch:{ all -> 0x018c }
            long r1 = r12.c     // Catch:{ all -> 0x018c }
            r10.c(r11, r1, r0)     // Catch:{ all -> 0x018c }
            goto L_0x0088
        L_0x007f:
            long r1 = r12.c     // Catch:{ all -> 0x018c }
        L_0x0081:
            r10.b(r1, r0)     // Catch:{ all -> 0x018c }
            goto L_0x0088
        L_0x0085:
            r10.d(r11, r12, r5, r0)     // Catch:{ all -> 0x018c }
        L_0x0088:
            int r11 = r0.a     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x0106
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            boolean r1 = r11.d0     // Catch:{ all -> 0x018c }
            if (r1 != 0) goto L_0x00a5
            boolean r11 = r11.Q()     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x00a5
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            int r1 = r11.S     // Catch:{ all -> 0x018c }
            g.i.b.f.k.e r2 = r10.f4387e     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r2.t     // Catch:{ all -> 0x018c }
            g.i.b.f.e r3 = g.i.b.f.e.FAILED     // Catch:{ all -> 0x018c }
            r11.N(r4, r1, r2, r3)     // Catch:{ all -> 0x018c }
        L_0x00a5:
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.d r11 = r11.f4313i     // Catch:{ all -> 0x018c }
            g.i.b.f.k.d$b r1 = g.i.b.f.k.d.b.Inform_Detected     // Catch:{ all -> 0x018c }
            r11.c(r1)     // Catch:{ all -> 0x018c }
            goto L_0x0106
        L_0x00af:
            long r4 = r12.c     // Catch:{ all -> 0x018c }
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            long r8 = r11.w     // Catch:{ all -> 0x018c }
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x00fa
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.b r11 = r11.f4310f     // Catch:{ all -> 0x018c }
            long r4 = r11.f4347g     // Catch:{ all -> 0x018c }
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00cb
            g.i.b.f.k.f.a r11 = r12.a     // Catch:{ all -> 0x018c }
            long r1 = r12.c     // Catch:{ all -> 0x018c }
            r10.c(r11, r1, r0)     // Catch:{ all -> 0x018c }
            goto L_0x0106
        L_0x00cb:
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            long r4 = r11.z     // Catch:{ all -> 0x018c }
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d9
            long r1 = r12.c     // Catch:{ all -> 0x018c }
            r10.b(r1, r0)     // Catch:{ all -> 0x018c }
            goto L_0x0106
        L_0x00d9:
            r11 = -43
            r0.a = r11     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "detectLength:"
            r11.<init>(r1)     // Catch:{ all -> 0x018c }
            g.i.b.f.k.e r1 = r10.f4387e     // Catch:{ all -> 0x018c }
            long r1 = r1.w     // Catch:{ all -> 0x018c }
            r11.append(r1)     // Catch:{ all -> 0x018c }
            java.lang.String r1 = ",rspLength:"
            r11.append(r1)     // Catch:{ all -> 0x018c }
            long r1 = r12.c     // Catch:{ all -> 0x018c }
            r11.append(r1)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x018c }
            goto L_0x0104
        L_0x00fa:
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            boolean r11 = r11.W     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x0106
            r0.a = r7     // Catch:{ all -> 0x018c }
            java.lang.String r11 = "not support range"
        L_0x0104:
            r0.b = r11     // Catch:{ all -> 0x018c }
        L_0x0106:
            int r11 = r0.a     // Catch:{ all -> 0x018c }
            if (r11 == 0) goto L_0x010c
            monitor-exit(r10)
            return r0
        L_0x010c:
            java.lang.String r11 = r12.b     // Catch:{ all -> 0x018c }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x0162
            g.i.b.f.k.f.a r11 = r12.a     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.a$a r11 = r11.b     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_CDN_Domain     // Catch:{ all -> 0x018c }
            if (r11 == r1) goto L_0x0144
            g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_Outer     // Catch:{ all -> 0x018c }
            if (r11 != r1) goto L_0x0121
            goto L_0x0144
        L_0x0121:
            g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_Src_Domain     // Catch:{ all -> 0x018c }
            if (r11 != r1) goto L_0x0162
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.b r11 = r11.f4310f     // Catch:{ all -> 0x018c }
            java.lang.String r1 = g.i.b.e.b.e.f4111f     // Catch:{ all -> 0x018c }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x018c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x018c }
            if (r2 != 0) goto L_0x0162
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x018c }
            if (r2 == 0) goto L_0x013a
            goto L_0x0162
        L_0x013a:
            g.i.b.f.k.f.b$a r11 = r11.b(r1)     // Catch:{ all -> 0x018c }
            if (r11 == 0) goto L_0x0162
            r11.f(r12)     // Catch:{ all -> 0x018c }
            goto L_0x0162
        L_0x0144:
            g.i.b.f.k.e r11 = r10.f4387e     // Catch:{ all -> 0x018c }
            g.i.b.f.k.f.b r11 = r11.f4310f     // Catch:{ all -> 0x018c }
            java.lang.String r1 = g.i.b.e.b.e.f4111f     // Catch:{ all -> 0x018c }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x018c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x018c }
            if (r2 != 0) goto L_0x0162
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x018c }
            if (r2 == 0) goto L_0x0159
            goto L_0x0162
        L_0x0159:
            g.i.b.f.k.f.b$a r11 = r11.b(r1)     // Catch:{ all -> 0x018c }
            if (r11 == 0) goto L_0x0162
            r11.b(r12)     // Catch:{ all -> 0x018c }
        L_0x0162:
            monitor-exit(r10)
            return r0
        L_0x0164:
            r12 = 2
            r0.a = r12     // Catch:{ all -> 0x018c }
            java.lang.String r12 = "not the same divider"
            r0.b = r12     // Catch:{ all -> 0x018c }
            java.lang.String r12 = "SectionTransportControlCenter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            java.lang.String r2 = "onValidResponse... fail...not self section:"
            r1.<init>(r2)     // Catch:{ all -> 0x018c }
            g.i.b.f.k.g.a r11 = r11.b     // Catch:{ all -> 0x018c }
            r1.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x018c }
            g.i.b.e.h.b.h(r12, r11)     // Catch:{ all -> 0x018c }
            monitor-exit(r10)
            return r0
        L_0x0182:
            g.i.b.e.h.d r11 = new g.i.b.e.h.d     // Catch:{ all -> 0x018c }
            r12 = 4
            java.lang.String r0 = ""
            r11.<init>(r12, r0)     // Catch:{ all -> 0x018c }
            monitor-exit(r10)
            return r11
        L_0x018c:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.g.d.a(g.i.b.f.k.g.c, g.i.b.f.k.g.c$b):g.i.b.e.h.d");
    }

    public final void b(long j2, g.i.b.e.h.d dVar) {
        dVar.a = -10;
        dVar.b = "knownSize:" + this.f4387e.z + ",rspLength:" + j2;
    }

    public final void c(a aVar, long j2, g.i.b.e.h.d dVar) {
        StringBuilder sb;
        if (aVar.b == a.C0161a.Type_CDN_Ip_Socket_Schedule_Https) {
            dVar.a = -76;
            sb = new StringBuilder("sche size:");
        } else {
            dVar.a = -73;
            sb = new StringBuilder("sche size:");
        }
        sb.append(this.f4387e.f4310f.f4347g);
        sb.append(",rsp size:");
        sb.append(j2);
        dVar.b = sb.toString();
    }

    public final void d(c cVar, c.b bVar, String str, g.i.b.e.h.d dVar) {
        this.f4387e.w = bVar.c;
        this.f4387e.W = bVar.f4382d;
        e eVar = this.f4387e;
        eVar.r = str;
        eVar.s = bVar.f4385g;
        a aVar = cVar.c;
        if (aVar != null) {
            eVar.V = aVar.c;
        }
        if (!eVar.W) {
            this.f4387e.f4311g = new g.i.b.f.k.a("");
            cVar.b = this.f4387e.f4311g.e();
        } else {
            e eVar2 = this.f4387e;
            long j2 = eVar2.f4311g.a;
            if (j2 > 0) {
                boolean z = false;
                if (j2 != eVar2.w) {
                    z = true;
                }
                if (z) {
                    this.f4387e.f4311g = new g.i.b.f.k.a("");
                    dVar.a = 3;
                    dVar.b = "can not resume from cfg, start over now";
                }
            }
        }
        g.i.b.f.k.a aVar2 = this.f4387e.f4311g;
        aVar2.a = bVar.c;
        aVar2.k(bVar.f4383e);
        this.f4387e.f4311g.l(bVar.f4384f);
        a aVar3 = cVar.b;
        if (aVar3.c == -1 && aVar3.b == -1) {
            this.f4387e.f4311g.a(aVar3);
        }
    }

    public final void e(c cVar) {
        a aVar;
        if (g(cVar) && (aVar = cVar.b) != null) {
            Objects.requireNonNull(this.f4387e.f4311g);
            aVar.f4367h = false;
        }
    }

    public final void f(c cVar) {
        c cVar2;
        if (g(cVar)) {
            boolean z = true;
            synchronized (this) {
                c cVar3 = this.a;
                if (cVar3 == null || cVar3.o) {
                    if (!this.f4387e.c0 || (cVar2 = this.b) == null || cVar2.o) {
                        if (this.c.size() > 0) {
                            Iterator<c> it = this.c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!it.next().o) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
            }
            if (z && !this.f4387e.X) {
                b.h("SectionTransportControlCenter", "All Transports Finished, task:" + this.f4387e.v);
                if (!this.f4387e.f4311g.i()) {
                    this.f4387e.S = cVar.f4374i;
                    e eVar = this.f4387e;
                    eVar.t = cVar.f4375j;
                    if (eVar.S == 0) {
                        this.f4387e.S = -69;
                        e eVar2 = this.f4387e;
                        eVar2.t = "readLen:" + this.f4387e.f4311g.f();
                    }
                    this.f4387e.f4313i.b(g.i.b.f.e.FAILED);
                }
            }
        }
    }

    public final boolean g(c cVar) {
        if (cVar != null) {
            return cVar == this.a || cVar == this.b || this.c.contains(cVar);
        }
        return false;
    }
}
