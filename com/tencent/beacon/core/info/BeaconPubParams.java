package com.tencent.beacon.core.info;

import android.content.Context;
import android.os.Build;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.net.b.d;
import com.tencent.raft.raftframework.sla.SLAConstant;

public class BeaconPubParams {
    private static BeaconPubParams sParamsHolder;
    private String androidId;
    private String appFirstInstallTime;
    private String appLastUpdatedTime;
    private String appVersion;
    private String beaconId;
    private String boundleId;
    private String brand;
    private String cid;
    private Context context;
    private String dpi;
    private String dtImei2;
    private String dtMeid;
    private String dtMf;
    private String fingerprint;
    private String gpu;
    private String hardwareOs;
    private String imei;
    private String imsi;
    private String isRooted;
    private String language;
    private String mac;
    private String model;
    private String modelApn;
    private String networkType;
    private String osVersion;
    private String platform;
    private String productId;
    private String qimei;
    private String resolution;
    private String sdkId;
    private String sdkVersion;
    private String wifiMac;
    private String wifiSsid;

    private BeaconPubParams(Context context2) {
        this.context = context2;
        init(context2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized com.tencent.beacon.core.info.BeaconPubParams getPubParams(android.content.Context r2) {
        /*
            java.lang.Class<com.tencent.beacon.core.info.BeaconPubParams> r0 = com.tencent.beacon.core.info.BeaconPubParams.class
            monitor-enter(r0)
            com.tencent.beacon.core.info.BeaconPubParams r1 = sParamsHolder     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x0021 }
            com.tencent.beacon.core.info.BeaconPubParams r1 = sParamsHolder     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            com.tencent.beacon.core.info.BeaconPubParams r1 = new com.tencent.beacon.core.info.BeaconPubParams     // Catch:{ all -> 0x0015 }
            r1.<init>(r2)     // Catch:{ all -> 0x0015 }
            sParamsHolder = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2     // Catch:{ all -> 0x0021 }
        L_0x0018:
            com.tencent.beacon.core.info.BeaconPubParams r2 = sParamsHolder     // Catch:{ all -> 0x0021 }
            r2.refresh()     // Catch:{ all -> 0x0021 }
            com.tencent.beacon.core.info.BeaconPubParams r2 = sParamsHolder     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)
            return r2
        L_0x0021:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.core.info.BeaconPubParams.getPubParams(android.content.Context):com.tencent.beacon.core.info.BeaconPubParams");
    }

    private void init(Context context2) {
        if (context2 != context2.getApplicationContext()) {
            context2 = context2.getApplicationContext();
        }
        c d2 = c.d();
        d2.a(context2);
        this.appVersion = b.a();
        this.boundleId = b.b();
        this.sdkId = d2.i();
        this.sdkVersion = d2.j();
        this.beaconId = i.g();
        this.appFirstInstallTime = b.a(context2);
        e l2 = e.l();
        this.appLastUpdatedTime = l2.a(context2);
        this.platform = String.valueOf(d2.h());
        this.dtMf = l2.o();
        this.osVersion = l2.s();
        this.hardwareOs = l2.f() + "_" + l2.e();
        this.brand = Build.BRAND;
        g e2 = g.e();
        this.model = e2.h();
        this.language = l2.n();
        this.resolution = l2.u();
        this.dpi = String.valueOf(l2.y());
        this.gpu = "";
        this.isRooted = l2.m() ? SLAConstant.TYPE_DEPRECATED_START : "0";
        this.fingerprint = l2.v();
        this.qimei = i.c();
        this.mac = e2.f();
        this.wifiMac = e2.j();
        this.wifiSsid = e2.k();
        this.cid = l2.p();
    }

    private void refresh() {
        e l2 = e.l();
        g e2 = g.e();
        this.networkType = l2.q();
        this.modelApn = d.c();
        this.imei = e2.b();
        this.dtImei2 = e2.c();
        this.dtMeid = e2.g();
        this.imsi = e2.d();
        this.androidId = e2.a();
        this.mac = e2.f();
        this.wifiMac = e2.j();
        this.wifiSsid = e2.k();
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public String getAppFirstInstallTime() {
        return this.appFirstInstallTime;
    }

    public String getAppLastUpdatedTime() {
        return this.appLastUpdatedTime;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBeaconId() {
        return this.beaconId;
    }

    public String getBoundleId() {
        return this.boundleId;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCid() {
        return this.cid;
    }

    public String getDpi() {
        return this.dpi;
    }

    public String getDtImei2() {
        return this.dtImei2;
    }

    public String getDtMeid() {
        return this.dtMeid;
    }

    public String getDtMf() {
        return this.dtMf;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHardwareOs() {
        return this.hardwareOs;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getIsRooted() {
        return this.isRooted;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMac() {
        return this.mac;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelApn() {
        return this.modelApn;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getQimei() {
        return this.qimei;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSdkId() {
        return this.sdkId;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getWifiMac() {
        return this.wifiMac;
    }

    public String getWifiSsid() {
        return this.wifiSsid;
    }

    public String toString() {
        return super.toString();
    }
}
