package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;

public final class LbsInfo {
    public static final Companion Companion = new Companion((f) null);
    private Float accuracy;
    private String city;
    private Integer cityCode;
    private String country;
    private String countryCode;
    private String district;
    private Float latitude;
    private Float longitude;
    private String province;
    private String street;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.location.Address} */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c3, code lost:
            if (r3 != null) goto L_0x0105;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
            if (r3 == null) goto L_0x010d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
            android.util.Log.d(i.o.c.h.j("ClientChannel|", "LbsUtil"), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0139, code lost:
            if (r3 != null) goto L_0x0157;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
            if (r3 == null) goto L_0x015f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
            r3.d(i.o.c.h.j("ClientChannel|", "LbsUtil"), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015f, code lost:
            android.util.Log.d(i.o.c.h.j("ClientChannel|", "LbsUtil"), r0);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0243  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.apkpure.components.clientchannel.channel.headers.LbsInfo location(android.content.Context r20) {
            /*
                r19 = this;
                r1 = r20
                java.lang.String r2 = "context"
                i.o.c.h.e(r1, r2)
                com.apkpure.components.clientchannel.channel.headers.LbsInfo r15 = new com.apkpure.components.clientchannel.channel.headers.LbsInfo
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 1023(0x3ff, float:1.434E-42)
                r0 = 0
                r3 = r15
                r16 = r15
                r15 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                android.location.Criteria r0 = new android.location.Criteria
                r0.<init>()
                i.o.c.h.e(r1, r2)
                android.location.LocationManager r3 = g.c.b.a.l.b.b(r20)
                java.lang.String r4 = "get location manager is null."
                java.lang.String r5 = "LbsUtil"
                java.lang.String r6 = "tag"
                java.lang.String r7 = "message"
                java.lang.String r8 = "ClientChannel|"
                r10 = 1
                r11 = 0
                if (r3 != 0) goto L_0x0053
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r4, r7)
                g.c.b.a.j.g r0 = g.c.b.a.l.c.b
                if (r0 == 0) goto L_0x004a
                java.lang.String r3 = i.o.c.h.j(r8, r5)
                r0.d(r3, r4)
                goto L_0x0166
            L_0x004a:
                java.lang.String r0 = i.o.c.h.j(r8, r5)
                android.util.Log.d(r0, r4)
                goto L_0x0166
            L_0x0053:
                java.lang.String r0 = r3.getBestProvider(r0, r10)     // Catch:{ Exception -> 0x0058 }
                goto L_0x007e
            L_0x0058:
                r0 = move-exception
                r12 = r0
                java.lang.String r0 = r12.getMessage()
                java.lang.String r12 = "Location exception: "
                java.lang.String r0 = i.o.c.h.j(r12, r0)
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r12 = g.c.b.a.l.c.b
                if (r12 == 0) goto L_0x0076
                java.lang.String r13 = i.o.c.h.j(r8, r5)
                r12.d(r13, r0)
                goto L_0x007d
            L_0x0076:
                java.lang.String r12 = i.o.c.h.j(r8, r5)
                android.util.Log.d(r12, r0)
            L_0x007d:
                r0 = 0
            L_0x007e:
                if (r0 == 0) goto L_0x0089
                int r12 = r0.length()
                if (r12 != 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r12 = 0
                goto L_0x008a
            L_0x0089:
                r12 = 1
            L_0x008a:
                if (r12 == 0) goto L_0x0115
                java.lang.String r0 = "network"
                i.o.c.h.e(r1, r2)
                android.location.LocationManager r3 = g.c.b.a.l.b.b(r20)
                if (r3 != 0) goto L_0x00b3
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r4, r7)
                g.c.b.a.j.g r0 = g.c.b.a.l.c.b
                if (r0 == 0) goto L_0x00aa
                java.lang.String r3 = i.o.c.h.j(r8, r5)
                r0.d(r3, r4)
                goto L_0x0166
            L_0x00aa:
                java.lang.String r0 = i.o.c.h.j(r8, r5)
                android.util.Log.d(r0, r4)
                goto L_0x0166
            L_0x00b3:
                boolean r4 = g.c.b.a.l.b.a(r20)
                if (r4 != 0) goto L_0x00c6
                java.lang.String r0 = "Network location permission is not enabled"
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b
                if (r3 == 0) goto L_0x010d
                goto L_0x0105
            L_0x00c6:
                boolean r4 = r3.isProviderEnabled(r0)     // Catch:{ Exception -> 0x00f0 }
                if (r4 != 0) goto L_0x00ea
                java.lang.String r0 = "Network location is not provider enabled."
                i.o.c.h.e(r5, r6)     // Catch:{ Exception -> 0x00f0 }
                i.o.c.h.e(r0, r7)     // Catch:{ Exception -> 0x00f0 }
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b     // Catch:{ Exception -> 0x00f0 }
                if (r3 == 0) goto L_0x00e1
                java.lang.String r4 = i.o.c.h.j(r8, r5)     // Catch:{ Exception -> 0x00f0 }
                r3.d(r4, r0)     // Catch:{ Exception -> 0x00f0 }
                goto L_0x0166
            L_0x00e1:
                java.lang.String r3 = i.o.c.h.j(r8, r5)     // Catch:{ Exception -> 0x00f0 }
                android.util.Log.d(r3, r0)     // Catch:{ Exception -> 0x00f0 }
                goto L_0x0166
            L_0x00ea:
                android.location.Location r0 = r3.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x00f0 }
                goto L_0x0167
            L_0x00f0:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r3 = "Network location exception "
                java.lang.String r0 = i.o.c.h.j(r3, r0)
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b
                if (r3 == 0) goto L_0x010d
            L_0x0105:
                java.lang.String r4 = i.o.c.h.j(r8, r5)
                r3.d(r4, r0)
                goto L_0x0166
            L_0x010d:
                java.lang.String r3 = i.o.c.h.j(r8, r5)
                android.util.Log.d(r3, r0)
                goto L_0x0166
            L_0x0115:
                int r4 = android.os.Build.VERSION.SDK_INT
                r12 = 23
                if (r4 >= r12) goto L_0x011c
                goto L_0x0124
            L_0x011c:
                java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
                int r4 = e.e.c.a.a(r1, r4)
                if (r4 != 0) goto L_0x0126
            L_0x0124:
                r4 = 1
                goto L_0x0127
            L_0x0126:
                r4 = 0
            L_0x0127:
                if (r4 != 0) goto L_0x013c
                boolean r4 = g.c.b.a.l.b.a(r20)
                if (r4 != 0) goto L_0x013c
                java.lang.String r0 = "No location permission is enabled"
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b
                if (r3 == 0) goto L_0x015f
                goto L_0x0157
            L_0x013c:
                android.location.Location r0 = r3.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x0141 }
                goto L_0x0167
            L_0x0141:
                r0 = move-exception
                r3 = r0
                java.lang.String r0 = r3.getMessage()
                java.lang.String r3 = "Location exception "
                java.lang.String r0 = i.o.c.h.j(r3, r0)
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b
                if (r3 == 0) goto L_0x015f
            L_0x0157:
                java.lang.String r4 = i.o.c.h.j(r8, r5)
                r3.d(r4, r0)
                goto L_0x0166
            L_0x015f:
                java.lang.String r3 = i.o.c.h.j(r8, r5)
                android.util.Log.d(r3, r0)
            L_0x0166:
                r0 = 0
            L_0x0167:
                if (r0 != 0) goto L_0x016c
                r3 = r16
                return r3
            L_0x016c:
                r3 = r16
                float r4 = r0.getAccuracy()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r3.setAccuracy(r4)
                double r12 = r0.getLatitude()
                float r4 = (float) r12
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r3.setLatitude(r4)
                double r12 = r0.getLongitude()
                float r4 = (float) r12
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r3.setLongitude(r4)
                double r13 = r0.getLatitude()
                double r9 = r0.getLongitude()
                i.o.c.h.e(r1, r2)
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                java.lang.Thread r0 = r0.getThread()
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                boolean r0 = i.o.c.h.a(r0, r2)
                if (r0 == 0) goto L_0x01b0
                goto L_0x022c
            L_0x01b0:
                android.location.Geocoder r12 = new android.location.Geocoder
                r12.<init>(r1)
                r17 = 1
                r1 = r13
                r15 = r9
                java.util.List r0 = r12.getFromLocation(r13, r15, r17)     // Catch:{ Exception -> 0x01be }
                goto L_0x01e8
            L_0x01be:
                r0 = move-exception
                r12 = r0
                java.lang.String r0 = r12.getMessage()
                java.lang.String r12 = "Location address exception: "
                java.lang.String r0 = i.o.c.h.j(r12, r0)
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r12 = g.c.b.a.l.c.b
                if (r12 == 0) goto L_0x01dc
                java.lang.String r13 = i.o.c.h.j(r8, r5)
                r12.e(r13, r0)
                goto L_0x01e3
            L_0x01dc:
                java.lang.String r12 = i.o.c.h.j(r8, r5)
                android.util.Log.e(r12, r0)
            L_0x01e3:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x01e8:
                if (r0 == 0) goto L_0x01f5
                boolean r12 = r0.isEmpty()
                if (r12 == 0) goto L_0x01f1
                goto L_0x01f5
            L_0x01f1:
                r12 = 0
                r18 = 0
                goto L_0x01f7
            L_0x01f5:
                r18 = 1
            L_0x01f7:
                if (r18 == 0) goto L_0x022e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r12 = "No location information was located. latitude["
                r0.append(r12)
                r0.append(r1)
                java.lang.String r1 = "] longitude["
                r0.append(r1)
                r0.append(r9)
                java.lang.String r1 = "] "
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                i.o.c.h.e(r5, r6)
                i.o.c.h.e(r0, r7)
                g.c.b.a.j.g r1 = g.c.b.a.l.c.b
                java.lang.String r2 = i.o.c.h.j(r8, r5)
                if (r1 == 0) goto L_0x0229
                r1.d(r2, r0)
                goto L_0x022c
            L_0x0229:
                android.util.Log.d(r2, r0)
            L_0x022c:
                r9 = 0
                goto L_0x0240
            L_0x022e:
                java.lang.String r1 = "$this$first"
                i.o.c.h.e(r0, r1)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L_0x0275
                java.lang.Object r0 = r0.get(r11)
                r9 = r0
                android.location.Address r9 = (android.location.Address) r9
            L_0x0240:
                if (r9 != 0) goto L_0x0243
                goto L_0x0274
            L_0x0243:
                java.lang.String r0 = r9.getCountryName()
                r3.setCountry(r0)
                java.lang.String r0 = r9.getCountryCode()
                r3.setCountryCode(r0)
                java.lang.String r0 = r9.getAdminArea()
                r3.setProvince(r0)
                java.lang.String r0 = r9.getLocality()
                r3.setCity(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
                r3.setCityCode(r0)
                java.lang.String r0 = r9.getSubLocality()
                r3.setDistrict(r0)
                java.lang.String r0 = r9.getSubAdminArea()
                r3.setStreet(r0)
            L_0x0274:
                return r3
            L_0x0275:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "List is empty."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.LbsInfo.Companion.location(android.content.Context):com.apkpure.components.clientchannel.channel.headers.LbsInfo");
        }
    }

    public LbsInfo() {
        this((Float) null, (Float) null, (Float) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (f) null);
    }

    public LbsInfo(Float f2, Float f3, Float f4, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.latitude = f2;
        this.longitude = f3;
        this.accuracy = f4;
        this.cityCode = num;
        this.province = str;
        this.city = str2;
        this.district = str3;
        this.street = str4;
        this.country = str5;
        this.countryCode = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LbsInfo(java.lang.Float r12, java.lang.Float r13, java.lang.Float r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, i.o.c.f r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            if (r1 == 0) goto L_0x000d
            r1 = r2
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            r3 = r2
            goto L_0x0015
        L_0x0014:
            r3 = r13
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = r14
        L_0x001b:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0025
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0026
        L_0x0025:
            r4 = r15
        L_0x0026:
            r5 = r0 & 16
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x002e
            r5 = r6
            goto L_0x0030
        L_0x002e:
            r5 = r16
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            r7 = r6
            goto L_0x0038
        L_0x0036:
            r7 = r17
        L_0x0038:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003e
            r8 = r6
            goto L_0x0040
        L_0x003e:
            r8 = r18
        L_0x0040:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0046
            r9 = r6
            goto L_0x0048
        L_0x0046:
            r9 = r19
        L_0x0048:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004e
            r10 = r6
            goto L_0x0050
        L_0x004e:
            r10 = r20
        L_0x0050:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = r21
        L_0x0057:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.clientchannel.channel.headers.LbsInfo.<init>(java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, i.o.c.f):void");
    }

    public static /* synthetic */ LbsInfo copy$default(LbsInfo lbsInfo, Float f2, Float f3, Float f4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        LbsInfo lbsInfo2 = lbsInfo;
        int i3 = i2;
        return lbsInfo.copy((i3 & 1) != 0 ? lbsInfo2.latitude : f2, (i3 & 2) != 0 ? lbsInfo2.longitude : f3, (i3 & 4) != 0 ? lbsInfo2.accuracy : f4, (i3 & 8) != 0 ? lbsInfo2.cityCode : num, (i3 & 16) != 0 ? lbsInfo2.province : str, (i3 & 32) != 0 ? lbsInfo2.city : str2, (i3 & 64) != 0 ? lbsInfo2.district : str3, (i3 & 128) != 0 ? lbsInfo2.street : str4, (i3 & 256) != 0 ? lbsInfo2.country : str5, (i3 & 512) != 0 ? lbsInfo2.countryCode : str6);
    }

    public final Float component1() {
        return this.latitude;
    }

    public final String component10() {
        return this.countryCode;
    }

    public final Float component2() {
        return this.longitude;
    }

    public final Float component3() {
        return this.accuracy;
    }

    public final Integer component4() {
        return this.cityCode;
    }

    public final String component5() {
        return this.province;
    }

    public final String component6() {
        return this.city;
    }

    public final String component7() {
        return this.district;
    }

    public final String component8() {
        return this.street;
    }

    public final String component9() {
        return this.country;
    }

    public final LbsInfo copy(Float f2, Float f3, Float f4, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        return new LbsInfo(f2, f3, f4, num, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LbsInfo)) {
            return false;
        }
        LbsInfo lbsInfo = (LbsInfo) obj;
        return h.a(this.latitude, lbsInfo.latitude) && h.a(this.longitude, lbsInfo.longitude) && h.a(this.accuracy, lbsInfo.accuracy) && h.a(this.cityCode, lbsInfo.cityCode) && h.a(this.province, lbsInfo.province) && h.a(this.city, lbsInfo.city) && h.a(this.district, lbsInfo.district) && h.a(this.street, lbsInfo.street) && h.a(this.country, lbsInfo.country) && h.a(this.countryCode, lbsInfo.countryCode);
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final String getCity() {
        return this.city;
    }

    public final Integer getCityCode() {
        return this.cityCode;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final Float getLatitude() {
        return this.latitude;
    }

    public final Float getLongitude() {
        return this.longitude;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        Float f2 = this.latitude;
        int i2 = 0;
        int hashCode = (f2 == null ? 0 : f2.hashCode()) * 31;
        Float f3 = this.longitude;
        int hashCode2 = (hashCode + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.accuracy;
        int hashCode3 = (hashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num = this.cityCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.province;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.district;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryCode;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode9 + i2;
    }

    public final void setAccuracy(Float f2) {
        this.accuracy = f2;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCityCode(Integer num) {
        this.cityCode = num;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setLatitude(Float f2) {
        this.latitude = f2;
    }

    public final void setLongitude(Float f2) {
        this.longitude = f2;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public String toString() {
        StringBuilder i2 = a.i("LbsInfo(latitude=");
        i2.append(this.latitude);
        i2.append(", longitude=");
        i2.append(this.longitude);
        i2.append(", accuracy=");
        i2.append(this.accuracy);
        i2.append(", cityCode=");
        i2.append(this.cityCode);
        i2.append(", province=");
        i2.append(this.province);
        i2.append(", city=");
        i2.append(this.city);
        i2.append(", district=");
        i2.append(this.district);
        i2.append(", street=");
        i2.append(this.street);
        i2.append(", country=");
        i2.append(this.country);
        i2.append(", countryCode=");
        i2.append(this.countryCode);
        i2.append(')');
        return i2.toString();
    }
}
