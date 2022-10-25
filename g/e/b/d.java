package g.e.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import g.e.b.t.g;

public final /* synthetic */ class d implements g {
    public static final /* synthetic */ d a = new d();

    public final String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
