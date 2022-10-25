package g.i.b.f.g;

import android.text.TextUtils;
import g.i.b.e.b.h;
import g.i.b.f.k.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c implements Runnable {
    public g.i.b.f.k.f.a b;
    public volatile boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4249d = false;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4250e = false;

    /* renamed from: f  reason: collision with root package name */
    public h f4251f;

    /* renamed from: g  reason: collision with root package name */
    public b f4252g = new b();

    /* renamed from: h  reason: collision with root package name */
    public long f4253h = 0;

    /* renamed from: i  reason: collision with root package name */
    public String f4254i = "";

    /* renamed from: j  reason: collision with root package name */
    public List<c> f4255j;

    /* renamed from: k  reason: collision with root package name */
    public e f4256k;

    /* renamed from: l  reason: collision with root package name */
    public a f4257l;

    /* renamed from: m  reason: collision with root package name */
    public g.i.b.f.k.f.b f4258m;
    public g.i.b.f.f.a.e n;
    public List<g.i.b.f.i.a> o;
    public int p = -88;
    public boolean q = false;
    public AtomicInteger r;
    public AtomicInteger s;
    public int t = -1;
    public int u = -1;

    public interface a {
    }

    public static class b {
        public int a;
        public int b = -1;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f4259d = -1;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f4260e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public int f4261f;

        /* renamed from: g  reason: collision with root package name */
        public String f4262g = "";

        /* renamed from: h  reason: collision with root package name */
        public int f4263h;

        /* renamed from: i  reason: collision with root package name */
        public int f4264i;

        /* renamed from: j  reason: collision with root package name */
        public List<String> f4265j = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        public int f4266k;

        /* renamed from: l  reason: collision with root package name */
        public List<String> f4267l = new ArrayList();

        /* renamed from: m  reason: collision with root package name */
        public String f4268m = "";

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            sb.append(",");
            sb.append(this.c);
            sb.append(",");
            sb.append(this.f4259d);
            sb.append(",");
            if (this.f4260e.size() > 0) {
                for (String append : this.f4260e) {
                    sb.append(append);
                    sb.append("-");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(",");
            sb.append(this.f4261f);
            sb.append(",");
            sb.append(this.f4262g);
            sb.append(",");
            sb.append(this.f4263h);
            sb.append(",");
            sb.append(this.f4264i);
            sb.append(",");
            if (this.f4265j.size() > 0) {
                for (String append2 : this.f4265j) {
                    sb.append(append2);
                    sb.append("-");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(",");
            sb.append(this.f4266k);
            sb.append(",");
            if (this.f4267l.size() > 0) {
                for (String append3 : this.f4267l) {
                    sb.append(append3);
                    sb.append("-");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(",");
            sb.append(this.f4268m);
            return sb.toString();
        }
    }

    static {
        new AtomicInteger(1);
    }

    public c(e eVar, g.i.b.f.k.f.b bVar, g.i.b.f.k.f.a aVar, List<c> list, Map<g.i.b.f.k.f.a, c> map, a aVar2, boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        this.f4256k = eVar;
        this.f4258m = bVar;
        this.o = bVar.c();
        this.b = aVar;
        this.f4255j = list;
        this.f4257l = aVar2;
        this.q = z;
        this.s = atomicInteger;
        this.r = atomicInteger2;
    }

    public final void a(List<byte[]> list, String str) {
        int i2;
        if (list.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] next : list) {
                byteArrayOutputStream.write(next, 0, next.length);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (g.i.b.e.h.e.f(byteArray)) {
                i2 = 6;
            } else if (str.toLowerCase().equals(g.i.b.e.h.c.d(byteArray).toLowerCase())) {
                this.p = 0;
                return;
            } else {
                this.p = -1;
                Matcher matcher = Pattern.compile("(?<=channelId=).*(?=\r\n)").matcher(new String(byteArray));
                String group = matcher.find() ? matcher.group() : "";
                if (!TextUtils.isEmpty(group)) {
                    this.f4254i = group;
                    g.i.b.e.h.b.c("md5Verify", "channel was hijack,hijackChannel=".concat(String.valueOf(group)));
                    return;
                }
                return;
            }
        } else {
            i2 = 3;
        }
        this.p = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[SYNTHETIC, Splitter:B:24:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00aa A[LOOP:0: B:1:0x0006->B:52:0x00aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3 A[EDGE_INSN: B:55:0x00b3->B:53:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] b(g.i.b.f.k.f.a r17, g.i.b.f.k.g.a.C0162a r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = 0
            r3 = 0
            r0 = r3
            r4 = 0
        L_0x0006:
            r5 = 2
            if (r4 >= r5) goto L_0x00b3
            g.i.b.f.f.a.e r5 = new g.i.b.f.f.a.e
            r8 = 0
            r10 = 0
            g.i.b.f.k.e r11 = r1.f4256k
            r12 = 1
            g.i.b.f.k.f.b r13 = r1.f4258m
            r14 = 2
            r15 = 0
            r6 = r5
            r7 = r17
            r9 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.n = r5
            r5.b()
            g.i.b.f.f.a.e r5 = r1.n
            int r5 = r5.f4238g
            g.i.b.f.g.c$b r6 = r1.f4252g
            java.util.List<java.lang.String> r6 = r6.f4260e
            java.lang.String r7 = java.lang.String.valueOf(r5)
            r6.add(r7)
            if (r5 != 0) goto L_0x008e
            g.i.b.f.f.a.e r6 = r1.n
            java.util.Objects.requireNonNull(r6)
            java.net.HttpURLConnection r0 = r6.t     // Catch:{ all -> 0x0064 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0064 }
            r6.u = r0     // Catch:{ all -> 0x0064 }
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0064 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0064 }
            r7.<init>()     // Catch:{ all -> 0x0064 }
        L_0x0048:
            java.io.InputStream r8 = r6.u     // Catch:{ all -> 0x0062 }
            int r8 = r8.read(r0)     // Catch:{ all -> 0x0062 }
            r9 = -1
            if (r8 == r9) goto L_0x0055
            r7.write(r0, r2, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x0048
        L_0x0055:
            byte[] r8 = r7.toByteArray()     // Catch:{ all -> 0x0062 }
            r6.f()
            r7.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0082
        L_0x0060:
            r0 = move-exception
            goto L_0x0076
        L_0x0062:
            r0 = move-exception
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            r7 = r3
        L_0x0066:
            r6.c(r0)     // Catch:{ all -> 0x007a }
            r6.f()
            if (r7 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r7.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0072:
            r8 = r3
            goto L_0x0082
        L_0x0074:
            r0 = move-exception
            r8 = r3
        L_0x0076:
            r0.printStackTrace()
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r8 = r0
            r6.f()
            if (r7 != 0) goto L_0x0084
            goto L_0x0072
        L_0x0082:
            r0 = r8
            goto L_0x0096
        L_0x0084:
            r7.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x008d:
            throw r8
        L_0x008e:
            r6 = -74
            if (r5 != r6) goto L_0x0096
            r0 = 7
            r1.p = r0
            r0 = r3
        L_0x0096:
            if (r5 == 0) goto L_0x00a7
            r6 = -66
            if (r5 == r6) goto L_0x00a7
            r6 = -15
            if (r5 == r6) goto L_0x00a7
            r6 = -16
            if (r5 != r6) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r5 = 0
            goto L_0x00a8
        L_0x00a7:
            r5 = 1
        L_0x00a8:
            if (r5 != 0) goto L_0x00b3
            r5 = 50
            android.os.SystemClock.sleep(r5)
            int r4 = r4 + 1
            goto L_0x0006
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.g.c.b(g.i.b.f.k.f.a, g.i.b.f.k.g.a$a):byte[]");
    }

    public final boolean c() {
        return this.p == -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = ""
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 1
            r6 = 5
            r7 = -88
            boolean r0 = r1.f4250e     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x0061
            boolean r0 = r1.f4250e
            if (r0 == 0) goto L_0x001c
            int r0 = r1.p
            if (r0 != r7) goto L_0x001c
            r1.p = r6
            java.lang.String r2 = ""
        L_0x001c:
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r5 = r1.b
            int r5 = r5.c
            r0.c = r5
            int r5 = r1.p
            r0.f4261f = r5
            r0.f4262g = r2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            int r2 = (int) r5
            r0.f4263h = r2
            g.i.b.f.g.c$b r0 = r1.f4252g
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f4253h
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.f4264i = r3
            g.i.b.f.g.c$b r0 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r2 = r1.s
            int r2 = r2.incrementAndGet()
            r0.a = r2
            g.i.b.f.k.f.a r0 = r1.b
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0060
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r2 = r1.b
            java.lang.String r2 = r2.a()
            r0.f4268m = r2
        L_0x0060:
            return
        L_0x0061:
            g.i.b.f.k.f.a r0 = r1.b     // Catch:{ all -> 0x025b }
            g.i.b.f.k.f.a$a r0 = r0.b     // Catch:{ all -> 0x025b }
            g.i.b.f.k.f.a$a r8 = g.i.b.f.k.f.a.C0161a.Type_CDN_Ip_Socket_Schedule_Https     // Catch:{ all -> 0x025b }
            r9 = 0
            if (r0 != r8) goto L_0x006e
            r1.p = r9     // Catch:{ all -> 0x025b }
            goto L_0x00da
        L_0x006e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x025b }
            r0.<init>()     // Catch:{ all -> 0x025b }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x025b }
            r8.<init>()     // Catch:{ all -> 0x025b }
            r10 = 0
        L_0x0079:
            java.util.List<g.i.b.f.i.a> r11 = r1.o     // Catch:{ all -> 0x025b }
            int r11 = r11.size()     // Catch:{ all -> 0x025b }
            if (r10 >= r11) goto L_0x00aa
            java.util.List<g.i.b.f.i.a> r11 = r1.o     // Catch:{ all -> 0x025b }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x025b }
            g.i.b.f.i.a r11 = (g.i.b.f.i.a) r11     // Catch:{ all -> 0x025b }
            long r12 = r11.a     // Catch:{ all -> 0x025b }
            int r11 = r11.b     // Catch:{ all -> 0x025b }
            long r14 = (long) r11     // Catch:{ all -> 0x025b }
            long r14 = r14 + r12
            r16 = 1
            long r14 = r14 - r16
            r16 = 0
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00a9
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x009e
            goto L_0x00a9
        L_0x009e:
            g.i.b.f.k.g.a$a r11 = new g.i.b.f.k.g.a$a     // Catch:{ all -> 0x025b }
            r11.<init>(r12, r14)     // Catch:{ all -> 0x025b }
            r8.add(r11)     // Catch:{ all -> 0x025b }
            int r10 = r10 + 1
            goto L_0x0079
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            if (r8 != 0) goto L_0x00b0
            r0 = 2
            r1.p = r0     // Catch:{ all -> 0x025b }
            goto L_0x00da
        L_0x00b0:
            g.i.b.f.k.f.b r10 = r1.f4258m     // Catch:{ all -> 0x025b }
            java.lang.String r10 = r10.f4351k     // Catch:{ all -> 0x025b }
        L_0x00b4:
            int r11 = r8.size()     // Catch:{ all -> 0x025b }
            if (r9 >= r11) goto L_0x00d7
            g.i.b.f.k.f.a r11 = r1.b     // Catch:{ all -> 0x025b }
            java.lang.Object r12 = r8.get(r9)     // Catch:{ all -> 0x025b }
            g.i.b.f.k.g.a$a r12 = (g.i.b.f.k.g.a.C0162a) r12     // Catch:{ all -> 0x025b }
            byte[] r11 = r1.b(r11, r12)     // Catch:{ all -> 0x025b }
            if (r11 == 0) goto L_0x00ce
            r0.add(r11)     // Catch:{ all -> 0x025b }
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00ce:
            int r0 = r1.p     // Catch:{ all -> 0x025b }
            r8 = 7
            if (r0 == r8) goto L_0x00da
            r0 = 4
            r1.p = r0     // Catch:{ all -> 0x025b }
            goto L_0x00da
        L_0x00d7:
            r1.a(r0, r10)     // Catch:{ all -> 0x025b }
        L_0x00da:
            boolean r0 = r1.f4250e     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x012f
            boolean r0 = r1.f4250e
            if (r0 == 0) goto L_0x00ea
            int r0 = r1.p
            if (r0 != r7) goto L_0x00ea
            r1.p = r6
            java.lang.String r2 = ""
        L_0x00ea:
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r5 = r1.b
            int r5 = r5.c
            r0.c = r5
            int r5 = r1.p
            r0.f4261f = r5
            r0.f4262g = r2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            int r2 = (int) r5
            r0.f4263h = r2
            g.i.b.f.g.c$b r0 = r1.f4252g
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f4253h
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.f4264i = r3
            g.i.b.f.g.c$b r0 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r2 = r1.s
            int r2 = r2.incrementAndGet()
            r0.a = r2
            g.i.b.f.k.f.a r0 = r1.b
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x012e
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r2 = r1.b
            java.lang.String r2 = r2.a()
            r0.f4268m = r2
        L_0x012e:
            return
        L_0x012f:
            int r0 = r1.p     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x0146
            g.i.b.f.k.f.b r0 = r1.f4258m     // Catch:{ all -> 0x025b }
            g.i.b.f.k.f.a r8 = r1.b     // Catch:{ all -> 0x025b }
            java.util.List<g.i.b.f.k.f.a> r9 = r0.a     // Catch:{ all -> 0x025b }
            monitor-enter(r9)     // Catch:{ all -> 0x025b }
            r8.f4332d = r5     // Catch:{ all -> 0x0143 }
            java.util.List<g.i.b.f.k.f.a> r0 = r0.a     // Catch:{ all -> 0x0143 }
            r0.add(r8)     // Catch:{ all -> 0x0143 }
            monitor-exit(r9)     // Catch:{ all -> 0x0143 }
            goto L_0x0153
        L_0x0143:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x0146:
            boolean r0 = r18.c()     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x0153
            r1.c = r5     // Catch:{ all -> 0x025b }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.r     // Catch:{ all -> 0x025b }
            r0.incrementAndGet()     // Catch:{ all -> 0x025b }
        L_0x0153:
            boolean r0 = r1.q     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x0203
            g.i.b.f.k.f.b r0 = r1.f4258m     // Catch:{ all -> 0x025b }
            java.util.List<g.i.b.f.k.f.a> r8 = r0.a     // Catch:{ all -> 0x025b }
            monitor-enter(r8)     // Catch:{ all -> 0x025b }
            java.util.List<g.i.b.f.k.f.a> r0 = r0.a     // Catch:{ all -> 0x0200 }
            int r0 = r0.size()     // Catch:{ all -> 0x0200 }
            monitor-exit(r8)     // Catch:{ all -> 0x0200 }
            if (r0 > 0) goto L_0x01b6
            boolean r0 = r1.f4250e
            if (r0 == 0) goto L_0x0171
            int r0 = r1.p
            if (r0 != r7) goto L_0x0171
            r1.p = r6
            java.lang.String r2 = ""
        L_0x0171:
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r5 = r1.b
            int r5 = r5.c
            r0.c = r5
            int r5 = r1.p
            r0.f4261f = r5
            r0.f4262g = r2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            int r2 = (int) r5
            r0.f4263h = r2
            g.i.b.f.g.c$b r0 = r1.f4252g
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f4253h
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.f4264i = r3
            g.i.b.f.g.c$b r0 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r2 = r1.s
            int r2 = r2.incrementAndGet()
            r0.a = r2
            g.i.b.f.k.f.a r0 = r1.b
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01b5
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r2 = r1.b
            java.lang.String r2 = r2.a()
            r0.f4268m = r2
        L_0x01b5:
            return
        L_0x01b6:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x025b }
            r0.<init>()     // Catch:{ all -> 0x025b }
            java.util.List<g.i.b.f.g.c> r8 = r1.f4255j     // Catch:{ all -> 0x025b }
            monitor-enter(r8)     // Catch:{ all -> 0x025b }
            java.util.List<g.i.b.f.g.c> r9 = r1.f4255j     // Catch:{ all -> 0x01fd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01fd }
        L_0x01c4:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x01fd }
            if (r10 == 0) goto L_0x01d8
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x01fd }
            g.i.b.f.g.c r10 = (g.i.b.f.g.c) r10     // Catch:{ all -> 0x01fd }
            boolean r11 = r10.c     // Catch:{ all -> 0x01fd }
            if (r11 == 0) goto L_0x01c4
            r0.add(r10)     // Catch:{ all -> 0x01fd }
            goto L_0x01c4
        L_0x01d8:
            monitor-exit(r8)     // Catch:{ all -> 0x01fd }
            java.lang.Class<g.i.b.f.g.c> r8 = g.i.b.f.g.c.class
            monitor-enter(r8)     // Catch:{ all -> 0x025b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01fa }
        L_0x01e0:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x01fa }
            if (r9 == 0) goto L_0x01f8
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x01fa }
            g.i.b.f.g.c r9 = (g.i.b.f.g.c) r9     // Catch:{ all -> 0x01fa }
            r9.f4249d = r5     // Catch:{ all -> 0x01fa }
            g.i.b.f.g.c$a r10 = r1.f4257l     // Catch:{ all -> 0x01fa }
            g.i.b.f.k.f.a r9 = r9.b     // Catch:{ all -> 0x01fa }
            g.i.b.f.k.g.c r10 = (g.i.b.f.k.g.c) r10     // Catch:{ all -> 0x01fa }
            r10.c(r9)     // Catch:{ all -> 0x01fa }
            goto L_0x01e0
        L_0x01f8:
            monitor-exit(r8)     // Catch:{ all -> 0x01fa }
            goto L_0x0214
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01fa }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x0200:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0200 }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x0203:
            boolean r0 = r18.c()     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x0214
            r1.f4249d = r5     // Catch:{ all -> 0x025b }
            g.i.b.f.g.c$a r0 = r1.f4257l     // Catch:{ all -> 0x025b }
            g.i.b.f.k.f.a r8 = r1.b     // Catch:{ all -> 0x025b }
            g.i.b.f.k.g.c r0 = (g.i.b.f.k.g.c) r0     // Catch:{ all -> 0x025b }
            r0.c(r8)     // Catch:{ all -> 0x025b }
        L_0x0214:
            boolean r0 = r1.f4250e
            if (r0 == 0) goto L_0x0220
            int r0 = r1.p
            if (r0 != r7) goto L_0x0220
            r1.p = r6
            java.lang.String r2 = ""
        L_0x0220:
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r5 = r1.b
            int r5 = r5.c
            r0.c = r5
            int r5 = r1.p
            r0.f4261f = r5
            r0.f4262g = r2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            int r2 = (int) r5
            r0.f4263h = r2
            g.i.b.f.g.c$b r0 = r1.f4252g
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f4253h
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.f4264i = r3
            g.i.b.f.g.c$b r0 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r2 = r1.s
            int r2 = r2.incrementAndGet()
            r0.a = r2
            g.i.b.f.k.f.a r0 = r1.b
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02d3
            goto L_0x02c9
        L_0x025b:
            r0 = move-exception
            r1.p = r5     // Catch:{ all -> 0x02d4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d4 }
            r5.<init>()     // Catch:{ all -> 0x02d4 }
            java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x02d4 }
            java.lang.String r8 = r8.getSimpleName()     // Catch:{ all -> 0x02d4 }
            r5.append(r8)     // Catch:{ all -> 0x02d4 }
            java.lang.String r8 = "("
            r5.append(r8)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x02d4 }
            r5.append(r0)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x02d4 }
            boolean r2 = r1.f4250e
            if (r2 == 0) goto L_0x028f
            int r2 = r1.p
            if (r2 != r7) goto L_0x028f
            r1.p = r6
            java.lang.String r0 = ""
        L_0x028f:
            g.i.b.f.g.c$b r2 = r1.f4252g
            g.i.b.f.k.f.a r5 = r1.b
            int r5 = r5.c
            r2.c = r5
            int r5 = r1.p
            r2.f4261f = r5
            r2.f4262g = r0
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            int r0 = (int) r5
            r2.f4263h = r0
            g.i.b.f.g.c$b r0 = r1.f4252g
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f4253h
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.f4264i = r3
            g.i.b.f.g.c$b r0 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r2 = r1.s
            int r2 = r2.incrementAndGet()
            r0.a = r2
            g.i.b.f.k.f.a r0 = r1.b
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02d3
        L_0x02c9:
            g.i.b.f.g.c$b r0 = r1.f4252g
            g.i.b.f.k.f.a r2 = r1.b
            java.lang.String r2 = r2.a()
            r0.f4268m = r2
        L_0x02d3:
            return
        L_0x02d4:
            r0 = move-exception
            boolean r5 = r1.f4250e
            if (r5 == 0) goto L_0x02e1
            int r5 = r1.p
            if (r5 != r7) goto L_0x02e1
            r1.p = r6
            java.lang.String r2 = ""
        L_0x02e1:
            g.i.b.f.g.c$b r5 = r1.f4252g
            g.i.b.f.k.f.a r6 = r1.b
            int r6 = r6.c
            r5.c = r6
            int r6 = r1.p
            r5.f4261f = r6
            r5.f4262g = r2
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r3
            int r2 = (int) r6
            r5.f4263h = r2
            g.i.b.f.g.c$b r2 = r1.f4252g
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.f4253h
            long r3 = r3 - r5
            int r4 = (int) r3
            r2.f4264i = r4
            g.i.b.f.g.c$b r2 = r1.f4252g
            java.util.concurrent.atomic.AtomicInteger r3 = r1.s
            int r3 = r3.incrementAndGet()
            r2.a = r3
            g.i.b.f.k.f.a r2 = r1.b
            java.lang.String r3 = r2.a
            java.lang.String r2 = r2.a()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0325
            g.i.b.f.g.c$b r2 = r1.f4252g
            g.i.b.f.k.f.a r3 = r1.b
            java.lang.String r3 = r3.a()
            r2.f4268m = r3
        L_0x0325:
            goto L_0x0327
        L_0x0326:
            throw r0
        L_0x0327:
            goto L_0x0326
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.g.c.run():void");
    }
}
