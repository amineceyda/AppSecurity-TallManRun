package com.tencent.beacon.event.open;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.h;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.net.b.b;
import com.tencent.beacon.base.util.BeaconLogger;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.c.d;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

public final class BeaconReport {
    private static volatile BeaconReport a = null;
    private static String b = "";
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f744d;

    /* renamed from: e  reason: collision with root package name */
    private IBeaconImmediateReport f745e;

    private BeaconReport() {
    }

    /* access modifiers changed from: private */
    public void a() {
        ModuleName[] values = ModuleName.values();
        for (int i2 = 0; i2 < 5; i2++) {
            ModuleName moduleName = values[i2];
            try {
                BeaconModule.a.put(moduleName, d.f(moduleName.getClassName()));
            } catch (Exception e2) {
                StringBuilder i3 = a.i("init Module error: ");
                i3.append(e2.getMessage());
                c.b(i3.toString(), new Object[0]);
                c.a((Throwable) e2);
            }
        }
        for (ModuleName moduleName2 : values) {
            BeaconModule beaconModule = BeaconModule.a.get(moduleName2);
            if (beaconModule != null) {
                beaconModule.a(this.c);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            c.a("BeaconReport", beaconConfig.toString(), new Object[0]);
            b.a(beaconConfig.getConfigHost(), beaconConfig.getUploadHost());
            b(beaconConfig);
            com.tencent.beacon.a.c.c.d().a(beaconConfig.isEnableQmsp());
            com.tencent.beacon.e.b.a().b(beaconConfig.getRealtimeUploadNum());
            com.tencent.beacon.e.b.a().a(beaconConfig.getNormalUploadNum());
        }
        com.tencent.beacon.base.net.c.c().a(this.c, beaconConfig == null ? null : beaconConfig.getHttpAdapter());
        com.tencent.beacon.a.d.a.a().a(this.c);
        com.tencent.beacon.a.c.b.f();
        e.l().C();
    }

    private void b(BeaconConfig beaconConfig) {
        HashMap hashMap = new HashMap();
        hashMap.put("s_e_e", Boolean.valueOf(beaconConfig.isEventReportEnable()));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(7, hashMap));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("u_c_r_p", Long.valueOf(beaconConfig.getRealtimePollingTime()));
        hashMap2.put("u_c_n_p", Long.valueOf(beaconConfig.getNormalPollingTIme()));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(11, hashMap2));
    }

    private void c(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("u_c_a_e", Boolean.valueOf(beaconConfig.isAuditEnable()));
                hashMap.put("u_c_b_e", Boolean.valueOf(beaconConfig.isBidEnable()));
                hashMap.put("u_c_d_s", Integer.valueOf(beaconConfig.getMaxDBCount()));
                hashMap.put("u_c_p_s", Boolean.valueOf(beaconConfig.isPagePathEnable()));
                hashMap.put("u_s_o_h", Boolean.valueOf(beaconConfig.isSocketMode()));
                com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(8, hashMap));
            } catch (Throwable th) {
                g e2 = g.e();
                StringBuilder i2 = a.i("sdk init error! package name: ");
                i2.append(com.tencent.beacon.a.c.b.b());
                i2.append(" , msg:");
                i2.append(th.getMessage());
                e2.a("202", i2.toString(), th);
                c.a(th);
            }
        }
    }

    private void d(BeaconConfig beaconConfig) {
        com.tencent.beacon.a.c.g e2 = com.tencent.beacon.a.c.g.e();
        if (!TextUtils.isEmpty(beaconConfig.getAndroidID())) {
            e2.a(beaconConfig.getAndroidID());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei())) {
            e2.b(beaconConfig.getImei());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei2())) {
            e2.c(beaconConfig.getImei2());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImsi())) {
            e2.d(beaconConfig.getImsi());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMeid())) {
            e2.f(beaconConfig.getMeid());
        }
        if (!TextUtils.isEmpty(beaconConfig.getModel())) {
            e2.g(beaconConfig.getModel());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMac())) {
            e2.e(beaconConfig.getMac());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiMacAddress())) {
            e2.i(beaconConfig.getWifiMacAddress());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiSSID())) {
            e2.j(beaconConfig.getWifiSSID());
        }
        if (!TextUtils.isEmpty(beaconConfig.getOaid())) {
            e2.h(beaconConfig.getOaid());
        }
    }

    public static BeaconReport getInstance() {
        if (a == null) {
            synchronized (BeaconReport.class) {
                if (a == null) {
                    a = new BeaconReport();
                }
            }
        }
        return a;
    }

    public static String getSoPath() {
        return b;
    }

    public static void setSoPath(String str) {
        b = str;
    }

    public BeaconPubParams getCommonParams(Context context) {
        if (context == null) {
            return null;
        }
        return BeaconPubParams.getPubParams(context);
    }

    public IBeaconImmediateReport getImmediateReport() {
        return this.f745e;
    }

    @Deprecated
    public String getOAID() {
        c.b("this method do not collect OAID, use method in qmsp instead", new Object[0]);
        return com.tencent.beacon.a.c.g.e().i();
    }

    @Deprecated
    public h getQimei() {
        return i.b();
    }

    public h getQimei(String str) {
        return i.a(str);
    }

    @Deprecated
    public void getQimei(f fVar) throws NullPointerException {
        i.a(fVar);
    }

    public void getQimei(String str, Context context, f fVar) {
        i.a(str, context, fVar);
    }

    @Deprecated
    public h getRtQimei(Context context) {
        return i.a(context);
    }

    public h getRtQimei(Context context, String str) {
        return i.a(context, str);
    }

    public String getSDKVersion() {
        return "4.2.80.2-oversea";
    }

    public EventResult report(BeaconEvent beaconEvent) {
        try {
            if (TextUtils.isEmpty(beaconEvent.getCode())) {
                return EventResult.a.a((int) EventResult.ERROR_CODE_NAME_NULL);
            }
            BeaconEvent build = BeaconEvent.newBuilder(beaconEvent).build();
            EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
            if (eventModule != null && eventModule.d()) {
                return eventModule.a(build);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("b_e", build);
            com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(6, hashMap));
            return new EventResult(0, -1, "Beacon SDK not init beaconEvent add to cache!");
        } catch (Throwable th) {
            c.a(th);
            g.e().a("598", "error while report", th);
            return new EventResult(EventResult.ERROR_CODE_OTHER, -1, "REPORT ERROR");
        }
    }

    public void resumeReport() {
        c.a("BeaconReport", "resume report by user.", new Object[0]);
        com.tencent.beacon.a.b.a.a().b(true);
        com.tencent.beacon.a.b.a.a().d();
        com.tencent.beacon.base.net.c.c().e();
    }

    public void setAdditionalParams(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("i_c_ad", new HashMap(map));
        hashMap.put("i_c_ak", str);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(3, hashMap));
    }

    @Deprecated
    public void setAdditionalParams(Map<String, String> map) {
        setAdditionalParams(com.tencent.beacon.a.c.c.d().f(), map);
    }

    public void setAndroidID(String str) {
        com.tencent.beacon.a.c.g.e().a(str);
    }

    public void setAppVersion(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.tencent.beacon.a.c.b.a = str;
        }
    }

    public void setChannelID(String str) {
        com.tencent.beacon.a.c.c.d().a(str);
    }

    @Deprecated
    public void setCollectAndroidID(boolean z) {
        c.b("setCollectAndroidID has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectImei(boolean z) {
        c.b("setCollectImei has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectMac(boolean z) {
        c.b("setCollectMac has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectModel(boolean z) {
        c.b("setCollectModel has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectOAID(boolean z) {
        c.b("setCollectOAID has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectPersonalInfo(boolean z) {
        c.b("setCollectPersonalInfo has been Deprecated", new Object[0]);
    }

    public void setCollectProcessInfo(boolean z) {
        com.tencent.beacon.e.b.a().a(z);
    }

    public void setImei(String str) {
        com.tencent.beacon.a.c.g.e().b(str);
    }

    public void setImei2(String str) {
        com.tencent.beacon.a.c.g.e().c(str);
    }

    public void setImmediateReport(IBeaconImmediateReport iBeaconImmediateReport) {
        this.f745e = iBeaconImmediateReport;
    }

    public void setImsi(String str) {
        com.tencent.beacon.a.c.g.e().d(str);
    }

    public void setLogAble(boolean z) {
        c.a(z);
    }

    public void setLogger(BeaconLogger beaconLogger) {
        c.a(beaconLogger);
    }

    public void setMac(String str) {
        com.tencent.beacon.a.c.g.e().e(str);
    }

    public void setMeid(String str) {
        com.tencent.beacon.a.c.g.e().f(str);
    }

    public void setModel(String str) {
        com.tencent.beacon.a.c.g.e().g(str);
    }

    public void setOAID(String str) {
        com.tencent.beacon.a.c.g.e().h(str);
    }

    @Deprecated
    public void setOaid(String str) {
        com.tencent.beacon.a.c.g.e().h(str);
        c.b("setOaid has been Deprecated, please use setOAID", new Object[0]);
    }

    public void setOmgID(String str) {
        com.tencent.beacon.a.c.c.d().e(str);
    }

    public void setOpenID(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("i_c_ak", str);
        hashMap.put("i_c_o_i", str2);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(5, hashMap));
    }

    public void setQQ(String str) {
        com.tencent.beacon.a.c.b.a(str);
    }

    public void setQimei(String str, String str2) {
        i.a(str, str2);
    }

    public void setQimeiSdkVersion(String str) {
        i.b(str);
    }

    public void setStrictMode(boolean z) {
        com.tencent.beacon.base.util.e.a.set(z);
    }

    @Deprecated
    public void setUserID(String str) {
        setUserID(com.tencent.beacon.a.c.c.d().f(), str);
    }

    public void setUserID(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("i_c_ak", str);
        hashMap.put("i_c_u_i", str2);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(4, hashMap));
    }

    public void setWifiMacAddress(String str) {
        com.tencent.beacon.a.c.g.e().i(str);
    }

    public void setWifiSSID(String str) {
        com.tencent.beacon.a.c.g.e().j(str);
    }

    public synchronized void start(Context context, String str, BeaconConfig beaconConfig) {
        if (!this.f744d) {
            Log.i("beacon", "logAble: " + c.a() + " , SDKVersion: " + getSDKVersion());
            com.tencent.beacon.base.util.e.a("Context", context);
            boolean z = false;
            if (context == null) {
                c.b("fail to start beacon, context is null", new Object[0]);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.c = applicationContext;
            com.tencent.beacon.base.util.e.a("ApplicationContext", applicationContext);
            if (this.c == null) {
                c.b("fail to start beacon, application context is null", new Object[0]);
                return;
            }
            com.tencent.beacon.a.c.c.d().a(this.c);
            com.tencent.beacon.base.util.e.a("AppKey", str);
            if (TextUtils.isEmpty(str)) {
                c.b("fail to start beacon, appkey is empty", new Object[0]);
                return;
            }
            com.tencent.beacon.a.c.c.d().d(str);
            g.e().a(beaconConfig != null && beaconConfig.isForceEnableAtta());
            com.tencent.beacon.a.b.f e2 = com.tencent.beacon.a.b.f.e();
            if (beaconConfig != null && beaconConfig.isForceEnableAtta()) {
                z = true;
            }
            e2.a(z);
            ((Application) this.c).registerActivityLifecycleCallbacks(new com.tencent.beacon.b.a());
            c(beaconConfig);
            if (beaconConfig != null) {
                d(beaconConfig);
                i.a(beaconConfig.isNeedInitQimei());
            }
            com.tencent.beacon.a.b.a.a().a((Runnable) new b(this, beaconConfig));
            this.f744d = true;
        }
    }

    public void stopReport(boolean z) {
        c.a("BeaconReport", "stop report by user.", new Object[0]);
        com.tencent.beacon.a.b.a.a().b(false);
        com.tencent.beacon.a.b.a.a().a(z);
        com.tencent.beacon.base.net.c.c().close();
    }
}
