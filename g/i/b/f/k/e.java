package g.i.b.f.k;

import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.i.b.e.b.h;
import g.i.b.f.k.d;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class e implements g.i.b.f.a, g.i.b.f.f.c, g.i.b.f.g.a, d.e, Comparable<e>, Runnable {
    public long A;
    public boolean A0;
    public long B;
    public Object B0;
    public long C;
    public g.i.b.f.g.b C0;
    public long D0;
    public long Q;
    public volatile long R;
    public volatile int S;
    public volatile int T;
    public int U;
    public int V;
    public volatile boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public boolean a0;
    public volatile HashMap<String, Long> b = new LinkedHashMap();
    public boolean b0;
    public AtomicLong c = new AtomicLong(0);
    public boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public AtomicLong f4308d = new AtomicLong(0);
    public boolean d0;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f4309e = new HashMap();
    public boolean e0;

    /* renamed from: f  reason: collision with root package name */
    public g.i.b.f.k.f.b f4310f;
    public List<g.i.b.f.g.c> f0;

    /* renamed from: g  reason: collision with root package name */
    public a f4311g;
    public Map<g.i.b.f.k.f.a, g.i.b.f.g.c> g0;

    /* renamed from: h  reason: collision with root package name */
    public d.c f4312h;
    public Map<g.i.b.f.k.f.a, List<String>> h0;

    /* renamed from: i  reason: collision with root package name */
    public d f4313i = new d(this);
    public AtomicInteger i0;

    /* renamed from: j  reason: collision with root package name */
    public b f4314j;
    public AtomicInteger j0;

    /* renamed from: k  reason: collision with root package name */
    public Object f4315k = new Object();
    public g.i.b.f.b k0;

    /* renamed from: l  reason: collision with root package name */
    public String f4316l = "";
    public File l0;

    /* renamed from: m  reason: collision with root package name */
    public String f4317m = "";
    public RandomAccessFile m0;
    public String n = "";
    public File n0;
    public String o = "";
    public RandomAccessFile o0;
    public String p = "";
    public AtomicInteger p0;
    public String q = "";
    public g.i.b.f.k.g.d q0;
    public String r = "";
    public b r0;
    public String s = "";
    public h s0;
    public String t = "";
    public String t0;
    public String u = "";
    public String u0;
    public String v = null;
    public long v0;
    public volatile long w;
    public volatile int w0;
    public volatile long x;
    public int x0;
    public volatile long y;
    public int y0;
    public long z;
    public boolean z0;

    public static class a extends RandomAccessFile {
        public a(File file, String str) {
            super(file, str);
        }
    }

    public final class b {
        public List<a> a = new ArrayList();

        public static class a {
            public long a;
            public int b;
            public String c;

            public a(long j2, int i2, String str) {
                this.a = j2;
                this.b = i2;
                this.c = TextUtils.isEmpty(str) ? "" : g.i.b.e.h.e.g(str);
            }
        }
    }

    public final class c {
        public boolean a;
        public long b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public int f4318d = 0;

        /* renamed from: e  reason: collision with root package name */
        public List<a> f4319e = new ArrayList();

        public static class a {
            public int a;
            public boolean b;
            public String c = "";

            /* renamed from: d  reason: collision with root package name */
            public long f4320d;

            /* renamed from: e  reason: collision with root package name */
            public long f4321e;

            /* renamed from: f  reason: collision with root package name */
            public int f4322f;

            /* renamed from: g  reason: collision with root package name */
            public String f4323g = "";

            /* renamed from: h  reason: collision with root package name */
            public String f4324h = "";

            /* renamed from: i  reason: collision with root package name */
            public long f4325i = -1;

            /* renamed from: j  reason: collision with root package name */
            public String f4326j = "";

            /* renamed from: k  reason: collision with root package name */
            public String f4327k = "";

            /* renamed from: l  reason: collision with root package name */
            public String f4328l = "";

            /* renamed from: m  reason: collision with root package name */
            public String f4329m = "";
            public String n = "";
            public int o = -1;
            public int p = -1;
            public String q = "";
            public long r;
            public String s = "";
            public String t = "";
            public long u = -1;
            public String v = "";
            public long w;
            public int x;
            public int y;

            public a(int i2, g.i.b.f.k.f.a aVar) {
                this.a = i2;
                this.x = aVar.c;
                this.y = aVar.b.ordinal();
            }

            public final String toString() {
                return this.a + "," + this.x + "," + this.y + "," + (this.b ? 1 : 0) + "," + g.i.b.e.h.e.g(this.c) + "," + this.f4320d + "," + this.f4321e + "," + this.f4322f + "," + g.i.b.e.h.e.g(this.f4323g) + "," + this.f4324h + "," + this.f4325i + "," + g.i.b.e.h.e.g(this.f4326j) + "," + this.f4327k + "," + g.i.b.e.h.e.g("[" + this.f4328l + "]") + "," + g.i.b.e.h.e.g(this.f4329m) + "," + g.i.b.e.h.e.g("[" + this.n + "]") + "," + this.o + "," + this.p + "," + g.i.b.e.h.e.g(this.q) + "," + this.r + "," + this.s + "," + this.t + "," + this.u + "," + this.v + "," + this.w;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.a ^ true ? 1 : 0);
            sb.append(sb2.toString());
            sb.append(",");
            sb.append(this.b);
            sb.append(",");
            sb.append(this.c);
            sb.append(",");
            sb.append(0);
            sb.append(",");
            return g.a.a.a.a.e(sb, this.f4318d, ";");
        }
    }

    public e(g.i.b.f.k.f.b bVar, String str, String str2, g.i.b.f.c cVar, long j2, String str3) {
        String str4;
        long j3 = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = -1;
        this.V = -1;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c0 = true;
        this.d0 = false;
        this.e0 = g.h.a.a.b("down_use_multi_thread", 0, 1, 1) == 1;
        this.f0 = Collections.synchronizedList(new ArrayList());
        this.g0 = new ConcurrentHashMap();
        this.h0 = new ConcurrentHashMap();
        this.i0 = new AtomicInteger(0);
        this.j0 = new AtomicInteger(0);
        this.k0 = g.i.b.f.b.Cate_DefaultMass;
        this.p0 = new AtomicInteger(0);
        this.t0 = "";
        this.u0 = "";
        this.v0 = 0;
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = -1;
        this.z0 = false;
        this.A0 = true;
        this.B0 = new Object();
        this.C0 = new g.i.b.f.g.b();
        this.D0 = 0;
        g.i.b.e.h.b.c("halley-downloader-TaskImpl", "new BDTaskImpl()");
        this.f4310f = bVar;
        this.o = str;
        this.p = str2;
        g.i.b.f.c cVar2 = cVar;
        this.f4313i.a(cVar);
        this.z = j2 > 0 ? j2 : j3;
        TextUtils.isEmpty(str3);
        try {
            str4 = g.i.b.e.h.c.c("" + "" + System.currentTimeMillis() + this.f4310f.b.a + ((int) (Math.random() * 2.147483647E9d)));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            str4 = sb.toString();
        }
        this.v = str4;
        this.q0 = new g.i.b.f.k.g.d(this);
    }

    public final int A() {
        return this.S;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC, Splitter:B:30:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r9 = this;
            java.lang.String r0 = "/"
            g.i.b.f.k.f.b r1 = r9.f4310f
            g.i.b.f.k.f.a r1 = r1.b
            java.lang.String r1 = r1.a
            java.lang.String r2 = r9.r
            java.lang.String r3 = r9.s
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0053 }
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = "filename="
            int r5 = r3.indexOf(r5)     // Catch:{ Exception -> 0x0053 }
            r6 = -1
            if (r6 == r5) goto L_0x0057
            int r5 = r5 + 9
            java.lang.String r7 = ";"
            int r7 = r3.indexOf(r7, r5)     // Catch:{ Exception -> 0x0053 }
            if (r7 != r6) goto L_0x002a
            int r7 = r3.length()     // Catch:{ Exception -> 0x0053 }
        L_0x002a:
            java.lang.String r3 = r3.substring(r5, r7)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "utf-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            goto L_0x0040
        L_0x0035:
            java.lang.String r5 = "gbk"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ Exception -> 0x0053 }
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0053 }
            if (r5 != 0) goto L_0x0057
            int r5 = r3.lastIndexOf(r0)     // Catch:{ Exception -> 0x0053 }
            int r5 = r5 + 1
            if (r5 <= 0) goto L_0x0058
            java.lang.String r3 = r3.substring(r5)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0057:
            r3 = r4
        L_0x0058:
            r5 = 0
            java.lang.String r6 = ""
            if (r3 != 0) goto L_0x0092
            java.lang.String r1 = android.net.Uri.decode(r1)     // Catch:{ Exception -> 0x0084 }
            if (r1 == 0) goto L_0x0088
            r3 = 63
            int r3 = r1.indexOf(r3)     // Catch:{ Exception -> 0x0084 }
            if (r3 <= 0) goto L_0x006f
            java.lang.String r1 = r1.substring(r5, r3)     // Catch:{ Exception -> 0x0084 }
        L_0x006f:
            boolean r3 = r1.endsWith(r0)     // Catch:{ Exception -> 0x0084 }
            if (r3 != 0) goto L_0x0088
            r3 = 47
            int r3 = r1.lastIndexOf(r3)     // Catch:{ Exception -> 0x0084 }
            int r3 = r3 + 1
            if (r3 <= 0) goto L_0x0088
            java.lang.String r4 = r1.substring(r3)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0088:
            if (r4 != 0) goto L_0x0091
            java.lang.String r1 = "downloadfile"
            java.lang.String r3 = r1.concat(r6)
            goto L_0x0092
        L_0x0091:
            r3 = r4
        L_0x0092:
            java.lang.String r1 = "."
            int r4 = r3.lastIndexOf(r1)
            if (r4 <= 0) goto L_0x00bb
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x00a1
            goto L_0x00d8
        L_0x00a1:
            int r2 = r3.length()
            int r7 = r4 + 1
            if (r2 <= r7) goto L_0x00b5
            java.lang.String r2 = r3.substring(r5, r4)
            java.lang.String r3 = r3.substring(r4)
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x00b6
        L_0x00b5:
            r2 = r6
        L_0x00b6:
            java.lang.String r3 = g.a.a.a.a.c(r3, r6, r2)
            goto L_0x00d8
        L_0x00bb:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x00d0
            java.lang.String r4 = "application/vnd.android.package-archive"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = ".apk"
            java.lang.StringBuilder r2 = g.a.a.a.a.n(r3, r6, r2)
            goto L_0x00d4
        L_0x00d0:
            java.lang.StringBuilder r2 = g.a.a.a.a.l(r3, r6)
        L_0x00d4:
            java.lang.String r3 = r2.toString()
        L_0x00d8:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0112
            java.lang.String r2 = "?"
            java.lang.String r2 = r3.replace(r2, r6)
            java.lang.String r3 = "*"
            java.lang.String r2 = r2.replace(r3, r6)
            java.lang.String r3 = ":"
            java.lang.String r2 = r2.replace(r3, r6)
            java.lang.String r3 = "\\"
            java.lang.String r2 = r2.replace(r3, r6)
            java.lang.String r0 = r2.replace(r0, r6)
            java.lang.String r2 = "\""
            java.lang.String r0 = r0.replace(r2, r6)
            java.lang.String r2 = "<"
            java.lang.String r0 = r0.replace(r2, r6)
            java.lang.String r2 = ">"
            java.lang.String r0 = r0.replace(r2, r6)
            java.lang.String r2 = "|"
            java.lang.String r3 = r0.replace(r2, r6)
        L_0x0112:
            r9.q = r3
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r9.o
            java.lang.String r3 = r9.q
            java.lang.String r3 = g.i.b.f.f.b.b(r3)
            r0.<init>(r2, r3)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r9.o
            java.lang.String r4 = r9.q
            r2.<init>(r3, r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0137
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0137
            return
        L_0x0137:
            java.lang.String r0 = r9.q
            int r0 = r0.lastIndexOf(r1)
            if (r0 <= 0) goto L_0x0156
            java.lang.String r1 = r9.q
            int r1 = r1.length()
            int r2 = r0 + 1
            if (r1 <= r2) goto L_0x0156
            java.lang.String r1 = r9.q
            java.lang.String r1 = r1.substring(r5, r0)
            java.lang.String r2 = r9.q
            java.lang.String r6 = r2.substring(r0)
            goto L_0x0158
        L_0x0156:
            java.lang.String r1 = r9.q
        L_0x0158:
            r0 = 2
        L_0x0159:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = "("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ")"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r9.o
            java.lang.String r5 = g.i.b.f.f.b.b(r2)
            r3.<init>(r4, r5)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r9.o
            r4.<init>(r5, r2)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0197
            boolean r3 = r4.exists()
            if (r3 == 0) goto L_0x0194
            goto L_0x0197
        L_0x0194:
            r9.q = r2
            return
        L_0x0197:
            int r0 = r0 + 1
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.B():void");
    }

    public final boolean C() {
        try {
            this.o0 = new a(this.n0, "rw");
            return true;
        } catch (Exception e2) {
            g.i.b.e.h.b.e("halley-downloader-TaskImpl", "initFileOnDetected...create RandomAccessFile for cfgFile failed.", e2);
            P(e2);
            return false;
        }
    }

    public final boolean D() {
        try {
            this.m0 = new a(this.l0, "rw");
            return true;
        } catch (Exception e2) {
            P(e2);
            return false;
        }
    }

    public final void E() {
        try {
            synchronized (this.f4315k) {
                this.f4315k.notifyAll();
                this.Z = false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean F() {
        if (this.X) {
            return true;
        }
        if (!(this.f4313i.a == g.i.b.f.e.PAUSED) && !h() && !v()) {
            return this.f4313i.a == g.i.b.f.e.FAILED;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G() {
        /*
            r7 = this;
            r0 = 1
            java.io.RandomAccessFile r1 = r7.m0     // Catch:{ all -> 0x000b }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x000b }
            r1.force(r0)     // Catch:{ all -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r1 = move-exception
            r1.printStackTrace()
        L_0x000f:
            r7.J()
            g.i.b.f.k.d r1 = r7.f4313i
            monitor-enter(r1)
            g.i.b.f.k.d r2 = r7.f4313i     // Catch:{ all -> 0x007c }
            g.i.b.f.e r2 = r2.a     // Catch:{ all -> 0x007c }
            g.i.b.f.e r3 = g.i.b.f.e.PAUSED     // Catch:{ all -> 0x007c }
            if (r2 != r3) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            return
        L_0x001f:
            boolean r2 = r7.A0     // Catch:{ all -> 0x007c }
            r3 = 0
            if (r2 != 0) goto L_0x0025
            goto L_0x0058
        L_0x0025:
            r0 = 0
            r2 = 0
        L_0x0027:
            r4 = 3
            if (r0 >= r4) goto L_0x0057
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007c }
            java.lang.String r4 = r7.o     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r7.q     // Catch:{ all -> 0x007c }
            java.lang.String r5 = g.i.b.f.f.b.b(r5)     // Catch:{ all -> 0x007c }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x007c }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r7.o     // Catch:{ all -> 0x007c }
            java.lang.String r6 = r7.q     // Catch:{ all -> 0x007c }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x007c }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0049
            r4.delete()     // Catch:{ all -> 0x007c }
        L_0x0049:
            boolean r2 = r2.renameTo(r4)     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x0057
            r4 = 50
            android.os.SystemClock.sleep(r4)     // Catch:{ all -> 0x007c }
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r0 == 0) goto L_0x0071
            r7.V()     // Catch:{ all -> 0x007c }
            g.i.b.f.k.f.b r0 = r7.f4310f     // Catch:{ all -> 0x007c }
            java.lang.String r2 = r7.o     // Catch:{ all -> 0x007c }
            java.lang.String r3 = r7.q     // Catch:{ all -> 0x007c }
            int r0 = g.i.b.e.h.e.b(r0, r2, r3)     // Catch:{ all -> 0x007c }
            r7.y0 = r0     // Catch:{ all -> 0x007c }
            g.i.b.f.k.d r0 = r7.f4313i     // Catch:{ all -> 0x007c }
            g.i.b.f.e r2 = g.i.b.f.e.COMPLETE     // Catch:{ all -> 0x007c }
            r0.b(r2)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0071:
            r0 = -72
            java.lang.String r2 = ""
            g.i.b.f.e r4 = g.i.b.f.e.FAILED     // Catch:{ all -> 0x007c }
            r7.N(r3, r0, r2, r4)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.G():void");
    }

    public final void H() {
        this.g0.clear();
        synchronized (this.f0) {
            this.f0.clear();
        }
        this.h0.clear();
    }

    public final void I() {
        J();
        g.i.b.f.k.g.c cVar = this.q0.a;
        if (cVar != null) {
            cVar.y = false;
        }
        g.i.b.f.k.g.c cVar2 = this.q0.b;
        if (cVar2 != null) {
            cVar2.y = false;
        }
        if (this.q0.c.size() > 0) {
            Iterator<g.i.b.f.k.g.c> it = this.q0.c.iterator();
            while (it.hasNext()) {
                it.next().y = false;
            }
        }
    }

    public final void J() {
        synchronized (this.f0) {
            for (g.i.b.f.g.c next : this.f0) {
                next.f4250e = true;
                try {
                    g.i.b.f.f.a.e eVar = next.n;
                    if (eVar != null) {
                        eVar.E = true;
                    }
                    h hVar = next.f4251f;
                    if (hVar != null) {
                        hVar.a();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final int K() {
        if (g.i.b.e.b.e.f4112g != 1) {
            return 20971520;
        }
        if (this.w > 0) {
            double d2 = (double) this.w;
            Double.isNaN(d2);
            int i2 = (int) (d2 * 0.2d);
            if (i2 > 41943040) {
                return i2;
            }
        }
        return 41943040;
    }

    public final void L(int i2, String str) {
        if (isRunning() && this.r0 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            b bVar = this.r0;
            b.a aVar = new b.a(currentTimeMillis - this.B, i2, str);
            synchronized (bVar.a) {
                if (bVar.a.size() < 20) {
                    bVar.a.add(aVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r11 > 0) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[Catch:{ Exception -> 0x0078 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(long r11) {
        /*
            r10 = this;
            g.i.b.f.k.g.d r0 = r10.q0
            monitor-enter(r0)
            long r1 = r10.w     // Catch:{ all -> 0x00bd }
            r3 = -1
            r5 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x001c
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            long r11 = r10.z     // Catch:{ all -> 0x00bd }
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bb
        L_0x0018:
            r10.R = r11     // Catch:{ all -> 0x00bd }
            goto L_0x00bb
        L_0x001c:
            long r1 = r10.w     // Catch:{ all -> 0x00bd }
            long r7 = r10.w     // Catch:{ all -> 0x00bd }
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            long r11 = r10.z     // Catch:{ all -> 0x00bd }
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r11 = r1
        L_0x002d:
            long r1 = r10.w     // Catch:{ all -> 0x00bd }
            int r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00bb
            r10.w = r3     // Catch:{ all -> 0x00bd }
            r10.R = r11     // Catch:{ all -> 0x00bd }
            g.i.b.f.k.a r11 = r10.f4311g     // Catch:{ all -> 0x00bd }
            if (r11 == 0) goto L_0x00bb
            java.lang.Object r11 = r10.B0     // Catch:{ all -> 0x00bd }
            monitor-enter(r11)     // Catch:{ all -> 0x00bd }
            g.i.b.f.k.a r12 = r10.f4311g     // Catch:{ all -> 0x00b8 }
            long r1 = r12.f4285k     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.a r12 = r10.f4311g     // Catch:{ all -> 0x00b8 }
            int r12 = r12.f4286l     // Catch:{ all -> 0x00b8 }
            g.i.b.f.g.b r3 = r10.C0     // Catch:{ all -> 0x00b8 }
            r4 = 1
            r3.a = r4     // Catch:{ all -> 0x00b8 }
            int r5 = r10.V     // Catch:{ all -> 0x00b8 }
            r3.f4245d = r5     // Catch:{ all -> 0x00b8 }
            r3.c = r7     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.atomic.AtomicLong r5 = r10.c     // Catch:{ all -> 0x00b8 }
            long r5 = r5.get()     // Catch:{ all -> 0x00b8 }
            r3.b = r5     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.d r3 = r10.q0     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.c r3 = r3.a     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x008c
            g.i.b.f.g.b r5 = r10.C0     // Catch:{ all -> 0x00b8 }
            int r3 = r3.v     // Catch:{ all -> 0x00b8 }
            long r6 = (long) r3     // Catch:{ all -> 0x00b8 }
            r5.f4246e = r6     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.d r3 = r10.q0     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.c r3 = r3.a     // Catch:{ all -> 0x00b8 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x00b8 }
            g.i.b.f.f.a.d r3 = r3.p     // Catch:{ Exception -> 0x0078 }
            if (r3 == 0) goto L_0x007c
            g.i.b.f.f.a.a r3 = (g.i.b.f.f.a.a) r3     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = r3.h()     // Catch:{ Exception -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x00b8 }
        L_0x007c:
            java.lang.String r3 = ""
        L_0x007e:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00b8 }
            if (r5 != 0) goto L_0x008c
            g.i.b.f.g.b r5 = r10.C0     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = g.i.b.e.h.e.g(r3)     // Catch:{ all -> 0x00b8 }
            r5.f4247f = r3     // Catch:{ all -> 0x00b8 }
        L_0x008c:
            g.i.b.f.k.a r3 = new g.i.b.f.k.a     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = ""
            r3.<init>(r5)     // Catch:{ all -> 0x00b8 }
            r10.f4311g = r3     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.d r3 = r10.q0     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.c r3 = r3.a     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r3.f4369d     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x00ab
            g.i.b.f.k.g.d r3 = r10.q0     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.g.c r3 = r3.a     // Catch:{ all -> 0x00b8 }
            g.i.b.f.f.a.d r3 = r3.p     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x00ab
            g.i.b.f.f.a.a r3 = (g.i.b.f.f.a.a) r3     // Catch:{ all -> 0x00b8 }
            r3.E = r4     // Catch:{ all -> 0x00b8 }
        L_0x00ab:
            r10.H()     // Catch:{ all -> 0x00b8 }
            g.i.b.f.k.a r3 = r10.f4311g     // Catch:{ all -> 0x00b8 }
            r3.j(r1, r12)     // Catch:{ all -> 0x00b8 }
            r10.X()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r11)     // Catch:{ all -> 0x00b8 }
            goto L_0x00bb
        L_0x00b8:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00b8 }
            throw r12     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.M(long):void");
    }

    public final void N(boolean z2, int i2, String str, g.i.b.f.e eVar) {
        g.i.b.e.h.b.f("halley-downloader-TaskImpl", "cancel task...key:" + this.v + ",isFromUser:" + z2 + ",retCode:" + i2 + ",failInfo:" + str + ",newStatus:" + eVar.name());
        this.X = true;
        this.a0 = z2;
        if (!z2) {
            this.S = i2;
            this.t = str;
        }
        this.f4313i.b(eVar);
        J();
        g.i.b.f.k.g.d dVar = this.q0;
        Objects.requireNonNull(dVar);
        try {
            g.i.b.f.k.g.c cVar = dVar.a;
            if (cVar != null) {
                cVar.g();
            }
            g.i.b.f.k.g.c cVar2 = dVar.b;
            if (cVar2 != null) {
                cVar2.g();
            }
            if (dVar.c.size() > 0) {
                Iterator<g.i.b.f.k.g.c> it = dVar.c.iterator();
                while (it.hasNext()) {
                    it.next().g();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        throw new com.tencent.halley.common.HalleyException(java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O() {
        /*
            r3 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A = r0
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "try add task "
            r1.<init>(r2)
            java.lang.String r2 = r3.v
            r1.append(r2)
            java.lang.String r2 = " to pool..."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            g.i.b.e.h.b.c(r0, r1)
            g.i.b.f.k.d r0 = r3.f4313i     // Catch:{ Exception -> 0x006f }
            g.i.b.f.e r1 = g.i.b.f.e.PENDING     // Catch:{ Exception -> 0x006f }
            r0.b(r1)     // Catch:{ Exception -> 0x006f }
            g.i.b.f.j.a r0 = g.i.b.f.j.a.b()     // Catch:{ Exception -> 0x006f }
            g.i.b.f.b r1 = r3.k0     // Catch:{ Exception -> 0x006f }
            monitor-enter(r0)     // Catch:{ Exception -> 0x006f }
            java.util.Map<g.i.b.f.b, g.i.b.f.j.a$c> r2 = r0.a     // Catch:{ all -> 0x006c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x006c }
            g.i.b.f.j.a$c r2 = (g.i.b.f.j.a.c) r2     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x003c
            g.i.b.f.j.a$c r2 = r0.a(r1)     // Catch:{ all -> 0x006c }
        L_0x003c:
            java.util.concurrent.Future r1 = r2.submit(r3)     // Catch:{ all -> 0x006c }
            g.i.b.f.j.a$a r2 = new g.i.b.f.j.a$a     // Catch:{ all -> 0x006c }
            r2.<init>(r1)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ Exception -> 0x006f }
            r3.s0 = r2     // Catch:{ Exception -> 0x006f }
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = "task "
            r1.<init>(r2)     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = r3.v     // Catch:{ Exception -> 0x006f }
            r1.append(r2)     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = " added to pool of category:"
            r1.append(r2)     // Catch:{ Exception -> 0x006f }
            g.i.b.f.b r2 = r3.k0     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = r2.name()     // Catch:{ Exception -> 0x006f }
            r1.append(r2)     // Catch:{ Exception -> 0x006f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006f }
            g.i.b.e.h.b.c(r0, r1)     // Catch:{ Exception -> 0x006f }
            return
        L_0x006c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x006f }
            throw r1     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            r0 = move-exception
            com.tencent.halley.common.HalleyException r1 = new com.tencent.halley.common.HalleyException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.O():void");
    }

    public final void P(Exception exc) {
        int i2;
        exc.printStackTrace();
        this.S = -49;
        this.t = "initFileOnDetected,new RAF:" + this.l0.getAbsolutePath() + Constants.KEY_INDEX_FILE_SEPARATOR + g.h.a.a.f(exc);
        if (g.h.a.a.i(exc)) {
            i2 = -12;
        } else if (g.h.a.a.n(exc)) {
            i2 = -13;
        } else {
            if (g.h.a.a.q(exc)) {
                i2 = -78;
            }
            g.i.b.e.h.b.h("halley-downloader-TaskImpl", "initFileOnDetected...Exception, _ret:" + this.S + ",_failInfo:" + this.t);
            W();
        }
        this.S = i2;
        g.i.b.e.h.b.h("halley-downloader-TaskImpl", "initFileOnDetected...Exception, _ret:" + this.S + ",_failInfo:" + this.t);
        W();
    }

    public final boolean Q() {
        synchronized (e.class) {
            g.i.b.e.h.b.f("halley-downloader-TaskImpl", "initFileOnDetected...begin");
            this.b.put("point0", 0L);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            new File(this.o).mkdirs();
            if (!g.i.b.f.f.b.c(this.p)) {
                B();
            } else {
                this.q = this.p;
            }
            this.b.put("point1", Long.valueOf(System.currentTimeMillis() - valueOf.longValue()));
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            this.l0 = this.A0 ? new File(this.o, g.i.b.f.f.b.b(this.q)) : new File(this.o, this.q);
            this.n0 = new File(this.o, g.i.b.f.f.b.a(this.q));
            if (!C()) {
                return false;
            }
            this.b.put("point2", Long.valueOf(System.currentTimeMillis() - valueOf2.longValue()));
            Long valueOf3 = Long.valueOf(System.currentTimeMillis());
            if (!D()) {
                return false;
            }
            this.b.put("point3", Long.valueOf(System.currentTimeMillis() - valueOf3.longValue()));
            this.b.put("point4", Long.valueOf(System.currentTimeMillis() - Long.valueOf(System.currentTimeMillis()).longValue()));
            g.i.b.e.h.b.f("halley-downloader-TaskImpl", "initFileOnDetected...end");
            return true;
        }
    }

    public final String R() {
        g.i.b.f.k.g.d dVar = this.q0;
        if (dVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        g.i.b.f.k.g.c cVar = dVar.a;
        if (cVar != null) {
            sb.append(cVar.l());
        }
        g.i.b.f.k.g.c cVar2 = dVar.b;
        if (cVar2 != null) {
            sb.append(cVar2.l());
        }
        if (dVar.c.size() > 0) {
            Iterator<g.i.b.f.k.g.c> it = dVar.c.iterator();
            while (it.hasNext()) {
                sb.append(it.next().l());
            }
        }
        return sb.toString();
    }

    public final void S(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f4316l = str;
    }

    public final boolean T() {
        File file = new File(w());
        try {
            boolean h2 = g.h.a.a.h(file);
            g.i.b.e.h.b.f("halley-downloader-TaskImpl", "deleteFile:" + file + ",result:" + h2);
            return h2;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean U() {
        File file = new File(this.o, g.i.b.f.f.b.b(TextUtils.isEmpty(this.q) ? this.p : this.q));
        try {
            boolean h2 = g.h.a.a.h(file);
            g.i.b.e.h.b.f("halley-downloader-TaskImpl", "deleteFile:" + file + ",result:" + h2);
            return h2;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean V() {
        try {
            return g.h.a.a.h(new File(this.o, g.i.b.f.f.b.a(TextUtils.isEmpty(this.q) ? this.p : this.q)));
        } catch (Exception unused) {
            return false;
        }
    }

    public final synchronized void W() {
        RandomAccessFile randomAccessFile = this.m0;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.m0 = null;
        }
        RandomAccessFile randomAccessFile2 = this.o0;
        if (randomAccessFile2 != null) {
            try {
                randomAccessFile2.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            this.o0 = null;
        }
    }

    public final void X() {
        d.c cVar = this.f4312h;
        if (cVar != null) {
            synchronized (cVar.c) {
                do {
                } while (cVar.a() != null);
            }
        }
    }

    public final boolean a() {
        return this.X;
    }

    public final void b() {
        g.i.b.f.e eVar = this.f4313i.a;
        g.i.b.e.h.b.f("halley-downloader-TaskImpl", "trying pause...key:" + this.v + ",url:" + r() + ", now status:" + eVar);
        if (eVar == g.i.b.f.e.PENDING || eVar == g.i.b.f.e.STARTED || eVar == g.i.b.f.e.f4229d) {
            a aVar = this.f4311g;
            if (aVar == null || !aVar.i()) {
                N(true, 0, "", g.i.b.f.e.PAUSED);
                g.i.b.e.h.b.h("halley-downloader-TaskImpl", "cancel task:" + this.v);
                try {
                    h hVar = this.s0;
                    if (hVar != null) {
                        hVar.a();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        e eVar = (e) obj;
        Objects.requireNonNull(eVar);
        return (int) (this.A - eVar.A);
    }

    public final int d() {
        a aVar;
        long s2 = s();
        if (s2 == -1 && (aVar = this.f4311g) != null) {
            s2 = aVar.a;
        }
        a aVar2 = this.f4311g;
        int i2 = 0;
        int i3 = aVar2 != null ? aVar2.f4286l : 0;
        if (s2 > 0) {
            i2 = (int) ((m() * 100) / s2);
        }
        return i3 > i2 ? i3 : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r11 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r10 = new java.lang.StringBuilder("inner error: getRange null for sectionId:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r11.f4364e == r0.b) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r10 = new java.lang.StringBuilder("inner error: check offset fail for section:");
        r10.append(r11);
        r10.append(",buffer offset:");
        r10.append(r0.b);
        r10.append(",sectionId:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r10.append(r0.a);
        N(false, -42, r10.toString(), r3);
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (r10 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r12 = r1.m0.getFilePointer();
        r14 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r12 == r14) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r1.m0.seek(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r1.m0.write(r0.c, 0, (int) r0.f4304d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        r11.f4364e = r0.b + r0.f4304d;
        r6 = (int) (((long) r6) + r0.f4304d);
        r0.c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r1.Z == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (g.i.b.f.h.e.b().j() >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r9 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        if ((r0 instanceof java.lang.NullPointerException) == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e9, code lost:
        if (g.i.b.e.h.b.a != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        android.util.Log.e("halley-downloader-TaskImpl", "saveData fail.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (g.i.b.e.h.b.b != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        g.i.b.e.h.b.d("E", "halley-downloader-TaskImpl", "saveData fail.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        r10 = -50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if (r1.l0.exists() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        r10 = -14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (g.h.a.a.i(r0) != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r10 = -12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        if (g.h.a.a.n(r0) != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0113, code lost:
        r10 = -17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        if (g.h.a.a.q(r0) != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        r10 = -78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        N(false, r10, "saveData fail.|" + g.h.a.a.f(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0133, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r19.isRunning()
            r2 = 0
            if (r0 == 0) goto L_0x0361
            g.i.b.f.e r3 = g.i.b.f.e.FAILED
            boolean r0 = r19.F()
            if (r0 == 0) goto L_0x0019
            r19.X()
            r19.W()
            goto L_0x035d
        L_0x0019:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
        L_0x001e:
            boolean r0 = r19.F()
            r8 = -42
            if (r0 == 0) goto L_0x002b
            r19.X()
            goto L_0x0133
        L_0x002b:
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r4
            r0 = 50
            long r12 = (long) r0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            java.util.concurrent.atomic.AtomicInteger r0 = r1.p0
            r0.getAndIncrement()
            r10 = 1
            goto L_0x0134
        L_0x003f:
            java.lang.Object r10 = r1.B0
            monitor-enter(r10)
            g.i.b.f.k.d$c r0 = r1.f4312h     // Catch:{ all -> 0x035e }
            g.i.b.f.k.d$c$a r0 = r0.a()     // Catch:{ all -> 0x035e }
            if (r0 != 0) goto L_0x004d
            monitor-exit(r10)     // Catch:{ all -> 0x035e }
            goto L_0x0133
        L_0x004d:
            g.i.b.f.k.a r11 = r1.f4311g     // Catch:{ all -> 0x035e }
            int r12 = r0.a     // Catch:{ all -> 0x035e }
            g.i.b.f.k.g.a r11 = r11.g(r12)     // Catch:{ all -> 0x035e }
            monitor-exit(r10)     // Catch:{ all -> 0x035e }
            if (r11 != 0) goto L_0x0060
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "inner error: getRange null for sectionId:"
            r10.<init>(r12)
            goto L_0x0081
        L_0x0060:
            long r12 = r11.f4364e
            long r14 = r0.b
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "inner error: check offset fail for section:"
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r12 = ",buffer offset:"
            r10.append(r12)
            long r12 = r0.b
            r10.append(r12)
            java.lang.String r12 = ",sectionId:"
            r10.append(r12)
        L_0x0081:
            int r12 = r0.a
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r1.N(r2, r8, r10, r3)
            r10 = 0
            goto L_0x0090
        L_0x008f:
            r10 = 1
        L_0x0090:
            if (r10 != 0) goto L_0x0094
            goto L_0x035d
        L_0x0094:
            java.io.RandomAccessFile r10 = r1.m0     // Catch:{ Exception -> 0x00db }
            long r12 = r10.getFilePointer()     // Catch:{ Exception -> 0x00db }
            long r14 = r0.b     // Catch:{ Exception -> 0x00db }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x00a5
            java.io.RandomAccessFile r10 = r1.m0     // Catch:{ Exception -> 0x00db }
            r10.seek(r14)     // Catch:{ Exception -> 0x00db }
        L_0x00a5:
            java.io.RandomAccessFile r10 = r1.m0     // Catch:{ Exception -> 0x00db }
            byte[] r12 = r0.c     // Catch:{ Exception -> 0x00db }
            long r13 = r0.f4304d     // Catch:{ Exception -> 0x00db }
            int r14 = (int) r13     // Catch:{ Exception -> 0x00db }
            r10.write(r12, r2, r14)     // Catch:{ Exception -> 0x00db }
            long r7 = r0.b
            long r12 = r0.f4304d
            long r7 = r7 + r12
            r11.f4364e = r7
            long r6 = (long) r6
            long r10 = r0.f4304d
            long r6 = r6 + r10
            int r6 = (int) r6
            r7 = 0
            r0.c = r7
            boolean r0 = r1.Z
            if (r0 == 0) goto L_0x001e
            g.i.b.f.h.e r0 = g.i.b.f.h.e.b()
            long r7 = r0.j()
            r10 = 2097152(0x200000, double:1.0361308E-317)
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            r9 = 1
            goto L_0x00d4
        L_0x00d3:
            r9 = 0
        L_0x00d4:
            if (r9 == 0) goto L_0x001e
            r19.E()
            goto L_0x001e
        L_0x00db:
            r0 = move-exception
            r0.printStackTrace()
            boolean r10 = r0 instanceof java.lang.NullPointerException
            if (r10 != 0) goto L_0x0133
            java.lang.String r10 = "halley-downloader-TaskImpl"
            java.lang.String r11 = "saveData fail."
            boolean r12 = g.i.b.e.h.b.a
            if (r12 == 0) goto L_0x00ee
            android.util.Log.e(r10, r11, r0)
        L_0x00ee:
            boolean r12 = g.i.b.e.h.b.b
            if (r12 == 0) goto L_0x00f7
            java.lang.String r12 = "E"
            g.i.b.e.h.b.d(r12, r10, r11, r0)
        L_0x00f7:
            r10 = -50
            java.io.File r11 = r1.l0
            boolean r11 = r11.exists()
            if (r11 != 0) goto L_0x0104
            r10 = -14
            goto L_0x011e
        L_0x0104:
            boolean r11 = g.h.a.a.i(r0)
            if (r11 == 0) goto L_0x010d
            r10 = -12
            goto L_0x011e
        L_0x010d:
            boolean r11 = g.h.a.a.n(r0)
            if (r11 == 0) goto L_0x0116
            r10 = -17
            goto L_0x011e
        L_0x0116:
            boolean r11 = g.h.a.a.q(r0)
            if (r11 == 0) goto L_0x011e
            r10 = -78
        L_0x011e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "saveData fail.|"
            r11.<init>(r12)
            java.lang.String r0 = g.h.a.a.f(r0)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r1.N(r2, r10, r0, r3)
        L_0x0133:
            r10 = 0
        L_0x0134:
            if (r10 != 0) goto L_0x0139
            r19.E()
        L_0x0139:
            long r11 = android.os.SystemClock.elapsedRealtime()
            g.i.b.f.k.b r0 = r1.f4314j
            if (r0 == 0) goto L_0x024a
            long r4 = r11 - r4
            int r5 = (int) r4
            int r4 = r0.f4291h
            int r4 = r4 + r5
            r0.f4291h = r4
            long r4 = android.os.SystemClock.elapsedRealtime()
            r16 = r10
            long r9 = r0.b
            long r9 = r4 - r9
            r0.b = r4
            g.i.b.f.k.e r4 = r0.a
            long r7 = r4.y
            long r7 = r7 + r9
            r4.y = r7
            if (r6 > 0) goto L_0x0160
            r4 = 1
            goto L_0x0161
        L_0x0160:
            r4 = 0
        L_0x0161:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r0.f4288e
            long r9 = r7 - r9
            int r10 = (int) r9
            r0.f4288e = r7
            java.util.List<g.i.b.f.k.b$a> r9 = r0.f4292i
            int r9 = r9.size()
            java.lang.String r5 = "halley-downloader-CostTimeCounter"
            r15 = 2000(0x7d0, float:2.803E-42)
            if (r9 != 0) goto L_0x0185
            if (r4 != 0) goto L_0x01e0
            java.util.List<g.i.b.f.k.b$a> r4 = r0.f4292i
            g.i.b.f.k.b$a r9 = new g.i.b.f.k.b$a
            r9.<init>(r6)
            r4.add(r9)
            goto L_0x01e0
        L_0x0185:
            java.util.List<g.i.b.f.k.b$a> r9 = r0.f4292i
            java.util.Iterator r9 = r9.iterator()
        L_0x018b:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x01a8
            java.lang.Object r17 = r9.next()
            r13 = r17
            g.i.b.f.k.b$a r13 = (g.i.b.f.k.b.a) r13
            int r14 = r13.b
            int r14 = r14 + r10
            r13.b = r14
            if (r4 != 0) goto L_0x018b
            if (r14 <= r15) goto L_0x018b
            r13.b = r2
            r13.a = r6
            r4 = 1
            goto L_0x018b
        L_0x01a8:
            if (r4 != 0) goto L_0x01d6
            java.util.List<g.i.b.f.k.b$a> r4 = r0.f4292i
            int r4 = r4.size()
            r9 = 41
            if (r4 <= r9) goto L_0x01cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "records.size():"
            r4.<init>(r9)
            java.util.List<g.i.b.f.k.b$a> r9 = r0.f4292i
            int r9 = r9.size()
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            g.i.b.e.h.b.i(r5, r4)
            goto L_0x01d6
        L_0x01cc:
            java.util.List<g.i.b.f.k.b$a> r4 = r0.f4292i
            g.i.b.f.k.b$a r9 = new g.i.b.f.k.b$a
            r9.<init>(r6)
            r4.add(r9)
        L_0x01d6:
            long r9 = r0.f4289f
            long r9 = r7 - r9
            r13 = 200(0xc8, double:9.9E-322)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x01e2
        L_0x01e0:
            r4 = 1
            goto L_0x01e3
        L_0x01e2:
            r4 = 0
        L_0x01e3:
            if (r4 == 0) goto L_0x0242
            java.util.List<g.i.b.f.k.b$a> r4 = r0.f4292i
            int r4 = r4.size()
            if (r4 != 0) goto L_0x01f0
            r18 = r3
            goto L_0x023d
        L_0x01f0:
            java.util.List<g.i.b.f.k.b$a> r4 = r0.f4292i
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
        L_0x01f8:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0233
            java.lang.Object r13 = r4.next()
            g.i.b.f.k.b$a r13 = (g.i.b.f.k.b.a) r13
            int r14 = r13.b
            if (r14 > r15) goto L_0x01f8
            int r14 = r13.a
            r18 = r3
            long r2 = (long) r14
            long r9 = r9 + r2
            r2 = 0
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 >= 0) goto L_0x022f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "sum:"
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = ",len:"
            r2.append(r3)
            int r3 = r13.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            g.i.b.e.h.b.h(r5, r2)
        L_0x022f:
            r3 = r18
            r2 = 0
            goto L_0x01f8
        L_0x0233:
            r18 = r3
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r2
            r2 = 2000(0x7d0, double:9.88E-321)
            long r9 = r9 / r2
            int r2 = (int) r9
        L_0x023d:
            r0.f4290g = r2
            r0.f4289f = r7
            goto L_0x0244
        L_0x0242:
            r18 = r3
        L_0x0244:
            g.i.b.f.k.e r0 = r0.a
            java.util.Objects.requireNonNull(r0)
            goto L_0x024e
        L_0x024a:
            r18 = r3
            r16 = r10
        L_0x024e:
            if (r6 <= 0) goto L_0x02ab
            monitor-enter(r19)
            g.i.b.f.k.a r0 = r1.f4311g     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x02a6
            java.io.File r2 = r1.l0     // Catch:{ all -> 0x02a8 }
            if (r2 == 0) goto L_0x02a6
            java.io.File r3 = r1.n0     // Catch:{ all -> 0x02a8 }
            if (r3 == 0) goto L_0x02a6
            long r2 = r2.lastModified()     // Catch:{ all -> 0x02a8 }
            r0.c = r2     // Catch:{ all -> 0x02a8 }
            g.i.b.f.k.a r0 = r1.f4311g     // Catch:{ all -> 0x02a8 }
            long r2 = r1.y     // Catch:{ all -> 0x02a8 }
            r0.f4279e = r2     // Catch:{ all -> 0x02a8 }
            g.i.b.f.k.a r0 = r1.f4311g     // Catch:{ all -> 0x02a8 }
            java.util.concurrent.atomic.AtomicLong r2 = r1.c     // Catch:{ all -> 0x02a8 }
            long r2 = r2.get()     // Catch:{ all -> 0x02a8 }
            r0.f4280f = r2     // Catch:{ all -> 0x02a8 }
            g.i.b.f.k.a r0 = r1.f4311g     // Catch:{ all -> 0x02a8 }
            java.lang.String r2 = r0.m()     // Catch:{ all -> 0x02a8 }
            r1.t0 = r2     // Catch:{ Exception -> 0x0289 }
            java.io.RandomAccessFile r0 = r1.o0     // Catch:{ Exception -> 0x0289 }
            r3 = 0
            r0.seek(r3)     // Catch:{ Exception -> 0x0289 }
            java.io.RandomAccessFile r0 = r1.o0     // Catch:{ Exception -> 0x0289 }
            r0.writeUTF(r2)     // Catch:{ Exception -> 0x0289 }
            r9 = 1
            goto L_0x029d
        L_0x0289:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x02a8 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02a8 }
            java.lang.String r3 = "writeCfg fail. cfg:"
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x02a8 }
            java.lang.String r3 = "halley-downloader-TaskImpl"
            g.i.b.e.h.b.e(r3, r2, r0)     // Catch:{ all -> 0x02a8 }
            r9 = 0
        L_0x029d:
            if (r9 != 0) goto L_0x02a6
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.String r2 = "saveRange...writeCfg false."
            g.i.b.e.h.b.h(r0, r2)     // Catch:{ all -> 0x02a8 }
        L_0x02a6:
            monitor-exit(r19)
            goto L_0x02ab
        L_0x02a8:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x02ab:
            boolean r0 = r19.F()
            if (r0 == 0) goto L_0x02b6
            r19.W()
            goto L_0x035b
        L_0x02b6:
            long r2 = r1.w
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x035b
            long r2 = (long) r6
            g.i.b.f.k.a r0 = r1.f4311g
            long r4 = r0.c()
            long r6 = r1.v0
            long r6 = r11 - r6
            r0 = 500(0x1f4, float:7.0E-43)
            long r8 = (long) r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02d6
            long r6 = r1.w
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0304
        L_0x02d6:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ee
            boolean r0 = r1.c0
            if (r0 != 0) goto L_0x02ee
            java.io.RandomAccessFile r0 = r1.m0     // Catch:{ all -> 0x02ea }
            java.io.FileDescriptor r0 = r0.getFD()     // Catch:{ all -> 0x02ea }
            r0.sync()     // Catch:{ all -> 0x02ea }
            goto L_0x02ee
        L_0x02ea:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02ee:
            r1.x = r4
            g.i.b.f.k.a r0 = r1.f4311g
            long r2 = r1.x
            int r6 = r19.d()
            r0.j(r2, r6)
            g.i.b.f.k.d r0 = r1.f4313i
            g.i.b.f.e r2 = g.i.b.f.e.f4229d
            r0.b(r2)
            r1.v0 = r11
        L_0x0304:
            long r2 = r1.w
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x032b
            g.i.b.f.k.b r0 = r1.f4314j
            long r2 = java.lang.System.currentTimeMillis()
            r0.f4287d = r2
            r1.Q = r11
            java.io.File r0 = r1.l0
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0327
            java.lang.String r0 = ""
            r2 = r18
            r3 = -14
            r4 = 0
            r1.N(r4, r3, r0, r2)
            goto L_0x035b
        L_0x0327:
            r19.G()
            goto L_0x035b
        L_0x032b:
            r2 = r18
            long r6 = r1.w
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x035b
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.String r3 = "receivedLength > detectLength"
            g.i.b.e.h.b.i(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "inner error: receivedLength > detectLength:"
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = " > "
            r0.append(r3)
            long r3 = r1.w
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = -42
            r4 = 0
            r1.N(r4, r3, r0, r2)
            r19.V()
        L_0x035b:
            r2 = r16
        L_0x035d:
            return r2
        L_0x035e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x035e }
            throw r0
        L_0x0361:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.e():boolean");
    }

    public final String f() {
        return this.f4316l;
    }

    public final synchronized String g() {
        return this.t;
    }

    public final g.i.b.f.d getPriority() {
        return g.i.b.f.d.NORMAL;
    }

    public final boolean h() {
        return this.f4313i.a == g.i.b.f.e.DELETED;
    }

    public final int i() {
        return this.U;
    }

    public final boolean isRunning() {
        return this.f4313i.a == g.i.b.f.e.STARTED || this.f4313i.a == g.i.b.f.e.f4229d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() {
        /*
            r5 = this;
            g.i.b.f.k.d r0 = r5.f4313i
            monitor-enter(r0)
            g.i.b.f.k.d r1 = r5.f4313i     // Catch:{ all -> 0x005d }
            g.i.b.f.e r1 = r1.a     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "halley-downloader-TaskImpl"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "trying resume...key:"
            r3.<init>(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.v     // Catch:{ all -> 0x005d }
            r3.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = ",url:"
            r3.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.r()     // Catch:{ all -> 0x005d }
            r3.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = ", now status:"
            r3.append(r4)     // Catch:{ all -> 0x005d }
            r3.append(r1)     // Catch:{ all -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x005d }
            g.i.b.e.h.b.f(r2, r3)     // Catch:{ all -> 0x005d }
            g.i.b.f.e r2 = g.i.b.f.e.STARTED     // Catch:{ all -> 0x005d }
            r3 = 1
            if (r1 == r2) goto L_0x005b
            g.i.b.f.e r2 = g.i.b.f.e.f4229d     // Catch:{ all -> 0x005d }
            if (r1 == r2) goto L_0x005b
            g.i.b.f.e r2 = g.i.b.f.e.COMPLETE     // Catch:{ all -> 0x005d }
            if (r1 == r2) goto L_0x005b
            g.i.b.f.e r2 = g.i.b.f.e.PENDING     // Catch:{ all -> 0x005d }
            if (r1 != r2) goto L_0x0042
            goto L_0x005b
        L_0x0042:
            g.i.b.f.e r2 = g.i.b.f.e.DELETED     // Catch:{ all -> 0x005d }
            r4 = 0
            if (r1 == r2) goto L_0x0059
            g.i.b.f.k.d r1 = r5.f4313i     // Catch:{ all -> 0x005d }
            boolean r1 = r1.f4294e     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            r5.a0 = r4     // Catch:{ all -> 0x005d }
            r5.X = r4     // Catch:{ all -> 0x005d }
            r5.W = r3     // Catch:{ all -> 0x005d }
            r5.O()     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r3
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r4
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r3
        L_0x005d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.l():boolean");
    }

    public final long m() {
        a aVar = this.f4311g;
        if (aVar != null) {
            long j2 = aVar.f4285k;
            if (j2 > this.x && j2 <= this.f4311g.a) {
                return j2;
            }
        }
        return this.x;
    }

    public final void n(g.i.b.f.c cVar) {
        this.f4313i.a(cVar);
    }

    public final String o() {
        return this.p;
    }

    public final g.i.b.f.e p() {
        return this.f4313i.a;
    }

    public final long q() {
        return this.z;
    }

    public final String r() {
        return this.f4310f.b.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0224, code lost:
        if (r6.c() <= r1.f4311g.a) goto L_0x0231;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            g.i.b.f.e r2 = g.i.b.f.e.FAILED
            r3 = 0
            r1.S = r3
            java.lang.String r0 = ""
            r1.t = r0
            long r4 = java.lang.System.currentTimeMillis()
            r1.B = r4
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1.C = r4
            r4 = 0
            r1.D0 = r4
            java.util.List<g.i.b.f.g.c> r0 = r1.f0
            r0.clear()
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r0 = r1.g0
            r0.clear()
            java.util.Map<g.i.b.f.k.f.a, java.util.List<java.lang.String>> r0 = r1.h0
            r0.clear()
            java.util.concurrent.atomic.AtomicInteger r0 = r1.i0
            r0.set(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j0
            r0.set(r3)
            g.i.b.f.g.b r0 = new g.i.b.f.g.b
            r0.<init>()
            r1.C0 = r0
            r1.v0 = r4
            g.i.b.f.k.g.d r6 = r1.q0
            monitor-enter(r6)
            r7 = -1
            r1.w = r7     // Catch:{ all -> 0x0421 }
            monitor-exit(r6)     // Catch:{ all -> 0x0421 }
            r1.b0 = r3
            r0 = -1
            r1.V = r0
            java.util.concurrent.atomic.AtomicLong r0 = r1.f4308d
            r0.set(r4)
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "task "
            r6.<init>(r9)
            java.lang.String r9 = r1.v
            r6.append(r9)
            java.lang.String r9 = " start run... url:"
            r6.append(r9)
            java.lang.String r9 = r26.r()
            r6.append(r9)
            java.lang.String r9 = ",Thread:"
            r6.append(r9)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            g.i.b.e.h.b.f(r0, r6)
            boolean r0 = r1.X
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "task stopped at the beginning. url:"
            r2.<init>(r3)
            java.lang.String r3 = r26.r()
            r2.append(r3)
            java.lang.String r3 = ",Thread:"
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            g.i.b.e.h.b.f(r0, r2)
            return
        L_0x00ac:
            g.i.b.f.k.d r6 = r1.f4313i
            monitor-enter(r6)
            java.util.concurrent.LinkedBlockingQueue<g.i.b.f.k.d$b> r0 = r6.f4293d     // Catch:{ all -> 0x041e }
            r0.clear()     // Catch:{ all -> 0x041e }
            monitor-exit(r6)
            g.i.b.f.k.d$c r0 = new g.i.b.f.k.d$c
            r0.<init>()
            r1.f4312h = r0
            g.i.b.f.k.b r0 = new g.i.b.f.k.b
            r0.<init>(r1)
            r1.f4314j = r0
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0.b = r9
            r0.c = r4
            r0.f4287d = r4
            g.i.b.f.k.d r0 = r1.f4313i
            g.i.b.f.e r6 = g.i.b.f.e.STARTED
            r0.b(r6)
            g.i.b.f.k.e$b r0 = new g.i.b.f.k.e$b
            r0.<init>()
            r1.r0 = r0
            int r0 = g.i.b.e.b.e.f4112g
            java.lang.String r6 = g.i.b.e.b.e.f4111f
            r1.L(r0, r6)
            java.lang.String r6 = "halley-downloader-TaskImpl"
            java.lang.String r0 = "initFileOnStart...begin"
            g.i.b.e.h.b.f(r6, r0)
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r1.o     // Catch:{ all -> 0x00f4 }
            r0.<init>(r9)     // Catch:{ all -> 0x00f4 }
            r0.mkdirs()     // Catch:{ all -> 0x00f4 }
            goto L_0x00f8
        L_0x00f4:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f8:
            r9 = 0
            r1.l0 = r9
            r1.n0 = r9
            g.i.b.f.k.a r0 = r1.f4311g
            if (r0 == 0) goto L_0x013f
            long r11 = r0.c()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r0 = r1.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0176
            boolean r0 = r1.A0
            if (r0 == 0) goto L_0x0123
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.q
            java.lang.String r12 = g.i.b.f.f.b.b(r12)
            r0.<init>(r11, r12)
            goto L_0x012c
        L_0x0123:
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.q
            r0.<init>(r11, r12)
        L_0x012c:
            r1.l0 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.q
            java.lang.String r12 = g.i.b.f.f.b.a(r12)
            r0.<init>(r11, r12)
            r1.n0 = r0
            r0 = 1
            goto L_0x0177
        L_0x013f:
            java.lang.String r0 = r1.p
            boolean r0 = g.i.b.f.f.b.c(r0)
            if (r0 == 0) goto L_0x0176
            boolean r0 = r1.A0
            if (r0 == 0) goto L_0x0159
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.p
            java.lang.String r12 = g.i.b.f.f.b.b(r12)
            r0.<init>(r11, r12)
            goto L_0x0162
        L_0x0159:
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.p
            r0.<init>(r11, r12)
        L_0x0162:
            r1.l0 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r11 = r1.o
            java.lang.String r12 = r1.p
            java.lang.String r12 = g.i.b.f.f.b.a(r12)
            r0.<init>(r11, r12)
            r1.n0 = r0
            r11 = 0
            r12 = 1
            goto L_0x0179
        L_0x0176:
            r0 = 0
        L_0x0177:
            r11 = r0
            r12 = 0
        L_0x0179:
            java.lang.String r13 = ""
            if (r11 != 0) goto L_0x017f
            if (r12 == 0) goto L_0x028d
        L_0x017f:
            java.io.File r0 = r1.l0
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x028d
            boolean r0 = r26.C()
            if (r0 != 0) goto L_0x018e
            goto L_0x0199
        L_0x018e:
            java.lang.String r0 = "initFileOnStart...create _cfgAccessFile"
            g.i.b.e.h.b.f(r6, r0)
            boolean r0 = r26.D()
            if (r0 != 0) goto L_0x019b
        L_0x0199:
            r0 = 0
            goto L_0x019c
        L_0x019b:
            r0 = 1
        L_0x019c:
            if (r0 != 0) goto L_0x01a1
            r4 = 1
            goto L_0x02be
        L_0x01a1:
            java.lang.String r0 = r1.t0
            if (r0 == 0) goto L_0x01c3
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = r1.t0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "currentCfg = "
            r14.<init>(r15)
            java.lang.String r15 = r1.t0
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "TAG"
            g.i.b.e.h.b.i(r15, r14)
            goto L_0x01d9
        L_0x01c3:
            java.io.RandomAccessFile r0 = r1.o0     // Catch:{ Exception -> 0x01cf }
            r0.seek(r4)     // Catch:{ Exception -> 0x01cf }
            java.io.RandomAccessFile r0 = r1.o0     // Catch:{ Exception -> 0x01cf }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x01cf }
            goto L_0x01d9
        L_0x01cf:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r14 = "readCfg fail."
            g.i.b.e.h.b.e(r6, r14, r0)
            r0 = r13
        L_0x01d9:
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 == 0) goto L_0x01e0
            r0 = r13
        L_0x01e0:
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r15 = "initFileOnStart...readCfg:"
            java.lang.String r14 = r15.concat(r14)
            g.i.b.e.h.b.f(r6, r14)
            g.i.b.f.k.a r6 = new g.i.b.f.k.a
            r6.<init>(r0)
            r1.f4311g = r6
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r14 = "resume failed. cfg:"
            if (r6 != 0) goto L_0x0283
            g.i.b.f.k.a r6 = r1.f4311g
            boolean r6 = r6.f4278d
            if (r6 == 0) goto L_0x0283
            java.io.File r6 = r1.l0
            long r7 = r6.lastModified()
            if (r12 == 0) goto L_0x0227
            g.i.b.f.k.a r6 = r1.f4311g
            long r9 = r6.c
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0227
            g.i.b.f.k.a r6 = r1.f4311g
            long r9 = r6.a
            int r16 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x0227
            long r9 = r6.c()
            g.i.b.f.k.a r6 = r1.f4311g
            long r3 = r6.a
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0227
            goto L_0x0231
        L_0x0227:
            if (r11 == 0) goto L_0x0233
            g.i.b.f.k.a r3 = r1.f4311g
            long r3 = r3.c
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0233
        L_0x0231:
            r3 = 1
            goto L_0x0234
        L_0x0233:
            r3 = 0
        L_0x0234:
            if (r3 == 0) goto L_0x0261
            java.lang.String r0 = r1.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0242
            java.lang.String r0 = r1.p
            r1.q = r0
        L_0x0242:
            g.i.b.f.k.a r0 = r1.f4311g
            long r4 = r0.f4279e
            r1.y = r4
            java.util.concurrent.atomic.AtomicLong r0 = r1.c
            g.i.b.f.k.a r4 = r1.f4311g
            long r4 = r4.f4280f
            r0.set(r4)
            if (r12 == 0) goto L_0x028e
            g.i.b.f.k.a r0 = r1.f4311g
            long r4 = r0.a
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x028e
            r4 = 1
            r1.b0 = r4
            goto L_0x028e
        L_0x0261:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r0)
            java.lang.String r0 = ",flm:"
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = ",from:"
            r4.append(r0)
            r5 = 1
            r0 = r12 ^ 1
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.u = r0
            goto L_0x028e
        L_0x0283:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r14.concat(r0)
            r1.u = r0
        L_0x028d:
            r3 = 0
        L_0x028e:
            if (r3 != 0) goto L_0x02ba
            r26.W()
            r4 = -1
            r1.w = r4
            r1.q = r13
            r4 = 0
            r1.y = r4
            java.util.concurrent.atomic.AtomicLong r0 = r1.c
            r0.set(r4)
            r4 = 1
            r1.W = r4
            r1.r = r13
            r1.s = r13
            r5 = 0
            r1.a0 = r5
            r1.S = r5
            r1.t = r13
            g.i.b.f.k.a r0 = new g.i.b.f.k.a
            r0.<init>(r13)
            r1.f4311g = r0
            r1.b0 = r5
            goto L_0x02bb
        L_0x02ba:
            r4 = 1
        L_0x02bb:
            r1.d0 = r3
            r3 = 1
        L_0x02be:
            if (r3 == 0) goto L_0x03c9
            g.i.b.f.k.a r0 = r1.f4311g
            long r5 = r0.a
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d4
            long r7 = r0.c()
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x02d4
            r0 = 1
            goto L_0x02d5
        L_0x02d4:
            r0 = 0
        L_0x02d5:
            if (r0 == 0) goto L_0x02e9
            java.lang.String r0 = "halley-downloader-TaskImpl"
            java.lang.String r2 = "checkAlreadyCompleted"
            g.i.b.e.h.b.f(r0, r2)
            g.i.b.f.k.a r0 = r1.f4311g
            long r2 = r0.a
            r1.x = r2
            r26.G()
            goto L_0x03d1
        L_0x02e9:
            g.i.b.f.k.g.d r3 = r1.q0
            monitor-enter(r3)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03c6 }
            r3.f4386d = r5     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = ""
            java.lang.String r5 = ""
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c6 }
            if (r6 == 0) goto L_0x02fd
            r0 = r5
        L_0x02fd:
            g.i.b.f.k.g.c r12 = new g.i.b.f.k.g.c     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.e r8 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.f.b r6 = r8.f4310f     // Catch:{ all -> 0x03c6 }
            r7 = 1
            java.util.Map<java.lang.String, java.lang.String> r10 = r8.f4309e     // Catch:{ all -> 0x03c6 }
            boolean r11 = r8.c0     // Catch:{ all -> 0x03c6 }
            r5 = r12
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x03c6 }
            r3.a = r12     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.e r5 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            int r5 = r5.T     // Catch:{ all -> 0x03c6 }
            r12.a(r5)     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.g.c r5 = r3.a     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.e r6 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x03c6 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.g.c r7 = r3.a     // Catch:{ Exception -> 0x0340 }
            g.i.b.f.k.e r11 = r3.f4387e     // Catch:{ Exception -> 0x0340 }
            java.util.List<g.i.b.f.g.c> r8 = r11.f0     // Catch:{ Exception -> 0x0340 }
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r9 = r11.g0     // Catch:{ Exception -> 0x0340 }
            java.util.Map<g.i.b.f.k.f.a, java.util.List<java.lang.String>> r10 = r11.h0     // Catch:{ Exception -> 0x0340 }
            java.util.concurrent.atomic.AtomicInteger r12 = r11.i0     // Catch:{ Exception -> 0x0340 }
            java.util.concurrent.atomic.AtomicInteger r13 = r11.j0     // Catch:{ Exception -> 0x0340 }
            long r14 = r3.f4386d     // Catch:{ Exception -> 0x0340 }
            r7.d(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0340 }
            g.i.b.f.j.a r5 = g.i.b.f.j.a.b()     // Catch:{ Exception -> 0x0340 }
            g.i.b.f.k.g.c r6 = r3.a     // Catch:{ Exception -> 0x0340 }
            g.i.b.e.b.a.d r5 = r5.c     // Catch:{ Exception -> 0x0340 }
            r5.submit(r6)     // Catch:{ Exception -> 0x0340 }
            r11 = 0
            goto L_0x0350
        L_0x0340:
            r0 = move-exception
            r5 = 0
            r3.a = r5     // Catch:{ all -> 0x03c6 }
            java.lang.String r5 = g.h.a.a.f(r0)     // Catch:{ all -> 0x03c6 }
            r0.printStackTrace()     // Catch:{ all -> 0x03c6 }
            r0 = -67
            r0 = r5
            r11 = -67
        L_0x0350:
            if (r11 == 0) goto L_0x0354
            goto L_0x03be
        L_0x0354:
            g.i.b.f.k.e r7 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            g.i.b.f.b r5 = r7.k0     // Catch:{ all -> 0x03c6 }
            g.i.b.f.b r6 = g.i.b.f.b.Cate_DefaultEase     // Catch:{ all -> 0x03c6 }
            if (r5 != r6) goto L_0x035e
            r10 = 1
            goto L_0x035f
        L_0x035e:
            r10 = 0
        L_0x035f:
            if (r10 == 0) goto L_0x0362
            goto L_0x03be
        L_0x0362:
            boolean r4 = r7.e0     // Catch:{ all -> 0x03c6 }
            if (r4 == 0) goto L_0x03be
            g.i.b.f.k.g.c r12 = new g.i.b.f.k.g.c     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.f.b r5 = r7.f4310f     // Catch:{ all -> 0x03c6 }
            r6 = 0
            java.util.Map<java.lang.String, java.lang.String> r9 = r7.f4309e     // Catch:{ all -> 0x03c6 }
            boolean r10 = r7.c0     // Catch:{ all -> 0x03c6 }
            r4 = r12
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x03c6 }
            r3.b = r12     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.e r4 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            int r4 = r4.T     // Catch:{ all -> 0x03c6 }
            r12.a(r4)     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.g.c r4 = r3.b     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.e r5 = r3.f4387e     // Catch:{ all -> 0x03c6 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x03c6 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.g.c r4 = r3.b     // Catch:{ all -> 0x03c6 }
            r4.k()     // Catch:{ all -> 0x03c6 }
            g.i.b.f.k.g.c r4 = r3.b     // Catch:{ Exception -> 0x03bb }
            g.i.b.f.k.e r5 = r3.f4387e     // Catch:{ Exception -> 0x03bb }
            java.util.List<g.i.b.f.g.c> r6 = r5.f0     // Catch:{ Exception -> 0x03bb }
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r7 = r5.g0     // Catch:{ Exception -> 0x03bb }
            java.util.Map<g.i.b.f.k.f.a, java.util.List<java.lang.String>> r8 = r5.h0     // Catch:{ Exception -> 0x03bb }
            java.util.concurrent.atomic.AtomicInteger r9 = r5.i0     // Catch:{ Exception -> 0x03bb }
            java.util.concurrent.atomic.AtomicInteger r10 = r5.j0     // Catch:{ Exception -> 0x03bb }
            long r12 = r3.f4386d     // Catch:{ Exception -> 0x03bb }
            r17 = r4
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r5
            r22 = r9
            r23 = r10
            r24 = r12
            r17.d(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x03bb }
            g.i.b.f.j.a r4 = g.i.b.f.j.a.b()     // Catch:{ Exception -> 0x03bb }
            g.i.b.f.k.g.c r5 = r3.b     // Catch:{ Exception -> 0x03bb }
            g.i.b.e.b.a.d r4 = r4.f4274d     // Catch:{ Exception -> 0x03bb }
            r4.submit(r5)     // Catch:{ Exception -> 0x03bb }
            goto L_0x03be
        L_0x03bb:
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x03c6 }
        L_0x03be:
            monitor-exit(r3)
            if (r11 == 0) goto L_0x03d1
            r3 = 0
            r1.N(r3, r11, r0, r2)
            goto L_0x03d1
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03c9:
            int r0 = r1.S
            java.lang.String r3 = r1.t
            r4 = 0
            r1.N(r4, r0, r3, r2)
        L_0x03d1:
            g.i.b.f.k.d r0 = r1.f4313i
            r0.d()
            r26.X()
            r26.W()
            boolean r0 = r1.z0
            if (r0 == 0) goto L_0x03ee
            r26.V()
            r26.T()
            boolean r0 = r1.A0
            if (r0 == 0) goto L_0x03fd
            r26.U()
            goto L_0x03fd
        L_0x03ee:
            boolean r0 = r26.v()
            if (r0 != 0) goto L_0x03fa
            int r0 = r1.S
            r2 = -75
            if (r0 != r2) goto L_0x03fd
        L_0x03fa:
            r26.V()
        L_0x03fd:
            r26.H()
            java.util.concurrent.atomic.AtomicLong r0 = r1.f4308d
            r2 = 0
            r0.set(r2)
            r2 = 0
            r1.r0 = r2
            g.i.b.f.k.g.d r0 = r1.q0
            r0.a = r2
            r0.b = r2
            java.util.ArrayList<g.i.b.f.k.g.c> r2 = r0.c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x041d
            java.util.ArrayList<g.i.b.f.k.g.c> r0 = r0.c
            r0.clear()
        L_0x041d:
            return
        L_0x041e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0421:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0421 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.e.run():void");
    }

    public final long s() {
        if (this.f4310f.f4347g > 0) {
            return this.f4310f.f4347g;
        }
        long j2 = this.z;
        if (j2 > 0) {
            return j2;
        }
        if (this.w > 0) {
            return this.w;
        }
        try {
            return this.f4311g.a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final void t() {
        d dVar = this.f4313i;
        synchronized (dVar.b) {
            dVar.b.clear();
        }
        synchronized (dVar.c) {
            dVar.c.clear();
        }
    }

    public final String u() {
        return this.q;
    }

    public final boolean v() {
        return this.f4313i.a == g.i.b.f.e.COMPLETE;
    }

    public final String w() {
        String str = TextUtils.isEmpty(this.q) ? this.p : this.q;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new File(this.o, str).getAbsolutePath();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final String x() {
        return this.v;
    }

    public final g.i.b.f.b y() {
        return this.k0;
    }

    public final String z() {
        return this.o;
    }
}
