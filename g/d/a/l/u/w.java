package g.d.a.l.u;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import g.d.a.l.s.i;
import g.d.a.l.s.o;
import g.d.a.l.u.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data> implements n<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    public final c<Data> a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public g.d.a.l.s.d<AssetFileDescriptor> a(Uri uri) {
            return new g.d.a.l.s.a(this.a, uri);
        }

        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }

        public void c() {
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public g.d.a.l.s.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.a, uri);
        }

        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }

        public void c() {
        }
    }

    public interface c<Data> {
        g.d.a.l.s.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public g.d.a.l.s.d<InputStream> a(Uri uri) {
            return new o(this.a, uri);
        }

        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }

        public void c() {
        }
    }

    public w(c<Data> cVar) {
        this.a = cVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri = (Uri) obj;
        return new n.a(new g.d.a.q.b(uri), this.a.a(uri));
    }

    public boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
