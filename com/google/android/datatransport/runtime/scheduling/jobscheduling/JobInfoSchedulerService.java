package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import g.e.a.a.f.c0.a;
import g.e.a.a.f.i;
import g.e.a.a.f.p;
import g.e.a.a.f.s;
import g.e.a.a.f.z.h.c;
import g.e.a.a.f.z.h.d;
import g.e.a.a.f.z.h.u;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        p.a a = p.a();
        a.b(string);
        a.c(a.b(i2));
        if (string2 != null) {
            ((i.b) a).b = Base64.decode(string2, 0);
        }
        u uVar = s.a().f2775d;
        uVar.f2807e.execute(new d(uVar, a.a(), i3, new c(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
