package g.c.b.a.l;

import g.c.b.b.f;
import i.c;
import i.o.c.h;
import i.o.c.i;

public final class e {
    public static final c a = f.U(a.b);

    public static final class a extends i implements i.o.b.a<char[]> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        }
    }

    public static final String a(String str) {
        h.e(str, "<this>");
        String i2 = l.h.g(str).l().i();
        h.d(i2, "encodeUtf8(this).md5().hex()");
        return i2;
    }
}
