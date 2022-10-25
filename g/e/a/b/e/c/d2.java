package g.e.a.b.e.c;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import g.e.a.b.c.b;
import java.util.Objects;

public final class d2 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f2912f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Activity f2913g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l2 f2914h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d2(l2 l2Var, Bundle bundle, Activity activity) {
        super(l2Var.b, true);
        this.f2914h = l2Var;
        this.f2912f = bundle;
        this.f2913g = activity;
    }

    public final void a() throws RemoteException {
        Bundle bundle;
        if (this.f2912f != null) {
            bundle = new Bundle();
            if (this.f2912f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f2912f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        z0 z0Var = this.f2914h.b.f3000h;
        Objects.requireNonNull(z0Var, "null reference");
        z0Var.onActivityCreated(new b(this.f2913g), bundle, this.c);
    }
}
