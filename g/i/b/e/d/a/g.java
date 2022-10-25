package g.i.b.e.d.a;

import android.os.SystemClock;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.i.b.e.b.e;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class g extends a {
    public a A = new a((byte) 0);
    public e B;

    /* renamed from: m  reason: collision with root package name */
    public long f4148m;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public HttpURLConnection q;
    public DataOutputStream r;
    public DataInputStream s;
    public f t;
    public String u;
    public boolean v;
    public boolean w;
    public int x;
    public long y = 0;
    public String z;

    public static class a {
        public long a;
        public long b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public long f4149d;

        /* renamed from: e  reason: collision with root package name */
        public long f4150e;

        /* renamed from: f  reason: collision with root package name */
        public long f4151f;

        /* renamed from: g  reason: collision with root package name */
        public long f4152g = -1;

        /* renamed from: h  reason: collision with root package name */
        public long f4153h = -1;

        /* renamed from: i  reason: collision with root package name */
        public long f4154i = -1;

        /* renamed from: j  reason: collision with root package name */
        public long f4155j = -1;

        /* renamed from: k  reason: collision with root package name */
        public long f4156k = -1;

        public a(byte b2) {
        }

        public static long a(long j2) {
            if (j2 >= 0) {
                return j2;
            }
            return -1;
        }

        public final void b() {
            long j2 = this.b;
            long j3 = j2 - this.a;
            this.f4152g = j3;
            long j4 = this.c;
            this.f4153h = j4 - j2;
            long j5 = this.f4149d;
            this.f4154i = j5 - j4;
            long j6 = this.f4150e;
            this.f4155j = j6 - j5;
            this.f4156k = this.f4151f - j6;
            this.f4152g = a(j3);
            this.f4153h = a(this.f4153h);
            this.f4154i = a(this.f4154i);
            this.f4155j = a(this.f4155j);
            this.f4156k = a(this.f4156k);
        }

        public final String toString() {
            return "Stat{startToTryConnect=" + this.f4152g + ", connectCost=" + this.f4153h + ", connectToPost=" + this.f4154i + ", postToRsp=" + this.f4155j + ", rspToRead=" + this.f4156k + MessageFormatter.DELIM_STOP;
        }
    }

    public g(String str, String str2, boolean z2, Map<String, String> map, byte[] bArr, int i2, String str3) {
        boolean z3 = false;
        this.u = str;
        this.a = str2;
        this.b = z2;
        this.c = map;
        this.f4132d = bArr;
        int b = e.f4112g == 2 ? g.h.a.a.b("direct_access_time_out", 1000, 60000, 15000) : g.h.a.a.b("direct_access_time_out", 1000, 60000, AbstractNetAdapter.READ_TIMEOUT);
        this.f4133e = g.i.b.e.h.e.a(i2 < b ? i2 : b, 200, 60000, AbstractNetAdapter.READ_TIMEOUT);
        if (this.a.length() > 8 && (this.a.charAt(7) == '[' || this.a.charAt(8) == '[')) {
            z3 = true;
        }
        this.f4134f = a(i2, z3);
        this.f4135g = str3;
    }

    public static int a(int i2, boolean z2) {
        int b = (e.c != 2 || !z2) ? g.h.a.a.b("direct_access_conn_time_out", 1000, 60000, AbstractNetAdapter.READ_TIMEOUT) : g.h.a.a.b("direct_access_conn_time_out", 1000, 60000, 2000);
        if (i2 >= b) {
            i2 = b;
        }
        return g.i.b.e.h.e.a(i2, 200, 60000, AbstractNetAdapter.READ_TIMEOUT);
    }

    public final boolean a() {
        this.f4139k = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r9 = r8.t;
        r9.a = -287;
        r0 = "read without content-length error";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), PHI: r5 
      PHI: (r5v2 int) = (r5v1 int), (r5v3 int), (r5v3 int) binds: [B:4:0x0017, B:13:0x0042, B:14:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r9) {
        /*
            r8 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            java.net.HttpURLConnection r2 = r8.q     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            r1.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch:{ OutOfMemoryError -> 0x0053, Exception -> 0x0048 }
            r4 = 1
            r5 = 0
        L_0x0017:
            int r6 = r1.read(r3)     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            r7 = -1
            if (r6 == r7) goto L_0x002f
            r2.write(r3, r0, r6)     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            int r5 = r5 + r6
            if (r5 <= r9) goto L_0x0017
            g.i.b.e.d.a.f r9 = r8.t     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            r1 = -303(0xfffffffffffffed1, float:NaN)
            r9.a = r1     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            java.lang.String r1 = "no-content-length"
            r9.b = r1     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 == 0) goto L_0x0042
            g.i.b.e.d.a.f r9 = r8.t     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            byte[] r0 = r2.toByteArray()     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            r9.f4146d = r0     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            g.i.b.e.d.a.g$a r9 = r8.A     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
            r9.f4151f = r0     // Catch:{ OutOfMemoryError -> 0x0046, Exception -> 0x0048 }
        L_0x0042:
            r2.close()     // Catch:{ Exception -> 0x0045, OutOfMemoryError -> 0x0046 }
        L_0x0045:
            return
        L_0x0046:
            r0 = r5
            goto L_0x0053
        L_0x0048:
            g.i.b.e.d.a.f r9 = r8.t
            r0 = -287(0xfffffffffffffee1, float:NaN)
            r9.a = r0
            java.lang.String r0 = "read without content-length error"
        L_0x0050:
            r9.b = r0
            return
        L_0x0053:
            g.i.b.e.d.a.f r9 = r8.t
            r1 = -306(0xfffffffffffffece, float:NaN)
            r9.a = r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "no-content-length:"
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.d.a.g.b(int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:63|64|65|66) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x01e9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.i.b.e.d.a.f c() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f4148m = r0
            g.i.b.e.d.a.g$a r2 = r7.A
            r2.a = r0
            g.i.b.e.d.a.f r0 = new g.i.b.e.d.a.f
            java.lang.String r1 = ""
            r0.<init>(r1)
            r7.t = r0
            r0 = 0
            r2 = 1
            boolean r3 = r7.f()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 == 0) goto L_0x0021
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.d()
            return r0
        L_0x0021:
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r4 = r7.a     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r4 = r3.getProtocol()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r5 = "https"
            boolean r4 = r4.startsWith(r5)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.v = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r4 = r3.getHost()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r4 = g.i.b.e.h.e.h(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.w = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r4 = r7.v     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x007a
            boolean r4 = r7.n     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x0059
            java.net.Proxy r4 = g.i.b.e.b.e.g()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x0059
            java.net.Proxy r4 = g.i.b.e.b.e.g()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.URLConnection r3 = r3.openConnection(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x005d
        L_0x0059:
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x005d:
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r4 = r7.w     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x0093
            g.i.b.e.d.a.e r4 = new g.i.b.e.d.a.e     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r5 = r7.u     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.B = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setSSLSocketFactory(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.d r4 = new g.i.b.e.d.a.d     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r5 = r7.u     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setHostnameVerifier(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x0093
        L_0x007a:
            boolean r4 = r7.n     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x008d
            java.net.Proxy r4 = g.i.b.e.b.e.g()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x008d
            java.net.Proxy r4 = g.i.b.e.b.e.g()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.URLConnection r3 = r3.openConnection(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x0091
        L_0x008d:
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x0091:
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x0093:
            r7.q = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r4 = r7.b     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = "GET"
            goto L_0x009e
        L_0x009c:
            java.lang.String r4 = "POST"
        L_0x009e:
            r3.setRequestMethod(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r4 = r7.f4134f     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setConnectTimeout(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r4 = r7.f4133e     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setReadTimeout(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setUseCaches(r0)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setDoInput(r2)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.e()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r3 = r7.b     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 != 0) goto L_0x00d8
            byte[] r3 = r7.f4132d     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r3 = g.i.b.e.h.e.f(r3)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 != 0) goto L_0x00d8
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.setDoOutput(r2)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            byte[] r3 = r7.f4132d     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r3 = r3.length     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r3 = (long) r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.y = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x00d8:
            g.i.b.e.d.a.g$a r3 = r7.A     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.b = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.connect()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.g$a r3 = r7.A     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.c = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r3 = r7.f()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 == 0) goto L_0x00f9
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.d()
            return r0
        L_0x00f9:
            boolean r3 = r7.b     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 != 0) goto L_0x011c
            byte[] r3 = r7.f4132d     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r3 = g.i.b.e.h.e.f(r3)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 != 0) goto L_0x011c
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r4 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.r = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            byte[] r4 = r7.f4132d     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.write(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.io.DataOutputStream r3 = r7.r     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.flush()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x011c:
            g.i.b.e.d.a.g$a r3 = r7.A     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.f4149d = r4     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r3 = r3.getResponseCode()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.g$a r4 = r7.A     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r4.f4150e = r5     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.f r4 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r4.c = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r3 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.getContentType()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.net.HttpURLConnection r4 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.Map r4 = r4.getHeaderFields()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x014e:
            boolean r5 = r4.hasNext()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r5 == 0) goto L_0x0172
            java.lang.Object r5 = r4.next()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r6 == 0) goto L_0x014e
            java.lang.Object r6 = r5.getKey()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.put(r6, r5)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x014e
        L_0x0172:
            g.i.b.e.d.a.f r4 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r4.a(r3)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.f r3 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r4 = r3.c     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L_0x01fe
            if (r4 >= r6) goto L_0x01fe
            java.net.HttpURLConnection r1 = r7.q     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r1 = r1.getContentLength()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r7.x = r1     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r1 = "app_receive_pack_size"
            r3 = 524288(0x80000, float:7.34684E-40)
            r4 = 10485760(0xa00000, float:1.469368E-38)
            r5 = 2097152(0x200000, float:2.938736E-39)
            int r1 = g.h.a.a.b(r1, r3, r4, r5)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r3 = r7.x     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r3 >= 0) goto L_0x01a0
            r7.b(r1)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x038d
        L_0x01a0:
            if (r3 != 0) goto L_0x01b2
            g.i.b.e.d.a.f r1 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            byte[] r3 = new byte[r0]     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r1.f4146d = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            g.i.b.e.d.a.g$a r1 = r7.A     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r1.f4151f = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x038d
        L_0x01b2:
            if (r3 <= r1) goto L_0x01c9
            g.i.b.e.d.a.f r1 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3 = -303(0xfffffffffffffed1, float:NaN)
            r1.a = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r4 = r7.x     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.append(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
        L_0x01c4:
            java.lang.String r3 = r3.toString()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x01fa
        L_0x01c9:
            byte[] r1 = new byte[r3]     // Catch:{ OutOfMemoryError -> 0x01e9 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ OutOfMemoryError -> 0x01e9 }
            java.net.HttpURLConnection r4 = r7.q     // Catch:{ OutOfMemoryError -> 0x01e9 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ OutOfMemoryError -> 0x01e9 }
            r3.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x01e9 }
            r7.s = r3     // Catch:{ OutOfMemoryError -> 0x01e9 }
            r3.readFully(r1)     // Catch:{ OutOfMemoryError -> 0x01e9 }
            g.i.b.e.d.a.f r3 = r7.t     // Catch:{ OutOfMemoryError -> 0x01e9 }
            r3.f4146d = r1     // Catch:{ OutOfMemoryError -> 0x01e9 }
            g.i.b.e.d.a.g$a r1 = r7.A     // Catch:{ OutOfMemoryError -> 0x01e9 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ OutOfMemoryError -> 0x01e9 }
            r1.f4151f = r3     // Catch:{ OutOfMemoryError -> 0x01e9 }
            goto L_0x038d
        L_0x01e9:
            g.i.b.e.d.a.f r1 = r7.t     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3 = -306(0xfffffffffffffece, float:NaN)
            r1.a = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            int r4 = r7.x     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            r3.append(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x01c4
        L_0x01fa:
            r1.b = r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x038d
        L_0x01fe:
            if (r4 < r6) goto L_0x038d
            r5 = 400(0x190, float:5.6E-43)
            if (r4 >= r5) goto L_0x038d
            java.lang.String r4 = "location"
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.f4147e     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r5 == 0) goto L_0x0223
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r5 != 0) goto L_0x0223
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f4147e     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            if (r4 != 0) goto L_0x0223
            r1 = r3
        L_0x0223:
            r7.f4136h = r1     // Catch:{ MalformedURLException -> 0x0387, all -> 0x0227 }
            goto L_0x038d
        L_0x0227:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0393 }
            g.i.b.e.d.a.f r3 = r7.t     // Catch:{ all -> 0x0393 }
            r4 = -287(0xfffffffffffffee1, float:NaN)
            r3.a = r4     // Catch:{ all -> 0x0393 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0393 }
            r4.<init>()     // Catch:{ all -> 0x0393 }
            java.lang.Class r5 = r1.getClass()     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0393 }
            r4.append(r5)     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = r1.getLocalizedMessage()     // Catch:{ all -> 0x0393 }
            r4.append(r5)     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0393 }
            r3.b = r4     // Catch:{ all -> 0x0393 }
            boolean r3 = r7.v     // Catch:{ all -> 0x0393 }
            if (r3 == 0) goto L_0x026c
            g.i.b.e.d.a.f r3 = r7.t     // Catch:{ all -> 0x0393 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0393 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = "cannot verify hostname"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0393 }
            if (r3 != 0) goto L_0x0280
        L_0x026c:
            boolean r3 = r7.v     // Catch:{ all -> 0x0393 }
            if (r3 == 0) goto L_0x0282
            g.i.b.e.d.a.f r3 = r7.t     // Catch:{ all -> 0x0393 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0393 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = "not verified"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0393 }
            if (r3 == 0) goto L_0x0282
        L_0x0280:
            r3 = 1
            goto L_0x0283
        L_0x0282:
            r3 = 0
        L_0x0283:
            boolean r4 = g.i.b.e.b.e.f4109d     // Catch:{ all -> 0x0393 }
            if (r4 != 0) goto L_0x028e
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -4
            r0.a = r1     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x028e:
            boolean r4 = r7.f4139k     // Catch:{ all -> 0x0393 }
            if (r4 == 0) goto L_0x029a
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -20
            r0.a = r1     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x029a:
            if (r3 == 0) goto L_0x02a4
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -289(0xfffffffffffffedf, float:NaN)
            r0.a = r1     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x02a4:
            boolean r3 = r1 instanceof javax.net.ssl.SSLHandshakeException     // Catch:{ all -> 0x0393 }
            r4 = -290(0xfffffffffffffede, float:NaN)
            if (r3 == 0) goto L_0x02ae
        L_0x02aa:
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            goto L_0x0353
        L_0x02ae:
            boolean r3 = r1 instanceof javax.net.ssl.SSLKeyException     // Catch:{ all -> 0x0393 }
            if (r3 != 0) goto L_0x0380
            boolean r3 = r1 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0393 }
            if (r3 != 0) goto L_0x0380
            boolean r3 = r1 instanceof javax.net.ssl.SSLProtocolException     // Catch:{ all -> 0x0393 }
            if (r3 == 0) goto L_0x02bc
            goto L_0x0380
        L_0x02bc:
            r7.f4137i = r2     // Catch:{ all -> 0x0393 }
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0393 }
            r3 = -10
            if (r2 == 0) goto L_0x02e1
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0393 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = "permission"
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x02e1
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -281(0xfffffffffffffee7, float:NaN)
            r2.a = r5     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = "no permission"
            r2.b = r5     // Catch:{ all -> 0x0393 }
            goto L_0x032f
        L_0x02e1:
            boolean r2 = r1 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x02ec
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -284(0xfffffffffffffee4, float:NaN)
            r2.a = r5     // Catch:{ all -> 0x0393 }
            goto L_0x032f
        L_0x02ec:
            boolean r2 = r1 instanceof java.net.ConnectException     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x02f7
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -42
            r2.a = r5     // Catch:{ all -> 0x0393 }
            goto L_0x032f
        L_0x02f7:
            boolean r2 = r1 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x0325
            java.lang.String r2 = r1.getLocalizedMessage()     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x031e
            java.lang.String r5 = r2.toLowerCase()     // Catch:{ all -> 0x0393 }
            java.lang.String r6 = "connect"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0393 }
            if (r5 != 0) goto L_0x0319
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = "connection"
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x031e
        L_0x0319:
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r2.a = r3     // Catch:{ all -> 0x0393 }
            goto L_0x032f
        L_0x031e:
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -13
            r2.a = r5     // Catch:{ all -> 0x0393 }
            goto L_0x032f
        L_0x0325:
            boolean r2 = r1 instanceof java.net.SocketException     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x032f
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -41
            r2.a = r5     // Catch:{ all -> 0x0393 }
        L_0x032f:
            boolean r2 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x038d
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            r5 = -286(0xfffffffffffffee2, float:NaN)
            r2.a = r5     // Catch:{ all -> 0x0393 }
            boolean r5 = r7.v     // Catch:{ all -> 0x0393 }
            r6 = -292(0xfffffffffffffedc, float:NaN)
            if (r5 == 0) goto L_0x0377
            g.i.b.e.d.a.e r5 = r7.B     // Catch:{ all -> 0x0393 }
            if (r5 == 0) goto L_0x0377
            boolean r5 = r5.a     // Catch:{ all -> 0x0393 }
            if (r5 == 0) goto L_0x0377
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x0393 }
            java.lang.String r5 = "SSLHandshakeException"
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x0356
            goto L_0x02aa
        L_0x0353:
            r0.a = r4     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x0356:
            g.i.b.e.d.a.f r2 = r7.t     // Catch:{ all -> 0x0393 }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = "SocketTimeoutException"
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0393 }
            if (r2 == 0) goto L_0x0367
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r0.a = r3     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x0367:
            boolean r1 = r1 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x0393 }
            if (r1 == 0) goto L_0x0370
            g.i.b.e.d.a.f r1 = r7.t     // Catch:{ all -> 0x0393 }
            r1.a = r6     // Catch:{ all -> 0x0393 }
            goto L_0x037d
        L_0x0370:
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -293(0xfffffffffffffedb, float:NaN)
            r0.a = r1     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x0377:
            boolean r1 = r1 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x0393 }
            if (r1 == 0) goto L_0x038d
            r2.a = r6     // Catch:{ all -> 0x0393 }
        L_0x037d:
            r7.f4137i = r0     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x0380:
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -291(0xfffffffffffffedd, float:NaN)
            r0.a = r1     // Catch:{ all -> 0x0393 }
            goto L_0x038d
        L_0x0387:
            g.i.b.e.d.a.f r0 = r7.t     // Catch:{ all -> 0x0393 }
            r1 = -300(0xfffffffffffffed4, float:NaN)
            r0.a = r1     // Catch:{ all -> 0x0393 }
        L_0x038d:
            r7.d()
            g.i.b.e.d.a.f r0 = r7.t
            return r0
        L_0x0393:
            r0 = move-exception
            r7.d()
            goto L_0x0399
        L_0x0398:
            throw r0
        L_0x0399:
            goto L_0x0398
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.d.a.g.c():g.i.b.e.d.a.f");
    }

    public final void d() {
        String str;
        try {
            HttpURLConnection httpURLConnection = this.q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            DataOutputStream dataOutputStream = this.r;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            DataInputStream dataInputStream = this.s;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (Throwable unused) {
        }
        this.f4148m = SystemClock.elapsedRealtime() - this.f4148m;
        this.A.b();
        if (this.t.a != 0 && e.f4109d && this.t.a != -20) {
            boolean z2 = false;
            if (g.h.a.a.b("direct_fail_to_report_dns_ip", 0, 1, 0) == 1) {
                z2 = true;
            }
            if (z2) {
                try {
                    str = InetAddress.getByName(this.u).getHostAddress();
                } catch (Throwable th) {
                    th.printStackTrace();
                    str = "";
                }
                this.z = str;
            }
        }
    }

    public final void e() {
        Map<String, String> map = this.c;
        boolean z2 = false;
        if (map != null && map.size() > 0) {
            for (String next : this.c.keySet()) {
                this.q.addRequestProperty(next, this.c.get(next));
                if (next.toLowerCase().contains("host")) {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            this.q.setRequestProperty("Host", this.u);
        }
        HttpURLConnection httpURLConnection = this.q;
        httpURLConnection.setRequestProperty("Halley", this.f4135g + "-" + this.o + "-" + System.currentTimeMillis());
        if (this.n) {
            this.q.setRequestProperty("X-Online-Host", this.u);
            this.q.setRequestProperty("x-tx-host", this.u);
        }
    }

    public final boolean f() {
        if (!this.f4139k) {
            return false;
        }
        this.t.a = -20;
        this.f4148m = SystemClock.elapsedRealtime() - this.f4148m;
        this.A.b();
        return true;
    }
}
