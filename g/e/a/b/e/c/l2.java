package g.e.a.b.e.c;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class l2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ m2 b;

    public l2(m2 m2Var) {
        this.b = m2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m2 m2Var = this.b;
        m2Var.c.execute(new d2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        m2 m2Var = this.b;
        m2Var.c.execute(new k2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m2 m2Var = this.b;
        m2Var.c.execute(new g2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m2 m2Var = this.b;
        m2Var.c.execute(new f2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        v0 v0Var = new v0();
        m2 m2Var = this.b;
        m2Var.c.execute(new j2(this, activity, v0Var));
        Bundle A = v0Var.A(50);
        if (A != null) {
            bundle.putAll(A);
        }
    }

    public final void onActivityStarted(Activity activity) {
        m2 m2Var = this.b;
        m2Var.c.execute(new e2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m2 m2Var = this.b;
        m2Var.c.execute(new i2(this, activity));
    }
}
