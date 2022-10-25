package g.i.a.a.j.c;

import com.tencent.assistant.alive.jni.KeepAliveJniApi;
import g.i.a.a.b.b;
import g.i.a.a.j.c.b;

public class a implements b {
    public b<b.a> a = new g.i.a.a.b.b<>();
    public KeepAliveJniApi b;
    public g.i.a.a.a.b c;

    public a(g.i.a.a.a.b bVar) {
        this.b = new KeepAliveJniApi(bVar);
        this.c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (((g.i.a.a.b.a) r2.next().get()) != r5) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = r0.b.iterator();
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.i.a.a.j.c.b.a r5) {
        /*
            r4 = this;
            g.i.a.a.b.b<g.i.a.a.j.c.b$a> r0 = r4.a
            java.util.Objects.requireNonNull(r0)
            if (r5 != 0) goto L_0x0008
            goto L_0x0046
        L_0x0008:
            java.util.List<java.lang.ref.WeakReference<Icallback>> r1 = r0.b
            monitor-enter(r1)
        L_0x000b:
            java.lang.ref.ReferenceQueue<Icallback> r2 = r0.a     // Catch:{ all -> 0x0047 }
            java.lang.ref.Reference r2 = r2.poll()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0019
            java.util.List<java.lang.ref.WeakReference<Icallback>> r3 = r0.b     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x000b
        L_0x0019:
            java.util.List<java.lang.ref.WeakReference<Icallback>> r2 = r0.b     // Catch:{ ConcurrentModificationException -> 0x0035 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ConcurrentModificationException -> 0x0035 }
        L_0x001f:
            boolean r3 = r2.hasNext()     // Catch:{ ConcurrentModificationException -> 0x0035 }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.next()     // Catch:{ ConcurrentModificationException -> 0x0035 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ ConcurrentModificationException -> 0x0035 }
            java.lang.Object r3 = r3.get()     // Catch:{ ConcurrentModificationException -> 0x0035 }
            g.i.a.a.b.a r3 = (g.i.a.a.b.a) r3     // Catch:{ ConcurrentModificationException -> 0x0035 }
            if (r3 != r5) goto L_0x001f
        L_0x0033:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0046
        L_0x0035:
            r2 = move-exception
            g.i.a.a.m.a.b(r2)     // Catch:{ all -> 0x0047 }
        L_0x0039:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            java.lang.ref.ReferenceQueue<Icallback> r3 = r0.a     // Catch:{ all -> 0x0047 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0047 }
            java.util.List<java.lang.ref.WeakReference<Icallback>> r5 = r0.b     // Catch:{ all -> 0x0047 }
            r5.add(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x0033
        L_0x0046:
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x004a:
            throw r5
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.a.a.j.c.a.a(g.i.a.a.j.c.b$a):void");
    }
}
