package g.i.c.a.a.n.e.d;

import java.util.Map;
import java.util.Objects;

public class j extends d {
    public l a = new l();

    public Object c(Map<?, ?> map, String str) {
        Objects.requireNonNull(this.a);
        return map.remove(str);
    }

    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        super.f(str, map, map2);
        if (map != null && map2 != null) {
            this.a.k(map, map2);
            Object j2 = j(map2, "element_path");
            if (j2 != null) {
                map.put("dt_element_path", j2);
            }
        }
    }

    public String k(Map<String, Object> map) {
        if (!(map instanceof Map)) {
            return null;
        }
        Objects.requireNonNull(this.a);
        return (String) map.remove("eid");
    }
}
