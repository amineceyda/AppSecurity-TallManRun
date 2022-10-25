package i.m;

import i.o.b.p;
import i.o.c.h;

public interface f {

    public interface a extends f {

        /* renamed from: i.m.f$a$a  reason: collision with other inner class name */
        public static final class C0191a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                h.e(pVar, "operation");
                return pVar.d(r, aVar);
            }

            public static <E extends a> E b(a aVar, b<E> bVar) {
                h.e(bVar, "key");
                if (h.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                h.e(bVar, "key");
                return h.a(aVar.getKey(), bVar) ? h.b : aVar;
            }

            public static f d(a aVar, f fVar) {
                h.e(fVar, "context");
                return g.c.b.b.f.g0(aVar, fVar);
            }
        }

        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);

    f plus(f fVar);
}
