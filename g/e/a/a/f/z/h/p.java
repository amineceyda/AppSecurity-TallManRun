package g.e.a.a.f.z.h;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import g.e.a.a.f.b0.a;
import g.e.a.a.f.z.i.a0;

public class p implements y {
    public final Context a;
    public final a0 b;
    public AlarmManager c;

    /* renamed from: d  reason: collision with root package name */
    public final t f2802d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2803e;

    public p(Context context, a0 a0Var, a aVar, t tVar) {
        this.a = context;
        this.b = a0Var;
        this.c = (AlarmManager) context.getSystemService("alarm");
        this.f2803e = aVar;
        this.f2802d = tVar;
    }

    public void a(g.e.a.a.f.p pVar, int i2) {
        b(pVar, i2, false);
    }

    public void b(g.e.a.a.f.p pVar, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(g.e.a.a.f.c0.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z) {
            if (PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null) {
                e.e.d.l.a.t("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
                return;
            }
        }
        long L = this.b.L(pVar);
        long b2 = this.f2802d.b(pVar.d(), L, i2);
        e.e.d.l.a.u("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(b2), Long.valueOf(L), Integer.valueOf(i2));
        this.c.set(3, this.f2803e.a() + b2, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }
}
