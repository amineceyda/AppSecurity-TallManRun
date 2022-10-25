package g.e.a.b.e.c;

public final class b8 extends c8 {
    public final void a(Object obj, long j2) {
        ((u7) v9.j(obj, j2)).j();
    }

    public final void b(Object obj, Object obj2, long j2) {
        u7 u7Var = (u7) v9.j(obj, j2);
        u7 u7Var2 = (u7) v9.j(obj2, j2);
        int size = u7Var.size();
        int size2 = u7Var2.size();
        if (size > 0 && size2 > 0) {
            if (!u7Var.k()) {
                u7Var = u7Var.o(size2 + size);
            }
            u7Var.addAll(u7Var2);
        }
        if (size > 0) {
            u7Var2 = u7Var;
        }
        v9.f3057d.p(obj, j2, u7Var2);
    }
}
