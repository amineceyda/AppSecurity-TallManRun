package g.c.b.a.k;

import g.c.b.a.h.f;
import g.c.b.a.j.b;
import i.o.c.h;

public final class b implements g.c.b.a.j.b {
    public String b = "ParserInterceptor";

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.c.b.a.j.b.a r10, g.c.b.a.d<java.lang.Object> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "response"
            i.o.c.h.e(r11, r0)
            java.lang.String r0 = "ClientChannel|"
            java.lang.String r1 = "message"
            java.lang.String r2 = "tag"
            if (r10 != 0) goto L_0x0027
            java.lang.String r10 = r9.b
            java.lang.String r11 = "The pre chain is null, unable to return data."
            i.o.c.h.e(r10, r2)
            i.o.c.h.e(r11, r1)
            g.c.b.a.j.g r1 = g.c.b.a.l.c.b
            java.lang.String r10 = i.o.c.h.j(r0, r10)
            if (r1 == 0) goto L_0x0023
            r1.e(r10, r11)
            goto L_0x0026
        L_0x0023:
            android.util.Log.e(r10, r11)
        L_0x0026:
            return
        L_0x0027:
            boolean r3 = r11.d()
            if (r3 != 0) goto L_0x004a
            java.lang.String r3 = r9.b
            java.lang.String r4 = "Data request failed, could not be parsed."
            i.o.c.h.e(r3, r2)
            i.o.c.h.e(r4, r1)
            g.c.b.a.j.g r1 = g.c.b.a.l.c.b
            java.lang.String r0 = i.o.c.h.j(r0, r3)
            if (r1 == 0) goto L_0x0043
            r1.d(r0, r4)
            goto L_0x0046
        L_0x0043:
            android.util.Log.d(r0, r4)
        L_0x0046:
            r10.a(r11)
            return
        L_0x004a:
            g.c.b.a.c r3 = r10.b()
            g.c.b.a.j.h r4 = r3.f2201j
            r5 = 0
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = r9.b
            java.lang.String r6 = "Get the parser from the request is null."
            i.o.c.h.e(r4, r2)
            i.o.c.h.e(r6, r1)
            g.c.b.a.j.g r7 = g.c.b.a.l.c.b
            java.lang.String r4 = i.o.c.h.j(r0, r4)
            if (r7 == 0) goto L_0x0069
            r7.d(r4, r6)
            goto L_0x006c
        L_0x0069:
            android.util.Log.d(r4, r6)
        L_0x006c:
            g.c.b.a.j.d r4 = r3.a
            if (r4 != 0) goto L_0x0072
            r4 = r5
            goto L_0x0076
        L_0x0072:
            g.c.b.a.j.h r4 = r4.j()
        L_0x0076:
            if (r4 != 0) goto L_0x0091
            java.lang.String r6 = r9.b
            java.lang.String r7 = "Get the parser from the config is null."
            i.o.c.h.e(r6, r2)
            i.o.c.h.e(r7, r1)
            g.c.b.a.j.g r8 = g.c.b.a.l.c.b
            java.lang.String r6 = i.o.c.h.j(r0, r6)
            if (r8 == 0) goto L_0x008e
            r8.i(r6, r7)
            goto L_0x0091
        L_0x008e:
            android.util.Log.i(r6, r7)
        L_0x0091:
            if (r4 != 0) goto L_0x0094
            goto L_0x00d0
        L_0x0094:
            g.c.b.a.d r0 = r4.a(r3, r11)     // Catch:{ IOException -> 0x009d }
            if (r0 != 0) goto L_0x009b
            goto L_0x00d0
        L_0x009b:
            r11 = r0
            goto L_0x00d0
        L_0x009d:
            r11 = move-exception
            java.lang.String r4 = r9.b
            java.lang.String r6 = r11.getMessage()
            java.lang.String r7 = "Data parsing error. "
            java.lang.String r6 = i.o.c.h.j(r7, r6)
            i.o.c.h.e(r4, r2)
            i.o.c.h.e(r6, r1)
            g.c.b.a.j.g r1 = g.c.b.a.l.c.b
            java.lang.String r0 = i.o.c.h.j(r0, r4)
            if (r1 == 0) goto L_0x00bc
            r1.e(r0, r6)
            goto L_0x00bf
        L_0x00bc:
            android.util.Log.e(r0, r6)
        L_0x00bf:
            g.c.b.a.d r0 = new g.c.b.a.d
            r1 = 1
            java.lang.String r11 = r11.getMessage()
            java.lang.String r2 = "Parser error. "
            java.lang.String r11 = i.o.c.h.j(r2, r11)
            r0.<init>(r3, r5, r1, r11)
            goto L_0x009b
        L_0x00d0:
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.a.k.b.a(g.c.b.a.j.b$a, g.c.b.a.d):void");
    }

    public void b(b.a aVar) {
        h.e(aVar, "nextChain");
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('|');
        f fVar = (f) aVar;
        sb.append(fVar.f2220d.e());
        this.b = sb.toString();
        fVar.d(fVar.f2220d);
    }
}
