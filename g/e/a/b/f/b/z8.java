package g.e.a.b.f.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import g.e.a.b.e.c.s0;

public final class z8 extends b9 {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f3427d = ((AlarmManager) this.a.a.getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public m f3428e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f3429f;

    public z8(k9 k9Var) {
        super(k9Var);
    }

    public final boolean k() {
        AlarmManager alarmManager = this.f3427d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        p();
        return false;
    }

    public final void l() {
        i();
        this.a.d().n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f3427d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().a();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final int m() {
        if (this.f3429f == null) {
            String valueOf = String.valueOf(this.a.a.getPackageName());
            this.f3429f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f3429f.intValue();
    }

    public final PendingIntent n() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), s0.a);
    }

    public final m o() {
        if (this.f3428e == null) {
            this.f3428e = new y8(this, this.b.f3238l);
        }
        return this.f3428e;
    }

    @TargetApi(24)
    public final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }
}
