package g.d.a.l.u;

import android.net.Uri;
import android.text.TextUtils;
import g.d.a.l.l;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

public class g implements l {
    public final h b;
    public final URL c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2547d;

    /* renamed from: e  reason: collision with root package name */
    public String f2548e;

    /* renamed from: f  reason: collision with root package name */
    public URL f2549f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f2550g;

    /* renamed from: h  reason: collision with root package name */
    public int f2551h;

    public g(String str) {
        h hVar = h.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f2547d = str;
            Objects.requireNonNull(hVar, "Argument must not be null");
            this.b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public void b(MessageDigest messageDigest) {
        if (this.f2550g == null) {
            this.f2550g = c().getBytes(l.a);
        }
        messageDigest.update(this.f2550g);
    }

    public String c() {
        String str = this.f2547d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f2548e)) {
            String str = this.f2547d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                Objects.requireNonNull(url, "Argument must not be null");
                str = url.toString();
            }
            this.f2548e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f2548e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.b.equals(gVar.b);
    }

    public int hashCode() {
        if (this.f2551h == 0) {
            int hashCode = c().hashCode();
            this.f2551h = hashCode;
            this.f2551h = this.b.hashCode() + (hashCode * 31);
        }
        return this.f2551h;
    }

    public String toString() {
        return c();
    }

    public g(URL url) {
        h hVar = h.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.c = url;
        this.f2547d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.b = hVar;
    }
}
