package com.tencent.beacon.event;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.beacon.a.a.b;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.immediate.Beacon2MsfTransferArgs;
import com.tencent.beacon.event.immediate.Beacon2WnsTransferArgs;
import com.tencent.beacon.event.immediate.BeaconTransferArgs;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.Map;

public class d implements h, com.tencent.beacon.a.a.d {
    private final Handler a = a.a().a(3000);
    /* access modifiers changed from: private */
    public final com.tencent.beacon.event.a.a b;
    private final g c;

    /* renamed from: d  reason: collision with root package name */
    private final g f701d;

    /* renamed from: e  reason: collision with root package name */
    private long f702e = 2000;

    /* renamed from: f  reason: collision with root package name */
    private long f703f = 5000;

    public d() {
        com.tencent.beacon.event.a.a a2 = com.tencent.beacon.event.a.a.a();
        this.b = a2;
        this.c = new g(2000, a2, true);
        this.f701d = new g(1000, a2, false);
        b.a().a(11, this);
        b.a().a(2, this);
    }

    /* access modifiers changed from: private */
    public BeaconTransferArgs a(byte[] bArr, EventBean eventBean) {
        if (eventBean.getEventType() == 3) {
            return new Beacon2MsfTransferArgs(bArr);
        }
        Beacon2WnsTransferArgs beacon2WnsTransferArgs = new Beacon2WnsTransferArgs(bArr);
        beacon2WnsTransferArgs.setAppkey(eventBean.getAppKey());
        beacon2WnsTransferArgs.setEventCode(eventBean.getEventCode());
        return beacon2WnsTransferArgs;
    }

    public EventResult a(String str, EventBean eventBean) {
        c.a("[EventManager]", "eventName is %s, logID is %s", eventBean.getEventCode(), str);
        a.a().a((Runnable) new b(this, eventBean, str));
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        return EventResult.a.a(Long.parseLong(str));
    }

    public void a() {
        a.a().a(2000, 0, this.f702e, this.c);
        a.a().a(1000, 0, this.f703f, this.f701d);
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        int i2 = cVar.a;
        if (i2 == 2) {
            Map map = (Map) cVar.b.get("d_m");
            if (map != null) {
                if (this.f702e == 2000) {
                    this.f702e = com.tencent.beacon.base.util.b.a((String) map.get("realtimePollingTime"), this.f702e, 1000, 10000);
                }
                if (this.f703f == 5000) {
                    this.f703f = com.tencent.beacon.base.util.b.a((String) map.get("normalPollingTime"), this.f703f, 2000, 3600000);
                }
            }
        } else if (i2 == 11) {
            Object obj = cVar.b.get("u_c_r_p");
            if (obj != null) {
                long longValue = ((Long) obj).longValue();
                if (longValue >= 1000 && longValue <= 10000) {
                    this.f702e = longValue;
                }
            }
            Object obj2 = cVar.b.get("u_c_n_p");
            if (obj2 != null) {
                long longValue2 = ((Long) obj2).longValue();
                if (longValue2 >= 2000 && longValue2 <= 3600000) {
                    this.f703f = longValue2;
                }
            }
        }
        c.a("[EventManager]", "pollingTime maybe change, realtime: %s normal: %s", Long.valueOf(this.f702e), Long.valueOf(this.f703f));
    }

    public void a(EventBean eventBean, String str) {
        Map<String, String> eventValue = eventBean.getEventValue();
        eventValue.put("A156", "N");
        eventBean.setEventValue(eventValue);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventBean);
        com.tencent.beacon.base.net.c.c().b(com.tencent.beacon.event.c.d.a(arrayList, true)).a(new c(this, eventBean, str), a.b());
    }

    public void a(boolean z) {
        if (z) {
            this.f701d.run();
            this.c.run();
            return;
        }
        a.a().a((Runnable) this.f701d);
        a.a().a((Runnable) this.c);
    }

    public boolean a(Runnable runnable) {
        return this.a.post(runnable);
    }

    public EventResult b(String str, EventBean eventBean) {
        boolean a2 = a((Runnable) new a(this, eventBean));
        c.a("[EventModule]", 1, "event: %s. go in EventManager(%s). offer: %s", eventBean.getEventCode(), eventBean.getAppKey(), Boolean.valueOf(a2));
        if (!a2) {
            return EventResult.a.a((int) EventResult.ERROR_CODE_OFFER_FAIL);
        }
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        return EventResult.a.a(Long.parseLong(str));
    }

    public void b() {
        a.a().b(2000);
        a.a().b(1000);
    }

    public void c() {
        a.a().a(2000, false);
        a.a().a(1000, false);
    }
}
