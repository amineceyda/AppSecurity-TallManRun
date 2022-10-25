package g.e.a.b.e.c;

import android.content.Context;
import android.os.StrictMode;
import e.d.a;
import e.d.f;
import e.d.g;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class y5 implements j5 {
    public static final Map a = new a();

    public static y5 b(Context context, String str) {
        y5 y5Var;
        if (!c5.a()) {
            synchronized (y5.class) {
                y5Var = (y5) ((g) a).get((Object) null);
                if (y5Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return y5Var;
        }
        throw null;
    }

    public static synchronized void c() {
        synchronized (y5.class) {
            Map map = a;
            Iterator it = ((f.e) ((a) map).values()).iterator();
            if (!it.hasNext()) {
                ((g) map).clear();
            } else {
                Objects.requireNonNull((y5) it.next());
                throw null;
            }
        }
    }

    public final Object a(String str) {
        throw null;
    }
}
