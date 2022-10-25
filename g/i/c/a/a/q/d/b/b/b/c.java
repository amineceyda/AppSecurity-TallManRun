package g.i.c.a.a.q.d.b.b.b;

import android.text.TextUtils;
import g.c.b.b.f;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.j.b;
import g.i.c.a.a.q.d.b.b.a;
import g.i.c.a.a.r.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c extends b implements a {
    public c(WeakReference<Object> weakReference) {
        super(weakReference);
    }

    public void a(String str, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2;
        HashMap hashMap;
        boolean z;
        String str3;
        String str4;
        String str5;
        String optString = jSONObject == null ? null : jSONObject.optString("eventId", "");
        if (jSONObject == null) {
            str2 = null;
        } else {
            str2 = jSONObject.optString("appKey", "");
        }
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("params");
        }
        if (!TextUtils.isEmpty(optString)) {
            if (jSONObject2 == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    try {
                        str5 = jSONObject2.get(valueOf).toString();
                    } catch (JSONException e2) {
                        f.x("JsReportHandler", "wrapJsonToMap " + e2);
                        str5 = null;
                    }
                    hashMap.put(valueOf, str5);
                }
            }
            String optString2 = jSONObject != null ? jSONObject.optString("callbackId") : null;
            if (TextUtils.isEmpty(str2)) {
                e eVar = e.b.a;
                Object d2 = d();
                Objects.requireNonNull(eVar);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = hashMap != null ? new HashMap(hashMap) : null;
                if (hashMap3 != null) {
                    hashMap2.putAll(hashMap3);
                }
                z = eVar.r(new b(d2, optString, hashMap2, (g.i.c.a.a.j.a) null, (String) null));
            } else {
                e eVar2 = e.b.a;
                Objects.requireNonNull(eVar2);
                f.K("VideoReportInner", "reportEvent: eventId=" + optString + ", appKey=" + str2 + ", map=" + hashMap);
                if (!TextUtils.isEmpty(optString)) {
                    g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.a(6);
                    cVar.a = optString;
                    if (hashMap != null) {
                        cVar.c(hashMap);
                    }
                    g.i.c.a.a.t.g.c((Object) null, cVar, str2);
                    z = true;
                } else if (!eVar2.a) {
                    z = false;
                } else {
                    throw new IllegalArgumentException("reportEvent, eventId is empty");
                }
            }
            if (!TextUtils.isEmpty(optString2)) {
                if (z) {
                    str4 = "200";
                    str3 = "success";
                } else {
                    str4 = "500";
                    str3 = "fail";
                }
                b(optString2, str4, str3, (g.i.c.a.a.q.d.b.a.a.a) null);
            }
        }
    }
}
