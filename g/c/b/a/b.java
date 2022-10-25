package g.c.b.a;

import i.c;
import i.d;
import i.o.c.f;
import i.o.c.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b {
    public static final C0070b c = new C0070b((f) null);

    /* renamed from: d  reason: collision with root package name */
    public static final TimeUnit f2193d = TimeUnit.SECONDS;

    /* renamed from: e  reason: collision with root package name */
    public static final c<b> f2194e = g.c.b.b.f.T(d.SYNCHRONIZED, a.b);
    public final ThreadPoolExecutor a;
    public ExecutorService b;

    public static final class a extends i implements i.o.b.a<b> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new b();
        }
    }

    /* renamed from: g.c.b.a.b$b  reason: collision with other inner class name */
    public static final class C0070b {
        public C0070b(f fVar) {
        }
    }

    public b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, f2193d, new SynchronousQueue(), new a("ChannelExecutorService", false));
        this.a = threadPoolExecutor;
        this.b = threadPoolExecutor;
    }
}
