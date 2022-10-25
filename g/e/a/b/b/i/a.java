package g.e.a.b.b.i;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import g.e.a.b.b.h.e;

public class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public ApplicationInfo a(String str, int i2) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    public PackageInfo b(String str, int i2) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return e.l(this.a);
        }
        if (!e.j() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }
}
