package com.tencent.beacon.module;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.b.f;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.b.a;
import com.tencent.beacon.event.b.b;
import com.tencent.beacon.event.b.c;
import com.tencent.beacon.event.h;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class EventModule implements BeaconModule, d, e.a {
    private static final Map<String, Map<String, String>> a = new ConcurrentHashMap(3);
    private static final Map<String, String> b = new ConcurrentHashMap(3);
    private static final Map<String, String> c = new ConcurrentHashMap(3);

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f749d = new ArrayList(3);

    /* renamed from: e  reason: collision with root package name */
    private AtomicInteger f750e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f751f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private boolean f752g = true;

    /* renamed from: h  reason: collision with root package name */
    private StrategyModule f753h;

    /* renamed from: i  reason: collision with root package name */
    private h f754i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f755j;

    /* access modifiers changed from: private */
    public void a(Map<String, Integer> map, Map<String, Integer> map2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        if (hashSet.isEmpty()) {
            f.e().a("702", String.format("real_logid_count=%s&normal_logid_count=%s&appkey=%s", new Object[]{0, 0, com.tencent.beacon.a.c.c.d().f()}));
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.e().a("702", String.format("real_logid_count=%s&normal_logid_count=%s&appkey=%s", new Object[]{Integer.valueOf(map.containsKey(str) ? map.get(str).intValue() : 0), Integer.valueOf(map2.containsKey(str) ? map2.get(str).intValue() : 0), str}));
        }
    }

    private String d(String str) {
        return TextUtils.isEmpty(str) ? com.tencent.beacon.a.c.c.d().f() : str;
    }

    private void e() {
        this.f749d.add(new b());
        this.f749d.add(new a());
        for (int i2 = 1; i2 < this.f749d.size(); i2++) {
            this.f749d.get(i2 - 1).a(this.f749d.get(i2));
        }
    }

    private void f() {
        com.tencent.beacon.a.a.b.a().a(7, this);
        if (this.f752g) {
            com.tencent.beacon.event.d dVar = new com.tencent.beacon.event.d();
            this.f754i = dVar;
            dVar.a();
        }
    }

    private void g() {
        com.tencent.beacon.a.a.b.a().a(3, this);
        com.tencent.beacon.a.a.b.a().a(4, this);
        com.tencent.beacon.a.a.b.a().a(6, this);
        com.tencent.beacon.a.a.b.a().a(1, this);
    }

    private void h() {
        com.tencent.beacon.a.b.a.a().a(3000).postAtFrontOfQueue(new Runnable() {
            public void run() {
                try {
                    com.tencent.beacon.event.a.a a2 = com.tencent.beacon.event.a.a.a();
                    Map<String, Integer> b = a2.b("t_r_e");
                    EventModule.this.a(b, a2.b("t_n_e"));
                } catch (Throwable th) {
                    com.tencent.beacon.base.util.c.a(th);
                    g.e().a("204", "error while storageReport", th);
                }
            }
        });
    }

    public EventResult a(BeaconEvent beaconEvent) {
        StrategyModule strategyModule;
        com.tencent.beacon.base.util.c.a("[EventModule]", 0, "event: %s. go in EventModule", beaconEvent.getCode());
        if (!this.f752g) {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s. EventModule is not enable", beaconEvent.getCode());
            return EventResult.a.a((int) EventResult.ERROR_CODE_NOT_ENABLE);
        }
        com.tencent.beacon.base.util.e.a((Map) beaconEvent.getParams());
        StrategyModule strategyModule2 = this.f753h;
        if (strategyModule2 != null && strategyModule2.b().a(beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s.  is not allowed in strategy (false)", beaconEvent.getCode());
            return EventResult.a.a(100);
        } else if (!beaconEvent.isSucceed() || (strategyModule = this.f753h) == null || strategyModule.b().b(beaconEvent.getCode())) {
            beaconEvent.setAppKey(d(beaconEvent.getAppKey()));
            EventBean b2 = this.f749d.get(0).b(beaconEvent);
            if (b2 == null) {
                return EventResult.a.a((int) EventResult.ERROR_PARAMS_LONG);
            }
            if (TextUtils.isEmpty(i.c()) && TextUtils.isEmpty(i.d())) {
                if (this.f750e.addAndGet(1) > 64) {
                    String format = String.format("qimei empty cache count over max , appKey: %s, event: %s", new Object[]{beaconEvent.getAppKey(), beaconEvent.getCode()});
                    com.tencent.beacon.base.util.c.a(format, new Object[0]);
                    if (this.f751f.compareAndSet(false, true)) {
                        g.e().a("510", format);
                    }
                } else {
                    com.tencent.beacon.base.util.c.a("qimei empty and add to cache , appKey: %s, event: %s", beaconEvent.getAppKey(), beaconEvent.getCode());
                    BeaconEvent build = BeaconEvent.newBuilder(beaconEvent).build();
                    HashMap hashMap = new HashMap();
                    hashMap.put("e_q_e_k", build);
                    com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(12, hashMap));
                }
            }
            int eventType = b2.getEventType();
            if (eventType == 2 || eventType == 3) {
                IBeaconImmediateReport immediateReport = BeaconReport.getInstance().getImmediateReport();
                com.tencent.beacon.base.util.e.a("immediateReport", immediateReport);
                if (immediateReport != null) {
                    return this.f754i.a(beaconEvent.getParams().get("A100"), b2);
                }
                com.tencent.beacon.base.util.c.a("immediateReport is null!", new Object[0]);
                g.e().a("515", "immediateReport is null!");
            }
            return this.f754i.b(beaconEvent.getParams().get("A100"), b2);
        } else {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s. is sampled by svr rate (false)", beaconEvent.getCode());
            return EventResult.a.a((int) EventResult.ERROR_CODE_SAMPLE);
        }
    }

    public Map<String, String> a(String str) {
        return a.get(d(str));
    }

    public void a() {
        this.f754i.b();
    }

    public void a(Context context) {
        h();
        this.f753h = (StrategyModule) BeaconModule.a.get(ModuleName.STRATEGY);
        e();
        f();
        g();
        e.a(context, this);
        this.f755j = true;
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        BeaconEvent beaconEvent;
        int i2 = cVar.a;
        if (i2 != 1) {
            if (i2 == 12) {
                Object obj = cVar.b.get("e_q_e_k");
                if (obj instanceof BeaconEvent) {
                    beaconEvent = (BeaconEvent) obj;
                    beaconEvent.getParams().put("A93", "Y");
                    com.tencent.beacon.base.util.c.a("qimei empty cache report , appKey: %s, event: %s", beaconEvent.getAppKey(), beaconEvent.getCode());
                } else {
                    return;
                }
            } else if (i2 == 3) {
                a((String) cVar.b.get("i_c_ak"), (Map<String, String>) (HashMap) cVar.b.get("i_c_ad"));
                return;
            } else if (i2 == 4) {
                b((String) cVar.b.get("i_c_ak"), (String) cVar.b.get("i_c_u_i"));
                return;
            } else if (i2 == 5) {
                a((String) cVar.b.get("i_c_ak"), (String) cVar.b.get("i_c_o_i"));
                return;
            } else if (i2 == 6) {
                Object obj2 = cVar.b.get("b_e");
                if (obj2 instanceof BeaconEvent) {
                    beaconEvent = (BeaconEvent) obj2;
                } else {
                    return;
                }
            } else if (i2 == 7) {
                this.f752g = ((Boolean) cVar.b.get("s_e_e")).booleanValue();
                return;
            } else {
                return;
            }
            a(beaconEvent);
            return;
        }
        com.tencent.beacon.a.a.b.a().a(12, this);
    }

    public void a(String str, String str2) {
        c.put(d(str), com.tencent.beacon.event.c.d.c(str2));
    }

    public void a(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null || map.isEmpty() || map.size() >= 50) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(map == null ? 0 : map.size());
            com.tencent.beacon.base.util.c.a("setAdditionalParams error , params.size: %s", objArr);
            return;
        }
        String d2 = d(str);
        Map<String, Map<String, String>> map2 = a;
        Map map3 = map2.get(d2);
        if (map3 != null) {
            if (map.size() + map3.size() >= 50) {
                com.tencent.beacon.base.util.c.a("setAdditionalParams error , params.size: can not more than 50", new Object[0]);
                return;
            }
            hashMap = new HashMap();
            hashMap.putAll(map3);
            hashMap.putAll(map);
        } else {
            hashMap = new HashMap(map);
        }
        map2.put(d2, hashMap);
    }

    public void a(boolean z) {
        h hVar = this.f754i;
        if (hVar != null) {
            hVar.a(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r3 = c.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = r2.d(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            java.util.Map<java.lang.String, java.lang.String> r0 = c
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.module.EventModule.b(java.lang.String):java.lang.String");
    }

    public void b() {
        this.f754i.c();
    }

    public void b(String str, String str2) {
        b.put(d(str), com.tencent.beacon.event.c.d.e(str2));
    }

    public void b(boolean z) {
        this.f752g = z;
    }

    public h c() {
        return this.f754i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r3 = b.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = r2.d(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "10000"
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            java.util.Map<java.lang.String, java.lang.String> r0 = b
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.module.EventModule.c(java.lang.String):java.lang.String");
    }

    public boolean d() {
        return this.f755j;
    }
}
