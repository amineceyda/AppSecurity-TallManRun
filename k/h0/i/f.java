package k.h0.i;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.h0.i.n;
import l.g;

public final class f implements Closeable {
    public static final ExecutorService v;
    public final boolean b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Integer, o> f4820d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f4821e;

    /* renamed from: f  reason: collision with root package name */
    public int f4822f;

    /* renamed from: g  reason: collision with root package name */
    public int f4823g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4824h;

    /* renamed from: i  reason: collision with root package name */
    public final ScheduledExecutorService f4825i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f4826j;

    /* renamed from: k  reason: collision with root package name */
    public final r f4827k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4828l;

    /* renamed from: m  reason: collision with root package name */
    public long f4829m = 0;
    public long n;
    public s o = new s();
    public final s p;
    public boolean q;
    public final Socket r;
    public final p s;
    public final C0197f t;
    public final Set<Integer> u;

    public class a extends k.h0.b {
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f4830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, a aVar) {
            super(str, objArr);
            this.c = i2;
            this.f4830d = aVar;
        }

        public void a() {
            try {
                f fVar = f.this;
                fVar.s.k(this.c, this.f4830d);
            } catch (IOException unused) {
                f.a(f.this);
            }
        }
    }

    public class b extends k.h0.b {
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ long f4832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.c = i2;
            this.f4832d = j2;
        }

        public void a() {
            try {
                f.this.s.n(this.c, this.f4832d);
            } catch (IOException unused) {
                f.a(f.this);
            }
        }
    }

    public static class c {
        public Socket a;
        public String b;
        public g c;

        /* renamed from: d  reason: collision with root package name */
        public l.f f4834d;

        /* renamed from: e  reason: collision with root package name */
        public d f4835e = d.a;

        /* renamed from: f  reason: collision with root package name */
        public int f4836f;

        public c(boolean z) {
        }
    }

    public static abstract class d {
        public static final d a = new a();

        public class a extends d {
            public void b(o oVar) throws IOException {
                oVar.c(a.REFUSED_STREAM);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(o oVar) throws IOException;
    }

    public final class e extends k.h0.b {
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4837d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4838e;

        public e(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", f.this.f4821e, Integer.valueOf(i2), Integer.valueOf(i3));
            this.c = z;
            this.f4837d = i2;
            this.f4838e = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5 != false) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r7 = this;
                k.h0.i.f r0 = k.h0.i.f.this
                boolean r1 = r7.c
                int r2 = r7.f4837d
                int r3 = r7.f4838e
                java.util.Objects.requireNonNull(r0)
                k.h0.i.a r4 = k.h0.i.a.PROTOCOL_ERROR
                if (r1 != 0) goto L_0x001f
                monitor-enter(r0)
                boolean r5 = r0.f4828l     // Catch:{ all -> 0x001c }
                r6 = 1
                r0.f4828l = r6     // Catch:{ all -> 0x001c }
                monitor-exit(r0)     // Catch:{ all -> 0x001c }
                if (r5 == 0) goto L_0x001f
            L_0x0018:
                r0.b(r4, r4)     // Catch:{ IOException -> 0x0024 }
                goto L_0x0024
            L_0x001c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001c }
                throw r1
            L_0x001f:
                k.h0.i.p r5 = r0.s     // Catch:{ IOException -> 0x0018 }
                r5.j(r1, r2, r3)     // Catch:{ IOException -> 0x0018 }
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.i.f.e.a():void");
        }
    }

    /* renamed from: k.h0.i.f$f  reason: collision with other inner class name */
    public class C0197f extends k.h0.b implements n.b {
        public final n c;

        public C0197f(n nVar) {
            super("OkHttp %s", f.this.f4821e);
            this.c = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = k.h0.i.a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f4840d.b(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r4 = this;
                k.h0.i.a r0 = k.h0.i.a.INTERNAL_ERROR
                k.h0.i.n r1 = r4.c     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.d(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                k.h0.i.n r1 = r4.c     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.b(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                k.h0.i.a r1 = k.h0.i.a.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                k.h0.i.a r0 = k.h0.i.a.f4790g     // Catch:{ IOException -> 0x001f }
                k.h0.i.f r2 = k.h0.i.f.this     // Catch:{ IOException -> 0x0026 }
                r2.b(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                k.h0.i.a r0 = k.h0.i.a.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                k.h0.i.f r1 = k.h0.i.f.this     // Catch:{ IOException -> 0x0026 }
                r1.b(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                k.h0.i.n r0 = r4.c
                k.h0.c.f(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                k.h0.i.f r3 = k.h0.i.f.this     // Catch:{ IOException -> 0x0032 }
                r3.b(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                k.h0.i.n r0 = r4.c
                k.h0.c.f(r0)
                goto L_0x0039
            L_0x0038:
                throw r2
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.i.f.C0197f.a():void");
        }
    }

    static {
        Class<f> cls = f.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = k.h0.c.a;
        v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new k.h0.d("OkHttp Http2Connection", true));
    }

    public f(c cVar) {
        c cVar2 = cVar;
        s sVar = new s();
        this.p = sVar;
        this.q = false;
        this.u = new LinkedHashSet();
        this.f4827k = r.a;
        this.b = true;
        this.c = cVar2.f4835e;
        this.f4823g = 1;
        this.f4823g = 3;
        this.o.b(7, 16777216);
        String str = cVar2.b;
        this.f4821e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new k.h0.d(k.h0.c.n("OkHttp %s Writer", str), false));
        this.f4825i = scheduledThreadPoolExecutor;
        if (cVar2.f4836f != 0) {
            e eVar = new e(false, 0, 0);
            long j2 = (long) cVar2.f4836f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.f4826j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k.h0.d(k.h0.c.n("OkHttp %s Push Observer", str), true));
        sVar.b(7, 65535);
        sVar.b(5, 16384);
        this.n = (long) sVar.a();
        this.r = cVar2.a;
        this.s = new p(cVar2.f4834d, true);
        this.t = new C0197f(new n(cVar2.c, true));
    }

    public static void a(f fVar) {
        Objects.requireNonNull(fVar);
        try {
            a aVar = a.PROTOCOL_ERROR;
            fVar.b(aVar, aVar);
        } catch (IOException unused) {
        }
    }

    public void b(a aVar, a aVar2) throws IOException {
        o[] oVarArr = null;
        try {
            n(aVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f4820d.isEmpty()) {
                oVarArr = (o[]) this.f4820d.values().toArray(new o[this.f4820d.size()]);
                this.f4820d.clear();
            }
        }
        if (oVarArr != null) {
            for (o c2 : oVarArr) {
                try {
                    c2.c(aVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.s.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.r.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f4825i.shutdown();
        this.f4826j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void close() throws IOException {
        b(a.NO_ERROR, a.f4790g);
    }

    public synchronized o d(int i2) {
        return this.f4820d.get(Integer.valueOf(i2));
    }

    public synchronized int f() {
        int i2;
        s sVar = this.p;
        i2 = Integer.MAX_VALUE;
        if ((sVar.a & 16) != 0) {
            i2 = sVar.b[4];
        }
        return i2;
    }

    public void flush() throws IOException {
        this.s.flush();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void g(k.h0.b r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0011 }
            boolean r0 = r1.f4824h     // Catch:{ all -> 0x000e }
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000c
            java.util.concurrent.ExecutorService r0 = r1.f4826j     // Catch:{ all -> 0x0011 }
            r0.execute(r2)     // Catch:{ all -> 0x0011 }
        L_0x000c:
            monitor-exit(r1)
            return
        L_0x000e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.f.g(k.h0.b):void");
    }

    public boolean j(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized o k(int i2) {
        o remove;
        remove = this.f4820d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public void n(a aVar) throws IOException {
        synchronized (this.s) {
            synchronized (this) {
                if (!this.f4824h) {
                    this.f4824h = true;
                    int i2 = this.f4822f;
                    this.s.f(i2, aVar, k.h0.c.a);
                }
            }
        }
    }

    public synchronized void o(long j2) {
        long j3 = this.f4829m + j2;
        this.f4829m = j3;
        if (j3 >= ((long) (this.o.a() / 2))) {
            t(0, this.f4829m);
            this.f4829m = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.s.f4878e);
        r6 = (long) r3;
        r8.n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r9, boolean r10, l.e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            k.h0.i.p r12 = r8.s
            r12.b(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.n     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, k.h0.i.o> r3 = r8.f4820d     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0054 }
            int r4 = (int) r3     // Catch:{ all -> 0x0054 }
            k.h0.i.p r3 = r8.s     // Catch:{ all -> 0x0054 }
            int r3 = r3.f4878e     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0054 }
            long r4 = r8.n     // Catch:{ all -> 0x0054 }
            long r6 = (long) r3     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r8.n = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            long r12 = r12 - r6
            k.h0.i.p r4 = r8.s
            if (r10 == 0) goto L_0x004f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r4.b(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0054:
            r9 = move-exception
            goto L_0x0063
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            r9.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r9.<init>()     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.f.q(int, boolean, l.e, long):void");
    }

    public void s(int i2, a aVar) {
        try {
            this.f4825i.execute(new a("OkHttp %s stream %d", new Object[]{this.f4821e, Integer.valueOf(i2)}, i2, aVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void t(int i2, long j2) {
        try {
            this.f4825i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f4821e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
