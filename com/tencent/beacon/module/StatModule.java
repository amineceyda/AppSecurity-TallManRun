package com.tencent.beacon.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.e.b;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import java.util.HashMap;
import java.util.Map;

public class StatModule implements BeaconModule, d {
    private Context a;
    private boolean b = true;
    private boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    private b f756d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f757e = 0;

    /* renamed from: com.tencent.beacon.module.StatModule$4  reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Map a;

        public void run() {
            BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_sensor").withParams(this.a).build());
        }
    }

    private void c() {
        ((Application) this.a).registerActivityLifecycleCallbacks(new com.tencent.beacon.d.a.d(this));
    }

    private void d() {
        a a2 = a.a();
        if (!com.tencent.beacon.base.util.b.d().equals(a2.getString("rqd_model", ""))) {
            com.tencent.beacon.a.b.a.a().a(50000, (Runnable) new Runnable() {
                public void run() {
                    e l2 = e.l();
                    g e2 = g.e();
                    BeaconEvent.Builder withParams = BeaconEvent.builder().withParams("A9", Build.BRAND).withParams("A10", e2.h()).withParams("A11", l2.g()).withParams("A12", l2.n()).withParams("A13", l2.z());
                    BeaconEvent.Builder withParams2 = withParams.withParams("A14", l2.w() + "m");
                    BeaconEvent.Builder withParams3 = withParams2.withParams("A15", l2.t() + "m").withParams("A16", l2.h()).withParams("A17", l2.u()).withParams("A18", "").withParams("A20", e2.j());
                    BeaconEvent.Builder withParams4 = withParams3.withParams("A30", l2.x() + "m").withParams("A19", l2.q());
                    StringBuilder i2 = g.a.a.a.a.i("");
                    i2.append(l2.y());
                    BeaconEvent.Builder withParams5 = withParams4.withParams("A52", i2.toString());
                    StringBuilder i3 = g.a.a.a.a.i("");
                    i3.append(l2.e());
                    i3.append("m");
                    BeaconEvent.Builder withParams6 = withParams5.withParams("A53", i3.toString());
                    StringBuilder i4 = g.a.a.a.a.i("");
                    i4.append(l2.r());
                    String str = "Y";
                    BeaconEvent.Builder withParams7 = withParams6.withParams("A54", i4.toString()).withParams("A55", l2.f()).withParams("A56", l2.D() ? str : "N").withParams("A57", l2.A());
                    if (!l2.m()) {
                        str = "N";
                    }
                    BeaconEvent.Builder withParams8 = withParams7.withParams("A58", str);
                    BeaconReport.getInstance().report(withParams8.withParams("A59", l2.k() + "m").withParams("A69", e2.k()).withParams("A82", l2.v()).withType(EventType.REALTIME).withCode("rqd_model").build());
                }
            });
            a.C0005a edit = a2.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString("rqd_model", com.tencent.beacon.base.util.b.d());
            }
        }
    }

    private void e() {
        if (this.f756d.g()) {
            if (com.tencent.beacon.base.util.b.d().equals(a.a().getString("LAUEVE_DENGTA", ""))) {
                c.d("[event] APP_LAUNCHED_EVENT has been uploaded!", new Object[0]);
                return;
            }
        }
        e l2 = e.l();
        HashMap hashMap = new HashMap();
        hashMap.put("A19", l2.q());
        String str = "Y";
        hashMap.put("A63", str);
        hashMap.put("A21", com.tencent.beacon.a.c.b.g() ? str : "N");
        hashMap.put("A45", com.tencent.beacon.a.c.b.e(this.a) ? str : "N");
        hashMap.put("A66", com.tencent.beacon.a.c.b.f(this.a) ? "F" : "B");
        hashMap.put("A68", "" + com.tencent.beacon.a.c.b.b(this.a));
        if (!com.tencent.beacon.a.c.b.f583d) {
            str = "N";
        }
        hashMap.put("A85", str);
        hashMap.put("A9", Build.BRAND);
        hashMap.put("A14", l2.w());
        g e2 = g.e();
        hashMap.put("A20", e2.j());
        hashMap.put("A69", e2.k());
        if (b(hashMap)) {
            a.C0005a edit = a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString("LAUEVE_DENGTA", com.tencent.beacon.base.util.b.d());
            }
        }
    }

    public void a() {
    }

    public void a(Context context) {
        this.a = context;
        if (!com.tencent.beacon.a.c.b.g(context)) {
            c.a("non-main process. do not report rqd event", new Object[0]);
            return;
        }
        b b2 = ((StrategyModule) BeaconModule.a.get(ModuleName.STRATEGY)).b();
        this.f756d = b2;
        this.c = b2.h();
        ((Application) this.a).registerActivityLifecycleCallbacks(new com.tencent.beacon.d.a.c(this));
        com.tencent.beacon.a.a.b.a().a(2, this);
        com.tencent.beacon.a.a.b.a().a(10, this);
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        int i2 = cVar.a;
        if (i2 == 2) {
            Map map = (Map) cVar.b.get("d_m");
            if (map != null) {
                this.b = com.tencent.beacon.base.util.b.a((String) map.get("modelEventUsable"), this.b);
                this.c = com.tencent.beacon.base.util.b.a((String) map.get("isPagePath"), this.c);
            }
        } else if (i2 == 10) {
            e();
            if (com.tencent.beacon.a.c.b.g(this.a)) {
                new com.tencent.beacon.d.c(this.a).a(this.f756d);
            }
            if (this.b) {
                d();
            }
            if (this.c) {
                c();
            }
        }
    }

    public void a(String str, long j2, long j3) {
        final long j4 = j3;
        final String str2 = str;
        final long j5 = j2;
        com.tencent.beacon.a.b.a.a().a((Runnable) new Runnable() {
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withParams("A110", String.valueOf(j4)).withParams("A111", str2).withParams("A112", String.valueOf(j5)).withCode("rqd_page_fgt").withType(EventType.REALTIME).build());
            }
        });
    }

    public void a(final Map<String, String> map) {
        com.tencent.beacon.a.b.a.a().a((Runnable) new Runnable() {
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_appresumed").withIsSucceed(true).withParams(map).withType(EventType.REALTIME).build());
            }
        });
    }

    public void b() {
    }

    public void b(String str, long j2, long j3) {
        final long j4 = j3;
        final String str2 = str;
        final long j5 = j2;
        com.tencent.beacon.a.b.a.a().a((Runnable) new Runnable() {
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withParams("A110", String.valueOf(j4)).withParams("A111", str2).withParams("A112", String.valueOf(j5)).withCode("rqd_page").withType(EventType.NORMAL).build());
                StatModule statModule = StatModule.this;
                long unused = statModule.f757e = statModule.f757e + j5;
                if (StatModule.this.f757e >= 15000) {
                    long unused2 = StatModule.this.f757e = 0;
                }
            }
        });
    }

    public boolean b(Map<String, String> map) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_applaunched").withParams(map).withType(EventType.REALTIME).build()).isSuccess();
    }

    public boolean c(Map<String, String> map) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withParams(map).withCode("rqd_heartbeat").withType(EventType.REALTIME).build()).isSuccess();
    }
}
