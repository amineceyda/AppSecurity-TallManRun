package g.i.b.f.k;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

public final class d {
    public volatile g.i.b.f.e a = g.i.b.f.e.PENDING;
    public Vector<g.i.b.f.c> b = new Vector<>();
    public Vector<g.i.b.f.c> c = new Vector<>();

    /* renamed from: d  reason: collision with root package name */
    public LinkedBlockingQueue<b> f4293d = new LinkedBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4294e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f4295f = 0;

    /* renamed from: g  reason: collision with root package name */
    public e f4296g;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x004c */
        static {
            /*
                g.i.b.f.k.d.b.values()
                r0 = 8
                int[] r1 = new int[r0]
                b = r1
                r2 = 0
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r1 = 2
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r4[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r4 = 3
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0017 }
                r5[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r5 = 4
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x001c }
                r6[r4] = r5     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r6 = 5
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0021 }
                r7[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r7 = 6
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0026 }
                r8[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                r8 = 7
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x002b }
                r9[r7] = r8     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x002f }
                r9[r8] = r0     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                g.i.b.f.e.values()
                int[] r0 = new int[r8]
                a = r0
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0048 }
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0050 }
                r0[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.d.a.<clinit>():void");
        }
    }

    public enum b {
        Inform_Pending,
        Inform_Started,
        Inform_Detected,
        Inform_Received,
        Inform_Paused,
        Inform_Failed,
        Inform_Succeed,
        Inform_Deleted
    }

    public final class c {
        public volatile long a = 0;
        public volatile LinkedList<a> b = new LinkedList<>();
        public Object c = new Object();

        public static class a {
            public int a = -1;
            public long b;
            public byte[] c;

            /* renamed from: d  reason: collision with root package name */
            public long f4304d;

            public a(int i2, long j2, byte[] bArr, long j3) {
                this.a = i2;
                this.b = j2;
                this.c = bArr;
                this.f4304d = j3;
            }
        }

