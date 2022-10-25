package g.e.a.b.e.c;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class i9 extends AbstractMap {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f2956h = 0;
    public final int b;
    public List c = Collections.emptyList();

    /* renamed from: d  reason: collision with root package name */
    public Map f2957d = Collections.emptyMap();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2958e;

    /* renamed from: f  reason: collision with root package name */
    public volatile h9 f2959f;

    /* renamed from: g  reason: collision with root package name */
    public Map f2960g = Collections.emptyMap();

    public /* synthetic */ i9(int i2) {
        this.b = i2;
    }

    public void a() {
        if (!this.f2958e) {
            this.f2957d = this.f2957d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2957d);
            this.f2960g = this.f2960g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2960g);
            this.f2958e = true;
        }
    }

    public final int b() {
        return this.c.size();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e2 = e(comparable);
        if (e2 >= 0) {
            f9 f9Var = (f9) this.c.get(e2);
            f9Var.f2927d.h();
            Object obj2 = f9Var.c;
            f9Var.c = obj;
            return obj2;
        }
        h();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.b);
        }
        int i2 = -(e2 + 1);
        if (i2 >= this.b) {
            return g().put(comparable, obj);
        }
        int size = this.c.size();
        int i3 = this.b;
        if (size == i3) {
            f9 f9Var2 = (f9) this.c.remove(i3 - 1);
            g().put(f9Var2.b, f9Var2.c);
        }
        this.c.add(i2, new f9(this, comparable, obj));
        return null;
    }

    public final void clear() {
        h();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.f2957d.isEmpty()) {
            this.f2957d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f2957d.containsKey(comparable);
    }

    public final Map.Entry d(int i2) {
        return (Map.Entry) this.c.get(i2);
    }

    public final int e(Comparable comparable) {
        int size = this.c.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((f9) this.c.get(size)).b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = comparable.compareTo(((f9) this.c.get(i3)).b);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public final Set entrySet() {
        if (this.f2959f == null) {
            this.f2959f = new h9(this);
        }
        return this.f2959f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return super.equals(obj);
        }
        i9 i9Var = (i9) obj;
        int size = size();
        if (size != i9Var.size()) {
            return false;
        }
        int b2 = b();
        if (b2 == i9Var.b()) {
            for (int i2 = 0; i2 < b2; i2++) {
                if (!d(i2).equals(i9Var.d(i2))) {
                    return false;
                }
            }
            if (b2 != size) {
                return this.f2957d.equals(i9Var.f2957d);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(i9Var.entrySet());
    }

    public final Object f(int i2) {
        h();
        Object obj = ((f9) this.c.remove(i2)).c;
        if (!this.f2957d.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f9(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f2957d.isEmpty() && !(this.f2957d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2957d = treeMap;
            this.f2960g = treeMap.descendingMap();
        }
        return (SortedMap) this.f2957d;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return ((f9) this.c.get(e2)).c;
        }
        return this.f2957d.get(comparable);
    }

    public final void h() {
        if (this.f2958e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += ((f9) this.c.get(i3)).hashCode();
        }
        return this.f2957d.size() > 0 ? this.f2957d.hashCode() + i2 : i2;
    }

    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return f(e2);
        }
        if (this.f2957d.isEmpty()) {
            return null;
        }
        return this.f2957d.remove(comparable);
    }

    public final int size() {
        return this.f2957d.size() + this.c.size();
    }
}
