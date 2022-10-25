package com.tencent.qmsp.sdk.b;

import android.text.TextUtils;
import com.tencent.qmsp.sdk.a.e;
import com.tencent.qmsp.sdk.b.a;
import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.f.h;
import org.json.JSONObject;

public class g {
    private static g c;
    /* access modifiers changed from: private */
    public String a = "Qp.netImp";
    private f b = null;

    public class a implements f {
        public a() {
        }

        public void a(int i2, String str, int i3, JSONObject jSONObject, e eVar) {
            try {
                JSONObject a2 = g.this.b(8, jSONObject);
                if (a2 != null) {
                    a.d a3 = a.a(i2, str, i3, a2);
                    if (a3.b == 0) {
                        JSONObject jSONObject2 = a3.a;
                        eVar.a(161, (jSONObject2 == null || !(jSONObject2 instanceof JSONObject)) ? null : g.this.b(9, jSONObject2));
                        return;
                    }
                    eVar.a(162, a3.a);
                    return;
                }
                eVar.a(163, (JSONObject) null);
            } catch (Exception e2) {
                com.tencent.qmsp.sdk.f.g.b(g.this.a, 0, "send fail！");
                eVar.a(162, (JSONObject) null);
                e2.printStackTrace();
            }
        }
    }

    private g() {
    }

    private JSONObject a(int i2, JSONObject jSONObject) {
        if ((jSONObject instanceof JSONObject) && jSONObject != null) {
            if (i2 == 8) {
                try {
                    String a2 = f.a(i2, 0, 0, 0, jSONObject.toString(), "");
                    if (a2 != null) {
                        if (!TextUtils.isEmpty(a2)) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(e.a(17), a2);
                            return jSONObject2;
                        }
                    }
                    return null;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (i2 == 9) {
                String a3 = f.a(i2, 0, 0, 0, a(jSONObject), "");
                if (a3 != null) {
                    if (!TextUtils.isEmpty(a3)) {
                        return new JSONObject(a3);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static g b() {
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g();
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: private */
    public JSONObject b(int i2, JSONObject jSONObject) {
        if (!(jSONObject instanceof JSONObject) || jSONObject == null) {
            return null;
        }
        return a(i2, jSONObject);
    }

    public String a(JSONObject jSONObject) {
        try {
            return jSONObject.optString(e.a(17));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a() {
        this.b = new a();
    }

    public void a(int i2, String str, int i3, JSONObject jSONObject, e eVar) {
        f fVar;
        if (!(jSONObject instanceof JSONObject) || jSONObject == null || eVar == null || (fVar = this.b) == null) {
            com.tencent.qmsp.sdk.f.g.d(this.a, 0, h.a(h.a));
        } else {
            fVar.a(i2, str, i3, jSONObject, eVar);
        }
    }

    public void a(f fVar) {
        if (fVar != null) {
            this.b = fVar;
        } else {
            com.tencent.qmsp.sdk.f.g.d(this.a, 0, h.a(h.a));
        }
    }
}
