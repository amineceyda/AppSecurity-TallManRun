package g.b.a.a;

import f.a.a.a.l.c;
import f.a.a.b.j;
import java.util.LinkedList;
import java.util.List;

public class a extends j<c> {

    /* renamed from: k  reason: collision with root package name */
    public f.a.a.a.f.a f1874k = null;

    /* renamed from: l  reason: collision with root package name */
    public List<b> f1875l = new LinkedList();

    public void s(Object obj) {
        c cVar = (c) obj;
        if (this.f1697e) {
            String loggerName = cVar.getLoggerName();
            int i2 = cVar.getLevel().levelInt;
            if (i2 == Integer.MIN_VALUE || i2 == 5000) {
                for (b v : this.f1875l) {
                    v.v(loggerName, this.f1874k.f1767e.s(cVar));
                }
            } else if (i2 == 10000) {
                for (b d2 : this.f1875l) {
                    d2.d(loggerName, this.f1874k.f1767e.s(cVar));
                }
            } else if (i2 == 20000) {
                for (b i3 : this.f1875l) {
                    i3.i(loggerName, this.f1874k.f1767e.s(cVar));
                }
            } else if (i2 == 30000) {
                for (b w : this.f1875l) {
                    w.w(loggerName, this.f1874k.f1767e.s(cVar));
                }
            } else if (i2 == 40000) {
                for (b e2 : this.f1875l) {
                    e2.e(loggerName, this.f1874k.f1767e.s(cVar));
                }
            }
        }
    }

    public void start() {
        f.a.a.a.f.a aVar = this.f1874k;
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
