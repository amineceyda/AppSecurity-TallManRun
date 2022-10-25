package g.d.a.l.u;

import android.net.Uri;
import g.d.a.l.u.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data> implements n<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, Data> a;

    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.c(g.class, InputStream.class));
        }

        public void c() {
        }
    }

    public x(n<g, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, nVar);
    }

    public boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
