package g.i.b.e.d.a;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.text.TextUtils;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.i.b.e.c;
import g.i.b.e.h.b;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class e extends SSLSocketFactory {
    public static final String c = e.class.getSimpleName();
    public boolean a = false;
    public String b;

    public e(String str) {
        this.b = str;
    }

    public Socket createSocket() {
        return null;
    }

    public Socket createSocket(String str, int i2) {
        return null;
    }

    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return null;
    }

    public Socket createSocket(InetAddress inetAddress, int i2) {
        return null;
    }

    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return null;
    }

    public Socket createSocket(Socket socket, String str, int i2, boolean z) {
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = c;
            b.f(str2, "customized createSocket. host: " + this.b);
            try {
                SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getInsecure(AbstractNetAdapter.READ_TIMEOUT, new SSLSessionCache(c.f4125g));
                SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.b, i2, z);
                sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, true);
                sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
                sSLCertificateSocketFactory.setHostname(sSLSocket, this.b);
                sSLSocket.startHandshake();
                return sSLSocket;
            } catch (Throwable th) {
                this.a = true;
                if (th instanceof IOException) {
                    throw th;
                }
                throw new IOException("HalleySNI exception: ".concat(String.valueOf(th)));
            }
        } else {
            throw new IOException("Halley set empty bizHost");
        }
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.b) || !(obj instanceof e)) {
            return false;
        }
        String str = ((e) obj).b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.equals(str);
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
