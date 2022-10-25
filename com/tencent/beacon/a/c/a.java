package com.tencent.beacon.a.c;

import android.content.SharedPreferences;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.b;

public class a implements Runnable {
    public final /* synthetic */ com.tencent.beacon.a.d.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public a(com.tencent.beacon.a.d.a aVar, String str, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j2;
    }

    public void run() {
        a.C0005a edit = this.a.edit();
        if (b.a((SharedPreferences.Editor) edit)) {
            edit.putLong(this.b, this.c);
        }
    }
}
