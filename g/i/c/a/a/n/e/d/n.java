package g.i.c.a.a.n.e.d;

import java.util.Map;

public class n extends d {
    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        Object j2;
        super.f(str, map, map2);
        if (map != null && map2 != null && (j2 = j(map2, "element_params")) != null) {
            map.put("dt_element_params", j2);
        }
    }

    public String k(Map<String, Object> map) {
        if (!(map instanceof Map)) {
            return null;
        }
        return (String) map.get("eid");
    }
}
