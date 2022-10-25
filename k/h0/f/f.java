package k.h0.f;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import k.d;
import k.f0;
import k.h;
import k.h0.f.e;
import k.h0.g.c;
import k.m;
import k.n;
import k.r;
import k.u;

public final class f {
    public final k.a a;
    public e.a b;
    public f0 c;

    /* renamed from: d  reason: collision with root package name */
    public final h f4752d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4753e;

    /* renamed from: f  reason: collision with root package name */
    public final n f4754f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4755g;

    /* renamed from: h  reason: collision with root package name */
    public final e f4756h;

    /* renamed from: i  reason: collision with root package name */
    public int f4757i;

    /* renamed from: j  reason: collision with root package name */
    public c f4758j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4759k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4760l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4761m;
    public c n;

    public static final class a extends WeakReference<f> {
        public final Object a;

        public a(f fVar, Object obj) {
            super(fVar);
            this.a = obj;
        }
    }

    public f(h hVar, k.a aVar, d dVar, n nVar, Object obj) {
        this.f4752d = hVar;
        this.a = aVar;
        this.f4753e = dVar;
        this.f4754f = nVar;
        Objects.requireNonNull((u.a) k.h0.a.a);
        this.f4756h = new e(aVar, hVar.f4724e, dVar, nVar);
        this.f4755g = obj;
    }

