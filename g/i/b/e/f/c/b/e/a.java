package g.i.b.e.f.c.b.e;

import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.i.b.e.b.j;
import g.i.b.e.f.c.b.c;
import g.i.b.e.f.c.b.d;
import org.json.JSONObject;

public final class a extends c {
    public final j b = new j();

    /* renamed from: g.i.b.e.f.c.b.e.a$a  reason: collision with other inner class name */
    public class C0155a implements Runnable {
        public C0155a() {
        }

        public final void run() {
            String string = g.i.b.e.c.f4125g.getSharedPreferences(a.e(), 0).getString("halley_cloud_param_content", "");
            g.i.b.e.h.b.f("halley-cloud-HttpRspSetting", "loadLocal jsonData:".concat(String.valueOf(string)));
            if (!TextUtils.isEmpty(string)) {
                try {
                    a.this.b.b(string);
                } catch (Throwable th) {
                    th.printStackTrace();
                    a.d("");
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            try {
                d.e().c.b(a.this.b.a(), g.i.b.e.f.c.a.b.a().d());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public a() {
        g.i.b.e.c.n.post(new C0155a());
    }

    public static void d(String str) {
        g.i.b.e.c.f4125g.getSharedPreferences(e(), 0).edit().putString("halley_cloud_param_content", str).commit();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder("Halley_Cloud_Param_Content_");
        sb.append(g.i.b.e.c.f4126h);
        sb.append("_for_SettingsHandler");
        sb.append(g.i.b.e.c.o ? "_test" : "");
        return sb.toString();
    }

    public final void b() {
        f();
    }

    public final void b(g.i.b.e.f.c.b.b bVar) {
        String optString;
        j jVar = this.b;
        synchronized (jVar) {
            JSONObject jSONObject = jVar.a;
            optString = jSONObject != null ? jSONObject.optString(Constants.Raft.VERSION) : "";
        }
        bVar.a.put("confVersion", optString);
    }

    public final void c(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("Setting");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("data");
                if (!TextUtils.isEmpty(optString)) {
                    this.b.b(optString);
                    d(this.b.a());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        } finally {
            f();
        }
    }

    public final void f() {
        g.i.b.e.c.n.post(new b());
    }
}
