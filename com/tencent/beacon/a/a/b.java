package com.tencent.beacon.a.a;

import android.util.SparseArray;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.util.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {
    private static volatile b a;
    private final SparseArray<List<d>> b = new SparseArray<>();
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<List<c>> f565d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<Object> f566e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f567f = new AtomicBoolean(false);

    private b() {
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    private Object b(int i2) {
        Object obj;
        synchronized (this.c) {
            obj = this.f566e.get(i2);
            if (obj == null) {
                obj = new Object();
                this.f566e.put(i2, obj);
            }
        }
        return obj;
    }

    private List<d> c(int i2) {
        List<d> list = this.b.get(i2);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private void c(c cVar) {
        d(cVar);
        synchronized (b(cVar.a)) {
            List<d> c2 = c(cVar.a);
            if (c2 != null) {
                for (d a2 : c2) {
                    try {
                        a2.a(cVar);
                    } catch (Throwable th) {
                        c.a(th);
                        if (this.f567f.compareAndSet(false, true)) {
                            g.e().a("512", "dispatchEvent error", th);
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    private void d(c cVar) {
    }

    public void a(int i2) {
        synchronized (b(i2)) {
            this.f565d.remove(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, com.tencent.beacon.a.a.d r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b((int) r4)
            monitor-enter(r0)
            android.util.SparseArray<java.util.List<com.tencent.beacon.a.a.d>> r1 = r3.b     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0053 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0019
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0053 }
            r1.<init>()     // Catch:{ all -> 0x0053 }
            android.util.SparseArray<java.util.List<com.tencent.beacon.a.a.d>> r2 = r3.b     // Catch:{ all -> 0x0053 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0053 }
        L_0x0019:
            boolean r2 = r1.contains(r5)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0021:
            r1.add(r5)     // Catch:{ all -> 0x0053 }
            android.util.SparseArray<java.util.List<com.tencent.beacon.a.a.c>> r1 = r3.f565d     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0053 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0051
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0032:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0053 }
            com.tencent.beacon.a.a.c r2 = (com.tencent.beacon.a.a.c) r2     // Catch:{ all -> 0x0053 }
            r5.a(r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0032
        L_0x0042:
            r2 = move-exception
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0032
        L_0x0047:
            r5 = 6
            if (r4 == r5) goto L_0x004e
            r5 = 12
            if (r4 != r5) goto L_0x0051
        L_0x004e:
            r3.a((int) r4)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0056:
            throw r4
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.a.b.a(int, com.tencent.beacon.a.a.d):void");
    }

    public void a(c cVar) {
        a.a().a((Runnable) new a(this, cVar));
    }

    public void b(c cVar) {
        synchronized (b(cVar.a)) {
            c cVar2 = new c(cVar.a, cVar.b);
            List list = this.f565d.get(cVar2.a);
            if (list == null) {
                list = new ArrayList();
                this.f565d.put(cVar2.a, list);
            }
            list.add(cVar2);
            c(cVar);
        }
    }
}
