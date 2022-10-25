package g.c.a.m;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import g.c.a.n.b.b;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class g {
    public static final Logger a = LoggerFactory.getLogger("ClientUtils");

    public static void a(Context context, String str, String str2) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            b bVar = new b(context, true);
            bVar.a.f35d = str;
            bVar.l(str2);
            bVar.n(17039370, (DialogInterface.OnClickListener) null);
            b bVar2 = b.b;
            bVar.f2116k = bVar.c.getText(2131821444);
            bVar.f2117l = bVar2;
            bVar.e();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a(context, str, str2));
    }

    public static String b() {
        try {
            return String.format(Locale.ENGLISH, "%04d", new Object[]{9027});
        } catch (Exception e2) {
            a.warn("Get build no exception:", (Throwable) e2);
            return "0000";
        }
    }
}
