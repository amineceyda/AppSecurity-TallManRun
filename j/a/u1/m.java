package j.a.u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4662d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4663e;
    public final AtomicReferenceArray<h> a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    static {
        Class<m> cls = m.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f4662d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f4663e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar, boolean z) {
        if (z) {
            return b(hVar);
        }
        h hVar2 = (h) b.getAndSet(this, hVar);
        if (hVar2 != null) {
            return b(hVar2);
        }
        return null;
    }

    public final h b(h hVar) {
        boolean z = true;
        if (hVar.c.u() != 1) {
            z = false;
        }
        if (z) {
            f4663e.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.a.get(i2) != null) {
            Thread.yield();
        }
        this.a.lazySet(i2, hVar);
        c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final h e() {
        h hVar = (h) b.getAndSet(this, (Object) null);
        return hVar != null ? hVar : f();
    }

    public final h f() {
        h andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f4662d.compareAndSet(this, i2, i2 + 1) && (andSet = this.a.getAndSet(i3, (Object) null)) != null) {
                boolean z = true;
                if (andSet.c.u() != 1) {
                    z = false;
                }
                if (z) {
                    f4663e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(m mVar) {
        int i2 = mVar.consumerIndex;
        int i3 = mVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = mVar.a;
        while (true) {
            boolean z = true;
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i4);
            if (hVar != null) {
                if (hVar.c.u() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i4, hVar, (Object) null)) {
                    f4663e.decrementAndGet(mVar);
                    a(hVar, false);
                    return -1;
                }
            }
            i2++;
        }
        return h(mVar, true);
    }

    public final long h(m mVar, boolean z) {
        h hVar;
        do {
            hVar = (h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.c.u() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a2 = k.f4661e.a() - hVar.b;
            long j2 = k.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!b.compareAndSet(mVar, hVar, (Object) null));
        a(hVar, false);
        return -1;
    }
}
