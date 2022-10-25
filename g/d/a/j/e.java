package g.d.a.j;

import android.graphics.Bitmap;
import g.d.a.j.a;
import g.d.a.l.v.g.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public class e implements a {
    public static final String u = "e";
    public int[] a;
    public final int[] b = new int[256];
    public final a.C0079a c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f2390d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f2391e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f2392f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f2393g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f2394h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f2395i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2396j;

    /* renamed from: k  reason: collision with root package name */
    public int f2397k;

    /* renamed from: l  reason: collision with root package name */
    public c f2398l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f2399m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(a.C0079a aVar, c cVar, ByteBuffer byteBuffer, int i2) {
        this.c = aVar;
        this.f2398l = new c();
        synchronized (this) {
            if (i2 > 0) {
                int highestOneBit = Integer.highestOneBit(i2);
                this.o = 0;
                this.f2398l = cVar;
                this.f2397k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f2390d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f2390d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator<b> it = cVar.f2382e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f2376g == 3) {
                            this.n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.p = highestOneBit;
                int i3 = cVar.f2383f;
                this.r = i3 / highestOneBit;
                int i4 = cVar.f2384g;
                this.q = i4 / highestOneBit;
                this.f2395i = ((b) this.c).a(i3 * i4);
                a.C0079a aVar2 = this.c;
                int i5 = this.r * this.q;
                g.d.a.l.t.b0.b bVar = ((b) aVar2).b;
                this.f2396j = bVar == null ? new int[i5] : (int[]) bVar.d(i5, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
        }
    }

    public int a() {
        return this.f2397k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            g.d.a.j.c r0 = r8.f2398l     // Catch:{ all -> 0x00e6 }
            int r0 = r0.c     // Catch:{ all -> 0x00e6 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r3.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            g.d.a.j.c r4 = r8.f2398l     // Catch:{ all -> 0x00e6 }
            int r4 = r4.c     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e6 }
        L_0x0037:
            r8.o = r2     // Catch:{ all -> 0x00e6 }
        L_0x0039:
            int r0 = r8.o     // Catch:{ all -> 0x00e6 }
            r3 = 0
            if (r0 == r2) goto L_0x00c6
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c6
        L_0x0043:
            r0 = 0
            r8.o = r0     // Catch:{ all -> 0x00e6 }
            byte[] r5 = r8.f2391e     // Catch:{ all -> 0x00e6 }
            if (r5 != 0) goto L_0x0056
            g.d.a.j.a$a r5 = r8.c     // Catch:{ all -> 0x00e6 }
            r6 = 255(0xff, float:3.57E-43)
            g.d.a.l.v.g.b r5 = (g.d.a.l.v.g.b) r5     // Catch:{ all -> 0x00e6 }
            byte[] r5 = r5.a(r6)     // Catch:{ all -> 0x00e6 }
            r8.f2391e = r5     // Catch:{ all -> 0x00e6 }
        L_0x0056:
            g.d.a.j.c r5 = r8.f2398l     // Catch:{ all -> 0x00e6 }
            java.util.List<g.d.a.j.b> r5 = r5.f2382e     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e6 }
            g.d.a.j.b r5 = (g.d.a.j.b) r5     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0072
            g.d.a.j.c r7 = r8.f2398l     // Catch:{ all -> 0x00e6 }
            java.util.List<g.d.a.j.b> r7 = r7.f2382e     // Catch:{ all -> 0x00e6 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e6 }
            g.d.a.j.b r6 = (g.d.a.j.b) r6     // Catch:{ all -> 0x00e6 }
            goto L_0x0073
        L_0x0072:
            r6 = r3
        L_0x0073:
            int[] r7 = r5.f2380k     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            g.d.a.j.c r7 = r8.f2398l     // Catch:{ all -> 0x00e6 }
            int[] r7 = r7.a     // Catch:{ all -> 0x00e6 }
        L_0x007c:
            r8.a = r7     // Catch:{ all -> 0x00e6 }
            if (r7 != 0) goto L_0x00a2
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x009e:
            r8.o = r2     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r3
        L_0x00a2:
            boolean r1 = r5.f2375f     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00c0
            int[] r1 = r8.b     // Catch:{ all -> 0x00e6 }
            int r2 = r7.length     // Catch:{ all -> 0x00e6 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e6 }
            int[] r1 = r8.b     // Catch:{ all -> 0x00e6 }
            r8.a = r1     // Catch:{ all -> 0x00e6 }
            int r2 = r5.f2377h     // Catch:{ all -> 0x00e6 }
            r1[r2] = r0     // Catch:{ all -> 0x00e6 }
            int r0 = r5.f2376g     // Catch:{ all -> 0x00e6 }
            if (r0 != r4) goto L_0x00c0
            int r0 = r8.f2397k     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00c0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e6 }
            r8.s = r0     // Catch:{ all -> 0x00e6 }
        L_0x00c0:
            android.graphics.Bitmap r0 = r8.j(r5, r6)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r0
        L_0x00c6:
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            int r2 = r8.o     // Catch:{ all -> 0x00e6 }
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r8)
            return r3
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.j.e.b():android.graphics.Bitmap");
    }

    public void c() {
        this.f2397k = (this.f2397k + 1) % this.f2398l.c;
    }

    public void clear() {
        g.d.a.l.t.b0.b bVar;
        g.d.a.l.t.b0.b bVar2;
        g.d.a.l.t.b0.b bVar3;
        this.f2398l = null;
        byte[] bArr = this.f2395i;
        if (!(bArr == null || (bVar3 = ((b) this.c).b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f2396j;
        if (!(iArr == null || (bVar2 = ((b) this.c).b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f2399m;
        if (bitmap != null) {
            ((b) this.c).a.e(bitmap);
        }
        this.f2399m = null;
        this.f2390d = null;
        this.s = null;
        byte[] bArr2 = this.f2391e;
        if (bArr2 != null && (bVar = ((b) this.c).b) != null) {
            bVar.put(bArr2);
        }
    }

    public int d() {
        return this.f2398l.c;
    }

    public int e() {
        int i2;
        c cVar = this.f2398l;
        int i3 = cVar.c;
        if (i3 <= 0 || (i2 = this.f2397k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.f2382e.get(i2).f2378i;
    }

    public int f() {
        return (this.f2396j.length * 4) + this.f2390d.limit() + this.f2395i.length;
    }

    public ByteBuffer g() {
        return this.f2390d;
    }

    public final Bitmap h() {
        Boolean bool = this.s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t;
        Bitmap c2 = ((b) this.c).a.c(this.r, this.q, config);
        c2.setHasAlpha(true);
        return c2;
    }

    public void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f2387j == r1.f2377h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v30, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(g.d.a.j.b r36, g.d.a.j.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f2396j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f2399m
            if (r3 == 0) goto L_0x0018
            g.d.a.j.a$a r4 = r0.c
            g.d.a.l.v.g.b r4 = (g.d.a.l.v.g.b) r4
            g.d.a.l.t.b0.d r4 = r4.a
            r4.e(r3)
        L_0x0018:
            r3 = 0
            r0.f2399m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f2376g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f2399m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f2376g
            if (r3 <= 0) goto L_0x0080
            if (r3 != r13) goto L_0x006e
            boolean r3 = r1.f2375f
            if (r3 != 0) goto L_0x0047
            g.d.a.j.c r3 = r0.f2398l
            int r4 = r3.f2388k
            int[] r5 = r1.f2380k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f2387j
            int r5 = r1.f2377h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r3 = r2.f2373d
            int r5 = r0.p
            int r3 = r3 / r5
            int r6 = r2.b
            int r6 = r6 / r5
            int r7 = r2.c
            int r7 = r7 / r5
            int r2 = r2.a
            int r2 = r2 / r5
            int r5 = r0.r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005e:
            if (r6 >= r3) goto L_0x0080
            int r2 = r6 + r7
            r5 = r6
        L_0x0063:
            if (r5 >= r2) goto L_0x006a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006a:
            int r2 = r0.r
            int r6 = r6 + r2
            goto L_0x005e
        L_0x006e:
            if (r3 != r12) goto L_0x0080
            android.graphics.Bitmap r2 = r0.f2399m
            if (r2 == 0) goto L_0x0080
            r4 = 0
            int r8 = r0.r
            r6 = 0
            r7 = 0
            int r9 = r0.q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0080:
            java.nio.ByteBuffer r2 = r0.f2390d
            int r3 = r1.f2379j
            r2.position(r3)
            int r2 = r1.c
            int r3 = r1.f2373d
            int r2 = r2 * r3
            byte[] r3 = r0.f2395i
            if (r3 == 0) goto L_0x0094
            int r3 = r3.length
            if (r3 >= r2) goto L_0x009e
        L_0x0094:
            g.d.a.j.a$a r3 = r0.c
            g.d.a.l.v.g.b r3 = (g.d.a.l.v.g.b) r3
            byte[] r3 = r3.a(r2)
            r0.f2395i = r3
        L_0x009e:
            byte[] r3 = r0.f2395i
            short[] r4 = r0.f2392f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00aa
            short[] r4 = new short[r5]
            r0.f2392f = r4
        L_0x00aa:
            short[] r4 = r0.f2392f
            byte[] r6 = r0.f2393g
            if (r6 != 0) goto L_0x00b4
            byte[] r6 = new byte[r5]
            r0.f2393g = r6
        L_0x00b4:
            byte[] r6 = r0.f2393g
            byte[] r7 = r0.f2394h
            if (r7 != 0) goto L_0x00c0
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f2394h = r7
        L_0x00c0:
            byte[] r7 = r0.f2394h
            java.nio.ByteBuffer r8 = r0.f2390d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = 0
        L_0x00d8:
            if (r5 >= r14) goto L_0x00e3
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00d8
        L_0x00e3:
            byte[] r5 = r0.f2391e
            r12 = r0
            r25 = r8
            r24 = r16
            r28 = r17
            r9 = 0
            r13 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L_0x00fc:
            r30 = 8
            if (r9 >= r2) goto L_0x01f7
            if (r20 != 0) goto L_0x0139
            java.nio.ByteBuffer r11 = r12.f2390d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x0115
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x012d
        L_0x0115:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f2390d
            r32 = r9
            byte[] r9 = r12.f2391e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x012d:
            if (r11 > 0) goto L_0x0134
            r8 = 3
            r12.o = r8
            goto L_0x01f9
        L_0x0134:
            r20 = r11
            r21 = 0
            goto L_0x0141
        L_0x0139:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x0141:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r10 = r22
            r11 = r24
            r8 = r25
            r9 = r32
            r13 = r33
            r22 = r5
            r5 = r26
        L_0x015f:
            if (r10 < r8) goto L_0x01e1
            r24 = r12
            r12 = r23 & r28
            int r23 = r23 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x017b
            r25 = r10
            r11 = r16
            r28 = r17
            r12 = r24
            r8 = r31
            r13 = -1
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01db
        L_0x017b:
            if (r12 != r15) goto L_0x0185
            r12 = r24
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e6
        L_0x0185:
            r25 = r10
            r10 = -1
            if (r13 != r10) goto L_0x0197
            byte r5 = r6[r12]
            r3[r27] = r5
            int r27 = r27 + 1
            int r9 = r9 + 1
            r24 = r12
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01d9
        L_0x0197:
            if (r12 < r11) goto L_0x01a0
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01a1
        L_0x01a0:
            r5 = r12
        L_0x01a1:
            if (r5 < r14) goto L_0x01ac
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a1
        L_0x01ac:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r27] = r10
        L_0x01b3:
            r19 = 1
            int r27 = r27 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01c2
            int r29 = r29 + -1
            byte r24 = r7[r29]
            r3[r27] = r24
            goto L_0x01b3
        L_0x01c2:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01d9
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01d9
            if (r11 >= r5) goto L_0x01d9
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01d9:
            r13 = r12
            r12 = r0
        L_0x01db:
            r5 = r24
            r10 = r25
            goto L_0x015f
        L_0x01e1:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01e6:
            r25 = r8
            r5 = r22
            r26 = r24
            r8 = r31
            r22 = r10
            r24 = r11
            r10 = r34
            r11 = 0
            goto L_0x00fc
        L_0x01f7:
            r34 = r10
        L_0x01f9:
            r11 = r27
            r10 = 0
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f2374e
            if (r2 != 0) goto L_0x0276
            int r2 = r0.p
            r3 = 1
            if (r2 == r3) goto L_0x020a
            goto L_0x0276
        L_0x020a:
            int[] r2 = r0.f2396j
            int r3 = r1.f2373d
            int r4 = r1.b
            int r5 = r1.c
            int r6 = r1.a
            int r7 = r0.f2397k
            if (r7 != 0) goto L_0x021a
            r7 = 1
            goto L_0x021b
        L_0x021a:
            r7 = 0
        L_0x021b:
            int r8 = r0.r
            byte[] r9 = r0.f2395i
            int[] r11 = r0.a
            r12 = -1
            r13 = 0
        L_0x0223:
            if (r13 >= r3) goto L_0x0258
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0231
            r10 = r14
        L_0x0231:
            int r14 = r1.c
            int r14 = r14 * r13
        L_0x0235:
            r16 = r3
            if (r15 >= r10) goto L_0x0252
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0249
            r4 = r11[r4]
            if (r4 == 0) goto L_0x0248
            r2[r15] = r4
            goto L_0x0249
        L_0x0248:
            r12 = r3
        L_0x0249:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0235
        L_0x0252:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x0223
        L_0x0258:
            java.lang.Boolean r2 = r0.s
            if (r2 == 0) goto L_0x0262
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026b
        L_0x0262:
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            r2 = -1
            if (r12 == r2) goto L_0x026d
        L_0x026b:
            r11 = 1
            goto L_0x026e
        L_0x026d:
            r11 = 0
        L_0x026e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.s = r2
            goto L_0x0402
        L_0x0276:
            int[] r2 = r0.f2396j
            int r3 = r1.f2373d
            int r4 = r0.p
            int r3 = r3 / r4
            int r5 = r1.b
            int r5 = r5 / r4
            int r6 = r1.c
            int r6 = r6 / r4
            int r7 = r1.a
            int r7 = r7 / r4
            int r8 = r0.f2397k
            if (r8 != 0) goto L_0x028c
            r10 = 1
            goto L_0x028d
        L_0x028c:
            r10 = 0
        L_0x028d:
            int r8 = r0.r
            int r9 = r0.q
            byte[] r11 = r0.f2395i
            int[] r12 = r0.a
            java.lang.Boolean r13 = r0.s
            r14 = r13
            r13 = 0
            r15 = 0
            r16 = 1
            r17 = 8
        L_0x029e:
            r37 = r14
            if (r13 >= r3) goto L_0x03f0
            boolean r14 = r1.f2374e
            if (r14 == 0) goto L_0x02cd
            if (r15 < r3) goto L_0x02c8
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c3
            r3 = 3
            if (r14 == r3) goto L_0x02bc
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02b8
            goto L_0x02ca
        L_0x02b8:
            r15 = 1
            r17 = 2
            goto L_0x02ca
        L_0x02bc:
            r3 = 4
            r16 = r14
            r15 = 2
            r17 = 4
            goto L_0x02ca
        L_0x02c3:
            r3 = 4
            r16 = r14
            r15 = 4
            goto L_0x02ca
        L_0x02c8:
            r20 = r3
        L_0x02ca:
            int r3 = r15 + r17
            goto L_0x02d1
        L_0x02cd:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02d1:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02d7
            r14 = 1
            goto L_0x02d8
        L_0x02d7:
            r14 = 0
        L_0x02d8:
            if (r15 >= r9) goto L_0x03d0
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02e6
            r3 = r15
        L_0x02e6:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0310
            r14 = r37
            r5 = r18
        L_0x02f4:
            r23 = r6
            if (r5 >= r3) goto L_0x03c9
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0303
            r2[r5] = r6
            goto L_0x030a
        L_0x0303:
            if (r10 == 0) goto L_0x030a
            if (r14 != 0) goto L_0x030a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030a:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f4
        L_0x0310:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x031b:
            if (r6 >= r3) goto L_0x03c9
            r18 = r3
            int r3 = r1.c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0330:
            int r8 = r0.p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0365
            byte[] r8 = r0.f2395i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0367
            if (r7 >= r5) goto L_0x0367
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0360
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0360:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0330
        L_0x0365:
            r32 = r9
        L_0x0367:
            int r3 = r3 + r15
            r7 = r3
        L_0x0369:
            int r8 = r0.p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039a
            byte[] r8 = r0.f2395i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039a
            if (r7 >= r5) goto L_0x039a
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0397
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0397:
            int r7 = r7 + 1
            goto L_0x0369
        L_0x039a:
            if (r28 != 0) goto L_0x039e
            r3 = 0
            goto L_0x03b0
        L_0x039e:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b0:
            if (r3 == 0) goto L_0x03b5
            r2[r6] = r3
            goto L_0x03bc
        L_0x03b5:
            if (r10 == 0) goto L_0x03bc
            if (r14 != 0) goto L_0x03bc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03bc:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x031b
        L_0x03c9:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03de
        L_0x03d0:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03de:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x029e
        L_0x03f0:
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x0402
            if (r37 != 0) goto L_0x03f8
            r11 = 0
            goto L_0x03fc
        L_0x03f8:
            boolean r11 = r37.booleanValue()
        L_0x03fc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.s = r2
        L_0x0402:
            boolean r2 = r0.n
            if (r2 == 0) goto L_0x0426
            int r1 = r1.f2376g
            if (r1 == 0) goto L_0x040d
            r2 = 1
            if (r1 != r2) goto L_0x0426
        L_0x040d:
            android.graphics.Bitmap r1 = r0.f2399m
            if (r1 != 0) goto L_0x0417
            android.graphics.Bitmap r1 = r35.h()
            r0.f2399m = r1
        L_0x0417:
            android.graphics.Bitmap r1 = r0.f2399m
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0426:
            android.graphics.Bitmap r9 = r35.h()
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.j.e.j(g.d.a.j.b, g.d.a.j.b):android.graphics.Bitmap");
    }
}
