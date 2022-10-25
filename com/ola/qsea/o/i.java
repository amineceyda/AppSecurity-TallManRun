package com.ola.qsea.o;

import android.content.Context;
import com.ola.qsea.e.b;
import com.ola.qsea.n.a;
import com.ola.qsea.w.d;
import java.util.Map;

public class i implements b {
    public static volatile i a;
    public Context b;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized com.ola.qsea.o.i a() {
        /*
            java.lang.Class<com.ola.qsea.o.i> r0 = com.ola.qsea.o.i.class
            monitor-enter(r0)
            com.ola.qsea.o.i r1 = a     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            com.ola.qsea.o.i r1 = a     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            com.ola.qsea.o.i r1 = new com.ola.qsea.o.i     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            a = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            com.ola.qsea.o.i r1 = a     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.o.i.a():com.ola.qsea.o.i");
    }

    public a a(String str, Object obj) {
        return new d().a(str, obj);
    }

    public void a(Context context) {
        this.b = context;
    }

    public final void a(String str, Map<String, Object> map, String str2, String str3) {
        e a2 = e.a();
        b.b(a2.a(d.a(str3).B(), str), a2.a(map, str2, str3, a.a(str3).c()), new h(this, str3));
    }

    public void b(String str, Map<String, Object> map, String str2, String str3) {
        if (d.a(str3).z() && com.ola.qsea.d.a.g()) {
            com.ola.qsea.c.a.a().a(new g(this, str, map, str2, str3));
        }
    }
}
