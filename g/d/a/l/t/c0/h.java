package g.d.a.l.t.c0;

import g.d.a.l.l;
import g.d.a.l.t.c0.i;
import g.d.a.l.t.v;
import g.d.a.r.g;

public class h extends g<l, v<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f2453d;

    public h(long j2) {
        super(j2);
    }

    public int b(Object obj) {
        v vVar = (v) obj;
        if (vVar == null) {
            return 1;
        }
        return vVar.b();
    }

    public void c(Object obj, Object obj2) {
        l lVar = (l) obj;
        v vVar = (v) obj2;
        i.a aVar = this.f2453d;
        if (aVar != null && vVar != null) {
            ((g.d.a.l.t.l) aVar).f2497e.a(vVar, true);
        }
    }
}
