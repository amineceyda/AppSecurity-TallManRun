package i.p;

import i.n.b;
import i.o.c.f;
import i.o.c.h;
import java.io.Serializable;

public abstract class c {
    public static final c b = b.a.b();
    public static final a c = new a((f) null);

    public static final class a extends c implements Serializable {

        /* renamed from: i.p.c$a$a  reason: collision with other inner class name */
        public static final class C0193a implements Serializable {
            public static final C0193a b = new C0193a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return c.c;
            }
        }

        public a() {
        }

        public a(f fVar) {
        }

        private final Object writeReplace() {
            return C0193a.b;
        }

        public int a(int i2) {
            return c.b.a(i2);
        }

        public int b() {
            return c.b.b();
        }

        public int c(int i2, int i3) {
            return c.b.c(i2, i3);
        }
    }

    public abstract int a(int i2);

    public abstract int b();

    public int c(int i2, int i3) {
        int i4;
        int b2;
        int i5;
        if (i3 > i2) {
            int i6 = i3 - i2;
            if (i6 > 0 || i6 == Integer.MIN_VALUE) {
                if (((-i6) & i6) == i6) {
                    i4 = a(31 - Integer.numberOfLeadingZeros(i6));
                } else {
                    do {
                        b2 = b() >>> 1;
                        i5 = b2 % i6;
                    } while ((i6 - 1) + (b2 - i5) < 0);
                    i4 = i5;
                }
                return i2 + i4;
            }
            while (true) {
                int b3 = b();
                if (i2 <= b3 && i3 > b3) {
                    return b3;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i3);
            h.e(valueOf, "from");
            h.e(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
    }
}
