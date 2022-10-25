package g.i.c.a.a.q.d.b.d;

import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import java.util.HashMap;
import org.json.JSONObject;

public class a {
    public final d a;

    public a(Object obj) {
        this.a = new d(obj);
    }

    public static String a(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        hashMap.put(RemoteProxyUtil.KEY_RESULT, obj);
        return new JSONObject(hashMap).toString();
    }
}
