package com.tencent.beacon.base.net.b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.pack.RequestPackage;
import com.tencent.raft.measure.report.ATTAReporter;
import g.a.a.a.a;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class d {
    private static Map<String, String> a;

    public static RequestPackage a(int i2, byte[] bArr, Map<String, String> map, String str) {
        c d2 = c.d();
        e l2 = e.l();
        RequestPackage requestPackage = new RequestPackage();
        requestPackage.model = g.e().h();
        requestPackage.osVersion = l2.s();
        requestPackage.platformId = d2.h();
        requestPackage.appkey = str;
        requestPackage.appVersion = b.a();
        requestPackage.sdkId = d2.i();
        requestPackage.sdkVersion = d2.j();
        requestPackage.cmd = i2;
        requestPackage.encryType = 3;
        requestPackage.zipType = 2;
        requestPackage.sBuffer = bArr;
        requestPackage.reserved = b(map);
        return requestPackage;
    }

    public static synchronized Map<String, String> a() {
        Map<String, String> map;
        synchronized (d.class) {
            if (a == null) {
                HashMap hashMap = new HashMap(4);
                a = hashMap;
                hashMap.put("wup_version", "3.0");
                a.put("TYPE_COMPRESS", String.valueOf(2));
                a.put("encr_type", "rsapost");
                a.put(ATTAReporter.KEY_CONTENT_TYPE, "jce");
                com.tencent.beacon.e.g b = com.tencent.beacon.e.g.b();
                if (b != null) {
                    a.put("bea_key", b.d());
                }
            }
            map = a;
        }
        return map;
    }

    public static Map<String, String> a(String str, Map<String, String> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry next : map.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            int length = valueOf.trim().length();
            if (length <= 0 || !a(valueOf)) {
                com.tencent.beacon.base.util.c.e("[core] '%s' should be ASCII code in 32-126!", valueOf);
                com.tencent.beacon.a.b.g.e().a("102", a.d("[event] eventName: ", str, ", key: ", valueOf, " should be ASCII code in 32-126!"));
            } else {
                String trim = valueOf.trim();
                if (length > 64) {
                    trim = trim.substring(i2, 64);
                    String d2 = a.d("[event] eventName: ", str, ", key: ", trim, " should be less than 64!");
                    com.tencent.beacon.a.b.g.e().a("102", d2);
                    com.tencent.beacon.base.util.e.a(d2);
                }
                String replace = trim.replace("|", "%7C").replace("&", "%26").replace("=", "%3D");
                String trim2 = String.valueOf(next.getValue()).trim();
                if (trim2.length() > 10240) {
                    String d3 = a.d("[event] eventName: ", str, ", key: ", replace, "'s value > 10K.");
                    com.tencent.beacon.a.b.g.e().a("103", d3);
                    com.tencent.beacon.base.util.e.a(d3);
                    trim2 = trim2.substring(0, 10240);
                }
                String replace2 = trim2.replace(10, ' ').replace(13, ' ').replace("|", "%7C").replace("&", "%26").replace("=", "%3D");
                hashMap.put(replace, replace2);
                i3 += replace2.length() + replace.length();
            }
            i2 = 0;
        }
        if (i3 <= 46080) {
            return hashMap;
        }
        String c = a.c("[event] eventName: ", str, " params > 45K");
        com.tencent.beacon.a.b.g.e().a("104", c);
        com.tencent.beacon.base.util.e.a(c);
        return null;
    }

    public static void a(long j2, long j3, String str) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "fixBeaconInfo, serverTime: " + j3 + ",ip: " + str, new Object[0]);
        c d2 = c.d();
        d2.b(str);
        d2.a(j3 - ((new Date().getTime() + j2) / 2));
    }

    private static void a(String str, String str2) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "update strategy sid: %s, max_time: %s", str, str2);
        com.tencent.beacon.e.g.b().a(str, str2);
    }

    public static boolean a(String str) {
        int length = str.length();
        boolean z = true;
        while (true) {
            length--;
            if (length < 0) {
                return z;
            }
            char charAt = str.charAt(length);
            if (charAt < ' ' || charAt >= 127) {
                z = false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "encrypt-status"
            boolean r1 = r4.containsKey(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r1 = "[BeaconNet]"
            java.lang.String r2 = "parse response header fail! cause by svr encrypt error!"
            com.tencent.beacon.base.util.c.a(r1, r2, r4)
            return r0
        L_0x0016:
            java.lang.String r1 = "session_id"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "max_time"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L_0x004d
            java.lang.Object r1 = r4.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r4.get(r2)
            java.util.List r4 = (java.util.List) r4
            r2 = 0
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r4.get(r0)
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L_0x0046:
            if (r1 == 0) goto L_0x004d
            if (r2 == 0) goto L_0x004d
            a((java.lang.String) r1, (java.lang.String) r2)
        L_0x004d:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.d.a(java.util.Map):boolean");
    }

    public static NetworkInfo b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.d().c().getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str.trim().length() <= 0 || !a(str)) {
                com.tencent.beacon.base.util.c.e("[core] '%s' should be ASCII code in 32-126!", str);
            } else {
                String trim = str.trim();
                sb.append("&");
                sb.append(trim.replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
                sb.append("=");
                String str2 = (String) next.getValue();
                if (str2 != null) {
                    sb.append(str2.trim().replace(10, ' ').replace(13, ' ').replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
                }
            }
        }
        return sb.length() > 0 ? sb.substring(1) : "";
    }

    public static String c() {
        NetworkInfo b = b();
        if (b == null) {
            return "unknown";
        }
        if (b.getType() == 1) {
            return "wifi";
        }
        String extraInfo = b.getExtraInfo();
        if (extraInfo != null && extraInfo.length() > 64) {
            extraInfo = extraInfo.substring(0, 64);
        }
        return a.w("", extraInfo);
    }

    public static void c(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey("encrypt-status")) {
                com.tencent.beacon.base.util.c.a("[BeaconNet]", "parse response header fail! cause by svr encrypt error!", new Object[0]);
            }
            if (map.containsKey("session_id") && map.containsKey("max_time")) {
                a(map.get("session_id"), map.get("max_time"));
            }
        }
    }

    public static boolean d() {
        NetworkInfo b = b();
        return b != null && b.isConnected();
    }
}
