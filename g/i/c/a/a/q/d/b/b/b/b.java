package g.i.c.a.a.q.d.b.b.b;

import g.c.b.b.f;
import g.i.c.a.a.q.d.b.a.a.a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {
    public WeakReference<Object> a;

    public b(WeakReference<Object> weakReference) {
        this.a = weakReference;
    }

    public void b(String str, String str2, String str3, a aVar) {
        if (g.i.c.a.a.y.a.c()) {
            e(str, str2, str3, aVar);
        } else {
            g.i.c.a.a.y.a.e(new a(this, str, str2, str3, aVar));
        }
    }

    public abstract g.i.c.a.a.n.d.b c();

    public Object d() {
        WeakReference<Object> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void e(String str, String str2, String str3, a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ret", str2).put("msg", str3);
            if (aVar != null) {
                try {
                    jSONObject = new JSONObject().put("sdkVersion", 2350);
                } catch (JSONException e2) {
                    f.x("JsSdkVersionEntity", "format " + e2);
                    jSONObject = null;
                }
                jSONObject2.put("data", jSONObject);
            }
        } catch (JSONException e3) {
            f.x("JsCallbackBuilder", "format " + e3);
        }
        String jSONObject3 = jSONObject2.toString();
        if (c() == g.i.c.a.a.n.d.b.JS_WINDOWS_CALLBACK) {
            String c = g.a.a.a.a.c("window.dtResponseCallbacks[", str, "]");
            Object d2 = d();
            g.h.a.a.L(d2, "javascript: if(" + c + ")" + c + "(" + jSONObject3 + ");");
        } else if (c() == g.i.c.a.a.n.d.b.JS_METHOND_CALLBACK) {
            g.h.a.a.L(d(), g.a.a.a.a.d("javascript:DtJsReporter.callback('", str, "',", jSONObject3, ");"));
        }
    }
}
