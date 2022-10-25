package g.e.a.a.f.c0;

import android.util.SparseArray;
import g.e.a.a.b;
import java.util.HashMap;

public final class a {
    public static SparseArray<b> a = new SparseArray<>();
    public static HashMap<b, Integer> b;

    static {
        HashMap<b, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(b.DEFAULT, 0);
        b.put(b.VERY_LOW, 1);
        b.put(b.HIGHEST, 2);
        for (b next : b.keySet()) {
            a.append(b.get(next).intValue(), next);
        }
    }

    public static int a(b bVar) {
        Integer num = b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + bVar);
    }

    public static b b(int i2) {
        b bVar = a.get(i2);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(g.a.a.a.a.q("Unknown Priority for value ", i2));
    }
}
