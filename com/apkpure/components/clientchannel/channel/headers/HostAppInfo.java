package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;

public final class HostAppInfo {
    private String buildNo;
    private String channel;
    private String md5;
    private String pkgName;
    private final String sdkVer;
    private int versionCode;
    private String versionName;

    public HostAppInfo() {
        this((String) null, (String) null, 0, (String) null, (String) null, (String) null, 63, (f) null);
    }

    public HostAppInfo(String str, String str2, int i2, String str3, String str4, String str5) {
        h.e(str, "pkgName");
        h.e(str2, "versionName");
        h.e(str3, "md5");
        h.e(str4, "buildNo");
        h.e(str5, "channel");
        this.pkgName = str;
        this.versionName = str2;
        this.versionCode = i2;
        this.md5 = str3;
        this.buildNo = str4;
        this.channel = str5;
        this.sdkVer = "1.0.17";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HostAppInfo(java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, i.o.c.f r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x0008
            r13 = r0
            goto L_0x0009
        L_0x0008:
            r13 = r6
        L_0x0009:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0017
            r8 = 0
            r2 = 0
            goto L_0x0018
        L_0x0017:
            r2 = r8
        L_0x0018:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001e
            r3 = r0
            goto L_0x001f
        L_0x001e:
            r3 = r9
        L_0x001f:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0025
            java.lang.String r10 = "0"
        L_0x0025:
            r4 = r10
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002c
            r12 = r0
            goto L_0x002d
        L_0x002c:
            r12 = r11
        L_0x002d:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.HostAppInfo.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, i.o.c.f):void");
    }

    public static /* synthetic */ HostAppInfo copy$default(HostAppInfo hostAppInfo, String str, String str2, int i2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hostAppInfo.pkgName;
        }
        if ((i3 & 2) != 0) {
            str2 = hostAppInfo.versionName;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            i2 = hostAppInfo.versionCode;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str3 = hostAppInfo.md5;
        }
        String str7 = str3;
        if ((i3 & 16) != 0) {
            str4 = hostAppInfo.buildNo;
        }
        String str8 = str4;
        if ((i3 & 32) != 0) {
            str5 = hostAppInfo.channel;
        }
        return hostAppInfo.copy(str, str6, i4, str7, str8, str5);
    }

    public final String component1() {
        return this.pkgName;
    }

    public final String component2() {
        return this.versionName;
    }

    public final int component3() {
        return this.versionCode;
    }

    public final String component4() {
        return this.md5;
    }

    public final String component5() {
        return this.buildNo;
    }

    public final String component6() {
        return this.channel;
    }

    public final HostAppInfo copy(String str, String str2, int i2, String str3, String str4, String str5) {
        h.e(str, "pkgName");
        h.e(str2, "versionName");
        h.e(str3, "md5");
        h.e(str4, "buildNo");
        h.e(str5, "channel");
        return new HostAppInfo(str, str2, i2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAppInfo)) {
            return false;
        }
        HostAppInfo hostAppInfo = (HostAppInfo) obj;
        return h.a(this.pkgName, hostAppInfo.pkgName) && h.a(this.versionName, hostAppInfo.versionName) && this.versionCode == hostAppInfo.versionCode && h.a(this.md5, hostAppInfo.md5) && h.a(this.buildNo, hostAppInfo.buildNo) && h.a(this.channel, hostAppInfo.channel);
    }

    public final String getBuildNo() {
        return this.buildNo;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getPkgName() {
        return this.pkgName;
    }

    public final String getSdkVer() {
        return this.sdkVer;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        String str = this.versionName;
        return this.channel.hashCode() + a.a(this.buildNo, a.a(this.md5, (a.a(str, this.pkgName.hashCode() * 31, 31) + this.versionCode) * 31, 31), 31);
    }

    public final void setBuildNo(String str) {
        h.e(str, "<set-?>");
        this.buildNo = str;
    }

    public final void setChannel(String str) {
        h.e(str, "<set-?>");
        this.channel = str;
    }

    public final void setMd5(String str) {
        h.e(str, "<set-?>");
        this.md5 = str;
    }

    public final void setPkgName(String str) {
        h.e(str, "<set-?>");
        this.pkgName = str;
    }

    public final void setVersionCode(int i2) {
        this.versionCode = i2;
    }

    public final void setVersionName(String str) {
        h.e(str, "<set-?>");
        this.versionName = str;
    }

    public String toString() {
        StringBuilder i2 = a.i("HostAppInfo(pkgName=");
        i2.append(this.pkgName);
        i2.append(", versionName=");
        i2.append(this.versionName);
        i2.append(", versionCode=");
        i2.append(this.versionCode);
        i2.append(", md5=");
        i2.append(this.md5);
        i2.append(", buildNo=");
        i2.append(this.buildNo);
        i2.append(", channel=");
        i2.append(this.channel);
        i2.append(')');
        return i2.toString();
    }
}
