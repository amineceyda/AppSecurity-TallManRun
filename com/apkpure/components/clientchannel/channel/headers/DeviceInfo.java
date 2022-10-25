package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;
import java.util.Arrays;

public final class DeviceInfo {
    private final String[] abis;
    private final String brand;
    private String country;
    private String countryCode;
    private String language;
    private final String manufacturer;
    private final String mode;
    private final String osVer;
    private final int platform;
    private final String product;

    public DeviceInfo() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, 1023, (f) null);
    }

    public DeviceInfo(int i2, String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, String str8) {
        h.e(str, "brand");
        h.e(str2, "mode");
        h.e(str3, "manufacturer");
        h.e(str4, "product");
        h.e(str5, "osVer");
        h.e(strArr, "abis");
        h.e(str6, "language");
        h.e(str7, "country");
        h.e(str8, "countryCode");
        this.platform = i2;
        this.brand = str;
        this.mode = str2;
        this.manufacturer = str3;
        this.product = str4;
        this.osVer = str5;
        this.abis = strArr;
        this.language = str6;
        this.country = str7;
        this.countryCode = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeviceInfo(int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String[] r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, i.o.c.f r28) {
        /*
            r16 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r1 = 1
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0017
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r4 = "BRAND"
            i.o.c.h.d(r3, r4)
            goto L_0x0019
        L_0x0017:
            r3 = r18
        L_0x0019:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            i.o.c.h.d(r4, r5)
            goto L_0x0027
        L_0x0025:
            r4 = r19
        L_0x0027:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0033
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r6 = "MANUFACTURER"
            i.o.c.h.d(r5, r6)
            goto L_0x0035
        L_0x0033:
            r5 = r20
        L_0x0035:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0041
            java.lang.String r6 = android.os.Build.PRODUCT
            java.lang.String r7 = "PRODUCT"
            i.o.c.h.d(r6, r7)
            goto L_0x0043
        L_0x0041:
            r6 = r21
        L_0x0043:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x004e
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto L_0x0050
        L_0x004e:
            r7 = r22
        L_0x0050:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x0089
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 21
            if (r8 < r10) goto L_0x0063
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r10 = "{\n            Build.SUPPORTED_ABIS\n        }"
            i.o.c.h.d(r8, r10)
            goto L_0x008b
        L_0x0063:
            java.util.ArrayList r8 = new java.util.ArrayList
            r10 = 2
            r8.<init>(r10)
            java.lang.String r10 = android.os.Build.CPU_ABI
            r8.add(r10)
            java.lang.String r10 = android.os.Build.CPU_ABI2
            java.lang.String r11 = "unknown"
            boolean r11 = i.o.c.h.a(r10, r11)
            if (r11 != 0) goto L_0x007b
            r8.add(r10)
        L_0x007b:
            java.lang.String[] r10 = new java.lang.String[r9]
            java.lang.Object[] r8 = r8.toArray(r10)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r10)
            java.lang.String[] r8 = (java.lang.String[]) r8
            goto L_0x008b
        L_0x0089:
            r8 = r23
        L_0x008b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            java.lang.String r11 = "{\n            val listCo…stCompat.get(0)\n        }"
            java.lang.String r12 = "getLocales(Resources.getSystem().configuration)"
            java.lang.String r13 = "{\n            LocaleList…fault().get(0);\n        }"
            java.lang.String r14 = "{\n            Locale.getDefault();\n        }"
            r15 = 24
            if (r10 == 0) goto L_0x0104
            android.content.res.Resources r10 = android.content.res.Resources.getSystem()     // Catch:{ Exception -> 0x00cd }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x00cd }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00cd }
            if (r9 < r15) goto L_0x00b4
            android.os.LocaleList r9 = r10.getLocales()     // Catch:{ Exception -> 0x00cd }
            e.e.f.c r10 = new e.e.f.c     // Catch:{ Exception -> 0x00cd }
            e.e.f.f r15 = new e.e.f.f     // Catch:{ Exception -> 0x00cd }
            r15.<init>(r9)     // Catch:{ Exception -> 0x00cd }
            r10.<init>(r15)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00bf
        L_0x00b4:
            java.util.Locale[] r9 = new java.util.Locale[r2]     // Catch:{ Exception -> 0x00cd }
            java.util.Locale r10 = r10.locale     // Catch:{ Exception -> 0x00cd }
            r15 = 0
            r9[r15] = r10     // Catch:{ Exception -> 0x00cd }
            e.e.f.c r10 = e.e.f.c.a(r9)     // Catch:{ Exception -> 0x00cd }
        L_0x00bf:
            i.o.c.h.d(r10, r12)     // Catch:{ Exception -> 0x00cd }
            e.e.f.e r9 = r10.a     // Catch:{ Exception -> 0x00cd }
            r10 = 0
            java.util.Locale r9 = r9.get(r10)     // Catch:{ Exception -> 0x00cd }
            i.o.c.h.d(r9, r11)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00e7
        L_0x00cd:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 24
            if (r9 < r10) goto L_0x00df
            android.os.LocaleList r9 = android.os.LocaleList.getDefault()
            r10 = 0
            java.util.Locale r9 = r9.get(r10)
            r10 = r13
            goto L_0x00e4
        L_0x00df:
            java.util.Locale r9 = java.util.Locale.getDefault()
            r10 = r14
        L_0x00e4:
            i.o.c.h.d(r9, r10)
        L_0x00e7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = r9.getLanguage()
            r10.append(r15)
            r15 = 45
            r10.append(r15)
            java.lang.String r9 = r9.getCountry()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x0106
        L_0x0104:
            r9 = r24
        L_0x0106:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0165
            android.content.res.Resources r10 = android.content.res.Resources.getSystem()     // Catch:{ Exception -> 0x0141 }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x0141 }
            int r15 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0141 }
            r2 = 24
            if (r15 < r2) goto L_0x0127
            android.os.LocaleList r2 = r10.getLocales()     // Catch:{ Exception -> 0x0141 }
            e.e.f.c r10 = new e.e.f.c     // Catch:{ Exception -> 0x0141 }
            e.e.f.f r15 = new e.e.f.f     // Catch:{ Exception -> 0x0141 }
            r15.<init>(r2)     // Catch:{ Exception -> 0x0141 }
            r10.<init>(r15)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0133
        L_0x0127:
            r2 = 1
            java.util.Locale[] r15 = new java.util.Locale[r2]     // Catch:{ Exception -> 0x0141 }
            java.util.Locale r2 = r10.locale     // Catch:{ Exception -> 0x0141 }
            r10 = 0
            r15[r10] = r2     // Catch:{ Exception -> 0x0141 }
            e.e.f.c r10 = e.e.f.c.a(r15)     // Catch:{ Exception -> 0x0141 }
        L_0x0133:
            i.o.c.h.d(r10, r12)     // Catch:{ Exception -> 0x0141 }
            e.e.f.e r2 = r10.a     // Catch:{ Exception -> 0x0141 }
            r10 = 0
            java.util.Locale r2 = r2.get(r10)     // Catch:{ Exception -> 0x0141 }
            i.o.c.h.d(r2, r11)     // Catch:{ Exception -> 0x0141 }
            goto L_0x015b
        L_0x0141:
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 24
            if (r2 < r10) goto L_0x0153
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r10 = 0
            java.util.Locale r2 = r2.get(r10)
            r10 = r13
            goto L_0x0158
        L_0x0153:
            java.util.Locale r2 = java.util.Locale.getDefault()
            r10 = r14
        L_0x0158:
            i.o.c.h.d(r2, r10)
        L_0x015b:
            java.lang.String r2 = r2.getDisplayCountry()
            java.lang.String r10 = "getSystemLocale().displayCountry"
            i.o.c.h.d(r2, r10)
            goto L_0x0167
        L_0x0165:
            r2 = r25
        L_0x0167:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01c5
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch:{ Exception -> 0x01a2 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x01a2 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a2 }
            r15 = 24
            if (r10 < r15) goto L_0x0188
            android.os.LocaleList r0 = r0.getLocales()     // Catch:{ Exception -> 0x01a2 }
            e.e.f.c r10 = new e.e.f.c     // Catch:{ Exception -> 0x01a2 }
            e.e.f.f r15 = new e.e.f.f     // Catch:{ Exception -> 0x01a2 }
            r15.<init>(r0)     // Catch:{ Exception -> 0x01a2 }
            r10.<init>(r15)     // Catch:{ Exception -> 0x01a2 }
            goto L_0x0194
        L_0x0188:
            r10 = 1
            java.util.Locale[] r10 = new java.util.Locale[r10]     // Catch:{ Exception -> 0x01a2 }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x01a2 }
            r15 = 0
            r10[r15] = r0     // Catch:{ Exception -> 0x01a2 }
            e.e.f.c r10 = e.e.f.c.a(r10)     // Catch:{ Exception -> 0x01a2 }
        L_0x0194:
            i.o.c.h.d(r10, r12)     // Catch:{ Exception -> 0x01a2 }
            e.e.f.e r0 = r10.a     // Catch:{ Exception -> 0x01a2 }
            r10 = 0
            java.util.Locale r0 = r0.get(r10)     // Catch:{ Exception -> 0x01a2 }
            i.o.c.h.d(r0, r11)     // Catch:{ Exception -> 0x01a2 }
            goto L_0x01bb
        L_0x01a2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 24
            if (r0 < r10) goto L_0x01b3
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            r10 = 0
            java.util.Locale r0 = r0.get(r10)
            goto L_0x01b8
        L_0x01b3:
            java.util.Locale r0 = java.util.Locale.getDefault()
            r13 = r14
        L_0x01b8:
            i.o.c.h.d(r0, r13)
        L_0x01bb:
            java.lang.String r0 = r0.getCountry()
            java.lang.String r10 = "getSystemLocale().country"
            i.o.c.h.d(r0, r10)
            goto L_0x01c7
        L_0x01c5:
            r0 = r26
        L_0x01c7:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r2
            r27 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.DeviceInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, int, i.o.c.f):void");
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, int i2, String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, String str8, int i3, Object obj) {
        DeviceInfo deviceInfo2 = deviceInfo;
        int i4 = i3;
        return deviceInfo.copy((i4 & 1) != 0 ? deviceInfo2.platform : i2, (i4 & 2) != 0 ? deviceInfo2.brand : str, (i4 & 4) != 0 ? deviceInfo2.mode : str2, (i4 & 8) != 0 ? deviceInfo2.manufacturer : str3, (i4 & 16) != 0 ? deviceInfo2.product : str4, (i4 & 32) != 0 ? deviceInfo2.osVer : str5, (i4 & 64) != 0 ? deviceInfo2.abis : strArr, (i4 & 128) != 0 ? deviceInfo2.language : str6, (i4 & 256) != 0 ? deviceInfo2.country : str7, (i4 & 512) != 0 ? deviceInfo2.countryCode : str8);
    }

    public final int component1() {
        return this.platform;
    }

    public final String component10() {
        return this.countryCode;
    }

    public final String component2() {
        return this.brand;
    }

    public final String component3() {
        return this.mode;
    }

    public final String component4() {
        return this.manufacturer;
    }

    public final String component5() {
        return this.product;
    }

    public final String component6() {
        return this.osVer;
    }

    public final String[] component7() {
        return this.abis;
    }

    public final String component8() {
        return this.language;
    }

    public final String component9() {
        return this.country;
    }

    public final DeviceInfo copy(int i2, String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, String str8) {
        h.e(str, "brand");
        h.e(str2, "mode");
        String str9 = str3;
        h.e(str9, "manufacturer");
        String str10 = str4;
        h.e(str10, "product");
        String str11 = str5;
        h.e(str11, "osVer");
        String[] strArr2 = strArr;
        h.e(strArr2, "abis");
        String str12 = str6;
        h.e(str12, "language");
        String str13 = str7;
        h.e(str13, "country");
        String str14 = str8;
        h.e(str14, "countryCode");
        return new DeviceInfo(i2, str, str2, str9, str10, str11, strArr2, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.platform == deviceInfo.platform && h.a(this.brand, deviceInfo.brand) && h.a(this.mode, deviceInfo.mode) && h.a(this.manufacturer, deviceInfo.manufacturer) && h.a(this.product, deviceInfo.product) && h.a(this.osVer, deviceInfo.osVer) && h.a(this.abis, deviceInfo.abis) && h.a(this.language, deviceInfo.language) && h.a(this.country, deviceInfo.country) && h.a(this.countryCode, deviceInfo.countryCode);
    }

    public final String[] getAbis() {
        return this.abis;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getOsVer() {
        return this.osVer;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        int a = a.a(this.product, a.a(this.manufacturer, a.a(this.mode, a.a(this.brand, this.platform * 31, 31), 31), 31), 31);
        return this.countryCode.hashCode() + a.a(this.country, a.a(this.language, (a.a(this.osVer, a, 31) + Arrays.hashCode(this.abis)) * 31, 31), 31);
    }

    public final void setCountry(String str) {
        h.e(str, "<set-?>");
        this.country = str;
    }

    public final void setCountryCode(String str) {
        h.e(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setLanguage(String str) {
        h.e(str, "<set-?>");
        this.language = str;
    }

    public String toString() {
        StringBuilder i2 = a.i("DeviceInfo(platform=");
        i2.append(this.platform);
        i2.append(", brand=");
        i2.append(this.brand);
        i2.append(", mode=");
        i2.append(this.mode);
        i2.append(", manufacturer=");
        i2.append(this.manufacturer);
        i2.append(", product=");
        i2.append(this.product);
        i2.append(", osVer=");
        i2.append(this.osVer);
        i2.append(", abis=");
        i2.append(Arrays.toString(this.abis));
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
