package com.tencent.beacon.a.b;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;

public abstract class a {
    public static volatile a a;
    private boolean b = true;

    /* renamed from: com.tencent.beacon.a.b.a$a  reason: collision with other inner class name */
    public static class C0004a {
        public static final a a = new i();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new i();
            }
            aVar = a;
        }
        return aVar;
    }

    public static synchronized void a(ScheduledExecutorService scheduledExecutorService) {
        synchronized (a.class) {
            if (a == null) {
                a = new i(scheduledExecutorService);
            }
        }
    }

    public static a b() {
        return C0004a.a;
    }

    public abstract Handler a(int i2);

    public abstract void a(int i2, long j2, long j3, Runnable runnable);

    public abstract void a(int i2, boolean z);

    public abstract void a(long j2, Runnable runnable);

    public abstract void a(Runnable runnable);

    public abstract void a(boolean z);

    public abstract void b(int i2);

    public void b(boolean z) {
        this.b = z;
    }

    public boolean c() {
        return this.b;
    }

    public abstract void d();
}
