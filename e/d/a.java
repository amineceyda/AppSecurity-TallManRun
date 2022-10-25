package e.d;

import e.d.f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public f<K, V> f1232i;

    /* renamed from: e.d.a$a  reason: collision with other inner class name */
    public class C0040a extends f<K, V> {
        public C0040a() {
        }

        public void a() {
            a.this.clear();
        }

        public Object b(int i2, int i3) {
            return a.this.c[(i2 << 1) + i3];
        }

        public Map<K, V> c() {
            return a.this;
        }

        public int d() {
            return a.this.f1260d;
        }

        public int e(Object obj) {
            return a.this.e(obj);
        }

        public int f(Object obj) {
            return a.this.g(obj);
        }

        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        public void h(int i2) {
            a.this.j(i2);
        }

        public V i(int i2, V v) {
            return a.this.k(i2, v);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        f m2 = m();
        if (m2.a == null) {
            m2.a = new f.b();
        }
        return m2.a;
    }

    public Set<K> keySet() {
        f m2 = m();
        if (m2.b == null) {
            m2.b = new f.c();
        }
        return m2.b;
    }

    public final f<K, V> m() {
        if (this.f1232i == null) {
            this.f1232i = new C0040a();
        }
        return this.f1232i;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f1260d);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        f m2 = m();
        if (m2.c == null) {
            m2.c = new f.e();
        }
        return m2.c;
    }
}
