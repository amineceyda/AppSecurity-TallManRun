package g.i.b.e.d.a;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {
    public String a;

    public d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.a) || !(obj instanceof d)) {
            return false;
        }
        String str = ((d) obj).a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.a.equals(str);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.a, sSLSession);
    }
}
