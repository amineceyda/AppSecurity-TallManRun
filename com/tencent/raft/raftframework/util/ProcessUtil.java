package com.tencent.raft.raftframework.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.raft.raftframework.log.RLog;
import java.util.List;

public class ProcessUtil {
    private static final String TAG = "ProcessUtil";
    private static String sProcessName;

    private ProcessUtil() {
    }

    private static String fetchProcessNameInner(Context context) {
        String currentProcessNameByApplication = getCurrentProcessNameByApplication();
        if (TextUtils.isEmpty(currentProcessNameByApplication)) {
            currentProcessNameByApplication = getCurrentProcessNameByActivityManager(context);
        }
        return currentProcessNameByApplication.replace(context.getPackageName(), "");
    }

    public static String getCurrentProcessNameByActivityManager(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return "";
        } catch (Exception e2) {
            RLog.w(TAG, "getCurrentProcessNameByActivityManager error ", e2);
            return "";
        }
    }

    public static String getCurrentProcessNameByApplication() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
    }

    public static synchronized String getProcessName(Context context) {
        synchronized (ProcessUtil.class) {
            if (sProcessName == null) {
                if (context == null) {
                    return "";
                }
                sProcessName = fetchProcessNameInner(context);
                RLog.d(TAG, "Current Process =" + sProcessName);
            }
            String str = sProcessName;
            return str;
        }
    }
}
