package g.e.a.b.e.c;

import android.net.Uri;
import e.d.a;

public final class p5 {
    public static final a a = new a();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (p5.class) {
            a aVar = a;
            uri = (Uri) aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
