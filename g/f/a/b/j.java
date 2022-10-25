package g.f.a.b;

import g.f.a.d.i;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class j<T, ID> extends d<T, ID> implements Object<T>, Serializable, Serializable {
    private static final long serialVersionUID = -2523335606983317721L;
    /* access modifiers changed from: private */
    public List<T> results;

    public j(g<T, ID> gVar, Object obj, Object obj2, i iVar, String str, boolean z) throws SQLException {
        super(gVar, obj, obj2, iVar, str, z);
        List<T> list;
        if (obj2 == null) {
            list = new ArrayList<>();
        } else {
            list = ((a) gVar).f(e0());
        }
        this.results = list;
    }

    public boolean add(T t) {
        if (this.results.add(t)) {
            return super.add(t);
        }
        return false;
    }

    public boolean addAll(Collection<? extends T> collection) {
        if (this.results.addAll(collection)) {
            return super.addAll(collection);
        }
        return false;
    }

    public void close() {
    }

    public boolean contains(Object obj) {
        return this.results.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.results.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.results.equals(((j) obj).results);
    }

    public f<T> g() {
        return g0();
    }

    public f g0() {
        return new i(this);
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public boolean isEmpty() {
        return this.results.isEmpty();
    }

    public Iterator iterator() {
        return g0();
    }

    public boolean remove(Object obj) {
        g<T, ID> gVar;
        if (!this.results.remove(obj) || (gVar = this.b) == null) {
            return false;
        }
        try {
            return gVar.S(obj) == 1;
        } catch (SQLException e2) {
            throw new IllegalStateException("Could not delete data element from dao", e2);
        }
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            if (remove(remove)) {
                z = true;
            }
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.results.size();
    }

    public Object[] toArray() {
        return this.results.toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return this.results.toArray(eArr);
    }
}
