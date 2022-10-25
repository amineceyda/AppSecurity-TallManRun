package g.i.c.a.a.c0.a;

import android.app.Activity;
import android.view.ViewTreeObserver;
import g.i.c.a.a.c0.a.c.e;
import g.i.c.a.a.i.b;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class a extends g.i.c.a.a.i.a {
    public boolean a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public e.c f4410d = new C0165a(this);

    /* renamed from: g.i.c.a.a.c0.a.a$a  reason: collision with other inner class name */
    public class C0165a implements e.c {
        public C0165a(a aVar) {
        }
    }

    public static class b {
        public static final a a;

        static {
            a aVar = new a((C0165a) null);
            a = aVar;
            Objects.requireNonNull(aVar);
            b.C0166b.a.b.c.a(aVar);
        }
    }

    public a(C0165a aVar) {
    }

    public static a t() {
        return b.a;
    }

    public void k(Activity activity) {
    }

    public void s(Activity activity) {
        g.h.a.a.f4028h = new WeakReference<>(activity);
        if (this.a) {
            w();
            u();
        }
    }

    public final void u() {
        Activity K;
        e b2 = e.b();
        b2.f4419e = this.f4410d;
        if (b2.f4418d == null && b2.c != null && (K = g.h.a.a.K()) != null) {
            ViewTreeObserver viewTreeObserver = K.getWindow().getDecorView().getViewTreeObserver();
            b2.f4418d = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(b2.c);
            b2.f4418d.addOnScrollChangedListener(b2.c);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void v(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.a     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x001d
            monitor-enter(r3)     // Catch:{ all -> 0x0047 }
            boolean r0 = r3.a     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x001d
        L_0x000c:
            r0 = 0
            r3.a = r0     // Catch:{ all -> 0x001a }
            r3.w()     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "Visual.VisualDebugManager"
            java.lang.String r1 = "stopVisualDebug(), stop visual debug success"
            g.c.b.b.f.K(r0, r1)     // Catch:{ all -> 0x001a }
            goto L_0x000a
        L_0x001a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x001d:
            r0 = 1
            r3.a = r0     // Catch:{ all -> 0x0047 }
            r3.b = r4     // Catch:{ all -> 0x0047 }
            r3.c = r5     // Catch:{ all -> 0x0047 }
            r3.u()     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "Visual.VisualDebugManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r1.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "startVisualDebug(), start visual debug success, appId="
            r1.append(r2)     // Catch:{ all -> 0x0047 }
            r1.append(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = ", debugId="
            r1.append(r4)     // Catch:{ all -> 0x0047 }
            r1.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0047 }
            g.c.b.b.f.K(r0, r4)     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x004b
        L_0x004a:
            throw r4
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.c0.a.a.v(java.lang.String, java.lang.String):void");
    }

    public final void w() {
        e b2 = e.b();
        b2.f4419e = null;
        ViewTreeObserver viewTreeObserver = b2.f4418d;
        if (viewTreeObserver != null && b2.c != null) {
            if (viewTreeObserver.isAlive()) {
                b2.f4418d.removeOnGlobalLayoutListener(b2.c);
                b2.f4418d.removeOnScrollChangedListener(b2.c);
            }
            b2.f4418d = null;
        }
    }
}
