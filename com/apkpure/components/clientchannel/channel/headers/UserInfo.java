package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;

public final class UserInfo {
    private String authKey;
    private String country;
    private String countryCode;
    private String guid;
    private String language;
    private String qimei;
    private String qimeiToken;
    private String userId;
    private String uuid;

    public UserInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (f) null);
    }

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        h.e(str, "qimei");
        h.e(str2, "guid");
        h.e(str3, "uuid");
        h.e(str4, "userId");
        h.e(str5, "qimeiToken");
        h.e(str6, "authKey");
        h.e(str7, "language");
        h.e(str8, "country");
        h.e(str9, "countryCode");
        this.qimei = str;
        this.guid = str2;
        this.uuid = str3;
        this.userId = str4;
        this.qimeiToken = str5;
        this.authKey = str6;
        this.language = str7;
        this.country = str8;
        this.countryCode = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserInfo(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, i.o.c.f r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r16
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r17
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r18
        L_0x003f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r19
        L_0x0046:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.UserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, i.o.c.f):void");
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, Object obj) {
        UserInfo userInfo2 = userInfo;
        int i3 = i2;
        return userInfo.copy((i3 & 1) != 0 ? userInfo2.qimei : str, (i3 & 2) != 0 ? userInfo2.guid : str2, (i3 & 4) != 0 ? userInfo2.uuid : str3, (i3 & 8) != 0 ? userInfo2.userId : str4, (i3 & 16) != 0 ? userInfo2.qimeiToken : str5, (i3 & 32) != 0 ? userInfo2.authKey : str6, (i3 & 64) != 0 ? userInfo2.language : str7, (i3 & 128) != 0 ? userInfo2.country : str8, (i3 & 256) != 0 ? userInfo2.countryCode : str9);
    }

    public final String component1() {
        return this.qimei;
    }

    public final String component2() {
        return this.guid;
    }

    public final String component3() {
        return this.uuid;
    }

    public final String component4() {
        return this.userId;
    }

    public final String component5() {
        return this.qimeiToken;
    }

    public final String component6() {
        return this.authKey;
    }

    public final String component7() {
        return this.language;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.countryCode;
    }

    public final UserInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        h.e(str, "qimei");
        h.e(str2, "guid");
        h.e(str3, "uuid");
        h.e(str4, "userId");
        String str10 = str5;
        h.e(str10, "qimeiToken");
        String str11 = str6;
        h.e(str11, "authKey");
        String str12 = str7;
        h.e(str12, "language");
        String str13 = str8;
        h.e(str13, "country");
        String str14 = str9;
        h.e(str14, "countryCode");
        return new UserInfo(str, str2, str3, str4, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return h.a(this.qimei, userInfo.qimei) && h.a(this.guid, userInfo.guid) && h.a(this.uuid, userInfo.uuid) && h.a(this.userId, userInfo.userId) && h.a(this.qimeiToken, userInfo.qimeiToken) && h.a(this.authKey, userInfo.authKey) && h.a(this.language, userInfo.language) && h.a(this.country, userInfo.country) && h.a(this.countryCode, userInfo.countryCode);
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getQimei() {
        return this.qimei;
    }

    public final String getQimeiToken() {
        return this.qimeiToken;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.countryCode.hashCode() + a.a(this.country, a.a(this.language, a.a(this.authKey, a.a(this.qimeiToken, a.a(this.userId, a.a(this.uuid, a.a(this.guid, this.qimei.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAuthKey(String str) {
        h.e(str, "<set-?>");
        this.authKey = str;
    }

    public final void setCountry(String str) {
        h.e(str, "<set-?>");
        this.country = str;
    }

    public final void setCountryCode(String str) {
        h.e(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setGuid(String str) {
        h.e(str, "<set-?>");
        this.guid = str;
    }

    public final void setLanguage(String str) {
        h.e(str, "<set-?>");
        this.language = str;
    }

    public final void setQimei(String str) {
        h.e(str, "<set-?>");
        this.qimei = str;
    }

    public final void setQimeiToken(String str) {
        h.e(str, "<set-?>");
        this.qimeiToken = str;
    }

    public final void setUserId(String str) {
        h.e(str, "<set-?>");
        this.userId = str;
    }

    public final void setUuid(String str) {
        h.e(str, "<set-?>");
        this.uuid = str;
    }

    public String toString() {
        StringBuilder i2 = a.i("UserInfo(qimei=");
        i2.append(this.qimei);
        i2.append(", guid=");
        i2.append(this.guid);
        i2.append(", uuid=");
        i2.append(this.uuid);
        i2.append(", userId=");
        i2.append(this.userId);
        i2.append(", qimeiToken=");
        i2.append(this.qimeiToken);
        i2.append(", authKey=");
        i2.append(this.authKey);
        i2.append(", language=");
        i2.append(this.language);
        i2.append(", country=");
        i2.append(this.country);
        i2.append(", countryCode=");
        i2.append(this.countryCode);
        i2.append(')');
        return i2.toString();
    }
}
