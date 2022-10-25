package g.i.c.a.a.n.e.d;

import java.util.Iterator;
import java.util.Map;

public class e extends a {
    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
    }

    public final void g(String str, Map<String, Object> map, Map<String, Object> map2) {
        if (map instanceof Map) {
            if (map.containsKey("usid")) {
                map.put("dt_usid", map.remove("usid"));
            }
            if (map.containsKey("us_stmp")) {
                map.put("dt_usstmp", map.remove("us_stmp"));
            }
            if (map.containsKey("ussn")) {
                map.put("dt_ussn", map.remove("ussn"));
            }
            if (map.containsKey("coldstart")) {
                map.put("dt_coldstart", map.remove("coldstart"));
            }
        }
        f(str, map, map2);
        if (map2 instanceof Map) {
            Iterator<Map.Entry<String, Object>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                String str2 = (String) next.getKey();
                if (str2.startsWith("dt_")) {
                    map.put(str2, next.getValue());
                    it.remove();
                }
            }
        }
    }

    public void h(Map<String, Object> map, String str, Map<String, Object> map2, String str2) {
        map2.put(str2, map instanceof Map ? c(map, str) : null);
    }

    public void i(Map<String, Object> map, String str, Map<String, Object> map2, String str2) {
        Object c = map instanceof Map ? c(map, str) : null;
        if (c != null) {
            map2.put(str2, c);
        }
    }

    public Object j(Map<String, Object> map, String str) {
        if (map == null || str == null || !map.containsKey(str)) {
            return null;
        }
        return map.remove(str);
    }
}
