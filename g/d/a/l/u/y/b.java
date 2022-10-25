package g.d.a.l.u.y;

import android.net.Uri;
import g.d.a.l.u.g;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class b implements n<Uri, InputStream> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, InputStream> a;

    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> b(r rVar) {
            return new b(rVar.c(g.class, InputStream.class));
        }

        public void c() {
        }
    }

    public b(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, nVar);
    }

    public boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
