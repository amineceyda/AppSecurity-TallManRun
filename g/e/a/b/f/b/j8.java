package g.e.a.b.f.b;

import android.app.job.JobParameters;
import java.util.Objects;

public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ m8 b;
    public final /* synthetic */ f3 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ JobParameters f3207d;

    public /* synthetic */ j8(m8 m8Var, f3 f3Var, JobParameters jobParameters) {
        this.b = m8Var;
        this.c = f3Var;
        this.f3207d = jobParameters;
    }

    public final void run() {
        m8 m8Var = this.b;
        f3 f3Var = this.c;
        JobParameters jobParameters = this.f3207d;
        Objects.requireNonNull(m8Var);
        f3Var.n.a("AppMeasurementJobService processed last upload request.");
        ((l8) m8Var.a).c(jobParameters, false);
    }
}
