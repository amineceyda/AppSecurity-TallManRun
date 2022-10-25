package g.i.c.a.a.n.e;

import g.a.a.a.a;
import g.i.c.a.a.l.h;
import g.i.c.a.a.n.e.d.f;
import g.i.c.a.a.n.e.d.o;
import g.i.c.a.a.r.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

public class b extends c {
    public Map<String, Object> a(String str, Map<String, Object> map, Map<String, Object> map2) {
        o a = f.a(str);
        if (e.b.a.a) {
            StringBuilder sb = new StringBuilder();
            if (map2 != null) {
                sb.append(new JSONObject(new TreeMap(map2)));
            }
            String w = a.w("DTParamsNewsFlatten_", str);
            StringBuilder i2 = a.i("打平参数： \n\n");
            i2.append(sb.toString());
            g.c.b.b.f.K(w, i2.toString());
        }
        ((g.i.c.a.a.n.e.d.e) a).g(str, map, map2);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("dt_protoversion", "2");
        hashMap.put("udf_kv", map2);
        return hashMap;
    }

    public void c(List<h> list, Map<String, Object> map) {
        List<String> e2 = e(list);
        ArrayList arrayList = new ArrayList();
        ListIterator<h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int previousIndex = listIterator.previousIndex();
            h previous = listIterator.previous();
            if (previous != null) {
                String str = (String) ((ArrayList) e2).get(previousIndex);
                String a = previous.a();
                map.put("eid", a);
                Map<String, Object> b = previous.b();
                if (b != null) {
                    for (Map.Entry next : b.entrySet()) {
                        StringBuilder i2 = a.i(str);
                        i2.append((String) next.getKey());
                        map.put(i2.toString(), next.getValue());
                    }
                }
                arrayList.add(0, str + a);
            }
        }
        map.put("element_path", arrayList);
    }

    public final List<String> e(List<h> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (h next : list) {
            if (next != null) {
                String a = next.a();
                int i2 = 0;
                Object obj = hashMap.get(a);
                if (obj != null) {
                    i2 = obj;
                }
                int intValue = ((Integer) i2).intValue();
                if (intValue == 0) {
                    str = "";
                } else {
                    str = "p" + intValue + "_";
                }
                arrayList.add(str);
                hashMap.put(a, Integer.valueOf(intValue + 1));
            }
        }
        return arrayList;
    }
}
