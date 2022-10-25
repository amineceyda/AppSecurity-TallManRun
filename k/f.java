package k;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.h0.l.c;
import l.h;

public final class f {
    public static final f c = new f(new LinkedHashSet(new ArrayList()), (c) null);
    public final Set<a> a;
    @Nullable
    public final c b;

    public static final class a {
        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            Objects.requireNonNull((a) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public f(Set<a> set, @Nullable c cVar) {
        this.a = set;
        this.b = cVar;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder i2 = g.a.a.a.a.i("sha256/");
            i2.append(h.m(((X509Certificate) certificate).getPublicKey().getEncoded()).e("SHA-256").a());
            return i2.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.a.iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        } else if (!emptyList.isEmpty()) {
            c cVar = this.b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                if (emptyList.size() <= 0) {
                    i2++;
                } else {
                    Objects.requireNonNull((a) emptyList.get(0));
                    throw null;
                }
            }
            StringBuilder l2 = g.a.a.a.a.l("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                l2.append("\n    ");
                l2.append(b(x509Certificate2));
                l2.append(": ");
                l2.append(x509Certificate2.getSubjectDN().getName());
            }
            l2.append("\n  Pinned certificates for ");
            l2.append(str);
            l2.append(Constants.KEY_INDEX_FILE_SEPARATOR);
            int size3 = emptyList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                l2.append("\n    ");
                l2.append((a) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(l2.toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return k.h0.c.m(this.b, fVar.b) && this.a.equals(fVar.a);
        }
    }

    public int hashCode() {
        c cVar = this.b;
        return this.a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }
}
