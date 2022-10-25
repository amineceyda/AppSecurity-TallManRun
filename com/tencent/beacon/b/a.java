package com.tencent.beacon.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.beacon.a.c.b;

public class a implements Application.ActivityLifecycleCallbacks {
    public void a(Activity activity) {
        b.f583d = true;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    public void onActivityResumed(Activity activity) {
        a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity);
    }

    public void onActivityStarted(Activity activity) {
        a(activity);
    }

    public void onActivityStopped(Activity activity) {
        a(activity);
    }
}
