package g.e.b.l.j.p;

import g.e.b.l.j.j.o0;
import g.e.b.l.j.p.j.a;
import g.e.b.l.j.p.j.c;
import g.e.b.l.j.p.j.e;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements h {
    public static g.e.b.l.j.p.j.b b(JSONObject jSONObject) {
        return new g.e.b.l.j.p.j.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    public static long c(o0 o0Var, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(o0Var);
        return (j2 * 1000) + System.currentTimeMillis();
    }

    public e a(o0 o0Var, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        return new e(c(o0Var, (long) optInt2, jSONObject2), new a(jSONObject3.getString("status"), jSONObject3.getString("url"), jSONObject3.getString("reports_url"), jSONObject3.getString("ndk_reports_url"), jSONObject3.optBoolean("update_required", false)), new c(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), b(jSONObject2.getJSONObject("features")), optInt, optInt2);
    }
}
