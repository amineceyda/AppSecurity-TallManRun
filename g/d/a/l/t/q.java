package g.d.a.l.t;

import g.d.a.l.l;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class q<Z> implements v<Z> {
    public final boolean b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final v<Z> f2522d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2523e;

    /* renamed from: f  reason: collision with root package name */
    public final l f2524f;

    /* renamed from: g  reason: collision with root package name */
    public int f2525g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2526h;

    public interface a {
        void a(l lVar, q<?> qVar);
    }

    public q(v<Z> vVar, boolean z, boolean z2, l lVar, a aVar) {
        Objects.requireNonNull(vVar, "Argument must not be null");
        this.f2522d = vVar;
        this.b = z;
        this.c = z2;
        this.f2524f = lVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f2523e = aVar;
    }

    public synchronized void a() {
        if (!this.f2526h) {
            this.f2525g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public int b() {
        return this.f2522d.b();
    }

    public Class<Z> c() {
        return this.f2522d.c();
    }

    public synchronized void d() {
        if (this.f2525g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f2526h) {
            this.f2526h = true;
            if (this.c) {
                this.f2522d.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i2 = this.f2525g;
            if (i2 > 0) {
                z = true;
                int i3 = i2 - 1;
                this.f2525g = i3;
                if (i3 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f2523e.a(this.f2524f, this);
        }
    }

    public Z get() {
        return this.f2522d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.b + ", listener=" + this.f2523e + ", key=" + this.f2524f + ", acquired=" + this.f2525g + ", isRecycled=" + this.f2526h + ", resource=" + this.f2522d + MessageFormatter.DELIM_STOP;
    }
}
