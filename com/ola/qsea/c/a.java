package com.ola.qsea.c;

public abstract class a {
    public static volatile a a;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new c();
            }
            aVar = a;
        }
        return aVar;
    }

    public abstract void a(long j2, Runnable runnable);

    public abstract void a(Runnable runnable);
}
