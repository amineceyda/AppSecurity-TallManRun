package f.a.a.b.w;

import f.a.a.b.n.a;
import f.a.a.b.z.b;

public final class g<E> {
    public b<a<E>> a = new b<>(new a[0]);

    public h a(E e2) {
        b<a<E>> bVar = this.a;
        bVar.e();
        for (a s : (a[]) bVar.f1869d) {
            h s2 = s.s(e2);
            if (s2 == h.DENY || s2 == h.ACCEPT) {
                return s2;
            }
        }
        return h.NEUTRAL;
    }
}
