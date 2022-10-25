package com.tencent.beacon.d.a;

import android.app.Activity;
import com.tencent.beacon.d.c;

public class b implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ c b;

    public b(c cVar, Activity activity) {
        this.b = cVar;
        this.a = activity;
    }

    public void run() {
        new c(this.a.getApplicationContext()).a();
    }
}
