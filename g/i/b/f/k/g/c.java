package g.i.b.f.k.g;

import g.i.b.f.f.a.d;
import g.i.b.f.f.a.e;
import g.i.b.f.g.c;
import g.i.b.f.h.d;
import g.i.b.f.k.e;
import g.i.b.f.k.f.a;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements g.i.b.f.f.a.c, g.i.b.f.f.c, c.a, Runnable {
    public List<g.i.b.f.g.c> A;
    public Map<g.i.b.f.k.f.a, g.i.b.f.g.c> B;
    public Map<g.i.b.f.k.f.a, List<String>> C;
    public g.i.b.f.g.a Q;
    public AtomicInteger R;
    public AtomicInteger S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public a b;
    public g.i.b.f.k.f.a c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4369d = false;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4370e = false;

    /* renamed from: f  reason: collision with root package name */
    public g.i.b.f.f.c f4371f;

    /* renamed from: g  reason: collision with root package name */
    public b f4372g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f4373h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f4374i = 0;

    /* renamed from: j  reason: collision with root package name */
    public String f4375j = "";

    /* renamed from: k  reason: collision with root package name */
    public boolean f4376k;

    /* renamed from: l  reason: collision with root package name */
    public g.i.b.f.k.f.b f4377l;

    /* renamed from: m  reason: collision with root package name */
    public e f4378m;
    public boolean n;
    public boolean o;
    public d p;
    public Object q;
    public e.c r;
    public String s;
    public boolean t;
    public boolean u;
    public volatile int v;
    public volatile int w;
    public long x;
    public volatile boolean y;
    public boolean z;

    public class a {
        public long a;
        public long b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4379d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4380e;

        /* renamed from: f  reason: collision with root package name */
        public int f4381f;

        public a(c cVar, byte b2) {
        }
    }

    public class b {
        public g.i.b.f.k.f.a a;
        public String b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4382d;

        /* renamed from: e  reason: collision with root package name */
        public String f4383e;

        /* renamed from: f  reason: collision with root package name */
        public String f4384f;

        /* renamed from: g  reason: collision with root package name */
        public String f4385g;

        public b(c cVar) {
        }
    }

    public c(g.i.b.f.k.f.b bVar, boolean z2, g.i.b.f.f.c cVar, b bVar2, Map<String, String> map, boolean z3) {
        boolean z4 = true;
        this.f4376k = true;
        this.f4378m = null;
        this.n = false;
        this.o = false;
        this.q = new Object();
        this.r = new e.c();
        this.t = true;
        this.u = false;
        this.y = true;
        this.z = false;
        this.T = g.h.a.a.b("down_hijack_feature_enable", 0, 1, 1) == 1;
        this.U = g.h.a.a.b("down_hijack_size_enable", 0, 1, 1) == 1;
        this.V = g.h.a.a.b("down_hijack_force_feature", 0, 1, 0) != 1 ? false : z4;
        this.W = g.h.a.a.b("hijack_failed_cnt_switch_https", 0, 20, 3);
        this.f4377l = bVar;
        this.f4376k = z2;
        this.r.a = z2;
        this.f4371f = cVar;
        this.f4372g = bVar2;
        this.f4373h = map;
        this.t = z3;
    }

    public static boolean h(int i2) {
        return i2 == -16 || i2 == -15 || i2 == -77;
    }

    public final void a(int i2) {
        this.w = i2;
        g.i.b.f.f.a.e eVar = this.f4378m;
        if (eVar != null) {
            eVar.G = i2;
            if (eVar.u != null) {
                g.i.b.f.h.d.a();
                InputStream inputStream = eVar.u;
                if (inputStream instanceof d.a) {
                    ((d.a) inputStream).c = i2;
                }
            }
        }
    }

    public final boolean a() {
        if (this.n) {
            return true;
        }
        g.i.b.f.f.c cVar = this.f4371f;
        if (cVar != null) {
            return cVar.a();
        }
        g.i.b.e.h.b.i("halley-downloader-SectionTransport", "cancelChecker is null");
        return true;
    }

    public final void b(g.i.b.f.f.a.a aVar) {
        List<String> list;
        if (aVar != null && (list = aVar.D) != null && list.size() > 0) {
            if (g.h.a.a.b("down_use_jump_schedule", 0, 1, 1) == 1) {
                for (String d2 : list) {
                    this.f4377l.d(g.i.b.e.b.e.f4111f, d2, a.C0161a.Type_CDN_Ip_Http_Header);
                }
            }
            this.f4377l.f(false);
        }
    }

    public final void c(g.i.b.f.k.f.a aVar) {
        List<String> list;
        g.i.b.f.k.f.a aVar2 = aVar;
        g.i.b.f.g.c cVar = this.B.get(aVar2);
        if (cVar != null && !cVar.f4250e) {
            g.i.b.f.k.e eVar = (g.i.b.f.k.e) this.Q;
            if (eVar.f4311g != null && (list = eVar.h0.get(aVar2)) != null && list.size() > 0) {
                long c2 = eVar.f4311g.c();
                char c3 = 1;
                boolean z2 = c2 > ((long) eVar.K());
                if (z2) {
                    eVar.D0 = c2;
                    eVar.I();
                    cVar.f4252g.f4266k = -1;
                }
                for (String split : list) {
                    String[] split2 = split.split(",");
                    if (split2.length == 2) {
                        long parseLong = Long.parseLong(split2[0]);
                        long parseLong2 = Long.parseLong(split2[c3]);
                        String str = parseLong + "-" + parseLong2;
                        long j2 = parseLong;
                        a aVar3 = r11;
                        a aVar4 = new a(eVar.f4311g, parseLong, j2, j2, parseLong2);
                        if (!z2) {
                            eVar.f4311g.b(aVar3);
                            cVar.f4252g.f4265j.add(str);
                        } else {
                            cVar.f4252g.f4267l.add(str);
                        }
                    }
                    c3 = 1;
                }
                eVar.h0.remove(aVar2);
            }
        }
    }

    public final void d(List<g.i.b.f.g.c> list, Map<g.i.b.f.k.f.a, g.i.b.f.g.c> map, Map<g.i.b.f.k.f.a, List<String>> map2, g.i.b.f.g.a aVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, long j2) {
        this.A = list;
        this.B = map;
        this.C = map2;
        this.Q = aVar;
        this.R = atomicInteger;
        this.S = atomicInteger2;
        this.x = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0495 A[Catch:{ all -> 0x0016, all -> 0x0591 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x028e A[Catch:{ all -> 0x0016, all -> 0x0591 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02b5 A[Catch:{ all -> 0x0016, all -> 0x0591 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(g.i.b.f.k.g.c.a r26) {
        /*
            r25 = this;
            r11 = r25
            r0 = r26
            java.lang.String r12 = ","
            java.lang.String r13 = "Direct:"
            java.lang.String r14 = "halley-downloader-SectionTransport"
            r9 = 0
            boolean r1 = r0.f4379d     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0019
            boolean r1 = g.i.b.e.b.e.a     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0019
            r0.f4379d = r9     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r0 = move-exception
            goto L_0x0564
        L_0x0019:
            boolean r1 = r0.f4379d     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0020
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0021
        L_0x0020:
            r1 = -1
        L_0x0021:
            g.i.b.f.k.g.a r2 = r11.b     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.b r3 = r11.f4372g     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.d r3 = (g.i.b.f.k.g.d) r3     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e r3 = r3.f4387e     // Catch:{ all -> 0x0016 }
            long r3 = r3.w     // Catch:{ all -> 0x0016 }
            r7 = -1
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            g.i.b.f.k.g.a$a r16 = r2.b(r1, r3)     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r6 = new g.i.b.f.f.a.e     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r2 = r11.c     // Catch:{ all -> 0x0016 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.f4373h     // Catch:{ all -> 0x0016 }
            boolean r5 = r0.f4379d     // Catch:{ all -> 0x0016 }
            boolean r4 = r2.f4332d     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.b r1 = r11.f4377l     // Catch:{ all -> 0x0016 }
            r17 = 1
            boolean r10 = r11.z     // Catch:{ all -> 0x0016 }
            r19 = r1
            r1 = r6
            r20 = r4
            r4 = r16
            r15 = r6
            r6 = r25
            r7 = r20
            r8 = r19
            r19 = r12
            r12 = 0
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0016 }
            r11.f4378m = r15     // Catch:{ all -> 0x0016 }
            int r1 = r11.w     // Catch:{ all -> 0x0016 }
            r15.G = r1     // Catch:{ all -> 0x0016 }
            java.io.InputStream r2 = r15.u     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0075
            g.i.b.f.h.d.a()     // Catch:{ all -> 0x0016 }
            java.io.InputStream r2 = r15.u     // Catch:{ all -> 0x0016 }
            boolean r3 = r2 instanceof g.i.b.f.h.d.a     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0075
            g.i.b.f.h.d$a r2 = (g.i.b.f.h.d.a) r2     // Catch:{ all -> 0x0016 }
            r2.c = r1     // Catch:{ all -> 0x0016 }
        L_0x0075:
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0016 }
            r11.p = r1     // Catch:{ all -> 0x0016 }
            boolean r1 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x00a1
            r11.f4369d = r12
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x009f:
            r15 = 1
            return r15
        L_0x00a1:
            r15 = 1
            g.i.b.f.k.e$c r1 = r11.r     // Catch:{ all -> 0x0016 }
            int r2 = r1.f4318d     // Catch:{ all -> 0x0016 }
            int r3 = r2 + 1
            r1.f4318d = r3     // Catch:{ all -> 0x0016 }
            r11.v = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e$c$a r10 = new g.i.b.f.k.e$c$a     // Catch:{ all -> 0x0016 }
            int r1 = r11.v     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r2 = r11.c     // Catch:{ all -> 0x0016 }
            r10.<init>(r1, r2)     // Catch:{ all -> 0x0016 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r3 = r0.a     // Catch:{ all -> 0x0016 }
            long r1 = r1 - r3
            r10.f4320d = r1     // Catch:{ all -> 0x0016 }
            boolean r1 = r0.f4379d     // Catch:{ all -> 0x0016 }
            r10.b = r1     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r1 = r11.b     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0016 }
            r10.c = r1     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r16.toString()     // Catch:{ all -> 0x0016 }
            r10.f4323g = r1     // Catch:{ all -> 0x0016 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            r1.b()     // Catch:{ all -> 0x0016 }
            boolean r1 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x00fd
            r11.f4369d = r12
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x00fc:
            return r15
        L_0x00fd:
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            int r2 = r1.f4238g     // Catch:{ all -> 0x0016 }
            r11.f4374i = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.f4239h     // Catch:{ all -> 0x0016 }
            r11.f4375j = r1     // Catch:{ all -> 0x0016 }
            long r3 = r0.a     // Catch:{ all -> 0x0016 }
            r10.f4322f = r2     // Catch:{ all -> 0x0016 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r1 = r1 - r3
            r10.f4321e = r1     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.q     // Catch:{ all -> 0x0016 }
            r10.f4324h = r2     // Catch:{ all -> 0x0016 }
            long r2 = r1.r     // Catch:{ all -> 0x0016 }
            r10.u = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.B     // Catch:{ all -> 0x0016 }
            r10.v = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.w     // Catch:{ all -> 0x0016 }
            r10.f4326j = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.x     // Catch:{ all -> 0x0016 }
            r10.f4327k = r2     // Catch:{ all -> 0x0016 }
            long r2 = r1.C     // Catch:{ all -> 0x0016 }
            r10.f4325i = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.v     // Catch:{ all -> 0x0016 }
            r10.f4328l = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.z     // Catch:{ all -> 0x0016 }
            r10.f4329m = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r1.A     // Catch:{ all -> 0x0016 }
            r10.n = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.j()     // Catch:{ all -> 0x0016 }
            r10.s = r1     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.i()     // Catch:{ all -> 0x0016 }
            r10.t = r1     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e$c r1 = r11.r     // Catch:{ all -> 0x0016 }
            java.util.List<g.i.b.f.k.e$c$a> r2 = r1.f4319e     // Catch:{ all -> 0x0016 }
            int r2 = r2.size()     // Catch:{ all -> 0x0016 }
            r9 = 20
            if (r2 >= r9) goto L_0x0157
            java.util.List<g.i.b.f.k.e$c$a> r1 = r1.f4319e     // Catch:{ all -> 0x0016 }
            r1.add(r10)     // Catch:{ all -> 0x0016 }
        L_0x0157:
            int r1 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r2 = -53
            if (r1 != r2) goto L_0x0259
            g.i.b.f.k.g.b r1 = r11.f4372g     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.d r1 = (g.i.b.f.k.g.d) r1     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e r1 = r1.f4387e     // Catch:{ all -> 0x0016 }
            long r1 = r1.w     // Catch:{ all -> 0x0016 }
            r7 = -1
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x016d
            r1 = 1
            goto L_0x016e
        L_0x016d:
            r1 = 0
        L_0x016e:
            if (r1 != 0) goto L_0x0259
            long r5 = r0.a     // Catch:{ all -> 0x0016 }
            boolean r4 = r0.f4379d     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r3 = new g.i.b.f.f.a.e     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r2 = r11.c     // Catch:{ all -> 0x0016 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.f4373h     // Catch:{ all -> 0x0016 }
            r18 = 0
            boolean r7 = r2.f4332d     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.b r8 = r11.f4377l     // Catch:{ all -> 0x0016 }
            r20 = 1
            boolean r15 = r11.z     // Catch:{ all -> 0x0016 }
            r21 = r1
            r1 = r3
            r12 = r3
            r3 = r21
            r21 = r4
            r4 = r18
            r22 = r5
            r5 = r21
            r6 = r25
            r9 = r20
            r24 = r10
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0016 }
            r11.f4378m = r12     // Catch:{ all -> 0x0016 }
            r11.p = r12     // Catch:{ all -> 0x0016 }
            boolean r1 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x01a7
            goto L_0x01dd
        L_0x01a7:
            g.i.b.f.k.e$c r1 = r11.r     // Catch:{ all -> 0x0016 }
            int r2 = r1.f4318d     // Catch:{ all -> 0x0016 }
            int r3 = r2 + 1
            r1.f4318d = r3     // Catch:{ all -> 0x0016 }
            r11.v = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e$c$a r1 = new g.i.b.f.k.e$c$a     // Catch:{ all -> 0x0016 }
            int r2 = r11.v     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r3 = r11.c     // Catch:{ all -> 0x0016 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0016 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r2 = r2 - r22
            r1.f4320d = r2     // Catch:{ all -> 0x0016 }
            r2 = r21
            r1.b = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r2 = r11.b     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.c = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = ""
            r1.f4323g = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r2 = r11.f4378m     // Catch:{ all -> 0x0016 }
            r2.b()     // Catch:{ all -> 0x0016 }
            boolean r2 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x01df
        L_0x01dd:
            r10 = 1
            goto L_0x0237
        L_0x01df:
            g.i.b.f.f.a.e r2 = r11.f4378m     // Catch:{ all -> 0x0016 }
            int r3 = r2.f4238g     // Catch:{ all -> 0x0016 }
            r11.f4374i = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.f4239h     // Catch:{ all -> 0x0016 }
            r11.f4375j = r2     // Catch:{ all -> 0x0016 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r2 = r2 - r22
            r1.f4321e = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r2 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.q     // Catch:{ all -> 0x0016 }
            r1.f4324h = r3     // Catch:{ all -> 0x0016 }
            long r3 = r2.r     // Catch:{ all -> 0x0016 }
            r1.u = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.B     // Catch:{ all -> 0x0016 }
            r1.v = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.w     // Catch:{ all -> 0x0016 }
            r1.f4326j = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.x     // Catch:{ all -> 0x0016 }
            r1.f4327k = r3     // Catch:{ all -> 0x0016 }
            long r3 = r2.C     // Catch:{ all -> 0x0016 }
            r1.f4325i = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.v     // Catch:{ all -> 0x0016 }
            r1.f4328l = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.z     // Catch:{ all -> 0x0016 }
            r1.f4329m = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r2.A     // Catch:{ all -> 0x0016 }
            r1.n = r3     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.j()     // Catch:{ all -> 0x0016 }
            r1.s = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r2 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.i()     // Catch:{ all -> 0x0016 }
            r1.t = r2     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.e$c r2 = r11.r     // Catch:{ all -> 0x0016 }
            java.util.List<g.i.b.f.k.e$c$a> r3 = r2.f4319e     // Catch:{ all -> 0x0016 }
            int r3 = r3.size()     // Catch:{ all -> 0x0016 }
            r4 = 20
            if (r3 >= r4) goto L_0x0236
            java.util.List<g.i.b.f.k.e$c$a> r2 = r2.f4319e     // Catch:{ all -> 0x0016 }
            r2.add(r1)     // Catch:{ all -> 0x0016 }
        L_0x0236:
            r10 = 0
        L_0x0237:
            if (r10 == 0) goto L_0x025b
            r1 = 0
            r11.f4369d = r1
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x0257
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x0257:
            r1 = 1
            return r1
        L_0x0259:
            r24 = r10
        L_0x025b:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r1 = r1 - r16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r3.<init>(r13)     // Catch:{ all -> 0x0016 }
            boolean r4 = r11.f4376k     // Catch:{ all -> 0x0016 }
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = " send req retCode:"
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            int r4 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = ",msg:"
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = r11.f4375j     // Catch:{ all -> 0x0016 }
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0016 }
            g.i.b.e.h.b.f(r14, r3)     // Catch:{ all -> 0x0016 }
            int r3 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r4 = 10000(0x2710, double:4.9407E-320)
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x02b5
            r7 = -59
            if (r3 != r7) goto L_0x0299
            r7 = 1
            r0.f4379d = r7     // Catch:{ all -> 0x0016 }
            r8 = 0
            r0.c = r8     // Catch:{ all -> 0x0016 }
            goto L_0x029c
        L_0x0299:
            r7 = 1
            r0.c = r7     // Catch:{ all -> 0x0016 }
        L_0x029c:
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a5
            r1 = 0
            r0.f4381f = r1     // Catch:{ all -> 0x0016 }
            goto L_0x0491
        L_0x02a5:
            boolean r1 = h(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x02b1
            r1 = 3000(0xbb8, float:4.204E-42)
            r0.f4381f = r1     // Catch:{ all -> 0x0016 }
            goto L_0x0491
        L_0x02b1:
            r0.f4381f = r6     // Catch:{ all -> 0x0016 }
            goto L_0x0491
        L_0x02b5:
            r0.f4381f = r6     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.b r1 = r11.f4377l     // Catch:{ all -> 0x0016 }
            r2 = 0
            boolean r1 = r1.e(r2)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x02c5
            g.i.b.f.f.a.e r1 = r11.f4378m     // Catch:{ all -> 0x0016 }
            r11.b(r1)     // Catch:{ all -> 0x0016 }
        L_0x02c5:
            boolean r1 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x02cd
            goto L_0x0450
        L_0x02cd:
            g.i.b.f.k.g.b r1 = r11.f4372g     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.c$b r2 = new g.i.b.f.k.g.c$b     // Catch:{ all -> 0x0016 }
            r2.<init>(r11)     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r3 = r11.c     // Catch:{ all -> 0x0016 }
            r2.a = r3     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r3 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r3.h()     // Catch:{ all -> 0x0016 }
            r2.b = r3     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r3 = r11.f4378m     // Catch:{ all -> 0x0016 }
            long r6 = r3.C     // Catch:{ all -> 0x0016 }
            r2.c = r6     // Catch:{ all -> 0x0016 }
            boolean r3 = r3.k()     // Catch:{ all -> 0x0016 }
            r2.f4382d = r3     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r3 = r11.f4378m     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = r3.z     // Catch:{ all -> 0x0016 }
            r2.f4383e = r6     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = r3.A     // Catch:{ all -> 0x0016 }
            r2.f4384f = r6     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r3.y     // Catch:{ all -> 0x0016 }
            r2.f4385g = r3     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.d r1 = (g.i.b.f.k.g.d) r1     // Catch:{ all -> 0x0016 }
            g.i.b.e.h.d r1 = r1.a(r11, r2)     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>(r13)     // Catch:{ all -> 0x0016 }
            boolean r3 = r11.f4376k     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = " onValidResponse:"
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            int r3 = r1.a     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            r3 = r19
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = r1.b     // Catch:{ all -> 0x0016 }
            r2.append(r6)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            g.i.b.e.h.b.f(r14, r2)     // Catch:{ all -> 0x0016 }
            boolean r2 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x032d
            goto L_0x0450
        L_0x032d:
            int r2 = r1.a     // Catch:{ all -> 0x0016 }
            r6 = r24
            r6.o = r2     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x045f
            r1 = 0
            r0.b = r1     // Catch:{ all -> 0x0016 }
            r7 = 0
            r0.f4381f = r7     // Catch:{ all -> 0x0016 }
            r0.f4380e = r7     // Catch:{ all -> 0x0016 }
            boolean r7 = r25.a()     // Catch:{ all -> 0x0016 }
            if (r7 == 0) goto L_0x0346
            goto L_0x0450
        L_0x0346:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r7.<init>(r13)     // Catch:{ all -> 0x0016 }
            boolean r8 = r11.f4376k     // Catch:{ all -> 0x0016 }
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r8 = " start readData for section:"
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r8 = r11.b     // Catch:{ all -> 0x0016 }
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0016 }
            g.i.b.e.h.b.f(r14, r7)     // Catch:{ all -> 0x0016 }
            r7 = 1
            r11.f4369d = r7     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r7 = r11.f4378m     // Catch:{ all -> 0x0016 }
            r7.a(r11)     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r7 = r11.c     // Catch:{ all -> 0x0016 }
            r8 = 0
            r11.f4369d = r8     // Catch:{ all -> 0x0016 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r7 = r11.f4378m     // Catch:{ all -> 0x0016 }
            int r8 = r7.f4238g     // Catch:{ all -> 0x0016 }
            r11.f4374i = r8     // Catch:{ all -> 0x0016 }
            java.lang.String r7 = r7.f4239h     // Catch:{ all -> 0x0016 }
            r11.f4375j = r7     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r7.<init>(r13)     // Catch:{ all -> 0x0016 }
            boolean r8 = r11.f4376k     // Catch:{ all -> 0x0016 }
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r8 = " readData retCode:"
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            int r8 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r8 = ",failInfo:"
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r8 = r11.f4375j     // Catch:{ all -> 0x0016 }
            r7.append(r8)     // Catch:{ all -> 0x0016 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0016 }
            g.i.b.e.h.b.f(r14, r7)     // Catch:{ all -> 0x0016 }
            int r7 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r6.p = r7     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r7 = r11.b     // Catch:{ all -> 0x0016 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0016 }
            r6.q = r7     // Catch:{ all -> 0x0016 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r9 = r0.a     // Catch:{ all -> 0x0016 }
            long r7 = r7 - r9
            r6.r = r7     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r7 = r11.f4378m     // Catch:{ all -> 0x0016 }
            long r7 = r7.H     // Catch:{ all -> 0x0016 }
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x03c9
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            g.i.b.f.f.a.e r7 = r11.f4378m     // Catch:{ all -> 0x0016 }
            long r7 = r7.H     // Catch:{ all -> 0x0016 }
            long r1 = r1 - r7
            r6.w = r1     // Catch:{ all -> 0x0016 }
            goto L_0x03cd
        L_0x03c9:
            r1 = -1
            r6.w = r1     // Catch:{ all -> 0x0016 }
        L_0x03cd:
            boolean r1 = r11.f4370e     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0416
            java.util.Map<g.i.b.f.k.f.a, java.util.List<java.lang.String>> r1 = r11.C     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r2 = r11.c     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0016 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x03ed
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            java.util.List r1 = java.util.Collections.synchronizedList(r1)     // Catch:{ all -> 0x0016 }
            java.util.Map<g.i.b.f.k.f.a, java.util.List<java.lang.String>> r2 = r11.C     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a r6 = r11.c     // Catch:{ all -> 0x0016 }
            r2.put(r6, r1)     // Catch:{ all -> 0x0016 }
        L_0x03ed:
            g.i.b.f.k.g.a r2 = r11.b     // Catch:{ all -> 0x0016 }
            long r6 = r2.f4365f     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r2 = r11.b     // Catch:{ all -> 0x0016 }
            long r8 = r2.f4363d     // Catch:{ all -> 0x0016 }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0416
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r6 = r11.b     // Catch:{ all -> 0x0016 }
            long r6 = r6.f4363d     // Catch:{ all -> 0x0016 }
            r2.append(r6)     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.g.a r3 = r11.b     // Catch:{ all -> 0x0016 }
            long r6 = r3.f4365f     // Catch:{ all -> 0x0016 }
            r2.append(r6)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.add(r2)     // Catch:{ all -> 0x0016 }
        L_0x0416:
            boolean r1 = r11.V     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0453
            java.util.concurrent.atomic.AtomicInteger r1 = r11.R     // Catch:{ all -> 0x0016 }
            int r1 = r1.get()     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.b r2 = r11.f4377l     // Catch:{ all -> 0x0016 }
            java.util.Map<java.lang.String, g.i.b.f.k.f.b$a> r3 = r2.c     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = g.i.b.e.b.e.f4111f     // Catch:{ all -> 0x0016 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.b$a r3 = (g.i.b.f.k.f.b.a) r3     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0439
            java.util.List r3 = r3.a()     // Catch:{ all -> 0x0016 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0016 }
            int r10 = r3.size()     // Catch:{ all -> 0x0016 }
            goto L_0x043a
        L_0x0439:
            r10 = 1
        L_0x043a:
            g.i.b.f.k.f.a r2 = r2.b     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.f4333e     // Catch:{ all -> 0x0016 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0446
            int r10 = r10 + -1
        L_0x0446:
            if (r10 <= 0) goto L_0x0449
            goto L_0x044a
        L_0x0449:
            r10 = 1
        L_0x044a:
            if (r1 < r10) goto L_0x0453
            r1 = -75
            r11.f4374i = r1     // Catch:{ all -> 0x0016 }
        L_0x0450:
            r1 = 0
            r10 = 1
            goto L_0x0470
        L_0x0453:
            int r1 = r11.f4374i     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x045b
            r1 = 1
            r0.c = r1     // Catch:{ all -> 0x0016 }
            goto L_0x046a
        L_0x045b:
            r1 = 0
            r0.c = r1     // Catch:{ all -> 0x0016 }
            goto L_0x046a
        L_0x045f:
            if (r2 >= 0) goto L_0x046c
            r11.f4374i = r2     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x0016 }
            r11.f4375j = r1     // Catch:{ all -> 0x0016 }
            r1 = 1
            r0.c = r1     // Catch:{ all -> 0x0016 }
        L_0x046a:
            r1 = 0
            goto L_0x046f
        L_0x046c:
            r1 = 0
            r0.c = r1     // Catch:{ all -> 0x0016 }
        L_0x046f:
            r10 = 0
        L_0x0470:
            if (r10 == 0) goto L_0x0491
            r11.f4369d = r1
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x048f
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x048f:
            r1 = 1
            return r1
        L_0x0491:
            boolean r1 = r0.f4380e     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0521
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0016 }
            long r6 = r0.b     // Catch:{ all -> 0x0016 }
            long r6 = r1 - r6
            r8 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x04a6
            goto L_0x051f
        L_0x04a6:
            int r3 = r11.f4374i     // Catch:{ all -> 0x0016 }
            boolean r3 = h(r3)     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x04ba
            long r6 = r0.b     // Catch:{ all -> 0x0016 }
            long r6 = r1 - r6
            r8 = 20000(0x4e20, double:9.8813E-320)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x04ba
            goto L_0x051f
        L_0x04ba:
            int r3 = r11.f4374i     // Catch:{ all -> 0x0016 }
            r6 = -76
            r7 = -51
            if (r3 == r6) goto L_0x04f5
            r6 = -73
            if (r3 == r6) goto L_0x04f5
            r6 = -71
            if (r3 == r6) goto L_0x04f5
            r6 = -68
            if (r3 == r6) goto L_0x04f5
            if (r3 == r7) goto L_0x04f5
            r6 = -44
            if (r3 == r6) goto L_0x04f5
            r6 = -43
            if (r3 == r6) goto L_0x04f5
            r6 = -11
            if (r3 == r6) goto L_0x04f5
            r6 = -10
            if (r3 == r6) goto L_0x04f5
            switch(r3) {
                case -56: goto L_0x04f5;
                case -55: goto L_0x04f5;
                case -54: goto L_0x04f5;
                default: goto L_0x04e3;
            }     // Catch:{ all -> 0x0016 }
        L_0x04e3:
            if (r3 <= 0) goto L_0x04ef
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 == r6) goto L_0x04ef
            r6 = 206(0xce, float:2.89E-43)
            if (r3 == r6) goto L_0x04ef
            r10 = 1
            goto L_0x04f0
        L_0x04ef:
            r10 = 0
        L_0x04f0:
            if (r10 == 0) goto L_0x04f3
            goto L_0x04f5
        L_0x04f3:
            r10 = 0
            goto L_0x04f6
        L_0x04f5:
            r10 = 1
        L_0x04f6:
            if (r10 == 0) goto L_0x0501
            long r8 = r0.b     // Catch:{ all -> 0x0016 }
            long r8 = r1 - r8
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0501
            goto L_0x051f
        L_0x0501:
            r4 = -15
            if (r3 != r4) goto L_0x0510
            long r4 = r0.b     // Catch:{ all -> 0x0016 }
            long r1 = r1 - r4
            r0 = 6000(0x1770, float:8.408E-42)
            long r4 = (long) r0     // Catch:{ all -> 0x0016 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0510
            goto L_0x051f
        L_0x0510:
            if (r3 != r7) goto L_0x0521
            g.i.b.f.k.f.a r0 = r11.c     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a$a r0 = r0.b     // Catch:{ all -> 0x0016 }
            g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_CDN_Domain     // Catch:{ all -> 0x0016 }
            if (r0 != r1) goto L_0x0521
            r0 = 1000(0x3e8, double:4.94E-321)
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x0016 }
        L_0x051f:
            r10 = 1
            goto L_0x0522
        L_0x0521:
            r10 = 0
        L_0x0522:
            if (r10 == 0) goto L_0x0544
            r1 = 0
            r11.f4369d = r1
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x0542
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x0542:
            r1 = 1
            return r1
        L_0x0544:
            r1 = 0
            r2 = 0
            r11.f4369d = r2
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x0562
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x0562:
            r1 = 0
            return r1
        L_0x0564:
            r0.printStackTrace()     // Catch:{ all -> 0x0591 }
            r1 = -61
            r11.f4374i = r1     // Catch:{ all -> 0x0591 }
            java.lang.String r0 = g.h.a.a.f(r0)     // Catch:{ all -> 0x0591 }
            r11.f4375j = r0     // Catch:{ all -> 0x0591 }
            r1 = 0
            r11.f4369d = r1
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            r0.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r0 = r11.f4378m
            if (r0 == 0) goto L_0x058f
            java.lang.String r0 = r0.g()
            r11.s = r0
            g.i.b.f.f.a.e r0 = r11.f4378m
            r0.f()
            r11.f4378m = r1
        L_0x058f:
            r1 = 1
            return r1
        L_0x0591:
            r0 = move-exception
            r1 = 0
            r11.f4369d = r1
            g.i.b.f.k.g.b r1 = r11.f4372g
            g.i.b.f.k.g.d r1 = (g.i.b.f.k.g.d) r1
            r1.e(r11)
            r1 = 0
            r11.p = r1
            g.i.b.f.f.a.e r2 = r11.f4378m
            if (r2 == 0) goto L_0x05b0
            java.lang.String r2 = r2.g()
            r11.s = r2
            g.i.b.f.f.a.e r2 = r11.f4378m
            r2.f()
            r11.f4378m = r1
        L_0x05b0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.g.c.e(g.i.b.f.k.g.c$a):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        r2 = r11.f4377l.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0216, code lost:
        if (r0 == false) goto L_0x0304;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(byte[] r25, int r26, boolean r27) {
        /*
            r24 = this;
            r11 = r24
            r0 = r26
            if (r27 == 0) goto L_0x002d
            java.lang.String r1 = "TAG"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "is direct:"
            r2.<init>(r3)
            boolean r3 = r11.f4376k
            r2.append(r3)
            java.lang.String r3 = ",onReceiveData...len:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ",section:"
            r2.append(r3)
            g.i.b.f.k.g.a r3 = r11.b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            g.i.b.e.h.b.c(r1, r2)
        L_0x002d:
            g.i.b.f.k.f.a r1 = r11.c
            g.i.b.f.k.f.b r2 = r11.f4377l
            long r2 = r2.f4347g
            r4 = 0
            r12 = 0
            r13 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x003c
            goto L_0x0071
        L_0x003c:
            g.i.b.f.k.f.b r2 = r11.f4377l
            java.util.List r2 = r2.c()
            if (r2 == 0) goto L_0x0071
            int r2 = r2.size()
            if (r2 > 0) goto L_0x004b
            goto L_0x0071
        L_0x004b:
            g.i.b.f.k.f.b r2 = r11.f4377l
            java.lang.String r2 = r2.f4351k
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0056
            goto L_0x0071
        L_0x0056:
            if (r1 != 0) goto L_0x0059
            goto L_0x0071
        L_0x0059:
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r2 = r11.B
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x0062
            goto L_0x0071
        L_0x0062:
            boolean r1 = r11.y
            if (r1 == 0) goto L_0x0071
            boolean r1 = r11.t
            if (r1 == 0) goto L_0x0071
            boolean r1 = r11.T
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 == 0) goto L_0x00ce
            g.i.b.f.g.c r14 = new g.i.b.f.g.c
            g.i.b.f.f.c r1 = r11.f4371f
            r2 = r1
            g.i.b.f.k.e r2 = (g.i.b.f.k.e) r2
            g.i.b.f.k.f.b r3 = r11.f4377l
            g.i.b.f.k.f.a r4 = r11.c
            java.util.List<g.i.b.f.g.c> r5 = r11.A
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r6 = r11.B
            boolean r8 = r11.V
            java.util.concurrent.atomic.AtomicInteger r9 = r11.S
            java.util.concurrent.atomic.AtomicInteger r10 = r11.R
            r1 = r14
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.List<g.i.b.f.g.c> r1 = r11.A
            monitor-enter(r1)
            java.util.List<g.i.b.f.g.c> r2 = r11.A     // Catch:{ all -> 0x00cb }
            r2.add(r14)     // Catch:{ all -> 0x00cb }
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r1 = r11.B
            g.i.b.f.k.f.a r2 = r11.c
            r1.put(r2, r14)
            long r1 = r11.x
            r14.f4253h = r1
            g.i.b.f.j.a r1 = g.i.b.f.j.a.b()
            g.i.b.e.b.a.d r2 = r1.f4275e
            if (r2 != 0) goto L_0x00ae
            r1.d()
        L_0x00ae:
            g.i.b.e.b.a.d r1 = r1.f4275e
            java.util.concurrent.Future r1 = r1.submit(r14)
            g.i.b.f.j.a$a r2 = new g.i.b.f.j.a$a
            r2.<init>(r1)
            r14.f4251f = r2
            boolean r1 = r11.f4376k
            r1 = r1 ^ r13
            int r2 = r11.v
            r14.t = r1
            r14.u = r2
            g.i.b.f.g.c$b r3 = r14.f4252g
            r3.b = r1
            r3.f4259d = r2
            goto L_0x00ce
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            throw r0
        L_0x00ce:
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r1 = r11.B
            g.i.b.f.k.f.a r2 = r11.c
            java.lang.Object r1 = r1.get(r2)
            g.i.b.f.g.c r1 = (g.i.b.f.g.c) r1
            r2 = -1
            if (r1 == 0) goto L_0x014c
            boolean r3 = r1.f4249d
            if (r3 == 0) goto L_0x014c
            boolean r3 = r1.f4250e
            if (r3 != 0) goto L_0x014c
            g.i.b.f.g.a r3 = r11.Q
            g.i.b.f.k.g.a r4 = r11.b
            g.i.b.f.k.e r3 = (g.i.b.f.k.e) r3
            g.i.b.f.k.a r5 = r3.f4311g
            if (r5 != 0) goto L_0x00ee
            goto L_0x0145
        L_0x00ee:
            long r5 = r5.c()
            int r7 = r3.K()
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00fd
            r7 = 1
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            long r8 = r4.f4363d
            long r14 = r4.f4365f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r10 = "-"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            if (r7 != 0) goto L_0x0137
            g.i.b.f.k.g.a r5 = new g.i.b.f.k.g.a
            g.i.b.f.k.a r6 = r3.f4311g
            r22 = r14
            r14 = r5
            r15 = r6
            r16 = r8
            r18 = r8
            r20 = r8
            r14.<init>(r15, r16, r18, r20, r22)
            g.i.b.f.k.a r3 = r3.f4311g
            r3.b(r5)
            g.i.b.f.g.c$b r1 = r1.f4252g
            java.util.List<java.lang.String> r1 = r1.f4265j
            r1.add(r4)
            r1 = 1
            goto L_0x0146
        L_0x0137:
            r3.D0 = r5
            r3.I()
            g.i.b.f.g.c$b r1 = r1.f4252g
            r1.f4266k = r2
            java.util.List<java.lang.String> r1 = r1.f4267l
            r1.add(r4)
        L_0x0145:
            r1 = 0
        L_0x0146:
            if (r1 == 0) goto L_0x014c
            r11.f4370e = r13
            r1 = 1
            goto L_0x014d
        L_0x014c:
            r1 = 0
        L_0x014d:
            if (r1 == 0) goto L_0x0150
            return r12
        L_0x0150:
            g.i.b.f.k.g.b r1 = r11.f4372g
            if (r1 != 0) goto L_0x015c
            java.lang.String r0 = "halley-downloader-SectionTransport"
            java.lang.String r1 = "listener in Ant is null."
            g.i.b.e.h.b.i(r0, r1)
            return r13
        L_0x015c:
            g.i.b.f.k.g.a r1 = r11.b
            long r3 = r1.f4365f
            long r5 = (long) r0
            long r3 = r3 + r5
            g.i.b.f.k.g.a r1 = r11.b
            long r5 = r1.f4366g
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0176
            g.i.b.f.k.g.a r0 = r11.b
            long r0 = r0.f4366g
            g.i.b.f.k.g.a r3 = r11.b
            long r3 = r3.f4365f
            long r0 = r0 - r3
            int r1 = (int) r0
            r3 = 0
            goto L_0x0178
        L_0x0176:
            r1 = r0
            r3 = 1
        L_0x0178:
            g.i.b.f.k.g.b r0 = r11.f4372g
            g.i.b.f.k.g.a r4 = r11.b
            long r4 = r4.f4365f
            r6 = r0
            g.i.b.f.k.g.d r6 = (g.i.b.f.k.g.d) r6
            boolean r0 = r6.g(r11)
            if (r0 != 0) goto L_0x0189
            goto L_0x0304
        L_0x0189:
            if (r1 <= 0) goto L_0x019a
            g.i.b.f.k.e r0 = r6.f4387e
            java.util.concurrent.atomic.AtomicLong r0 = r0.c
            long r7 = (long) r1
            r0.addAndGet(r7)
            g.i.b.f.k.e r0 = r6.f4387e
            java.util.concurrent.atomic.AtomicLong r0 = r0.f4308d
            r0.addAndGet(r7)
        L_0x019a:
            g.i.b.f.k.e r0 = r6.f4387e
            g.i.b.f.k.a r0 = r0.f4311g
            if (r0 == 0) goto L_0x0304
            g.i.b.f.k.g.a r7 = r11.b
            g.i.b.f.k.a r7 = r7.f4368i
            if (r7 != r0) goto L_0x01a8
            r0 = 1
            goto L_0x01a9
        L_0x01a8:
            r0 = 0
        L_0x01a9:
            if (r0 != 0) goto L_0x01ad
            goto L_0x0304
        L_0x01ad:
            if (r27 == 0) goto L_0x021a
            java.lang.String r0 = "SectionTransportControlCenter"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "is Direct:"
            r7.<init>(r8)
            boolean r8 = r11.f4376k
            r7.append(r8)
            java.lang.String r8 = " received first data from section:"
            r7.append(r8)
            g.i.b.f.k.g.a r8 = r11.b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            g.i.b.e.h.b.f(r0, r7)
            g.i.b.f.k.g.a r0 = r11.b
            int r7 = r0.b
            if (r7 != r2) goto L_0x021a
            g.i.b.f.k.e r2 = r6.f4387e
            g.i.b.f.k.a r2 = r2.f4311g
            boolean r0 = r2.a(r0)
            java.lang.String r2 = "SectionTransportControlCenter"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "is Direct:"
            r7.<init>(r8)
            boolean r8 = r11.f4376k
            r7.append(r8)
            java.lang.String r8 = ",addRealSection:"
            r7.append(r8)
            g.i.b.f.k.g.a r8 = r11.b
            r7.append(r8)
            java.lang.String r8 = ",added:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ",all sections:"
            r7.append(r8)
            g.i.b.f.k.e r8 = r6.f4387e
            g.i.b.f.k.a r8 = r8.f4311g
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            g.i.b.e.h.b.h(r2, r7)
            g.i.b.f.h.b r2 = g.i.b.f.h.b.a()
            java.util.Objects.requireNonNull(r2)
            if (r0 != 0) goto L_0x021a
            goto L_0x0304
        L_0x021a:
            if (r1 <= 0) goto L_0x0302
            g.i.b.f.k.e r0 = r6.f4387e
            g.i.b.f.k.d r0 = r0.f4313i
            g.i.b.f.e r0 = r0.a
            g.i.b.f.e r2 = g.i.b.f.e.PAUSED
            if (r0 != r2) goto L_0x0228
            r0 = 1
            goto L_0x0229
        L_0x0228:
            r0 = 0
        L_0x0229:
            if (r0 != 0) goto L_0x0302
            g.i.b.f.k.e r0 = r6.f4387e     // Catch:{ OutOfMemoryError -> 0x02d6 }
            g.i.b.f.k.d$c r0 = r0.f4312h     // Catch:{ OutOfMemoryError -> 0x02d6 }
            g.i.b.f.k.g.a r2 = r11.b     // Catch:{ OutOfMemoryError -> 0x02d6 }
            int r15 = r2.b     // Catch:{ OutOfMemoryError -> 0x02d6 }
            long r7 = (long) r1     // Catch:{ OutOfMemoryError -> 0x02d6 }
            java.lang.Object r2 = r0.c     // Catch:{ OutOfMemoryError -> 0x02d6 }
            monitor-enter(r2)     // Catch:{ OutOfMemoryError -> 0x02d6 }
            java.util.LinkedList<g.i.b.f.k.d$c$a> r9 = r0.b     // Catch:{ all -> 0x02d3 }
            int r10 = (int) r7     // Catch:{ all -> 0x02d3 }
            byte[] r14 = new byte[r10]     // Catch:{ all -> 0x02d3 }
            r13 = r25
            java.lang.System.arraycopy(r13, r12, r14, r12, r10)     // Catch:{ all -> 0x02d3 }
            g.i.b.f.k.d$c$a r10 = new g.i.b.f.k.d$c$a     // Catch:{ all -> 0x02d3 }
            r13 = r14
            r14 = r10
            r16 = r4
            r18 = r13
            r19 = r7
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x02d3 }
            r9.addLast(r10)     // Catch:{ all -> 0x02d3 }
            long r4 = r0.a     // Catch:{ all -> 0x02d3 }
            long r4 = r4 + r7
            r0.a = r4     // Catch:{ all -> 0x02d3 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d3 }
            g.i.b.f.k.g.a r0 = r11.b
            long r4 = r0.f4365f
            long r4 = r4 + r7
            r0.f4365f = r4
            g.i.b.f.k.e r0 = r6.f4387e
            g.i.b.f.k.a r0 = r0.f4311g
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0279
            g.i.b.f.k.e r0 = r6.f4387e
            g.i.b.f.k.b r0 = r0.f4314j
            long r4 = java.lang.System.currentTimeMillis()
            r0.c = r4
            g.i.b.f.h.e r0 = g.i.b.f.h.e.b()
            r0.g()
        L_0x0279:
            g.i.b.f.h.e r0 = g.i.b.f.h.e.b()
            long r4 = r0.j()
            r7 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0289
            r12 = 1
        L_0x0289:
            if (r12 == 0) goto L_0x0302
            g.i.b.f.k.e r0 = r6.f4387e
            r2 = 1
            r0.Y = r2
            g.i.b.f.h.e r0 = g.i.b.f.h.e.b()
            r0.g()
            java.lang.String r0 = "SectionTransportControlCenter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "onRangeReceiveData... _dataBuffer too large, task:"
            r2.<init>(r4)
            g.i.b.f.k.e r4 = r6.f4387e
            java.lang.String r4 = r4.v
            r2.append(r4)
            java.lang.String r4 = ", try wait..."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            g.i.b.e.h.b.h(r0, r2)
            g.i.b.f.k.e r0 = r6.f4387e     // Catch:{ Exception -> 0x02cd }
            r4 = 1
            r0.Z = r4     // Catch:{ Exception -> 0x02cb }
            g.i.b.f.k.e r0 = r6.f4387e     // Catch:{ Exception -> 0x02cb }
            java.lang.Object r2 = r0.f4315k     // Catch:{ Exception -> 0x02cb }
            monitor-enter(r2)     // Catch:{ Exception -> 0x02cb }
            g.i.b.f.k.e r0 = r6.f4387e     // Catch:{ all -> 0x02c8 }
            java.lang.Object r0 = r0.f4315k     // Catch:{ all -> 0x02c8 }
            r5 = 2000(0x7d0, double:9.88E-321)
            r0.wait(r5)     // Catch:{ all -> 0x02c8 }
            monitor-exit(r2)     // Catch:{ all -> 0x02c8 }
            goto L_0x0303
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02c8 }
            throw r0     // Catch:{ Exception -> 0x02cb }
        L_0x02cb:
            r0 = move-exception
            goto L_0x02cf
        L_0x02cd:
            r0 = move-exception
            r4 = 1
        L_0x02cf:
            r0.printStackTrace()
            goto L_0x0303
        L_0x02d3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d3 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x02d6 }
        L_0x02d6:
            r0 = move-exception
            r0.printStackTrace()
            g.i.b.f.k.e r0 = r6.f4387e
            r2 = -19
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "append size:"
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = ",buffer size:"
            r4.append(r5)
            g.i.b.f.h.e r5 = g.i.b.f.h.e.b()
            long r5 = r5.j()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            g.i.b.f.e r5 = g.i.b.f.e.FAILED
            r0.N(r12, r2, r4, r5)
            goto L_0x0304
        L_0x0302:
            r4 = 1
        L_0x0303:
            r12 = 1
        L_0x0304:
            r0 = r3 & r12
            if (r0 != 0) goto L_0x032f
            java.lang.String r2 = "TAG"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "is direct:"
            r3.<init>(r4)
            boolean r4 = r11.f4376k
            r3.append(r4)
            java.lang.String r4 = ",stop read data...len:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ",section:"
            r3.append(r1)
            g.i.b.f.k.g.a r1 = r11.b
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            g.i.b.e.h.b.c(r2, r1)
        L_0x032f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.g.c.f(byte[], int, boolean):boolean");
    }

    public final void g() {
        try {
            this.n = true;
            g.i.b.f.f.a.d dVar = this.p;
            if (dVar != null) {
                ((g.i.b.f.f.a.a) dVar).E = true;
            }
            synchronized (this.q) {
                this.q.notifyAll();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final String i() {
        e.c cVar = this.r;
        if (cVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (e.c.a append : cVar.f4319e) {
            sb.append(append);
            sb.append(";");
        }
        return sb.toString();
    }

    public final String j() {
        e.c cVar = this.r;
        return cVar != null ? cVar.toString() : "";
    }

    public final void k() {
        this.z = true;
        StringBuilder sb = new StringBuilder("setThisThreadOpenDual, isMultiTheadDownOpen=");
        Objects.requireNonNull(g.i.b.f.h.b.a());
        sb.append(false);
        sb.append("; isOptDownload=");
        sb.append(false);
        sb.append("; isDirectDownload=");
        sb.append(this.f4376k);
        g.i.b.e.h.b.f("DualNetworkManager", sb.toString());
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4376k ^ true ? 1 : 0);
        sb.append(sb2.toString());
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(this.s);
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f4374i);
        sb.append(sb3.toString());
        sb.append(",");
        sb.append(",");
        return g.a.a.a.a.f(sb, ",", ";");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0213, code lost:
        g.i.b.e.h.b.h("halley-downloader-SectionTransport", "Transport finish on retCode:" + r1.f4374i + ",msg:" + r1.f4375j);
        r1.o = true;
        r1.r.c = java.lang.System.currentTimeMillis() - r1.r.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        ((g.i.b.f.k.g.d) r1.f4372g).f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0249, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x024a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x024d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            g.i.b.f.k.f.a$a r2 = g.i.b.f.k.f.a.C0161a.Type_Outer
            g.i.b.f.k.e$c r0 = r1.r
            long r3 = java.lang.System.currentTimeMillis()
            r0.b = r3
            g.i.b.f.k.g.c$a r3 = new g.i.b.f.k.g.c$a
            r4 = 0
            r3.<init>(r1, r4)
            r5 = 1
            r3.c = r5
            r3.f4380e = r5
            r3.f4379d = r4
            r6 = 0
            r3.b = r6
            long r8 = android.os.SystemClock.elapsedRealtime()
            r3.a = r8
            r3.f4381f = r4
            r0 = 0
        L_0x0026:
            g.i.b.f.k.f.b r8 = r1.f4377l
            boolean r8 = r8.f4344d
            if (r8 == 0) goto L_0x0030
            if (r0 != 0) goto L_0x0030
            r8 = 1
            goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            if (r8 == 0) goto L_0x0037
            r3.c = r5
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = r0
        L_0x0038:
            boolean r0 = r18.a()
            if (r0 != 0) goto L_0x0213
            boolean r0 = r1.f4376k
            if (r0 != 0) goto L_0x007c
            g.i.b.f.h.c r0 = g.i.b.f.h.c.a     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0059
            java.lang.Class<g.i.b.f.h.c> r9 = g.i.b.f.h.c.class
            monitor-enter(r9)     // Catch:{ all -> 0x0078 }
            g.i.b.f.h.c r0 = g.i.b.f.h.c.a     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0054
            g.i.b.f.h.c r0 = new g.i.b.f.h.c     // Catch:{ all -> 0x0056 }
            r0.<init>()     // Catch:{ all -> 0x0056 }
            g.i.b.f.h.c.a = r0     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r9)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0059:
            g.i.b.f.h.c r0 = g.i.b.f.h.c.a     // Catch:{ all -> 0x0078 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0078 }
            boolean r0 = r1.t     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007c
            boolean r0 = r1.U     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007c
            boolean r0 = r1.u     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007c
            g.i.b.f.g.a r0 = r1.Q     // Catch:{ all -> 0x0078 }
            g.i.b.f.k.f.b r9 = r1.f4377l     // Catch:{ all -> 0x0078 }
            long r9 = r9.f4347g     // Catch:{ all -> 0x0078 }
            g.i.b.f.k.e r0 = (g.i.b.f.k.e) r0     // Catch:{ all -> 0x0078 }
            r0.M(r9)     // Catch:{ all -> 0x0078 }
            r1.u = r5     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            r0.printStackTrace()
        L_0x007c:
            boolean r0 = r18.a()
            if (r0 != 0) goto L_0x0213
            boolean r0 = r1.f4376k
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1.t
            if (r0 != 0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 != 0) goto L_0x0213
            int r0 = r3.f4381f
            if (r0 <= 0) goto L_0x00a9
            java.lang.Object r9 = r1.q
            monitor-enter(r9)
            java.lang.Object r0 = r1.q     // Catch:{ InterruptedException -> 0x00a1 }
            int r10 = r3.f4381f     // Catch:{ InterruptedException -> 0x00a1 }
            long r10 = (long) r10     // Catch:{ InterruptedException -> 0x00a1 }
            r0.wait(r10)     // Catch:{ InterruptedException -> 0x00a1 }
            goto L_0x00a5
        L_0x009f:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a1:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x009f }
        L_0x00a5:
            monitor-exit(r9)     // Catch:{ all -> 0x009f }
            goto L_0x00a9
        L_0x00a7:
            monitor-exit(r9)     // Catch:{ all -> 0x009f }
            throw r0
        L_0x00a9:
            boolean r0 = r18.a()
            if (r0 != 0) goto L_0x0213
            long r9 = r3.b
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bb
            long r9 = android.os.SystemClock.elapsedRealtime()
            r3.b = r9
        L_0x00bb:
            boolean r0 = r1.f4370e
            if (r0 == 0) goto L_0x00c5
            r3.c = r5
            r1.f4370e = r4
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            boolean r9 = r3.c
            r17 = 0
            if (r9 == 0) goto L_0x0132
            int r9 = r1.f4374i
            r10 = 404(0x194, float:5.66E-43)
            if (r9 != r10) goto L_0x00d3
            goto L_0x00ed
        L_0x00d3:
            r10 = -10
            if (r9 == r10) goto L_0x00ed
            r10 = -11
            if (r9 == r10) goto L_0x00ed
            r10 = -55
            if (r9 != r10) goto L_0x00e0
            goto L_0x00ed
        L_0x00e0:
            java.util.concurrent.atomic.AtomicInteger r9 = r1.R
            int r9 = r9.get()
            int r10 = r1.W
            if (r9 < r10) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r15 = 0
            goto L_0x00ee
        L_0x00ed:
            r15 = 1
        L_0x00ee:
            g.i.b.f.k.f.b r9 = r1.f4377l
            java.lang.String r10 = g.i.b.e.b.e.f4111f
            g.i.b.f.k.f.a r11 = r1.c
            boolean r12 = r1.f4376k
            r13 = 0
            r16 = 0
            r14 = r0
            g.i.b.f.k.f.a r9 = r9.a(r10, r11, r12, r13, r14, r15, r16)
            r1.c = r9
            java.lang.String r9 = "down_use_https"
            int r9 = g.h.a.a.b(r9, r4, r5, r5)
            if (r9 == r5) goto L_0x0121
            g.i.b.f.k.f.a r11 = r1.c
            g.i.b.f.k.f.a$a r9 = r11.b
            g.i.b.f.k.f.a$a r10 = g.i.b.f.k.f.a.C0161a.Type_CDN_Ip_Socket_Schedule_Https
            if (r9 != r10) goto L_0x0121
            g.i.b.f.k.f.b r9 = r1.f4377l
            java.lang.String r10 = g.i.b.e.b.e.f4111f
            boolean r12 = r1.f4376k
            r13 = 1
            r15 = 0
            r16 = 0
            r14 = r0
            g.i.b.f.k.f.a r0 = r9.a(r10, r11, r12, r13, r14, r15, r16)
            r1.c = r0
        L_0x0121:
            java.lang.String r0 = "halley-downloader-SectionTransport"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Direct:"
            r9.<init>(r10)
            boolean r10 = r1.f4376k
            r9.append(r10)
            java.lang.String r10 = " switch url... type:"
            goto L_0x0182
        L_0x0132:
            g.i.b.f.k.f.a r0 = r1.c
            g.i.b.f.k.f.a$a r0 = r0.b
            g.i.b.f.k.f.a$a r9 = g.i.b.f.k.f.a.C0161a.Type_CDN_Domain
            if (r0 == r9) goto L_0x0143
            if (r0 == r2) goto L_0x0143
            g.i.b.f.k.f.a$a r10 = g.i.b.f.k.f.a.C0161a.Type_Src_Domain
            if (r0 != r10) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r10 = 0
            goto L_0x0144
        L_0x0143:
            r10 = 1
        L_0x0144:
            if (r10 == 0) goto L_0x0172
            g.i.b.f.k.f.b r10 = r1.f4377l
            java.lang.String r11 = g.i.b.e.b.e.f4111f
            g.i.b.f.k.f.b$a r10 = r10.b(r11)
            if (r10 != 0) goto L_0x0153
            r0 = r17
            goto L_0x015d
        L_0x0153:
            if (r0 == r9) goto L_0x015b
            if (r0 != r2) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            g.i.b.f.k.f.a r0 = r10.f4358h
            goto L_0x015d
        L_0x015b:
            g.i.b.f.k.f.a r0 = r10.f4356f
        L_0x015d:
            if (r0 == 0) goto L_0x0161
            r1.c = r0
        L_0x0161:
            java.lang.String r0 = "halley-downloader-SectionTransport"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Direct:"
            r9.<init>(r10)
            boolean r10 = r1.f4376k
            r9.append(r10)
            java.lang.String r10 = " switch for domain to url... type:"
            goto L_0x0182
        L_0x0172:
            java.lang.String r0 = "halley-downloader-SectionTransport"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Direct:"
            r9.<init>(r10)
            boolean r10 = r1.f4376k
            r9.append(r10)
            java.lang.String r10 = " do not switch...type:"
        L_0x0182:
            r9.append(r10)
            g.i.b.f.k.f.a r10 = r1.c
            g.i.b.f.k.f.a$a r10 = r10.b
            r9.append(r10)
            java.lang.String r10 = ",url:"
            r9.append(r10)
            g.i.b.f.k.f.a r10 = r1.c
            java.lang.String r10 = r10.a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            g.i.b.e.h.b.c(r0, r9)
            java.lang.String r0 = "currentUrl"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "currentUrl after: "
            r9.<init>(r10)
            g.i.b.f.k.f.a r10 = r1.c
            java.lang.String r10 = r10.a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            g.i.b.e.h.b.f(r0, r9)
            g.i.b.f.k.f.a r0 = r1.c
            java.util.Objects.requireNonNull(r0)
            java.util.Map<g.i.b.f.k.f.a, g.i.b.f.g.c> r0 = r1.B
            g.i.b.f.k.f.a r9 = r1.c
            java.lang.Object r0 = r0.get(r9)
            g.i.b.f.g.c r0 = (g.i.b.f.g.c) r0
            if (r0 == 0) goto L_0x01e2
            boolean r9 = r0.c
            if (r9 == 0) goto L_0x01e2
            g.i.b.f.k.f.b r9 = r1.f4377l
            java.util.List<g.i.b.f.k.f.a> r10 = r9.a
            monitor-enter(r10)
            java.util.List<g.i.b.f.k.f.a> r9 = r9.a     // Catch:{ all -> 0x01df }
            int r9 = r9.size()     // Catch:{ all -> 0x01df }
            monitor-exit(r10)     // Catch:{ all -> 0x01df }
            if (r9 <= 0) goto L_0x01e2
            boolean r0 = r0.f4250e
            if (r0 != 0) goto L_0x01e2
            r0 = 1
            goto L_0x01e3
        L_0x01df:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01df }
            throw r0
        L_0x01e2:
            r0 = 0
        L_0x01e3:
            if (r0 == 0) goto L_0x01e8
            r1.f4370e = r5
            goto L_0x0210
        L_0x01e8:
            g.i.b.f.k.g.b r0 = r1.f4372g
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0
            boolean r9 = r0.g(r1)
            if (r9 != 0) goto L_0x01f3
            goto L_0x01f9
        L_0x01f3:
            g.i.b.f.k.e r9 = r0.f4387e
            boolean r9 = r9.W
            if (r9 != 0) goto L_0x01fc
        L_0x01f9:
            r0 = r17
            goto L_0x0205
        L_0x01fc:
            g.i.b.f.k.e r0 = r0.f4387e
            g.i.b.f.k.a r0 = r0.f4311g
            g.i.b.f.k.g.a r17 = r0.e()
            goto L_0x01f9
        L_0x0205:
            r1.b = r0
            if (r0 == 0) goto L_0x0213
            boolean r0 = r1.e(r3)
            if (r0 == 0) goto L_0x0210
            goto L_0x0213
        L_0x0210:
            r0 = r8
            goto L_0x0026
        L_0x0213:
            java.lang.String r0 = "halley-downloader-SectionTransport"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Transport finish on retCode:"
            r2.<init>(r3)
            int r3 = r1.f4374i
            r2.append(r3)
            java.lang.String r3 = ",msg:"
            r2.append(r3)
            java.lang.String r3 = r1.f4375j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            g.i.b.e.h.b.h(r0, r2)
            r1.o = r5
            g.i.b.f.k.e$c r0 = r1.r
            long r2 = java.lang.System.currentTimeMillis()
            g.i.b.f.k.e$c r4 = r1.r
            long r4 = r4.b
            long r2 = r2 - r4
            r0.c = r2
            g.i.b.f.k.g.b r0 = r1.f4372g     // Catch:{ all -> 0x0249 }
            g.i.b.f.k.g.d r0 = (g.i.b.f.k.g.d) r0     // Catch:{ all -> 0x0249 }
            r0.f(r1)     // Catch:{ all -> 0x0249 }
            return
        L_0x0249:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.g.c.run():void");
    }
}
