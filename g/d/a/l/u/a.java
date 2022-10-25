package g.d.a.l.u;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import g.d.a.l.s.d;
import g.d.a.l.s.h;
import g.d.a.l.s.n;
import g.d.a.l.u.n;
import java.io.InputStream;

public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;
    public final C0088a<Data> b;

    /* renamed from: g.d.a.l.u.a$a  reason: collision with other inner class name */
    public interface C0088a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, C0088a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        public d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }

        public void c() {
        }
    }

    public static class c implements o<Uri, InputStream>, C0088a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        public d<InputStream> a(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }

        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }

        public void c() {
        }
    }

    public a(AssetManager assetManager, C0088a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri = (Uri) obj;
        return new n.a(new g.d.a.q.b(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    public boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
