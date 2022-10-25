package g.i.a.a.k;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements ThreadFactory {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicInteger f4091d = new AtomicInteger(1);
    public final ThreadGroup a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    public a(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        StringBuilder i2 = g.a.a.a.a.i("pool-");
        i2.append(f4091d.getAndIncrement());
        this.c = g.a.a.a.a.f(i2, TextUtils.isEmpty(str) ? "" : g.a.a.a.a.w("-", str), "-thread-");
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.a;
        Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 1) {
            thread.setPriority(1);
        }
        StringBuilder i2 = g.a.a.a.a.i("new thread: ");
        i2.append(thread.getName());
        i2.append(", id: ");
        i2.append(thread.getId());
        i2.append(" is created.");
        g.i.a.a.m.a.a("CommonThreadFactory", i2.toString());
        return thread;
    }
}
