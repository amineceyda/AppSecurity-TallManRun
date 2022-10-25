package com.tencent.beacon.event.b;

import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import java.util.Map;

public class a extends c {
    public BeaconEvent a(BeaconEvent beaconEvent) {
        EventType type = beaconEvent.getType();
        if (type == EventType.DT_REALTIME || type == EventType.DT_NORMAL) {
            Map<String, String> params = beaconEvent.getParams();
            e l2 = e.l();
            g e2 = g.e();
            StringBuilder i2 = g.a.a.a.a.i("");
            i2.append(e2.c());
            params.put("dt_imei2", i2.toString());
            params.put("dt_meid", "" + e2.g());
            params.put("dt_mf", "" + l2.o());
            beaconEvent.setParams(params);
        }
        return beaconEvent;
    }
}
