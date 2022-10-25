package g.i.c.a.a.y.c;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

public class a<T> extends FutureTask<T> implements RunnableScheduledFuture<T> {
    public final long b;
    public Handler c;

    /* renamed from: d  reason: collision with root package name */
    public long f4560d;

    /* renamed from: e  reason: collision with root package name */
    public int f4561e;

    /* renamed from: f  reason: collision with root package name */
    public long f4562f = SystemClock.uptimeMillis();

    public a(Runnable runnable, Handler handler, long j2, long j3) {
        super(runnable, (Object) null);
        this.c = handler;
        this.f4560d = j2;
        this.b = j3;
    }

    public a(Callable<T> callable, Handler handler, long j2, long j3) {
        super(callable);
        this.c = handler;
        this.f4560d = j2;
        this.b = j3;
    }

    public long a() {
        return (((long) this.f4561e) * this.b) + this.f4562f + this.f4560d;
    }

    public boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.c.removeCallbacks(this);
        }
        return cancel;
    }

    public int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (delayed == this) {
            return 0;
        }
        long delay = this.f4560d - delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay < 0) {
            return -1;
        }
        return delay > 0 ? 1 : 0;
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f4560d;
    }

    public boolean isPeriodic() {
        return this.b > 0;
    }

    public void run() {
        boolean isPeriodic = isPeriodic();
        if (isCancelled()) {
            cancel(false);
        } else if (!isPeriodic) {
            super.run();
        } else if (runAndReset()) {
            this.f4561e++;
            this.c.postAtTime(this, a());
        }
    }
}
