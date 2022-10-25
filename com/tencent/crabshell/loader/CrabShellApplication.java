package com.tencent.crabshell.loader;

import android.app.Application;
import android.content.Context;
import com.tencent.crabshell.Logger;
import g.a.a.a.a;
import java.lang.reflect.Method;
import m.b.a.a.b.f;

public abstract class CrabShellApplication extends Application {
    private static transient /* synthetic */ boolean[] $jacocoData;
    public static long applicationCreateTime = System.currentTimeMillis();
    public static Application instance;
    public ClassLoader mCurrentClassLoader;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-2336621200539460854L, "com/tencent/crabshell/loader/CrabShellApplication", 20);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[19] = true;
    }

    public CrabShellApplication() {
        $jacocoInit()[0] = true;
    }

    public void attachBaseContext(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        applicationCreateTime = System.currentTimeMillis();
        instance = this;
        $jacocoInit[1] = true;
        super.attachBaseContext(context);
        $jacocoInit[2] = true;
        ShellAllLoader.loadNewApk(this, applicationCreateTime);
        $jacocoInit[3] = true;
        this.mCurrentClassLoader = context.getClassLoader();
        $jacocoInit[4] = true;
        callAstAppMethod("attachBaseContext");
        $jacocoInit[5] = true;
    }

    public void callAstAppMethod(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Class<?> cls = Class.forName(getApplicationLike(), false, this.mCurrentClassLoader);
            $jacocoInit[10] = true;
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            $jacocoInit[11] = true;
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            $jacocoInit[12] = true;
            Method declaredMethod2 = cls.getDeclaredMethod(str, new Class[]{Application.class});
            $jacocoInit[13] = true;
            declaredMethod2.invoke(invoke, new Object[]{this});
            $jacocoInit[14] = true;
        } catch (Throwable th) {
            $jacocoInit[15] = true;
            th.printStackTrace();
            $jacocoInit[16] = true;
            StringBuilder n = a.n("----try--", str, "----exception--");
            n.append(th.getMessage());
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, n.toString());
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }

    public abstract String getApplicationLike();

    public void onCreate() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onCreate();
        $jacocoInit[6] = true;
        callAstAppMethod("onCreate");
        $jacocoInit[7] = true;
    }

    public void onLowMemory() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onLowMemory();
        $jacocoInit[8] = true;
        callAstAppMethod("onLowMemory");
        $jacocoInit[9] = true;
    }
}
