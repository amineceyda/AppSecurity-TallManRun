package com.tencent.beacon.d.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
public class d implements Application.ActivityLifecycleCallbacks {
    private long a = System.currentTimeMillis();
    private Map<Activity, Long> b = new HashMap(3);
    private StatModule c;

    public d(StatModule statModule) {
        this.c = statModule;
    }

    private void a(Activity activity) {
        Long l2 = this.b.get(activity);
        if (l2 == null) {
            l2 = Long.valueOf(this.a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b(activity.getLocalClassName(), currentTimeMillis - l2.longValue(), currentTimeMillis);
        this.b.remove(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    public void onActivityResumed(Activity activity) {
        this.b.put(activity, Long.valueOf(System.currentTimeMillis()));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
