package f.a.a.a.h;

import f.a.a.b.w.d;
import f.a.a.b.w.i;

public abstract class a extends d implements i {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1634e;

    public final boolean k() {
        return this.f1634e;
    }

    public abstract Runnable s();

    public final void start() {
        if (!this.f1634e) {
            if (this.c == null) {
                throw new IllegalStateException("context not set");
            } else if (u()) {
                this.c.d().execute(s());
                this.f1634e = true;
            }
        }
    }

    public final void stop() {
        if (this.f1634e) {
            try {
                t();
            } catch (RuntimeException e2) {
                c("on stop: " + e2, e2);
            }
            this.f1634e = false;
        }
    }

    public abstract void t();

    public abstract boolean u();
}
