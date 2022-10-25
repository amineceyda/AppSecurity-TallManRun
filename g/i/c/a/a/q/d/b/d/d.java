package g.i.c.a.a.q.d.b.d;

import g.i.c.a.a.q.d.b.b.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class d {
    public final Map<String, a> a;

    public d(Object obj) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        WeakReference weakReference = new WeakReference(obj);
        hashMap.put("vr_reportEvent", new e(weakReference));
        hashMap.put("vr_getSdkVersion", new f(weakReference));
    }
}
