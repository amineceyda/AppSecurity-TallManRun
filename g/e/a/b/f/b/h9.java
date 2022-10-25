package g.e.a.b.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import g.e.a.b.b.h.c;
import java.util.Objects;

public final class h9 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i9 f3189d;

    public h9(i9 i9Var, String str, Bundle bundle) {
        this.f3189d = i9Var;
        this.b = str;
        this.c = bundle;
    }

    public final void run() {
        q9 Q = this.f3189d.a.Q();
        String str = this.b;
        Bundle bundle = this.c;
        Objects.requireNonNull((c) this.f3189d.a.e());
        zzau s0 = Q.s0(str, "_err", bundle, "auto", System.currentTimeMillis(), false, true);
        k9 k9Var = this.f3189d.a;
        Objects.requireNonNull(s0, "null reference");
        k9Var.j(s0, this.b);
    }
}
