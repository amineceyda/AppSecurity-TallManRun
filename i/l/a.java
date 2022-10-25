package i.l;

import i.o.c.e;
import i.o.c.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class a<T> implements Collection<T>, i.o.c.s.a {
    public final T[] b;
    public final boolean c;

    public a(T[] tArr, boolean z) {
        h.e(tArr, "values");
        this.b = tArr;
        this.c = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(java.lang.Object r6) {
        /*
            r5 = this;
            T[] r0 = r5.b
            java.lang.String r1 = "$this$contains"
            i.o.c.h.e(r0, r1)
            java.lang.String r1 = "$this$indexOf"
            i.o.c.h.e(r0, r1)
            r1 = 0
            if (r6 != 0) goto L_0x001b
            int r6 = r0.length
            r2 = 0
        L_0x0011:
            if (r2 >= r6) goto L_0x002c
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x001b:
            int r2 = r0.length
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x002c
            r4 = r0[r3]
            boolean r4 = i.o.c.h.a(r6, r4)
            if (r4 == 0) goto L_0x0029
            r2 = r3
            goto L_0x002d
        L_0x0029:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002c:
            r2 = -1
        L_0x002d:
            if (r2 < 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.l.a.contains(java.lang.Object):boolean");
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.b.length == 0;
    }

    public Iterator<T> iterator() {
        T[] tArr = this.b;
        h.e(tArr, "array");
        return new i.o.c.a(tArr);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.b.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.b;
        boolean z = this.c;
        Class<Object[]> cls = Object[].class;
        h.e(tArr, "$this$copyToArrayOfAny");
        if (z && h.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        h.d(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        return e.b(this, tArr);
    }
}