    public void a(c cVar, boolean z) {
        if (this.f4758j == null) {
            this.f4758j = cVar;
            this.f4759k = z;
            cVar.n.add(new a(this, this.f4755g));
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized c b() {
        return this.f4758j;
    }

    public final Socket c(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.n = null;
        }
        boolean z4 = true;
        if (z2) {
            this.f4760l = true;
        }
        c cVar = this.f4758j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f4744k = true;
        }
        if (this.n != null) {
            return null;
        }
        if (!this.f4760l && !cVar.f4744k) {
            return null;
        }
        int size = cVar.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.n.get(i2).get() == this) {
                cVar.n.remove(i2);
                if (this.f4758j.n.isEmpty()) {
                    this.f4758j.o = System.nanoTime();
                    k.h0.a aVar = k.h0.a.a;
                    h hVar = this.f4752d;
                    c cVar2 = this.f4758j;
                    Objects.requireNonNull((u.a) aVar);
                    Objects.requireNonNull(hVar);
                    if (cVar2.f4744k || hVar.a == 0) {
                        hVar.f4723d.remove(cVar2);
                    } else {
                        hVar.notifyAll();
                        z4 = false;
                    }
                    if (z4) {
                        socket = this.f4758j.f4738e;
                        this.f4758j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f4758j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public final c d(int i2, int i3, int i4, int i5, boolean z) throws IOException {
        c cVar;
        f0 f0Var;
        Socket c2;
        c cVar2;
        boolean z2;
        boolean z3;
        Socket socket;
        e.a aVar;
        String str;
        int i6;
        boolean contains;
        synchronized (this.f4752d) {
            if (this.f4760l) {
                throw new IllegalStateException("released");
            } else if (this.n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f4761m) {
                cVar = this.f4758j;
                f0Var = null;
                c2 = (cVar == null || !cVar.f4744k) ? null : c(false, false, true);
                c cVar3 = this.f4758j;
                if (cVar3 != null) {
                    cVar = null;
                } else {
                    cVar3 = null;
                }
                if (!this.f4759k) {
                    cVar = null;
                }
                if (cVar3 == null) {
                    k.h0.a.a.c(this.f4752d, this.a, this, (f0) null);
                    cVar2 = this.f4758j;
                    if (cVar2 != null) {
                        z2 = true;
                    } else {
                        f0Var = this.c;
                    }
                }
                cVar2 = cVar3;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        k.h0.c.g(c2);
        if (cVar != null) {
            Objects.requireNonNull(this.f4754f);
        }
        if (z2) {
            Objects.requireNonNull(this.f4754f);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (f0Var != null || ((aVar = this.b) != null && aVar.a())) {
            z3 = false;
        } else {
            e eVar = this.f4756h;
            if (eVar.b()) {
                ArrayList arrayList = new ArrayList();
                while (eVar.c()) {
                    if (eVar.c()) {
                        List<Proxy> list = eVar.f4748e;
                        int i7 = eVar.f4749f;
                        eVar.f4749f = i7 + 1;
                        Proxy proxy = list.get(i7);
                        eVar.f4750g = new ArrayList();
                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                            r rVar = eVar.a.a;
                            str = rVar.f4910d;
                            i6 = rVar.f4911e;
                        } else {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                                i6 = inetSocketAddress.getPort();
                            } else {
                                StringBuilder i8 = g.a.a.a.a.i("Proxy.address() is not an InetSocketAddress: ");
                                i8.append(address.getClass());
                                throw new IllegalArgumentException(i8.toString());
                            }
                        }
                        if (i6 >= 1 && i6 <= 65535) {
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                eVar.f4750g.add(InetSocketAddress.createUnresolved(str, i6));
                            } else {
                                Objects.requireNonNull(eVar.f4747d);
                                Objects.requireNonNull((m.a) eVar.a.b);
                                if (str != null) {
                                    try {
                                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                                        if (!asList.isEmpty()) {
                                            Objects.requireNonNull(eVar.f4747d);
                                            int size = asList.size();
                                            for (int i9 = 0; i9 < size; i9++) {
                                                eVar.f4750g.add(new InetSocketAddress((InetAddress) asList.get(i9), i6));
                                            }
                                        } else {
                                            throw new UnknownHostException(eVar.a.b + " returned no addresses for " + str);
                                        }
                                    } catch (NullPointerException e2) {
                                        UnknownHostException unknownHostException = new UnknownHostException(g.a.a.a.a.w("Broken system behaviour for dns lookup of ", str));
                                        unknownHostException.initCause(e2);
                                        throw unknownHostException;
                                    }
                                } else {
                                    throw new UnknownHostException("hostname == null");
                                }
                            }
                            int size2 = eVar.f4750g.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                f0 f0Var2 = new f0(eVar.a, proxy, eVar.f4750g.get(i10));
                                d dVar = eVar.b;
                                synchronized (dVar) {
                                    contains = dVar.a.contains(f0Var2);
                                }
                                if (contains) {
                                    eVar.f4751h.add(f0Var2);
                                } else {
                                    arrayList.add(f0Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        } else {
                            throw new SocketException("No route to " + str + Constants.KEY_INDEX_FILE_SEPARATOR + i6 + "; port is out of range");
                        }
                    } else {
                        StringBuilder i11 = g.a.a.a.a.i("No route to ");
                        i11.append(eVar.a.a.f4910d);
                        i11.append("; exhausted proxy configurations: ");
                        i11.append(eVar.f4748e);
                        throw new SocketException(i11.toString());
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(eVar.f4751h);
                    eVar.f4751h.clear();
                }
                this.b = new e.a(arrayList);
                z3 = true;
            } else {
                throw new NoSuchElementException();
            }
        }
        synchronized (this.f4752d) {
            if (!this.f4761m) {
                if (z3) {
                    e.a aVar2 = this.b;
                    Objects.requireNonNull(aVar2);
                    ArrayList arrayList2 = new ArrayList(aVar2.a);
                    int size3 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size3) {
                            break;
                        }
                        f0 f0Var3 = (f0) arrayList2.get(i12);
                        k.h0.a.a.c(this.f4752d, this.a, this, f0Var3);
                        c cVar4 = this.f4758j;
                        if (cVar4 != null) {
                            this.c = f0Var3;
                            z2 = true;
                            cVar2 = cVar4;
                            break;
                        }
                        i12++;
                    }
                }
                if (!z2) {
                    if (f0Var == null) {
                        e.a aVar3 = this.b;
                        if (aVar3.a()) {
                            List<f0> list2 = aVar3.a;
                            int i13 = aVar3.b;
                            aVar3.b = i13 + 1;
                            f0Var = list2.get(i13);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    this.c = f0Var;
                    this.f4757i = 0;
                    cVar2 = new c(this.f4752d, f0Var);
                    a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            cVar2.c(i2, i3, i4, i5, z, this.f4753e, this.f4754f);
            k.h0.a aVar4 = k.h0.a.a;
            h hVar = this.f4752d;
            Objects.requireNonNull((u.a) aVar4);
            hVar.f4724e.a(cVar2.c);
            synchronized (this.f4752d) {
                this.f4759k = true;
                k.h0.a aVar5 = k.h0.a.a;
                h hVar2 = this.f4752d;
                Objects.requireNonNull((u.a) aVar5);
                if (!hVar2.f4725f) {
                    hVar2.f4725f = true;
                    h.f4722g.execute(hVar2.c);
                }
                hVar2.f4723d.add(cVar2);
                if (cVar2.h()) {
                    socket = k.h0.a.a.b(this.f4752d, this.a, this);
                    cVar2 = this.f4758j;
                } else {
                    socket = null;
                }
            }
            k.h0.c.g(socket);
        }
        Objects.requireNonNull(this.f4754f);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0.f4738e.isInputShutdown() != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0.f4738e.isOutputShutdown() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r1 = r0.f4741h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = r1.f4824h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r2 = !r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r12 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1 = r0.f4738e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.f4738e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (r0.f4742i.D() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.f4738e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0051, code lost:
        r0.f4738e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        r0.f4738e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0.f4738e.isClosed() != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[LOOP:0: B:0:0x0000->B:40:0x0061, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0065 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k.h0.f.c e(int r7, int r8, int r9, int r10, boolean r11, boolean r12) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            k.h0.f.c r0 = r6.d(r7, r8, r9, r10, r11)
            k.h r1 = r6.f4752d
            monitor-enter(r1)
            int r2 = r0.f4745l     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            java.net.Socket r1 = r0.f4738e
            boolean r1 = r1.isClosed()
            r2 = 0
            if (r1 != 0) goto L_0x005f
            java.net.Socket r1 = r0.f4738e
            boolean r1 = r1.isInputShutdown()
            if (r1 != 0) goto L_0x005f
            java.net.Socket r1 = r0.f4738e
            boolean r1 = r1.isOutputShutdown()
            if (r1 == 0) goto L_0x0028
            goto L_0x005f
        L_0x0028:
            k.h0.i.f r1 = r0.f4741h
            r3 = 1
            if (r1 == 0) goto L_0x0036
            monitor-enter(r1)
            boolean r2 = r1.f4824h     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)
            r2 = r2 ^ r3
            goto L_0x005f
        L_0x0033:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x0036:
            if (r12 == 0) goto L_0x005e
            java.net.Socket r1 = r0.f4738e     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            int r1 = r1.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            java.net.Socket r4 = r0.f4738e     // Catch:{ all -> 0x0057 }
            r4.setSoTimeout(r3)     // Catch:{ all -> 0x0057 }
            l.g r4 = r0.f4742i     // Catch:{ all -> 0x0057 }
            boolean r4 = r4.D()     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0051
            java.net.Socket r4 = r0.f4738e     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            r4.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            goto L_0x005f
        L_0x0051:
            java.net.Socket r4 = r0.f4738e     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            r4.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            goto L_0x005e
        L_0x0057:
            r4 = move-exception
            java.net.Socket r5 = r0.f4738e     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            r5.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
            throw r4     // Catch:{ SocketTimeoutException -> 0x005e, IOException -> 0x005f }
        L_0x005e:
            r2 = 1
        L_0x005f:
            if (r2 != 0) goto L_0x0065
            r6.f()
            goto L_0x0000
        L_0x0065:
            return r0
        L_0x0066:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r7
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.f.e(int, int, int, int, boolean, boolean):k.h0.f.c");
    }

    public void f() {
        c cVar;
        Socket c2;
        synchronized (this.f4752d) {
            cVar = this.f4758j;
            c2 = c(true, false, false);
            if (this.f4758j != null) {
                cVar = null;
            }
        }
        k.h0.c.g(c2);
        if (cVar != null) {
            Objects.requireNonNull(this.f4754f);
        }
    }

    public void g() {
        c cVar;
        Socket c2;
        synchronized (this.f4752d) {
            cVar = this.f4758j;
            c2 = c(false, true, false);
            if (this.f4758j != null) {
                cVar = null;
            }
        }
        k.h0.c.g(c2);
        if (cVar != null) {
            k.h0.a.a.d(this.f4753e, (IOException) null);
            Objects.requireNonNull(this.f4754f);
            Objects.requireNonNull(this.f4754f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != k.h0.i.a.f4790g) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(java.io.IOException r7) {
        /*
            r6 = this;
            k.h r0 = r6.f4752d
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0060 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch:{ all -> 0x0060 }
            k.h0.i.a r7 = r7.errorCode     // Catch:{ all -> 0x0060 }
            k.h0.i.a r1 = k.h0.i.a.REFUSED_STREAM     // Catch:{ all -> 0x0060 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f4757i     // Catch:{ all -> 0x0060 }
            int r7 = r7 + r4
            r6.f4757i = r7     // Catch:{ all -> 0x0060 }
            if (r7 <= r4) goto L_0x0043
            goto L_0x001e
        L_0x001a:
            k.h0.i.a r1 = k.h0.i.a.f4790g     // Catch:{ all -> 0x0060 }
            if (r7 == r1) goto L_0x0043
        L_0x001e:
            r6.c = r3     // Catch:{ all -> 0x0060 }
            goto L_0x0041
        L_0x0021:
            k.h0.f.c r1 = r6.f4758j     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.h()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0043
        L_0x002f:
            k.h0.f.c r1 = r6.f4758j     // Catch:{ all -> 0x0060 }
            int r1 = r1.f4745l     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0041
            k.f0 r1 = r6.c     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            k.h0.f.e r5 = r6.f4756h     // Catch:{ all -> 0x0060 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0060 }
            goto L_0x001e
        L_0x0041:
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            k.h0.f.c r1 = r6.f4758j     // Catch:{ all -> 0x0060 }
            java.net.Socket r7 = r6.c(r7, r2, r4)     // Catch:{ all -> 0x0060 }
            k.h0.f.c r2 = r6.f4758j     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0054
            boolean r2 = r6.f4759k     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            k.h0.c.g(r7)
            if (r3 == 0) goto L_0x005f
            k.n r7 = r6.f4754f
            java.util.Objects.requireNonNull(r7)
        L_0x005f:
            return
        L_0x0060:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0063:
            throw r7
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.f.h(java.io.IOException):void");
    }

    public void i(boolean z, c cVar, long j2, IOException iOException) {
        c cVar2;
        Socket c2;
        boolean z2;
        Objects.requireNonNull(this.f4754f);
        synchronized (this.f4752d) {
            if (cVar != null) {
                if (cVar == this.n) {
                    if (!z) {
                        this.f4758j.f4745l++;
                    }
                    cVar2 = this.f4758j;
                    c2 = c(z, false, true);
                    if (this.f4758j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f4760l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + cVar);
        }
        k.h0.c.g(c2);
        if (cVar2 != null) {
            Objects.requireNonNull(this.f4754f);
        }
        if (iOException != null) {
            k.h0.a.a.d(this.f4753e, iOException);
            Objects.requireNonNull(this.f4754f);
        } else if (z2) {
            k.h0.a.a.d(this.f4753e, (IOException) null);
            Objects.requireNonNull(this.f4754f);
        }
    }

    public String toString() {
        c b2 = b();
        return b2 != null ? b2.toString() : this.a.toString();
    }
}
