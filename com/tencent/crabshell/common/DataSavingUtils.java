package com.tencent.crabshell.common;

import android.content.Context;
import android.content.SharedPreferences;
import m.b.a.a.b.f;

public class DataSavingUtils {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String DATA_NAME = "app_shell_settings";
    public static final String DEFAULT_VALUE_STRING = "";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-8792436785524974065L, "com/tencent/crabshell/common/DataSavingUtils", 11);
        $jacocoData = a;
        return a;
    }

    public DataSavingUtils() {
        $jacocoInit()[0] = true;
    }

    public static boolean getDataBoolean(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_NAME, 0);
        $jacocoInit[7] = true;
        boolean z = sharedPreferences.getBoolean(str, false);
        $jacocoInit[8] = true;
        return z;
    }

    public static String getDataString(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_NAME, 0);
        $jacocoInit[5] = true;
        String string = sharedPreferences.getString(str, "");
        $jacocoInit[6] = true;
        return string;
    }

    public static void putData(Context context, String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_NAME, 0);
        $jacocoInit[1] = true;
        sharedPreferences.edit().putString(str, str2).commit();
        $jacocoInit[2] = true;
    }

    public static void putData(Context context, String str, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_NAME, 0);
        $jacocoInit[3] = true;
        sharedPreferences.edit().putBoolean(str, z).commit();
        $jacocoInit[4] = true;
    }

    public static void setDexSha1(Context context, String str, String str2, String str3) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        $jacocoInit[9] = true;
        sharedPreferences.edit().putString(str2, str3).commit();
        $jacocoInit[10] = true;
    }
}
