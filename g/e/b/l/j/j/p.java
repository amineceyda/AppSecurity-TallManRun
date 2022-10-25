package g.e.b.l.j.j;

import android.util.Log;
import g.e.b.l.j.j.f0;
import g.e.b.l.j.p.f;

public class p implements f0.a {
    public final /* synthetic */ v a;

    public p(v vVar) {
        this.a = vVar;
    }

    public void a(f fVar, Thread thread, Throwable th) {
        v vVar = this.a;
        synchronized (vVar) {
            g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
            fVar2.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            try {
                q0.a(vVar.f3522e.c(new r(vVar, System.currentTimeMillis(), th, thread, fVar)));
            } catch (Exception e2) {
                if (g.e.b.l.j.f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
                }
            }
        }
    }
}
