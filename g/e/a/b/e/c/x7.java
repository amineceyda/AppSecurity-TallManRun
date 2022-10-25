package g.e.a.b.e.c;

public class x7 {
    public volatile o8 a;
    public volatile s6 b;

    static {
        b7.a();
    }

    public final int a() {
        if (this.b != null) {
            return ((r6) this.b).zza.length;
        }
        if (this.a != null) {
            return this.a.e();
        }
        return 0;
    }

    public final s6 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                s6 s6Var = this.b;
                return s6Var;
            }
            this.b = this.a == null ? s6.b : this.a.d();
            s6 s6Var2 = this.b;
            return s6Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(g.e.a.b.e.c.o8 r2) {
        /*
            r1 = this;
            g.e.a.b.e.c.o8 r0 = r1.a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            g.e.a.b.e.c.o8 r0 = r1.a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.a = r2     // Catch:{ zzkh -> 0x0011 }
            g.e.a.b.e.c.s6 r0 = g.e.a.b.e.c.s6.b     // Catch:{ zzkh -> 0x0011 }
            r1.b = r0     // Catch:{ zzkh -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.a = r2     // Catch:{ all -> 0x001b }
            g.e.a.b.e.c.s6 r2 = g.e.a.b.e.c.s6.b     // Catch:{ all -> 0x001b }
            r1.b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.x7.c(g.e.a.b.e.c.o8):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        o8 o8Var = this.a;
        o8 o8Var2 = x7Var.a;
        if (o8Var == null && o8Var2 == null) {
            return b().equals(x7Var.b());
        }
        if (o8Var != null && o8Var2 != null) {
            return o8Var.equals(o8Var2);
        }
        if (o8Var != null) {
            x7Var.c(o8Var.c());
            return o8Var.equals(x7Var.a);
        }
        c(o8Var2.c());
        return this.a.equals(o8Var2);
    }

    public int hashCode() {
        return 1;
    }
}
