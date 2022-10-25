package com.ola.qsea.t;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;

public class b {
    public static long a() {
        long j2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Build.VERSION.SDK_INT >= 24) {
            j2 = Process.getStartElapsedRealtime();
        } else {
            elapsedRealtime = -1;
            j2 = 0;
        }
        return elapsedRealtime - j2;
    }
}
