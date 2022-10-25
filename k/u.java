package k;

import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.d;
import k.h0.c;
import k.h0.f.f;
import k.n;
import k.q;

public class u implements Cloneable, d.a {
    public static final List<v> y = c.q(v.HTTP_2, v.HTTP_1_1);
    public static final List<i> z = c.q(i.f4893g, i.f4894h);
    public final l b;
    public final List<v> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<i> f4924d;

    /* renamed from: e  reason: collision with root package name */
    public final List<s> f4925e;

    /* renamed from: f  reason: collision with root package name */
    public final List<s> f4926f;

    /* renamed from: g  reason: collision with root package name */
    public final n.b f4927g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f4928h;

    /* renamed from: i  reason: collision with root package name */
    public final k f4929i;

    /* renamed from: j  reason: collision with root package name */
    public final SocketFactory f4930j;

    /* renamed from: k  reason: collision with root package name */
    public final SSLSocketFactory f4931k;

    /* renamed from: l  reason: collision with root package name */
    public final k.h0.l.c f4932l;

    /* renamed from: m  reason: collision with root package name */
    public final HostnameVerifier f4933m;
    public final f n;
    public final b o;
    public final b p;
    public final h q;
    public final m r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;

    public class a extends k.h0.a {
        public void a(q.a aVar, String str, String str2) {
            aVar.a.add(str);
            aVar.a.add(str2.trim());
        }

        public Socket b(h hVar, a aVar, f fVar) {
            for (k.h0.f.c next : hVar.f4723d) {
                if (next.g(aVar, (f0) null) && next.h() && next != fVar.b()) {
                    if (fVar.n == null && fVar.f4758j.n.size() == 1) {
                        Socket c = fVar.c(true, false, false);
                        fVar.f4758j = next;
                        next.n.add(fVar.f4758j.n.get(0));
                        return c;
                    }
                    throw new IllegalStateException();
                }
            }
            return null;
        }

        public k.h0.f.c c(h hVar, a aVar, f fVar, f0 f0Var) {
            for (k.h0.f.c next : hVar.f4723d) {
                if (next.g(aVar, f0Var)) {
                    fVar.a(next, true);
                    return next;
                }
            }
            return null;
        }

        @Nullable
        public IOException d(d dVar, @Nullable IOException iOException) {
            return ((w) dVar).d(iOException);
        }
    }

    public static final class b {
        public l a = new l();
        public List<v> b = u.y;
        public List<i> c = u.z;

        /* renamed from: d  reason: collision with root package name */
        public final List<s> f4934d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final List<s> f4935e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public n.b f4936f = new o(n.a);

        /* renamed from: g  reason: collision with root package name */
        public ProxySelector f4937g;

        /* renamed from: h  reason: collision with root package name */
        public k f4938h;

        /* renamed from: i  reason: collision with root package name */
        public SocketFactory f4939i;

        /* renamed from: j  reason: collision with root package name */
        public HostnameVerifier f4940j;

        /* renamed from: k  reason: collision with root package name */
        public f f4941k;

        /* renamed from: l  reason: collision with root package name */
        public b f4942l;

        /* renamed from: m  reason: collision with root package name */
        public b f4943m;
        public h n;
        public m o;
        public boolean p;
        public boolean q;
        public boolean r;
        public int s;
        public int t;
        public int u;

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f4937g = proxySelector;
            if (proxySelector == null) {
                this.f4937g = new k.h0.k.a();
            }
            this.f4938h = k.a;
            this.f4939i = SocketFactory.getDefault();
            this.f4940j = k.h0.l.d.a;
            this.f4941k = f.c;
            b bVar = b.a;
            this.f4942l = bVar;
            this.f4943m = bVar;
            this.n = new h(5, 5, TimeUnit.MINUTES);
            this.o = m.a;
            this.p = true;
            this.q = true;
            this.r = true;
            this.s = AbstractNetAdapter.READ_TIMEOUT;
            this.t = AbstractNetAdapter.READ_TIMEOUT;
            this.u = AbstractNetAdapter.READ_TIMEOUT;
        }

        public u a() {
            return new u(this);
        }

        public b b(long j2, TimeUnit timeUnit) {
            this.s = c.d("timeout", j2, timeUnit);
            return this;
        }

        public b c(long j2, TimeUnit timeUnit) {
            this.t = c.d("timeout", j2, timeUnit);
            return this;
        }

        public b d(long j2, TimeUnit timeUnit) {
            this.u = c.d("timeout", j2, timeUnit);
            return this;
        }
    }

    static {
        k.h0.a.a = new a();
    }

    public u() {
        this(new b());
    }

    public u(b bVar) {
        boolean z2;
        this.b = bVar.a;
        this.c = bVar.b;
        List<i> list = bVar.c;
        this.f4924d = list;
        this.f4925e = c.p(bVar.f4934d);
        this.f4926f = c.p(bVar.f4935e);
        this.f4927g = bVar.f4936f;
        this.f4928h = bVar.f4937g;
        this.f4929i = bVar.f4938h;
        this.f4930j = bVar.f4939i;
        Iterator<i> it = list.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                i next = it.next();
                if (z2 || next.a) {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            this.f4931k = null;
            this.f4932l = null;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    k.h0.j.f fVar = k.h0.j.f.a;
                    SSLContext h2 = fVar.h();
                    h2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                    this.f4931k = h2.getSocketFactory();
                    this.f4932l = fVar.c(x509TrustManager);
                } catch (GeneralSecurityException e2) {
                    throw c.a("No System TLS", e2);
                }
            } catch (GeneralSecurityException e3) {
                throw c.a("No System TLS", e3);
            }
        }
        SSLSocketFactory sSLSocketFactory = this.f4931k;
        if (sSLSocketFactory != null) {
            k.h0.j.f.a.e(sSLSocketFactory);
        }
        this.f4933m = bVar.f4940j;
        f fVar2 = bVar.f4941k;
        k.h0.l.c cVar = this.f4932l;
        this.n = !c.m(fVar2.b, cVar) ? new f(fVar2.a, cVar) : fVar2;
        this.o = bVar.f4942l;
        this.p = bVar.f4943m;
        this.q = bVar.n;
        this.r = bVar.o;
        this.s = bVar.p;
        this.t = bVar.q;
        this.u = bVar.r;
        this.v = bVar.s;
        this.w = bVar.t;
        this.x = bVar.u;
        if (this.f4925e.contains((Object) null)) {
            StringBuilder i2 = g.a.a.a.a.i("Null interceptor: ");
            i2.append(this.f4925e);
            throw new IllegalStateException(i2.toString());
        } else if (this.f4926f.contains((Object) null)) {
            StringBuilder i3 = g.a.a.a.a.i("Null network interceptor: ");
            i3.append(this.f4926f);
            throw new IllegalStateException(i3.toString());
        }
    }

    public d a(x xVar) {
        w wVar = new w(this, xVar, false);
        wVar.f4950e = ((o) this.f4927g).a;
        return wVar;
    }
}
