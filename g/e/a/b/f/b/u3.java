package g.e.a.b.f.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import g.e.a.b.e.c.p0;
import g.e.a.b.e.c.q0;
import g.e.a.b.e.c.r0;

public final class u3 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ v3 b;

    public u3(v3 v3Var, String str) {
        this.b = v3Var;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                int i2 = q0.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                r0 p0Var = queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(iBinder);
                if (p0Var == null) {
                    this.b.a.d().f3139i.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.b.a.d().n.a("Install Referrer Service connected");
                this.b.a.b().r(new t3(this, p0Var, this));
            } catch (RuntimeException e2) {
                this.b.a.d().f3139i.b("Exception occurred while calling Install Referrer API", e2);
            }
        } else {
            this.b.a.d().f3139i.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.d().n.a("Install Referrer Service disconnected");
    }
}
