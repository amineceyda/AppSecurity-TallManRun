package f.a.a.a.e;

import android.util.Log;
import f.a.a.a.l.c;
import f.a.a.b.j;

public class a extends j<c> {

    /* renamed from: k  reason: collision with root package name */
    public f.a.a.a.f.a f1624k = null;

    public void s(Object obj) {
        c cVar = (c) obj;
        if (this.f1697e) {
            String loggerName = cVar.getLoggerName();
            int i2 = cVar.getLevel().levelInt;
            if (i2 == Integer.MIN_VALUE || i2 == 5000) {
                Log.v(loggerName, this.f1624k.f1767e.s(cVar));
            } else if (i2 == 10000) {
                Log.d(loggerName, this.f1624k.f1767e.s(cVar));
            } else if (i2 == 20000) {
                Log.i(loggerName, this.f1624k.f1767e.s(cVar));
            } else if (i2 == 30000) {
                Log.w(loggerName, this.f1624k.f1767e.s(cVar));
            } else if (i2 == 40000) {
                Log.e(loggerName, this.f1624k.f1767e.s(cVar));
            }
        }
    }

    public void start() {
        f.a.a.a.f.a aVar = this.f1624k;
        if (aVar == null || aVar.f1767e == null) {
            StringBuilder i2 = g.a.a.a.a.i("No layout set for the appender named [");
            i2.append(this.f1699g);
            i2.append("].");
            m(i2.toString());
            return;
        }
        this.f1697e = true;
    }
}