        public final a a() {
            synchronized (this.c) {
                if (this.b.size() <= 0) {
                    return null;
                }
                a removeFirst = this.b.removeFirst();
                this.a -= removeFirst.f4304d;
                return removeFirst;
            }
        }
    }

    /* renamed from: g.i.b.f.k.d$d  reason: collision with other inner class name */
    public final class C0160d implements Runnable {
        public e b;
        public volatile boolean c = false;

        /* renamed from: d  reason: collision with root package name */
        public Object f4305d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Object f4306e = new Object();

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f4307f = false;

        public C0160d(e eVar) {
            g.i.b.e.h.b.f("halley-downloader-SaveService", "new BDSaveService...");
            this.b = eVar;
            new Thread(this, "HalleyDownload-SaveThread").start();
        }

        public final void run() {
            boolean z;
            while (true) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    z = this.b.e();
                } catch (Throwable th) {
                    g.i.b.e.h.b.b("halley-downloader-SaveService", th);
                    z = false;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (!z && elapsedRealtime2 > 0) {
                    long j2 = (long) 50;
                    if (elapsedRealtime2 < j2) {
                        int i2 = (int) (j2 - elapsedRealtime2);
                        try {
                            this.f4307f = true;
                            synchronized (this.f4306e) {
                                this.f4306e.wait((long) i2);
                            }
                        } catch (Exception e2) {
                            try {
                                e2.printStackTrace();
                            } catch (Throwable th2) {
                                this.f4307f = false;
                                throw th2;
                            }
                        }
                        this.f4307f = false;
                    }
                }
                synchronized (this.f4305d) {
                    if (!this.c) {
                        try {
                            g.i.b.e.h.b.c("halley-downloader-SaveService", "BDSaveService try wait...");
                            this.f4305d.wait();
                        } catch (InterruptedException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public interface e {
        boolean e();
    }

    public d(e eVar) {
        this.f4296g = eVar;
    }

    public final void a(g.i.b.f.c cVar) {
        if (cVar != null) {
            try {
                synchronized (this.b) {
                    if (!this.b.contains(cVar)) {
                        this.b.add(cVar);
                    }
                }
                synchronized (this.c) {
                    if (!this.c.contains(cVar)) {
                        this.c.add(cVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final synchronized void b(g.i.b.f.e eVar) {
        g.i.b.e.h.b.f("halley-downloader-StatusInformer", "updateTaskStatus:" + eVar.name());
        e(eVar);
    }

    public final void c(b bVar) {
        if (bVar != null) {
            if (bVar != b.Inform_Deleted) {
                g.i.b.e.c.f4130l.post(new c(this, bVar));
            }
            try {
                this.f4293d.put(bVar);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void d() {
        /*
            r10 = this;
            r0 = 1
            r10.f4294e = r0
        L_0x0003:
            r1 = 0
            r2 = 0
            java.util.concurrent.LinkedBlockingQueue<g.i.b.f.k.d$b> r3 = r10.f4293d     // Catch:{ InterruptedException -> 0x0186, all -> 0x0181 }
            java.lang.Object r3 = r3.take()     // Catch:{ InterruptedException -> 0x0186, all -> 0x0181 }
            g.i.b.f.k.d$b r3 = (g.i.b.f.k.d.b) r3     // Catch:{ InterruptedException -> 0x0186, all -> 0x0181 }
            int[] r1 = g.i.b.f.k.d.a.b     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            int r4 = r3.ordinal()     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            r1 = r1[r4]     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            switch(r1) {
                case 1: goto L_0x016f;
                case 2: goto L_0x0144;
                case 3: goto L_0x0119;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00b7;
                case 6: goto L_0x0088;
                case 7: goto L_0x001d;
                case 8: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0178
        L_0x001a:
            r1 = 1
            goto L_0x0179
        L_0x001d:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r6 = r10.b     // Catch:{ all -> 0x0085 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0085 }
        L_0x002a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0085 }
            g.i.b.f.c r7 = (g.i.b.f.c) r7     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x002a
            g.i.b.f.k.e r8 = r10.f4296g     // Catch:{ all -> 0x0085 }
            r7.onTaskCompletedSubloop(r8)     // Catch:{ all -> 0x0085 }
            goto L_0x002a
        L_0x003e:
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            long r4 = r6 - r4
            int r1 = (int) r4     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r10.f4295f = r1     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r1 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            long r4 = r4 - r6
            java.lang.String r1 = "halley-downloader-StatusInformer"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.lang.String r7 = "calcMd5 cost time:"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r6.append(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.lang.String r4 = ",file size:"
            r6.append(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            long r4 = r4.s()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r6.append(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.lang.String r4 = r6.toString()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.e.h.b.c(r1, r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r1 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r1.d(r4, r2)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            goto L_0x001a
        L_0x0085:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            throw r4     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
        L_0x0088:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r1.d(r4, r0)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r4 = r10.b     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b4 }
        L_0x009d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b4 }
            g.i.b.f.c r5 = (g.i.b.f.c) r5     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x009d
            g.i.b.f.k.e r6 = r10.f4296g     // Catch:{ all -> 0x00b4 }
            r5.onTaskFailedSubloop(r6)     // Catch:{ all -> 0x00b4 }
            goto L_0x009d
        L_0x00b1:
            monitor-exit(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x001a
        L_0x00b4:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b4 }
            throw r4     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
        L_0x00b7:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            r5 = 2
            r1.d(r4, r5)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
            java.util.Vector<g.i.b.f.c> r4 = r10.b     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x00cd:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r5 == 0) goto L_0x00e1
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00e4 }
            g.i.b.f.c r5 = (g.i.b.f.c) r5     // Catch:{ all -> 0x00e4 }
            if (r5 == 0) goto L_0x00cd
            g.i.b.f.k.e r6 = r10.f4296g     // Catch:{ all -> 0x00e4 }
            r5.onTaskPausedSubloop(r6)     // Catch:{ all -> 0x00e4 }
            goto L_0x00cd
        L_0x00e1:
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x001a
        L_0x00e4:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r4     // Catch:{ InterruptedException -> 0x00ea, all -> 0x00e7 }
        L_0x00e7:
            r1 = move-exception
            goto L_0x0193
        L_0x00ea:
            r1 = move-exception
            r4 = 1
            goto L_0x018b
        L_0x00ee:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r4 = r10.b     // Catch:{ all -> 0x0116 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0116 }
        L_0x0100:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0116 }
            if (r5 == 0) goto L_0x0114
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0116 }
            g.i.b.f.c r5 = (g.i.b.f.c) r5     // Catch:{ all -> 0x0116 }
            if (r5 == 0) goto L_0x0100
            g.i.b.f.k.e r6 = r10.f4296g     // Catch:{ all -> 0x0116 }
            r5.onTaskReceivedSubloop(r6)     // Catch:{ all -> 0x0116 }
            goto L_0x0100
        L_0x0114:
            monitor-exit(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0178
        L_0x0116:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0116 }
            throw r4     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
        L_0x0119:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r4 = r10.b     // Catch:{ all -> 0x0141 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0141 }
        L_0x012b:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x013f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0141 }
            g.i.b.f.c r5 = (g.i.b.f.c) r5     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x012b
            g.i.b.f.k.e r6 = r10.f4296g     // Catch:{ all -> 0x0141 }
            r5.onTaskDetectedSubloop(r6)     // Catch:{ all -> 0x0141 }
            goto L_0x012b
        L_0x013f:
            monitor-exit(r1)     // Catch:{ all -> 0x0141 }
            goto L_0x0178
        L_0x0141:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0141 }
            throw r4     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
        L_0x0144:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r1 = r10.b     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            java.util.Vector<g.i.b.f.c> r4 = r10.b     // Catch:{ all -> 0x016c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x016c }
        L_0x0156:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x016c }
            if (r5 == 0) goto L_0x016a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x016c }
            g.i.b.f.c r5 = (g.i.b.f.c) r5     // Catch:{ all -> 0x016c }
            if (r5 == 0) goto L_0x0156
            g.i.b.f.k.e r6 = r10.f4296g     // Catch:{ all -> 0x016c }
            r5.onTaskStartedSubloop(r6)     // Catch:{ all -> 0x016c }
            goto L_0x0156
        L_0x016a:
            monitor-exit(r1)     // Catch:{ all -> 0x016c }
            goto L_0x0178
        L_0x016c:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016c }
            throw r4     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
        L_0x016f:
            g.i.b.f.h.e r1 = g.i.b.f.h.e.b()     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            g.i.b.f.k.e r4 = r10.f4296g     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
            r1.c(r4)     // Catch:{ InterruptedException -> 0x017e, all -> 0x017c }
        L_0x0178:
            r1 = 0
        L_0x0179:
            if (r1 == 0) goto L_0x0003
            goto L_0x0195
        L_0x017c:
            r1 = move-exception
            goto L_0x0184
        L_0x017e:
            r1 = move-exception
            r4 = 0
            goto L_0x018b
        L_0x0181:
            r0 = move-exception
            r3 = r1
            r1 = r0
        L_0x0184:
            r0 = 0
            goto L_0x0193
        L_0x0186:
            r3 = move-exception
            r4 = 0
            r9 = r3
            r3 = r1
            r1 = r9
        L_0x018b:
            r1.printStackTrace()     // Catch:{ all -> 0x0191 }
            if (r4 == 0) goto L_0x0003
            goto L_0x0195
        L_0x0191:
            r1 = move-exception
            r0 = r4
        L_0x0193:
            if (r0 == 0) goto L_0x01a7
        L_0x0195:
            java.lang.String r0 = "halley-downloader-StatusInformer"
            java.lang.String r1 = "loopInform finish on command:"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.concat(r3)
            g.i.b.e.h.b.h(r0, r1)
            r10.f4294e = r2
            return
        L_0x01a7:
            goto L_0x01a9
        L_0x01a8:
            throw r1
        L_0x01a9:
            goto L_0x01a8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.d.d():void");
    }

    public final synchronized void e(g.i.b.f.e eVar) {
        if ((this.a != g.i.b.f.e.COMPLETE && this.a != g.i.b.f.e.FAILED && this.a != g.i.b.f.e.PAUSED && this.a != g.i.b.f.e.DELETED) || eVar == g.i.b.f.e.PENDING) {
            this.a = eVar;
            b bVar = null;
            switch (a.a[eVar.ordinal()]) {
                case 1:
                    bVar = b.Inform_Pending;
                    break;
                case 2:
                    bVar = b.Inform_Started;
                    break;
                case 3:
                    bVar = b.Inform_Received;
                    break;
                case 4:
                    bVar = b.Inform_Succeed;
                    break;
                case 5:
                    bVar = b.Inform_Failed;
                    break;
                case 6:
                    bVar = b.Inform_Paused;
                    break;
                case 7:
                    bVar = b.Inform_Deleted;
                    break;
            }
            c(bVar);
        }
    }
}
