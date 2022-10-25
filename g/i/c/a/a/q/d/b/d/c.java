package g.i.c.a.a.q.d.b.d;

import android.webkit.JavascriptInterface;
import g.c.b.b.f;
import g.i.c.a.a.q.d.b.b.a;
import java.util.Objects;
import org.json.JSONObject;

public class c {
    public final a a;

    public c(Object obj) {
        this.a = new a(obj);
    }

    @JavascriptInterface
    public String postMessage(String str) {
        b bVar;
        a aVar = this.a;
        Objects.requireNonNull(aVar);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("handlerName");
            String optString2 = jSONObject.optString("callbackId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                optJSONObject.put("callbackId", optString2);
            }
            bVar = new b(optString, optString2, optJSONObject);
        } catch (Exception unused) {
            f.x("JsBridgeControllerV2", "parse message error ");
            bVar = null;
        }
        if (bVar == null) {
            return a.a("500", "parse Message error");
        }
        try {
            d dVar = aVar.a;
            a aVar2 = dVar.a.get(bVar.a);
            if (aVar2 != null) {
                aVar2.a(bVar.a, bVar.b);
                return a.a("200", "");
            }
        } catch (Error e2) {
            f.x("JsBridgeControllerV2", "processMessage " + e2);
        }
        return a.a("500", "process Message Error");
    }
}
