package g.c.a.e.k.i;

import android.text.TextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b {
    public static final Logger a = LoggerFactory.getLogger("MIUISystemUtilsLog");

    public static boolean a() {
        String str = null;
        try {
            str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.miui.ui.version.name"});
        } catch (Exception e2) {
            a.warn("Unable to use SystemProperties.get", (Throwable) e2);
        }
        return !TextUtils.isEmpty(str);
    }
}
