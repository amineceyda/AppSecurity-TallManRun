package g.i.b.e.b.a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class b extends LinkedBlockingQueue<Runnable> {
    public d a = null;
    private Integer b = null;

    public b() {
    }

    public b(byte b2) {
        super(16);
    }

    public final /* synthetic */ boolean offer(Object obj) {
        Runnable runnable = (Runnable) obj;
        d dVar = this.a;
        if (dVar == null || dVar.getPoolSize() == this.a.getMaximumPoolSize() || this.a.b.get() < this.a.getPoolSize() || this.a.getPoolSize() >= this.a.getMaximumPoolSize()) {
            return super.offer(runnable);
        }
        return false;
    }

    public final Object poll(long j2, TimeUnit timeUnit) {
        d dVar;
        Runnable runnable = (Runnable) super.poll(j2, timeUnit);
        if (runnable == null && (dVar = this.a) != null) {
            dVar.a();
        }
        return runnable;
    }

    public final int remainingCapacity() {
        Integer num = this.b;
        return num != null ? num.intValue() : super.remainingCapacity();
    }

    public final Object take() {
        d dVar;
        d dVar2 = this.a;
        if (dVar2 == null || !dVar2.b()) {
            return (Runnable) super.take();
        }
        d dVar3 = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Runnable runnable = (Runnable) super.poll(dVar3.getKeepAliveTime(timeUnit), timeUnit);
        if (runnable == null && (dVar = this.a) != null) {
            dVar.a();
        }
        return runnable;
    }
}
