package g.e.b.l.j.p.k;

import android.text.TextUtils;
import g.e.b.l.j.j.k0;
import g.e.b.l.j.m.b;
import g.e.b.l.j.m.c;
import g.e.b.l.j.p.j.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {
    public final String a;
    public final b b;

    public a(String str, b bVar) {
        if (str != null) {
            this.b = bVar;
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public final g.e.b.l.j.m.a a(g.e.b.l.j.m.a aVar, f fVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.9");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f3704d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((k0) fVar.f3705e).c());
        return aVar;
    }

    public final void b(g.e.b.l.j.m.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.c.put(str, str2);
        }
    }

    public final Map<String, String> c(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f3708h);
        hashMap.put("display_version", fVar.f3707g);
        hashMap.put("source", Integer.toString(fVar.f3709i));
        String str = fVar.f3706f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject d(c cVar) {
        int i2 = cVar.a;
        g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
        fVar.e("Settings response code was: " + i2);
        if (i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203) {
            String str = cVar.b;
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
                StringBuilder i3 = g.a.a.a.a.i("Failed to parse settings JSON from ");
                i3.append(this.a);
                fVar2.g(i3.toString(), e2);
                fVar2.f("Settings response " + str);
                return null;
            }
        } else {
            StringBuilder j2 = g.a.a.a.a.j("Settings request failed; (status: ", i2, ") from ");
            j2.append(this.a);
            fVar.c(j2.toString());
            return null;
        }
    }
}
