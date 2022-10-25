package g.i.c.a.a.n.e.d;

import android.text.TextUtils;
import e.e.i.b;
import g.a.a.a.a;
import java.util.Map;

public class l extends e {
    public Object c(Map<?, ?> map, String str) {
        return map.remove(str);
    }

    public void k(Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> l2 = l(map2, "cur_pg");
        j(map2, "cur_pg");
        if (map != null && l2 != null) {
            map.put("dt_pg_path", l2.remove("pg_path"));
            map.put("dt_is_interactive_flag", l2.remove("dt_is_interactive_flag"));
            Map<String, Object> l3 = l(l2, "ref_pg");
            j(l2, "ref_pg");
            map.put("dt_refpg_path", j(l3, "pg_path"));
            m(map2, l3, "refpg_");
            m(map2, l2, "pg_");
        }
    }

    public Map<String, Object> l(Map<String, Object> map, String str) {
        if (!(map instanceof Map) || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public void m(Map<String, Object> map, Map<String, Object> map2, String str) {
        if ((map instanceof Map) && !b.G(map2)) {
            for (Map.Entry next : map2.entrySet()) {
                if (!(next == null || next.getKey() == null || next.getValue() == null)) {
                    StringBuilder i2 = a.i(str);
                    i2.append((String) next.getKey());
                    map.put(i2.toString(), next.getValue());
                }
            }
        }
    }
}
