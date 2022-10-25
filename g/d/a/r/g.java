package g.d.a.r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class g<T, Y> {
    public final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    public long b;
    public long c;

    public g(long j2) {
        this.b = j2;
    }

    public synchronized Y a(T t) {
        return this.a.get(t);
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t, Y y) {
    }

    public synchronized Y d(T t, Y y) {
        long b2 = (long) b(y);
        if (b2 >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += b2;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.c -= (long) b(put);
            if (!put.equals(y)) {
                c(t, put);
            }
        }
        e(this.b);
        return put;
    }

    public synchronized void e(long j2) {
        while (this.c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.c -= (long) b(value);
            Object key = next.getKey();
            it.remove();
            c(key, value);
        }
    }
}
