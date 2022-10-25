package g.e.a.b.f.a;

import g.e.a.b.e.c.m2;
import g.e.a.b.f.b.n5;

public class a {
    public final m2 a;

    /* renamed from: g.e.a.b.f.a.a$a  reason: collision with other inner class name */
    public interface C0110a extends n5 {
    }

    public a(m2 m2Var) {
        this.a = m2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0.f3000h == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.f3000h.registerOnMeasurementEventListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        android.util.Log.w(r0.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.e.a.b.f.a.a.C0110a r6) {
        /*
            r5 = this;
            g.e.a.b.e.c.m2 r0 = r5.a
            java.util.Objects.requireNonNull(r0)
            java.util.List r1 = r0.f2997e
            monitor-enter(r1)
            r2 = 0
        L_0x0009:
            java.util.List r3 = r0.f2997e     // Catch:{ all -> 0x0059 }
            int r3 = r3.size()     // Catch:{ all -> 0x0059 }
            if (r2 >= r3) goto L_0x002d
            java.util.List r3 = r0.f2997e     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0059 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0059 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r6 = r0.a     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "OnEventListener already registered."
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0058
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x002d:
            g.e.a.b.e.c.c2 r2 = new g.e.a.b.e.c.c2     // Catch:{ all -> 0x0059 }
            r2.<init>(r6)     // Catch:{ all -> 0x0059 }
            java.util.List r3 = r0.f2997e     // Catch:{ all -> 0x0059 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0059 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0059 }
            r3.add(r4)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            g.e.a.b.e.c.z0 r6 = r0.f3000h
            if (r6 == 0) goto L_0x004e
            g.e.a.b.e.c.z0 r6 = r0.f3000h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r6.registerOnMeasurementEventListener(r2)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            goto L_0x0058
        L_0x0047:
            java.lang.String r6 = r0.a
            java.lang.String r1 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r6, r1)
        L_0x004e:
            g.e.a.b.e.c.z1 r6 = new g.e.a.b.e.c.z1
            r6.<init>(r0, r2)
            java.util.concurrent.ExecutorService r0 = r0.c
            r0.execute(r6)
        L_0x0058:
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x005c:
            throw r6
        L_0x005d:
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.a.a.a(g.e.a.b.f.a.a$a):void");
    }
}
