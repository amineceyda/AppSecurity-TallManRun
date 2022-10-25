package k;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;
import k.w;

public final class l {
    @Nullable
    public ExecutorService a;
    public final Deque<w.b> b = new ArrayDeque();
    public final Deque<w.b> c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final Deque<w> f4907d = new ArrayDeque();

    public final <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        boolean b2 = b();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean b() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<k.w$b> r1 = r15.b     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c3 }
            k.w$b r2 = (k.w.b) r2     // Catch:{ all -> 0x00c3 }
            java.util.Deque<k.w$b> r3 = r15.c     // Catch:{ all -> 0x00c3 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c3 }
            r4 = 64
            if (r3 < r4) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            int r3 = r15.c(r2)     // Catch:{ all -> 0x00c3 }
            r4 = 5
            if (r3 < r4) goto L_0x002b
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x00c3 }
            r0.add(r2)     // Catch:{ all -> 0x00c3 }
            java.util.Deque<k.w$b> r3 = r15.c     // Catch:{ all -> 0x00c3 }
            r3.add(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x000c
        L_0x0037:
            monitor-enter(r15)     // Catch:{ all -> 0x00c3 }
            java.util.Deque<k.w$b> r1 = r15.c     // Catch:{ all -> 0x00c0 }
            int r1 = r1.size()     // Catch:{ all -> 0x00c0 }
            java.util.Deque<k.w> r2 = r15.f4907d     // Catch:{ all -> 0x00c0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00c0 }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00c3 }
            r2 = 0
            if (r1 <= 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            monitor-exit(r15)     // Catch:{ all -> 0x00c3 }
            int r3 = r0.size()
            r4 = 0
        L_0x0052:
            if (r4 >= r3) goto L_0x00bf
            java.lang.Object r5 = r0.get(r4)
            k.w$b r5 = (k.w.b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch:{ all -> 0x00bc }
            if (r6 != 0) goto L_0x007d
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00bc }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00bc }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00bc }
            r13.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r7 = "OkHttp Dispatcher"
            byte[] r14 = k.h0.c.a     // Catch:{ all -> 0x00bc }
            k.h0.d r14 = new k.h0.d     // Catch:{ all -> 0x00bc }
            r14.<init>(r7, r2)     // Catch:{ all -> 0x00bc }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00bc }
            r15.a = r6     // Catch:{ all -> 0x00bc }
        L_0x007d:
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch:{ all -> 0x00bc }
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x0089 }
            goto L_0x00ad
        L_0x0087:
            r0 = move-exception
            goto L_0x00b0
        L_0x0089:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x0087 }
            r7.initCause(r6)     // Catch:{ all -> 0x0087 }
            k.w r6 = k.w.this     // Catch:{ all -> 0x0087 }
            k.n r6 = r6.f4950e     // Catch:{ all -> 0x0087 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0087 }
            k.e r6 = r5.c     // Catch:{ all -> 0x0087 }
            k.w r8 = k.w.this     // Catch:{ all -> 0x0087 }
            r6.onFailure(r8, r7)     // Catch:{ all -> 0x0087 }
            k.w r6 = k.w.this
            k.u r6 = r6.b
            k.l r6 = r6.b
            java.util.Deque<k.w$b> r7 = r6.c
            r6.a(r7, r5)
        L_0x00ad:
            int r4 = r4 + 1
            goto L_0x0052
        L_0x00b0:
            k.w r1 = k.w.this
            k.u r1 = r1.b
            k.l r1 = r1.b
            java.util.Deque<k.w$b> r2 = r1.c
            r1.a(r2, r5)
            throw r0
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00bf:
            return r1
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c7
        L_0x00c6:
            throw r0
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.b():boolean");
    }

    public final int c(w.b bVar) {
        int i2 = 0;
        for (w.b bVar2 : this.c) {
            w wVar = w.this;
            if (!wVar.f4952g && wVar.f4951f.a.f4910d.equals(w.this.f4951f.a.f4910d)) {
                i2++;
            }
        }
        return i2;
    }
}
