package g.c.b.a.h;

import android.util.Log;
import g.c.b.a.c;
import g.c.b.a.d;
import g.c.b.a.j.b;
import g.c.b.a.j.g;
import i.o.c.h;
import java.io.IOException;
import java.util.List;

public final class f implements b.a {
    public final e a;
    public final List<b> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final c f2220d;

    /* renamed from: e  reason: collision with root package name */
    public final b.a f2221e;

    public f(e eVar, List<? extends b> list, int i2, c cVar, b.a aVar) {
        h.e(eVar, "call");
        h.e(list, "interceptors");
        h.e(cVar, "request");
        this.a = eVar;
        this.b = list;
        this.c = i2;
        this.f2220d = cVar;
        this.f2221e = aVar;
    }

    public void a(d<Object> dVar) {
        h.e(dVar, "channelResponse");
        if (this.f2221e != null) {
            this.b.get(this.c - 1).a(this.f2221e, dVar);
        }
    }

    public c b() {
        return this.f2220d;
    }

    public b.a c() {
        return this.f2221e;
    }

    public void d(c cVar) throws IOException {
        h.e(cVar, "channelRequest");
        String str = "start proceed " + this.c + " chain.";
        h.e("RealInterceptorChain", "tag");
        h.e(str, "message");
        g gVar = g.c.b.a.l.c.b;
        String j2 = h.j("ClientChannel|", "RealInterceptorChain");
        if (gVar != null) {
            gVar.d(j2, str);
        } else {
            Log.d(j2, str);
        }
        this.b.get(this.c).b(new f(this.a, this.b, this.c + 1, cVar, this));
    }
}
