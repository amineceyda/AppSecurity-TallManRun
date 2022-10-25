package g.e.b;

import android.content.Context;
import android.os.Build;
import g.e.b.t.g;

public final /* synthetic */ class f implements g {
    public static final /* synthetic */ f a = new f();

    public final String a(Object obj) {
        Context context = (Context) obj;
        int i2 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i2 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }
}
