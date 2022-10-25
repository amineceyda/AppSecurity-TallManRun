package g.c.a.l.n;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import g.c.a.i.a;
import g.c.a.l.d;
import i.o.c.h;
import i.o.c.o;
import java.util.List;

public final class k implements a {
    public final /* synthetic */ o<Activity> a;

    public k(o<Activity> oVar) {
        this.a = oVar;
    }

    public void a(List<String> list, boolean z, int i2) {
        h.e(list, "grantPermissions");
        if (i2 == 10001) {
            d.a.m();
        }
    }

    public void b(List<String> list, boolean z, int i2) {
        h.e(list, "grantPermissions");
        if (i2 == 10001) {
            if (!z) {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ((Activity) this.a.element).getPackageName(), (String) null));
                if (intent.resolveActivity(((Activity) this.a.element).getPackageManager()) != null) {
                    ((Activity) this.a.element).startActivity(intent);
                }
            }
            d.a.m();
        }
    }
}
