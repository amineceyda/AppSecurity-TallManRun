package g.i.c.a.a.n.e;

import android.text.TextUtils;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.c.a.a.l.h;
import g.i.c.a.a.n.e.d.e;
import g.i.c.a.a.n.e.d.f;
import g.i.c.a.a.u.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a extends b {
    public Map<String, Object> a(String str, Map<String, Object> map, Map<String, Object> map2) {
        ((e) f.a(str)).g(str, map, map2);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("dt_protoversion", SLAConstant.TYPE_DEPRECATED_START);
        if (map2 != null) {
            hashMap.put("udf_kv", map2);
        }
        return hashMap;
    }

    public Map<String, Object> b(List<h> list, h hVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            h hVar2 = list.get(size);
            if (hVar2 != null) {
                String str = hVar2.a;
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("eid", str);
                }
                Map<String, Object> b = hVar2.b();
                if (!e.e.i.b.G(b)) {
                    hashMap.putAll(b);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("eid", str);
                arrayList.add(0, hashMap2);
            }
        }
        hashMap.put("element_params", arrayList);
        HashMap hashMap3 = new HashMap();
        if (hVar != null) {
            hashMap3.put("pgid", hVar.a);
            if (!e.e.i.b.G(hVar.b())) {
                hashMap3.putAll(hVar.b());
            }
        }
        hashMap.put("cur_pg", hashMap3);
        return hashMap;
    }
}
