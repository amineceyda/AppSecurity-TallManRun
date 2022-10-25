package k.h0.f;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.b0;
import k.c0;
import k.d;
import k.f0;
import k.h;
import k.h0.g.e;
import k.h0.h.a;
import k.h0.i.a;
import k.h0.i.f;
import k.h0.i.o;
import k.n;
import k.p;
import k.q;
import k.r;
import k.s;
import k.u;
import k.v;
import k.x;
import l.g;
import l.q;
import l.s;
import l.t;
import l.y;
import org.slf4j.helpers.MessageFormatter;

public final class c extends f.d {
    public final h b;
    public final f0 c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f4737d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f4738e;

    /* renamed from: f  reason: collision with root package name */
    public p f4739f;

    /* renamed from: g  reason: collision with root package name */
    public v f4740g;

    /* renamed from: h  reason: collision with root package name */
    public f f4741h;

    /* renamed from: i  reason: collision with root package name */
    public g f4742i;

    /* renamed from: j  reason: collision with root package name */
    public l.f f4743j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4744k;

    /* renamed from: l  reason: collision with root package name */
    public int f4745l;

    /* renamed from: m  reason: collision with root package name */
    public int f4746m = 1;
    public final List<Reference<f>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(h hVar, f0 f0Var) {
        this.b = hVar;
        this.c = f0Var;
    }

    public void a(f fVar) {
        synchronized (this.b) {
            this.f4746m = fVar.f();
        }
    }

