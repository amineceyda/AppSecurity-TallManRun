package com.ola.qsea.c;

import g.a.a.a.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    public String a() {
        StringBuilder i2 = a.i("qsea-thread-");
        i2.append(this.a.getAndIncrement());
        return i2.toString();
    }

    public Thread newThread(Runnable runnable) {
        try {
            return new Thread(runnable, a());
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            return null;
        } catch (OutOfMemoryError unused) {
            com.ola.qsea.m.a.b("[task] memory not enough, create thread failed.", new Object[0]);
            return null;
        }
    }
}
