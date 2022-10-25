package g.i.c.a.a.n.g.a;

import android.text.TextUtils;
import e.e.i.b;
import g.h.a.a;
import java.util.HashMap;
import java.util.Map;

public final class f implements Runnable {
    public final /* synthetic */ String b;

    public f(String str) {
        this.b = str;
    }

    public void run() {
        Map<String, Object> F;
        Map<String, Object> E = a.E();
        if (E != null) {
            if (E.containsKey(this.b)) {
                HashMap hashMap = new HashMap();
                String str = this.b;
                hashMap.put(str, E.remove(str));
                a.Y(hashMap);
            } else {
                synchronized (a.class) {
                    if (!TextUtils.isEmpty("last_app_heart_beat_map")) {
                        b.L(g.i.c.a.a.b0.f.c(), (String) null, "last_app_heart_beat_map", "");
                    }
                }
            }
            for (Map.Entry next : E.entrySet()) {
                String str2 = (String) next.getKey();
                if (!TextUtils.isEmpty(str2)) {
                    String valueOf = String.valueOf(next.getValue());
                    if (!TextUtils.isEmpty(valueOf) && (F = a.F(valueOf)) != null && !str2.equals(this.b)) {
                        g.a(F);
                    }
                }
            }
        }
    }
}
