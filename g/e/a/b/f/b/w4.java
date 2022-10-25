package g.e.a.b.f.b;

import android.text.TextUtils;
import g.c.b.b.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class w4 {
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;
    public final n4 a;
    public final String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f3377d;

    /* renamed from: e  reason: collision with root package name */
    public String f3378e;

    /* renamed from: f  reason: collision with root package name */
    public String f3379f;

    /* renamed from: g  reason: collision with root package name */
    public long f3380g;

    /* renamed from: h  reason: collision with root package name */
    public long f3381h;

    /* renamed from: i  reason: collision with root package name */
    public long f3382i;

    /* renamed from: j  reason: collision with root package name */
    public String f3383j;

    /* renamed from: k  reason: collision with root package name */
    public long f3384k;

    /* renamed from: l  reason: collision with root package name */
    public String f3385l;

    /* renamed from: m  reason: collision with root package name */
    public long f3386m;
    public long n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public Boolean s;
    public long t;
    public List u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public w4(n4 n4Var, String str) {
        Objects.requireNonNull(n4Var, "null reference");
        f.k(str);
        this.a = n4Var;
        this.b = str;
        n4Var.b().h();
    }

    public final long A() {
        this.a.b().h();
        return this.f3384k;
    }

    public final long B() {
        this.a.b().h();
        return this.D;
    }

    public final long C() {
        this.a.b().h();
        return this.n;
    }

    public final long D() {
        this.a.b().h();
        return this.t;
    }

    public final long E() {
        this.a.b().h();
        return this.E;
    }

    public final long F() {
        this.a.b().h();
        return this.f3386m;
    }

    public final long G() {
        this.a.b().h();
        return this.f3382i;
    }

    public final long H() {
        this.a.b().h();
        return this.f3380g;
    }

    public final long I() {
        this.a.b().h();
        return this.f3381h;
    }

    public final String J() {
        this.a.b().h();
        return this.r;
    }

    public final String K() {
        this.a.b().h();
        String str = this.B;
        q((String) null);
        return str;
    }

    public final String L() {
        this.a.b().h();
        return this.b;
    }

    public final String M() {
        this.a.b().h();
        return this.c;
    }

    public final String N() {
        this.a.b().h();
        return this.f3385l;
    }

    public final String O() {
        this.a.b().h();
        return this.f3383j;
    }

    public final String P() {
        this.a.b().h();
        return this.f3379f;
    }

    public final String Q() {
        this.a.b().h();
        return this.f3377d;
    }

    public final List a() {
        this.a.b().h();
        return this.u;
    }

    public final void b() {
        this.a.b().h();
        long j2 = this.f3380g + 1;
        if (j2 > 2147483647L) {
            this.a.d().f3139i.b("Bundle index overflow. appId", f3.t(this.b));
            j2 = 0;
        }
        this.C = true;
        this.f3380g = j2;
    }

    public final void c(String str) {
        this.a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ q9.Y(this.r, str);
        this.r = str;
    }

    public final void d(boolean z2) {
        this.a.b().h();
        this.C |= this.q != z2;
        this.q = z2;
    }

    public final void e(long j2) {
        this.a.b().h();
        this.C |= this.p != j2;
        this.p = j2;
    }

    public final void f(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.c, str);
        this.c = str;
    }

    public final void g(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.f3385l, str);
        this.f3385l = str;
    }

    public final void h(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.f3383j, str);
        this.f3383j = str;
    }

    public final void i(long j2) {
        this.a.b().h();
        this.C |= this.f3384k != j2;
        this.f3384k = j2;
    }

    public final void j(long j2) {
        this.a.b().h();
        this.C |= this.D != j2;
        this.D = j2;
    }

    public final void k(long j2) {
        this.a.b().h();
        this.C |= this.n != j2;
        this.n = j2;
    }

    public final void l(long j2) {
        this.a.b().h();
        this.C |= this.t != j2;
        this.t = j2;
    }

    public final void m(long j2) {
        this.a.b().h();
        this.C |= this.E != j2;
        this.E = j2;
    }

    public final void n(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.f3379f, str);
        this.f3379f = str;
    }

    public final void o(String str) {
        this.a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ q9.Y(this.f3377d, str);
        this.f3377d = str;
    }

    public final void p(long j2) {
        this.a.b().h();
        this.C |= this.f3386m != j2;
        this.f3386m = j2;
    }

    public final void q(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.B, str);
        this.B = str;
    }

    public final void r(long j2) {
        this.a.b().h();
        this.C |= this.f3382i != j2;
        this.f3382i = j2;
    }

    public final long s() {
        this.a.b().h();
        return this.p;
    }

    public final void t(long j2) {
        boolean z2 = true;
        f.g(j2 >= 0);
        this.a.b().h();
        boolean z3 = this.C;
        if (this.f3380g == j2) {
            z2 = false;
        }
        this.C = z2 | z3;
        this.f3380g = j2;
    }

    public final void u(long j2) {
        this.a.b().h();
        this.C |= this.f3381h != j2;
        this.f3381h = j2;
    }

    public final void v(boolean z2) {
        this.a.b().h();
        this.C |= this.o != z2;
        this.o = z2;
    }

    public final void w(String str) {
        this.a.b().h();
        this.C |= !q9.Y(this.f3378e, str);
        this.f3378e = str;
    }

    public final void x(List list) {
        this.a.b().h();
        List list2 = this.u;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.C = true;
                this.u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    public final boolean y() {
        this.a.b().h();
        return this.q;
    }

    public final boolean z() {
        this.a.b().h();
        return this.o;
    }
}
