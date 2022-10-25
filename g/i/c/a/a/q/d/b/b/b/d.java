package g.i.c.a.a.q.d.b.b.b;

import android.text.TextUtils;
import g.i.c.a.a.q.d.b.b.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public abstract class d extends b implements a {
    public d(WeakReference<Object> weakReference) {
        super(weakReference);
    }

    public void a(String str, JSONObject jSONObject) {
        g.i.c.a.a.q.d.b.a.a.a aVar = new g.i.c.a.a.q.d.b.a.a.a(2350);
        String optString = jSONObject != null ? jSONObject.optString("callbackId") : null;
        if (!TextUtils.isEmpty(optString)) {
            b(optString, "0", "success", aVar);
        }
    }
}
