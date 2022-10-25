package g.e.a.b.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import g.c.b.b.f;
import java.util.Objects;

public final class a6 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ q6 c;

    public a6(q6 q6Var, Bundle bundle) {
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
        String string2 = bundle.getString("origin");
        f.k(string);
        f.k(string2);
        Objects.requireNonNull(bundle.get("value"), "null reference");
        if (!q6Var.a.g()) {
            q6Var.a.d().n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzks zzks = new zzks(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzau s0 = q6Var.a.A().s0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzau s02 = q6Var.a.A().s0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            q6Var.a.y().m(new zzab(bundle.getString("app_id"), string2, zzks, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), s02, bundle.getLong("trigger_timeout"), s0, bundle.getLong("time_to_live"), q6Var.a.A().s0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
