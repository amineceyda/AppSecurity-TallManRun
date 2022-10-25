package com.ola.qsea.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static final Map<String, a> a = new ConcurrentHashMap();
    public SharedPreferences b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public Context f444d;

    public a(String str) {
        this.c = str;
    }

    public static synchronized a c(String str) {
        a aVar;
        synchronized (a.class) {
            Map<String, a> map = a;
            aVar = map.get(str);
            if (aVar == null) {
                aVar = new a(str);
                map.put(str, aVar);
            }
        }
        return aVar;
    }

    public void a(Context context, String str) {
        this.f444d = context;
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            StringBuilder n = g.a.a.a.a.n("QV1", str, com.ola.qsea.d.a.a(context).replace(context.getPackageName(), ""));
            n.append(com.ola.qsea.l.a.a(this.c));
            this.b = this.f444d.getSharedPreferences(n.toString(), 0);
        }
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public void a(String str, long j2) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(str, j2).apply();
        }
    }

    public void a(String str, String str2) {
        try {
            str2 = com.ola.qsea.b.a.b(str2, com.ola.qsea.b.a.a(str));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b(str, str2);
    }

    public String b(String str) {
        String e2 = e(str);
        if (e2.equals("")) {
            return e2;
        }
        try {
            return com.ola.qsea.b.a.a(e2, com.ola.qsea.b.a.a(str));
        } catch (Exception e3) {
            e3.printStackTrace();
            return e2;
        }
    }

    public void b(String str, String str2) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public long d(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getLong(str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r3 = r0.getString(r3, "");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e(java.lang.String r3) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = r2.b
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.k.a.e(java.lang.String):java.lang.String");
    }
}
