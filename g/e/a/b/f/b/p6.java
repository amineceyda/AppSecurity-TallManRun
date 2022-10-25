package g.e.a.b.f.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.Objects;

@TargetApi(14)
public final class p6 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ q6 b;

    public /* synthetic */ p6(q6 q6Var) {
        this.b = q6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.b.a.d().n.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.b.a.A();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.b.a.b().r(new o6(this, z, data, str, queryParameter));
                    }
                }
            }
        } catch (RuntimeException e2) {
            this.b.a.d().f3136f.b("Throwable caught in onActivityCreated", e2);
        } catch (Throwable th) {
            this.b.a.x().q(activity, bundle);
            throw th;
        }
        this.b.a.x().q(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        f7 x = this.b.a.x();
        synchronized (x.f3155l) {
            if (activity == x.f3150g) {
                x.f3150g = null;
            }
        }
        if (x.a.f3258g.v()) {
            x.f3149f.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        f7 x = this.b.a.x();
        synchronized (x.f3155l) {
            x.f3154k = false;
            x.f3151h = true;
        }
        Objects.requireNonNull((c) x.a.n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!x.a.f3258g.v()) {
            x.c = null;
            x.a.b().r(new c7(x, elapsedRealtime));
        } else {
            y6 s = x.s(activity);
            x.f3147d = x.c;
            x.c = null;
            x.a.b().r(new d7(x, s, elapsedRealtime));
        }
        w8 z = this.b.a.z();
        Objects.requireNonNull((c) z.a.n);
        z.a.b().r(new o8(z, SystemClock.elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        w8 z = this.b.a.z();
        Objects.requireNonNull((c) z.a.n);
        z.a.b().r(new n8(z, SystemClock.elapsedRealtime()));
        f7 x = this.b.a.x();
        synchronized (x.f3155l) {
            x.f3154k = true;
            if (activity != x.f3150g) {
                synchronized (x.f3155l) {
                    x.f3150g = activity;
                    x.f3151h = false;
                }
                if (x.a.f3258g.v()) {
                    x.f3152i = null;
                    x.a.b().r(new e7(x));
                }
            }
        }
        if (!x.a.f3258g.v()) {
            x.c = x.f3152i;
            x.a.b().r(new b7(x));
            return;
        }
        x.l(activity, x.s(activity), false);
        z1 n = x.a.n();
        Objects.requireNonNull((c) n.a.n);
        n.a.b().r(new y0(n, SystemClock.elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        y6 y6Var;
        f7 x = this.b.a.x();
        if (x.a.f3258g.v() && bundle != null && (y6Var = (y6) x.f3149f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", y6Var.c);
            bundle2.putString("name", y6Var.a);
            bundle2.putString("referrer_name", y6Var.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
