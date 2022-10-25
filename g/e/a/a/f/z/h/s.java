package g.e.a.a.f.z.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.tencent.raft.measure.utils.MeasureConst;
import g.e.a.a.b;
import g.e.a.a.f.c0.a;
import g.e.a.a.f.p;
import g.e.a.a.f.z.h.t;
import g.e.a.a.f.z.i.a0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

public class s implements y {
    public final Context a;
    public final a0 b;
    public final t c;

    public s(Context context, a0 a0Var, t tVar) {
        this.a = context;
        this.b = a0Var;
        this.c = tVar;
    }

    public void a(p pVar, int i2) {
        b(pVar, i2, false);
    }

    public void b(p pVar, int i2, boolean z) {
        boolean z2;
        p pVar2 = pVar;
        int i3 = i2;
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)));
        adler32.update(pVar.b().getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i3) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                e.e.d.l.a.t("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar2);
                return;
            }
        }
        long L = this.b.L(pVar2);
        t tVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        b d2 = pVar.d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(tVar.b(d2, L, i3));
        Set<t.b> c2 = tVar.c().get(d2).c();
        if (c2.contains(t.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c2.contains(t.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c2.contains(t.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i3);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        e.e.d.l.a.u(str, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar2, Integer.valueOf(value), Long.valueOf(this.c.b(pVar.d(), L, i3)), Long.valueOf(L), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }
}
