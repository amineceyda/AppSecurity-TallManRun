package com.ola.qsea.p;

import com.ola.qsea.l.a;
import com.ola.qsea.l.c;
import com.ola.qsea.p.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class r {
    public static final Map<String, r> a = new ConcurrentHashMap();
    public final String b;
    public final Object c = new Object();

    public r(String str) {
        this.b = str;
    }

    public static synchronized r a(String str) {
        r rVar;
        synchronized (r.class) {
            Map<String, r> map = a;
            rVar = map.get(str);
            if (rVar == null) {
                rVar = new r(str);
                map.put(str, rVar);
            }
        }
        return rVar;
    }

    public String a() {
        String e2 = e();
        if (!e2.isEmpty()) {
            if (c()) {
                return b(e2);
            }
            if (!d()) {
                return e2;
            }
        }
        return b();
    }

    public final String b() {
        String a2 = f.a().a(a.a(), this.b, p.m(this.b), "");
        d(a2);
        return a2;
    }

    public final String b(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a aVar = f.a.KEY_ENCRYPT_KEY;
            String optString = jSONObject.optString(aVar.a());
            f.a aVar2 = f.a.KEY_PARAMS;
            String optString2 = jSONObject.optString(aVar2.a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(aVar.a(), optString);
            jSONObject2.put(aVar2.a(), optString2);
            str2 = jSONObject2.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            str2 = "";
        }
        String a2 = f.a().a(a.a(), this.b, p.m(this.b), str2);
        d(a2);
        return a2;
    }

    public final void c(String str) {
        if (com.ola.qsea.d.a.g()) {
            synchronized (this.c) {
                com.ola.qsea.k.a.c(this.b).b("tn", str);
                com.ola.qsea.k.a.c(this.b).a("t_s_t", System.currentTimeMillis());
            }
        }
    }

    public boolean c() {
        long d2 = com.ola.qsea.k.a.c(this.b).d("t_s_t");
        return 0 != d2 && com.ola.qsea.d.a.b() > d2;
    }

    public final void d(String str) {
        com.ola.qsea.c.a.a().a(new q(this, str));
    }

    public boolean d() {
        return c.a(com.ola.qsea.k.a.c(this.b).d("t_s_t"));
    }

    public final String e() {
        String e2;
        synchronized (this.c) {
            e2 = com.ola.qsea.k.a.c(this.b).e("tn");
        }
        return e2;
    }
}
