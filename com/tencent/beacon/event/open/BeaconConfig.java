package com.tencent.beacon.event.open;

import com.tencent.beacon.a.b.a;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import java.util.concurrent.ScheduledExecutorService;
import org.slf4j.helpers.MessageFormatter;

public class BeaconConfig {
    private final int a;
    private final boolean b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f720d;

    /* renamed from: e  reason: collision with root package name */
    private final long f721e;

    /* renamed from: f  reason: collision with root package name */
    private final long f722f;

    /* renamed from: g  reason: collision with root package name */
    private final int f723g;

    /* renamed from: h  reason: collision with root package name */
    private final int f724h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f725i;

    /* renamed from: j  reason: collision with root package name */
    private final AbstractNetAdapter f726j;

    /* renamed from: k  reason: collision with root package name */
    private final String f727k;

    /* renamed from: l  reason: collision with root package name */
    private final String f728l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f729m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final String x;
    private final String y;
    private final boolean z;

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean A = true;
        /* access modifiers changed from: private */
        public int a = AbstractNetAdapter.READ_TIMEOUT;
        /* access modifiers changed from: private */
        public boolean b = true;
        /* access modifiers changed from: private */
        public boolean c = true;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f730d = true;

        /* renamed from: e  reason: collision with root package name */
        private ScheduledExecutorService f731e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f732f = true;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public AbstractNetAdapter f733g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public long f734h = 2000;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public long f735i = 5000;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f736j = 48;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f737k = 48;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public String f738l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public String f739m;
        /* access modifiers changed from: private */
        public boolean n = false;
        /* access modifiers changed from: private */
        public boolean o = true;
        /* access modifiers changed from: private */
        public boolean p = true;
        /* access modifiers changed from: private */
        public String q = "";
        /* access modifiers changed from: private */
        public String r = "";
        /* access modifiers changed from: private */
        public String s = "";
        /* access modifiers changed from: private */
        public String t = "";
        /* access modifiers changed from: private */
        public String u = "";
        /* access modifiers changed from: private */
        public String v = "";
        /* access modifiers changed from: private */
        public String w = "";
        /* access modifiers changed from: private */
        public String x = "";
        /* access modifiers changed from: private */
        public String y = "";
        /* access modifiers changed from: private */
        public String z = "";

        public Builder auditEnable(boolean z2) {
            this.c = z2;
            return this;
        }

        public Builder bidEnable(boolean z2) {
            this.f730d = z2;
            return this;
        }

        public BeaconConfig build() {
            ScheduledExecutorService scheduledExecutorService = this.f731e;
            if (scheduledExecutorService != null) {
                a.a(scheduledExecutorService);
            }
            return new BeaconConfig(this);
        }

        public Builder eventReportEnable(boolean z2) {
            this.b = z2;
            return this;
        }

        public Builder maxDBCount(int i2) {
            this.a = i2;
            return this;
        }

        public Builder pagePathEnable(boolean z2) {
            this.p = z2;
            return this;
        }

        public Builder qmspEnable(boolean z2) {
            this.o = z2;
            return this;
        }

        public Builder setAndroidID(String str) {
            this.q = str;
            return this;
        }

        public Builder setConfigHost(String str) {
            this.f739m = str;
            return this;
        }

