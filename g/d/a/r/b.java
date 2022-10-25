package g.d.a.r;

import e.d.a;
import e.d.g;

public final class b<K, V> extends a<K, V> {

    /* renamed from: j  reason: collision with root package name */
    public int f2678j;

    public void clear() {
        this.f2678j = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f2678j == 0) {
            this.f2678j = super.hashCode();
        }
        return this.f2678j;
    }

    public void i(g<? extends K, ? extends V> gVar) {
        this.f2678j = 0;
        super.i(gVar);
    }

    public V j(int i2) {
        this.f2678j = 0;
        return super.j(i2);
    }

    public V k(int i2, V v) {
        this.f2678j = 0;
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.c;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public V put(K k2, V v) {
        this.f2678j = 0;
        return super.put(k2, v);
    }
}
