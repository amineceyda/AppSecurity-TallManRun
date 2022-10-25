package g.i.c.a.a.q.d.b.c;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.c.b.b.f;
import g.i.c.a.a.q.d.b.c.b;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    public Object a;

    public a(Object obj) {
        this.a = obj;
    }

    @JavascriptInterface
    public String bridgeCall(String str) {
        String str2;
        String str3;
        String str4;
        StringBuilder sb;
        b bVar = b.C0175b.a;
        Object obj = this.a;
        Objects.requireNonNull(bVar);
        if ((!TextUtils.isEmpty(str) ? str.startsWith("DtJsBridge://") : false) && obj != null) {
            c cVar = bVar.a.containsKey(obj) ? bVar.a.get(obj) : null;
            if (cVar == null) {
                cVar = new c(obj);
                bVar.a.put(obj, cVar);
            }
            String substring = str.substring(13);
            f.w0("DT_JsBridge", "JsBridgeCheck jscall, jsonStr:" + substring + " url:" + "");
            if (!TextUtils.isEmpty(substring)) {
                try {
                    JSONObject jSONObject = new JSONObject(substring);
                    String string = jSONObject.getString("method");
                    JSONArray jSONArray = jSONObject.getJSONArray("types");
                    JSONArray jSONArray2 = jSONObject.getJSONArray(Constants.Service.ARGS);
                    int length = jSONArray.length();
                    Class[] clsArr = new Class[length];
                    Object[] objArr = new Object[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        g.h.a.a.S(jSONArray2, clsArr, objArr, jSONArray.optString(i2), i2);
                    }
                    str2 = g.h.a.a.J(200, cVar.getClass().getMethod(string, clsArr).invoke(cVar, objArr));
                } catch (Exception e2) {
                    if (e2.getCause() != null) {
                        sb = g.a.a.a.a.i("method execute error:");
                        str4 = e2.getCause().getMessage();
                    } else {
                        sb = g.a.a.a.a.i("method execute error:");
                        str4 = e2.getMessage();
                    }
                    sb.append(str4);
                    str3 = sb.toString();
                }
            } else {
                str3 = "call data empty";
                str2 = g.h.a.a.J(500, str3);
            }
        } else {
            str2 = "";
        }
        return TextUtils.isEmpty(str2) ? g.h.a.a.J(500, "") : str2;
    }
}
