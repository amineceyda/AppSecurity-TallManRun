package g.i.c.a.a.b0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.view.View;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import g.i.c.a.a.l.c;
import java.util.Random;

public class f {
    public static volatile Context a = null;
    public static PackageInfo b = null;
    public static volatile boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Application f4408d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f4409e;

    public static long a(View view) {
        if (view == null) {
            return 0;
        }
        String b2 = c.b(view);
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        Object e2 = c.e(view, "element_identifier");
        String str = e2 instanceof String ? (String) e2 : null;
        StringBuilder l2 = a.l(b2, "_");
        Integer num = e2;
        if (TextUtils.isEmpty(str)) {
            num = Integer.valueOf(view.hashCode());
        }
        l2.append(num.toString());
        return (long) l2.toString().hashCode();
    }

    public static String b() {
        return System.currentTimeMillis() + "" + (new Random().nextInt(900) + 100);
    }

    public static Context c() {
        if (a == null) {
            if (!f4409e) {
                synchronized (f.class) {
                    if (!f4409e) {
                        try {
                            f4408d = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, new Object[0]);
                            if (f4408d != null) {
                                f4409e = true;
                            }
                        } catch (Throwable th) {
                            f4409e = true;
                            g.c.b.b.f.x("ReportUtils", "getCurrentApplication error " + th);
                        }
                    }
                }
            }
            a = f4408d;
        }
        return a;
    }

    public static PackageInfo d() {
        try {
            if (b == null) {
                b = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            }
        } catch (Exception e2) {
            g.c.b.b.f.x("ReportUtils", "getPackageInfo exception " + e2);
        }
        return b;
    }

    public static void e(Context context) {
        if (!c) {
            synchronized (f.class) {
                if (!c) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(MeasureConst.CRASH_MONITOR_SP_NAME, 0);
                    String string = sharedPreferences.getString("c7924ada07", "");
                    String valueOf = String.valueOf(2350);
                    if (!TextUtils.equals(string, valueOf)) {
                        sharedPreferences.edit().putString("c7924ada07", valueOf).apply();
                    }
                    c = true;
                }
            }
        }
    }
}
