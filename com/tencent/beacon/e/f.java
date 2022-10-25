package com.tencent.beacon.e;

import android.content.SharedPreferences;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.b;
import java.util.Date;

public class f implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g c;

    public f(g gVar, String str, String str2) {
        this.c = gVar;
        this.a = str;
        this.b = str2;
    }

    public void run() {
        Date d2 = b.d(this.a);
        long time = d2 != null ? d2.getTime() / 1000 : 0;
        if (time == 0) {
            time = (new Date().getTime() / 1000) + 86400;
        }
        a.C0005a edit = a.a().edit();
        if (b.a((SharedPreferences.Editor) edit)) {
            edit.putString("sid_value", this.b).putLong("sid_mt", time);
        }
    }
}