    public void b(o oVar) throws IOException {
        oVar.c(a.REFUSED_STREAM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0125, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0125, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0125, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129 A[EDGE_INSN: B:81:0x0129->B:74:0x0129 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r15, int r16, int r17, int r18, boolean r19, k.d r20, k.n r21) {
        /*
            r14 = this;
            r7 = r14
            r8 = r20
            r9 = r21
            k.v r0 = r7.f4740g
            if (r0 != 0) goto L_0x0137
            k.f0 r0 = r7.c
            k.a r0 = r0.a
            java.util.List<k.i> r1 = r0.f4672f
            k.h0.f.b r10 = new k.h0.f.b
            r10.<init>(r1)
            javax.net.ssl.SSLSocketFactory r2 = r0.f4675i
            if (r2 != 0) goto L_0x0051
            k.i r0 = k.i.f4894h
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0044
            k.f0 r0 = r7.c
            k.a r0 = r0.a
            k.r r0 = r0.a
            java.lang.String r0 = r0.f4910d
            k.h0.j.f r1 = k.h0.j.f.a
            boolean r1 = r1.k(r0)
            if (r1 == 0) goto L_0x0031
            goto L_0x005b
        L_0x0031:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = g.a.a.a.a.c(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0044:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.util.List<k.v> r0 = r0.f4671e
            k.v r1 = k.v.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x012a
        L_0x005b:
            r11 = 0
            r12 = r11
        L_0x005d:
            k.f0 r0 = r7.c     // Catch:{ IOException -> 0x00c2 }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x00c2 }
            if (r0 == 0) goto L_0x007b
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r20
            r6 = r21
            r1.e(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00c2 }
            java.net.Socket r0 = r7.f4737d     // Catch:{ IOException -> 0x00c2 }
            if (r0 != 0) goto L_0x0077
            goto L_0x008d
        L_0x0077:
            r1 = r15
            r2 = r16
            goto L_0x0081
        L_0x007b:
            r1 = r15
            r2 = r16
            r14.d(r15, r2, r8, r9)     // Catch:{ IOException -> 0x00be }
        L_0x0081:
            r3 = r18
            r14.f(r10, r3, r8, r9)     // Catch:{ IOException -> 0x00bc }
            k.f0 r0 = r7.c     // Catch:{ IOException -> 0x00bc }
            java.net.InetSocketAddress r0 = r0.c     // Catch:{ IOException -> 0x00bc }
            java.util.Objects.requireNonNull(r21)     // Catch:{ IOException -> 0x00bc }
        L_0x008d:
            k.f0 r0 = r7.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00a7
            java.net.Socket r0 = r7.f4737d
            if (r0 == 0) goto L_0x009a
            goto L_0x00a7
        L_0x009a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00a7:
            k.h0.i.f r0 = r7.f4741h
            if (r0 == 0) goto L_0x00bb
            k.h r1 = r7.b
            monitor-enter(r1)
            k.h0.i.f r0 = r7.f4741h     // Catch:{ all -> 0x00b8 }
            int r0 = r0.f()     // Catch:{ all -> 0x00b8 }
            r7.f4746m = r0     // Catch:{ all -> 0x00b8 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
            goto L_0x00bb
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
            throw r0
        L_0x00bb:
            return
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c7
        L_0x00be:
            r0 = move-exception
        L_0x00bf:
            r3 = r18
            goto L_0x00c7
        L_0x00c2:
            r0 = move-exception
            r1 = r15
            r2 = r16
            goto L_0x00bf
        L_0x00c7:
            java.net.Socket r4 = r7.f4738e
            k.h0.c.g(r4)
            java.net.Socket r4 = r7.f4737d
            k.h0.c.g(r4)
            r7.f4738e = r11
            r7.f4737d = r11
            r7.f4742i = r11
            r7.f4743j = r11
            r7.f4739f = r11
            r7.f4740g = r11
            r7.f4741h = r11
            k.f0 r4 = r7.c
            java.net.InetSocketAddress r4 = r4.c
            java.util.Objects.requireNonNull(r21)
            if (r12 != 0) goto L_0x00ee
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x00f1
        L_0x00ee:
            r12.a(r0)
        L_0x00f1:
            if (r19 == 0) goto L_0x0129
            r4 = 1
            r10.f4736d = r4
            boolean r5 = r10.c
            r6 = 0
            if (r5 != 0) goto L_0x00fc
            goto L_0x0125
        L_0x00fc:
            boolean r5 = r0 instanceof java.net.ProtocolException
            if (r5 == 0) goto L_0x0101
            goto L_0x0125
        L_0x0101:
            boolean r5 = r0 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x0106
            goto L_0x0125
        L_0x0106:
            boolean r5 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x0113
            java.lang.Throwable r13 = r0.getCause()
            boolean r13 = r13 instanceof java.security.cert.CertificateException
            if (r13 == 0) goto L_0x0113
            goto L_0x0125
        L_0x0113:
            boolean r13 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r13 == 0) goto L_0x0118
            goto L_0x0125
        L_0x0118:
            if (r5 != 0) goto L_0x0124
            boolean r5 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r5 != 0) goto L_0x0124
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r4 = 0
        L_0x0124:
            r6 = r4
        L_0x0125:
            if (r6 == 0) goto L_0x0129
            goto L_0x005d
        L_0x0129:
            throw r12
        L_0x012a:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0137:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.c.c(int, int, int, int, boolean, k.d, k.n):void");
    }

    public final void d(int i2, int i3, d dVar, n nVar) throws IOException {
        Socket socket;
        f0 f0Var = this.c;
        Proxy proxy = f0Var.b;
        k.a aVar = f0Var.a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = aVar.c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f4737d = socket;
        InetSocketAddress inetSocketAddress = this.c.c;
        Objects.requireNonNull(nVar);
        this.f4737d.setSoTimeout(i3);
        try {
            k.h0.j.f.a.g(this.f4737d, this.c.c, i2);
            try {
                this.f4742i = new t(q.d(this.f4737d));
                this.f4743j = new s(q.b(this.f4737d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder i4 = g.a.a.a.a.i("Failed to connect to ");
            i4.append(this.c.c);
            ConnectException connectException = new ConnectException(i4.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, d dVar, n nVar) throws IOException {
        x.a aVar = new x.a();
        aVar.i(this.c.a.a);
        aVar.e("CONNECT", (b0) null);
        aVar.c("Host", k.h0.c.o(this.c.a.a, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/3.12.1");
        x a = aVar.a();
        c0.a aVar2 = new c0.a();
        aVar2.a = a;
        aVar2.b = v.HTTP_1_1;
        aVar2.c = 407;
        aVar2.f4698d = "Preemptive Authenticate";
        aVar2.f4701g = k.h0.c.c;
        aVar2.f4705k = -1;
        aVar2.f4706l = -1;
        q.a aVar3 = aVar2.f4700f;
        Objects.requireNonNull(aVar3);
        k.q.a("Proxy-Authenticate");
        k.q.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate");
        aVar3.a.add("Proxy-Authenticate");
        aVar3.a.add("OkHttp-Preemptive");
        aVar2.a();
        Objects.requireNonNull(this.c.a.f4670d);
        r rVar = a.a;
        int i5 = i2;
        d(i2, i3, dVar, nVar);
        g gVar = this.f4742i;
        k.h0.h.a aVar4 = new k.h0.h.a((u) null, (f) null, gVar, this.f4743j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar.i().g((long) i3, timeUnit);
        this.f4743j.i().g((long) i4, timeUnit);
        aVar4.k(a.c, "CONNECT " + k.h0.c.o(rVar, true) + " HTTP/1.1");
        aVar4.f4773d.flush();
        c0.a f2 = aVar4.f(false);
        f2.a = a;
        c0 a2 = f2.a();
        long a3 = e.a(a2);
        if (a3 == -1) {
            a3 = 0;
        }
        y h2 = aVar4.h(a3);
        k.h0.c.v(h2, Integer.MAX_VALUE, timeUnit);
        ((a.f) h2).close();
        int i6 = a2.f4688d;
        if (i6 != 200) {
            if (i6 == 407) {
                Objects.requireNonNull(this.c.a.f4670d);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder i7 = g.a.a.a.a.i("Unexpected response code for CONNECT: ");
            i7.append(a2.f4688d);
            throw new IOException(i7.toString());
        } else if (!this.f4742i.h().D() || !this.f4743j.h().D()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010a A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0110 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(k.h0.f.b r7, int r8, k.d r9, k.n r10) throws java.io.IOException {
        /*
            r6 = this;
            k.v r9 = k.v.HTTP_1_1
            k.f0 r0 = r6.c
            k.a r0 = r0.a
            javax.net.ssl.SSLSocketFactory r1 = r0.f4675i
            if (r1 != 0) goto L_0x0025
            java.util.List<k.v> r7 = r0.f4671e
            k.v r10 = k.v.H2_PRIOR_KNOWLEDGE
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x001e
            java.net.Socket r7 = r6.f4737d
            r6.f4738e = r7
            r6.f4740g = r10
            r6.j(r8)
            return
        L_0x001e:
            java.net.Socket r7 = r6.f4737d
            r6.f4738e = r7
            r6.f4740g = r9
            return
        L_0x0025:
            java.util.Objects.requireNonNull(r10)
            k.f0 r10 = r6.c
            k.a r10 = r10.a
            javax.net.ssl.SSLSocketFactory r0 = r10.f4675i
            r1 = 0
            java.net.Socket r2 = r6.f4737d     // Catch:{ AssertionError -> 0x0103 }
            k.r r3 = r10.a     // Catch:{ AssertionError -> 0x0103 }
            java.lang.String r4 = r3.f4910d     // Catch:{ AssertionError -> 0x0103 }
            int r3 = r3.f4911e     // Catch:{ AssertionError -> 0x0103 }
            r5 = 1
            java.net.Socket r0 = r0.createSocket(r2, r4, r3, r5)     // Catch:{ AssertionError -> 0x0103 }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ AssertionError -> 0x0103 }
            k.i r7 = r7.a(r0)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            boolean r2 = r7.b     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            if (r2 == 0) goto L_0x0051
            k.h0.j.f r2 = k.h0.j.f.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.r r3 = r10.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r3 = r3.f4910d     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.util.List<k.v> r4 = r10.f4671e     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r2.f(r0, r3, r4)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
        L_0x0051:
            r0.startHandshake()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            javax.net.ssl.SSLSession r2 = r0.getSession()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.p r3 = k.p.a(r2)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            javax.net.ssl.HostnameVerifier r4 = r10.f4676j     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.r r5 = r10.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r5 = r5.f4910d     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            boolean r2 = r4.verify(r5, r2)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            if (r2 == 0) goto L_0x00b0
            k.f r2 = r10.f4677k     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.r r10 = r10.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = r10.f4910d     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.util.List<java.security.cert.Certificate> r4 = r3.c     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r2.a(r10, r4)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            boolean r7 = r7.b     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            if (r7 == 0) goto L_0x007d
            k.h0.j.f r7 = k.h0.j.f.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r1 = r7.i(r0)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
        L_0x007d:
            r6.f4738e = r0     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            l.y r7 = l.q.d(r0)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            l.t r10 = new l.t     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r10.<init>(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r6.f4742i = r10     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.net.Socket r7 = r6.f4738e     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            l.x r7 = l.q.b(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            l.s r10 = new l.s     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r10.<init>(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r6.f4743j = r10     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r6.f4739f = r3     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            if (r1 == 0) goto L_0x009f
            k.v r9 = k.v.a(r1)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
        L_0x009f:
            r6.f4740g = r9     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.h0.j.f r7 = k.h0.j.f.a
            r7.a(r0)
            k.v r7 = r6.f4740g
            k.v r9 = k.v.HTTP_2
            if (r7 != r9) goto L_0x00af
            r6.j(r8)
        L_0x00af:
            return
        L_0x00b0:
            java.util.List<java.security.cert.Certificate> r7 = r3.c     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r9.<init>()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r1 = "Hostname "
            r9.append(r1)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            k.r r10 = r10.a     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = r10.f4910d     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = " not verified:\n    certificate: "
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = k.f.b(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = "\n    DN: "
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.security.Principal r10 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = r10.getName()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r10 = "\n    subjectAltNames: "
            r9.append(r10)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.util.List r7 = k.h0.l.d.a(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r9.append(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            java.lang.String r7 = r9.toString()     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            r8.<init>(r7)     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
            throw r8     // Catch:{ AssertionError -> 0x00fe, all -> 0x00fc }
        L_0x00fc:
            r7 = move-exception
            goto L_0x0112
        L_0x00fe:
            r7 = move-exception
            r1 = r0
            goto L_0x0104
        L_0x0101:
            r7 = move-exception
            goto L_0x0111
        L_0x0103:
            r7 = move-exception
        L_0x0104:
            boolean r8 = k.h0.c.t(r7)     // Catch:{ all -> 0x0101 }
            if (r8 == 0) goto L_0x0110
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0101 }
            r8.<init>(r7)     // Catch:{ all -> 0x0101 }
            throw r8     // Catch:{ all -> 0x0101 }
        L_0x0110:
            throw r7     // Catch:{ all -> 0x0101 }
        L_0x0111:
            r0 = r1
        L_0x0112:
            if (r0 == 0) goto L_0x0119
            k.h0.j.f r8 = k.h0.j.f.a
            r8.a(r0)
        L_0x0119:
            k.h0.c.g(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.c.f(k.h0.f.b, int, k.d, k.n):void");
    }

    public boolean g(k.a aVar, @Nullable f0 f0Var) {
        if (this.n.size() < this.f4746m && !this.f4744k) {
            k.h0.a aVar2 = k.h0.a.a;
            k.a aVar3 = this.c.a;
            Objects.requireNonNull((u.a) aVar2);
            if (!aVar3.a(aVar)) {
                return false;
            }
            if (aVar.a.f4910d.equals(this.c.a.a.f4910d)) {
                return true;
            }
            if (this.f4741h == null || f0Var == null || f0Var.b.type() != Proxy.Type.DIRECT || this.c.b.type() != Proxy.Type.DIRECT || !this.c.c.equals(f0Var.c) || f0Var.a.f4676j != k.h0.l.d.a || !k(aVar.a)) {
                return false;
            }
            try {
                aVar.f4677k.a(aVar.a.f4910d, this.f4739f.c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this.f4741h != null;
    }

    public k.h0.g.c i(u uVar, s.a aVar, f fVar) throws SocketException {
        if (this.f4741h != null) {
            return new k.h0.i.e(uVar, aVar, fVar, this.f4741h);
        }
        k.h0.g.f fVar2 = (k.h0.g.f) aVar;
        this.f4738e.setSoTimeout(fVar2.f4768j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4742i.i().g((long) fVar2.f4768j, timeUnit);
        this.f4743j.i().g((long) fVar2.f4769k, timeUnit);
        return new k.h0.h.a(uVar, fVar, this.f4742i, this.f4743j);
    }

    public final void j(int i2) throws IOException {
        this.f4738e.setSoTimeout(0);
        f.c cVar = new f.c(true);
        Socket socket = this.f4738e;
        String str = this.c.a.a.f4910d;
        g gVar = this.f4742i;
        l.f fVar = this.f4743j;
        cVar.a = socket;
        cVar.b = str;
        cVar.c = gVar;
        cVar.f4834d = fVar;
        cVar.f4835e = this;
        cVar.f4836f = i2;
        f fVar2 = new f(cVar);
        this.f4741h = fVar2;
        k.h0.i.p pVar = fVar2.s;
        synchronized (pVar) {
            if (pVar.f4879f) {
                throw new IOException("closed");
            } else if (pVar.c) {
                Logger logger = k.h0.i.p.f4876h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(k.h0.c.n(">> CONNECTION %s", k.h0.i.d.a.i()));
                }
                pVar.b.write(k.h0.i.d.a.s());
                pVar.b.flush();
            }
        }
        k.h0.i.p pVar2 = fVar2.s;
        k.h0.i.s sVar = fVar2.o;
        synchronized (pVar2) {
            if (!pVar2.f4879f) {
                pVar2.d(0, Integer.bitCount(sVar.a) * 6, (byte) 4, (byte) 0);
                int i3 = 0;
                while (i3 < 10) {
                    if (((1 << i3) & sVar.a) != 0) {
                        pVar2.b.writeShort(i3 == 4 ? 3 : i3 == 7 ? 4 : i3);
                        pVar2.b.writeInt(sVar.b[i3]);
                    }
                    i3++;
                }
                pVar2.b.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = fVar2.o.a();
        if (a != 65535) {
            fVar2.s.n(0, (long) (a - 65535));
        }
        new Thread(fVar2.t).start();
    }

    public boolean k(r rVar) {
        int i2 = rVar.f4911e;
        r rVar2 = this.c.a.a;
        if (i2 != rVar2.f4911e) {
            return false;
        }
        if (rVar.f4910d.equals(rVar2.f4910d)) {
            return true;
        }
        p pVar = this.f4739f;
        if (pVar == null || !k.h0.l.d.a.c(rVar.f4910d, (X509Certificate) pVar.c.get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Connection{");
        i2.append(this.c.a.a.f4910d);
        i2.append(Constants.KEY_INDEX_FILE_SEPARATOR);
        i2.append(this.c.a.a.f4911e);
        i2.append(", proxy=");
        i2.append(this.c.b);
        i2.append(" hostAddress=");
        i2.append(this.c.c);
        i2.append(" cipherSuite=");
        p pVar = this.f4739f;
        i2.append(pVar != null ? pVar.b : "none");
        i2.append(" protocol=");
        i2.append(this.f4740g);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
