package com.google.firebase;

import android.content.Context;
import android.os.Build;
import g.e.a.b.b.h.e;
import g.e.b.c;
import g.e.b.d;
import g.e.b.k.n;
import g.e.b.k.q;
import g.e.b.k.v;
import g.e.b.p.b;
import g.e.b.p.g;
import g.e.b.p.j;
import g.e.b.p.k;
import g.e.b.t.a;
import g.e.b.t.f;
import g.e.b.t.h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements q {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<n<?>> getComponents() {
        Class<h> cls = h.class;
        ArrayList arrayList = new ArrayList();
        n.b<h> a = n.a(cls);
        a.a(new v(f.class, 2, 0));
        a.d(a.a);
        arrayList.add(a.b());
        int i2 = g.f3725f;
        String str = null;
        n.b bVar = new n.b(g.class, new Class[]{j.class, k.class}, (n.a) null);
        bVar.a(new v(Context.class, 1, 0));
        bVar.a(new v(g.e.b.h.class, 1, 0));
        bVar.a(new v(g.e.b.p.h.class, 2, 0));
        bVar.a(new v(cls, 1, 1));
        bVar.d(b.a);
        arrayList.add(bVar.b());
        arrayList.add(e.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(e.e("fire-core", "20.1.0"));
        arrayList.add(e.e("device-name", a(Build.PRODUCT)));
        arrayList.add(e.e("device-model", a(Build.DEVICE)));
        arrayList.add(e.e("device-brand", a(Build.BRAND)));
        arrayList.add(e.i("android-target-sdk", d.a));
        arrayList.add(e.i("android-min-sdk", g.e.b.e.a));
        arrayList.add(e.i("android-platform", g.e.b.f.a));
        arrayList.add(e.i("android-installer", c.a));
        try {
            str = i.b.f4570f.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(e.e("kotlin", str));
        }
        return arrayList;
    }
}
