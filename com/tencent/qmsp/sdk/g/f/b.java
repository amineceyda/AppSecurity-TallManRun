package com.tencent.qmsp.sdk.g.f;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.qmsp.sdk.base.c;

public class b {
    private static final Uri a = Uri.parse("content://cn.nubia.identity/identity");

    public static String a(Context context, String str) {
        Exception e2;
        String str2;
        StringBuilder sb;
        String str3 = null;
        try {
            int i2 = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
            Bundle call = acquireUnstableContentProviderClient.call("getAAID", str, (Bundle) null);
            if (i2 >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                str2 = call.getString("id");
                try {
                    sb = new StringBuilder();
                    sb.append("NubiaLog succeed:");
                } catch (Exception e3) {
                    e2 = e3;
                    str3 = str2;
                    e2.printStackTrace();
                    return str3;
                }
            } else {
                str2 = call.getString("message");
                sb = new StringBuilder();
                sb.append("NubiaLog failed:");
            }
            sb.append(str2);
            c.c(sb.toString());
            return str2;
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            return str3;
        }
    }

    public static boolean a(Context context) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
            Bundle call = acquireUnstableContentProviderClient.call("isSupport", (String) null, (Bundle) null);
            if (i2 >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                c.c("NubiaLog succeed");
                return call.getBoolean("issupport", true);
            }
            String string = call.getString("message");
            StringBuilder sb = new StringBuilder();
            sb.append("NubiaLog failed:");
            sb.append(string);
            c.c(sb.toString());
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String b(Context context) {
        String str;
        Exception e2;
        StringBuilder sb;
        try {
            int i2 = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
            Bundle call = acquireUnstableContentProviderClient.call("getOAID", (String) null, (Bundle) null);
            if (i2 >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                str = call.getString("id");
                try {
                    sb = new StringBuilder();
                    sb.append("NubiaLog succeed:");
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    return str;
                }
            } else {
                str = call.getString("message");
                sb = new StringBuilder();
                sb.append("NubiaLog failed:");
            }
            sb.append(str);
            c.c(sb.toString());
        } catch (Exception e4) {
            e2 = e4;
            str = null;
            e2.printStackTrace();
            return str;
        }
        return str;
    }
}
