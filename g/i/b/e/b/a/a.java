package g.i.b.e.b.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicInteger f4094d = new AtomicInteger(1);
    public final ThreadGroup a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    public a(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        StringBuilder l2 = g.a.a.a.a.l(str, "_");
        l2.append(f4094d.getAndIncrement());
        l2.append("_thread_");
        this.c = l2.toString();
    }

    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.a;
        Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        try {
            thread.setPriority(5);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return thread;
    }
}
