package g.e.b.l.j.j;

import g.e.b.l.j.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class j0 extends j {
    public final /* synthetic */ String b;
    public final /* synthetic */ ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f3499d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3500e;

    public j0(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        this.b = str;
        this.c = executorService;
        this.f3499d = j2;
        this.f3500e = timeUnit;
    }

    public void a() {
        try {
            f fVar = f.a;
            fVar.b("Executing shutdown hook for " + this.b);
            this.c.shutdown();
            if (!this.c.awaitTermination(this.f3499d, this.f3500e)) {
                fVar.b(this.b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.c.shutdownNow();
            }
        } catch (InterruptedException unused) {
            f.a.b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.b}));
            this.c.shutdownNow();
        }
    }
}
