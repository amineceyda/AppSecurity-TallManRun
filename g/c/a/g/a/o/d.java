package g.c.a.g.a.o;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.apkpure.aegon.application.RealApplicationLike;
import e.e.i.b;
import g.c.c.c;
import g.c.c.g;
import g.c.c.l;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {
    public static final Logger a = LoggerFactory.getLogger("AppStatusUtils");
    public static boolean b = false;
    public static final List<g.c.a.m.d> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final List<g.c.a.m.d> f2030d = new ArrayList();

    public static void a(g.c.a.m.d dVar) {
        Logger logger = a;
        List<g.c.a.m.d> list = c;
        logger.info("callback len: {}. addIsBackgroundListen {}", (Object) Integer.valueOf(list.size()), (Object) dVar);
        if (dVar != null && !list.contains(dVar)) {
            list.add(dVar);
        }
    }

    public static void b(Context context) {
        Logger logger = a;
        logger.info("resetProcess");
        if (context == null) {
            logger.warn("resetProcess context is null");
            return;
        }
        Logger logger2 = l.a;
        b.D().a(g.b);
        context.startInstrumentation(new ComponentName(RealApplicationLike.MAIN_PROCESS_NAME, "com.apkpure.keepalive.QDInstrumentation"), (String) null, new Bundle());
        new Handler(Looper.getMainLooper()).postDelayed(c.b, 2000);
    }
}
