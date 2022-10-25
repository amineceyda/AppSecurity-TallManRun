package k.h0.f;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import k.g;
import k.h0.a;
import k.h0.c;
import k.i;
import k.u;

public final class b {
    public final List<i> a;
    public int b = 0;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4736d;

    public b(List<i> list) {
        this.a = list;
    }

    public i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        boolean z;
        int i2 = this.b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = this.a.get(i2);
            if (iVar.a(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar != null) {
            int i3 = this.b;
            while (true) {
                if (i3 >= this.a.size()) {
                    z = false;
                    break;
                } else if (this.a.get(i3).a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.c = z;
            a aVar = a.a;
            boolean z2 = this.f4736d;
            Objects.requireNonNull((u.a) aVar);
            String[] s = iVar.c != null ? c.s(g.b, sSLSocket.getEnabledCipherSuites(), iVar.c) : sSLSocket.getEnabledCipherSuites();
            String[] s2 = iVar.f4895d != null ? c.s(c.o, sSLSocket.getEnabledProtocols(), iVar.f4895d) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = g.b;
            byte[] bArr = c.a;
            int length = supportedCipherSuites.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                if (((g.a) comparator).compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i4++;
            }
            if (z2 && i4 != -1) {
                String str = supportedCipherSuites[i4];
                int length2 = s.length + 1;
                String[] strArr = new String[length2];
                System.arraycopy(s, 0, strArr, 0, s.length);
                strArr[length2 - 1] = str;
                s = strArr;
            }
            boolean z3 = iVar.a;
            if (!z3) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (s.length != 0) {
                String[] strArr2 = (String[]) s.clone();
                if (!z3) {
                    throw new IllegalStateException("no TLS versions for cleartext connections");
                } else if (s2.length != 0) {
                    String[] strArr3 = (String[]) s2.clone();
                    if (strArr3 != null) {
                        sSLSocket.setEnabledProtocols(strArr3);
                    }
                    if (strArr2 != null) {
                        sSLSocket.setEnabledCipherSuites(strArr2);
                    }
                    return iVar;
                } else {
                    throw new IllegalArgumentException("At least one TLS version is required");
                }
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        } else {
            StringBuilder i5 = g.a.a.a.a.i("Unable to find acceptable protocols. isFallback=");
            i5.append(this.f4736d);
            i5.append(", modes=");
            i5.append(this.a);
            i5.append(", supported protocols=");
            i5.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(i5.toString());
        }
    }
}
