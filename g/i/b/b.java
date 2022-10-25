package g.i.b;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.halley.common.HalleyException;
import g.i.b.e.h.e;
import g.i.b.f.a;
import g.i.b.f.c;
import g.i.b.f.k.b;
import java.util.Objects;

public class b implements a {
    public static volatile b a = null;
    public static volatile boolean b = false;

    public static b c() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    public a a(String str, String str2, String str3, c cVar) {
        String str4;
        String str5 = TextUtils.isEmpty(str) ? "url is empty." : cVar == null ? "listener is null." : "";
        if (e.e(str2)) {
            StringBuilder sb = new StringBuilder();
            if ("mounted".equals(Environment.getExternalStorageState())) {
                str4 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/" + e.i() + "/HalleyDownload";
            } else {
                str4 = "";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = g.i.b.e.c.f4125g.getFilesDir().toString();
            }
            sb.append(str4);
            str2 = sb.toString();
        }
        String str6 = str2;
        if ("".equals(str5)) {
            return new g.i.b.f.k.e(new g.i.b.f.k.f.b(str, -1), str6, str3, cVar, -1, "");
        }
        throw new HalleyException(str5);
    }

    public void b(a aVar, boolean z) {
        g.i.b.f.h.e b2 = g.i.b.f.h.e.b();
        Objects.requireNonNull(b2);
        if (aVar != null) {
            g.i.b.e.h.b.f("halley-downloader-TaskManager", "delete task:" + aVar.r());
            g.i.b.f.k.e eVar = (g.i.b.f.k.e) aVar;
            if (!eVar.h()) {
                if (!eVar.isRunning() && z) {
                    eVar.V();
                    eVar.T();
                    eVar.U();
                }
                if (z) {
                    eVar.z0 = z;
                }
                eVar.N(true, 0, "", g.i.b.f.e.DELETED);
            }
            synchronized (b2.b) {
                b2.b.remove(aVar);
            }
            if (aVar.p() != g.i.b.f.e.COMPLETE) {
                b2.d(eVar, 3);
            }
            b2.k();
            b.c cVar = b2.f4270d;
            Objects.requireNonNull(cVar);
            try {
                cVar.getWritableDatabase().delete("history_task_table", "saveDir=? and saveName=?", new String[]{aVar.z(), aVar.o()});
            } catch (Throwable th) {
                th.printStackTrace();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void d(g.i.b.f.a r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g.i.b.f.k.e
            if (r0 == 0) goto L_0x00b9
            g.i.b.f.h.e r0 = g.i.b.f.h.e.b()
            java.util.Objects.requireNonNull(r0)
            if (r6 == 0) goto L_0x00b8
            boolean r1 = r6 instanceof g.i.b.f.k.e
            if (r1 != 0) goto L_0x0013
            goto L_0x00b8
        L_0x0013:
            g.i.b.f.k.e r6 = (g.i.b.f.k.e) r6
            monitor-enter(r0)
            java.lang.String r1 = r6.p     // Catch:{ all -> 0x00b5 }
            boolean r1 = g.i.b.e.h.e.e(r1)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = ""
            r6.p = r1     // Catch:{ all -> 0x00b5 }
        L_0x0022:
            java.lang.String r1 = r6.p     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "../"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r6.p     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "../"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x00b5 }
            r6.p = r1     // Catch:{ all -> 0x00b5 }
        L_0x0038:
            java.lang.String r1 = r6.p     // Catch:{ all -> 0x00b5 }
            boolean r1 = g.i.b.f.f.b.c(r1)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0094
            java.util.List r1 = r0.h()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0048:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b5 }
            g.i.b.f.a r2 = (g.i.b.f.a) r2     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = r6.o     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = r2.z()     // Catch:{ all -> 0x00b5 }
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r6.p     // Catch:{ all -> 0x00b5 }
            r4 = r2
            g.i.b.f.k.e r4 = (g.i.b.f.k.e) r4     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = r4.p     // Catch:{ all -> 0x00b5 }
            boolean r4 = g.i.b.f.f.b.c(r4)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x0072
            java.lang.String r2 = r2.o()     // Catch:{ all -> 0x00b5 }
            goto L_0x0076
        L_0x0072:
            java.lang.String r2 = r2.u()     // Catch:{ all -> 0x00b5 }
        L_0x0076:
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Can not add new task, another task exists with the same path:"
            r1.<init>(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = r6.o     // Catch:{ all -> 0x00b5 }
            r1.append(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = r6.p     // Catch:{ all -> 0x00b5 }
            r1.append(r6)     // Catch:{ all -> 0x00b5 }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b8
        L_0x0094:
            java.util.Vector<g.i.b.f.k.e> r1 = r0.b     // Catch:{ all -> 0x00b5 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b5 }
            java.util.Vector<g.i.b.f.k.e> r2 = r0.b     // Catch:{ all -> 0x00b2 }
            r2.add(r6)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            r6.O()     // Catch:{ HalleyException -> 0x00a1 }
            goto L_0x0092
        L_0x00a1:
            r1 = move-exception
            r1.getLocalizedMessage()     // Catch:{ all -> 0x00b5 }
            java.util.Vector<g.i.b.f.k.e> r1 = r0.b     // Catch:{ all -> 0x00b5 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b5 }
            java.util.Vector<g.i.b.f.k.e> r2 = r0.b     // Catch:{ all -> 0x00af }
            r2.remove(r6)     // Catch:{ all -> 0x00af }
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            goto L_0x0092
        L_0x00af:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            throw r6     // Catch:{ all -> 0x00b5 }
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            throw r6     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            throw r6
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "DownloaderTask should be created by Downloader.createNewTask"
            r6.<init>(r0)
            goto L_0x00c2
        L_0x00c1:
            throw r6
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.b.d(g.i.b.f.a):void");
    }
}
