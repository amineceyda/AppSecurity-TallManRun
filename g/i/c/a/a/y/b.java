package g.i.c.a.a.y;

import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class b {
    public ConcurrentHashMap<String, Future<?>> a = new ConcurrentHashMap<>();
    public AtomicInteger b = new AtomicInteger(0);
    public ScheduledExecutorService c = new ScheduledThreadPoolExecutor(4, new g.i.c.a.a.y.c.b("VR_TimerTaskManager"), new ThreadPoolExecutor.AbortPolicy());

    /* renamed from: d  reason: collision with root package name */
    public ScheduledExecutorService f4557d = new g.i.c.a.a.y.c.c(Looper.getMainLooper());

    /* renamed from: g.i.c.a.a.y.b$b  reason: collision with other inner class name */
    public static class C0187b {
        public static b a = new b((a) null);
    }

    public class c implements Runnable {
        public Runnable b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4558d;

        public c(Runnable runnable, String str, boolean z) {
            this.b = runnable;
            this.c = str;
            this.f4558d = z;
        }

        public void run() {
            try {
                this.b.run();
            } finally {
                if (!this.f4558d) {
                    b.this.a.remove(this.c);
                }
            }
        }
    }

    public b(a aVar) {
    }

    public String a(Runnable runnable, long j2, long j3) {
        StringBuilder i2 = g.a.a.a.a.i("VR_TimerTask_ID_");
        i2.append(this.b.incrementAndGet());
        String sb = i2.toString();
        this.a.put(sb, this.f4557d.scheduleAtFixedRate(new c(runnable, sb, j3 > 0), j2, j3, TimeUnit.MILLISECONDS));
        return sb;
    }

    public void b(String str) {
        Future remove;
        if (!TextUtils.isEmpty(str) && (remove = this.a.remove(str)) != null) {
            remove.cancel(!(remove instanceof g.i.c.a.a.y.c.a));
        }
    }
}
