package i.n.c;

import i.o.c.h;

public class a extends i.n.a {
    public void a(Throwable th, Throwable th2) {
        h.e(th, "cause");
        h.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
