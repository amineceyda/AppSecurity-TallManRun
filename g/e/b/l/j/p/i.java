package g.e.b.l.j.p;

import g.e.b.l.j.j.o0;
import g.e.b.l.j.p.j.a;
import g.e.b.l.j.p.j.b;
import g.e.b.l.j.p.j.c;
import g.e.b.l.j.p.j.e;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class i implements h {
    public e a(o0 o0Var, JSONObject jSONObject) throws JSONException {
        String str;
        long j2;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fabric");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("app");
        String string = jSONObject4.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject3.getString("bundle_id");
        String string3 = jSONObject3.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        String str2 = str;
        Locale locale = Locale.US;
        a aVar = new a(string, str2, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject4.optBoolean("update_required", false), jSONObject4.optInt("report_upload_variant", 0), jSONObject4.optInt("native_report_upload_variant", 0));
        c cVar = new c(8, 4);
        JSONObject jSONObject5 = jSONObject2.getJSONObject("features");
        b bVar = new b(jSONObject5.optBoolean("collect_reports", true), jSONObject5.optBoolean("collect_anrs", false));
        long j3 = (long) optInt2;
        if (jSONObject2.has("expires_at")) {
            j2 = jSONObject2.optLong("expires_at");
        } else {
            Objects.requireNonNull(o0Var);
            j2 = (j3 * 1000) + System.currentTimeMillis();
        }
        return new e(j2, aVar, cVar, bVar, optInt, optInt2);
    }
}
