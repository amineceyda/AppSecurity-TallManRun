package g.i.c.a.a.x.d;

import android.text.TextUtils;
import g.a.a.a.a;
import g.c.b.b.f;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements Runnable {
    public final /* synthetic */ Class b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f4555d;

    public d(f fVar, Class cls, String str) {
        this.f4555d = fVar;
        this.b = cls;
        this.c = str;
    }

    public void run() {
        StringBuilder sb;
        String str;
        h hVar = this.f4555d.a;
        Class cls = this.b;
        String str2 = this.c;
        String a = hVar.a.a(cls);
        String a2 = hVar.a(a, (String) null);
        if (!TextUtils.isEmpty(a2)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                jSONObject.remove(str2);
                hVar.c(a, jSONObject.toString());
                return;
            } catch (JSONException e2) {
                sb = a.i("json parse failure, error: ");
                str = e2.getLocalizedMessage();
            } catch (Error e3) {
                sb = a.i("deleteObject, error: ");
                str = e3.getLocalizedMessage();
            }
        } else {
            return;
        }
        sb.append(str);
        f.x("SpService", sb.toString());
    }
}
