package g.i.c.a.a.n.e.d;

import java.util.Map;

public class b extends e {
    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        if ("appout".equals(str)) {
            a(map, map2);
            if ((map2 instanceof Map) && map2.containsKey("cur_pg") && (map2.get("cur_pg") instanceof Map)) {
                b(map, (Map) map2.get("cur_pg"));
            }
        }
    }
}
