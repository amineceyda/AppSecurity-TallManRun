package g.i.c.a.a.b0;

import g.c.b.b.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class e<T> {
    public static boolean b = false;
    public final ConcurrentLinkedQueue<WeakReference<T>> a = new ConcurrentLinkedQueue<>();

    public class a implements Runnable {
        public final /* synthetic */ Throwable b;

        public a(e eVar, Throwable th) {
            this.b = th;
        }

        public void run() {
            throw new RuntimeException(this.b);
        }
    }

    public interface b<T> {
        void a(T t);
    }

    public void a(T t) {
        if (t != null) {
            synchronized (this.a) {
                boolean z = false;
                Iterator<WeakReference<T>> it = this.a.iterator();
                while (it.hasNext()) {
                    T t2 = it.next().get();
                    if (t2 == null) {
                        it.remove();
                    } else if (t2 == t) {
                        z = true;
                    }
                }
                if (!z) {
                    this.a.add(new WeakReference(t));
                }
            }
        }
    }

    public void b(b<T> bVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (this.a) {
            concurrentLinkedQueue = this.a.size() > 0 ? new ConcurrentLinkedQueue(this.a) : null;
        }
        if (concurrentLinkedQueue != null) {
            try {
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    Object obj = ((WeakReference) it.next()).get();
                    if (obj != null) {
                        bVar.a(obj);
                    }
                }
            } catch (Throwable th) {
                f.x("crash", th.toString());
            }
        }
    }

    public final void c(Throwable th) {
        g.i.c.a.a.y.a.e(new a(this, th));
    }
}
