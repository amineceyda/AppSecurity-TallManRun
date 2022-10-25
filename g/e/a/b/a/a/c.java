package g.e.a.b.a.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c extends Thread {
    public final WeakReference<a> b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final CountDownLatch f2840d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public boolean f2841e = false;

    public c(a aVar, long j2) {
        this.b = new WeakReference<>(aVar);
        this.c = j2;
        start();
    }

    public final void run() {
        a aVar;
        try {
            if (!this.f2840d.await(this.c, TimeUnit.MILLISECONDS) && (aVar = (a) this.b.get()) != null) {
                aVar.b();
                this.f2841e = true;
            }
        } catch (InterruptedException unused) {
            a aVar2 = (a) this.b.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f2841e = true;
            }
        }
    }
}
