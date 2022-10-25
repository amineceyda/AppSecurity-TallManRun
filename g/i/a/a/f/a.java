package g.i.a.a.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public class a implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.b.b = null;
    }

    public void onActivityResumed(Activity activity) {
        this.b.b = new WeakReference<>(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
