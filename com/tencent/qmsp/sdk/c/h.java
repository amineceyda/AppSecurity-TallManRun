package com.tencent.qmsp.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.qmsp.sdk.a.c;
import com.tencent.qmsp.sdk.a.f;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.i;
import com.tencent.qmsp.sdk.u.U;

public class h {
    private static SharedPreferences a;
    private static final int b;

    public static class a implements Runnable {
        public void run() {
            h.b();
        }
    }

    public static class b implements Runnable {
        public void run() {
            h.b();
        }
    }

    static {
        int i2 = 23;
        if (Build.VERSION.SDK_INT < 23) {
            i2 = 9;
        }
        b = i2;
    }

    private static void a() {
        String str;
        try {
            int i2 = b;
            String[] strArr = new String[i2];
            f.a(10, 0, 0, 0, (Object) null, (Object) null, (Object[]) null, strArr);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < i2; i3++) {
                strArr[i3] = i.a(strArr[i3]);
                sb.append(strArr[i3]);
                sb.append(",");
                if (i3 == 0) {
                    sb2.append(String.format("k%d:", new Object[]{Integer.valueOf(i3 + 1)}));
                    str = strArr[i3];
                } else {
                    sb2.append(String.format(";k%d:", new Object[]{Integer.valueOf(i3 + 1)}));
                    str = strArr[i3];
                }
                sb2.append(str);
            }
            sb2.append(String.format(";k%d:", new Object[]{Integer.valueOf(i2 + 1)}));
            sb2.append(U.BEACON_ID_VERSION);
            sb.append(sb2.toString());
            sb.append(",");
            sb.append(c.a(sb2.toString()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Java -- cbid: ");
            sb3.append(sb.toString());
            sb3.append(" bidMd5: ");
            sb3.append(c.a(sb2.toString()));
            g.b("cbid", 0, sb3.toString());
            f.a(sb.toString(), 5);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(long j2) {
        f.i().c().postDelayed(new b(), j2);
    }

    public static void a(Context context) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(b.a);
            sb.append("qmsp_cbid_time");
            a = context.getSharedPreferences(sb.toString(), 0);
            b();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b() {
        try {
            if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
                g.a("cbid", 1, "Cbid Task Finish！");
            } else if (a != null) {
                long j2 = 28800000;
                if (!f.i().a(1002).booleanValue()) {
                    a(28800000);
                    return;
                }
                long j3 = 0;
                long j4 = a.getLong("cbid_last_time", 0);
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = currentTimeMillis - j4;
                if (j5 >= 0) {
                    j3 = j5;
                }
                if (j3 > 28800000) {
                    a();
                    SharedPreferences.Editor edit = a.edit();
                    edit.putLong("cbid_last_time", currentTimeMillis);
                    edit.commit();
                } else {
                    j2 = 28800000 - j3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("cbid rpt after: ");
                sb.append(j2);
                g.a("cbid", 1, sb.toString());
                f.i().c().postDelayed(new a(), j2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
