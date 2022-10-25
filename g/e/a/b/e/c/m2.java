package g.e.a.b.e.c;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import g.e.a.b.b.h.b;
import g.e.a.b.b.h.c;
import g.e.a.b.b.h.e;
import g.e.a.b.f.a.a;
import g.e.a.b.f.b.x6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class m2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile m2 f2995i;
    public final String a;
    public final b b;
    public final ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2996d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2997e;

    /* renamed from: f  reason: collision with root package name */
    public int f2998f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2999g;

    /* renamed from: h  reason: collision with root package name */
    public volatile z0 f3000h;

    public m2(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        this.a = (str == null || !b(str2, str3)) ? "FA" : str;
        this.b = c.a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x1());
        boolean z2 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f2996d = new a(this);
        this.f2997e = new ArrayList();
        try {
            if (x6.b(context, "google_app_id", e.y(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (!z) {
                    this.f2999g = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        if (!b(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z2)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        this.c.execute(new n1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new l2(this));
        }
    }

    public static final boolean b(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static m2 c(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f2995i == null) {
            synchronized (m2.class) {
                if (f2995i == null) {
                    f2995i = new m2(context, (String) null, (String) null, (String) null, bundle);
                }
            }
        }
        return f2995i;
    }

    public final void a(Exception exc, boolean z, boolean z2) {
        this.f2999g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            this.c.execute(new w1(this, "Error with data collection. Data lost.", exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void d(String str, String str2, Bundle bundle) {
        this.c.execute(new a2(this, (Long) null, str, str2, bundle, true, true));
    }
}
