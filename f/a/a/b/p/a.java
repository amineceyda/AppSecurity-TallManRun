package f.a.a.b.p;

import f.a.a.b.d;
import f.a.a.b.z.h;

public class a extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final h f1706f = new h((long) 0.0d);

    /* renamed from: e  reason: collision with root package name */
    public h f1707e = f1706f;

    public void run() {
        if (this.f1707e.a > 0) {
            StringBuilder i2 = g.a.a.a.a.i("Sleeping for ");
            i2.append(this.f1707e);
            n(i2.toString());
            try {
                Thread.sleep(this.f1707e.a);
            } catch (InterruptedException unused) {
            }
        }
        n("Logback context being closed via shutdown hook");
        d dVar = this.c;
        if (dVar instanceof d) {
            dVar.stop();
        }
    }
}
