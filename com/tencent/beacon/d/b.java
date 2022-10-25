package com.tencent.beacon.d;

import android.content.SharedPreferences;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.base.util.c;

public class b implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ a b;
    public final /* synthetic */ c c;

    public b(c cVar, String str, a aVar) {
        this.c = cVar;
        this.a = str;
        this.b = aVar;
    }

    public void run() {
        if (d.d()) {
            boolean a2 = this.c.c();
            if (this.c.c && a2) {
                StringBuilder i2 = g.a.a.a.a.i("[event] rqd_heartbeat A85=Y report success : ");
                i2.append(this.a);
                c.a(i2.toString(), new Object[0]);
                a.C0005a edit = this.b.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString("active_user_date", this.a).commit();
                    edit.putString("HEART_DENGTA", this.a).commit();
                }
            }
        }
    }
}
