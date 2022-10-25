package g.i.c.a.a.n.f;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class b {
    public static final Set<String> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("imp");
        hashSet.add("imp_end");
        hashSet.add("clck");
    }

    public static String a(Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        Object obj2 = ((Map) obj).get("dt_appkey");
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }
}
