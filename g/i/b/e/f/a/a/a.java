package g.i.b.e.f.a.a;

import android.text.TextUtils;
import g.i.b.e.b.c;
import g.i.b.e.b.e;
import g.i.b.e.h.b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements Runnable {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public final void run() {
        String str = e.f4111f;
        b bVar = this.b;
        byte[] b2 = bVar.b.b(str);
        try {
            if (!TextUtils.isEmpty(str) && !g.i.b.e.h.e.f(b2)) {
                JSONObject jSONObject = new JSONObject(new String(b2));
                e.b bVar2 = new e.b(str);
                jSONObject.getString("ipInfo");
                JSONObject optJSONObject = jSONObject.optJSONObject("resultMap");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray(keys.next());
                        if (optJSONArray != null) {
                            b.d(bVar2, optJSONArray);
                        }
                    }
                }
                bVar.c = bVar2;
                b.f("halley-cloud-HttpSchedulerClient", "update cached DirectAccessInfo succ...");
                c.a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
