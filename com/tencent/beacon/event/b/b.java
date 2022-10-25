package com.tencent.beacon.event.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.HashMap;
import java.util.Map;

public class b extends c implements d {
    private boolean b = false;
    private String c;

    public b() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    private boolean c(BeaconEvent beaconEvent) {
        return beaconEvent.getType() == EventType.IMMEDIATE_WNS || beaconEvent.getType() == EventType.IMMEDIATE_MSF;
    }

    public BeaconEvent a(BeaconEvent beaconEvent) {
        if (this.b && !com.tencent.beacon.base.util.b.a(beaconEvent.getCode())) {
            return beaconEvent;
        }
        c d2 = c.d();
        Context c2 = d2.c();
        Map<String, String> params = beaconEvent.getParams();
        params.put("A3", i.c());
        params.put("A153", i.d());
        params.put("A157", i.f());
        params.put("A143", c.d().g());
        params.put("A144", g.e().i());
        params.put("A19", e.l().q());
        params.put("QQ", com.tencent.beacon.a.c.b.c());
        params.put("A95", "" + com.tencent.beacon.a.c.b.a());
        params.put("A141", i.g());
        params.put("A23", d2.a());
        params.put("A48", c.d().e());
        String appKey = beaconEvent.getAppKey();
        EventModule eventModule = (EventModule) d2.a(ModuleName.EVENT);
        params.put("A1", eventModule.c(appKey));
        params.put("A8", eventModule.b(appKey));
        params.put("A99", beaconEvent.getLogidPrefix());
        params.put("A72", d2.j());
        params.put("A159", e.l().E());
        params.put("A34", String.valueOf(com.tencent.beacon.base.util.b.c()));
        params.put("A156", c(beaconEvent) ? "Y" : "N");
        if (!params.containsKey("A88")) {
            if (TextUtils.isEmpty(this.c)) {
                this.c = com.tencent.beacon.a.c.b.a(c2);
            }
            params.put("A88", this.c);
        }
        params.put("A100", com.tencent.beacon.event.c.g.a(c2, appKey).a(beaconEvent.getCode(), beaconEvent.getType()));
        Map<String, String> a = eventModule.a(appKey);
        if (a != null) {
            params.putAll(a);
        }
        beaconEvent.setParams(params);
        return beaconEvent;
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        HashMap hashMap;
        if (cVar.a == 2 && (hashMap = (HashMap) cVar.b.get("d_m")) != null) {
            this.b = com.tencent.beacon.base.util.b.a((String) hashMap.get("tidyEF"), this.b);
        }
    }
}
