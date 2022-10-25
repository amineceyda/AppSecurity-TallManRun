package g.e.b.r;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ e b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a(e eVar, boolean z) {
        this.b = eVar;
        this.c = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    public final void run() {
        /*
            r13 = this;
            g.e.b.r.e r0 = r13.b
            boolean r1 = r13.c
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r2 = g.e.b.r.e.f3728m
            monitor-enter(r2)
            g.e.b.h r3 = r0.a     // Catch:{ all -> 0x0109 }
            r3.a()     // Catch:{ all -> 0x0109 }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = "generatefid.lock"
            g.e.b.r.d r3 = g.e.b.r.d.a(r3, r4)     // Catch:{ all -> 0x0109 }
            g.e.b.r.l.c r4 = r0.c     // Catch:{ all -> 0x0102 }
            g.e.b.r.l.d r4 = r4.c()     // Catch:{ all -> 0x0102 }
            if (r3 == 0) goto L_0x0022
            r3.b()     // Catch:{ all -> 0x0109 }
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            boolean r3 = r4.h()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0069
            g.e.b.r.l.c$a r3 = r4.f()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            g.e.b.r.l.c$a r7 = g.e.b.r.l.c.a.f3748d     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            if (r3 != r7) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            goto L_0x0069
        L_0x0039:
            if (r1 != 0) goto L_0x0064
            g.e.b.r.j r1 = r0.f3729d     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            java.util.Objects.requireNonNull(r1)     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            java.lang.String r3 = r4.a()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            if (r3 == 0) goto L_0x004b
            goto L_0x005f
        L_0x004b:
            long r7 = r4.g()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            long r9 = r4.b()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            long r9 = r9 + r7
            long r7 = r1.b()     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            long r11 = g.e.b.r.j.b     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            long r7 = r7 + r11
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0061
        L_0x005f:
            r1 = 1
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            if (r1 == 0) goto L_0x0101
        L_0x0064:
            g.e.b.r.l.d r1 = r0.a(r4)     // Catch:{ FirebaseInstallationsException -> 0x00fd }
            goto L_0x006d
        L_0x0069:
            g.e.b.r.l.d r1 = r0.h(r4)     // Catch:{ FirebaseInstallationsException -> 0x00fd }
        L_0x006d:
            monitor-enter(r2)
            g.e.b.h r3 = r0.a     // Catch:{ all -> 0x00fa }
            r3.a()     // Catch:{ all -> 0x00fa }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x00fa }
            java.lang.String r7 = "generatefid.lock"
            g.e.b.r.d r3 = g.e.b.r.d.a(r3, r7)     // Catch:{ all -> 0x00fa }
            g.e.b.r.l.c r7 = r0.c     // Catch:{ all -> 0x00f3 }
            r7.b(r1)     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x0085
            r3.b()     // Catch:{ all -> 0x00fa }
        L_0x0085:
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            monitor-enter(r0)
            java.util.Set<g.e.b.r.k.a> r2 = r0.f3736k     // Catch:{ all -> 0x00f0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = r4.c()     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = r1.c()     // Catch:{ all -> 0x00f0 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00f0 }
            if (r2 != 0) goto L_0x00b7
            java.util.Set<g.e.b.r.k.a> r2 = r0.f3736k     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x00a3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f0 }
            g.e.b.r.k.a r3 = (g.e.b.r.k.a) r3     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = r1.c()     // Catch:{ all -> 0x00f0 }
            r3.a(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00a3
        L_0x00b7:
            monitor-exit(r0)
            g.e.b.r.l.c$a r2 = r1.f()
            g.e.b.r.l.c$a r3 = g.e.b.r.l.c.a.f3749e
            if (r2 != r3) goto L_0x00c1
            r5 = 1
        L_0x00c1:
            if (r5 == 0) goto L_0x00d0
            r2 = r1
            g.e.b.r.l.a r2 = (g.e.b.r.l.a) r2
            java.lang.String r2 = r2.b
            monitor-enter(r0)
            r0.f3735j = r2     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)
            goto L_0x00d0
        L_0x00cd:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d0:
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x00de
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r2 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r1.<init>(r2)
            goto L_0x00fe
        L_0x00de:
            boolean r2 = r1.i()
            if (r2 == 0) goto L_0x00ec
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            goto L_0x00fe
        L_0x00ec:
            r0.j(r1)
            goto L_0x0101
        L_0x00f0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f3:
            r0 = move-exception
            if (r3 == 0) goto L_0x00f9
            r3.b()     // Catch:{ all -> 0x00fa }
        L_0x00f9:
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            throw r0
        L_0x00fd:
            r1 = move-exception
        L_0x00fe:
            r0.i(r1)
        L_0x0101:
            return
        L_0x0102:
            r0 = move-exception
            if (r3 == 0) goto L_0x0108
            r3.b()     // Catch:{ all -> 0x0109 }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x010c:
            throw r0
        L_0x010d:
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.r.a.run():void");
    }
}
