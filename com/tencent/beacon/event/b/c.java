package com.tencent.beacon.event.b;

import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.c.a;
import com.tencent.beacon.event.open.BeaconEvent;

public abstract class c {
    private c a;

    public abstract BeaconEvent a(BeaconEvent beaconEvent);

    public void a(c cVar) {
        this.a = cVar;
    }

    public final EventBean b(BeaconEvent beaconEvent) {
        BeaconEvent a2 = a(beaconEvent);
        c cVar = this.a;
        return cVar != null ? cVar.b(a2) : a.a(a2);
    }
}
