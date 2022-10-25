package g.e.a.b.e.c;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class i6 extends AbstractList implements u7 {
    public boolean b = true;

    public boolean add(Object obj) {
        c();
        return super.add(obj);
    }

    public boolean addAll(int i2, Collection collection) {
        c();
        return super.addAll(i2, collection);
    }

    public boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    public final void c() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final void j() {
        this.b = false;
    }

    public final boolean k() {
        return this.b;
    }

    public abstract Object remove(int i2);

    public final boolean remove(Object obj) {
        c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }
}
