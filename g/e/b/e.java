package g.e.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import g.e.b.t.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    public final String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }
}
