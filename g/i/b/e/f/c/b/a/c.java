package g.i.b.e.f.c.b.a;

import g.i.b.e.h.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {
    public ArrayList<b> a = null;
    public String b = "";
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, byte[]> f4202d = null;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f4203e = null;

    public c(JSONObject jSONObject) {
        try {
            this.b = jSONObject.optString("taskid");
            this.c = jSONObject.optInt("lifetime");
            JSONArray optJSONArray = jSONObject.optJSONArray("subtasks");
            if (optJSONArray != null) {
                this.a = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    b bVar = new b();
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    bVar.a = (byte) jSONObject2.optInt("type");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("targets");
                    bVar.b = new ArrayList<>();
                    if (optJSONArray2 != null) {
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            bVar.b.add((String) optJSONArray2.get(i3));
                        }
                    }
                    JSONObject optJSONObject = jSONObject2.optJSONObject("extra");
                    Iterator<String> keys = optJSONObject.keys();
                    bVar.c = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bVar.c.put(next, a.b(optJSONObject.optString(next)));
                    }
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("subinfo");
                    Iterator<String> keys2 = optJSONObject2.keys();
                    bVar.f4201d = new HashMap();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        bVar.f4201d.put(next2, optJSONObject2.optString(next2));
                    }
                    this.a.add(bVar);
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
            Iterator<String> keys3 = optJSONObject3.keys();
            this.f4202d = new HashMap();
            while (keys3.hasNext()) {
                String next3 = keys3.next();
                this.f4202d.put(next3, a.b(optJSONObject3.optString(next3)));
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("taskinfo");
            Iterator<String> keys4 = optJSONObject4.keys();
            this.f4203e = new HashMap();
            while (keys4.hasNext()) {
                String next4 = keys4.next();
                this.f4203e.put(next4, optJSONObject4.optString(next4));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
