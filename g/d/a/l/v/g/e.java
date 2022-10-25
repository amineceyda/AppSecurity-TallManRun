package g.d.a.l.v.g;

import android.graphics.Bitmap;
import g.d.a.l.t.r;
import g.d.a.l.v.e.b;
import g.d.a.l.v.g.g;

public class e extends b<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    public void a() {
        ((c) this.b).b().prepareToDraw();
    }

    public int b() {
        g gVar = ((c) this.b).b.a;
        return gVar.a.f() + gVar.o;
    }

    public Class<c> c() {
        return c.class;
    }

    public void d() {
        ((c) this.b).stop();
        c cVar = (c) this.b;
        cVar.f2608e = true;
        g gVar = cVar.b.a;
        gVar.c.clear();
        Bitmap bitmap = gVar.f2623l;
        if (bitmap != null) {
            gVar.f2616e.e(bitmap);
            gVar.f2623l = null;
        }
        gVar.f2617f = false;
        g.a aVar = gVar.f2620i;
        if (aVar != null) {
            gVar.f2615d.l(aVar);
            gVar.f2620i = null;
        }
        g.a aVar2 = gVar.f2622k;
        if (aVar2 != null) {
            gVar.f2615d.l(aVar2);
            gVar.f2622k = null;
        }
        g.a aVar3 = gVar.n;
        if (aVar3 != null) {
            gVar.f2615d.l(aVar3);
            gVar.n = null;
        }
        gVar.a.clear();
        gVar.f2621j = true;
    }
}
