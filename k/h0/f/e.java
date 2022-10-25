package k.h0.f;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.d;
import k.f0;
import k.h0.c;
import k.n;
import k.r;

public final class e {
    public final k.a a;
    public final d b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final n f4747d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f4748e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f4749f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f4750g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f0> f4751h = new ArrayList();

    public static final class a {
        public final List<f0> a;
        public int b = 0;

        public a(List<f0> list) {
            this.a = list;
        }

        public boolean a() {
            return this.b < this.a.size();
        }
    }

    public e(k.a aVar, d dVar, d dVar2, n nVar) {
        List<Proxy> list;
        this.a = aVar;
        this.b = dVar;
        this.c = dVar2;
        this.f4747d = nVar;
        r rVar = aVar.a;
        Proxy proxy = aVar.f4674h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f4673g.select(rVar.o());
            if (select == null || select.isEmpty()) {
                list = c.q(Proxy.NO_PROXY);
            } else {
                list = c.p(select);
            }
        }
        this.f4748e = list;
        this.f4749f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(k.f0 r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            k.a r0 = r3.a
            java.net.ProxySelector r1 = r0.f4673g
            if (r1 == 0) goto L_0x001f
            k.r r0 = r0.a
            java.net.URI r0 = r0.o()
            java.net.Proxy r2 = r4.b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            k.h0.f.d r5 = r3.b
            monitor-enter(r5)
            java.util.Set<k.f0> r0 = r5.a     // Catch:{ all -> 0x0029 }
            r0.add(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r5)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.e.a(k.f0, java.io.IOException):void");
    }

    public boolean b() {
        return c() || !this.f4751h.isEmpty();
    }

    public final boolean c() {
        return this.f4749f < this.f4748e.size();
    }
}
