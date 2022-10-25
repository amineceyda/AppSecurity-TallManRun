package g.e.a.b.f.b;

import android.os.Handler;
import android.os.Looper;
import g.e.a.b.e.c.u0;

public final class w8 extends w3 {
    public Handler c;

    /* renamed from: d  reason: collision with root package name */
    public final u8 f3390d = new u8(this);

    /* renamed from: e  reason: collision with root package name */
    public final t8 f3391e = new t8(this);

    /* renamed from: f  reason: collision with root package name */
    public final r8 f3392f = new r8(this);

    public w8(n4 n4Var) {
        super(n4Var);
    }

    public final boolean k() {
        return false;
    }

    public final void l() {
        h();
        if (this.c == null) {
            this.c = new u0(Looper.getMainLooper());
        }
    }
}
