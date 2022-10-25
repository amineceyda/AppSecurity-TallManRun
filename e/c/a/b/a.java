package e.c.a.b;

import e.c.a.b.b;
import java.util.HashMap;

public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f1226f = new HashMap<>();

    public b.c<K, V> c(K k2) {
        return this.f1226f.get(k2);
    }

    public boolean contains(K k2) {
        return this.f1226f.containsKey(k2);
    }

    public V h(K k2, V v) {
        b.c cVar = this.f1226f.get(k2);
        if (cVar != null) {
            return cVar.c;
        }
        this.f1226f.put(k2, f(k2, v));
        return null;
    }

    public V i(K k2) {
        V i2 = super.i(k2);
        this.f1226f.remove(k2);
        return i2;
    }
}
