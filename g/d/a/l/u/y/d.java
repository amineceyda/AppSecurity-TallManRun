package g.d.a.l.u.y;

import android.content.Context;
import android.net.Uri;
import g.d.a.l.s.p.b;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import g.d.a.l.v.c.a0;
import g.d.a.q.b;
import java.io.InputStream;

public class d implements n<Uri, InputStream> {
    public final Context a;

    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public n<Uri, InputStream> b(r rVar) {
            return new d(this.a);
        }

        public void c() {
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri = (Uri) obj;
        if (e.e.d.l.a.W(i2, i3)) {
            Long l2 = (Long) nVar.c(a0.f2576d);
            if (l2 != null && l2.longValue() == -1) {
                b bVar = new b(uri);
                Context context = this.a;
                return new n.a(bVar, g.d.a.l.s.p.b.c(context, uri, new b.C0080b(context.getContentResolver())));
            }
        }
        return null;
    }

    public boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return e.e.d.l.a.V(uri) && uri.getPathSegments().contains("video");
    }
}
