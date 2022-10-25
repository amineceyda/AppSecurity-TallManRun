package i.l;

import g.c.b.b.f;
import i.e;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class c extends b {
    public static final <T> boolean a(Collection<? super T> collection, T[] tArr) {
        h.e(collection, "$this$addAll");
        h.e(tArr, "elements");
        return collection.addAll(f.d(tArr));
    }

    public static final <T> ArrayList<T> b(T... tArr) {
        h.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new a(tArr, true));
    }

    public static final <T> Collection<T> c(T[] tArr) {
        h.e(tArr, "$this$asCollection");
        return new a(tArr, false);
    }

    public static final <T> boolean d(Iterable<? extends T> iterable, T t) {
        int i2;
        h.e(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        h.e(iterable, "$this$indexOf");
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    g();
                    throw null;
                } else if (h.a(t, next)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            i2 = ((List) iterable).indexOf(t);
        }
        return i2 >= 0;
    }

    public static final <T> List<T> e(List<? extends T> list) {
        h.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : f.V(list.get(0)) : e.b;
    }

    public static final char f(char[] cArr) {
        h.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T> List<T> h(T[] tArr) {
        h.e(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return e.b;
        }
        if (length == 1) {
            return f.V(tArr[0]);
        }
        h.e(tArr, "$this$toMutableList");
        return new ArrayList(c(tArr));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M i(Iterable<? extends e<? extends K, ? extends V>> iterable, M m2) {
        h.e(iterable, "$this$toMap");
        h.e(m2, "destination");
        h.e(m2, "$this$putAll");
        h.e(iterable, "pairs");
        for (e eVar : iterable) {
            m2.put(eVar.a(), eVar.b());
        }
        return m2;
    }

    public static final <K, V> Map<K, V> j(Map<? extends K, ? extends V> map) {
        h.e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }
}
