package g.e.a.a.f.z.h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ JobInfoSchedulerService b;
    public final /* synthetic */ JobParameters c;

    public /* synthetic */ c(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.b = jobInfoSchedulerService;
        this.c = jobParameters;
    }

    public final void run() {
        this.b.jobFinished(this.c, false);
    }
}
