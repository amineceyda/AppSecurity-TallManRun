package k.h0.i;

import com.tencent.raft.measure.report.ATTAReporter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.c0;
import k.e0;
import k.h0.f.f;
import k.h0.g.c;
import k.h0.g.g;
import k.h0.i.o;
import k.q;
import k.s;
import k.u;
import k.v;
import k.x;
import l.h;
import l.k;
import l.t;
import l.y;
import okhttp3.internal.http2.ConnectionShutdownException;

public final class e implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f4814f = k.h0.c.q("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f4815g = k.h0.c.q("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final s.a a;
    public final f b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public o f4816d;

    /* renamed from: e  reason: collision with root package name */
    public final v f4817e;

    public class a extends k {
        public boolean c = false;

        /* renamed from: d  reason: collision with root package name */
        public long f4818d = 0;

        public a(y yVar) {
            super(yVar);
        }

        public long M(l.e eVar, long j2) throws IOException {
            try {
                long M = this.b.M(eVar, j2);
                if (M > 0) {
                    this.f4818d += M;
                }
                return M;
            } catch (IOException e2) {
                a(e2);
                throw e2;
            }
        }

        public final void a(IOException iOException) {
            if (!this.c) {
                this.c = true;
                e eVar = e.this;
                eVar.b.i(false, eVar, this.f4818d, iOException);
            }
        }

        public void close() throws IOException {
            this.b.close();
            a((IOException) null);
        }
    }

    public e(u uVar, s.a aVar, f fVar, f fVar2) {
        this.a = aVar;
        this.b = fVar;
        this.c = fVar2;
        List<v> list = uVar.c;
        v vVar = v.H2_PRIOR_KNOWLEDGE;
        this.f4817e = !list.contains(vVar) ? v.HTTP_2 : vVar;
    }

    public void a() throws IOException {
        ((o.a) this.f4816d.f()).close();
    }

    public void b(x xVar) throws IOException {
        int i2;
        o oVar;
        if (this.f4816d == null) {
            boolean z = false;
            boolean z2 = xVar.f4956d != null;
            q qVar = xVar.c;
            ArrayList arrayList = new ArrayList(qVar.f() + 4);
            arrayList.add(new b(b.f4799f, xVar.b));
            arrayList.add(new b(b.f4800g, g.h.a.a.W(xVar.a)));
            String c2 = xVar.c.c("Host");
            if (c2 != null) {
                arrayList.add(new b(b.f4802i, c2));
            }
            arrayList.add(new b(b.f4801h, xVar.a.a));
            int f2 = qVar.f();
            for (int i3 = 0; i3 < f2; i3++) {
                h g2 = h.g(qVar.d(i3).toLowerCase(Locale.US));
                if (!f4814f.contains(g2.t())) {
                    arrayList.add(new b(g2, qVar.g(i3)));
                }
            }
            f fVar = this.c;
            boolean z3 = !z2;
            synchronized (fVar.s) {
                synchronized (fVar) {
                    if (fVar.f4823g > 1073741823) {
                        fVar.n(a.REFUSED_STREAM);
                    }
                    if (!fVar.f4824h) {
                        i2 = fVar.f4823g;
                        fVar.f4823g = i2 + 2;
                        oVar = new o(i2, fVar, z3, false, (q) null);
                        if (!z2 || fVar.n == 0 || oVar.b == 0) {
                            z = true;
                        }
                        if (oVar.h()) {
                            fVar.f4820d.put(Integer.valueOf(i2), oVar);
                        }
                    } else {
                        throw new ConnectionShutdownException();
                    }
                }
                p pVar = fVar.s;
                synchronized (pVar) {
                    if (!pVar.f4879f) {
                        pVar.g(z3, i2, arrayList);
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
            if (z) {
                fVar.s.flush();
            }
            this.f4816d = oVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oVar.f4866i.g((long) ((k.h0.g.f) this.a).f4768j, timeUnit);
            this.f4816d.f4867j.g((long) ((k.h0.g.f) this.a).f4769k, timeUnit);
        }
    }

    public e0 c(c0 c0Var) throws IOException {
        Objects.requireNonNull(this.b.f4754f);
        String c2 = c0Var.f4691g.c(ATTAReporter.KEY_CONTENT_TYPE);
        if (c2 == null) {
            c2 = null;
        }
        long a2 = k.h0.g.e.a(c0Var);
        a aVar = new a(this.f4816d.f4864g);
        Logger logger = l.q.a;
        return new g(c2, a2, new t(aVar));
    }

    public void cancel() {
        o oVar = this.f4816d;
        if (oVar != null) {
            oVar.e(a.f4790g);
        }
    }

    public void d() throws IOException {
        this.c.s.flush();
    }

    public l.x e(x xVar, long j2) {
        return this.f4816d.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        r0.f4866i.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.c0.a f(boolean r11) throws java.io.IOException {
        /*
            r10 = this;
            k.h0.i.o r0 = r10.f4816d
            monitor-enter(r0)
            k.h0.i.o$c r1 = r0.f4866i     // Catch:{ all -> 0x00d3 }
            r1.i()     // Catch:{ all -> 0x00d3 }
        L_0x0008:
            java.util.Deque<k.q> r1 = r0.f4862e     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0018
            k.h0.i.a r1 = r0.f4868k     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0018
            r0.j()     // Catch:{ all -> 0x00cc }
            goto L_0x0008
        L_0x0018:
            k.h0.i.o$c r1 = r0.f4866i     // Catch:{ all -> 0x00d3 }
            r1.n()     // Catch:{ all -> 0x00d3 }
            java.util.Deque<k.q> r1 = r0.f4862e     // Catch:{ all -> 0x00d3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c4
            java.util.Deque<k.q> r1 = r0.f4862e     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00d3 }
            k.q r1 = (k.q) r1     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            k.v r0 = r10.f4817e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            int r4 = r1.f()
            r5 = 0
            r6 = r5
        L_0x003e:
            if (r3 >= r4) goto L_0x0082
            java.lang.String r7 = r1.d(r3)
            java.lang.String r8 = r1.g(r3)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            k.h0.g.i r6 = k.h0.g.i.a(r6)
            goto L_0x007f
        L_0x0066:
            java.util.List<java.lang.String> r9 = f4815g
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007f
            k.h0.a r9 = k.h0.a.a
            k.u$a r9 = (k.u.a) r9
            java.util.Objects.requireNonNull(r9)
            r2.add(r7)
            java.lang.String r7 = r8.trim()
            r2.add(r7)
        L_0x007f:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x0082:
            if (r6 == 0) goto L_0x00bc
            k.c0$a r1 = new k.c0$a
            r1.<init>()
            r1.b = r0
            int r0 = r6.b
            r1.c = r0
            java.lang.String r0 = r6.c
            r1.f4698d = r0
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            k.q$a r2 = new k.q$a
            r2.<init>()
            java.util.List<java.lang.String> r3 = r2.a
            java.util.Collections.addAll(r3, r0)
            r1.f4700f = r2
            if (r11 == 0) goto L_0x00bb
            k.h0.a r11 = k.h0.a.a
            k.u$a r11 = (k.u.a) r11
            java.util.Objects.requireNonNull(r11)
            int r11 = r1.c
            r0 = 100
            if (r11 != r0) goto L_0x00bb
            return r5
        L_0x00bb:
            return r1
        L_0x00bc:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00c4:
            okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x00d3 }
            k.h0.i.a r1 = r0.f4868k     // Catch:{ all -> 0x00d3 }
            r11.<init>(r1)     // Catch:{ all -> 0x00d3 }
            throw r11     // Catch:{ all -> 0x00d3 }
        L_0x00cc:
            r11 = move-exception
            k.h0.i.o$c r1 = r0.f4866i     // Catch:{ all -> 0x00d3 }
            r1.n()     // Catch:{ all -> 0x00d3 }
            throw r11     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x00d7
        L_0x00d6:
            throw r11
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.e.f(boolean):k.c0$a");
    }
}
