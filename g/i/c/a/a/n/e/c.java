package g.i.c.a.a.n.e;

import g.i.c.a.a.l.h;
import g.i.c.a.a.u.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends b {
    public Map<String, Object> b(List<h> list, h hVar) {
        HashMap hashMap = new HashMap();
        c(list, hashMap);
        d(hVar, hashMap);
        return hashMap;
    }

    public void c(List<h> list, Map<String, Object> map) {
        throw null;
    }

    public final void d(h hVar, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (hVar != null) {
            hashMap.put("pgid", hVar.a());
            Map<String, Object> b = hVar.b();
            if (b != null) {
                hashMap.putAll(b);
            }
        }
        map.put("cur_pg", hashMap);
    }
}
