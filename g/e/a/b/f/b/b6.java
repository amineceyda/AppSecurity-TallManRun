package g.e.a.b.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import g.c.b.b.f;
import java.util.Objects;

public final class b6 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ q6 c;

    public b6(q6 q6Var, Bundle bundle) {
        this.c = q6Var;
        this.b = bundle;
    }

    public final void run() {
        q6 q6Var = this.c;
        Bundle bundle = this.b;
        q6Var.h();
        q6Var.i();
        Objects.requireNonNull(bundle, "null reference");
        String string = bundle.getString("name");
        f.k(string);
        if (!q6Var.a.g()) {
            q6Var.a.d().n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzks zzks = new zzks(string, 0, (Object) null, "");
        try {
            zzab zzab = r4;
            zzab zzab2 = new zzab(bundle.getString("app_id"), "", zzks, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzau) null, bundle.getLong("trigger_timeout"), (zzau) null, bundle.getLong("time_to_live"), q6Var.a.A().s0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            q6Var.a.y().m(zzab);
        } catch (IllegalArgumentException unused) {
        }
    }
}
