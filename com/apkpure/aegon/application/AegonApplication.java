package com.apkpure.aegon.application;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.tencent.crabshell.loader.CrabShellApplication;
import e.b.c.l;
import e.b.h.c1;
import e.d.b;
import e.n.a;
import java.lang.ref.WeakReference;

public class AegonApplication extends CrabShellApplication {
    public static final String AST_APP_CLASS_NAME = "com.apkpure.aegon.application.RealApplicationLike";

    static {
        b<WeakReference<l>> bVar = l.b;
        c1.b = true;
    }

    public static Application getApplication() {
        return RealApplicationLike.getApplication();
    }

    public static Context getContext() {
        return RealApplicationLike.getContext();
    }

    public void attachBaseContext(Context context) {
        a.e(context);
        context.setTheme(2131886088);
        super.attachBaseContext(context);
        if (Build.VERSION.SDK_INT < 21) {
            a.e(context);
        }
    }

    public String getApplicationLike() {
        return AST_APP_CLASS_NAME;
    }

    public void onCreate() {
        super.onCreate();
    }
}
