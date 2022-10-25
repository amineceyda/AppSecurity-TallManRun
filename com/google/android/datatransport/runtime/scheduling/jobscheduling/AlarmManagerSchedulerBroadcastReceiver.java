package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import g.e.a.a.f.c0.a;
import g.e.a.a.f.i;
import g.e.a.a.f.p;
import g.e.a.a.f.s;
import g.e.a.a.f.z.h.d;
import g.e.a.a.f.z.h.u;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        p.a a2 = p.a();
        a2.b(queryParameter);
        a2.c(a.b(intValue));
        if (queryParameter2 != null) {
            ((i.b) a2).b = Base64.decode(queryParameter2, 0);
        }
        u uVar = s.a().f2775d;
        uVar.f2807e.execute(new d(uVar, a2.a(), i2, g.e.a.a.f.z.h.a.b));
    }
}
