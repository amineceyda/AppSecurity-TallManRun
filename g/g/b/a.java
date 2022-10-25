package g.g.b;

import g.c.a.e.h.b.d;
import java.util.HashMap;

public final class a implements Runnable {
    public final /* synthetic */ long b;

    public a(long j2) {
        this.b = j2;
    }

    public void run() {
        b.a.info("上报保活时长: {}", (Object) Long.valueOf(this.b));
        HashMap hashMap = new HashMap();
        hashMap.put("keeplive_period", Long.valueOf(this.b));
        d.f("KeepAliveHeartbeat", hashMap);
    }
}
