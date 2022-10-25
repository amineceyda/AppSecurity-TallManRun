package g.e.a.b.f;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzks;
import e.d.a;
import g.c.b.b.f;
import g.e.a.b.f.b.b;
import g.e.a.b.f.b.d3;
import g.e.a.b.f.b.d6;
import g.e.a.b.f.b.e6;
import g.e.a.b.f.b.n4;
import g.e.a.b.f.b.q6;
import g.e.a.b.f.b.q9;
import g.e.a.b.f.b.y6;
import g.e.a.b.f.b.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends e {
    public final n4 a;
    public final q6 b;

    public c(n4 n4Var) {
        Objects.requireNonNull(n4Var, "null reference");
        this.a = n4Var;
        this.b = n4Var.v();
    }

    public final String a() {
        y6 y6Var = this.b.a.x().c;
        if (y6Var != null) {
            return y6Var.a;
        }
        return null;
    }

    public final void b(String str) {
        z1 n = this.a.n();
        Objects.requireNonNull((g.e.a.b.b.h.c) this.a.n);
        n.i(str, SystemClock.elapsedRealtime());
    }

    public final void c(String str, String str2, Bundle bundle) {
        this.a.v().I(str, str2, bundle);
    }

    public final String d() {
        return this.b.F();
    }

    public final String e() {
        y6 y6Var = this.b.a.x().c;
        if (y6Var != null) {
            return y6Var.b;
        }
        return null;
    }

    public final List f(String str, String str2) {
        q6 q6Var = this.b;
        if (q6Var.a.b().t()) {
            q6Var.a.d().f3136f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        b bVar = q6Var.a.f3257f;
        if (b.a()) {
            q6Var.a.d().f3136f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        q6Var.a.b().o(atomicReference, 5000, "get conditional user properties", new d6(q6Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return q9.t(list);
        }
        q6Var.a.d().f3136f.b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    public final Map g(String str, String str2, boolean z) {
        String str3;
        d3 d3Var;
        q6 q6Var = this.b;
        if (q6Var.a.b().t()) {
            d3Var = q6Var.a.d().f3136f;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            b bVar = q6Var.a.f3257f;
            if (b.a()) {
                d3Var = q6Var.a.d().f3136f;
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                q6Var.a.b().o(atomicReference, 5000, "get user properties", new e6(q6Var, atomicReference, str, str2, z));
                List<zzks> list = (List) atomicReference.get();
                if (list == null) {
                    q6Var.a.d().f3136f.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                a aVar = new a(list.size());
                for (zzks zzks : list) {
                    Object c = zzks.c();
                    if (c != null) {
                        aVar.put(zzks.zzb, c);
                    }
                }
                return aVar;
            }
        }
        d3Var.a(str3);
        return Collections.emptyMap();
    }

    public final String h() {
        return this.b.F();
    }

    public final void i(String str) {
        z1 n = this.a.n();
        Objects.requireNonNull((g.e.a.b.b.h.c) this.a.n);
        n.j(str, SystemClock.elapsedRealtime());
    }

    public final long j() {
        return this.a.A().n0();
    }

    public final int k(String str) {
        q6 q6Var = this.b;
        Objects.requireNonNull(q6Var);
        f.k(str);
        g.e.a.b.f.b.f fVar = q6Var.a.f3258g;
        return 25;
    }

    public final void l(Bundle bundle) {
        q6 q6Var = this.b;
        Objects.requireNonNull((g.e.a.b.b.h.c) q6Var.a.n);
        q6Var.u(bundle, System.currentTimeMillis());
    }

    public final void m(String str, String str2, Bundle bundle) {
        this.b.m(str, str2, bundle);
    }
}
