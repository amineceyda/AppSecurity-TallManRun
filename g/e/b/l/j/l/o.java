package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class o extends a0.e.d.a.b.C0117b {
    public final String a;
    public final String b;
    public final b0<a0.e.d.a.b.C0118d.C0119a> c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.C0117b f3664d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3665e;

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.C0117b bVar, int i2, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = b0Var;
        this.f3664d = bVar;
        this.f3665e = i2;
    }

    public a0.e.d.a.b.C0117b a() {
        return this.f3664d;
    }

    public b0<a0.e.d.a.b.C0118d.C0119a> b() {
        return this.c;
    }

    public int c() {
        return this.f3665e;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f3664d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof g.e.b.l.j.l.a0.e.d.a.b.C0117b
            r2 = 0
            if (r1 == 0) goto L_0x0058
            g.e.b.l.j.l.a0$e$d$a$b$b r5 = (g.e.b.l.j.l.a0.e.d.a.b.C0117b) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.d()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            g.e.b.l.j.l.b0<g.e.b.l.j.l.a0$e$d$a$b$d$a> r1 = r4.c
            g.e.b.l.j.l.b0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            g.e.b.l.j.l.a0$e$d$a$b$b r1 = r4.f3664d
            if (r1 != 0) goto L_0x0043
            g.e.b.l.j.l.a0$e$d$a$b$b r1 = r5.a()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            g.e.b.l.j.l.a0$e$d$a$b$b r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f3665e
            int r5 = r5.c()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.o.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        a0.e.d.a.b.C0117b bVar = this.f3664d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f3665e;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Exception{type=");
        i2.append(this.a);
        i2.append(", reason=");
        i2.append(this.b);
        i2.append(", frames=");
        i2.append(this.c);
        i2.append(", causedBy=");
        i2.append(this.f3664d);
        i2.append(", overflowCount=");
        return g.a.a.a.a.e(i2, this.f3665e, "}");
    }
}
