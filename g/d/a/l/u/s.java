package g.d.a.l.u;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import g.d.a.l.u.n;
import java.io.InputStream;

public class s<Data> implements n<Integer, Data> {
    public final n<Uri, Data> a;
    public final Resources b;

    public static final class a implements o<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.c(Uri.class, AssetFileDescriptor.class));
        }

        public void c() {
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.c(Uri.class, ParcelFileDescriptor.class));
        }

        public void c() {
        }
    }

    public static class c implements o<Integer, InputStream> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        public n<Integer, InputStream> b(r rVar) {
            return new s(this.a, rVar.c(Uri.class, InputStream.class));
        }

        public void c() {
        }
    }

    public static class d implements o<Integer, Uri> {
        public final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        public n<Integer, Uri> b(r rVar) {
            return new s(this.a, v.a);
        }

        public void c() {
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.b = resources;
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i2, i3, nVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
