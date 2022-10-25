package g.e.a.b.e.c;

import android.database.ContentObserver;
import android.os.Handler;

public final class f5 extends ContentObserver {
    public final /* synthetic */ g5 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f5(g5 g5Var) {
        super((Handler) null);
        this.a = g5Var;
    }

    public final void onChange(boolean z) {
        g5 g5Var = this.a;
        synchronized (g5Var.f2935d) {
            g5Var.f2936e = null;
            x5.f3082h.incrementAndGet();
        }
        synchronized (g5Var) {
            for (h5 c : g5Var.f2937f) {
                c.c();
            }
        }
    }
}
