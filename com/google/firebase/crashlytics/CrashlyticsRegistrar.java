package com.google.firebase.crashlytics;

import g.e.a.b.b.h.e;
import g.e.b.h;
import g.e.b.j.a.a;
import g.e.b.k.n;
import g.e.b.k.q;
import g.e.b.k.v;
import g.e.b.l.d;
import g.e.b.l.i;
import g.e.b.l.j.c;
import g.e.b.r.f;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements q {
    public List<n<?>> getComponents() {
        n.b<i> a = n.a(i.class);
        a.a(new v(h.class, 1, 0));
        a.a(new v(f.class, 1, 0));
        a.a(new v(c.class, 0, 2));
        a.a(new v(a.class, 0, 2));
        a.d(new d(this));
        a.c();
        return Arrays.asList(new n[]{a.b(), e.e("fire-cls", "18.2.9")});
    }
}
