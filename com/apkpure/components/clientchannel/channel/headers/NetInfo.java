package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;

public final class NetInfo {
    private Integer carrierCode;
    private String ipv4;
    private String ipv6;
    private Integer netType;
    private String wifiBssid;
    private String wifiSsid;

    public NetInfo() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 63, (f) null);
    }

    public NetInfo(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.netType = num;
        this.ipv4 = str;
        this.ipv6 = str2;
        this.wifiSsid = str3;
        this.wifiBssid = str4;
        this.carrierCode = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NetInfo(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, int r12, i.o.c.f r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r13 == 0) goto L_0x000b
            r13 = r0
            goto L_0x000c
        L_0x000b:
            r13 = r6
        L_0x000c:
            r6 = r12 & 2
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0014
            r2 = r1
            goto L_0x0015
        L_0x0014:
            r2 = r7
        L_0x0015:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x001b
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r3 = r8
        L_0x001c:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0022
            r4 = r1
            goto L_0x0023
        L_0x0022:
            r4 = r9
        L_0x0023:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r10
        L_0x0029:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002f
            r12 = r0
            goto L_0x0030
        L_0x002f:
            r12 = r11
        L_0x0030:
            r6 = r5
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            r11 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.NetInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, i.o.c.f):void");
    }

    public static /* synthetic */ NetInfo copy$default(NetInfo netInfo, Integer num, String str, String str2, String str3, String str4, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = netInfo.netType;
        }
        if ((i2 & 2) != 0) {
            str = netInfo.ipv4;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = netInfo.ipv6;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = netInfo.wifiSsid;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = netInfo.wifiBssid;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            num2 = netInfo.carrierCode;
        }
        return netInfo.copy(num, str5, str6, str7, str8, num2);
    }

    public final Integer component1() {
        return this.netType;
    }

    public final String component2() {
        return this.ipv4;
    }

    public final String component3() {
        return this.ipv6;
    }

    public final String component4() {
        return this.wifiSsid;
    }

    public final String component5() {
        return this.wifiBssid;
    }

    public final Integer component6() {
        return this.carrierCode;
    }

    public final NetInfo copy(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        return new NetInfo(num, str, str2, str3, str4, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetInfo)) {
            return false;
        }
        NetInfo netInfo = (NetInfo) obj;
        return h.a(this.netType, netInfo.netType) && h.a(this.ipv4, netInfo.ipv4) && h.a(this.ipv6, netInfo.ipv6) && h.a(this.wifiSsid, netInfo.wifiSsid) && h.a(this.wifiBssid, netInfo.wifiBssid) && h.a(this.carrierCode, netInfo.carrierCode);
    }

    public final Integer getCarrierCode() {
        return this.carrierCode;
    }

    public final String getIpv4() {
        return this.ipv4;
    }

    public final String getIpv6() {
        return this.ipv6;
    }

    public final Integer getNetType() {
        return this.netType;
    }

    public final String getWifiBssid() {
        return this.wifiBssid;
    }

    public final String getWifiSsid() {
        return this.wifiSsid;
    }

    public int hashCode() {
        Integer num = this.netType;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ipv4;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ipv6;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wifiSsid;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wifiBssid;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.carrierCode;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final void setCarrierCode(Integer num) {
        this.carrierCode = num;
    }

    public final void setIpv4(String str) {
        this.ipv4 = str;
    }

    public final void setIpv6(String str) {
        this.ipv6 = str;
    }

    public final void setNetType(Integer num) {
        this.netType = num;
    }

    public final void setWifiBssid(String str) {
        this.wifiBssid = str;
    }

    public final void setWifiSsid(String str) {
        this.wifiSsid = str;
    }

    public String toString() {
        StringBuilder i2 = a.i("NetInfo(netType=");
        i2.append(this.netType);
        i2.append(", ipv4=");
        i2.append(this.ipv4);
        i2.append(", ipv6=");
        i2.append(this.ipv6);
        i2.append(", wifiSsid=");
        i2.append(this.wifiSsid);
        i2.append(", wifiBssid=");
        i2.append(this.wifiBssid);
        i2.append(", carrierCode=");
        i2.append(this.carrierCode);
        i2.append(')');
        return i2.toString();
    }
}
