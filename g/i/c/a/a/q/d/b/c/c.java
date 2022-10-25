package g.i.c.a.a.q.d.b.c;

import android.webkit.JavascriptInterface;
import g.i.c.a.a.q.d.b.b.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c {
    public final Map<String, a> a;

    public c(Object obj) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        WeakReference weakReference = new WeakReference(obj);
        hashMap.put("reportEvent", new d(weakReference));
        hashMap.put("getSdkInfo", new e(weakReference));
    }

    @JavascriptInterface
    public void getSdkVersion(JSONObject jSONObject) {
        this.a.get("getSdkInfo").a("getSdkVersion", jSONObject);
    }

    @JavascriptInterface
    public void reportEvent(JSONObject jSONObject) {
        this.a.get("reportEvent").a("reportEvent", jSONObject);
    }
}
