package g.i.b.f.f.a;

import android.text.TextUtils;
import g.i.b.e.b.e;
import g.i.b.e.b.i;
import g.i.b.e.h.b;
import g.i.b.f.f.c;
import g.i.b.f.h.d;
import g.i.b.f.k.g.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a implements d {
    public String A = "";
    public String B = "";
    public long C = -1;
    public List<String> D = null;
    public volatile boolean E = false;
    public boolean F = false;
    public volatile int G = 0;
    public long H = 0;
    public boolean a = false;
    public c b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public g.i.b.f.k.f.a f4235d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4236e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f4237f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f4238g = 0;

    /* renamed from: h  reason: collision with root package name */
    public String f4239h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f4240i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f4241j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4242k = false;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f4243l = null;

    /* renamed from: m  reason: collision with root package name */
    public String f4244m;
    public a.b n = new a.b();
    public int o = 8192;
    public int p = 8;
    public String q = "";
    public long r = -1;
    public URL s = null;
    public HttpURLConnection t = null;
    public InputStream u = null;
    public String v = "";
    public String w = "";
    public String x = "";
    public String y = "";
    public String z = "";

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r5 == -1) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(g.i.b.f.f.a.c r13) {
        /*
            r12 = this;
            r0 = 0
            g.i.b.f.h.d r2 = g.i.b.f.h.d.a()     // Catch:{ all -> 0x00a4 }
            java.net.HttpURLConnection r3 = r12.t     // Catch:{ all -> 0x00a4 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ all -> 0x00a4 }
            int r4 = r12.G     // Catch:{ all -> 0x00a4 }
            g.i.b.f.h.d$a r5 = new g.i.b.f.h.d$a     // Catch:{ all -> 0x00a4 }
            r5.<init>(r2, r3, r4)     // Catch:{ all -> 0x00a4 }
            java.util.ArrayList<g.i.b.f.h.d$a> r2 = r2.a     // Catch:{ all -> 0x00a4 }
            r2.add(r5)     // Catch:{ all -> 0x00a4 }
            r12.u = r5     // Catch:{ all -> 0x00a4 }
            g.i.b.f.k.g.a$b r2 = r12.n     // Catch:{ all -> 0x00a4 }
            java.util.List<g.i.b.f.k.g.a$a> r3 = r2.a     // Catch:{ all -> 0x00a4 }
            int r3 = r3.size()     // Catch:{ all -> 0x00a4 }
            r4 = 0
            if (r3 != 0) goto L_0x0027
            r2 = 0
            goto L_0x002f
        L_0x0027:
            java.util.List<g.i.b.f.k.g.a$a> r2 = r2.a     // Catch:{ all -> 0x00a4 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x00a4 }
            g.i.b.f.k.g.a$a r2 = (g.i.b.f.k.g.a.C0162a) r2     // Catch:{ all -> 0x00a4 }
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            long r5 = r2.b     // Catch:{ all -> 0x00a4 }
            long r2 = r2.a     // Catch:{ all -> 0x00a4 }
            long r2 = r5 - r2
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
        L_0x003e:
            long r2 = r12.C     // Catch:{ all -> 0x00a4 }
        L_0x0040:
            int r5 = r12.o     // Catch:{ all -> 0x00a4 }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00a4 }
            r6 = 1
            r7 = 1
        L_0x0046:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a8
            g.i.b.f.f.c r8 = r12.b     // Catch:{ all -> 0x00a4 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x00a4 }
            if (r8 == 0) goto L_0x0056
            r12.l()
            return r0
        L_0x0056:
            if (r6 != 0) goto L_0x005c
            r12.l()
            return r0
        L_0x005c:
            int r8 = r12.o     // Catch:{ all -> 0x00a4 }
            long r8 = (long) r8     // Catch:{ all -> 0x00a4 }
            long r10 = r2 - r0
            long r8 = java.lang.Math.min(r8, r10)     // Catch:{ all -> 0x00a4 }
            int r9 = (int) r8     // Catch:{ all -> 0x00a4 }
            java.io.InputStream r8 = r12.u     // Catch:{ all -> 0x00a4 }
            int r8 = r8.read(r5, r4, r9)     // Catch:{ all -> 0x00a4 }
            r9 = -1
            if (r8 != r9) goto L_0x008f
            r13 = -62
            r12.f4238g = r13     // Catch:{ all -> 0x00a4 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "readLen:"
            r13.<init>(r4)     // Catch:{ all -> 0x00a4 }
            r13.append(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = ",dataLen:"
            r13.append(r4)     // Catch:{ all -> 0x00a4 }
            r13.append(r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00a4 }
            r12.f4239h = r13     // Catch:{ all -> 0x00a4 }
            r12.l()
            return r0
        L_0x008f:
            g.i.b.f.f.c r9 = r12.b     // Catch:{ all -> 0x00a4 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x00a4 }
            if (r9 != 0) goto L_0x009e
            r6 = r13
            g.i.b.f.k.g.c r6 = (g.i.b.f.k.g.c) r6     // Catch:{ all -> 0x00a4 }
            boolean r6 = r6.f(r5, r8, r7)     // Catch:{ all -> 0x00a4 }
        L_0x009e:
            if (r7 == 0) goto L_0x00a1
            r7 = 0
        L_0x00a1:
            long r8 = (long) r8
            long r0 = r0 + r8
            goto L_0x0046
        L_0x00a4:
            r13 = move-exception
            r12.c(r13)     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            r12.l()
            return r0
        L_0x00ac:
            r13 = move-exception
            r12.l()
            goto L_0x00b2
        L_0x00b1:
            throw r13
        L_0x00b2:
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.f.a.a.a(g.i.b.f.f.a.c):long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b1 A[Catch:{ NumberFormatException -> 0x0304, all -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b9 A[Catch:{ NumberFormatException -> 0x0304, all -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030f A[Catch:{ NumberFormatException -> 0x0304, all -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x034d A[Catch:{ NumberFormatException -> 0x0304, all -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            java.lang.String r0 = "location:"
            java.lang.String r1 = "CommReq"
            java.lang.String r2 = r15.f4244m
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 2
            if (r2 == 0) goto L_0x0023
            int r2 = r15.c
            if (r2 != r3) goto L_0x0014
            g.i.b.f.k.f.a r2 = r15.f4235d
            goto L_0x001a
        L_0x0014:
            g.i.b.f.k.f.a r2 = r15.f4235d
            boolean r4 = r2.f4332d
            if (r4 == 0) goto L_0x001f
        L_0x001a:
            java.lang.String r2 = r2.a()
            goto L_0x0021
        L_0x001f:
            java.lang.String r2 = r2.a
        L_0x0021:
            r15.f4244m = r2
        L_0x0023:
            r15.f()
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = r15.f4244m     // Catch:{ Exception -> 0x0085 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0085 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = r2.getHost()     // Catch:{ Exception -> 0x0085 }
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r6)     // Catch:{ Exception -> 0x0085 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0085 }
            long r7 = r7 - r4
            r15.r = r7     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "dnstime: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0085 }
            long r7 = r15.r     // Catch:{ Exception -> 0x0085 }
            r4.append(r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0085 }
            g.i.b.e.h.b.c(r1, r4)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = r6.getHostAddress()     // Catch:{ Exception -> 0x0085 }
            r15.q = r4     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "thread name="
            r4.<init>(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0085 }
            r4.append(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "; dns ip="
            r4.append(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r15.q     // Catch:{ Exception -> 0x0085 }
            r4.append(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "; origin url="
            r4.append(r5)     // Catch:{ Exception -> 0x0085 }
            r4.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0085 }
            g.i.b.e.h.b.c(r1, r2)     // Catch:{ Exception -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0089:
            r2 = 0
            r4 = 0
        L_0x008b:
            int r5 = r15.p
            r6 = -57
            if (r4 >= r5) goto L_0x03e5
            g.i.b.f.f.c r5 = r15.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x009a
            return
        L_0x009a:
            r15.f4238g = r2
            java.lang.String r5 = ""
            r15.f4239h = r5
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x039b }
            java.lang.String r7 = r15.f4244m     // Catch:{ MalformedURLException -> 0x039b }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x039b }
            r15.s = r5     // Catch:{ MalformedURLException -> 0x039b }
            java.lang.String r5 = "DualNetworkManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0393 }
            java.lang.String r8 = "canDownloadByDual, isThreadOpenDual="
            r7.<init>(r8)     // Catch:{ IOException -> 0x0393 }
            boolean r8 = r15.f4242k     // Catch:{ IOException -> 0x0393 }
            r7.append(r8)     // Catch:{ IOException -> 0x0393 }
            java.lang.String r8 = "; isDualOpen="
            r7.append(r8)     // Catch:{ IOException -> 0x0393 }
            g.i.b.f.h.a r8 = g.i.b.f.h.a.a()     // Catch:{ IOException -> 0x0393 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ IOException -> 0x0393 }
            r7.append(r2)     // Catch:{ IOException -> 0x0393 }
            java.lang.String r8 = "; isSDKVersionMatch="
            r7.append(r8)     // Catch:{ IOException -> 0x0393 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0393 }
            r9 = 21
            r10 = 1
            if (r8 < r9) goto L_0x00d4
            r8 = 1
            goto L_0x00d5
        L_0x00d4:
            r8 = 0
        L_0x00d5:
            r7.append(r8)     // Catch:{ IOException -> 0x0393 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0393 }
            g.i.b.e.h.b.f(r5, r7)     // Catch:{ IOException -> 0x0393 }
            boolean r5 = r15.f4242k     // Catch:{ IOException -> 0x0393 }
            if (r5 == 0) goto L_0x00ea
            g.i.b.f.h.a r5 = g.i.b.f.h.a.a()     // Catch:{ IOException -> 0x0393 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x0393 }
        L_0x00ea:
            java.lang.String r5 = "canDownloadByDual: false"
            g.i.b.e.h.b.c(r1, r5)     // Catch:{ IOException -> 0x0393 }
            java.net.URL r5 = r15.s     // Catch:{ IOException -> 0x0393 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ IOException -> 0x0393 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0393 }
            r15.t = r5     // Catch:{ IOException -> 0x0393 }
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = 60000(0xea60, float:8.4078E-41)
            r9 = 20000(0x4e20, float:2.8026E-41)
            java.lang.String r11 = "down_conn_timeout"
            int r11 = g.h.a.a.b(r11, r7, r8, r9)
            r5.setConnectTimeout(r11)
            java.net.HttpURLConnection r5 = r15.t
            java.lang.String r11 = "down_read_timeout"
            int r7 = g.h.a.a.b(r11, r7, r8, r9)
            r5.setReadTimeout(r7)
            java.net.HttpURLConnection r5 = r15.t
            r5.setUseCaches(r2)
            java.net.HttpURLConnection r5 = r15.t
            r5.setDoInput(r10)
            java.net.HttpURLConnection r5 = r15.t
            r5.setInstanceFollowRedirects(r2)
            g.i.b.f.k.g.a$b r5 = r15.n
            java.util.List<g.i.b.f.k.g.a$a> r5 = r5.a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x013a
            java.net.HttpURLConnection r5 = r15.t
            g.i.b.f.k.g.a$b r7 = r15.n
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Range"
            r5.addRequestProperty(r8, r7)
        L_0x013a:
            java.net.HttpURLConnection r5 = r15.t
            java.lang.String r7 = "Connection"
            java.lang.String r8 = "close"
            r5.addRequestProperty(r7, r8)
            java.util.Map<java.lang.String, java.lang.String> r5 = r15.f4237f
            java.lang.String r7 = "host"
            java.lang.String r8 = "User-Agent"
            if (r5 == 0) goto L_0x017d
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
            r9 = 0
            r11 = 0
        L_0x0155:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x017f
            java.lang.Object r12 = r5.next()
            java.lang.String r12 = (java.lang.String) r12
            java.util.Map<java.lang.String, java.lang.String> r13 = r15.f4237f
            java.lang.Object r13 = r13.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            java.net.HttpURLConnection r14 = r15.t
            r14.addRequestProperty(r12, r13)
            boolean r13 = r8.equalsIgnoreCase(r12)
            if (r13 == 0) goto L_0x0175
            r9 = 1
        L_0x0175:
            boolean r12 = r12.equalsIgnoreCase(r7)
            if (r12 == 0) goto L_0x0155
            r11 = 1
            goto L_0x0155
        L_0x017d:
            r9 = 0
            r11 = 0
        L_0x017f:
            if (r9 != 0) goto L_0x0188
            java.net.HttpURLConnection r5 = r15.t
            java.lang.String r9 = "HalleyService/3.0"
            r5.addRequestProperty(r8, r9)
        L_0x0188:
            java.util.Map<java.lang.String, java.lang.String> r5 = r15.f4241j
            if (r5 == 0) goto L_0x01d7
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x01d7
            java.util.Map<java.lang.String, java.lang.String> r5 = r15.f4241j
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x019c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01d7
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r8.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01af
            r11 = 1
        L_0x01af:
            java.lang.String r9 = "range"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 != 0) goto L_0x019c
            java.net.HttpURLConnection r9 = r15.t
            java.net.URL r9 = r9.getURL()
            java.lang.String r9 = r9.getPath()
            java.lang.String r12 = r15.f4240i
            boolean r9 = r9.contains(r12)
            if (r9 != 0) goto L_0x019c
            java.util.Map<java.lang.String, java.lang.String> r9 = r15.f4241j
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.net.HttpURLConnection r12 = r15.t
            r12.addRequestProperty(r8, r9)
            goto L_0x019c
        L_0x01d7:
            if (r11 != 0) goto L_0x01eb
            java.lang.String r5 = r15.f4240i
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01eb
            g.i.b.f.k.f.a r5 = r15.f4235d
            g.i.b.f.k.f.a$a r5 = r5.b
            g.i.b.f.k.f.a$a r7 = g.i.b.f.k.f.a.C0161a.Type_CDN_Ip_Socket_Schedule
            if (r5 != r7) goto L_0x01eb
            r5 = 1
            goto L_0x01ec
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            if (r5 == 0) goto L_0x0209
            java.net.HttpURLConnection r5 = r15.t
            java.net.URL r5 = r5.getURL()
            java.lang.String r5 = r5.getPath()
            java.lang.String r7 = r15.f4240i
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L_0x0209
            java.net.HttpURLConnection r5 = r15.t
            java.lang.String r7 = r15.f4240i
            java.lang.String r8 = "Host"
            r5.addRequestProperty(r8, r7)
        L_0x0209:
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            int r5 = r5.getResponseCode()     // Catch:{ all -> 0x038e }
            r15.F = r10     // Catch:{ all -> 0x038e }
            r7 = 200(0xc8, float:2.8E-43)
            if (r5 == r7) goto L_0x0280
            r7 = 206(0xce, float:2.89E-43)
            if (r5 == r7) goto L_0x0280
            r7 = 307(0x133, float:4.3E-43)
            if (r5 == r7) goto L_0x0245
            r7 = 413(0x19d, float:5.79E-43)
            if (r5 == r7) goto L_0x0229
            r7 = 500(0x1f4, float:7.0E-43)
            if (r5 == r7) goto L_0x0229
            switch(r5) {
                case 301: goto L_0x0245;
                case 302: goto L_0x0245;
                case 303: goto L_0x0245;
                default: goto L_0x0228;
            }     // Catch:{ all -> 0x038e }
        L_0x0228:
            goto L_0x0241
        L_0x0229:
            boolean r7 = g.i.b.e.b.e.a     // Catch:{ all -> 0x038e }
            if (r7 == 0) goto L_0x0238
            boolean r7 = r15.a     // Catch:{ all -> 0x038e }
            if (r7 != 0) goto L_0x0238
            boolean r7 = r15.k()     // Catch:{ all -> 0x038e }
            if (r7 == 0) goto L_0x0238
            goto L_0x0239
        L_0x0238:
            r10 = 0
        L_0x0239:
            if (r10 == 0) goto L_0x0241
            r5 = -59
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x0241:
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x0245:
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "location"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r7 == 0) goto L_0x0261
            r7 = -58
            r15.f4238g = r7     // Catch:{ all -> 0x038e }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x038e }
            java.lang.String r5 = r0.concat(r5)     // Catch:{ all -> 0x038e }
            goto L_0x035c
        L_0x0261:
            java.lang.String r5 = r15.e(r5)     // Catch:{ all -> 0x038e }
            r15.f4244m = r5     // Catch:{ all -> 0x038e }
            java.util.List<java.lang.String> r7 = r15.f4243l     // Catch:{ all -> 0x038e }
            if (r7 != 0) goto L_0x0272
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x038e }
            r7.<init>()     // Catch:{ all -> 0x038e }
            r15.f4243l = r7     // Catch:{ all -> 0x038e }
        L_0x0272:
            java.util.List<java.lang.String> r7 = r15.f4243l     // Catch:{ all -> 0x038e }
            r7.add(r5)     // Catch:{ all -> 0x038e }
            r15.f4244m = r5     // Catch:{ all -> 0x038e }
            r15.d(r5)     // Catch:{ all -> 0x038e }
            r15.f4238g = r6     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x0280:
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "Content-Type"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.v = r5     // Catch:{ all -> 0x038e }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r7 != 0) goto L_0x02ae
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "text/html"
            boolean r7 = r5.startsWith(r7)     // Catch:{ all -> 0x038e }
            if (r7 != 0) goto L_0x02ac
            java.lang.String r7 = "text/vnd.wap.wml"
            boolean r7 = r5.startsWith(r7)     // Catch:{ all -> 0x038e }
            if (r7 != 0) goto L_0x02ac
            java.lang.String r7 = "text/webviewhtml"
            boolean r5 = r5.startsWith(r7)     // Catch:{ all -> 0x038e }
            if (r5 == 0) goto L_0x02ae
        L_0x02ac:
            r5 = 1
            goto L_0x02af
        L_0x02ae:
            r5 = 0
        L_0x02af:
            if (r5 == 0) goto L_0x02b9
            r5 = -11
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            java.lang.String r5 = r15.f4244m     // Catch:{ all -> 0x038e }
            goto L_0x035c
        L_0x02b9:
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "Content-Range"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.w = r5     // Catch:{ all -> 0x038e }
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "Content-Length"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.x = r5     // Catch:{ all -> 0x038e }
            boolean r5 = r15.k()     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "content-range header:"
            r8 = -1
            if (r5 == 0) goto L_0x0322
            java.lang.String r5 = r15.w     // Catch:{ all -> 0x038e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r5 == 0) goto L_0x02e5
            r5 = -53
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x02e5:
            java.lang.String r5 = r15.w     // Catch:{ all -> 0x038e }
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r11 == 0) goto L_0x02ee
            goto L_0x0308
        L_0x02ee:
            java.lang.String r11 = "/"
            java.lang.String[] r5 = r5.split(r11)     // Catch:{ all -> 0x038e }
            if (r5 == 0) goto L_0x0308
            int r11 = r5.length     // Catch:{ all -> 0x038e }
            if (r11 != r3) goto L_0x0308
            r5 = r5[r10]     // Catch:{ NumberFormatException -> 0x0304 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0304 }
            long r10 = r5.longValue()     // Catch:{ NumberFormatException -> 0x0304 }
            goto L_0x0309
        L_0x0304:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x038e }
        L_0x0308:
            r10 = r8
        L_0x0309:
            r15.C = r10     // Catch:{ all -> 0x038e }
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x035f
            r5 = -54
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x038e }
            r5.<init>(r7)     // Catch:{ all -> 0x038e }
            java.lang.String r7 = r15.w     // Catch:{ all -> 0x038e }
            r5.append(r7)     // Catch:{ all -> 0x038e }
        L_0x031d:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x038e }
            goto L_0x035c
        L_0x0322:
            java.lang.String r5 = r15.x     // Catch:{ all -> 0x038e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r5 == 0) goto L_0x0330
            r5 = -55
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x0330:
            java.lang.String r5 = r15.x     // Catch:{ all -> 0x038e }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038e }
            if (r10 == 0) goto L_0x0339
            goto L_0x0346
        L_0x0339:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0342 }
            long r10 = r5.longValue()     // Catch:{ NumberFormatException -> 0x0342 }
            goto L_0x0347
        L_0x0342:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x038e }
        L_0x0346:
            r10 = r8
        L_0x0347:
            r15.C = r10     // Catch:{ all -> 0x038e }
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x035f
            r5 = -56
            r15.f4238g = r5     // Catch:{ all -> 0x038e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x038e }
            r5.<init>(r7)     // Catch:{ all -> 0x038e }
            java.lang.String r7 = r15.x     // Catch:{ all -> 0x038e }
            r5.append(r7)     // Catch:{ all -> 0x038e }
            goto L_0x031d
        L_0x035c:
            r15.f4239h = r5     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x035f:
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "etag"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.z = r5     // Catch:{ all -> 0x038e }
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "Last-Modified"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.A = r5     // Catch:{ all -> 0x038e }
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "Content-Disposition"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.y = r5     // Catch:{ all -> 0x038e }
            java.net.HttpURLConnection r5 = r15.t     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "X-NWS-LOG-UUID"
            java.lang.String r5 = r5.getHeaderField(r7)     // Catch:{ all -> 0x038e }
            r15.B = r5     // Catch:{ all -> 0x038e }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x038e }
            r15.H = r7     // Catch:{ all -> 0x038e }
            goto L_0x03a9
        L_0x038e:
            r5 = move-exception
            r15.c(r5)
            goto L_0x03a9
        L_0x0393:
            r5 = move-exception
            r15.c(r5)
            r5.printStackTrace()
            goto L_0x03a9
        L_0x039b:
            r5 = move-exception
            r7 = -51
            r15.f4238g = r7
            java.lang.String r7 = g.h.a.a.f(r5)
            r15.f4239h = r7
            r5.printStackTrace()
        L_0x03a9:
            if (r4 != 0) goto L_0x03c4
            boolean r5 = r15.F
            if (r5 == 0) goto L_0x03c4
            java.net.URL r5 = r15.s     // Catch:{ Exception -> 0x03c0 }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x03c0 }
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ Exception -> 0x03c0 }
            java.lang.String r5 = r5.getHostAddress()     // Catch:{ Exception -> 0x03c0 }
            r15.q = r5     // Catch:{ Exception -> 0x03c0 }
            goto L_0x03c4
        L_0x03c0:
            r5 = move-exception
            r5.printStackTrace()
        L_0x03c4:
            int r5 = r15.f4238g
            if (r5 != r6) goto L_0x03e5
            boolean r5 = r15.f4236e
            if (r5 == 0) goto L_0x03e1
            r1 = -74
            r15.f4238g = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r15.f4244m
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.f4239h = r0
            goto L_0x03e5
        L_0x03e1:
            int r4 = r4 + 1
            goto L_0x008b
        L_0x03e5:
            int r0 = r15.p
            if (r4 < r0) goto L_0x03f0
            int r0 = r15.f4238g
            if (r0 != r6) goto L_0x03f0
            r0 = -1
            r15.f4238g = r0
        L_0x03f0:
            int r0 = r15.f4238g
            if (r0 != 0) goto L_0x0419
            g.i.b.f.k.f.a r0 = r15.f4235d     // Catch:{ Exception -> 0x0415 }
            java.lang.String r0 = r0.f4333e     // Catch:{ Exception -> 0x0415 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0415 }
            if (r0 != 0) goto L_0x03ff
            return
        L_0x03ff:
            java.lang.String r0 = r15.h()     // Catch:{ Exception -> 0x0415 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0415 }
            if (r1 != 0) goto L_0x040e
            g.i.b.f.k.f.a r1 = r15.f4235d     // Catch:{ Exception -> 0x0415 }
            r1.f4333e = r0     // Catch:{ Exception -> 0x0415 }
            return
        L_0x040e:
            g.i.b.f.k.f.a r0 = r15.f4235d     // Catch:{ Exception -> 0x0415 }
            java.lang.String r1 = r0.a     // Catch:{ Exception -> 0x0415 }
            r0.f4333e = r1     // Catch:{ Exception -> 0x0415 }
            return
        L_0x0415:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.f.a.a.b():void");
    }

    public final void c(Throwable th) {
        boolean z2;
        int i2;
        th.printStackTrace();
        b.e("CommReq", "handleException:", th);
        this.f4239h = g.h.a.a.f(th);
        boolean z3 = true;
        if (this.E) {
            this.f4238g = -66;
            z2 = true;
        } else {
            z2 = false;
        }
        if (e.h()) {
            this.f4238g = -77;
            z2 = true;
        }
        if (!e.f4109d) {
            this.f4238g = -15;
            z2 = true;
        }
        if (!i.a()) {
            this.f4238g = -16;
        } else {
            z3 = z2;
        }
        if (!z3) {
            try {
                if (th.getMessage().contains("Permission")) {
                    i2 = -71;
                    this.f4238g = i2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (!(th instanceof Exception)) {
                i2 = -70;
            } else {
                int i3 = -48;
                if (th instanceof SocketTimeoutException) {
                    i3 = -25;
                }
                if (th instanceof UnknownHostException) {
                    i3 = -29;
                }
                if (th instanceof ConnectException) {
                    i3 = -24;
                }
                if (th instanceof SocketException) {
                    i3 = -26;
                }
                i2 = th instanceof IOException ? -27 : i3;
            }
            this.f4238g = i2;
        }
    }

    public final void d(String str) {
        int indexOf;
        HttpURLConnection httpURLConnection = this.t;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("X-Extra-Servers") : "";
        if (!TextUtils.isEmpty(headerField)) {
            try {
                if ("http".equals(new URL(str).getProtocol()) && str.startsWith("http://") && (indexOf = str.indexOf("/", 7)) != -1) {
                    String substring = str.substring(indexOf);
                    String[] split = headerField.split(";");
                    if (split != null && split.length > 0) {
                        this.D = new ArrayList();
                        for (String str2 : split) {
                            List<String> list = this.D;
                            list.add("http://" + str2 + substring);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String e(String str) {
        try {
            if (str.startsWith("/")) {
                URL url = new URL(this.f4235d.a);
                String protocol = url.getProtocol();
                String host = url.getHost();
                return protocol + "://" + host + str;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public final void f() {
        if (this.t != null) {
            if (b.c == null) {
                synchronized (b.class) {
                    if (b.c == null) {
                        b.c = new b();
                    }
                }
            }
            b bVar = b.c;
            try {
                b.b.put(this.t);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final String g() {
        return g.i.b.e.h.e.d(this.f4244m, false);
    }

    public final String h() {
        List<String> list = this.f4243l;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<String> list2 = this.f4243l;
        return list2.get(list2.size() - 1);
    }

    public final String i() {
        String str;
        List<String> list = this.f4243l;
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            List<String> list2 = this.f4243l;
            str = list2.get(list2.size() - 1);
        }
        return g.i.b.e.h.e.d(str, false);
    }

    public final String j() {
        List<String> list = this.f4243l;
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = this.f4243l.size() - 1;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(g.i.b.e.h.e.d(this.f4243l.get(i2), false));
            sb.append("-");
        }
        return sb.toString();
    }

    public final boolean k() {
        return this.n.a.size() > 0;
    }

    public final void l() {
        try {
            d a2 = d.a();
            InputStream inputStream = this.u;
            Objects.requireNonNull(a2);
            if ((inputStream instanceof d.a) && a2.a.contains(inputStream)) {
                a2.a.remove(inputStream);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.E) {
            this.f4238g = -66;
        }
        f();
    }
}
