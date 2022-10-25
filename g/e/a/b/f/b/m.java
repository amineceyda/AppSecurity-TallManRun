package g.e.a.b.f.b;

import android.os.Handler;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.u0;
import java.util.Objects;

public abstract class m {

    /* renamed from: d  reason: collision with root package name */
    public static volatile Handler f3245d;
    public final j5 a;
    public final Runnable b;
    public volatile long c;

    public m(j5 j5Var) {
        Objects.requireNonNull(j5Var, "null reference");
        this.a = j5Var;
        this.b = new l(this, j5Var);
    }

    public final void a() {
        this.c = 0;
        d().removeCallbacks(this.b);
    }

    public abstract void b();

    public final void c(long j2) {
        a();
        if (j2 >= 0) {
            Objects.requireNonNull((c) this.a.e());
            this.c = System.currentTimeMillis();
            if (!d().postDelayed(this.b, j2)) {
                this.a.d().f3136f.b("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }

    public final Handler d() {
        Handler handler;
        if (f3245d != null) {
            return f3245d;
        }
        synchronized (m.class) {
            if (f3245d == null) {
                f3245d = new u0(this.a.c().getMainLooper());
            }
            handler = f3245d;
        }
        return handler;
    }
}
