package k;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.h0.c;
import k.r;

public final class a {
    public final r a;
    public final m b;
    public final SocketFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4670d;

    /* renamed from: e  reason: collision with root package name */
    public final List<v> f4671e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i> f4672f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f4673g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f4674h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f4675i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f4676j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final f f4677k;

    public a(String str, int i2, m mVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<v> list, List<i> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        m mVar2 = mVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        r.a aVar = new r.a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        if (str4.equalsIgnoreCase("http")) {
            str3 = "http";
        } else if (!str4.equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(g.a.a.a.a.w("unexpected scheme: ", str4));
        }
        aVar.a = str3;
        Objects.requireNonNull(str, "host == null");
        String c2 = c.c(r.j(str, 0, str.length(), false));
        if (c2 != null) {
            aVar.f4916d = c2;
            if (i3 <= 0 || i3 > 65535) {
                throw new IllegalArgumentException(g.a.a.a.a.q("unexpected port: ", i2));
            }
            aVar.f4917e = i3;
            this.a = aVar.a();
            Objects.requireNonNull(mVar2, "dns == null");
            this.b = mVar2;
            Objects.requireNonNull(socketFactory2, "socketFactory == null");
            this.c = socketFactory2;
            Objects.requireNonNull(bVar2, "proxyAuthenticator == null");
            this.f4670d = bVar2;
            Objects.requireNonNull(list, "protocols == null");
            this.f4671e = c.p(list);
            Objects.requireNonNull(list2, "connectionSpecs == null");
            this.f4672f = c.p(list2);
            Objects.requireNonNull(proxySelector2, "proxySelector == null");
            this.f4673g = proxySelector2;
            this.f4674h = null;
            this.f4675i = sSLSocketFactory2;
            this.f4676j = hostnameVerifier;
            this.f4677k = fVar;
            return;
        }
        throw new IllegalArgumentException(g.a.a.a.a.w("unexpected host: ", str));
    }

    public boolean a(a aVar) {
        return this.b.equals(aVar.b) && this.f4670d.equals(aVar.f4670d) && this.f4671e.equals(aVar.f4671e) && this.f4672f.equals(aVar.f4672f) && this.f4673g.equals(aVar.f4673g) && c.m(this.f4674h, aVar.f4674h) && c.m(this.f4675i, aVar.f4675i) && c.m(this.f4676j, aVar.f4676j) && c.m(this.f4677k, aVar.f4677k) && this.a.f4911e == aVar.a.f4911e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = (this.f4673g.hashCode() + ((this.f4672f.hashCode() + ((this.f4671e.hashCode() + ((this.f4670d.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f4674h;
        int i2 = 0;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f4675i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f4676j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f4677k;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        Object obj;
        StringBuilder i2 = g.a.a.a.a.i("Address{");
        i2.append(this.a.f4910d);
        i2.append(Constants.KEY_INDEX_FILE_SEPARATOR);
        i2.append(this.a.f4911e);
        if (this.f4674h != null) {
            i2.append(", proxy=");
            obj = this.f4674h;
        } else {
            i2.append(", proxySelector=");
            obj = this.f4673g;
        }
        i2.append(obj);
        i2.append("}");
        return i2.toString();
    }
}
