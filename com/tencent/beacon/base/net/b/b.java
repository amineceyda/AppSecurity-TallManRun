package com.tencent.beacon.base.net.b;

import android.text.TextUtils;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.base.util.e;
import com.tencent.raft.codegenmeta.utils.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    public static String a = "https://otheve.beacon.qq.com/analytics/v2_upload";
    public static String b = "https://othstr.beacon.qq.com/analytics/v2_upload";
    public static String c = "http://vibeacon.onezapp.com:8080/analytics/upload";

    /* renamed from: d  reason: collision with root package name */
    public static String f621d = "http://vibeaconstr.onezapp.com:8080/analytics/upload";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f622e = false;

    public static String a(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        String str2 = str.contains("https") ? "https://" : "http://";
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.indexOf("/", str2.length()));
        int indexOf2 = substring.indexOf(Constants.KEY_INDEX_FILE_SEPARATOR);
        return indexOf2 != -1 ? substring.substring(0, indexOf2) : substring;
    }

    public static String a(boolean z) {
        return z ? c : a;
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f621d = str;
            b = b.replace("othstr.beacon.qq.com", str);
            f622e = true;
        }
        if (!TextUtils.isEmpty(str2)) {
            c = str2;
            a = a.replace("otheve.beacon.qq.com", str2);
            f622e = true;
        }
    }

    public static String b(boolean z) {
        return z ? f621d : b;
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str) && !f622e) {
            c = str;
        }
    }

    public static void b(String str, String str2) {
        Pattern compile = Pattern.compile("((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}");
        Matcher matcher = compile.matcher(str);
        Matcher matcher2 = compile.matcher(str2);
        if (!matcher.matches() || !matcher2.matches()) {
            e.a("[event url] set report ip is not valid IP address!");
            return;
        }
        f621d = str;
        b = b.replace("othstr.beacon.qq.com", str);
        c = str2;
        String replace = a.replace("otheve.beacon.qq.com", str2);
        a = replace;
        c.a("[event url] ip modified by api, socketStrategyHost: %s, httpsStrategyUrl: %s, socketLogHost: %s ,httpsLogUrl: %s", f621d, b, c, replace);
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str) && !f622e) {
            a = str;
        }
    }

    public static void d(String str) {
        if (!TextUtils.isEmpty(str) && !f622e) {
            f621d = str;
        }
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str) && !f622e) {
            b = str;
        }
    }
}
