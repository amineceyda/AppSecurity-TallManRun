package g.i.b.e.f.c.b.f;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import g.i.b.e.b.e;
import g.i.b.e.f.c.b.b;
import g.i.b.e.f.c.b.c;
import g.i.b.e.f.j;
import org.json.JSONObject;

public final class a extends c {
    public final void b(b bVar) {
    }

    public final void c(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(RemoteProxyUtil.KEY_RESULT);
            if (!TextUtils.isEmpty(optString)) {
                if (Integer.parseInt(optString) == 1002) {
                    j.c("");
                    return;
                }
            }
        } catch (Throwable th) {
            if (g.i.b.e.h.b.a) {
                Log.d("halley-cloud-", "HttpStateHandler.onHttpRsp error.", th);
            }
            if (g.i.b.e.h.b.b) {
                g.i.b.e.h.b.d("D", "halley-cloud-", "HttpStateHandler.onHttpRsp error.", th);
                return;
            }
            return;
        }
        String optString2 = jSONObject.optString("deviceId");
        if (!TextUtils.isEmpty(optString2)) {
            String b = j.b();
            if (!TextUtils.isEmpty(optString2) && !optString2.equals(b)) {
                j.c(optString2);
            }
        } else {
            j.c("");
        }
        String optString3 = jSONObject.optString("oper");
        if (!TextUtils.isEmpty(optString3)) {
            g.i.b.e.f.c.a.b.a().b(e.f4111f, optString3);
        }
    }
}
