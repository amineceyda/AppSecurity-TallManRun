package g.e.a.b.f.b;

import android.content.SharedPreferences;
import g.c.b.b.f;
import g.e.a.b.b.h.c;
import java.util.Objects;

public final class q3 {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3300d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s3 f3301e;

    public /* synthetic */ q3(s3 s3Var, long j2) {
        this.f3301e = s3Var;
        f.k("health_monitor");
        f.g(j2 > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.f3300d = j2;
    }

    public final void a() {
        this.f3301e.h();
        Objects.requireNonNull((c) this.f3301e.a.n);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f3301e.o().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }
}
