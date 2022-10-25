package g.e.b.l.j.j;

import android.app.ActivityManager;
import g.a.a.a.a;
import g.e.a.b.b.h.e;
import g.e.a.b.g.f;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.b0;
import g.e.b.l.j.l.k;
import g.e.b.l.j.l.l;
import g.e.b.l.j.l.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class r implements Callable<f<Void>> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.e.b.l.j.p.f f3519d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v f3520e;

    public r(v vVar, long j2, Throwable th, Thread thread, g.e.b.l.j.p.f fVar) {
        this.f3520e = vVar;
        this.a = j2;
        this.b = th;
        this.c = thread;
        this.f3519d = fVar;
    }

    public Object call() throws Exception {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        long j2 = this.a / 1000;
        String f2 = this.f3520e.f();
        Boolean bool = null;
        if (f2 == null) {
            g.e.b.l.j.f.a.c("Tried to write a fatal exception while no session was open.");
            return e.h(null);
        }
        this.f3520e.c.a();
        n0 n0Var = this.f3520e.f3529l;
        Throwable th = this.b;
        Thread thread = this.c;
        Objects.requireNonNull(n0Var);
        g.e.b.l.j.f.a.e("Persisting fatal event for session " + f2);
        d0 d0Var = n0Var.a;
        int i2 = d0Var.a.getResources().getConfiguration().orientation;
        g.e.b.l.j.q.e eVar = new g.e.b.l.j.q.e(th, d0Var.f3485d);
        k.b bVar = new k.b();
        bVar.e("crash");
        bVar.a = Long.valueOf(j2);
        String str = d0Var.c.f3492d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) d0Var.a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            bool = Boolean.valueOf(runningAppProcessInfo.importance != 100);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d0Var.f(thread, eVar.c, 4));
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread2 = (Thread) next.getKey();
            if (!thread2.equals(thread)) {
                arrayList.add(d0Var.f(thread2, d0Var.f3485d.a((StackTraceElement[]) next.getValue()), 0));
            }
        }
        m mVar = new m(new b0(arrayList), d0Var.c(eVar, 4, 8, 0), (a0.a) null, d0Var.e(), d0Var.a(), (m.a) null);
        String str2 = valueOf == null ? " uiOrientation" : "";
        if (str2.isEmpty()) {
            bVar.b(new l(mVar, (b0) null, (b0) null, bool2, valueOf.intValue(), (l.a) null));
            bVar.c(d0Var.b(i2));
            n0Var.b.d(n0Var.a(bVar.a(), n0Var.f3517d, n0Var.f3518e), f2, true);
            this.f3520e.d(this.a);
            this.f3520e.c(false, this.f3519d);
            v vVar = this.f3520e;
            new k(this.f3520e.f3523f);
            v.a(vVar, k.b);
            if (!this.f3520e.b.a()) {
                return e.h(null);
            }
            Executor executor = this.f3520e.f3522e.a;
            return ((g.e.b.l.j.p.e) this.f3519d).f3702i.get().a.l(executor, new q(this, executor));
        }
        throw new IllegalStateException(a.w("Missing required properties:", str2));
    }
}
