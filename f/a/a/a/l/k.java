package f.a.a.a.l;

import f.a.a.a.b;
import f.a.a.a.m.a;
import f.a.a.b.w.h;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

public final class k extends CopyOnWriteArrayList<a> {
    private static final long serialVersionUID = 1;

    public h c(Marker marker, b bVar, f.a.a.a.a aVar, String str, Object[] objArr, Throwable th) {
        h hVar = h.NEUTRAL;
        if (size() == 1) {
            try {
                return ((a) get(0)).s(marker, bVar, aVar, str, objArr, th);
            } catch (IndexOutOfBoundsException unused) {
                return hVar;
            }
        } else {
            for (Object obj : toArray()) {
                h s = ((a) obj).s(marker, bVar, aVar, str, objArr, th);
                if (s == h.DENY || s == h.ACCEPT) {
                    return s;
                }
            }
            return hVar;
        }
    }
}
