package g.i.c.a.a.x.d;

import g.a.a.a.a;
import g.c.b.b.f;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements Runnable {
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f4554d;

    public c(f fVar, List list, List list2) {
        this.f4554d = fVar;
        this.b = list;
        this.c = list2;
    }

    public void run() {
        JSONObject jSONObject;
        StringBuilder sb;
        String str;
        h hVar = this.f4554d.a;
        List list = this.b;
        List list2 = this.c;
        Objects.requireNonNull(hVar);
        if (!list.isEmpty()) {
            String a = hVar.a.a(list.get(0).getClass());
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
                    sb = a.i("insertObjects, error: ");
                    str = e3.getLocalizedMessage();
                    sb.append(str);
                    f.x("SpService", sb.toString());
                    return;
                }
            } else {
                jSONObject = new JSONObject();
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                jSONObject.put((String) list2.get(i2), hVar.b.b(list.get(i2)));
            }
            hVar.c(a, jSONObject.toString());
        }
    }
}
