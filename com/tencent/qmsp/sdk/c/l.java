package com.tencent.qmsp.sdk.c;

import com.tencent.qmsp.sdk.app.a;
import java.util.HashMap;

public class l implements c {
    private HashMap<String, e> a = new HashMap<>();

    public void a(e eVar) {
        String a2 = eVar.a();
        if (a2 != null && !this.a.containsKey(a2)) {
            this.a.put(a2, eVar);
        }
    }

    public Object getApplicationContext() {
        return a.getContext();
    }

    public int getRuntimeVersion() {
        return 512;
    }

    public e queryRuntimeInterface(String str) {
        if (str == null) {
            return null;
        }
        e eVar = this.a.get(str);
        if (eVar == null || str.equals(eVar.a())) {
            return eVar;
        }
        return null;
    }
}
