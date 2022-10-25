package com.tencent.qmsp.sdk.a;

import com.tencent.qmsp.sdk.b.e;
import com.tencent.qmsp.sdk.f.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {
    /* access modifiers changed from: private */
    public static String a = "Qp.RPT";

    public static class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ JSONObject b;

        public a(int i2, JSONObject jSONObject) {
            this.a = i2;
            this.b = jSONObject;
        }

        public void run() {
            f.b(this.a, this.b);
        }
    }

    public static class b implements e {
        public void a(int i2, JSONObject jSONObject) {
            if (i2 == 161) {
                g.a(f.a, 1, String.format("ret: %d", new Object[]{161}));
            }
        }
    }

    public static void a(String str, int i2) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a2 = d.a(3);
            if (a(a2)) {
                try {
                    jSONObject2.put(e.a(15), a2);
                    jSONObject2.put(e.a(16), new JSONObject().put("log", str));
                    jSONArray.put(jSONObject2);
                    jSONObject.put("arr", jSONArray);
                    g.a(a, 1, jSONObject2.toString());
                    com.tencent.qmsp.sdk.app.b.e().a((Runnable) new a(i2, jSONObject));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static boolean a(JSONObject jSONObject) {
        try {
            jSONObject.put(e.a(12), c.b());
            jSONObject.put(e.a(13), c.f());
            jSONObject.put(e.a(14), c.a());
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static void b(int i2, JSONObject jSONObject) {
        if (jSONObject != null) {
            String str = a;
            g.a(str, 0, "Rpt: " + jSONObject);
            com.tencent.qmsp.sdk.b.g.b().a(3, com.tencent.qmsp.sdk.app.a.getAppID(), i2, jSONObject, new b());
        }
    }
}
