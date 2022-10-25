package g.e.a.a.f.z.h;

import android.content.Context;
import g.e.a.a.f.a0.a;
import g.e.a.a.f.k;
import g.e.a.a.f.l;
import g.e.a.a.f.n;
import g.e.a.a.f.p;
import g.e.a.a.f.v.a;
import g.e.a.a.f.v.e;
import g.e.a.a.f.v.g;
import g.e.a.a.f.v.m;
import g.e.a.a.f.z.i.a0;
import g.e.a.a.f.z.i.g0;
import g.e.a.a.f.z.i.z;
import g.e.b.n.j.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

public class u {
    public final Context a;
    public final e b;
    public final a0 c;

    /* renamed from: d  reason: collision with root package name */
    public final y f2806d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2807e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2808f;

    /* renamed from: g  reason: collision with root package name */
    public final g.e.a.a.f.b0.a f2809g;

    /* renamed from: h  reason: collision with root package name */
    public final g.e.a.a.f.b0.a f2810h;

    /* renamed from: i  reason: collision with root package name */
    public final z f2811i;

    public u(Context context, e eVar, a0 a0Var, y yVar, Executor executor, a aVar, g.e.a.a.f.b0.a aVar2, g.e.a.a.f.b0.a aVar3, z zVar) {
        this.a = context;
        this.b = eVar;
        this.c = a0Var;
        this.f2806d = yVar;
        this.f2807e = executor;
        this.f2808f = aVar;
        this.f2809g = aVar2;
        this.f2810h = aVar3;
        this.f2811i = zVar;
    }

    public void a(p pVar, int i2) {
        g gVar;
        m mVar = this.b.get(pVar.b());
        long j2 = 0;
        while (((Boolean) this.f2808f.a(new e(this, pVar))).booleanValue()) {
            Iterable<g0> iterable = (Iterable) this.f2808f.a(new g(this, pVar));
            if (iterable.iterator().hasNext()) {
                boolean z = false;
                if (mVar == null) {
                    e.e.d.l.a.t("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVar = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (g0 a2 : iterable) {
                        arrayList.add(a2.a());
                    }
                    if (pVar.c() != null) {
                        a aVar = this.f2808f;
                        z zVar = this.f2811i;
                        Objects.requireNonNull(zVar);
                        g.e.a.a.f.x.a.a aVar2 = (g.e.a.a.f.x.a.a) aVar.a(new o(zVar));
                        l.a a3 = l.a();
                        a3.e(this.f2809g.a());
                        a3.g(this.f2810h.a());
                        a3.f("GDT_CLIENT_METRICS");
                        g.e.a.a.a aVar3 = new g.e.a.a.a("proto");
                        Objects.requireNonNull(aVar2);
                        h hVar = n.a;
                        Objects.requireNonNull(hVar);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            hVar.a(aVar2, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        a3.d(new k(aVar3, byteArrayOutputStream.toByteArray()));
                        arrayList.add(mVar.a(a3.b()));
                    }
                    gVar = mVar.b(new g.e.a.a.f.v.a(arrayList, pVar.c(), (a.C0103a) null));
                }
                if (gVar.c() == g.a.TRANSIENT_ERROR) {
                    this.f2808f.a(new h(this, iterable, pVar, j2));
                    this.f2806d.b(pVar, i2 + 1, true);
                    return;
                }
                this.f2808f.a(new j(this, iterable));
                if (gVar.c() == g.a.OK) {
                    j2 = Math.max(j2, gVar.b());
                    if (pVar.c() != null) {
                        z = true;
                    }
                    if (z) {
                        this.f2808f.a(new l(this));
                    }
                } else if (gVar.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (g0 a4 : iterable) {
                        String h2 = a4.a().h();
                        hashMap.put(h2, !hashMap.containsKey(h2) ? 1 : Integer.valueOf(((Integer) hashMap.get(h2)).intValue() + 1));
                    }
                    this.f2808f.a(new f(this, hashMap));
                }
            } else {
                return;
            }
        }
        this.f2808f.a(new i(this, pVar, j2));
    }
}
