package k.h0.g;

import java.io.IOException;
import k.s;
import l.e;
import l.j;
import l.x;

public final class b implements s {
    public final boolean a;

    public static final class a extends j {
        public long c;

        public a(x xVar) {
            super(xVar);
        }

        public void m(e eVar, long j2) throws IOException {
            this.b.m(eVar, j2);
            this.c += j2;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0107, code lost:
        if ("close".equalsIgnoreCase(r7) != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.c0 a(k.s.a r11) throws java.io.IOException {
        /*
            r10 = this;
            k.h0.g.f r11 = (k.h0.g.f) r11
            k.h0.g.c r0 = r11.c
            k.h0.f.f r1 = r11.b
            k.h0.f.c r2 = r11.f4762d
            k.x r3 = r11.f4764f
            long r4 = java.lang.System.currentTimeMillis()
            k.n r6 = r11.f4766h
            java.util.Objects.requireNonNull(r6)
            r0.b(r3)
            k.n r6 = r11.f4766h
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = r3.b
            boolean r6 = g.h.a.a.T(r6)
            r7 = 0
            if (r6 == 0) goto L_0x007c
            k.b0 r6 = r3.f4956d
            if (r6 == 0) goto L_0x007c
            k.q r6 = r3.c
            java.lang.String r8 = "Expect"
            java.lang.String r6 = r6.c(r8)
            java.lang.String r8 = "100-continue"
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0046
            r0.d()
            k.n r6 = r11.f4766h
            java.util.Objects.requireNonNull(r6)
            r6 = 1
            k.c0$a r6 = r0.f(r6)
            goto L_0x0047
        L_0x0046:
            r6 = r7
        L_0x0047:
            if (r6 != 0) goto L_0x0072
            k.n r2 = r11.f4766h
            java.util.Objects.requireNonNull(r2)
            k.b0 r2 = r3.f4956d
            long r8 = r2.a()
            k.h0.g.b$a r2 = new k.h0.g.b$a
            l.x r8 = r0.e(r3, r8)
            r2.<init>(r8)
            java.util.logging.Logger r8 = l.q.a
            l.s r8 = new l.s
            r8.<init>(r2)
            k.b0 r2 = r3.f4956d
            r2.e(r8)
            r8.close()
            k.n r2 = r11.f4766h
            java.util.Objects.requireNonNull(r2)
            goto L_0x007d
        L_0x0072:
            boolean r2 = r2.h()
            if (r2 != 0) goto L_0x007d
            r1.f()
            goto L_0x007d
        L_0x007c:
            r6 = r7
        L_0x007d:
            r0.a()
            r2 = 0
            if (r6 != 0) goto L_0x008c
            k.n r6 = r11.f4766h
            java.util.Objects.requireNonNull(r6)
            k.c0$a r6 = r0.f(r2)
        L_0x008c:
            r6.a = r3
            k.h0.f.c r8 = r1.b()
            k.p r8 = r8.f4739f
            r6.f4699e = r8
            r6.f4705k = r4
            long r8 = java.lang.System.currentTimeMillis()
            r6.f4706l = r8
            k.c0 r6 = r6.a()
            int r8 = r6.f4688d
            r9 = 100
            if (r8 != r9) goto L_0x00c4
            k.c0$a r2 = r0.f(r2)
            r2.a = r3
            k.h0.f.c r3 = r1.b()
            k.p r3 = r3.f4739f
            r2.f4699e = r3
            r2.f4705k = r4
            long r3 = java.lang.System.currentTimeMillis()
            r2.f4706l = r3
            k.c0 r6 = r2.a()
            int r8 = r6.f4688d
        L_0x00c4:
            k.n r11 = r11.f4766h
            java.util.Objects.requireNonNull(r11)
            boolean r11 = r10.a
            if (r11 == 0) goto L_0x00d9
            r11 = 101(0x65, float:1.42E-43)
            if (r8 != r11) goto L_0x00d9
            k.c0$a r11 = new k.c0$a
            r11.<init>(r6)
            k.e0 r0 = k.h0.c.c
            goto L_0x00e2
        L_0x00d9:
            k.c0$a r11 = new k.c0$a
            r11.<init>(r6)
            k.e0 r0 = r0.c(r6)
        L_0x00e2:
            r11.f4701g = r0
            k.c0 r11 = r11.a()
            k.x r0 = r11.b
            k.q r0 = r0.c
            java.lang.String r2 = "Connection"
            java.lang.String r0 = r0.c(r2)
            java.lang.String r3 = "close"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0109
            k.q r0 = r11.f4691g
            java.lang.String r0 = r0.c(r2)
            if (r0 == 0) goto L_0x0103
            r7 = r0
        L_0x0103:
            boolean r0 = r3.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x010c
        L_0x0109:
            r1.f()
        L_0x010c:
            r0 = 204(0xcc, float:2.86E-43)
            if (r8 == r0) goto L_0x0114
            r0 = 205(0xcd, float:2.87E-43)
            if (r8 != r0) goto L_0x0120
        L_0x0114:
            k.e0 r0 = r11.f4692h
            long r0 = r0.a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0121
        L_0x0120:
            return r11
        L_0x0121:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = " had non-zero Content-Length: "
            java.lang.StringBuilder r1 = g.a.a.a.a.j(r1, r8, r2)
            k.e0 r11 = r11.f4692h
            long r2 = r11.a()
            r1.append(r2)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.g.b.a(k.s$a):k.c0");
    }
}
