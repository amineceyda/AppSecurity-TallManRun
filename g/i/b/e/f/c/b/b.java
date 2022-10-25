package g.i.b.e.f.c.b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    public Map<String, Object> a = new HashMap();

    public final byte[] a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.a.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), next.getValue());
            } catch (Exception unused) {
            }
        }
        return jSONObject.toString().getBytes();
    }
}
