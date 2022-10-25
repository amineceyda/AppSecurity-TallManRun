package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import g.e.a.b.b.h.e;
import g.e.a.b.e.c.m1;
import g.e.a.b.e.c.m2;
import g.e.a.b.f.b.r6;
import g.e.b.j.b;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final m2 a;

    public FirebaseAnalytics(m2 m2Var) {
        Objects.requireNonNull(m2Var, "null reference");
        this.a = m2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(m2.c(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return b;
    }

    @Keep
    public static r6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        m2 c = m2.c(context, (String) null, (String) null, (String) null, bundle);
        if (c == null) {
            return null;
        }
        return new b(c);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) e.b(g.e.b.r.e.d().f(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        m2Var.c.execute(new m1(m2Var, activity, str, str2));
    }
}
