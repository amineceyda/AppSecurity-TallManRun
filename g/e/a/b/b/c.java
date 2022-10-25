package g.e.a.b.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import g.e.a.b.b.i.b;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {
    public static boolean a = false;
    public static boolean b = false;
    public static final AtomicBoolean c = new AtomicBoolean();

    static {
        new AtomicBoolean();
    }

    public static boolean a(Context context) {
        if (!b) {
            try {
                PackageInfo packageInfo = b.a(context).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                d.a(context);
                if (packageInfo == null || d.d(packageInfo, false) || !d.d(packageInfo, true)) {
                    a = false;
                } else {
                    a = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } catch (Throwable th) {
                b = true;
                throw th;
            }
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }
}
