package k;

import com.apkpure.aegon.components.download.DownloadTask;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k.h0.c;

public final class p {
    public final g0 a;
    public final g b;
    public final List<Certificate> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f4908d;

    public p(g0 g0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = g0Var;
        this.b = gVar;
        this.c = list;
        this.f4908d = list2;
    }

    public static p a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            g a2 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!DownloadTask.COMPLETE_ACTION_NONE.equals(protocol)) {
                g0 a3 = g0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List q = certificateArr != null ? c.q(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new p(a3, a2, q, localCertificates != null ? c.q(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b.equals(pVar.b) && this.c.equals(pVar.c) && this.f4908d.equals(pVar.f4908d);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.f4908d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
