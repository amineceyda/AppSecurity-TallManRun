package com.google.firebase.installations;

import androidx.annotation.Keep;
import g.e.a.b.b.h.e;
import g.e.b.h;
import g.e.b.k.a;
import g.e.b.k.n;
import g.e.b.k.q;
import g.e.b.k.v;
import g.e.b.p.i;
import g.e.b.p.j;
import g.e.b.r.c;
import g.e.b.r.f;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements q {
    public List<n<?>> getComponents() {
        n.b<f> a = n.a(f.class);
        a.a(new v(h.class, 1, 0));
        a.a(new v(j.class, 0, 1));
        a.d(c.a);
        i iVar = new i();
        n.b<g.e.b.p.h> a2 = n.a(g.e.b.p.h.class);
        a2.f3464d = 1;
        a2.d(new a(iVar));
        return Arrays.asList(new n[]{a.b(), a2.b(), e.e("fire-installations", "17.0.1")});
    }
}
