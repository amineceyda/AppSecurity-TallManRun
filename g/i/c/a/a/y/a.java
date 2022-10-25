package g.i.c.a.a.y;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public static final AtomicInteger a = new AtomicInteger(1);
    public static final Executor b = Executors.newFixedThreadPool(2, new C0186a());
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: g.i.c.a.a.y.a$a  reason: collision with other inner class name */
    public static class C0186a implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            StringBuilder i2 = g.a.a.a.a.i("vrpool-");
            i2.append(a.a.getAndIncrement());
            i2.append("-thread");
            return new Thread(runnable, i2.toString());
        }
    }

    public static void a(Runnable runnable) {
        b.execute(runnable);
    }

    public static void b(Runnable runnable, boolean z) {
        if (runnable != null) {
            if (z) {
                runnable.run();
            } else {
                a(runnable);
            }
        }
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void d(Runnable runnable) {
        if (runnable != null) {
            c.removeCallbacks(runnable);
        }
    }

    public static void e(Runnable runnable) {
        c.post(runnable);
    }

    public static void f(Runnable runnable, long j2) {
        if (runnable != null) {
            c.postDelayed(runnable, j2);
        }
    }
}
