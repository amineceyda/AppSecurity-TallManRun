package k.h0.i;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import k.h0.i.q;
import l.e;
import l.g;
import l.h;
import l.q;
import l.t;
import l.y;

public final class c {
    public static final b[] a;
    public static final Map<h, Integer> b;

    public static final class a {
        public final List<b> a = new ArrayList();
        public final g b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4803d;

        /* renamed from: e  reason: collision with root package name */
        public b[] f4804e = new b[8];

        /* renamed from: f  reason: collision with root package name */
        public int f4805f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f4806g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f4807h = 0;

        public a(int i2, y yVar) {
            this.c = i2;
            this.f4803d = i2;
            Logger logger = q.a;
            this.b = new t(yVar);
        }

        public final void a() {
            Arrays.fill(this.f4804e, (Object) null);
            this.f4805f = this.f4804e.length - 1;
            this.f4806g = 0;
            this.f4807h = 0;
        }

        public final int b(int i2) {
            return this.f4805f + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f4804e.length;
                while (true) {
                    length--;
                    i3 = this.f4805f;
                    if (length < i3 || i2 <= 0) {
                        b[] bVarArr = this.f4804e;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i4, this.f4806g);
                        this.f4805f += i4;
                    } else {
                        b[] bVarArr2 = this.f4804e;
                        i2 -= bVarArr2[length].c;
                        this.f4807h -= bVarArr2[length].c;
                        this.f4806g--;
                        i4++;
                    }
                }
                b[] bVarArr3 = this.f4804e;
                System.arraycopy(bVarArr3, i3 + 1, bVarArr3, i3 + 1 + i4, this.f4806g);
                this.f4805f += i4;
            }
            return i4;
        }

        public final h d(int i2) throws IOException {
            b bVar;
            if (i2 >= 0 && i2 <= c.a.length + -1) {
                bVar = c.a[i2];
            } else {
                int b2 = b(i2 - c.a.length);
                if (b2 >= 0) {
                    b[] bVarArr = this.f4804e;
                    if (b2 < bVarArr.length) {
                        bVar = bVarArr[b2];
                    }
                }
                StringBuilder i3 = g.a.a.a.a.i("Header index too large ");
                i3.append(i2 + 1);
                throw new IOException(i3.toString());
            }
            return bVar.a;
        }

        public final void e(int i2, b bVar) {
            this.a.add(bVar);
            int i3 = bVar.c;
            if (i2 != -1) {
                i3 -= this.f4804e[(this.f4805f + 1) + i2].c;
            }
            int i4 = this.f4803d;
            if (i3 > i4) {
                a();
                return;
            }
            int c2 = c((this.f4807h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f4806g + 1;
                b[] bVarArr = this.f4804e;
                if (i5 > bVarArr.length) {
                    b[] bVarArr2 = new b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f4805f = this.f4804e.length - 1;
                    this.f4804e = bVarArr2;
                }
                int i6 = this.f4805f;
                this.f4805f = i6 - 1;
                this.f4804e[i6] = bVar;
                this.f4806g++;
            } else {
                this.f4804e[this.f4805f + 1 + i2 + c2 + i2] = bVar;
            }
            this.f4807h += i3;
        }

        public h f() throws IOException {
            byte readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int g2 = g(readByte, 127);
            if (!z) {
                return this.b.e((long) g2);
            }
            q qVar = q.f4881d;
            byte[] E = this.b.E((long) g2);
            Objects.requireNonNull(qVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            q.a aVar = qVar.a;
            byte b2 = 0;
            int i2 = 0;
            for (byte b3 : E) {
                b2 = (b2 << 8) | (b3 & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    aVar = aVar.a[(b2 >>> i3) & 255];
                    if (aVar.a == null) {
                        byteArrayOutputStream.write(aVar.b);
                        i2 -= aVar.c;
                        aVar = qVar.a;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                q.a aVar2 = aVar.a[(b2 << (8 - i2)) & 255];
                if (aVar2.a != null || aVar2.c > i2) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.b);
                i2 -= aVar2.c;
                aVar = qVar.a;
            }
            return h.m(byteArrayOutputStream.toByteArray());
        }

        public int g(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                byte readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & Byte.MAX_VALUE) << i5;
                i5 += 7;
            }
        }
    }

    public static final class b {
        public final e a;
        public int b = Integer.MAX_VALUE;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f4808d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public b[] f4809e = new b[8];

        /* renamed from: f  reason: collision with root package name */
        public int f4810f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f4811g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f4812h = 0;

        public b(e eVar) {
            this.a = eVar;
        }

        public final void a() {
            Arrays.fill(this.f4809e, (Object) null);
            this.f4810f = this.f4809e.length - 1;
            this.f4811g = 0;
            this.f4812h = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f4809e.length;
                while (true) {
                    length--;
                    i3 = this.f4810f;
                    if (length < i3 || i2 <= 0) {
                        b[] bVarArr = this.f4809e;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i4, this.f4811g);
                        b[] bVarArr2 = this.f4809e;
                        int i5 = this.f4810f;
                        Arrays.fill(bVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.f4810f += i4;
                    } else {
                        b[] bVarArr3 = this.f4809e;
                        i2 -= bVarArr3[length].c;
                        this.f4812h -= bVarArr3[length].c;
                        this.f4811g--;
                        i4++;
                    }
                }
                b[] bVarArr4 = this.f4809e;
                System.arraycopy(bVarArr4, i3 + 1, bVarArr4, i3 + 1 + i4, this.f4811g);
                b[] bVarArr22 = this.f4809e;
                int i52 = this.f4810f;
                Arrays.fill(bVarArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.f4810f += i4;
            }
            return i4;
        }

        public final void c(b bVar) {
            int i2 = bVar.c;
            int i3 = this.f4808d;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.f4812h + i2) - i3);
            int i4 = this.f4811g + 1;
            b[] bVarArr = this.f4809e;
            if (i4 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f4810f = this.f4809e.length - 1;
                this.f4809e = bVarArr2;
            }
            int i5 = this.f4810f;
            this.f4810f = i5 - 1;
            this.f4809e[i5] = bVar;
            this.f4811g++;
            this.f4812h += i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(l.h r11) throws java.io.IOException {
            /*
                r10 = this;
                k.h0.i.q r0 = k.h0.i.q.f4881d
                java.util.Objects.requireNonNull(r0)
                r0 = 0
                r2 = 0
                r4 = r0
                r3 = 0
            L_0x000a:
                int r6 = r11.p()
                r7 = 255(0xff, float:3.57E-43)
                if (r3 >= r6) goto L_0x0020
                byte r6 = r11.h(r3)
                r6 = r6 & r7
                byte[] r7 = k.h0.i.q.c
                byte r6 = r7[r6]
                long r6 = (long) r6
                long r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r8 = 7
                long r4 = r4 + r8
                r3 = 3
                long r3 = r4 >> r3
                int r4 = (int) r3
                int r3 = r11.p()
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r3) goto L_0x007b
                l.e r3 = new l.e
                r3.<init>()
                k.h0.i.q r4 = k.h0.i.q.f4881d
                java.util.Objects.requireNonNull(r4)
                r4 = 0
            L_0x003a:
                int r6 = r11.p()
                if (r2 >= r6) goto L_0x0061
                byte r6 = r11.h(r2)
                r6 = r6 & r7
                int[] r8 = k.h0.i.q.b
                r8 = r8[r6]
                byte[] r9 = k.h0.i.q.c
                byte r6 = r9[r6]
                long r0 = r0 << r6
                long r8 = (long) r8
                long r0 = r0 | r8
                int r4 = r4 + r6
            L_0x0051:
                r6 = 8
                if (r4 < r6) goto L_0x005e
                int r4 = r4 + -8
                long r8 = r0 >> r4
                int r6 = (int) r8
                r3.writeByte(r6)
                goto L_0x0051
            L_0x005e:
                int r2 = r2 + 1
                goto L_0x003a
            L_0x0061:
                if (r4 <= 0) goto L_0x006e
                int r11 = 8 - r4
                long r0 = r0 << r11
                int r11 = r7 >>> r4
                long r6 = (long) r11
                long r0 = r0 | r6
                int r11 = (int) r0
                r3.writeByte(r11)
            L_0x006e:
                l.h r11 = r3.j()
                byte[] r0 = r11.data
                int r0 = r0.length
                r1 = 128(0x80, float:1.794E-43)
                r10.f(r0, r5, r1)
                goto L_0x0082
            L_0x007b:
                int r0 = r11.p()
                r10.f(r0, r5, r2)
            L_0x0082:
                l.e r0 = r10.a
                r0.t(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.i.c.b.d(l.h):void");
        }

        public void e(List<b> list) throws IOException {
            int i2;
            int i3;
            if (this.c) {
                int i4 = this.b;
                if (i4 < this.f4808d) {
                    f(i4, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                f(this.f4808d, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = list.get(i5);
                h r = bVar.a.r();
                h hVar = bVar.b;
                Integer num = c.b.get(r);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        b[] bVarArr = c.a;
                        if (k.h0.c.m(bVarArr[i3 - 1].b, hVar)) {
                            i2 = i3;
                        } else if (k.h0.c.m(bVarArr[i3].b, hVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f4810f + 1;
                    int length = this.f4809e.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (k.h0.c.m(this.f4809e[i6].a, r)) {
                            if (k.h0.c.m(this.f4809e[i6].b, hVar)) {
                                i3 = c.a.length + (i6 - this.f4810f);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.f4810f) + c.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    f(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.O(64);
                        d(r);
                    } else {
                        h hVar2 = b.f4797d;
                        Objects.requireNonNull(r);
                        if (!r.n(0, hVar2, 0, hVar2.p()) || b.f4802i.equals(r)) {
                            f(i2, 63, 64);
                        } else {
                            f(i2, 15, 0);
                            d(hVar);
                        }
                    }
                    d(hVar);
                    c(bVar);
                }
            }
        }

        public void f(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.a;
                i5 = i2 | i4;
            } else {
                this.a.O(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.a.O(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.a;
            }
            eVar.O(i5);
        }
    }

    static {
        b bVar = new b(b.f4802i, "");
        int i2 = 0;
        h hVar = b.f4799f;
        h hVar2 = b.f4800g;
        h hVar3 = b.f4801h;
        h hVar4 = b.f4798e;
        b[] bVarArr = {bVar, new b(hVar, "GET"), new b(hVar, "POST"), new b(hVar2, "/"), new b(hVar2, "/index.html"), new b(hVar3, "http"), new b(hVar3, "https"), new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        while (true) {
            b[] bVarArr2 = a;
            if (i2 < bVarArr2.length) {
                if (!linkedHashMap.containsKey(bVarArr2[i2].a)) {
                    linkedHashMap.put(bVarArr2[i2].a, Integer.valueOf(i2));
                }
                i2++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static h a(h hVar) throws IOException {
        int p = hVar.p();
        int i2 = 0;
        while (i2 < p) {
            byte h2 = hVar.h(i2);
            if (h2 < 65 || h2 > 90) {
                i2++;
            } else {
                StringBuilder i3 = g.a.a.a.a.i("PROTOCOL_ERROR response malformed: mixed case name: ");
                i3.append(hVar.t());
                throw new IOException(i3.toString());
            }
        }
        return hVar;
    }
}
