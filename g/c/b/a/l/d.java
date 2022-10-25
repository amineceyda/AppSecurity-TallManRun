package g.c.b.a.l;

import android.util.Log;
import g.c.b.a.j.g;
import i.o.c.h;
import i.t.e;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;

public final class d {
    public static final d a = null;
    public static final String b;
    public static final String[] c = {"https://pv.sohu.com/cityjson", "https://pv.sohu.com/cityjson?ie=utf-8", "https://ip.chinaz.com/getip.aspx"};

    static {
        String simpleName = d.class.getSimpleName();
        h.d(simpleName, "NetUtil::class.java.simpleName");
        b = simpleName;
    }

    public static final String a(String str, boolean z) {
        String str2 = "";
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (z) {
            return '\"' + str + '\"';
        }
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (!e.m(str, "\"", false, 2) || !e.b(str, "\"", false, 2)) {
            return str;
        }
        try {
            String substring = str.substring(1, str.length() - 1);
            h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception e2) {
            String str3 = b;
            String message = e2.getMessage();
            if (message != null) {
                str2 = message;
            }
            h.e(str3, "tag");
            h.e(str2, "message");
            g gVar = c.b;
            if (gVar != null) {
                gVar.e(h.j("ClientChannel|", str3), str2);
                return str;
            }
            Log.e(h.j("ClientChannel|", str3), str2);
            return str;
        }
    }

    public static final String b(boolean z) {
        String str;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress()) {
                            String hostAddress = nextElement2.getHostAddress();
                            h.d(hostAddress, "hostAddress");
                            boolean z2 = e.h(hostAddress, ':', 0, false, 6) < 0;
                            if (z) {
                                if (z2) {
                                    return hostAddress;
                                }
                            } else if (!z2) {
                                int h2 = e.h(hostAddress, '%', 0, false, 6);
                                if (h2 < 0) {
                                    Locale locale = Locale.getDefault();
                                    h.d(locale, "getDefault()");
                                    str = hostAddress.toUpperCase(locale);
                                } else {
                                    String substring = hostAddress.substring(0, h2);
                                    h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    Locale locale2 = Locale.getDefault();
                                    h.d(locale2, "getDefault()");
                                    str = substring.toUpperCase(locale2);
                                }
                                h.d(str, "(this as java.lang.String).toUpperCase(locale)");
                                return str;
                            }
                        }
                    }
                    continue;
                }
            }
        } catch (Exception e2) {
            String str2 = b;
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            h.e(str2, "tag");
            h.e(message, "message");
            g gVar = c.b;
            String j2 = h.j("ClientChannel|", str2);
            if (gVar != null) {
                gVar.e(j2, message);
            } else {
                Log.e(j2, message);
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ Exception -> 0x00c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String c(int r6) {
        /*
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r0 = i.o.c.h.a(r0, r1)
            if (r0 != 0) goto L_0x00f2
            java.lang.String[] r0 = c
            int r1 = r0.length
            if (r6 < r1) goto L_0x0019
            goto L_0x00f2
        L_0x0019:
            r1 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00c4 }
            r0 = r0[r6]     // Catch:{ Exception -> 0x00c4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00c4 }
            k.x$a r0 = new k.x$a     // Catch:{ Exception -> 0x00c4 }
            r0.<init>()     // Catch:{ Exception -> 0x00c4 }
            r0.h(r2)     // Catch:{ Exception -> 0x00c4 }
            r0.b()     // Catch:{ Exception -> 0x00c4 }
            k.x r0 = r0.a()     // Catch:{ Exception -> 0x00c4 }
            k.u$b r2 = new k.u$b     // Catch:{ Exception -> 0x00c4 }
            r2.<init>()     // Catch:{ Exception -> 0x00c4 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ Exception -> 0x00c4 }
            r4 = 5000(0x1388, double:2.4703E-320)
            r2.b(r4, r3)     // Catch:{ Exception -> 0x00c4 }
            r2.c(r4, r3)     // Catch:{ Exception -> 0x00c4 }
            r2.d(r4, r3)     // Catch:{ Exception -> 0x00c4 }
            k.u r2 = r2.a()     // Catch:{ Exception -> 0x00c4 }
            k.d r0 = r2.a(r0)     // Catch:{ Exception -> 0x00c4 }
            k.w r0 = (k.w) r0     // Catch:{ Exception -> 0x00c4 }
            k.c0 r0 = r0.a()     // Catch:{ Exception -> 0x00c4 }
            boolean r2 = r0.b()     // Catch:{ Exception -> 0x00c4 }
            if (r2 != 0) goto L_0x005d
            int r0 = r6 + 1
            java.lang.String r6 = c(r0)     // Catch:{ Exception -> 0x00c4 }
            return r6
        L_0x005d:
            k.e0 r0 = r0.a()     // Catch:{ Exception -> 0x00c4 }
            if (r0 != 0) goto L_0x0065
            r0 = 0
            goto L_0x0069
        L_0x0065:
            java.lang.String r0 = r0.f()     // Catch:{ Exception -> 0x00c4 }
        L_0x0069:
            r2 = 0
            if (r0 == 0) goto L_0x0075
            int r3 = r0.length()     // Catch:{ Exception -> 0x00c4 }
            if (r3 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            if (r3 == 0) goto L_0x007f
            int r0 = r6 + 1
            java.lang.String r6 = c(r0)     // Catch:{ Exception -> 0x00c4 }
            return r6
        L_0x007f:
            if (r6 == 0) goto L_0x0097
            if (r6 == r1) goto L_0x0097
            r2 = 2
            if (r6 == r2) goto L_0x0087
            goto L_0x00ec
        L_0x0087:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = "ip"
            java.lang.String r6 = r2.getString(r0)     // Catch:{ Exception -> 0x00c4 }
            return r6
        L_0x0097:
            java.lang.String r3 = "{"
            r4 = 6
            int r3 = i.t.e.i(r0, r3, r2, r2, r4)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r5 = "}"
            int r2 = i.t.e.i(r0, r5, r2, r2, r4)     // Catch:{ Exception -> 0x00c4 }
            int r2 = r2 + r1
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r0.substring(r3, r2)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            i.o.c.h.d(r0, r2)     // Catch:{ Exception -> 0x00c4 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = "cip"
            java.lang.String r6 = r2.getString(r0)     // Catch:{ Exception -> 0x00c4 }
            return r6
        L_0x00bc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)     // Catch:{ Exception -> 0x00c4 }
            throw r0     // Catch:{ Exception -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            java.lang.String r2 = b
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Get out net ip exception. "
            java.lang.String r0 = i.o.c.h.j(r3, r0)
            java.lang.String r3 = "tag"
            i.o.c.h.e(r2, r3)
            java.lang.String r3 = "message"
            i.o.c.h.e(r0, r3)
            g.c.b.a.j.g r3 = g.c.b.a.l.c.b
            java.lang.String r4 = "ClientChannel|"
            java.lang.String r2 = i.o.c.h.j(r4, r2)
            if (r3 == 0) goto L_0x00e9
            r3.e(r2, r0)
            goto L_0x00ec
        L_0x00e9:
            android.util.Log.e(r2, r0)
        L_0x00ec:
            int r6 = r6 + r1
            java.lang.String r6 = c(r6)
            return r6
        L_0x00f2:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.a.l.d.c(int):java.lang.String");
    }
}
