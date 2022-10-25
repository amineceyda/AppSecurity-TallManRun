package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import g.e.a.b.e.c.m2;
import g.e.b.g;
import g.e.b.h;
import g.e.b.j.a.a;
import g.e.b.j.a.b;
import g.e.b.j.a.e;
import g.e.b.k.n;
import g.e.b.k.o;
import g.e.b.k.q;
import g.e.b.k.v;
import g.e.b.o.d;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Keep
public class AnalyticsConnectorRegistrar implements q {
    public static a lambda$getComponents$0(o oVar) {
        h hVar = (h) oVar.a(h.class);
        Context context = (Context) oVar.a(Context.class);
        d dVar = (d) oVar.a(d.class);
        Objects.requireNonNull(hVar, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (b.c == null) {
            synchronized (b.class) {
                if (b.c == null) {
                    Bundle bundle = new Bundle(1);
                    if (hVar.g()) {
                        dVar.a(g.class, e.b, g.e.b.j.a.d.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", hVar.f());
                    }
                    b.c = new b(m2.c(context, (String) null, (String) null, (String) null, bundle).f2996d);
                }
            }
        }
        return b.c;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<n<?>> getComponents() {
        n.b<a> a = n.a(a.class);
        a.a(new v(h.class, 1, 0));
        a.a(new v(Context.class, 1, 0));
        a.a(new v(d.class, 1, 0));
        a.d(g.e.b.j.a.c.a.a);
        a.c();
        return Arrays.asList(new n[]{a.b(), g.e.a.b.b.h.e.e("fire-analytics", "20.1.0")});
    }
}
