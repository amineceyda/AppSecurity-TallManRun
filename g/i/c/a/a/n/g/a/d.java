package g.i.c.a.a.n.g.a;

import g.h.a.a;
import java.util.HashMap;

public class d implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public d(e eVar, String str, long j2) {
        this.b = str;
        this.c = j2;
    }

    public void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("dt_app_sessionid", this.b);
        hashMap.put("dt_app_foreground_heartbeat_duration", Long.valueOf(this.c));
        a.X(this.b, a.D(hashMap));
    }
}
