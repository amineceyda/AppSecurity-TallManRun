package g.e.b.l.j.p;

import g.e.b.l.j.j.o0;
import g.e.b.l.j.p.j.e;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    public final o0 a;

    public g(o0 o0Var) {
        this.a = o0Var;
    }

    public e a(JSONObject jSONObject) throws JSONException {
        return (jSONObject.getInt("settings_version") != 3 ? new b() : new i()).a(this.a, jSONObject);
    }
}
