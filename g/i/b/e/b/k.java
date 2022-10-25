package g.i.b.e.b;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

public class k {
    public static volatile k c;
    public Timer a = new Timer(g.h.a.a.l("ConnectionTimer"), true);
    public Map<Runnable, TimerTask> b = new ConcurrentHashMap();

    public class a extends TimerTask {
        public final /* synthetic */ Runnable b;

        public a(k kVar, Runnable runnable) {
            this.b = runnable;
        }

        public final void run() {
            this.b.run();
        }
    }

    public static k a() {
        if (c == null) {
            synchronized (k.class) {
                if (c == null) {
                    c = new k();
                }
            }
        }
        return c;
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
    public final void b(java.lang.Runnable r3, long r4) {
        /*
            r2 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.Runnable, java.util.TimerTask> r0 = r2.b     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0028 }
            java.util.TimerTask r0 = (java.util.TimerTask) r0     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0014
            java.util.Map<java.lang.Runnable, java.util.TimerTask> r1 = r2.b     // Catch:{ all -> 0x0028 }
            r1.remove(r3)     // Catch:{ all -> 0x0028 }
            r0.cancel()     // Catch:{ all -> 0x0028 }
        L_0x0014:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            g.i.b.e.b.k$a r0 = new g.i.b.e.b.k$a     // Catch:{ all -> 0x0026 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0026 }
            java.util.Timer r1 = r2.a     // Catch:{ all -> 0x0026 }
            r1.schedule(r0, r4)     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.Runnable, java.util.TimerTask> r4 = r2.b     // Catch:{ all -> 0x0026 }
            r4.put(r3, r0)     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r4 = move-exception
            goto L_0x002b
        L_0x0028:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4     // Catch:{ all -> 0x0026 }
        L_0x002b:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.k.b(java.lang.Runnable, long):void");
    }
}
