package g.e.b.l.j.j;

import g.e.a.b.b.h.e;
import g.e.a.b.g.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class m {
    public final Executor a;
    public f<Void> b = e.h(null);
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f3516d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            m.this.f3516d.set(Boolean.TRUE);
        }
    }

    public m(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    public void a() {
        if (!Boolean.TRUE.equals(this.f3516d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public <T> f<T> b(Callable<T> callable) {
        f<TContinuationResult> e2;
        synchronized (this.c) {
            e2 = this.b.e(this.a, new n(this, callable));
            this.b = e2.e(this.a, new o(this));
        }
        return e2;
    }

    public <T> f<T> c(Callable<f<T>> callable) {
        f<TContinuationResult> f2;
        synchronized (this.c) {
            f2 = this.b.f(this.a, new n(this, callable));
            this.b = f2.e(this.a, new o(this));
        }
        return f2;
    }
}
