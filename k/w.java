package k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import k.h0.g.f;
import k.h0.g.h;
import k.r;
import l.c;

public final class w implements d {
    public final u b;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final c f4949d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public n f4950e;

    /* renamed from: f  reason: collision with root package name */
    public final x f4951f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4952g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4953h;

    public class a extends c {
        public a() {
        }

        public void m() {
            w.this.cancel();
        }
    }

    public final class b extends k.h0.b {
        public final e c;

        static {
            Class<w> cls = w.class;
        }

        public b(e eVar) {
            super("OkHttp %s", w.this.c());
            this.c = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[Catch:{ all -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0033 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                k.w r0 = k.w.this
                l.c r0 = r0.f4949d
                r0.i()
                k.w r0 = k.w.this     // Catch:{ IOException -> 0x0035 }
                k.c0 r0 = r0.b()     // Catch:{ IOException -> 0x0035 }
                k.w r1 = k.w.this     // Catch:{ IOException -> 0x0035 }
                k.h0.g.h r1 = r1.c     // Catch:{ IOException -> 0x0035 }
                boolean r1 = r1.f4772d     // Catch:{ IOException -> 0x0035 }
                if (r1 == 0) goto L_0x0024
                k.e r0 = r5.c     // Catch:{ IOException -> 0x0030 }
                k.w r1 = k.w.this     // Catch:{ IOException -> 0x0030 }
                java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0030 }
                java.lang.String r3 = "Canceled"
                r2.<init>(r3)     // Catch:{ IOException -> 0x0030 }
                r0.onFailure(r1, r2)     // Catch:{ IOException -> 0x0030 }
                goto L_0x002b
            L_0x0024:
                k.e r1 = r5.c     // Catch:{ IOException -> 0x0030 }
                k.w r2 = k.w.this     // Catch:{ IOException -> 0x0030 }
                r1.onResponse(r2, r0)     // Catch:{ IOException -> 0x0030 }
            L_0x002b:
                k.w r0 = k.w.this
                k.u r0 = r0.b
                goto L_0x006c
            L_0x0030:
                r0 = move-exception
                r1 = 1
                goto L_0x0037
            L_0x0033:
                r0 = move-exception
                goto L_0x0074
            L_0x0035:
                r0 = move-exception
                r1 = 0
            L_0x0037:
                k.w r2 = k.w.this     // Catch:{ all -> 0x0033 }
                java.io.IOException r0 = r2.d(r0)     // Catch:{ all -> 0x0033 }
                if (r1 == 0) goto L_0x005d
                k.h0.j.f r1 = k.h0.j.f.a     // Catch:{ all -> 0x0033 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0033 }
                r3.<init>()     // Catch:{ all -> 0x0033 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0033 }
                k.w r4 = k.w.this     // Catch:{ all -> 0x0033 }
                java.lang.String r4 = r4.e()     // Catch:{ all -> 0x0033 }
                r3.append(r4)     // Catch:{ all -> 0x0033 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0033 }
                r1.l(r2, r3, r0)     // Catch:{ all -> 0x0033 }
                goto L_0x002b
            L_0x005d:
                k.w r1 = k.w.this     // Catch:{ all -> 0x0033 }
                k.n r1 = r1.f4950e     // Catch:{ all -> 0x0033 }
                java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0033 }
                k.e r1 = r5.c     // Catch:{ all -> 0x0033 }
                k.w r2 = k.w.this     // Catch:{ all -> 0x0033 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0033 }
                goto L_0x002b
            L_0x006c:
                k.l r0 = r0.b
                java.util.Deque<k.w$b> r1 = r0.c
                r0.a(r1, r5)
                return
            L_0x0074:
                k.w r1 = k.w.this
                k.u r1 = r1.b
                k.l r1 = r1.b
                java.util.Deque<k.w$b> r2 = r1.c
                r1.a(r2, r5)
                goto L_0x0081
            L_0x0080:
                throw r0
            L_0x0081:
                goto L_0x0080
            */
            throw new UnsupportedOperationException("Method not decompiled: k.w.b.a():void");
        }
    }

