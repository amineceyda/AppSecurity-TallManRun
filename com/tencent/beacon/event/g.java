package com.tencent.beacon.event;

import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.b.f;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.e.b;
import com.tencent.beacon.event.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g implements Runnable, d {
    private final String a;
    private final int b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Long> f708d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Set<Long> f709e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final List<Long> f710f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final String f711g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f712h;

    /* renamed from: i  reason: collision with root package name */
    private int f713i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f714j;

    /* renamed from: k  reason: collision with root package name */
    private String f715k;

    public g(int i2, a aVar, boolean z) {
        this.b = i2;
        this.c = aVar;
        this.f712h = z;
        String str = z ? "t_r_e" : "t_n_e";
        this.a = str;
        b a2 = b.a();
        this.f713i = z ? a2.d() : a2.c();
        this.f711g = g.a.a.a.a.c("[EventReport (", str, ")]");
    }

    private void a(List<EventBean> list, Set<Long> set) {
        JceRequestEntity a2 = com.tencent.beacon.event.c.d.a(list, this.f712h);
        c.a(this.f711g, 2, "event request entity: %s", a2.toString());
        com.tencent.beacon.base.net.c.c().b(a2).a((Callback<byte[]>) new f(this, this.a, this.c, set, this.f715k));
    }

    private List<EventBean> b() {
        StringBuilder sb = new StringBuilder();
        for (Long append : this.f708d) {
            sb.append(append);
            sb.append(",");
        }
        return this.c.a(this.a, sb.length() > 0 ? sb.substring(0, sb.lastIndexOf(",")) : "", this.f713i);
    }

    private void c() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    public int a() {
        return this.f713i;
    }

    public void a(long j2) {
        synchronized (this.f710f) {
            this.f710f.add(Long.valueOf(j2));
            if (this.f710f.size() >= 10) {
                long j3 = 0;
                for (Long longValue : this.f710f) {
                    j3 += longValue.longValue();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j3 / ((long) this.f710f.size()));
                sb.append("");
                f.e().a("703", sb.toString());
                this.f710f.clear();
            }
        }
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        Map map;
        if (cVar.a == 2 && (map = (Map) cVar.b.get("d_m")) != null) {
            this.f713i = com.tencent.beacon.base.util.b.a((String) map.get(this.f712h ? "realtimeUploadNum" : "normalUploadNum"), this.f713i, 24, 100);
        }
    }

    public void a(Set<Long> set) {
        synchronized (this.f708d) {
            this.f708d.removeAll(set);
            set.clear();
        }
    }

    public void run() {
        if (!this.f714j) {
            c();
            this.f714j = true;
        }
        if (!com.tencent.beacon.base.net.b.d.d() || com.tencent.beacon.base.net.c.c().d()) {
            com.tencent.beacon.a.b.a.a().a(this.b, false);
            return;
        }
        synchronized (this.f708d) {
            c.a(this.f711g, 0, "start read EventBean from DB.", new Object[0]);
            List<EventBean> b2 = b();
            if (b2 != null) {
                if (!b2.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (EventBean next : b2) {
                        long cid = next.getCid();
                        this.f708d.add(Long.valueOf(cid));
                        this.f709e.add(Long.valueOf(cid));
                        Map<String, String> eventValue = next.getEventValue();
                        if (eventValue != null) {
                            String appKey = next.getAppKey();
                            String str = (String) hashMap.get(appKey);
                            if (str == null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(appKey);
                                sb.append(": ");
                                str = sb.toString();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(eventValue.get("A100"));
                            sb2.append(", ");
                            hashMap.put(appKey, sb2.toString());
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("--logID: \n");
                    for (Map.Entry value : hashMap.entrySet()) {
                        sb3.append((String) value.getValue());
                        sb3.append("\n");
                    }
                    String sb4 = sb3.toString();
                    this.f715k = sb4;
                    c.a(this.f711g, 1, "send LogID: %s", sb4);
                    a(b2, this.f709e);
                    b2.clear();
                    this.f709e.clear();
                    return;
                }
            }
            c.a(this.f711g, 1, "EventBean List == null. Task end!", new Object[0]);
            com.tencent.beacon.a.b.a.a().a(this.b, false);
        }
    }
}
