package com.tencent.beacon.event;

import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.c.d;

public class a implements Runnable {
    public final /* synthetic */ EventBean a;
    public final /* synthetic */ d b;

    public a(d dVar, EventBean eventBean) {
        this.b = dVar;
        this.a = eventBean;
    }

    public void run() {
        if (this.b.b.a(this.a.getEventType())) {
            g e2 = g.e();
            StringBuilder i2 = g.a.a.a.a.i("type: ");
            i2.append(d.a(this.a.getEventType()));
            i2.append(" max db count!");
            e2.a("602", i2.toString());
            c.a("[EventModule]", 2, "event: %s. insert to DB false. reason: DB count max!", this.a.getEventCode());
            return;
        }
        boolean a2 = this.b.b.a(this.a);
        c.a("[EventModule]", 2, "event: %s. insert to DB %s", this.a.getEventCode(), Boolean.valueOf(a2));
        if (a2) {
            this.b.b();
        }
    }
}
