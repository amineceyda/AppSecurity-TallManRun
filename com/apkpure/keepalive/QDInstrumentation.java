package com.apkpure.keepalive;

import android.app.Application;
import android.app.Instrumentation;
import android.os.Bundle;

public class QDInstrumentation extends Instrumentation {
    public void callApplicationOnCreate(Application application) {
        super.callApplicationOnCreate(application);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
