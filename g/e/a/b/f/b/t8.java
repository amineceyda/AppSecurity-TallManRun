package g.e.a.b.f.b;

import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.Objects;

public final class t8 {
    public long a;
    public long b;
    public final m c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w8 f3359d;

    public t8(w8 w8Var) {
        this.f3359d = w8Var;
        this.c = new s8(this, w8Var.a);
        Objects.requireNonNull((c) w8Var.a.n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r5, boolean r6, long r7) {
        /*
            r4 = this;
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            r0.h()
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            r0.i()
            g.e.a.b.e.c.mb.b()
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            r1 = 0
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.e0
            boolean r0 = r0.u(r1, r2)
            if (r0 == 0) goto L_0x003c
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            g.e.a.b.f.b.n4 r0 = r0.a
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0058
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.p3 r0 = r0.o
            g.e.a.b.f.b.w8 r1 = r4.f3359d
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0051
        L_0x003c:
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.p3 r0 = r0.o
            g.e.a.b.f.b.w8 r1 = r4.f3359d
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
        L_0x0051:
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
        L_0x0058:
            long r0 = r4.a
            long r0 = r7 - r0
            if (r5 != 0) goto L_0x007a
            r2 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0065
            goto L_0x007a
        L_0x0065:
            g.e.a.b.f.b.w8 r5 = r4.f3359d
            g.e.a.b.f.b.n4 r5 = r5.a
            g.e.a.b.f.b.f3 r5 = r5.d()
            g.e.a.b.f.b.d3 r5 = r5.n
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r5.b(r7, r6)
            r5 = 0
            return r5
        L_0x007a:
            if (r6 != 0) goto L_0x0082
            long r0 = r4.b
            long r0 = r7 - r0
            r4.b = r7
        L_0x0082:
            g.e.a.b.f.b.w8 r5 = r4.f3359d
            g.e.a.b.f.b.n4 r5 = r5.a
            g.e.a.b.f.b.f3 r5 = r5.d()
            g.e.a.b.f.b.d3 r5 = r5.n
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "Recording user engagement, ms"
            r5.b(r3, r2)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r2 = "_et"
            r5.putLong(r2, r0)
            g.e.a.b.f.b.w8 r0 = r4.f3359d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            boolean r0 = r0.v()
            g.e.a.b.f.b.w8 r1 = r4.f3359d
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f7 r1 = r1.x()
            r2 = 1
            r0 = r0 ^ r2
            g.e.a.b.f.b.y6 r0 = r1.o(r0)
            g.e.a.b.f.b.q9.w(r0, r5, r2)
            if (r6 != 0) goto L_0x00cb
            g.e.a.b.f.b.w8 r6 = r4.f3359d
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.q6 r6 = r6.v()
            java.lang.String r0 = "auto"
            java.lang.String r1 = "_e"
            r6.o(r0, r1, r5)
        L_0x00cb:
            r4.a = r7
            g.e.a.b.f.b.m r5 = r4.c
            r5.a()
            g.e.a.b.f.b.m r5 = r4.c
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            r5.c(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.t8.a(boolean, boolean, long):boolean");
    }
}
