package g.d.a.l.u.y;

import g.d.a.l.m;
import g.d.a.l.s.j;
import g.d.a.l.u.g;
import g.d.a.l.u.m;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class a implements n<g, InputStream> {
    public static final m<Integer> b = m.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final g.d.a.l.u.m<g, g> a;

    /* renamed from: g.d.a.l.u.y.a$a  reason: collision with other inner class name */
    public static class C0092a implements o<g, InputStream> {
        public final g.d.a.l.u.m<g, g> a = new g.d.a.l.u.m<>(500);

        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }

        public void c() {
        }
    }

    public a(g.d.a.l.u.m<g, g> mVar) {
        this.a = mVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        g gVar = (g) obj;
        g.d.a.l.u.m<g, g> mVar = this.a;
        if (mVar != null) {
            m.b a2 = m.b.a(gVar, 0, 0);
            B a3 = mVar.a.a(a2);
            Queue<m.b<?>> queue = m.b.f2553d;
            synchronized (queue) {
                queue.offer(a2);
            }
            g gVar2 = (g) a3;
            if (gVar2 == null) {
                g.d.a.l.u.m<g, g> mVar2 = this.a;
                Objects.requireNonNull(mVar2);
                mVar2.a.d(m.b.a(gVar, 0, 0), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new n.a(gVar, new j(gVar, ((Integer) nVar.c(b)).intValue()));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
