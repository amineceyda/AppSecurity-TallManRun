package k.h0.i;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import javax.annotation.Nullable;
import k.q;
import l.e;
import l.x;
import l.y;
import l.z;
import okhttp3.internal.http2.StreamResetException;

public final class o {
    public long a = 0;
    public long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final f f4861d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<q> f4862e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4863f;

    /* renamed from: g  reason: collision with root package name */
    public final b f4864g;

    /* renamed from: h  reason: collision with root package name */
    public final a f4865h;

    /* renamed from: i  reason: collision with root package name */
    public final c f4866i;

    /* renamed from: j  reason: collision with root package name */
    public final c f4867j;

    /* renamed from: k  reason: collision with root package name */
    public a f4868k;

    public final class a implements x {
        public final e b = new e();
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4869d;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f4867j.n();
            r11.f4870e.b();
            r9 = java.lang.Math.min(r11.f4870e.b, r11.b.c);
            r1 = r11.f4870e;
            r1.b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                k.h0.i.o r0 = k.h0.i.o.this
                monitor-enter(r0)
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x007b }
                k.h0.i.o$c r1 = r1.f4867j     // Catch:{ all -> 0x007b }
                r1.i()     // Catch:{ all -> 0x007b }
            L_0x000a:
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x0072 }
                long r2 = r1.b     // Catch:{ all -> 0x0072 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f4869d     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.c     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                k.h0.i.a r2 = r1.f4868k     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                r1.j()     // Catch:{ all -> 0x0072 }
                goto L_0x000a
            L_0x0024:
                k.h0.i.o$c r1 = r1.f4867j     // Catch:{ all -> 0x007b }
                r1.n()     // Catch:{ all -> 0x007b }
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x007b }
                r1.b()     // Catch:{ all -> 0x007b }
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x007b }
                long r1 = r1.b     // Catch:{ all -> 0x007b }
                l.e r3 = r11.b     // Catch:{ all -> 0x007b }
                long r3 = r3.c     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x007b }
                long r2 = r1.b     // Catch:{ all -> 0x007b }
                long r2 = r2 - r9
                r1.b = r2     // Catch:{ all -> 0x007b }
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                k.h0.i.o$c r0 = r1.f4867j
                r0.i()
                k.h0.i.o r0 = k.h0.i.o.this     // Catch:{ all -> 0x0069 }
                k.h0.i.f r5 = r0.f4861d     // Catch:{ all -> 0x0069 }
                int r6 = r0.c     // Catch:{ all -> 0x0069 }
                if (r12 == 0) goto L_0x005a
                l.e r12 = r11.b     // Catch:{ all -> 0x0069 }
                long r0 = r12.c     // Catch:{ all -> 0x0069 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r12 = 1
                r7 = 1
                goto L_0x005c
            L_0x005a:
                r12 = 0
                r7 = 0
            L_0x005c:
                l.e r8 = r11.b     // Catch:{ all -> 0x0069 }
                r5.q(r6, r7, r8, r9)     // Catch:{ all -> 0x0069 }
                k.h0.i.o r12 = k.h0.i.o.this
                k.h0.i.o$c r12 = r12.f4867j
                r12.n()
                return
            L_0x0069:
                r12 = move-exception
                k.h0.i.o r0 = k.h0.i.o.this
                k.h0.i.o$c r0 = r0.f4867j
                r0.n()
                throw r12
            L_0x0072:
                r12 = move-exception
                k.h0.i.o r1 = k.h0.i.o.this     // Catch:{ all -> 0x007b }
                k.h0.i.o$c r1 = r1.f4867j     // Catch:{ all -> 0x007b }
                r1.n()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                goto L_0x007f
            L_0x007e:
                throw r12
            L_0x007f:
                goto L_0x007e
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.i.o.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.b.c <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r13.b.c <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r0.f4861d.q(r0.c, true, (l.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r1 = r13.f4870e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r13.c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            r13.f4870e.f4861d.s.flush();
            r13.f4870e.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f4870e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f4865h.f4869d != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r13 = this;
                k.h0.i.o r0 = k.h0.i.o.this
                monitor-enter(r0)
                boolean r1 = r13.c     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                k.h0.i.o r0 = k.h0.i.o.this
                k.h0.i.o$a r1 = r0.f4865h
                boolean r1 = r1.f4869d
                r2 = 1
                if (r1 != 0) goto L_0x0034
                l.e r1 = r13.b
                long r3 = r1.c
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x001d:
                l.e r0 = r13.b
                long r0 = r0.c
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 <= 0) goto L_0x0034
                r13.a(r2)
                goto L_0x001d
            L_0x0029:
                k.h0.i.f r7 = r0.f4861d
                int r8 = r0.c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.q(r8, r9, r10, r11)
            L_0x0034:
                k.h0.i.o r1 = k.h0.i.o.this
                monitor-enter(r1)
                r13.c = r2     // Catch:{ all -> 0x0049 }
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                k.h0.i.o r0 = k.h0.i.o.this
                k.h0.i.f r0 = r0.f4861d
                k.h0.i.p r0 = r0.s
                r0.flush()
                k.h0.i.o r0 = k.h0.i.o.this
                r0.a()
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                throw r0
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                goto L_0x0050
            L_0x004f:
                throw r1
            L_0x0050:
                goto L_0x004f
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.i.o.a.close():void");
        }

        public void flush() throws IOException {
            synchronized (o.this) {
                o.this.b();
            }
            while (this.b.c > 0) {
                a(false);
                o.this.f4861d.flush();
            }
        }

        public z i() {
            return o.this.f4867j;
        }

        public void m(e eVar, long j2) throws IOException {
            this.b.m(eVar, j2);
            while (this.b.c >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }
    }

    public final class b implements y {
        public final e b = new e();
        public final e c = new e();

        /* renamed from: d  reason: collision with root package name */
        public final long f4871d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4872e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4873f;

        public b(long j2) {
            this.f4871d = j2;
        }

        public long M(e eVar, long j2) throws IOException {
            a aVar;
            long M;
            if (j2 >= 0) {
                while (true) {
                    aVar = null;
                    synchronized (o.this) {
                        o.this.f4866i.i();
                        try {
                            o oVar = o.this;
                            a aVar2 = oVar.f4868k;
                            if (aVar2 != null) {
                                aVar = aVar2;
                            }
                            if (!this.f4872e) {
                                if (!oVar.f4862e.isEmpty()) {
                                    Objects.requireNonNull(o.this);
                                }
                                e eVar2 = this.c;
                                long j3 = eVar2.c;
                                if (j3 > 0) {
                                    M = eVar2.M(eVar, Math.min(j2, j3));
                                    o oVar2 = o.this;
                                    long j4 = oVar2.a + M;
                                    oVar2.a = j4;
                                    if (aVar == null && j4 >= ((long) (oVar2.f4861d.o.a() / 2))) {
                                        o oVar3 = o.this;
                                        oVar3.f4861d.t(oVar3.c, oVar3.a);
                                        o.this.a = 0;
                                    }
                                } else if (this.f4873f || aVar != null) {
                                    M = -1;
                                } else {
                                    o.this.j();
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            o.this.f4866i.n();
                        }
                    }
                }
                o.this.f4866i.n();
                if (M != -1) {
                    o.this.f4861d.o(M);
                    return M;
                } else if (aVar == null) {
                    return -1;
                } else {
                    throw new StreamResetException(aVar);
                }
            } else {
                throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
            }
        }

        public void close() throws IOException {
            long j2;
            synchronized (o.this) {
                this.f4872e = true;
                e eVar = this.c;
                j2 = eVar.c;
                eVar.a();
                if (!o.this.f4862e.isEmpty()) {
                    Objects.requireNonNull(o.this);
                }
                o.this.notifyAll();
            }
            if (j2 > 0) {
                o.this.f4861d.o(j2);
            }
            o.this.a();
        }

        public z i() {
            return o.this.f4866i;
        }
    }

    public class c extends l.c {
        public c() {
        }

        public IOException l(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void m() {
            o.this.e(a.f4790g);
        }

        public void n() throws IOException {
            if (k()) {
                throw l((IOException) null);
            }
        }
    }

    public o(int i2, f fVar, boolean z, boolean z2, @Nullable q qVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4862e = arrayDeque;
        this.f4866i = new c();
        this.f4867j = new c();
        this.f4868k = null;
        Objects.requireNonNull(fVar, "connection == null");
        this.c = i2;
        this.f4861d = fVar;
        this.b = (long) fVar.p.a();
        b bVar = new b((long) fVar.o.a());
        this.f4864g = bVar;
        a aVar = new a();
        this.f4865h = aVar;
        bVar.f4873f = z2;
        aVar.f4869d = z;
        if (qVar != null) {
            arrayDeque.add(qVar);
        }
        if (g() && qVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!g() && qVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public void a() throws IOException {
        boolean z;
        boolean h2;
        synchronized (this) {
            b bVar = this.f4864g;
            if (!bVar.f4873f && bVar.f4872e) {
                a aVar = this.f4865h;
                if (aVar.f4869d || aVar.c) {
                    z = true;
                    h2 = h();
                }
            }
            z = false;
            h2 = h();
        }
        if (z) {
            c(a.f4790g);
        } else if (!h2) {
            this.f4861d.k(this.c);
        }
    }

    public void b() throws IOException {
        a aVar = this.f4865h;
        if (aVar.c) {
            throw new IOException("stream closed");
        } else if (aVar.f4869d) {
            throw new IOException("stream finished");
        } else if (this.f4868k != null) {
            throw new StreamResetException(this.f4868k);
        }
    }

    public void c(a aVar) throws IOException {
        if (d(aVar)) {
            f fVar = this.f4861d;
            fVar.s.k(this.c, aVar);
        }
    }

    public final boolean d(a aVar) {
        synchronized (this) {
            if (this.f4868k != null) {
                return false;
            }
            if (this.f4864g.f4873f && this.f4865h.f4869d) {
                return false;
            }
            this.f4868k = aVar;
            notifyAll();
            this.f4861d.k(this.c);
            return true;
        }
    }

    public void e(a aVar) {
        if (d(aVar)) {
            this.f4861d.s(this.c, aVar);
        }
    }

    public x f() {
        synchronized (this) {
            if (!this.f4863f) {
                if (!g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f4865h;
    }

    public boolean g() {
        return this.f4861d.b == ((this.c & 1) == 1);
    }

    public synchronized boolean h() {
        if (this.f4868k != null) {
            return false;
        }
        b bVar = this.f4864g;
        if (bVar.f4873f || bVar.f4872e) {
            a aVar = this.f4865h;
            if ((aVar.f4869d || aVar.c) && this.f4863f) {
                return false;
            }
        }
        return true;
    }

    public void i() {
        boolean h2;
        synchronized (this) {
            this.f4864g.f4873f = true;
            h2 = h();
            notifyAll();
        }
        if (!h2) {
            this.f4861d.k(this.c);
        }
    }

    public void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
