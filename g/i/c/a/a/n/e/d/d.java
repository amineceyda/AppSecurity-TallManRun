package g.i.c.a.a.n.e.d;

import android.text.TextUtils;
import java.util.Map;

public abstract class d extends e {
    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        if ((map2 instanceof Map) && map2.containsKey("cur_pg") && (map2.get("cur_pg") instanceof Map)) {
            b(map, (Map) map2.get("cur_pg"));
        }
        String k2 = k(map2);
        if (!TextUtils.isEmpty(k2)) {
            map.put("dt_eid", k2);
        }
        if ("imp_end".equals(str)) {
            h(map2, "element_lvtm", map, "dt_element_lvtm");
            h(map2, "element_area", map, "dt_element_area");
            h(map2, "ele_imp_area", map, "dt_ele_imp_area");
            h(map2, "ele_imp_rate", map, "dt_ele_imp_rate");
        }
    }

    public abstract String k(Map<String, Object> map);
}
