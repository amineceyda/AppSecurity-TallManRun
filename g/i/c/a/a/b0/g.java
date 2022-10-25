package g.i.c.a.a.b0;

import android.util.SparseArray;
import g.i.c.a.a.i.e.a;
import g.i.c.a.a.i.e.b;
import g.i.c.a.a.i.e.d;
import g.i.c.a.a.i.e.e;
import g.i.c.a.a.i.e.f;
import g.i.c.a.a.i.e.h;
import g.i.c.a.a.i.e.i;
import g.i.c.a.a.i.e.j;
import g.i.c.a.a.r.e;
import g.i.c.a.a.u.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class g {
    public static final SparseArray<List<Object>> a = new SparseArray<>();
    public static final HashMap<Integer, Class<?>> b;

    static {
        HashMap<Integer, Class<?>> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(1, e.class);
        hashMap.put(2, g.i.c.a.a.i.e.g.class);
        hashMap.put(3, h.class);
        hashMap.put(4, i.class);
        hashMap.put(5, j.class);
        hashMap.put(6, c.class);
        hashMap.put(7, f.class);
        hashMap.put(8, g.i.c.a.a.l.h.class);
        hashMap.put(9, a.class);
        hashMap.put(10, b.class);
        hashMap.put(11, d.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = b.get(java.lang.Integer.valueOf(r5)).newInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        g.c.b.b.f.x("ReusablePool", "new Instance exception " + r0);
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(int r5) {
        /*
            android.util.SparseArray<java.util.List<java.lang.Object>> r0 = a
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0093 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0093 }
        L_0x0009:
            if (r1 == 0) goto L_0x0036
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0036
            r2 = 0
            java.lang.Object r2 = r1.remove(r2)     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0009
            g.i.c.a.a.r.e r1 = g.i.c.a.a.r.e.b.a     // Catch:{ all -> 0x0093 }
            boolean r1 = r1.a     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "ReusablePool"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r3.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r4 = "obtain: reuse, reuseType = "
            r3.append(r4)     // Catch:{ all -> 0x0093 }
            r3.append(r5)     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0093 }
            g.c.b.b.f.w(r1, r5)     // Catch:{ all -> 0x0093 }
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r2
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            java.util.HashMap<java.lang.Integer, java.lang.Class<?>> r0 = b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0048 }
            goto L_0x0060
        L_0x0048:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "new Instance exception "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ReusablePool"
            g.c.b.b.f.x(r1, r0)
            r0 = 0
        L_0x0060:
            g.i.c.a.a.r.e r1 = g.i.c.a.a.r.e.b.a
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "ReusablePool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "obtain: create, reuseType = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", reusable="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            g.c.b.b.f.w(r1, r2)
        L_0x0084:
            if (r0 == 0) goto L_0x0087
            return r0
        L_0x0087:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Reusable reuseType illegal, reuseType = "
            java.lang.String r5 = g.a.a.a.a.q(r1, r5)
            r0.<init>(r5)
            throw r0
        L_0x0093:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0096:
            throw r5
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.b0.g.a(int):java.lang.Object");
    }

    public static void b(Object obj, int i2) {
        List list;
        SparseArray<List<Object>> sparseArray = a;
        synchronized (sparseArray) {
            list = sparseArray.get(i2);
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList());
                sparseArray.put(i2, list);
            }
            if (list.size() < 30) {
                list.add(obj);
            }
        }
        if (e.b.a.a) {
            StringBuilder j2 = g.a.a.a.a.j("recycle: reuseType = ", i2, " list size=");
            j2.append(list.size());
            j2.append("， reusable=");
            j2.append(obj);
            g.c.b.b.f.w("ReusablePool", j2.toString());
        }
    }
}
