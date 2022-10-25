package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcl;
import g.e.a.b.f.b.f3;
import g.e.a.b.f.b.j8;
import g.e.a.b.f.b.k8;
import g.e.a.b.f.b.k9;
import g.e.a.b.f.b.l8;
import g.e.a.b.f.b.m8;
import g.e.a.b.f.b.n4;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements l8 {
    public m8 b;

    public final void a(Intent intent) {
    }

    public final boolean b(int i2) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final m8 d() {
        if (this.b == null) {
            this.b = new m8(this);
        }
        return this.b;
    }

    public void onCreate() {
        super.onCreate();
        n4.u(d().a, (zzcl) null, (Long) null).d().n.a("Local AppMeasurementService is starting up");
    }

    public void onDestroy() {
        n4.u(d().a, (zzcl) null, (Long) null).d().n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        d().a(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m8 d2 = d();
        f3 d3 = n4.u(d2.a, (zzcl) null, (Long) null).d();
        String string = jobParameters.getExtras().getString("action");
        d3.n.b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        j8 j8Var = new j8(d2, d3, jobParameters);
        k9 O = k9.O(d2.a);
        O.b().r(new k8(O, j8Var));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
