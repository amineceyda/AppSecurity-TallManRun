package i.l;

import i.o.c.h;
import i.o.c.s.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;

public final class f implements Map, Serializable, a {
    public static final f b = new f();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return b;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            h.e((Void) obj, "value");
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return g.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return g.b;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return MessageFormatter.DELIM_STR;
    }

    public final /* bridge */ Collection values() {
        return e.b;
    }
}
