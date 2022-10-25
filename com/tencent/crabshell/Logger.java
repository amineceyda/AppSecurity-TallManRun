package com.tencent.crabshell;

import android.util.Log;
import m.b.a.a.b.f;

public class Logger {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(8945804246055220875L, "com/tencent/crabshell/Logger", 49);
        $jacocoData = a;
        return a;
    }

    public Logger() {
        $jacocoInit()[0] = true;
    }

    public static void d(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            Log.d(str, str2);
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }

    public static void e(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            Log.e(str, str2);
            $jacocoInit[15] = true;
        }
        $jacocoInit[16] = true;
    }

    public static void e(String str, String str2, Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[17] = true;
        } else {
            $jacocoInit[18] = true;
            Log.e(str, str2, th);
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
    }

    public static void i(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            Log.i(str, str2);
            $jacocoInit[3] = true;
        }
        $jacocoInit[4] = true;
    }

    private static boolean needLog() {
        $jacocoInit()[48] = true;
        return true;
    }

    public static void printException(Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[43] = true;
            return;
        }
        if (th == null) {
            $jacocoInit[44] = true;
        } else {
            $jacocoInit[45] = true;
            th.printStackTrace();
            $jacocoInit[46] = true;
        }
        $jacocoInit[47] = true;
    }

    public static void printWrapper(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[25] = true;
        } else {
            $jacocoInit[26] = true;
            if (str == null) {
                $jacocoInit[27] = true;
            } else if (str.length() == 0) {
                $jacocoInit[28] = true;
            } else if (str2 == null) {
                $jacocoInit[29] = true;
            } else {
                $jacocoInit[30] = true;
                if (str2.length() == 0) {
                    $jacocoInit[31] = true;
                } else {
                    $jacocoInit[33] = true;
                    if (((long) str2.length()) > ((long) 3072)) {
                        $jacocoInit[34] = true;
                        while (str2.length() > 3072) {
                            $jacocoInit[37] = true;
                            String substring = str2.substring(0, 3072);
                            $jacocoInit[38] = true;
                            str2 = str2.replace(substring, "");
                            $jacocoInit[39] = true;
                            Log.e(str, substring);
                            $jacocoInit[40] = true;
                        }
                        Log.e(str, str2);
                        $jacocoInit[41] = true;
                    } else {
                        $jacocoInit[35] = true;
                        Log.e(str, str2);
                        $jacocoInit[36] = true;
                    }
                }
            }
            $jacocoInit[32] = true;
            return;
        }
        $jacocoInit[42] = true;
    }

    public static void v(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            Log.v(str, str2);
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
    }

    public static void w(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!needLog()) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            Log.w(str, str2);
            $jacocoInit[11] = true;
        }
        $jacocoInit[12] = true;
    }
}
