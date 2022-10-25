package g.e.b.l;

import android.util.Log;
import g.e.a.b.g.a;
import g.e.a.b.g.f;

public class g implements a<Void, Object> {
    public Object a(f<Void> fVar) throws Exception {
        if (fVar.k()) {
            return null;
        }
        g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
        Exception g2 = fVar.g();
        if (!fVar2.a(6)) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", g2);
        return null;
    }
}
