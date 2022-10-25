package g.e.a.b.f.b;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcl;

public final class m8 {
    public final Context a;

    public m8(Context context) {
        this.a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f3136f.a("onRebind called with null intent");
            return;
        }
        c().n.b("onRebind called. action", intent.getAction());
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().f3136f.a("onUnbind called with null intent");
            return true;
        }
        c().n.b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final f3 c() {
        return n4.u(this.a, (zzcl) null, (Long) null).d();
    }
}