        public Builder setExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.f731e = scheduledExecutorService;
            return this;
        }

        public Builder setForceEnableAtta(boolean z2) {
            this.n = z2;
            return this;
        }

        public Builder setHttpAdapter(AbstractNetAdapter abstractNetAdapter) {
            this.f733g = abstractNetAdapter;
            return this;
        }

        public Builder setImei(String str) {
            this.r = str;
            return this;
        }

        public Builder setImei2(String str) {
            this.s = str;
            return this;
        }

        public Builder setImsi(String str) {
            this.t = str;
            return this;
        }

        public Builder setIsSocketMode(boolean z2) {
            this.f732f = z2;
            return this;
        }

        public Builder setMac(String str) {
            this.w = str;
            return this;
        }

        public Builder setMeid(String str) {
            this.u = str;
            return this;
        }

        public Builder setModel(String str) {
            this.v = str;
            return this;
        }

        public Builder setNeedInitQimei(boolean z2) {
            this.A = z2;
            return this;
        }

        public Builder setNormalPollingTime(long j2) {
            this.f735i = j2;
            return this;
        }

        public Builder setNormalUploadNum(int i2) {
            this.f737k = i2;
            return this;
        }

        public Builder setOaid(String str) {
            this.z = str;
            return this;
        }

        public Builder setRealtimePollingTime(long j2) {
            this.f734h = j2;
            return this;
        }

        public Builder setRealtimeUploadNum(int i2) {
            this.f736j = i2;
            return this;
        }

        public Builder setUploadHost(String str) {
            this.f738l = str;
            return this;
        }

        public Builder setWifiMacAddress(String str) {
            this.x = str;
            return this;
        }

        public Builder setWifiSSID(String str) {
            this.y = str;
            return this;
        }
    }

    public BeaconConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.f720d = builder.f730d;
        this.f721e = builder.f734h;
        this.f722f = builder.f735i;
        this.f723g = builder.f736j;
        this.f724h = builder.f737k;
        this.f725i = builder.f732f;
        this.f726j = builder.f733g;
        this.f727k = builder.f738l;
        this.f728l = builder.f739m;
        this.f729m = builder.n;
        this.n = builder.o;
        this.o = builder.p;
        this.p = builder.q;
        this.q = builder.r;
        this.r = builder.s;
        this.s = builder.t;
        this.t = builder.u;
        this.u = builder.v;
        this.v = builder.w;
        this.w = builder.x;
        this.x = builder.y;
        this.y = builder.z;
        this.z = builder.A;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAndroidID() {
        return this.p;
    }

    public String getConfigHost() {
        return this.f728l;
    }

    public AbstractNetAdapter getHttpAdapter() {
        return this.f726j;
    }

    public String getImei() {
        return this.q;
    }

    public String getImei2() {
        return this.r;
    }

    public String getImsi() {
        return this.s;
    }

    public String getMac() {
        return this.v;
    }

    public int getMaxDBCount() {
        return this.a;
    }

    public String getMeid() {
        return this.t;
    }

    public String getModel() {
        return this.u;
    }

    public long getNormalPollingTIme() {
        return this.f722f;
    }

    public int getNormalUploadNum() {
        return this.f724h;
    }

    public String getOaid() {
        return this.y;
    }

    public long getRealtimePollingTime() {
        return this.f721e;
    }

    public int getRealtimeUploadNum() {
        return this.f723g;
    }

    public String getUploadHost() {
        return this.f727k;
    }

    public String getWifiMacAddress() {
        return this.w;
    }

    public String getWifiSSID() {
        return this.x;
    }

    public boolean isAuditEnable() {
        return this.c;
    }

    public boolean isBidEnable() {
        return this.f720d;
    }

    public boolean isEnableQmsp() {
        return this.n;
    }

    public boolean isEventReportEnable() {
        return this.b;
    }

    public boolean isForceEnableAtta() {
        return this.f729m;
    }

    public boolean isNeedInitQimei() {
        return this.z;
    }

    public boolean isPagePathEnable() {
        return this.o;
    }

    public boolean isSocketMode() {
        return this.f725i;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("BeaconConfig{maxDBCount=");
        i2.append(this.a);
        i2.append(", eventReportEnable=");
        i2.append(this.b);
        i2.append(", auditEnable=");
        i2.append(this.c);
        i2.append(", bidEnable=");
        i2.append(this.f720d);
        i2.append(", realtimePollingTime=");
        i2.append(this.f721e);
        i2.append(", normalPollingTIme=");
        i2.append(this.f722f);
        i2.append(", normalUploadNum=");
        i2.append(this.f724h);
        i2.append(", realtimeUploadNum=");
        i2.append(this.f723g);
        i2.append(", httpAdapter=");
        i2.append(this.f726j);
        i2.append(", uploadHost='");
        g.a.a.a.a.p(i2, this.f727k, '\'', ", configHost='");
        g.a.a.a.a.p(i2, this.f728l, '\'', ", forceEnableAtta=");
        i2.append(this.f729m);
        i2.append(", enableQmsp=");
        i2.append(this.n);
        i2.append(", pagePathEnable=");
        i2.append(this.o);
        i2.append(", androidID='");
        g.a.a.a.a.p(i2, this.p, '\'', ", imei='");
        g.a.a.a.a.p(i2, this.q, '\'', ", imei2='");
        g.a.a.a.a.p(i2, this.r, '\'', ", imsi='");
        g.a.a.a.a.p(i2, this.s, '\'', ", meid='");
        g.a.a.a.a.p(i2, this.t, '\'', ", model='");
        g.a.a.a.a.p(i2, this.u, '\'', ", mac='");
        g.a.a.a.a.p(i2, this.v, '\'', ", wifiMacAddress='");
        g.a.a.a.a.p(i2, this.w, '\'', ", wifiSSID='");
        g.a.a.a.a.p(i2, this.x, '\'', ", oaid='");
        g.a.a.a.a.p(i2, this.y, '\'', ", needInitQ='");
        i2.append(this.z);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
