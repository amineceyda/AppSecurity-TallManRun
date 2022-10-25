package g.i.b.e;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import g.i.b.e.b.e;

public final class a implements Runnable {
    public final void run() {
        try {
            PackageInfo packageInfo = c.f4125g.getPackageManager().getPackageInfo(c.f4125g.getPackageName(), 0);
            c.a = packageInfo.versionName;
            c.c = packageInfo.versionCode;
            c.b = packageInfo.applicationInfo.loadLabel(c.f4125g.getPackageManager()).toString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean z = e.a;
        try {
            e.i();
            e.d();
            c.f4125g.registerReceiver(e.f4115j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Throwable unused) {
        }
        Context context = c.f4125g;
    }
}
