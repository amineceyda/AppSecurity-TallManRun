package g.d.a.l.v.g;

import android.util.Log;
import g.d.a.l.c;
import g.d.a.l.n;
import g.d.a.l.q;
import g.d.a.l.t.v;
import g.d.a.r.a;
import java.io.File;
import java.io.IOException;

public class d implements q<c> {
    public boolean a(Object obj, File file, n nVar) {
        try {
            a.b(((c) ((v) obj).get()).b.a.a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    public c b(n nVar) {
        return c.SOURCE;
    }
}
