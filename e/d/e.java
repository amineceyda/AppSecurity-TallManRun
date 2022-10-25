package e.d;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e<K, V> {
    public final LinkedHashMap<K, V> a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f1246d;

    /* renamed from: e  reason: collision with root package name */
    public int f1247e;

    /* renamed from: f  reason: collision with root package name */
    public int f1248f;

    /* renamed from: g  reason: collision with root package name */
    public int f1249g;

    /* renamed from: h  reason: collision with root package name */
    public int f1250h;

    public e(int i2) {
        if (i2 > 0) {
            this.c = i2;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f1247e++;
        r1 = r3.a.put(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r3.a.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3.b++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        d(r3.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r4, r0)
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.a     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0016
            int r4 = r3.f1249g     // Catch:{ all -> 0x004d }
            int r4 = r4 + 1
            r3.f1249g = r4     // Catch:{ all -> 0x004d }
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            return r0
        L_0x0016:
            int r0 = r3.f1250h     // Catch:{ all -> 0x004d }
            int r0 = r0 + 1
            r3.f1250h = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r3.a(r4)
            if (r0 != 0) goto L_0x0025
            r4 = 0
            return r4
        L_0x0025:
            monitor-enter(r3)
            int r1 = r3.f1247e     // Catch:{ all -> 0x004a }
            int r1 = r1 + 1
            r3.f1247e = r1     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap<K, V> r1 = r3.a     // Catch:{ all -> 0x004a }
            java.lang.Object r1 = r1.put(r4, r0)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r3.a     // Catch:{ all -> 0x004a }
            r2.put(r4, r1)     // Catch:{ all -> 0x004a }
            goto L_0x0040
        L_0x003a:
            int r4 = r3.b     // Catch:{ all -> 0x004a }
            int r4 = r4 + 1
            r3.b = r4     // Catch:{ all -> 0x004a }
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0044
            return r1
        L_0x0044:
            int r4 = r3.c
            r3.d(r4)
            return r0
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.b(java.lang.Object):java.lang.Object");
    }

    public final V c(K k2, V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1246d++;
            this.b++;
            put = this.a.put(k2, v);
            if (put != null) {
                this.b--;
            }
        }
        d(this.c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.b     // Catch:{ all -> 0x0069 }
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r2.a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.b     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.b     // Catch:{ all -> 0x0069 }
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap<K, V> r0 = r2.a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.a     // Catch:{ all -> 0x0069 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0069 }
            r0.getValue()     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashMap<K, V> r0 = r2.a     // Catch:{ all -> 0x0069 }
            r0.remove(r1)     // Catch:{ all -> 0x0069 }
            int r0 = r2.b     // Catch:{ all -> 0x0069 }
            int r0 = r0 + -1
            r2.b = r0     // Catch:{ all -> 0x0069 }
            int r0 = r2.f1248f     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r2.f1248f = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0069 }
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0069 }
            r3.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r3     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x006c:
            throw r3
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.d(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1249g;
        i3 = this.f1250h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.f1249g), Integer.valueOf(this.f1250h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0)});
    }
}
