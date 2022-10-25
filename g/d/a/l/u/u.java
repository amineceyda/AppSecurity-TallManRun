package g.d.a.l.u;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import g.d.a.l.u.n;
import java.io.File;
import java.io.InputStream;

public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    public static final class a implements o<String, AssetFileDescriptor> {
        public n<String, AssetFileDescriptor> b(r rVar) {
            return new u(rVar.c(Uri.class, AssetFileDescriptor.class));
        }

        public void c() {
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        public n<String, ParcelFileDescriptor> b(r rVar) {
            return new u(rVar.c(Uri.class, ParcelFileDescriptor.class));
        }

        public void c() {
        }
    }

    public static class c implements o<String, InputStream> {
        public n<String, InputStream> b(r rVar) {
            return new u(rVar.c(Uri.class, InputStream.class));
        }

        public void c() {
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri;
        File file;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else {
            if (str.charAt(0) == '/') {
                file = new File(str);
            } else {
                uri = Uri.parse(str);
                if (uri.getScheme() == null) {
                    file = new File(str);
                }
            }
            uri = Uri.fromFile(file);
        }
        if (uri == null || !this.a.b(uri)) {
            return null;
        }
        return this.a.a(uri, i2, i3, nVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
