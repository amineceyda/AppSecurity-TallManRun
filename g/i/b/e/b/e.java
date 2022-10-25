package g.i.b.e.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e {
    public static volatile boolean a = false;
    public static String b = "";
    public static volatile byte c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f4109d = true;

    /* renamed from: e  reason: collision with root package name */
    public static String f4110e = "";

    /* renamed from: f  reason: collision with root package name */
    public static String f4111f = "unknown";

    /* renamed from: g  reason: collision with root package name */
    public static volatile int f4112g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static volatile int f4113h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static Map<String, g> f4114i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    public static BroadcastReceiver f4115j = new a();

    public static class a extends BroadcastReceiver {

        /* renamed from: g.i.b.e.b.e$a$a  reason: collision with other inner class name */
        public class C0147a implements Runnable {

            /* renamed from: g.i.b.e.b.e$a$a$a  reason: collision with other inner class name */
            public class C0148a implements Runnable {
                public C0148a(C0147a aVar) {
                }

                public final void run() {
                    try {
                        g.i.b.e.h.b.c("ApnInfo", "delay call update ip type..");
                        e.i();
                    } catch (Throwable unused) {
                    }
                }
            }

            public C0147a(a aVar) {
            }

            public final void run() {
                try {
                    e.d();
                    if (e.i()) {
                        g.i.b.e.c.n.postDelayed(new C0148a(this), 2000);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            g.i.b.e.c.n.post(new C0147a(this));
        }
    }

    public final class b {
        public String a;
        public Map<String, c> b = new HashMap();

        public b(String str) {
            this.a = str;
        }
    }

    public final class c {
        public String a;
        public String b;
        public List<b> c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f4116d;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static void a(String str, g gVar) {
        synchronized (f4114i) {
            f4114i.put(str, gVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte b(java.lang.String r8) {
        /*
            java.lang.String r0 = "%"
            r1 = 0
            java.net.NetworkInterface r8 = java.net.NetworkInterface.getByName(r8)     // Catch:{ Exception -> 0x0097 }
            boolean r2 = r8.isUp()     // Catch:{ Exception -> 0x0097 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            java.lang.String r8 = "ApnInfo"
            java.lang.String r0 = "networkInterface is down just pass it.."
            g.i.b.e.h.b.c(r8, r0)     // Catch:{ Exception -> 0x0097 }
            return r3
        L_0x0016:
            java.util.List r8 = r8.getInterfaceAddresses()     // Catch:{ Exception -> 0x0097 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0097 }
            r2 = 0
            r4 = 0
        L_0x0020:
            boolean r5 = r8.hasNext()     // Catch:{ Exception -> 0x0097 }
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r8.next()     // Catch:{ Exception -> 0x0097 }
            java.net.InterfaceAddress r5 = (java.net.InterfaceAddress) r5     // Catch:{ Exception -> 0x0097 }
            java.net.InetAddress r5 = r5.getAddress()     // Catch:{ Exception -> 0x0097 }
            boolean r6 = r5.isLoopbackAddress()     // Catch:{ Exception -> 0x0097 }
            if (r6 != 0) goto L_0x0020
            java.lang.String r5 = r5.getHostAddress()     // Catch:{ Exception -> 0x0097 }
            boolean r6 = r5.contains(r0)     // Catch:{ Exception -> 0x0097 }
            if (r6 == 0) goto L_0x0046
            java.lang.String[] r5 = r5.split(r0)     // Catch:{ Exception -> 0x0097 }
            r5 = r5[r1]     // Catch:{ Exception -> 0x0097 }
        L_0x0046:
            boolean r6 = g.h.a.a.o(r5)     // Catch:{ Exception -> 0x0097 }
            if (r6 == 0) goto L_0x004e
            r2 = 1
            goto L_0x0020
        L_0x004e:
            if (r4 != 0) goto L_0x0020
            boolean r6 = g.h.a.a.r(r5)     // Catch:{ Exception -> 0x0097 }
            if (r6 == 0) goto L_0x0020
            java.lang.String r6 = ":"
            boolean r7 = r5.startsWith(r6)     // Catch:{ Exception -> 0x0097 }
            if (r7 != 0) goto L_0x0084
            boolean r7 = r5.contains(r6)     // Catch:{ Exception -> 0x0097 }
            if (r7 != 0) goto L_0x0065
            goto L_0x0084
        L_0x0065:
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ Exception -> 0x0097 }
            r5 = r5[r1]     // Catch:{ Exception -> 0x0097 }
            r6 = 16
            int r5 = java.lang.Integer.parseInt(r5, r6)     // Catch:{ NumberFormatException -> 0x0080 }
            if (r5 < 0) goto L_0x0084
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto L_0x0079
            goto L_0x0084
        L_0x0079:
            int r5 = r5 >> 13
            r5 = r5 ^ r3
            if (r5 != 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0080:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ Exception -> 0x0097 }
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r5 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0020
        L_0x0089:
            if (r2 == 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            r8 = 2
            return r8
        L_0x008f:
            if (r4 == 0) goto L_0x0093
            r8 = 3
            return r8
        L_0x0093:
            if (r2 == 0) goto L_0x0096
            return r3
        L_0x0096:
            return r1
        L_0x0097:
            r8 = move-exception
            r8.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.e.b(java.lang.String):byte");
    }

    public static String c() {
        int i2 = f4112g;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "4g" : "3g" : "2g" : "wifi";
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static synchronized void d() {
        /*
            java.lang.Class<g.i.b.e.b.e> r0 = g.i.b.e.b.e.class
            monitor-enter(r0)
            int r1 = f4112g     // Catch:{ all -> 0x0185 }
            android.content.Context r2 = g.i.b.e.c.f4125g     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x0124 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ all -> 0x0124 }
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ all -> 0x0124 }
            r3 = 0
            if (r2 == 0) goto L_0x00f0
            boolean r4 = r2.isAvailable()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00f0
            boolean r4 = r2.isConnected()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00f0
            r4 = 1
            f4109d = r4     // Catch:{ all -> 0x0124 }
            int r5 = r2.getType()     // Catch:{ all -> 0x0124 }
            if (r5 != r4) goto L_0x0060
            f4112g = r4     // Catch:{ all -> 0x0124 }
            f4113h = r3     // Catch:{ all -> 0x0124 }
            a = r3     // Catch:{ all -> 0x0124 }
            android.content.Context r2 = g.i.b.e.c.f4125g     // Catch:{ all -> 0x0124 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x0124 }
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch:{ all -> 0x0124 }
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = "ssid_"
            r3.<init>(r4)     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = r2.getSSID()     // Catch:{ all -> 0x0124 }
            r3.append(r4)     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = r2.getBSSID()     // Catch:{ all -> 0x0124 }
            r3.append(r2)     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0124 }
            f4111f = r2     // Catch:{ all -> 0x0124 }
            goto L_0x00f7
        L_0x0060:
            java.lang.String r3 = r2.getExtraInfo()     // Catch:{ all -> 0x0124 }
            if (r3 != 0) goto L_0x006b
        L_0x0066:
            j()     // Catch:{ all -> 0x0124 }
            goto L_0x00f7
        L_0x006b:
            if (r5 == 0) goto L_0x006e
            goto L_0x0066
        L_0x006e:
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0124 }
            f4110e = r3     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = "apn_"
            r3.<init>(r5)     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = f4110e     // Catch:{ all -> 0x0124 }
            r3.append(r5)     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0124 }
            f4111f = r3     // Catch:{ all -> 0x0124 }
            int r2 = r2.getSubtype()     // Catch:{ all -> 0x0124 }
            f4113h = r2     // Catch:{ all -> 0x0124 }
            r3 = 2
            if (r2 == r4) goto L_0x00a9
            if (r2 == r3) goto L_0x00a9
            r4 = 4
            if (r2 != r4) goto L_0x0099
            goto L_0x00a9
        L_0x0099:
            r3 = 13
            if (r2 == r3) goto L_0x00a6
            r3 = 19
            if (r2 != r3) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            r2 = 3
            f4112g = r2     // Catch:{ all -> 0x0124 }
            goto L_0x00ab
        L_0x00a6:
            f4112g = r4     // Catch:{ all -> 0x0124 }
            goto L_0x00ab
        L_0x00a9:
            f4112g = r3     // Catch:{ all -> 0x0124 }
        L_0x00ab:
            java.lang.String r2 = f4110e     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "wap"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0124 }
            a = r2     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r2 = f4110e     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "3gwap"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00c6
            java.lang.String r2 = "10.0.0.172"
        L_0x00c3:
            b = r2     // Catch:{ all -> 0x0124 }
            goto L_0x00f7
        L_0x00c6:
            java.lang.String r2 = f4110e     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "cmwap"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = "10.0.0.172"
            goto L_0x00c3
        L_0x00d3:
            java.lang.String r2 = f4110e     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "uniwap"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "10.0.0.172"
            goto L_0x00c3
        L_0x00e0:
            java.lang.String r2 = f4110e     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "ctwap"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = "10.0.0.200"
            goto L_0x00c3
        L_0x00ed:
            java.lang.String r2 = ""
            goto L_0x00c3
        L_0x00f0:
            j()     // Catch:{ all -> 0x0124 }
            f4109d = r3     // Catch:{ all -> 0x0124 }
            c = r3     // Catch:{ all -> 0x0124 }
        L_0x00f7:
            int r2 = f4112g     // Catch:{ all -> 0x0185 }
            if (r1 == r2) goto L_0x0155
            java.util.Map<java.lang.String, g.i.b.e.b.g> r1 = f4114i     // Catch:{ all -> 0x0185 }
            monitor-enter(r1)     // Catch:{ all -> 0x0185 }
            java.util.Map<java.lang.String, g.i.b.e.b.g> r2 = f4114i     // Catch:{ all -> 0x0121 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0108:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0121 }
            g.i.b.e.b.g r3 = (g.i.b.e.b.g) r3     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x0108
            int r4 = f4112g     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = f4111f     // Catch:{ all -> 0x0121 }
            r3.a(r4, r5)     // Catch:{ all -> 0x0121 }
            goto L_0x0108
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0121 }
            monitor-exit(r0)
            return
        L_0x0121:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0121 }
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0124:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0157 }
            int r2 = f4112g     // Catch:{ all -> 0x0185 }
            if (r1 == r2) goto L_0x0155
            java.util.Map<java.lang.String, g.i.b.e.b.g> r1 = f4114i     // Catch:{ all -> 0x0185 }
            monitor-enter(r1)     // Catch:{ all -> 0x0185 }
            java.util.Map<java.lang.String, g.i.b.e.b.g> r2 = f4114i     // Catch:{ all -> 0x0152 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0152 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0152 }
        L_0x0139:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x014f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0152 }
            g.i.b.e.b.g r3 = (g.i.b.e.b.g) r3     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x0139
            int r4 = f4112g     // Catch:{ all -> 0x0152 }
            java.lang.String r5 = f4111f     // Catch:{ all -> 0x0152 }
            r3.a(r4, r5)     // Catch:{ all -> 0x0152 }
            goto L_0x0139
        L_0x014f:
            monitor-exit(r1)     // Catch:{ all -> 0x0152 }
            monitor-exit(r0)
            return
        L_0x0152:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0152 }
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0155:
            monitor-exit(r0)
            return
        L_0x0157:
            r2 = move-exception
            int r3 = f4112g     // Catch:{ all -> 0x0185 }
            if (r1 == r3) goto L_0x0184
            java.util.Map<java.lang.String, g.i.b.e.b.g> r1 = f4114i     // Catch:{ all -> 0x0185 }
            monitor-enter(r1)     // Catch:{ all -> 0x0185 }
            java.util.Map<java.lang.String, g.i.b.e.b.g> r3 = f4114i     // Catch:{ all -> 0x0181 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0181 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0181 }
        L_0x0169:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0181 }
            if (r4 == 0) goto L_0x017f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0181 }
            g.i.b.e.b.g r4 = (g.i.b.e.b.g) r4     // Catch:{ all -> 0x0181 }
            if (r4 == 0) goto L_0x0169
            int r5 = f4112g     // Catch:{ all -> 0x0181 }
            java.lang.String r6 = f4111f     // Catch:{ all -> 0x0181 }
            r4.a(r5, r6)     // Catch:{ all -> 0x0181 }
            goto L_0x0169
        L_0x017f:
            monitor-exit(r1)     // Catch:{ all -> 0x0181 }
            goto L_0x0184
        L_0x0181:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0181 }
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0184:
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0189
        L_0x0188:
            throw r1
        L_0x0189:
            goto L_0x0188
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.e.d():void");
    }

    public static boolean e() {
        return f4112g == 2 || f4112g == 3 || f4112g == 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0.equals("46003") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r0.contains("ctwap") == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer f() {
        /*
            d()
            boolean r0 = e()
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            android.content.Context r0 = g.i.b.e.c.f4125g
            java.lang.String r2 = f4110e
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0053
            int r6 = r0.getSimState()
            r7 = 5
            if (r6 != r7) goto L_0x0053
            java.lang.String r0 = r0.getSimOperator()
            int r6 = r0.length()
            if (r6 <= 0) goto L_0x0053
            java.lang.String r6 = "46000"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00a1
            java.lang.String r6 = "46002"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x003d
            goto L_0x00a1
        L_0x003d:
            java.lang.String r6 = "46001"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0046
            goto L_0x009c
        L_0x0046:
            java.lang.String r6 = "46003"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0053
        L_0x004e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x00aa
        L_0x0053:
            if (r2 == 0) goto L_0x00a6
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r2 = "cmnet"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = "cmwap"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x006a
            goto L_0x00a1
        L_0x006a:
            java.lang.String r2 = "uninet"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = "uniwap"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = "3gnet"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = "3gwap"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            java.lang.String r2 = "ctnet"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = "ctwap"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00a6
            goto L_0x004e
        L_0x009c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x00aa
        L_0x00a1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x00aa
        L_0x00a6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x00aa:
            int r1 = r0.intValue()
        L_0x00ae:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.e.f():java.lang.Integer");
    }

    public static Proxy g() {
        if (!a || TextUtils.isEmpty(b)) {
            return null;
        }
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(b, 80));
    }

    public static boolean h() {
        try {
            PowerManager powerManager = (PowerManager) g.i.b.e.c.f4125g.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 23 && powerManager != null) {
                return ((Boolean) PowerManager.class.getDeclaredMethod("isDeviceIdleMode", new Class[0]).invoke(powerManager, new Object[0])).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT < 21) {
            c = 1;
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) g.i.b.e.c.f4125g.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
            c = 0;
            g.i.b.e.h.b.c("ApnInfo", "not obtain ip type");
            return false;
        }
        g.i.b.e.h.b.c("ApnInfo", "ready to obtain iptype");
        try {
            LinkProperties linkProperties = (LinkProperties) ConnectivityManager.class.getDeclaredMethod("getActiveLinkProperties", new Class[0]).invoke(connectivityManager, new Object[0]);
            if (linkProperties == null) {
                g.i.b.e.h.b.c("ApnInfo", "activeLinkProperties is null");
                c = 0;
            } else {
                c = b(linkProperties.getInterfaceName());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            c = 0;
        }
        g.i.b.e.h.b.c("ApnInfo", "IPType is:" + c);
        return true;
    }

    public static void j() {
        f4110e = "unknown";
        f4112g = 0;
        f4113h = -1;
        f4111f = "unknown";
        a = false;
    }
}
