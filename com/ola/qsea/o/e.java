package com.ola.qsea.o;

import android.text.TextUtils;
import com.ola.qsea.d.c;
import com.ola.qsea.l.b;
import com.ola.qsea.v.d;
import g.a.a.a.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class e {
    public static final e a = new e();
    public int b = -1;
    public String c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f446d = "";

    public static e a() {
        return a;
    }

    public String a(String str, String str2) {
        if (!str.isEmpty()) {
            return a.w(str, str2);
        }
        return com.ola.qsea.f.a.a() + str2;
    }

    public String a(Map<String, Object> map, String str, String str2, String str3) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject, str2);
            a(jSONObject, str3);
            a(map, jSONObject);
            try {
                String jSONObject2 = jSONObject.toString();
                if (b.a()) {
                    com.ola.qsea.m.a.b("SDK_INIT ｜ UPLOAD", "(appKey: %s)raw content: upload type: %s, parameter: %s", str2, str, jSONObject2);
                }
                str4 = com.ola.qsea.b.a.b(jSONObject2, "5ebdd6b59d2d451f");
            } catch (Exception e2) {
                e2.printStackTrace();
                str4 = "";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(f.REPORT_TYPE.a(), str);
            jSONObject3.put(f.REPORT_DATA.a(), str4);
            return jSONObject3.toString();
        } catch (JSONException e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public final void a(Map<String, Object> map, JSONObject jSONObject) throws JSONException {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    public final void a(JSONObject jSONObject, String str) throws JSONException {
        c n = c.n();
        jSONObject.put(f.REPORT_DATA_IP.a(), n.o());
        jSONObject.put(f.REPORT_DATA_NET_TYPE.a(), n.r());
        jSONObject.put(f.REPORT_AD.a(), str);
    }

    public final void b(JSONObject jSONObject, String str) throws JSONException {
        if (this.b == -1) {
            this.b = c.n().y();
        }
        com.ola.qsea.v.a aVar = new com.ola.qsea.v.a(str);
        if (TextUtils.isEmpty(this.c)) {
            this.c = aVar.G();
        }
        if (TextUtils.isEmpty(this.f446d)) {
            this.f446d = aVar.J();
        }
        String sdkVersion = d.b().getSdkVersion();
        jSONObject.put(f.REPORT_PLATFORM_ID.a(), this.b);
        jSONObject.put(f.REPORT_DATA_Q16.a(), this.c);
        jSONObject.put(f.REPORT_DATA_Q36.a(), this.f446d);
        jSONObject.put(f.REPORT_APPKEY.a(), str);
        jSONObject.put(f.REPORT_SDKVERSION.a(), sdkVersion);
    }
}
