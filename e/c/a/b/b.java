package e.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f1227d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public int f1228e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1230e;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1229d;
        }
    }

    /* renamed from: e.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0039b<K, V> extends e<K, V> {
        public C0039b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1229d;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1230e;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        public final K b;
        public final V c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f1229d;

        /* renamed from: e  reason: collision with root package name */
        public c<K, V> f1230e;

        public c(K k2, V v) {
            this.b = k2;
            this.c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        public K getKey() {
            return this.b;
        }

        public V getValue() {
            return this.c;
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.b + "=" + this.c;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> b;
        public boolean c = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1230e;
                this.b = cVar3;
                this.c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.c) {
                return b.this.b != null;
            }
            c<K, V> cVar = this.b;
            return (cVar == null || cVar.f1229d == null) ? false : true;
        }

        public Object next() {
            c<K, V> cVar;
            if (this.c) {
                this.c = false;
                cVar = b.this.b;
            } else {
                c<K, V> cVar2 = this.b;
                cVar = cVar2 != null ? cVar2.f1229d : null;
            }
            this.b = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.b = cVar2;
            this.c = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.b == cVar && cVar == this.c) {
                this.c = null;
                this.b = null;
            }
            c<K, V> cVar3 = this.b;
            if (cVar3 == cVar) {
                this.b = b(cVar3);
            }
            c<K, V> cVar4 = this.c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.c != null;
        }

        public Object next() {
            c<K, V> cVar = this.c;
            c<K, V> cVar2 = this.b;
            this.c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> c(K k2) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.b.equals(k2)) {
            cVar = cVar.f1229d;
        }
        return cVar;
    }

    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f1227d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((e.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof e.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            e.c.a.b.b r7 = (e.c.a.b.b) r7
            int r1 = r6.f1228e
            int r3 = r7.f1228e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            e.c.a.b.b$e r3 = (e.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            e.c.a.b.b$e r4 = (e.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            e.c.a.b.b$e r7 = (e.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public c<K, V> f(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1228e++;
        c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
        } else {
            cVar2.f1229d = cVar;
            cVar.f1230e = cVar2;
        }
        this.c = cVar;
        return cVar;
    }

    public V h(K k2, V v) {
        c c2 = c(k2);
        if (c2 != null) {
            return c2.c;
        }
        f(k2, v);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public V i(K k2) {
        c c2 = c(k2);
        if (c2 == null) {
            return null;
        }
        this.f1228e--;
        if (!this.f1227d.isEmpty()) {
            for (f<K, V> a2 : this.f1227d.keySet()) {
                a2.a(c2);
            }
        }
        c<K, V> cVar = c2.f1230e;
        c<K, V> cVar2 = c2.f1229d;
        if (cVar != null) {
            cVar.f1229d = cVar2;
        } else {
            this.b = cVar2;
        }
        c<K, V> cVar3 = c2.f1229d;
        if (cVar3 != null) {
            cVar3.f1230e = cVar;
        } else {
            this.c = cVar;
        }
        c2.f1229d = null;
        c2.f1230e = null;
        return c2.c;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.f1227d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    i2.append(", ");
                }
            } else {
                i2.append("]");
                return i2.toString();
            }
        }
    }
}
