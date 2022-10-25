package g.c.a.e.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class a {
    public static final Object a = new Object();
    public static volatile Handler b;
    public static Handler c;

    /* renamed from: d  reason: collision with root package name */
    public static Map<C0063a, Handler> f1990d = Collections.synchronizedMap(new HashMap());

    /* renamed from: g.c.a.e.j.a$a  reason: collision with other inner class name */
    public enum C0063a {
        BeaconReportHandler
    }

    public static synchronized Handler a() {
        Handler handler;
        synchronized (a.class) {
            if (c == null) {
                c = b(C0063a.BeaconReportHandler);
            }
            handler = c;
        }
        return handler;
    }

    public static Handler b(C0063a aVar) {
        StringBuilder i2 = g.a.a.a.a.i("getHandler(");
        i2.append(aVar.name());
        i2.append(") exists at cache:");
        i2.append(f1990d.containsKey(aVar));
        g.c.a.e.e.a.a("HandlerUtils", i2.toString());
        if (f1990d.containsKey(aVar)) {
            return f1990d.get(aVar);
        }
        try {
            HandlerThread handlerThread = new HandlerThread(aVar.name());
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                Handler handler = new Handler(looper);
                try {
                    f1990d.put(aVar, handler);
                } catch (StackOverflowError unused) {
                }
                return handler;
            }
            handlerThread.quit();
            return null;
        } catch (StackOverflowError unused2) {
            return null;
        }
    }

    public static Handler c() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return b;
    }
}
