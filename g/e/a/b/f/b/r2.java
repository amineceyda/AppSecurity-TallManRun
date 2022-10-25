package g.e.a.b.f.b;

public final class r2 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3319g = new Object();
    public final String a;
    public final q2 b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3320d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3321e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f3322f = null;

    public /* synthetic */ r2(String str, Object obj, Object obj2, q2 q2Var) {
        this.a = str;
        this.c = obj;
        this.f3320d = obj2;
        this.b = q2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0044 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3321e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            g.e.a.b.f.b.b r4 = g.e.a.b.b.h.e.c
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.c
            return r4
        L_0x000e:
            java.lang.Object r4 = f3319g
            monitor-enter(r4)
            boolean r0 = g.e.a.b.f.b.b.a()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f3322f     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.c     // Catch:{ all -> 0x0069 }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f3322f     // Catch:{ all -> 0x0069 }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x0069 }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x0069 }
            java.util.List r4 = g.e.a.b.f.b.s2.a     // Catch:{ SecurityException -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0056 }
        L_0x0029:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0056 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0056 }
            g.e.a.b.f.b.r2 r0 = (g.e.a.b.f.b.r2) r0     // Catch:{ SecurityException -> 0x0056 }
            boolean r1 = g.e.a.b.f.b.b.a()     // Catch:{ SecurityException -> 0x0056 }
            if (r1 != 0) goto L_0x004e
            r1 = 0
            g.e.a.b.f.b.q2 r2 = r0.b     // Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r1 = r2.c()     // Catch:{ IllegalStateException -> 0x0044 }
        L_0x0044:
            java.lang.Object r2 = f3319g     // Catch:{ SecurityException -> 0x0056 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0056 }
            r0.f3322f = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            goto L_0x0029
        L_0x004b:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0056 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0056 }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x0056:
        L_0x0057:
            g.e.a.b.f.b.q2 r4 = r3.b
            if (r4 != 0) goto L_0x005e
            java.lang.Object r4 = r3.c
            return r4
        L_0x005e:
            java.lang.Object r4 = r4.c()     // Catch:{ SecurityException -> 0x0066, IllegalStateException -> 0x0063 }
            return r4
        L_0x0063:
            java.lang.Object r4 = r3.c
            return r4
        L_0x0066:
            java.lang.Object r4 = r3.c
            return r4
        L_0x0069:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x006c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006f:
            throw r4
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.r2.a(java.lang.Object):java.lang.Object");
    }
}
