package g.c.b.a.l;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import e.e.c.a;
import g.c.b.a.j.g;
import i.o.c.h;
import java.util.Objects;

public final class b {
    public static final boolean a(Context context) {
        return Build.VERSION.SDK_INT < 23 || a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static final LocationManager b(Context context) {
        if (context.getSystemService("location") == null) {
            h.e("LbsUtil", "tag");
            h.e("get location manager context is null.", "message");
            g gVar = c.b;
            String j2 = h.j("ClientChannel|", "LbsUtil");
            if (gVar != null) {
                gVar.d(j2, "get location manager context is null.");
                return null;
            }
            Log.d(j2, "get location manager context is null.");
            return null;
        }
        Object systemService = context.getSystemService("location");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }
}
