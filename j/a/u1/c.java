package j.a.u1;

import i.m.f;
import j.a.a0;
import j.a.q0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class c extends q0 {
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4650d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4651e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4652f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4653g;

    public c(int i2, int i3, String str, int i4) {
        int i5 = (i4 & 1) != 0 ? k.b : i2;
        int i6 = (i4 & 2) != 0 ? k.c : i3;
        String str2 = (i4 & 4) != 0 ? "DefaultDispatcher" : null;
        long j2 = k.f4660d;
        this.f4650d = i5;
        this.f4651e = i6;
        this.f4652f = j2;
        this.f4653g = str2;
        this.c = new a(i5, i6, j2, str2);
    }

    public void v(f fVar, Runnable runnable) {
        try {
            a aVar = this.c;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f4629i;
            aVar.f(runnable, g.b, false);
        } catch (RejectedExecutionException unused) {
            a0.f4583i.e0(runnable);
        }
    }
}
