package g.i.c.a.a.n.f;

import android.util.Log;
import g.c.a.b.c.g;
import g.i.c.a.a.e;
import g.i.c.a.a.f;
import g.i.c.a.a.n.f.d;
import g.i.c.a.a.r.e;
import java.util.Objects;
import org.slf4j.Logger;

public class a implements g.i.c.a.a.b, e {
    public int a = -1;
    public String b = "";
    public String c = "";

    public static class b {
        public static final a a = new a((C0171a) null);
    }

    public a() {
        Objects.requireNonNull(e.b.a);
        g.i.c.a.a.t.a.v().y(this);
    }

    public void a(f fVar) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            Log.i("DTAdditionalReportHandl", "changeSession: reason=" + fVar);
        }
        if (d.b.a.a != null) {
            Logger logger = g.a;
            synchronized (g.class) {
            }
            this.a = 0;
            this.b = null;
            this.c = null;
            if (eVar.a) {
                StringBuilder i2 = g.a.a.a.a.i("updateAppStartParams: mLastStartType=");
                i2.append(this.a);
                i2.append("， mLastCallFrom=");
                i2.append(this.b);
                i2.append("， mLastCallScheme=");
                i2.append(this.c);
                Log.i("DTAdditionalReportHandl", i2.toString());
            }
        }
    }

    public a(C0171a aVar) {
        Objects.requireNonNull(e.b.a);
        g.i.c.a.a.t.a.v().y(this);
    }
}
