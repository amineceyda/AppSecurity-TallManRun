package g.d.a.p;

import g.d.a.p.c;

public class h implements c, b {
    public final c a;
    public final Object b;
    public volatile b c;

    /* renamed from: d  reason: collision with root package name */
    public volatile b f2671d;

    /* renamed from: e  reason: collision with root package name */
    public c.a f2672e;

    /* renamed from: f  reason: collision with root package name */
    public c.a f2673f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2674g;

    public h(Object obj, c cVar) {
        c.a aVar = c.a.CLEARED;
        this.f2672e = aVar;
        this.f2673f = aVar;
        this.b = obj;
        this.a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.d.a.p.b r4) {
        /*
            r3 = this;
            g.d.a.p.c$a r0 = g.d.a.p.c.a.FAILED
            java.lang.Object r1 = r3.b
            monitor-enter(r1)
            g.d.a.p.b r2 = r3.c     // Catch:{ all -> 0x001c }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x001c }
            if (r4 != 0) goto L_0x0011
            r3.f2673f = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x0011:
            r3.f2672e = r0     // Catch:{ all -> 0x001c }
            g.d.a.p.c r4 = r3.a     // Catch:{ all -> 0x001c }
            if (r4 == 0) goto L_0x001a
            r4.a(r3)     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.a(g.d.a.p.b):void");
    }

    public void b() {
        c.a aVar = c.a.PAUSED;
        synchronized (this.b) {
            if (!this.f2673f.a()) {
                this.f2673f = aVar;
                this.f2671d.b();
            }
            if (!this.f2672e.a()) {
                this.f2672e = aVar;
                this.c.b();
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            if (!this.f2671d.c()) {
                if (!this.c.c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void clear() {
        synchronized (this.b) {
            this.f2674g = false;
            c.a aVar = c.a.CLEARED;
            this.f2672e = aVar;
            this.f2673f = aVar;
            this.f2671d.clear();
            this.c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(g.d.a.p.b r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof g.d.a.p.h
            r1 = 0
            if (r0 == 0) goto L_0x002e
            g.d.a.p.h r4 = (g.d.a.p.h) r4
            g.d.a.p.b r0 = r3.c
            if (r0 != 0) goto L_0x0010
            g.d.a.p.b r0 = r4.c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            g.d.a.p.b r0 = r3.c
            g.d.a.p.b r2 = r4.c
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            g.d.a.p.b r0 = r3.f2671d
            if (r0 != 0) goto L_0x0023
            g.d.a.p.b r4 = r4.f2671d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            g.d.a.p.b r0 = r3.f2671d
            g.d.a.p.b r4 = r4.f2671d
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.d(g.d.a.p.b):boolean");
    }

    public boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.f2672e == c.a.CLEARED;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(g.d.a.p.b r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            g.d.a.p.c r1 = r4.a     // Catch:{ all -> 0x0027 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.f(r4)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            g.d.a.p.b r1 = r4.c     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0024
            boolean r5 = r4.c()     // Catch:{ all -> 0x0027 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.f(g.d.a.p.b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(g.d.a.p.b r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            g.d.a.p.c r1 = r4.a     // Catch:{ all -> 0x0027 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.g(r4)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            g.d.a.p.b r1 = r4.c     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0027 }
            if (r5 != 0) goto L_0x0025
            g.d.a.p.c$a r5 = r4.f2672e     // Catch:{ all -> 0x0027 }
            g.d.a.p.c$a r1 = g.d.a.p.c.a.f2653e     // Catch:{ all -> 0x0027 }
            if (r5 == r1) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.g(g.d.a.p.b):boolean");
    }

    public c h() {
        c h2;
        synchronized (this.b) {
            c cVar = this.a;
            h2 = cVar != null ? cVar.h() : this;
        }
        return h2;
    }

    public void i() {
        c.a aVar = c.a.RUNNING;
        synchronized (this.b) {
            this.f2674g = true;
            try {
                if (!(this.f2672e == c.a.f2653e || this.f2673f == aVar)) {
                    this.f2673f = aVar;
                    this.f2671d.i();
                }
                if (this.f2674g && this.f2672e != aVar) {
                    this.f2672e = aVar;
                    this.c.i();
                }
            } finally {
                this.f2674g = false;
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.f2672e == c.a.RUNNING;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(g.d.a.p.b r4) {
        /*
            r3 = this;
            g.d.a.p.c$a r0 = g.d.a.p.c.a.f2653e
            java.lang.Object r1 = r3.b
            monitor-enter(r1)
            g.d.a.p.b r2 = r3.f2671d     // Catch:{ all -> 0x0029 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x0011
            r3.f2673f = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0011:
            r3.f2672e = r0     // Catch:{ all -> 0x0029 }
            g.d.a.p.c r4 = r3.a     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x001a
            r4.j(r3)     // Catch:{ all -> 0x0029 }
        L_0x001a:
            g.d.a.p.c$a r4 = r3.f2673f     // Catch:{ all -> 0x0029 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0029 }
            if (r4 != 0) goto L_0x0027
            g.d.a.p.b r4 = r3.f2671d     // Catch:{ all -> 0x0029 }
            r4.clear()     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.j(g.d.a.p.b):void");
    }

    public boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.f2672e == c.a.f2653e;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(g.d.a.p.b r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            g.d.a.p.c r1 = r4.a     // Catch:{ all -> 0x0027 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.l(r4)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            g.d.a.p.b r1 = r4.c     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0024
            g.d.a.p.c$a r5 = r4.f2672e     // Catch:{ all -> 0x0027 }
            g.d.a.p.c$a r1 = g.d.a.p.c.a.PAUSED     // Catch:{ all -> 0x0027 }
            if (r5 == r1) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.p.h.l(g.d.a.p.b):boolean");
    }
}
