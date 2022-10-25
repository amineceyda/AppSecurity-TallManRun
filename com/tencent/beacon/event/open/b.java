package com.tencent.beacon.event.open;

import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.util.c;
import g.a.a.a.a;

public class b implements Runnable {
    public final /* synthetic */ BeaconConfig a;
    public final /* synthetic */ BeaconReport b;

    public b(BeaconReport beaconReport, BeaconConfig beaconConfig) {
        this.b = beaconReport;
        this.a = beaconConfig;
    }

    public void run() {
        try {
            i.a();
            i.h();
            this.b.a(this.a);
            this.b.a();
            c.a("BeaconReport", "App: %s start success!", com.tencent.beacon.a.c.c.d().f());
        } catch (Throwable th) {
            g e2 = g.e();
            StringBuilder i2 = a.i("sdk init error! package name: ");
            i2.append(com.tencent.beacon.a.c.b.b());
            i2.append(" , msg:");
            i2.append(th.getMessage());
            e2.a("201", i2.toString(), th);
            c.b("BeaconReport init error: " + th.getMessage(), new Object[0]);
            c.a(th);
        }
    }
}
