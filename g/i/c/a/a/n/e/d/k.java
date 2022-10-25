package g.i.c.a.a.n.e.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class k extends m {
    public l a = new l();

    public Object c(Map<?, ?> map, String str) {
        Objects.requireNonNull(this.a);
        return map.remove(str);
    }

    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        super.f(str, map, map2);
        if (map != null && map2 != null) {
            l lVar = this.a;
            Map<String, Object> l2 = lVar.l(map2, "ref_pg");
            lVar.j(map2, "ref_pg");
            Object j2 = this.a.j(map2, "pg_path");
            Object j3 = this.a.j(l2, "pg_path");
            Object j4 = this.a.j(map2, "dt_is_interactive_flag");
            Object j5 = this.a.j(map2, "dt_pg_isreturn");
            HashMap hashMap = new HashMap();
            Iterator<Map.Entry<String, Object>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                it.remove();
                hashMap.put((String) next.getKey(), next.getValue());
            }
            this.a.m(map2, hashMap, "pg_");
            this.a.m(map2, l2, "refpg_");
            map.put("dt_pg_path", j2);
            map.put("dt_refpg_path", j3);
            if ("pgout".equals(str)) {
                map.put("dt_is_interactive_flag", j4);
            } else if ("pgin".equals(str)) {
                map.put("dt_pg_isreturn", j5);
            }
        }
    }
}