    public w(u uVar, x xVar, boolean z) {
        this.b = uVar;
        this.f4951f = xVar;
        this.f4952g = z;
        this.c = new h(uVar, z);
        a aVar = new a();
        this.f4949d = aVar;
        Objects.requireNonNull(uVar);
        aVar.g((long) 0, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0 = d(r0);
        java.util.Objects.requireNonNull(r3.f4950e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r1 = r3.b.b;
        r1.a(r1.f4907d, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.c0 a() throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f4953h     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x005c
            r0 = 1
            r3.f4953h = r0     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            k.h0.j.f r0 = k.h0.j.f.a
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.j(r1)
            k.h0.g.h r1 = r3.c
            r1.c = r0
            l.c r0 = r3.f4949d
            r0.i()
            k.n r0 = r3.f4950e
            java.util.Objects.requireNonNull(r0)
            k.u r0 = r3.b     // Catch:{ IOException -> 0x0047 }
            k.l r0 = r0.b     // Catch:{ IOException -> 0x0047 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0047 }
            java.util.Deque<k.w> r1 = r0.f4907d     // Catch:{ all -> 0x0042 }
            r1.add(r3)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0047 }
            k.c0 r0 = r3.b()     // Catch:{ IOException -> 0x0047 }
            if (r0 == 0) goto L_0x003a
            k.u r1 = r3.b
            k.l r1 = r1.b
            java.util.Deque<k.w> r2 = r1.f4907d
            r1.a(r2, r3)
            return r0
        L_0x003a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0047 }
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0047 }
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0047 }
            throw r1     // Catch:{ IOException -> 0x0047 }
        L_0x0045:
            r0 = move-exception
            goto L_0x0052
        L_0x0047:
            r0 = move-exception
            java.io.IOException r0 = r3.d(r0)     // Catch:{ all -> 0x0045 }
            k.n r1 = r3.f4950e     // Catch:{ all -> 0x0045 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0052:
            k.u r1 = r3.b
            k.l r1 = r1.b
            java.util.Deque<k.w> r2 = r1.f4907d
            r1.a(r2, r3)
            throw r0
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "Already Executed"
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.a():k.c0");
    }

    public c0 b() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.f4925e);
        arrayList.add(this.c);
        arrayList.add(new k.h0.g.a(this.b.f4929i));
        Objects.requireNonNull(this.b);
        arrayList.add(new k.h0.e.a((k.h0.e.c) null));
        arrayList.add(new k.h0.f.a(this.b));
        if (!this.f4952g) {
            arrayList.addAll(this.b.f4926f);
        }
        arrayList.add(new k.h0.g.b(this.f4952g));
        x xVar = this.f4951f;
        n nVar = this.f4950e;
        u uVar = this.b;
        return new f(arrayList, (k.h0.f.f) null, (k.h0.g.c) null, (k.h0.f.c) null, 0, xVar, this, nVar, uVar.v, uVar.w, uVar.x).a(xVar);
    }

    public String c() {
        r.a aVar;
        r rVar = this.f4951f.a;
        Objects.requireNonNull(rVar);
        try {
            aVar = new r.a();
            aVar.c(rVar, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Objects.requireNonNull(aVar);
        aVar.b = r.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.c = r.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.a().f4915i;
    }

    public void cancel() {
        k.h0.g.c cVar;
        k.h0.f.c cVar2;
        h hVar = this.c;
        hVar.f4772d = true;
        k.h0.f.f fVar = hVar.b;
        if (fVar != null) {
            synchronized (fVar.f4752d) {
                fVar.f4761m = true;
                cVar = fVar.n;
                cVar2 = fVar.f4758j;
            }
            if (cVar != null) {
                cVar.cancel();
            } else if (cVar2 != null) {
                k.h0.c.g(cVar2.f4737d);
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        u uVar = this.b;
        w wVar = new w(uVar, this.f4951f, this.f4952g);
        wVar.f4950e = ((o) uVar.f4927g).a;
        return wVar;
    }

    @Nullable
    public IOException d(@Nullable IOException iOException) {
        if (!this.f4949d.k()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.f4772d ? "canceled " : "");
        sb.append(this.f4952g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    public void x(e eVar) {
        synchronized (this) {
            if (!this.f4953h) {
                this.f4953h = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.c.c = k.h0.j.f.a.j("response.body().close()");
        Objects.requireNonNull(this.f4950e);
        l lVar = this.b.b;
        b bVar = new b(eVar);
        synchronized (lVar) {
            lVar.b.add(bVar);
        }
        lVar.b();
    }
}
