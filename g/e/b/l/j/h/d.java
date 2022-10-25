package g.e.b.l.j.h;

import android.os.Bundle;
import g.e.b.l.j.f;
import g.e.b.l.j.i.a;
import g.e.b.l.j.i.b;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, b {
    public a a;

    public static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void a(a aVar) {
        this.a = aVar;
        f.a.b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void b(String str, Bundle bundle) {
        a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                f.a.f("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
