package g.h.a.c.a.s;

import i.o.c.f;
import i.o.c.h;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final b b = new b((f) null);
    public static final a c = new a(new C0140a().a, (f) null);
    public final JSONObject a;

    /* renamed from: g.h.a.c.a.s.a$a  reason: collision with other inner class name */
    public static final class C0140a {
        public final JSONObject a;

        public C0140a() {
            JSONObject jSONObject = new JSONObject();
            this.a = jSONObject;
            a("autoplay", 0);
            a("controls", 0);
            a("enablejsapi", 1);
            a("fs", 0);
            try {
                jSONObject.put("origin", "https://www.youtube.com");
                a("rel", 0);
                a("showinfo", 0);
                a("iv_load_policy", 3);
                a("modestbranding", 1);
                a("cc_load_policy", 0);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
            }
        }

        public final void a(String str, int i2) {
            try {
                this.a.put(str, i2);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i2);
            }
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public a(JSONObject jSONObject, f fVar) {
        this.a = jSONObject;
    }

    public String toString() {
        String jSONObject = this.a.toString();
        h.d(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }
}
