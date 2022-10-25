package g.i.c.a.a.x.d;

import g.a.a.a.a;
import g.c.b.b.f;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements Runnable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f4553d;

    public b(f fVar, Object obj, String str) {
        this.f4553d = fVar;
        this.b = obj;
        this.c = str;
    }

    public void run() {
        JSONObject jSONObject;
        StringBuilder sb;
        String str;
        h hVar = this.f4553d.a;
        Object obj = this.b;
        String str2 = this.c;
        String a = hVar.a.a(obj.getClass());
        String a2 = hVar.a(a, (String) null);
        if (a2 != null) {
            try {
                jSONObject = new JSONObject(a2);
            } catch (JSONException e2) {
                sb = a.i("json parse failure, error: ");
                str = e2.getLocalizedMessage();
                sb.append(str);
                f.x("SpService", sb.toString());
                return;
            } catch (Error e3) {
                sb = a.i("insertObject, error: ");
                str = e3.getLocalizedMessage();
                sb.append(str);
                f.x("SpService", sb.toString());
                return;
            }
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put(str2, hVar.b.b(obj));
        hVar.c(a, jSONObject.toString());
    }
}
