package g.e.a.b.f.b;

import android.os.RemoteException;

public final class m7 implements Runnable {
    public final /* synthetic */ y6 b;
    public final /* synthetic */ f8 c;

    public m7(f8 f8Var, y6 y6Var) {
        this.c = f8Var;
        this.b = y6Var;
    }

    public final void run() {
        f8 f8Var = this.c;
        v2 v2Var = f8Var.f3157d;
        if (v2Var == null) {
            f8Var.a.d().f3136f.a("Failed to send current screen to service");
            return;
        }
        try {
            y6 y6Var = this.b;
            if (y6Var == null) {
                v2Var.c(0, (String) null, (String) null, f8Var.a.a.getPackageName());
            } else {
                v2Var.c(y6Var.c, y6Var.a, y6Var.b, f8Var.a.a.getPackageName());
            }
            this.c.s();
        } catch (RemoteException e2) {
            this.c.a.d().f3136f.b("Failed to send current screen to the service", e2);
        }
    }
}
