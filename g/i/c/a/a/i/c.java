package g.i.c.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.r.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class c {
    public Handler a = new Handler(Looper.getMainLooper());
    public Map<String, g.i.c.a.a.i.e.c> b = new HashMap();
    public g.i.c.a.a.b0.e<d> c = new g.i.c.a.a.b0.e<>();

    /* renamed from: d  reason: collision with root package name */
    public Runnable f4432d = new f();

    /* renamed from: e  reason: collision with root package name */
    public final Object f4433e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f4434f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public Runnable f4435g = new g();

    public class a implements e.b<d> {
        public final /* synthetic */ g.i.c.a.a.q.c.a a;

        public a(c cVar, g.i.c.a.a.q.c.a aVar) {
            this.a = aVar;
        }

        public void a(Object obj) {
            ((d) obj).e(this.a);
        }
    }

    public class b implements e.b<d> {
        public final /* synthetic */ g.i.c.a.a.q.c.a a;

        public b(c cVar, g.i.c.a.a.q.c.a aVar) {
            this.a = aVar;
        }

        public void a(Object obj) {
            ((d) obj).g(this.a);
        }
    }

    /* renamed from: g.i.c.a.a.i.c$c  reason: collision with other inner class name */
    public class C0167c implements e.b<d> {
        public final /* synthetic */ g.i.c.a.a.q.c.a a;

        public C0167c(c cVar, g.i.c.a.a.q.c.a aVar) {
            this.a = aVar;
        }

        public void a(Object obj) {
            ((d) obj).m(this.a);
        }
    }

    public class d implements e.b<d> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Dialog b;

        public d(c cVar, Activity activity, Dialog dialog) {
            this.a = activity;
            this.b = dialog;
        }

        public void a(Object obj) {
            ((d) obj).p(this.a, this.b);
        }
    }

    public class e implements e.b<d> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Dialog b;

        public e(c cVar, Activity activity, Dialog dialog) {
            this.a = activity;
            this.b = dialog;
        }

        public void a(Object obj) {
            ((d) obj).c(this.a, this.b);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void run() {
            c.this.d();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            if (e.b.a.a) {
                StringBuilder i2 = g.a.a.a.a.i("mClearImmediateNotifierRunnable.run: mImmediateNotifySet = ");
                i2.append(c.this.f4434f);
                g.c.b.b.f.K("EventNotifyManager", i2.toString());
            }
            synchronized (c.this.f4433e) {
                c.this.f4434f.clear();
            }
        }
    }

    public class h implements e.b<d> {
        public final /* synthetic */ g.i.c.a.a.i.e.c a;

        public h(c cVar, g.i.c.a.a.i.e.c cVar2) {
            this.a = cVar2;
        }

        public void a(Object obj) {
            this.a.a((d) obj);
        }
    }

    public class i implements e.b<d> {
        public final /* synthetic */ Activity a;

        public i(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).l(this.a);
        }
    }

    public class j implements e.b<d> {
        public final /* synthetic */ Activity a;

        public j(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).onActivityStarted(this.a);
        }
    }

    public class k implements e.b<d> {
        public final /* synthetic */ Activity a;

        public k(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).s(this.a);
        }
    }

    public class l implements e.b<d> {
        public final /* synthetic */ Activity a;

        public l(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).k(this.a);
        }
    }

    public class m implements e.b<d> {
        public final /* synthetic */ Activity a;

        public m(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).onActivityStopped(this.a);
        }
    }

    public class n implements e.b<d> {
        public final /* synthetic */ Activity a;

        public n(c cVar, Activity activity) {
            this.a = activity;
        }

        public void a(Object obj) {
            ((d) obj).onActivityDestroyed(this.a);
        }
    }

    public void a(Object obj, g.i.c.a.a.i.e.c cVar) {
        String c2 = c(obj, cVar);
        synchronized (this) {
            g.i.c.a.a.i.e.c cVar2 = this.b.get(c2);
            if (cVar2 != null) {
                cVar2.c();
                g.i.c.a.a.b0.g.b(cVar2, cVar2.b());
            }
            this.b.put(c2, cVar);
        }
        this.a.removeCallbacks(this.f4432d);
        this.a.post(this.f4432d);
    }

    public void b(Object obj, g.i.c.a.a.i.e.c cVar) {
        String c2 = c(obj, cVar);
        if (e.b.a.a) {
            StringBuilder n2 = g.a.a.a.a.n("addEventNotifierImmediately, mapKey = ", c2, ", notifier = ");
            n2.append(cVar.getClass().getSimpleName());
            g.c.b.b.f.K("EventNotifyManager", n2.toString());
        }
        synchronized (this.f4433e) {
            if (!this.f4434f.contains(c2)) {
                this.f4434f.add(c2);
                e(cVar);
                this.a.removeCallbacks(this.f4435g);
                this.a.post(this.f4435g);
            }
        }
    }

    public final String c(Object obj, g.i.c.a.a.i.e.c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj == null ? 0 : obj.hashCode());
        sb.append("_");
        sb.append(cVar.b());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        e((g.i.c.a.a.i.e.c) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r1 = r0.values().iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, g.i.c.a.a.i.e.c> r0 = r3.b     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000b:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0034 }
            java.util.Map<java.lang.String, g.i.c.a.a.i.e.c> r1 = r3.b     // Catch:{ all -> 0x0034 }
            r0.<init>(r1)     // Catch:{ all -> 0x0034 }
            java.util.Map<java.lang.String, g.i.c.a.a.i.e.c> r1 = r3.b     // Catch:{ all -> 0x0034 }
            r1.clear()     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()
            g.i.c.a.a.i.e.c r2 = (g.i.c.a.a.i.e.c) r2
            r3.e(r2)
            goto L_0x0020
        L_0x0030:
            r0.clear()
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0037:
            throw r0
        L_0x0038:
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.i.c.d():void");
    }

    public final void e(g.i.c.a.a.i.e.c cVar) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("notifyEvent, notifier = ");
            i2.append(cVar.getClass().getSimpleName());
            g.c.b.b.f.K("EventNotifyManager", i2.toString());
        }
        this.c.b(new h(this, cVar));
        cVar.c();
        g.i.c.a.a.b0.g.b(cVar, cVar.b());
    }

    public void f(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityCreate(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new i(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void g(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityDestroyed(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new n(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void h(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityPaused(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new l(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void i(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityResume(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new k(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void j(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityStarted(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new j(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void k(Activity activity) {
        StringBuilder i2 = g.a.a.a.a.i("EventNotifyManager.onActivityStopped(");
        i2.append(activity.getClass().getSimpleName());
        i2.append(")");
        String sb = i2.toString();
        g.i.c.a.a.z.a.a(sb);
        this.c.b(new m(this, activity));
        g.i.c.a.a.z.a.b(sb);
    }

    public void l(Activity activity, Dialog dialog) {
        this.c.b(new e(this, activity, dialog));
    }

    public void m(Activity activity, Dialog dialog) {
        this.c.b(new d(this, activity, dialog));
    }

    public void n(g.i.c.a.a.q.c.a aVar) {
        this.c.b(new C0167c(this, aVar));
    }

    public void o(g.i.c.a.a.q.c.a aVar) {
        this.c.b(new b(this, aVar));
    }

    public void p(g.i.c.a.a.q.c.a aVar) {
        this.c.b(new a(this, aVar));
    }
}
