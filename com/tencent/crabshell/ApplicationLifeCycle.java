package com.tencent.crabshell;

import android.app.Application;
import m.b.a.a.b.f;

public abstract class ApplicationLifeCycle {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(3738085178687372705L, "com/tencent/crabshell/ApplicationLifeCycle", 1);
        $jacocoData = a;
        return a;
    }

    public ApplicationLifeCycle() {
        $jacocoInit()[0] = true;
    }

    public abstract void attachBaseContext(Application application);

    public abstract void onCreate(Application application);

    public abstract void onLowMemory(Application application);
}
