package k.h0.g;

import com.tencent.raft.measure.report.ATTAReporter;
import g.a.a.a.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.b;
import k.b0;
import k.c0;
import k.d;
import k.f0;
import k.h0.f.c;
import k.h0.f.e;
import k.h0.f.f;
import k.n;
import k.r;
import k.s;
import k.u;
import k.x;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

public final class h implements s {
    public final u a;
    public volatile f b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4772d;

    public h(u uVar, boolean z) {
        this.a = uVar;
    }

    public c0 a(s.a aVar) throws IOException {
        c cVar;
        f fVar = (f) aVar;
        x xVar = fVar.f4764f;
        d dVar = fVar.f4765g;
        n nVar = fVar.f4766h;
        f fVar2 = new f(this.a.q, b(xVar.a), dVar, nVar, this.c);
        this.b = fVar2;
        int i2 = 0;
        c0 c0Var = null;
        while (!this.f4772d) {
            try {
                c0 b2 = fVar.b(xVar, fVar2, (c) null, (c) null);
                if (c0Var != null) {
                    c0.a aVar2 = new c0.a(b2);
                    c0.a aVar3 = new c0.a(c0Var);
                    aVar3.f4701g = null;
                    c0 a2 = aVar3.a();
                    if (a2.f4692h == null) {
                        aVar2.f4704j = a2;
                        b2 = aVar2.a();
                    } else {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                }
                try {
                    x c2 = c(b2, fVar2.c);
                    if (c2 == null) {
                        fVar2.g();
                        return b2;
                    }
                    k.h0.c.f(b2.f4692h);
                    int i3 = i2 + 1;
                    if (i3 <= 20) {
                        if (!f(b2, c2.a)) {
                            fVar2.g();
                            fVar2 = new f(this.a.q, b(c2.a), dVar, nVar, this.c);
                            this.b = fVar2;
                        } else {
                            synchronized (fVar2.f4752d) {
                                cVar = fVar2.n;
                            }
                            if (cVar != null) {
                                throw new IllegalStateException("Closing the body of " + b2 + " didn't close its backing stream. Bad interceptor?");
                            }
                        }
                        c0Var = b2;
                        xVar = c2;
                        i2 = i3;
                    } else {
                        fVar2.g();
                        throw new ProtocolException(a.q("Too many follow-up requests: ", i3));
                    }
                } catch (IOException e2) {
                    fVar2.g();
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!d(e3.c(), fVar2, false, xVar)) {
                    throw e3.b();
                }
            } catch (IOException e4) {
                if (!d(e4, fVar2, !(e4 instanceof ConnectionShutdownException), xVar)) {
                    throw e4;
                }
            } catch (Throwable th) {
                fVar2.h((IOException) null);
                fVar2.g();
                throw th;
            }
        }
        fVar2.g();
        throw new IOException("Canceled");
    }

    public final k.a b(r rVar) {
        k.f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        r rVar2 = rVar;
        if (rVar2.a.equals("https")) {
            u uVar = this.a;
            SSLSocketFactory sSLSocketFactory2 = uVar.f4931k;
            HostnameVerifier hostnameVerifier2 = uVar.f4933m;
            fVar = uVar.n;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        String str = rVar2.f4910d;
        int i2 = rVar2.f4911e;
        u uVar2 = this.a;
        return new k.a(str, i2, uVar2.r, uVar2.f4930j, sSLSocketFactory, hostnameVerifier, fVar, uVar2.o, (Proxy) null, uVar2.c, uVar2.f4924d, uVar2.f4928h);
    }

    public final x c(c0 c0Var, f0 f0Var) throws IOException {
        r.a aVar;
        b bVar;
        Proxy proxy;
        int i2 = c0Var.f4688d;
        String str = c0Var.b.b;
        b0 b0Var = null;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                bVar = this.a.p;
            } else if (i2 == 503) {
                c0 c0Var2 = c0Var.f4695k;
                if ((c0Var2 == null || c0Var2.f4688d != 503) && e(c0Var, Integer.MAX_VALUE) == 0) {
                    return c0Var.b;
                }
                return null;
            } else if (i2 == 407) {
                if (f0Var != null) {
                    proxy = f0Var.b;
                } else {
                    Objects.requireNonNull(this.a);
                    proxy = null;
                }
                if (proxy.type() == Proxy.Type.HTTP) {
                    bVar = this.a.o;
                } else {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            } else if (i2 != 408) {
                switch (i2) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.a.u) {
                return null;
            } else {
                c0 c0Var3 = c0Var.f4695k;
                if ((c0Var3 == null || c0Var3.f4688d != 408) && e(c0Var, 0) <= 0) {
                    return c0Var.b;
                }
                return null;
            }
            Objects.requireNonNull(bVar);
            return null;
        } else if (!str.equals("GET") && !str.equals("HEAD")) {
            return null;
        }
        if (!this.a.t) {
            return null;
        }
        String c2 = c0Var.f4691g.c("Location");
        if (c2 == null) {
            c2 = null;
        }
        if (c2 == null) {
            return null;
        }
        r rVar = c0Var.b.a;
        Objects.requireNonNull(rVar);
        try {
            aVar = new r.a();
            aVar.c(rVar, c2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        r a2 = aVar != null ? aVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!a2.a.equals(c0Var.b.a.a) && !this.a.s) {
            return null;
        }
        x xVar = c0Var.b;
        Objects.requireNonNull(xVar);
        x.a aVar2 = new x.a(xVar);
        if (g.h.a.a.T(str)) {
            boolean equals = str.equals("PROPFIND");
            if (!str.equals("PROPFIND")) {
                aVar2.e("GET", (b0) null);
            } else {
                if (equals) {
                    b0Var = c0Var.b.f4956d;
                }
                aVar2.e(str, b0Var);
            }
            if (!equals) {
                aVar2.c.c("Transfer-Encoding");
                aVar2.c.c(ATTAReporter.KEY_CONTENT_LENGTH);
                aVar2.c.c(ATTAReporter.KEY_CONTENT_TYPE);
            }
        }
        if (!f(c0Var, a2)) {
            aVar2.c.c("Authorization");
        }
        aVar2.i(a2);
        return aVar2.a();
    }

    public final boolean d(IOException iOException, f fVar, boolean z, x xVar) {
        e.a aVar;
        fVar.h(iOException);
        if (!this.a.u) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        if (!(fVar.c != null || ((aVar = fVar.b) != null && aVar.a()) || fVar.f4756h.b())) {
            return false;
        }
        return true;
    }

    public final int e(c0 c0Var, int i2) {
        String c2 = c0Var.f4691g.c("Retry-After");
        if (c2 == null) {
            c2 = null;
        }
        if (c2 == null) {
            return i2;
        }
        if (c2.matches("\\d+")) {
            return Integer.valueOf(c2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean f(c0 c0Var, r rVar) {
        r rVar2 = c0Var.b.a;
        return rVar2.f4910d.equals(rVar.f4910d) && rVar2.f4911e == rVar.f4911e && rVar2.a.equals(rVar.a);
    }
}
