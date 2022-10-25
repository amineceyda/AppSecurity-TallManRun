package com.tencent.raft.raftframework.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.tencent.raft.raftframework.log.RLog;
import java.util.concurrent.atomic.AtomicReference;

public class AppUtils {
    private static final String TAG = "AppUtils";
    private static AtomicReference<PackageInfo> sPackageInfoSingleCache;

    private AppUtils() {
    }

    public static int getAppVersionCode(Context context) {
        if (TextUtils.isEmpty(context.getPackageName())) {
            return -1;
        }
        try {
            PackageInfo packageInfoPreferCache = getPackageInfoPreferCache(context);
            if (packageInfoPreferCache == null) {
                return -1;
            }
            return packageInfoPreferCache.versionCode;
        } catch (Exception e2) {
            RLog.w(TAG, "getAppVersionCode error: " + e2);
            e2.printStackTrace();
            return -1;
        }
    }

    public static String getAppVersionName(Context context) {
        if (TextUtils.isEmpty(context.getPackageName())) {
            return "unknown";
        }
        try {
            PackageInfo packageInfoPreferCache = getPackageInfoPreferCache(context);
            return packageInfoPreferCache == null ? "unknown" : packageInfoPreferCache.versionName;
        } catch (Exception e2) {
            RLog.w(TAG, "getAppVersionName error: " + e2);
            e2.printStackTrace();
            return "unknown";
        }
    }

    public static String getApplicationName(Context context) {
        try {
            return context.getString(context.getApplicationInfo().labelRes);
        } catch (Exception e2) {
            RLog.w(TAG, "getApplicationName error: " + e2);
            return "";
        }
    }

    private static PackageInfo getPackageInfoPreferCache(Context context) {
        if (sPackageInfoSingleCache == null) {
            synchronized (AppUtils.class) {
                if (sPackageInfoSingleCache == null) {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    } catch (Exception e2) {
                        RLog.w(TAG, "getPackageInfoPreferCache error: ", e2);
                    }
                    sPackageInfoSingleCache = new AtomicReference<>(packageInfo);
                }
            }
        }
        return sPackageInfoSingleCache.get();
    }
}
