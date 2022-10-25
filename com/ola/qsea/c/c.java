package com.ola.qsea.c;

import android.os.Handler;
import android.util.SparseArray;
import com.ola.qsea.m.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends a {
    public static final int b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicInteger f421d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f422e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<Object> f423f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<Handler> f424g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f425h;

    /* renamed from: i  reason: collision with root package name */
    public final d f426i;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        c = Math.max(2, Math.min(availableProcessors - 1, 3));
    }

    public c() {
        this((ScheduledExecutorService) null);
    }

    public c(ScheduledExecutorService scheduledExecutorService) {
        this.f425h = false;
        d dVar = new d();
        this.f426i = dVar;
        this.f422e = scheduledExecutorService == null ? Executors.newScheduledThreadPool(c, dVar) : scheduledExecutorService;
        this.f423f = new SparseArray<>();
        this.f424g = new SparseArray<>();
    }

    public synchronized void a(long j2, Runnable runnable) {
        if (!b()) {
            Runnable b2 = b(runnable);
            if (j2 <= 0) {
                j2 = 0;
            }
            this.f422e.schedule(b2, j2, TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void a(Runnable runnable) {
        if (!b()) {
            try {
                this.f422e.execute(b(runnable));
            } catch (Exception unused) {
            }
        }
    }

    public final Runnable b(Runnable runnable) {
        return new b(this, runnable);
    }

    public final boolean b() {
        if (!this.f425h) {
            return false;
        }
        a.b("[task] was closed , should all stopped!", new Object[0]);
        return true;
    }
}
