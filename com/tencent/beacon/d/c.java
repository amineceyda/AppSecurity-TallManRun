package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

public class c {
    public final Context a;
    private final boolean b;
    /* access modifiers changed from: private */
    public boolean c = false;

    public c(Context context) {
        this.a = context;
        this.b = b.f(context);
    }

    private Map<String, String> b() {
        this.c = b.f583d;
        HashMap hashMap = new HashMap(8);
        e l2 = e.l();
        g e2 = g.e();
        hashMap.put("A19", l2.q());
        hashMap.put("A66", b.f(this.a) ? "F" : "B");
        hashMap.put("A68", "" + b.b(this.a));
        hashMap.put("A85", this.c ? "Y" : "N");
        hashMap.put("A20", e2.j());
        hashMap.put("A69", e2.k());
        return hashMap;
    }

    /* access modifiers changed from: private */
    public boolean c() {
        return ((StatModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STAT)).c(b());
    }

    public void a() {
        a a2 = a.a();
        if (!com.tencent.beacon.base.util.b.d().equals(a2.getString("active_user_date", ""))) {
            com.tencent.beacon.base.util.c.a("[event] recover a heart beat for active user.", new Object[0]);
            if (c()) {
                com.tencent.beacon.base.util.c.a("[event] rqd_heartbeat A85=Y report success", new Object[0]);
                a.C0005a edit = a2.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString("active_user_date", com.tencent.beacon.base.util.b.d()).apply();
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.beacon.base.util.c.e("[event] active user event had upload.", new Object[0]);
    }

    public void a(com.tencent.beacon.e.b bVar) {
        String d2 = com.tencent.beacon.base.util.b.d();
        a a2 = a.a();
        String string = a2.getString("HEART_DENGTA", "");
        String string2 = a2.getString("active_user_date", "");
        if (d2.equals(string) || string2.equals(d2)) {
            com.tencent.beacon.base.util.c.e("[event] heartbeat had upload!", new Object[0]);
        } else if (bVar.a("rqd_heartbeat")) {
            com.tencent.beacon.base.util.c.e("[event] rqd_heartbeat not allowed in strategy!", new Object[0]);
        } else if (!bVar.b("rqd_heartbeat")) {
            com.tencent.beacon.base.util.c.e("[event] rqd_heartbeat is sampled by svr rate!", new Object[0]);
        } else {
            com.tencent.beacon.a.b.a.a().a((Runnable) new b(this, d2, a2));
        }
    }
}
