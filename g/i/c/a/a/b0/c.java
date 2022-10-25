package g.i.c.a.a.b0;

import android.os.Looper;
import android.os.MessageQueue;
import g.c.b.b.f;
import g.i.c.a.a.r.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class c {
    public MessageQueue.IdleHandler a = new C0164c((a) null);
    public Map<b, Runnable> b = new LinkedHashMap();

    public static abstract class b implements Runnable {
        public abstract void a(int i2);

        @Deprecated
        public void run() {
            a(1);
        }
    }

    /* renamed from: g.i.c.a.a.b0.c$c  reason: collision with other inner class name */
    public class C0164c implements MessageQueue.IdleHandler {
        public C0164c(a aVar) {
        }

        public boolean queueIdle() {
            if (e.b.a.a) {
                f.w("DelayedIdleHandler", "onIdle");
            }
            ArrayList arrayList = new ArrayList(c.this.b.entrySet());
            c.this.b.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b bVar = (b) entry.getKey();
                g.i.c.a.a.y.a.d((Runnable) entry.getValue());
                if (e.b.a.a) {
                    f.w("DelayedIdleHandler", "run by idle, task = " + bVar);
                }
                bVar.a(0);
            }
            return false;
        }
    }

    public class d implements Runnable {
        public b b;

        public d(b bVar) {
            this.b = bVar;
        }

        public void run() {
            if (e.b.a.a) {
                StringBuilder i2 = g.a.a.a.a.i("run by handler, task = ");
                i2.append(this.b);
                f.w("DelayedIdleHandler", i2.toString());
            }
            this.b.a(1);
            c cVar = c.this;
            Runnable remove = cVar.b.remove(this.b);
            c cVar2 = c.this;
            if (cVar2.b.isEmpty()) {
                Looper.myQueue().removeIdleHandler(cVar2.a);
            }
        }
    }

    public void a(b bVar, long j2) {
        if (e.b.a.a) {
            f.w("DelayedIdleHandler", "receive task to delay:" + j2);
        }
        Runnable runnable = this.b.get(bVar);
        if (runnable != null) {
            g.i.c.a.a.y.a.d(runnable);
            g.i.c.a.a.y.a.f(runnable, j2);
            return;
        }
        d dVar = new d(bVar);
        this.b.put(bVar, dVar);
        g.i.c.a.a.y.a.f(dVar, j2);
        Looper.myQueue().removeIdleHandler(this.a);
        Looper.myQueue().addIdleHandler(this.a);
    }

    public void b(b bVar) {
        Runnable remove = this.b.remove(bVar);
        if (remove != null) {
            g.i.c.a.a.y.a.d(remove);
        }
        if (this.b.isEmpty()) {
            Looper.myQueue().removeIdleHandler(this.a);
        }
    }
}
