package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Registry;
import g.d.a.b;
import g.d.a.k.a.b;
import g.d.a.l.u.g;
import g.d.a.l.u.o;
import g.d.a.l.u.p;
import g.d.a.l.u.r;
import g.d.a.n.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public class OkHttpGlideModule implements c {
    public void a(Context context, g.d.a.c cVar) {
    }

    public void b(Context context, b bVar, Registry registry) {
        List<o<? extends Model, ? extends Data>> f2;
        Class<g> cls = g.class;
        Class<InputStream> cls2 = InputStream.class;
        b.a aVar = new b.a();
        p pVar = registry.a;
        synchronized (pVar) {
            r rVar = pVar.a;
            synchronized (rVar) {
                f2 = rVar.f(cls, cls2);
                rVar.a(cls, cls2, aVar);
            }
            Iterator it = ((ArrayList) f2).iterator();
            while (it.hasNext()) {
                ((o) it.next()).c();
            }
            pVar.b.a.clear();
        }
    }
}
