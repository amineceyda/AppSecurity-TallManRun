package g.e.a.b.f.b;

import android.content.ServiceConnection;
import android.os.Bundle;
import g.e.a.b.e.c.r0;

public final class t3 implements Runnable {
    public final /* synthetic */ r0 b;
    public final /* synthetic */ ServiceConnection c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u3 f3353d;

    public t3(u3 u3Var, r0 r0Var, ServiceConnection serviceConnection) {
        this.f3353d = u3Var;
        this.b = r0Var;
        this.c = serviceConnection;
    }

    public final void run() {
        u3 u3Var = this.f3353d;
        v3 v3Var = u3Var.b;
        String str = u3Var.a;
        r0 r0Var = this.b;
        v3Var.a.b().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            if (r0Var.a(bundle) == null) {
                v3Var.a.d().f3136f.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e2) {
            v3Var.a.d().f3136f.b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
        }
        v3Var.a.b().h();
        n4.j();
        throw null;
    }
}
