package g.e.a.b.e.c;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class h9 extends AbstractSet {
    public final /* synthetic */ i9 b;

    public /* synthetic */ h9(i9 i9Var) {
        this.b = i9Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.b.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new g9(this.b);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.b.size();
    }
}
