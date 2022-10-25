package com.tencent.qmsp.sdk.a;

import android.os.Build;
import com.tencent.qmsp.sdk.app.a;
import com.tencent.raft.raftframework.sla.SLAConstant;
import org.json.JSONObject;

public class d {
    public static JSONObject a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(e.a(0), i2);
            jSONObject.put(e.a(1), a.getAppID());
            jSONObject.put(e.a(2), a.getDevId());
            jSONObject.put(e.a(3), a.getUid());
            jSONObject.put(e.a(4), a.getQImeiVer());
            jSONObject.put(e.a(5), Build.VERSION.SDK_INT);
            jSONObject.put(e.a(6), c.c());
            jSONObject.put(e.a(7), c.e());
            jSONObject.put(e.a(8), System.currentTimeMillis());
            jSONObject.put(e.a(9), 1);
            jSONObject.put(e.a(10), c.h() ? SLAConstant.TYPE_DEPRECATED_START : "0");
            jSONObject.put(e.a(11), a.getmOAID());
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
