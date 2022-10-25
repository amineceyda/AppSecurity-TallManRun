package k.h0.i;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.h0.i.c;
import k.h0.i.f;
import k.h0.i.o;
import l.e;
import l.g;
import l.h;
import l.y;
import l.z;

public final class n implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f4854f = Logger.getLogger(d.class.getName());
    public final g b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4855d;

    /* renamed from: e  reason: collision with root package name */
    public final c.a f4856e;

    public static final class a implements y {
        public final g b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public byte f4857d;

        /* renamed from: e  reason: collision with root package name */
        public int f4858e;

        /* renamed from: f  reason: collision with root package name */
        public int f4859f;

        /* renamed from: g  reason: collision with root package name */
        public short f4860g;

        public a(g gVar) {
            this.b = gVar;
        }

        public long M(e eVar, long j2) throws IOException {
            int i2;
            int readInt;
            do {
                int i3 = this.f4859f;
                if (i3 == 0) {
                    this.b.c((long) this.f4860g);
                    this.f4860g = 0;
                    if ((this.f4857d & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f4858e;
                    int j3 = n.j(this.b);
                    this.f4859f = j3;
                    this.c = j3;
                    byte readByte = (byte) (this.b.readByte() & 255);
                    this.f4857d = (byte) (this.b.readByte() & 255);
                    Logger logger = n.f4854f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(d.a(true, this.f4858e, this.c, readByte, this.f4857d));
                    }
                    readInt = this.b.readInt() & Integer.MAX_VALUE;
                    this.f4858e = readInt;
                    if (readByte != 9) {
                        d.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long M = this.b.M(eVar, Math.min(j2, (long) i3));
                    if (M == -1) {
                        return -1;
                    }
                    this.f4859f = (int) (((long) this.f4859f) - M);
                    return M;
                }
            } while (readInt == i2);
            d.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public void close() throws IOException {
        }

        public z i() {
            return this.b.i();
        }
    }

    public interface b {
    }

    public n(g gVar, boolean z) {
        this.b = gVar;
        this.f4855d = z;
        a aVar = new a(gVar);
        this.c = aVar;
        this.f4856e = new c.a(4096, aVar);
    }

    public static int a(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        d.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }

    public static int j(g gVar) throws IOException {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public boolean b(boolean z, b bVar) throws IOException {
        boolean z2;
        boolean z3;
        boolean h2;
        b bVar2 = bVar;
        try {
            this.b.U(9);
            int j2 = j(this.b);
            if (j2 < 0 || j2 > 16384) {
                d.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(j2));
                throw null;
            }
            byte readByte = (byte) (this.b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.b.readByte() & 255);
                int readInt = this.b.readInt() & Integer.MAX_VALUE;
                Logger logger = f4854f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.a(true, readInt, j2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        if (readInt != 0) {
                            boolean z4 = (readByte2 & 1) != 0;
                            if (!((readByte2 & 32) != 0)) {
                                short readByte3 = (readByte2 & 8) != 0 ? (short) (this.b.readByte() & 255) : 0;
                                int a2 = a(j2, readByte2, readByte3);
                                g gVar = this.b;
                                f.C0197f fVar = (f.C0197f) bVar2;
                                if (f.this.j(readInt)) {
                                    f fVar2 = f.this;
                                    Objects.requireNonNull(fVar2);
                                    e eVar = new e();
                                    long j3 = (long) a2;
                                    gVar.U(j3);
                                    gVar.M(eVar, j3);
                                    if (eVar.c == j3) {
                                        fVar2.g(new i(fVar2, "OkHttp %s Push Data[%s]", new Object[]{fVar2.f4821e, Integer.valueOf(readInt)}, readInt, eVar, a2, z4));
                                    } else {
                                        throw new IOException(eVar.c + " != " + a2);
                                    }
                                } else {
                                    o d2 = f.this.d(readInt);
                                    if (d2 == null) {
                                        f.this.s(readInt, a.PROTOCOL_ERROR);
                                        long j4 = (long) a2;
                                        f.this.o(j4);
                                        gVar.c(j4);
                                    } else {
                                        o.b bVar3 = d2.f4864g;
                                        long j5 = (long) a2;
                                        Objects.requireNonNull(bVar3);
                                        while (true) {
                                            if (j5 > 0) {
                                                synchronized (o.this) {
                                                    z2 = bVar3.f4873f;
                                                    z3 = bVar3.c.c + j5 > bVar3.f4871d;
                                                }
                                                if (z3) {
                                                    gVar.c(j5);
                                                    o.this.e(a.FLOW_CONTROL_ERROR);
                                                } else if (z2) {
                                                    gVar.c(j5);
                                                } else {
                                                    long M = gVar.M(bVar3.b, j5);
                                                    if (M != -1) {
                                                        j5 -= M;
                                                        synchronized (o.this) {
                                                            e eVar2 = bVar3.c;
                                                            boolean z5 = eVar2.c == 0;
                                                            eVar2.F(bVar3.b);
                                                            if (z5) {
                                                                o.this.notifyAll();
                                                            }
                                                        }
                                                    } else {
                                                        throw new EOFException();
                                                    }
                                                }
                                            }
                                        }
                                        if (z4) {
                                            d2.i();
                                        }
                                    }
                                }
                                this.b.c((long) readByte3);
                                break;
                            } else {
                                d.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                                throw null;
                            }
                        } else {
                            d.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 1:
                        if (readInt != 0) {
                            boolean z6 = (readByte2 & 1) != 0;
                            short readByte4 = (readByte2 & 8) != 0 ? (short) (this.b.readByte() & 255) : 0;
                            if ((readByte2 & 32) != 0) {
                                this.b.readInt();
                                this.b.readByte();
                                Objects.requireNonNull((f.C0197f) bVar2);
                                j2 -= 5;
                            }
                            List<b> g2 = g(a(j2, readByte2, readByte4), readByte4, readByte2, readInt);
                            f.C0197f fVar3 = (f.C0197f) bVar2;
                            if (!f.this.j(readInt)) {
                                synchronized (f.this) {
                                    o d3 = f.this.d(readInt);
                                    if (d3 != null) {
                                        synchronized (d3) {
                                            d3.f4863f = true;
                                            d3.f4862e.add(k.h0.c.y(g2));
                                            h2 = d3.h();
                                            d3.notifyAll();
                                        }
                                        if (!h2) {
                                            d3.f4861d.k(d3.c);
                                        }
                                        if (z6) {
                                            d3.i();
                                            break;
                                        }
                                    } else {
                                        f fVar4 = f.this;
                                        if (!fVar4.f4824h) {
                                            if (readInt > fVar4.f4822f) {
                                                if (readInt % 2 != fVar4.f4823g % 2) {
                                                    o oVar = new o(readInt, f.this, false, z6, k.h0.c.y(g2));
                                                    f fVar5 = f.this;
                                                    fVar5.f4822f = readInt;
                                                    fVar5.f4820d.put(Integer.valueOf(readInt), oVar);
                                                    f.v.execute(new k(fVar3, "OkHttp %s stream %d", new Object[]{f.this.f4821e, Integer.valueOf(readInt)}, oVar));
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            } else {
                                f fVar6 = f.this;
                                Objects.requireNonNull(fVar6);
                                try {
                                    fVar6.g(new h(fVar6, "OkHttp %s Push Headers[%s]", new Object[]{fVar6.f4821e, Integer.valueOf(readInt)}, readInt, g2, z6));
                                    break;
                                } catch (RejectedExecutionException unused) {
                                    break;
                                }
                            }
                        } else {
                            d.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 2:
                        if (j2 != 5) {
                            d.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(j2));
                            throw null;
                        } else if (readInt != 0) {
                            this.b.readInt();
                            this.b.readByte();
                            Objects.requireNonNull((f.C0197f) bVar2);
                            break;
                        } else {
                            d.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        o(bVar2, j2, readInt);
                        break;
                    case 4:
                        q(bVar2, j2, readByte2, readInt);
                        break;
                    case 5:
                        n(bVar2, j2, readByte2, readInt);
                        break;
                    case 6:
                        k(bVar2, j2, readByte2, readInt);
                        break;
                    case 7:
                        f(bVar2, j2, readInt);
                        break;
                    case 8:
                        s(bVar2, j2, readInt);
                        break;
                    default:
                        this.b.c((long) j2);
                        break;
                }
                return true;
            }
            d.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused2) {
            return false;
        }
    }

    public void close() throws IOException {
        this.b.close();
    }

    public void d(b bVar) throws IOException {
        if (!this.f4855d) {
            g gVar = this.b;
            h hVar = d.a;
            h e2 = gVar.e((long) hVar.p());
            Logger logger = f4854f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(k.h0.c.n("<< CONNECTION %s", e2.i()));
            }
            if (!hVar.equals(e2)) {
                d.c("Expected a connection header but was %s", e2.t());
                throw null;
            }
        } else if (!b(true, bVar)) {
            d.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public final void f(b bVar, int i2, int i3) throws IOException {
        o[] oVarArr;
        if (i2 < 8) {
            d.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.b.readInt();
            int readInt2 = this.b.readInt();
            int i4 = i2 - 8;
            if (a.a(readInt2) != null) {
                h hVar = h.f4970e;
                if (i4 > 0) {
                    hVar = this.b.e((long) i4);
                }
                f.C0197f fVar = (f.C0197f) bVar;
                Objects.requireNonNull(fVar);
                hVar.p();
                synchronized (f.this) {
                    oVarArr = (o[]) f.this.f4820d.values().toArray(new o[f.this.f4820d.size()]);
                    f.this.f4824h = true;
                }
                for (o oVar : oVarArr) {
                    if (oVar.c > readInt && oVar.g()) {
                        a aVar = a.REFUSED_STREAM;
                        synchronized (oVar) {
                            if (oVar.f4868k == null) {
                                oVar.f4868k = aVar;
                                oVar.notifyAll();
                            }
                        }
                        f.this.k(oVar.c);
                    }
                }
                return;
            }
            d.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            d.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final List<b> g(int i2, short s, byte b2, int i3) throws IOException {
        a aVar = this.c;
        aVar.f4859f = i2;
        aVar.c = i2;
        aVar.f4860g = s;
        aVar.f4857d = b2;
        aVar.f4858e = i3;
        c.a aVar2 = this.f4856e;
        while (!aVar2.b.D()) {
            byte readByte = aVar2.b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            } else if ((readByte & 128) == 128) {
                int g2 = aVar2.g(readByte, 127) - 1;
                if (g2 >= 0 && g2 <= c.a.length + -1) {
                    aVar2.a.add(c.a[g2]);
                } else {
                    int b3 = aVar2.b(g2 - c.a.length);
                    if (b3 >= 0) {
                        b[] bVarArr = aVar2.f4804e;
                        if (b3 < bVarArr.length) {
                            aVar2.a.add(bVarArr[b3]);
                        }
                    }
                    StringBuilder i4 = g.a.a.a.a.i("Header index too large ");
                    i4.append(g2 + 1);
                    throw new IOException(i4.toString());
                }
            } else if (readByte == 64) {
                h f2 = aVar2.f();
                c.a(f2);
                aVar2.e(-1, new b(f2, aVar2.f()));
            } else if ((readByte & 64) == 64) {
                aVar2.e(-1, new b(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
            } else if ((readByte & 32) == 32) {
                int g3 = aVar2.g(readByte, 31);
                aVar2.f4803d = g3;
                if (g3 < 0 || g3 > aVar2.c) {
                    StringBuilder i5 = g.a.a.a.a.i("Invalid dynamic table size update ");
                    i5.append(aVar2.f4803d);
                    throw new IOException(i5.toString());
                }
                int i6 = aVar2.f4807h;
                if (g3 < i6) {
                    if (g3 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.c(i6 - g3);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                h f3 = aVar2.f();
                c.a(f3);
                aVar2.a.add(new b(f3, aVar2.f()));
            } else {
                aVar2.a.add(new b(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
            }
        }
        c.a aVar3 = this.f4856e;
        Objects.requireNonNull(aVar3);
        ArrayList arrayList = new ArrayList(aVar3.a);
        aVar3.a.clear();
        return arrayList;
    }

    public final void k(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 8) {
            d.c("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.b.readInt();
            int readInt2 = this.b.readInt();
            boolean z = (b2 & 1) != 0;
            f.C0197f fVar = (f.C0197f) bVar;
            Objects.requireNonNull(fVar);
            if (z) {
                synchronized (f.this) {
                    f fVar2 = f.this;
                    fVar2.f4828l = false;
                    fVar2.notifyAll();
                }
                return;
            }
            try {
                f fVar3 = f.this;
                fVar3.f4825i.execute(new f.e(true, readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            d.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void n(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 != 0) {
            short readByte = (b2 & 8) != 0 ? (short) (this.b.readByte() & 255) : 0;
            int readInt = this.b.readInt() & Integer.MAX_VALUE;
            List<b> g2 = g(a(i2 - 4, b2, readByte), readByte, b2, i3);
            f fVar = f.this;
            synchronized (fVar) {
                if (fVar.u.contains(Integer.valueOf(readInt))) {
                    fVar.s(readInt, a.PROTOCOL_ERROR);
                    return;
                }
                fVar.u.add(Integer.valueOf(readInt));
                try {
                    fVar.g(new g(fVar, "OkHttp %s Push Request[%s]", new Object[]{fVar.f4821e, Integer.valueOf(readInt)}, readInt, g2));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            d.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }

    public final void o(b bVar, int i2, int i3) throws IOException {
        if (i2 != 4) {
            d.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            int readInt = this.b.readInt();
            a a2 = a.a(readInt);
            if (a2 != null) {
                f.C0197f fVar = (f.C0197f) bVar;
                boolean j2 = f.this.j(i3);
                f fVar2 = f.this;
                if (j2) {
                    fVar2.g(new j(fVar2, "OkHttp %s Push Reset[%s]", new Object[]{fVar2.f4821e, Integer.valueOf(i3)}, i3, a2));
                    return;
                }
                o k2 = fVar2.k(i3);
                if (k2 != null) {
                    synchronized (k2) {
                        if (k2.f4868k == null) {
                            k2.f4868k = a2;
                            k2.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            d.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            d.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:38|39|(5:42|(1:44)(1:45)|(2:47|101)(2:48|100)|49|40)|50|51|52|53|(1:62)(4:56|(1:58)|59|(1:61))|63|64) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00be */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(k.h0.i.n.b r10, int r11, byte r12, int r13) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            if (r13 != 0) goto L_0x013f
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0018
            if (r11 != 0) goto L_0x0010
            k.h0.i.f$f r10 = (k.h0.i.f.C0197f) r10
            java.util.Objects.requireNonNull(r10)
            return
        L_0x0010:
            java.lang.String r10 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            k.h0.i.d.c(r10, r11)
            throw r0
        L_0x0018:
            int r12 = r11 % 6
            if (r12 != 0) goto L_0x0131
            k.h0.i.s r12 = new k.h0.i.s
            r12.<init>()
            r2 = 0
        L_0x0022:
            if (r2 >= r11) goto L_0x007a
            l.g r3 = r9.b
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            l.g r4 = r9.b
            int r4 = r4.readInt()
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L_0x0067
            r5 = 3
            if (r3 == r5) goto L_0x0065
            if (r3 == r6) goto L_0x0059
            r5 = 5
            if (r3 == r5) goto L_0x0041
            goto L_0x0074
        L_0x0041:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L_0x004b
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L_0x004b
            goto L_0x0074
        L_0x004b:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r11[r1] = r12
            k.h0.i.d.c(r10, r11)
            throw r0
        L_0x0059:
            r3 = 7
            if (r4 < 0) goto L_0x005d
            goto L_0x0074
        L_0x005d:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            k.h0.i.d.c(r10, r11)
            throw r0
        L_0x0065:
            r3 = 4
            goto L_0x0074
        L_0x0067:
            if (r4 == 0) goto L_0x0074
            if (r4 != r13) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            k.h0.i.d.c(r10, r11)
            throw r0
        L_0x0074:
            r12.b(r3, r4)
            int r2 = r2 + 6
            goto L_0x0022
        L_0x007a:
            k.h0.i.f$f r10 = (k.h0.i.f.C0197f) r10
            k.h0.i.f r2 = k.h0.i.f.this
            monitor-enter(r2)
            k.h0.i.f r11 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            k.h0.i.s r11 = r11.p     // Catch:{ all -> 0x012e }
            int r11 = r11.a()     // Catch:{ all -> 0x012e }
            k.h0.i.f r3 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            k.h0.i.s r3 = r3.p     // Catch:{ all -> 0x012e }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x012e }
            r4 = 0
        L_0x008f:
            r5 = 10
            if (r4 >= r5) goto L_0x00aa
            int r5 = r13 << r4
            int r6 = r12.a     // Catch:{ all -> 0x012e }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x009c
            r5 = 1
            goto L_0x009d
        L_0x009c:
            r5 = 0
        L_0x009d:
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            int[] r5 = r12.b     // Catch:{ all -> 0x012e }
            r5 = r5[r4]     // Catch:{ all -> 0x012e }
            r3.b(r4, r5)     // Catch:{ all -> 0x012e }
        L_0x00a7:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00aa:
            k.h0.i.f r3 = k.h0.i.f.this     // Catch:{ RejectedExecutionException -> 0x00be }
            java.util.concurrent.ScheduledExecutorService r4 = r3.f4825i     // Catch:{ RejectedExecutionException -> 0x00be }
            k.h0.i.m r5 = new k.h0.i.m     // Catch:{ RejectedExecutionException -> 0x00be }
            java.lang.String r6 = "OkHttp %s ACK Settings"
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ RejectedExecutionException -> 0x00be }
            java.lang.String r3 = r3.f4821e     // Catch:{ RejectedExecutionException -> 0x00be }
            r7[r1] = r3     // Catch:{ RejectedExecutionException -> 0x00be }
            r5.<init>(r10, r6, r7, r12)     // Catch:{ RejectedExecutionException -> 0x00be }
            r4.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00be }
        L_0x00be:
            k.h0.i.f r12 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            k.h0.i.s r12 = r12.p     // Catch:{ all -> 0x012e }
            int r12 = r12.a()     // Catch:{ all -> 0x012e }
            r3 = -1
            r4 = 0
            if (r12 == r3) goto L_0x00f8
            if (r12 == r11) goto L_0x00f8
            int r12 = r12 - r11
            long r11 = (long) r12     // Catch:{ all -> 0x012e }
            k.h0.i.f r3 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            boolean r6 = r3.q     // Catch:{ all -> 0x012e }
            if (r6 != 0) goto L_0x00d7
            r3.q = r13     // Catch:{ all -> 0x012e }
        L_0x00d7:
            java.util.Map<java.lang.Integer, k.h0.i.o> r3 = r3.f4820d     // Catch:{ all -> 0x012e }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x012e }
            if (r3 != 0) goto L_0x00f9
            k.h0.i.f r0 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            java.util.Map<java.lang.Integer, k.h0.i.o> r0 = r0.f4820d     // Catch:{ all -> 0x012e }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x012e }
            k.h0.i.f r3 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            java.util.Map<java.lang.Integer, k.h0.i.o> r3 = r3.f4820d     // Catch:{ all -> 0x012e }
            int r3 = r3.size()     // Catch:{ all -> 0x012e }
            k.h0.i.o[] r3 = new k.h0.i.o[r3]     // Catch:{ all -> 0x012e }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ all -> 0x012e }
            k.h0.i.o[] r0 = (k.h0.i.o[]) r0     // Catch:{ all -> 0x012e }
            goto L_0x00f9
        L_0x00f8:
            r11 = r4
        L_0x00f9:
            java.util.concurrent.ExecutorService r3 = k.h0.i.f.v     // Catch:{ all -> 0x012e }
            k.h0.i.l r6 = new k.h0.i.l     // Catch:{ all -> 0x012e }
            java.lang.String r7 = "OkHttp %s settings"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x012e }
            k.h0.i.f r8 = k.h0.i.f.this     // Catch:{ all -> 0x012e }
            java.lang.String r8 = r8.f4821e     // Catch:{ all -> 0x012e }
            r13[r1] = r8     // Catch:{ all -> 0x012e }
            r6.<init>(r10, r7, r13)     // Catch:{ all -> 0x012e }
            r3.execute(r6)     // Catch:{ all -> 0x012e }
            monitor-exit(r2)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x012d
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x012d
            int r10 = r0.length
        L_0x0115:
            if (r1 >= r10) goto L_0x012d
            r13 = r0[r1]
            monitor-enter(r13)
            long r2 = r13.b     // Catch:{ all -> 0x012a }
            long r2 = r2 + r11
            r13.b = r2     // Catch:{ all -> 0x012a }
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0126
            r13.notifyAll()     // Catch:{ all -> 0x012a }
        L_0x0126:
            monitor-exit(r13)     // Catch:{ all -> 0x012a }
            int r1 = r1 + 1
            goto L_0x0115
        L_0x012a:
            r10 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x012a }
            throw r10
        L_0x012d:
            return
        L_0x012e:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x012e }
            throw r10
        L_0x0131:
            java.lang.String r10 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.lang.Object[] r12 = new java.lang.Object[r13]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r1] = r11
            k.h0.i.d.c(r10, r12)
            throw r0
        L_0x013f:
            java.lang.String r10 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            k.h0.i.d.c(r10, r11)
            goto L_0x0148
        L_0x0147:
            throw r0
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.n.q(k.h0.i.n$b, int, byte, int):void");
    }

    public final void s(b bVar, int i2, int i3) throws IOException {
        if (i2 == 4) {
            long readInt = ((long) this.b.readInt()) & 2147483647L;
            if (readInt != 0) {
                f.C0197f fVar = (f.C0197f) bVar;
                f fVar2 = f.this;
                if (i3 == 0) {
                    synchronized (fVar2) {
                        f fVar3 = f.this;
                        fVar3.n += readInt;
                        fVar3.notifyAll();
                    }
                    return;
                }
                o d2 = fVar2.d(i3);
                if (d2 != null) {
                    synchronized (d2) {
                        d2.b += readInt;
                        if (readInt > 0) {
                            d2.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            d.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        d.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        throw null;
    }
}
