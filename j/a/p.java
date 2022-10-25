package j.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class p {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(p.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public p(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public p(Throwable th, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
