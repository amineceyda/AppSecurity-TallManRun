package com.tencent.beacon.d.a;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.module.StatModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class c implements Application.ActivityLifecycleCallbacks {
    private static SparseArray<WeakReference<Activity>> a = new SparseArray<>();
    private boolean b = false;
    private long c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f650d = 0;

    /* renamed from: e  reason: collision with root package name */
    private long f651e = 20000;

    /* renamed from: f  reason: collision with root package name */
    private String f652f = "";
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f653g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public StatModule f654h;

    public c(StatModule statModule) {
        this.f654h = statModule;
        HashMap hashMap = new HashMap(6);
        this.f653g = hashMap;
        hashMap.put("A63", "N");
        this.f653g.put("A66", "F");
    }

    public static SparseArray<WeakReference<Activity>> a() {
        return a;
    }

    private void a(Activity activity) {
        b.f583d = true;
        b(activity);
        if (!this.b) {
            com.tencent.beacon.base.util.c.a("[event] lifecycle callback recover active user.", new Object[0]);
            a.a().a((Runnable) new b(this, activity));
            this.b = true;
        }
        if (c()) {
            d();
        }
    }

    private void a(boolean z, Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (this.c > 0) {
                long j2 = this.f650d;
                if (j2 > 0 && j2 + b() <= currentTimeMillis) {
                    com.tencent.beacon.base.util.c.a("[lifecycle] -> return foreground more than 20s.", new Object[0]);
                    d();
                    StatModule statModule = this.f654h;
                    if (statModule != null) {
                        statModule.a();
                    }
                }
            }
            this.c = currentTimeMillis;
            this.f650d = 0;
            return;
        }
        this.f650d = currentTimeMillis;
        long j3 = this.c;
        if (800 + j3 > currentTimeMillis) {
            com.tencent.beacon.base.util.c.a("[lifecycle] -> debounce activity switch.", new Object[0]);
            this.c = 0;
            return;
        }
        if (j3 == 0) {
            this.c = currentTimeMillis;
        }
        StatModule statModule2 = this.f654h;
        if (statModule2 != null) {
            statModule2.b();
        }
    }

    private long b() {
        if (this.f651e <= 20000) {
            String a2 = com.tencent.beacon.e.a.a().a("hotLauncher");
            if (a2 != null) {
                try {
                    this.f651e = Long.valueOf(a2).longValue();
                    com.tencent.beacon.base.util.c.a("[strategy] -> change launcher time: %s ms", a2);
                } catch (NumberFormatException unused) {
                    com.tencent.beacon.base.util.c.b("[strategy] -> event param 'hotLauncher' error.", new Object[0]);
                }
            }
            this.f651e++;
        }
        return this.f651e;
    }

    private static void b(Activity activity) {
        if (activity != null && a != null) {
            int hashCode = activity.hashCode();
            if (a.get(hashCode) == null) {
                a.put(hashCode, new WeakReference(activity));
            }
        }
    }

    private boolean c() {
        String d2 = com.tencent.beacon.base.util.b.d();
        if ("".equals(this.f652f)) {
            this.f652f = com.tencent.beacon.a.d.a.a().getString("LAUEVE_DENGTA", "");
        }
        boolean z = false;
        if (!d2.equals(this.f652f)) {
            a.C0005a edit = com.tencent.beacon.a.d.a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString("LAUEVE_DENGTA", d2);
            }
            if (!"".equals(this.f652f)) {
                com.tencent.beacon.base.util.c.a("[core] -> report new day launcher event.", new Object[0]);
                z = true;
            }
            this.f652f = d2;
        }
        return z;
    }

    private void d() {
        com.tencent.beacon.a.b.a.a().a((Runnable) new a(this));
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
        a(true, activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity);
    }

    public void onActivityStarted(Activity activity) {
        a(activity);
    }

    public void onActivityStopped(Activity activity) {
        a(activity);
        a(false, activity);
    }
}
