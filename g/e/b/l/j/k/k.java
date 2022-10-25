package g.e.b.l.j.k;

import g.e.b.l.j.j.m;
import g.e.b.l.j.n.f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class k {
    public final g a;
    public final m b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3538d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    public final a f3539e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicMarkableReference<String> f3540f = new AtomicMarkableReference<>((Object) null, false);

    public class a {
        public final AtomicMarkableReference<d> a;
        public final AtomicReference<Callable<Void>> b = new AtomicReference<>((Object) null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new d(64, z ? 8192 : 1024), false);
        }
    }

    public k(String str, f fVar, m mVar) {
        this.c = str;
        this.a = new g(fVar);
        this.b = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r4 = new g.e.b.l.j.k.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0.b.compareAndSet((java.lang.Object) null, r4) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0.f3541d.b.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            g.e.b.l.j.k.k$a r0 = r3.f3538d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<g.e.b.l.j.k.d> r1 = r0.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.getReference()     // Catch:{ all -> 0x0038 }
            g.e.b.l.j.k.d r1 = (g.e.b.l.j.k.d) r1     // Catch:{ all -> 0x0038 }
            boolean r4 = r1.c(r4, r5)     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x0014
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x0037
        L_0x0014:
            java.util.concurrent.atomic.AtomicMarkableReference<g.e.b.l.j.k.d> r4 = r0.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r4.getReference()     // Catch:{ all -> 0x0038 }
            g.e.b.l.j.k.d r5 = (g.e.b.l.j.k.d) r5     // Catch:{ all -> 0x0038 }
            r1 = 1
            r4.set(r5, r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            g.e.b.l.j.k.b r4 = new g.e.b.l.j.k.b
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r5 = r0.b
            r2 = 0
            boolean r5 = r5.compareAndSet(r2, r4)
            if (r5 == 0) goto L_0x0036
            g.e.b.l.j.k.k r5 = g.e.b.l.j.k.k.this
            g.e.b.l.j.j.m r5 = r5.b
            r5.b(r4)
        L_0x0036:
            r4 = 1
        L_0x0037:
            return r4
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.k.k.a(java.lang.String, java.lang.String):boolean");
    }
}
