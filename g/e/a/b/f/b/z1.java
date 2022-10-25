package g.e.a.b.f.b;

import android.os.Bundle;
import e.d.a;
import java.util.Map;

public final class z1 extends y2 {
    public final Map b = new a();
    public final Map c = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f3421d;

    public z1(n4 n4Var) {
        super(n4Var);
    }

    public final void i(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.d().f3136f.a("Ad unit id must be a non-empty string");
        } else {
            this.a.b().r(new a(this, str, j2));
        }
    }

    public final void j(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.d().f3136f.a("Ad unit id must be a non-empty string");
        } else {
            this.a.b().r(new x(this, str, j2));
        }
    }

    public final void k(long j2) {
        y6 o = this.a.x().o(false);
        for (String str : this.b.keySet()) {
            m(str, j2 - ((Long) this.b.get(str)).longValue(), o);
        }
        if (!this.b.isEmpty()) {
            l(j2 - this.f3421d, o);
        }
        n(j2);
    }

    public final void l(long j2, y6 y6Var) {
        if (y6Var == null) {
            this.a.d().n.a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            this.a.d().n.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            q9.w(y6Var, bundle, true);
            this.a.v().o("am", "_xa", bundle);
        }
    }

    public final void m(String str, long j2, y6 y6Var) {
        if (y6Var == null) {
            this.a.d().n.a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            this.a.d().n.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            q9.w(y6Var, bundle, true);
            this.a.v().o("am", "_xu", bundle);
        }
    }

    public final void n(long j2) {
        for (String put : this.b.keySet()) {
            this.b.put(put, Long.valueOf(j2));
        }
        if (!this.b.isEmpty()) {
            this.f3421d = j2;
        }
    }
}
