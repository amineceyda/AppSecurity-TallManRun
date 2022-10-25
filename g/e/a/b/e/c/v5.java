package g.e.a.b.e.c;

import android.net.Uri;

public final class v5 {
    public final Uri a;
    public final boolean b;

    public v5(Uri uri) {
        this((String) null, uri, false);
    }

    public v5(String str, Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final x5 a(String str, long j2) {
        return new r5(this, str, Long.valueOf(j2));
    }

    public final x5 b(String str, boolean z) {
        return new s5(this, str, Boolean.valueOf(z));
    }
}
