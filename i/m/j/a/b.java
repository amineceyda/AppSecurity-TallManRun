package i.m.j.a;

import i.m.d;
import i.m.f;

public final class b implements d<Object> {
    public static final b b = new b();

    public f c() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void g(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
