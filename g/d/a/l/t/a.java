package g.d.a.l.t;

import android.os.Process;
import g.d.a.l.l;
import g.d.a.l.t.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {
    public final boolean a;
    public final Map<l, b> b = new HashMap();
    public final ReferenceQueue<q<?>> c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f2429d;

    /* renamed from: g.d.a.l.t.a$a  reason: collision with other inner class name */
    public class C0081a implements ThreadFactory {

        /* renamed from: g.d.a.l.t.a$a$a  reason: collision with other inner class name */
        public class C0082a implements Runnable {
            public final /* synthetic */ Runnable b;

            public C0082a(C0081a aVar, Runnable runnable) {
                this.b = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.b.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0082a(this, runnable), "glide-active-resources");
        }
    }

    public static final class b extends WeakReference<q<?>> {
        public final l a;
        public final boolean b;
        public v<?> c;

        public b(l lVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            v<Z> vVar;
            Objects.requireNonNull(lVar, "Argument must not be null");
            this.a = lVar;
            if (!qVar.b || !z) {
                vVar = null;
            } else {
                vVar = qVar.f2522d;
                Objects.requireNonNull(vVar, "Argument must not be null");
            }
            this.c = vVar;
            this.b = qVar.b;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0081a());
        this.a = z;
        newSingleThreadExecutor.execute(new b(this));
    }

    public synchronized void a(l lVar, q<?> qVar) {
        b put = this.b.put(lVar, new b(lVar, qVar, this.c, this.a));
        if (put != null) {
            put.c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            this.b.remove(bVar.a);
            if (bVar.b) {
                v<?> vVar = bVar.c;
                if (vVar != null) {
                    this.f2429d.a(bVar.a, new q(vVar, true, false, bVar.a, this.f2429d));
                }
            }
        }
    }
}
