package com.tencent.beacon.event;

import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.c.d;
import com.tencent.beacon.event.immediate.BeaconImmediateReportCallback;
import com.tencent.beacon.event.open.BeaconReport;

public class b implements Runnable {
    public final /* synthetic */ EventBean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d c;

    public b(d dVar, EventBean eventBean, String str) {
        this.c = dVar;
        this.a = eventBean;
        this.b = str;
    }

    public void run() {
        try {
            BeaconReport.getInstance().getImmediateReport().reportImmediate(this.c.a(d.a(this.a).toByteArray(), this.a), new BeaconImmediateReportCallback(this.c, this.a, this.b));
        } catch (Throwable th) {
            c.b("[immediate] report error!", new Object[0]);
            c.a(th);
            this.c.a(this.a, this.b);
            g.e().a("515", "immediate report error!", th);
        }
    }
}
