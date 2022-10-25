package g.i.b.e.f.c.b.a;

import android.os.SystemClock;
import g.i.b.e.b.e;
import g.i.b.e.f.c.a.a;
import g.i.b.e.f.c.b.b;
import g.i.b.e.f.c.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class a extends c {
    public static String c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f4200d = true;
    public a.f b;

    public final void b(b bVar) {
        String str;
        if (g.h.a.a.b("detect_use_http_platform_on", 0, 1, 1) == 0) {
            str = "ignore detect when K_detect_use_http_platform_on is 0..";
        } else if (g.h.a.a.b("detect_when_start", 0, 1, 1) != 0 || !f4200d) {
            String str2 = c;
            if (str2 == null || !str2.equals(e.f4111f)) {
                c = e.f4111f;
                if (g.h.a.a.b("detect_only_in_ipv6_on", 0, 1, 1) == 1) {
                    if (e.c == 3 || e.c == 2) {
                        g.i.b.e.h.b.c("halley-cloud-HttpDetectHandler", "In ipv6 network, just trigger detect pull");
                    } else {
                        str = "Not in ipv6 network, just ignore detect pull";
                    }
                }
                bVar.a.put("detectflag", 1);
                return;
            }
            str = "lastApn is the same as the last.. just ignore detect";
        } else {
            f4200d = false;
            str = "ignore detect when init..";
        }
        g.i.b.e.h.b.c("halley-cloud-HttpDetectHandler", str);
    }

    public final void c(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("NetmonTask");
            if (optJSONObject != null) {
                c cVar = new c(optJSONObject);
                ArrayList<b> arrayList = cVar.a;
                if (arrayList != null) {
                    if (arrayList.size() != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<b> it = cVar.a.iterator();
                        while (it.hasNext()) {
                            b next = it.next();
                            a.b a = a.b.a(cVar.b, next.a, next.b);
                            if (a != null) {
                                Map<String, String> map = cVar.f4203e;
                                int i2 = cVar.c;
                                Map<String, String> map2 = next.f4201d;
                                Map<String, byte[]> map3 = next.c;
                                a.f4188j = map;
                                a.f4189k = map2;
                                a.c = map3;
                                a.f4190l = SystemClock.elapsedRealtime() + ((long) (i2 * 1000));
                                arrayList2.add(a);
                            }
                        }
                        a.f fVar = this.b;
                        if (fVar != null) {
                            ((a.d) fVar).a(arrayList2);
                            return;
                        }
                        if (a.d.f4196i == null) {
                            synchronized (a.d.class) {
                                if (a.d.f4196i == null) {
                                    a.d.f4196i = new a.d();
                                }
                            }
                        }
                        a.d dVar = a.d.f4196i;
                        this.b = dVar;
                        dVar.a(arrayList2);
                        return;
                    }
                }
                g.i.b.e.h.b.i("HttpDetectorHandler", "httpNetmonTask is empty");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
