package g.e.a.b.f.b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.db;
import java.util.Objects;

public final class u8 {
    public final /* synthetic */ w8 a;

    public u8(w8 w8Var) {
        this.a = w8Var;
    }

    public final void a() {
        this.a.h();
        s3 t = this.a.a.t();
        Objects.requireNonNull((c) this.a.a.n);
        if (t.t(System.currentTimeMillis())) {
            this.a.a.t().f3345l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.d().n.a("Detected application was in foreground");
                Objects.requireNonNull((c) this.a.a.n);
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j2, boolean z) {
        this.a.h();
        this.a.l();
        if (this.a.a.t().t(j2)) {
            this.a.a.t().f3345l.a(true);
        }
        this.a.a.t().o.b(j2);
        if (this.a.a.t().f3345l.b()) {
            c(j2, z);
        }
    }

    public final void c(long j2, boolean z) {
        this.a.h();
        if (this.a.a.g()) {
            this.a.a.t().o.b(j2);
            Objects.requireNonNull((c) this.a.a.n);
            this.a.a.d().n.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.a.a.v().B("auto", "_sid", valueOf, j2);
            this.a.a.t().f3345l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.a.f3258g.u((String) null, s2.a0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.a.v().p("auto", "_s", j2, bundle);
            db.b();
            if (this.a.a.f3258g.u((String) null, s2.d0)) {
                String a2 = this.a.a.t().t.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.a.v().p("auto", "_ssr", j2, bundle2);
                }
            }
        }
    }
}
