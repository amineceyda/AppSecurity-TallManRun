package g.e.c.t;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class r<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> b = new a();
    public Comparator<? super K> comparator;
    private r<K, V>.defpackage.b entrySet;
    public final e<K, V> header = new e<>();
    private r<K, V>.defpackage.c keySet;
    public int modCount = 0;
    public e<K, V> root;
    public int size = 0;

    public class a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends r<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public Object next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e b2;
            if (!(obj instanceof Map.Entry) || (b2 = r.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            r.this.e(b2, true);
            return true;
        }

        public int size() {
            return r.this.size;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends r<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public K next() {
                return a().f3780g;
            }
        }

        public c() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return r.this.c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            r rVar = r.this;
            e c = rVar.c(obj);
            if (c != null) {
                rVar.e(c, true);
            }
            return c != null;
        }

        public int size() {
            return r.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> b;
        public e<K, V> c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f3775d;

        public d() {
            this.b = r.this.header.f3778e;
            this.f3775d = r.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.b;
            r rVar = r.this;
            if (eVar == rVar.header) {
                throw new NoSuchElementException();
            } else if (rVar.modCount == this.f3775d) {
                this.b = eVar.f3778e;
                this.c = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.b != r.this.header;
        }

        public final void remove() {
            e<K, V> eVar = this.c;
            if (eVar != null) {
                r.this.e(eVar, true);
                this.c = null;
                this.f3775d = r.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> b;
        public e<K, V> c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f3777d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f3778e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f3779f;

        /* renamed from: g  reason: collision with root package name */
        public final K f3780g;

        /* renamed from: h  reason: collision with root package name */
        public V f3781h;

        /* renamed from: i  reason: collision with root package name */
        public int f3782i;

        public e() {
            this.f3780g = null;
            this.f3779f = this;
            this.f3778e = this;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.b = eVar;
            this.f3780g = k2;
            this.f3782i = 1;
            this.f3778e = eVar2;
            this.f3779f = eVar3;
            eVar3.f3778e = this;
            eVar2.f3779f = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f3780g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f3781h
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.c.t.r.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f3780g;
        }

        public V getValue() {
            return this.f3781h;
        }

        public int hashCode() {
            K k2 = this.f3780g;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f3781h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f3781h;
            this.f3781h = v;
            return v2;
        }

        public String toString() {
            return this.f3780g + "=" + this.f3781h;
        }
    }

    static {
        Class<r> cls = r.class;
    }

    public r() {
        Comparator<Comparable> comparator2 = b;
        this.comparator = comparator2;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator2 = this.comparator;
        e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == b ? (Comparable) k2 : null;
            while (true) {
                K k3 = eVar2.f3780g;
                i2 = comparable != null ? comparable.compareTo(k3) : comparator2.compare(k2, k3);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.c : eVar2.f3777d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f3779f);
            if (i2 < 0) {
                eVar2.c = eVar;
            } else {
                eVar2.f3777d = eVar;
            }
            d(eVar2, true);
        } else if (comparator2 != b || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f3779f);
            this.root = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.e.c.t.r.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            g.e.c.t.r$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f3781h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.c.t.r.b(java.util.Map$Entry):g.e.c.t.r$e");
    }

    public e<K, V> c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f3779f = eVar;
        eVar.f3778e = eVar;
    }

    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.c;
            e<K, V> eVar3 = eVar.f3777d;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f3782i : 0;
            int i4 = eVar3 != null ? eVar3.f3782i : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.c;
                e<K, V> eVar5 = eVar3.f3777d;
                int i6 = eVar5 != null ? eVar5.f3782i : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f3782i;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    i(eVar3);
                }
                h(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.c;
                e<K, V> eVar7 = eVar2.f3777d;
                int i8 = eVar7 != null ? eVar7.f3782i : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f3782i;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    h(eVar2);
                }
                i(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f3782i = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f3782i = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.b;
        }
    }

    public void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i2;
        e<K, V> eVar3;
        if (z) {
            e<K, V> eVar4 = eVar.f3779f;
            eVar4.f3778e = eVar.f3778e;
            eVar.f3778e.f3779f = eVar4;
        }
        e<K, V> eVar5 = eVar.c;
        e<K, V> eVar6 = eVar.f3777d;
        e<K, V> eVar7 = eVar.b;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                g(eVar, eVar5);
                eVar.c = null;
            } else if (eVar6 != null) {
                g(eVar, eVar6);
                eVar.f3777d = null;
            } else {
                g(eVar, (e<K, V>) null);
            }
            d(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.f3782i > eVar6.f3782i) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f3777d;
            } while (eVar5 != null);
        } else {
            do {
                e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.c;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        e(eVar2, false);
        e<K, V> eVar9 = eVar.c;
        if (eVar9 != null) {
            i2 = eVar9.f3782i;
            eVar2.c = eVar9;
            eVar9.b = eVar2;
            eVar.c = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar10 = eVar.f3777d;
        if (eVar10 != null) {
            i3 = eVar10.f3782i;
            eVar2.f3777d = eVar10;
            eVar10.b = eVar2;
            eVar.f3777d = null;
        }
        eVar2.f3782i = Math.max(i2, i3) + 1;
        g(eVar, eVar2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.defpackage.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        r<K, V>.defpackage.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void g(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.b;
        eVar.b = null;
        if (eVar2 != null) {
            eVar2.b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.c == eVar) {
            eVar3.c = eVar2;
        } else {
            eVar3.f3777d = eVar2;
        }
    }

    public V get(Object obj) {
        e c2 = c(obj);
        if (c2 != null) {
            return c2.f3781h;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c;
        e<K, V> eVar3 = eVar.f3777d;
        e<K, V> eVar4 = eVar3.c;
        e<K, V> eVar5 = eVar3.f3777d;
        eVar.f3777d = eVar4;
        if (eVar4 != null) {
            eVar4.b = eVar;
        }
        g(eVar, eVar3);
        eVar3.c = eVar;
        eVar.b = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f3782i : 0, eVar4 != null ? eVar4.f3782i : 0) + 1;
        eVar.f3782i = max;
        if (eVar5 != null) {
            i2 = eVar5.f3782i;
        }
        eVar3.f3782i = Math.max(max, i2) + 1;
    }

    public final void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c;
        e<K, V> eVar3 = eVar.f3777d;
        e<K, V> eVar4 = eVar2.c;
        e<K, V> eVar5 = eVar2.f3777d;
        eVar.c = eVar5;
        if (eVar5 != null) {
            eVar5.b = eVar;
        }
        g(eVar, eVar2);
        eVar2.f3777d = eVar;
        eVar.b = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f3782i : 0, eVar5 != null ? eVar5.f3782i : 0) + 1;
        eVar.f3782i = max;
        if (eVar4 != null) {
            i2 = eVar4.f3782i;
        }
        eVar2.f3782i = Math.max(max, i2) + 1;
    }

    public Set<K> keySet() {
        r<K, V>.defpackage.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        r<K, V>.defpackage.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e a2 = a(k2, true);
        V v2 = a2.f3781h;
        a2.f3781h = v;
        return v2;
    }

    public V remove(Object obj) {
        e c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.f3781h;
        }
        return null;
    }

    public int size() {
        return this.size;
    }
}
