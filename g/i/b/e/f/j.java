package g.i.b.e.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import g.i.b.e.c;
import g.i.b.e.h.b;

public final class j {
    public static String a = "";
    public static String b = "";

    public static SharedPreferences a(boolean z) {
        try {
            Context context = c.f4125g;
            StringBuilder sb = new StringBuilder("HalleyServicePreferences_");
            sb.append(c.f4126h);
            sb.append(c.o ? "_test" : "");
            String sb2 = sb.toString();
            if (z) {
                sb2 = sb2 + "_" + c.a();
            }
            return context.getSharedPreferences(sb2, 0);
        } catch (Exception e2) {
            b.i("PlatformUtil", e2.getMessage());
            return null;
        }
    }

    public static String b() {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String f2 = f("deviceid", "", false);
        b = f2;
        return f2;
    }

    public static void c(String str) {
        e("deviceid", str, false);
        b = str;
    }

    public static void d(String str, long j2) {
        SharedPreferences a2 = a(false);
        if (a2 != null) {
            a2.edit().putLong(str, j2).commit();
        }
    }

    public static void e(String str, String str2, boolean z) {
        SharedPreferences a2 = a(z);
        if (a2 != null) {
            a2.edit().putString(str, str2).commit();
        }
    }

    public static String f(String str, String str2, boolean z) {
        SharedPreferences a2 = a(z);
        return a2 != null ? a2.getString(str, str2) : "";
    }
}
