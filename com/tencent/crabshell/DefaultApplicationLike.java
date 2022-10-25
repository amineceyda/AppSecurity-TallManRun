package com.tencent.crabshell;

import android.app.Application;
import m.b.a.a.b.f;

public class DefaultApplicationLike extends ApplicationLifeCycle {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static volatile Application application;
    private static volatile ApplicationLifeCycle mApp;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(3874755879281515430L, "com/tencent/crabshell/DefaultApplicationLike", 13);
        $jacocoData = a;
        return a;
    }

    public DefaultApplicationLike() {
        $jacocoInit()[0] = true;
    }

    public static Application getApplication() {
        boolean[] $jacocoInit = $jacocoInit();
        Application application2 = application;
        $jacocoInit[9] = true;
        return application2;
    }

    public static ApplicationLifeCycle getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (mApp != null) {
            $jacocoInit[1] = true;
        } else {
            synchronized (ApplicationLifeCycle.class) {
                try {
                    $jacocoInit[2] = true;
                    if (mApp != null) {
                        $jacocoInit[3] = true;
                    } else {
                        $jacocoInit[4] = true;
                        mApp = new DefaultApplicationLike();
                        $jacocoInit[5] = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        $jacocoInit[7] = true;
                        throw th;
                    }
                }
            }
            $jacocoInit[6] = true;
        }
        ApplicationLifeCycle applicationLifeCycle = mApp;
        $jacocoInit[8] = true;
        return applicationLifeCycle;
    }

    public void attachBaseContext(Application application2) {
        boolean[] $jacocoInit = $jacocoInit();
        application = application2;
        $jacocoInit[10] = true;
    }

    public void onCreate(Application application2) {
        $jacocoInit()[11] = true;
    }

    public void onLowMemory(Application application2) {
        $jacocoInit()[12] = true;
    }
}
