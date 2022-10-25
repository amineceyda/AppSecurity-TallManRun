package k.h0.h;

import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.report.ATTAReporter;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.c0;
import k.e0;
import k.h0.g.i;
import k.q;
import k.r;
import k.u;
import l.l;
import l.q;
import l.t;
import l.x;
import l.y;
import l.z;

public final class a implements k.h0.g.c {
    public final u a;
    public final k.h0.f.f b;
    public final l.g c;

    /* renamed from: d  reason: collision with root package name */
    public final l.f f4773d;

    /* renamed from: e  reason: collision with root package name */
    public int f4774e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f4775f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public abstract class b implements y {
        public final l b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public long f4776d = 0;

        public b(C0196a aVar) {
            this.b = new l(a.this.c.i());
        }

        public long M(l.e eVar, long j2) throws IOException {
            try {
                long M = a.this.c.M(eVar, j2);
                if (M > 0) {
                    this.f4776d += M;
                }
                return M;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        public final void a(boolean z, IOException iOException) throws IOException {
            a aVar = a.this;
            int i2 = aVar.f4774e;
            if (i2 != 6) {
                if (i2 == 5) {
                    aVar.g(this.b);
                    a aVar2 = a.this;
                    aVar2.f4774e = 6;
                    k.h0.f.f fVar = aVar2.b;
                    if (fVar != null) {
                        fVar.i(!z, aVar2, this.f4776d, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder i3 = g.a.a.a.a.i("state: ");
                i3.append(a.this.f4774e);
                throw new IllegalStateException(i3.toString());
            }
        }

        public z i() {
            return this.b;
        }
    }

    public final class c implements x {
        public final l b;
        public boolean c;

        public c() {
            this.b = new l(a.this.f4773d.i());
        }

        public synchronized void close() throws IOException {
            if (!this.c) {
                this.c = true;
                a.this.f4773d.W("0\r\n\r\n");
                a.this.g(this.b);
                a.this.f4774e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.c) {
                a.this.f4773d.flush();
            }
        }

        public z i() {
            return this.b;
        }

        public void m(l.e eVar, long j2) throws IOException {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                a.this.f4773d.r(j2);
                a.this.f4773d.W("\r\n");
                a.this.f4773d.m(eVar, j2);
                a.this.f4773d.W("\r\n");
            }
        }
    }

    public class d extends b {

        /* renamed from: f  reason: collision with root package name */
        public final r f4779f;

        /* renamed from: g  reason: collision with root package name */
        public long f4780g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4781h = true;

        public d(r rVar) {
            super((C0196a) null);
            this.f4779f = rVar;
        }

        public long M(l.e eVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
            } else if (this.c) {
                throw new IllegalStateException("closed");
            } else if (!this.f4781h) {
                return -1;
            } else {
                long j3 = this.f4780g;
                if (j3 == 0 || j3 == -1) {
                    if (j3 != -1) {
                        a.this.c.y();
                    }
                    try {
                        this.f4780g = a.this.c.b0();
                        String trim = a.this.c.y().trim();
                        if (this.f4780g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4780g + trim + "\"");
                        }
                        if (this.f4780g == 0) {
                            this.f4781h = false;
                            a aVar = a.this;
                            k.h0.g.e.d(aVar.a.f4929i, this.f4779f, aVar.j());
                            a(true, (IOException) null);
                        }
                        if (!this.f4781h) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long M = super.M(eVar, Math.min(j2, this.f4780g));
                if (M != -1) {
                    this.f4780g -= M;
                    return M;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.c) {
                if (this.f4781h && !k.h0.c.l(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.c = true;
            }
        }
    }

    public final class e implements x {
        public final l b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public long f4783d;

        public e(long j2) {
            this.b = new l(a.this.f4773d.i());
            this.f4783d = j2;
        }

        public void close() throws IOException {
            if (!this.c) {
                this.c = true;
                if (this.f4783d <= 0) {
                    a.this.g(this.b);
                    a.this.f4774e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() throws IOException {
            if (!this.c) {
                a.this.f4773d.flush();
            }
        }

        public z i() {
            return this.b;
        }

        public void m(l.e eVar, long j2) throws IOException {
            if (!this.c) {
                k.h0.c.e(eVar.c, 0, j2);
                if (j2 <= this.f4783d) {
                    a.this.f4773d.m(eVar, j2);
                    this.f4783d -= j2;
                    return;
                }
                StringBuilder i2 = g.a.a.a.a.i("expected ");
                i2.append(this.f4783d);
                i2.append(" bytes but received ");
                i2.append(j2);
                throw new ProtocolException(i2.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    public class f extends b {

        /* renamed from: f  reason: collision with root package name */
        public long f4785f;

        public f(a aVar, long j2) throws IOException {
            super((C0196a) null);
            this.f4785f = j2;
            if (j2 == 0) {
                a(true, (IOException) null);
            }
        }

        public long M(l.e eVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
            } else if (!this.c) {
                long j3 = this.f4785f;
                if (j3 == 0) {
                    return -1;
                }
                long M = super.M(eVar, Math.min(j3, j2));
                if (M != -1) {
                    long j4 = this.f4785f - M;
                    this.f4785f = j4;
                    if (j4 == 0) {
                        a(true, (IOException) null);
                    }
                    return M;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.c) {
                if (this.f4785f != 0 && !k.h0.c.l(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.c = true;
            }
        }
    }

    public class g extends b {

        /* renamed from: f  reason: collision with root package name */
        public boolean f4786f;

        public g(a aVar) {
            super((C0196a) null);
        }

        public long M(l.e eVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
            } else if (this.c) {
                throw new IllegalStateException("closed");
            } else if (this.f4786f) {
                return -1;
            } else {
                long M = super.M(eVar, j2);
                if (M != -1) {
                    return M;
                }
                this.f4786f = true;
                a(true, (IOException) null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.c) {
                if (!this.f4786f) {
                    a(false, (IOException) null);
                }
                this.c = true;
            }
        }
    }

    public a(u uVar, k.h0.f.f fVar, l.g gVar, l.f fVar2) {
        this.a = uVar;
        this.b = fVar;
        this.c = gVar;
        this.f4773d = fVar2;
    }

    public void a() throws IOException {
        this.f4773d.flush();
    }

    public void b(k.x xVar) throws IOException {
        Proxy.Type type = this.b.b().c.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.b);
        sb.append(' ');
        if (!xVar.a.a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(xVar.a);
        } else {
            sb.append(g.h.a.a.W(xVar.a));
        }
        sb.append(" HTTP/1.1");
        k(xVar.c, sb.toString());
    }

    public e0 c(c0 c0Var) throws IOException {
        Objects.requireNonNull(this.b.f4754f);
        String c2 = c0Var.f4691g.c(ATTAReporter.KEY_CONTENT_TYPE);
        String str = null;
        if (c2 == null) {
            c2 = null;
        }
        if (!k.h0.g.e.b(c0Var)) {
            y h2 = h(0);
            Logger logger = q.a;
            return new k.h0.g.g(c2, 0, new t(h2));
        }
        String c3 = c0Var.f4691g.c("Transfer-Encoding");
        if (c3 != null) {
            str = c3;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            r rVar = c0Var.b.a;
            if (this.f4774e == 4) {
                this.f4774e = 5;
                d dVar = new d(rVar);
                Logger logger2 = q.a;
                return new k.h0.g.g(c2, -1, new t(dVar));
            }
            StringBuilder i2 = g.a.a.a.a.i("state: ");
            i2.append(this.f4774e);
            throw new IllegalStateException(i2.toString());
        }
        long a2 = k.h0.g.e.a(c0Var);
        if (a2 != -1) {
            y h3 = h(a2);
            Logger logger3 = q.a;
            return new k.h0.g.g(c2, a2, new t(h3));
        } else if (this.f4774e == 4) {
            k.h0.f.f fVar = this.b;
            if (fVar != null) {
                this.f4774e = 5;
                fVar.f();
                g gVar = new g(this);
                Logger logger4 = q.a;
                return new k.h0.g.g(c2, -1, new t(gVar));
            }
            throw new IllegalStateException("streamAllocation == null");
        } else {
            StringBuilder i3 = g.a.a.a.a.i("state: ");
            i3.append(this.f4774e);
            throw new IllegalStateException(i3.toString());
        }
    }

    public void cancel() {
        k.h0.f.c b2 = this.b.b();
        if (b2 != null) {
            k.h0.c.g(b2.f4737d);
        }
    }

    public void d() throws IOException {
        this.f4773d.flush();
    }

    public x e(k.x xVar, long j2) {
        if ("chunked".equalsIgnoreCase(xVar.c.c("Transfer-Encoding"))) {
            if (this.f4774e == 1) {
                this.f4774e = 2;
                return new c();
            }
            StringBuilder i2 = g.a.a.a.a.i("state: ");
            i2.append(this.f4774e);
            throw new IllegalStateException(i2.toString());
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f4774e == 1) {
            this.f4774e = 2;
            return new e(j2);
        } else {
            StringBuilder i3 = g.a.a.a.a.i("state: ");
            i3.append(this.f4774e);
            throw new IllegalStateException(i3.toString());
        }
    }

    public c0.a f(boolean z) throws IOException {
        int i2 = this.f4774e;
        if (i2 == 1 || i2 == 3) {
            try {
                i a2 = i.a(i());
                c0.a aVar = new c0.a();
                aVar.b = a2.a;
                aVar.c = a2.b;
                aVar.f4698d = a2.c;
                aVar.d(j());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.f4774e = 3;
                    return aVar;
                }
                this.f4774e = 4;
                return aVar;
            } catch (EOFException e2) {
                StringBuilder i3 = g.a.a.a.a.i("unexpected end of stream on ");
                i3.append(this.b);
                IOException iOException = new IOException(i3.toString());
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            StringBuilder i4 = g.a.a.a.a.i("state: ");
            i4.append(this.f4774e);
            throw new IllegalStateException(i4.toString());
        }
    }

    public void g(l lVar) {
        z zVar = lVar.f4972e;
        lVar.f4972e = z.f4990d;
        zVar.a();
        zVar.b();
    }

    public y h(long j2) throws IOException {
        if (this.f4774e == 4) {
            this.f4774e = 5;
            return new f(this, j2);
        }
        StringBuilder i2 = g.a.a.a.a.i("state: ");
        i2.append(this.f4774e);
        throw new IllegalStateException(i2.toString());
    }

    public final String i() throws IOException {
        String N = this.c.N(this.f4775f);
        this.f4775f -= (long) N.length();
        return N;
    }

    public k.q j() throws IOException {
        q.a aVar = new q.a();
        while (true) {
            String i2 = i();
            if (i2.length() == 0) {
                return new k.q(aVar);
            }
            Objects.requireNonNull((u.a) k.h0.a.a);
            int indexOf = i2.indexOf(Constants.KEY_INDEX_FILE_SEPARATOR, 1);
            if (indexOf != -1) {
                aVar.b(i2.substring(0, indexOf), i2.substring(indexOf + 1));
            } else {
                if (i2.startsWith(Constants.KEY_INDEX_FILE_SEPARATOR)) {
                    i2 = i2.substring(1);
                }
                aVar.a.add("");
                aVar.a.add(i2.trim());
            }
        }
    }

    public void k(k.q qVar, String str) throws IOException {
        if (this.f4774e == 0) {
            this.f4773d.W(str).W("\r\n");
            int f2 = qVar.f();
            for (int i2 = 0; i2 < f2; i2++) {
                this.f4773d.W(qVar.d(i2)).W(": ").W(qVar.g(i2)).W("\r\n");
            }
            this.f4773d.W("\r\n");
            this.f4774e = 1;
            return;
        }
        StringBuilder i3 = g.a.a.a.a.i("state: ");
        i3.append(this.f4774e);
        throw new IllegalStateException(i3.toString());
    }
}
