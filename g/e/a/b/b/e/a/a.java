package g.e.a.b.b.e.a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2842f = new a();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<C0107a> f2843d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e  reason: collision with root package name */
    public boolean f2844e = false;

    /* renamed from: g.e.a.b.b.e.a.a$a  reason: collision with other inner class name */
    public interface C0107a {
        void a(boolean z);
    }

    public final void a(boolean z) {
        synchronized (f2842f) {
            Iterator<C0107a> it = this.f2843d.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            a(true);
        }
    }
}
