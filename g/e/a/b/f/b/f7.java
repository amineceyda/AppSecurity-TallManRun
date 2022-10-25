package g.e.a.b.f.b;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class f7 extends w3 {
    public volatile y6 c;

    /* renamed from: d  reason: collision with root package name */
    public volatile y6 f3147d;

    /* renamed from: e  reason: collision with root package name */
    public y6 f3148e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f3149f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public Activity f3150g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f3151h;

    /* renamed from: i  reason: collision with root package name */
    public volatile y6 f3152i;

    /* renamed from: j  reason: collision with root package name */
    public y6 f3153j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3154k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f3155l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public String f3156m;

    public f7(n4 n4Var) {
        super(n4Var);
    }

    public final boolean k() {
        return false;
    }

    public final void l(Activity activity, y6 y6Var, boolean z) {
        y6 y6Var2;
        y6 y6Var3 = y6Var;
        y6 y6Var4 = this.c == null ? this.f3147d : this.c;
        if (y6Var3.b == null) {
            y6Var2 = new y6(y6Var3.a, activity != null ? p(activity.getClass(), "Activity") : null, y6Var3.c, y6Var3.f3413e, y6Var3.f3414f);
        } else {
            y6Var2 = y6Var3;
        }
        this.f3147d = this.c;
        this.c = y6Var2;
        Objects.requireNonNull((c) this.a.n);
        this.a.b().r(new a7(this, y6Var2, y6Var4, SystemClock.elapsedRealtime(), z));
    }

    public final void m(y6 y6Var, y6 y6Var2, long j2, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j3;
        h();
        boolean z2 = false;
        boolean z3 = y6Var2 == null || y6Var2.c != y6Var.c || !q9.Y(y6Var2.b, y6Var.b) || !q9.Y(y6Var2.a, y6Var.a);
        if (z && this.f3148e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            q9.w(y6Var, bundle2, true);
            if (y6Var2 != null) {
                String str = y6Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = y6Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", y6Var2.c);
            }
            if (z2) {
                t8 t8Var = this.a.z().f3391e;
                long j4 = j2 - t8Var.b;
                t8Var.b = j2;
                if (j4 > 0) {
                    this.a.A().u(bundle2, j4);
                }
            }
            if (!this.a.f3258g.v()) {
                bundle2.putLong("_mst", 1);
            }
            String str3 = true != y6Var.f3413e ? "auto" : "app";
            Objects.requireNonNull((c) this.a.n);
            long currentTimeMillis = System.currentTimeMillis();
            if (y6Var.f3413e) {
                long j5 = y6Var.f3414f;
                if (j5 != 0) {
                    j3 = j5;
                    this.a.v().p(str3, "_vs", j3, bundle2);
                }
            }
            j3 = currentTimeMillis;
            this.a.v().p(str3, "_vs", j3, bundle2);
        }
        if (z2) {
            n(this.f3148e, true, j2);
        }
        this.f3148e = y6Var;
        if (y6Var.f3413e) {
            this.f3153j = y6Var;
        }
        f8 y = this.a.y();
        y.h();
        y.i();
        y.t(new m7(y, y6Var));
    }

    public final void n(y6 y6Var, boolean z, long j2) {
        z1 n = this.a.n();
        Objects.requireNonNull((c) this.a.n);
        n.k(SystemClock.elapsedRealtime());
        if (this.a.z().f3391e.a(y6Var != null && y6Var.f3412d, z, j2) && y6Var != null) {
            y6Var.f3412d = false;
        }
    }

    public final y6 o(boolean z) {
        i();
        h();
        if (!z) {
            return this.f3148e;
        }
        y6 y6Var = this.f3148e;
        return y6Var != null ? y6Var : this.f3153j;
    }

    public final String p(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        f fVar = this.a.f3258g;
        return length2 > 100 ? str2.substring(0, 100) : str2;
    }

    public final void q(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.a.f3258g.v() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f3149f.put(activity, new y6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void r(String str, y6 y6Var) {
        h();
        synchronized (this) {
            String str2 = this.f3156m;
            if (str2 == null || str2.equals(str)) {
                this.f3156m = str;
            }
        }
    }

    public final y6 s(Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        y6 y6Var = (y6) this.f3149f.get(activity);
        if (y6Var == null) {
            y6 y6Var2 = new y6((String) null, p(activity.getClass(), "Activity"), this.a.A().n0());
            this.f3149f.put(activity, y6Var2);
            y6Var = y6Var2;
        }
        return this.f3152i != null ? this.f3152i : y6Var;
    }
}
