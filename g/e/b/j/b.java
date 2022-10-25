package g.e.b.j;

import android.os.Bundle;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.j1;
import g.e.a.b.e.c.k1;
import g.e.a.b.e.c.l1;
import g.e.a.b.e.c.m2;
import g.e.a.b.e.c.o1;
import g.e.a.b.e.c.p1;
import g.e.a.b.e.c.q1;
import g.e.a.b.e.c.r1;
import g.e.a.b.e.c.s1;
import g.e.a.b.e.c.t1;
import g.e.a.b.e.c.u1;
import g.e.a.b.e.c.v0;
import g.e.a.b.e.c.v1;
import g.e.a.b.e.c.y1;
import g.e.a.b.f.b.r6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public final class b implements r6 {
    public final /* synthetic */ m2 a;

    public b(m2 m2Var) {
        this.a = m2Var;
    }

    public final String a() {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new t1(m2Var, v0Var));
        return v0Var.B(500);
    }

    public final void b(String str) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        m2Var.c.execute(new o1(m2Var, str));
    }

    public final void c(String str, String str2, Bundle bundle) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        m2Var.c.execute(new k1(m2Var, str, str2, bundle));
    }

    public final String d() {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new r1(m2Var, v0Var));
        return v0Var.B(50);
    }

    public final String e() {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new u1(m2Var, v0Var));
        return v0Var.B(500);
    }

    public final List f(String str, String str2) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new l1(m2Var, str, str2, v0Var));
        List list = (List) v0.C(v0Var.A(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map g(String str, String str2, boolean z) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new v1(m2Var, str, str2, z, v0Var));
        Bundle A = v0Var.A(5000);
        if (A == null || A.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(A.size());
        for (String str3 : A.keySet()) {
            Object obj = A.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final String h() {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new q1(m2Var, v0Var));
        return v0Var.B(500);
    }

    public final void i(String str) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        m2Var.c.execute(new p1(m2Var, str));
    }

    public final long j() {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new s1(m2Var, v0Var));
        Long l2 = (Long) v0.C(v0Var.A(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nanoTime = System.nanoTime();
        Objects.requireNonNull((c) m2Var.b);
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i2 = m2Var.f2998f + 1;
        m2Var.f2998f = i2;
        return nextLong + ((long) i2);
    }

    public final int k(String str) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        v0 v0Var = new v0();
        m2Var.c.execute(new y1(m2Var, str, v0Var));
        Integer num = (Integer) v0.C(v0Var.A(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void l(Bundle bundle) {
        m2 m2Var = this.a;
        Objects.requireNonNull(m2Var);
        m2Var.c.execute(new j1(m2Var, bundle));
    }

    public final void m(String str, String str2, Bundle bundle) {
        this.a.d(str, str2, bundle);
    }
}
