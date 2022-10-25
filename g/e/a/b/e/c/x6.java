package g.e.a.b.e.c;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class x6 extends m6 {
    public static final Logger b = Logger.getLogger(x6.class.getName());
    public static final boolean c = v9.f3059f;
    public y6 a;

    public x6() {
    }

    public /* synthetic */ x6(v6 v6Var) {
    }

    public static int a(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int b(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int r(s6 s6Var) {
        int h2 = s6Var.h();
        return a(h2) + h2;
    }

    @Deprecated
    public static int s(int i2, o8 o8Var, y8 y8Var) {
        int a2 = a(i2 << 3);
        int i3 = a2 + a2;
        h6 h6Var = (h6) o8Var;
        int f2 = h6Var.f();
        if (f2 == -1) {
            f2 = y8Var.e(h6Var);
            h6Var.h(f2);
        }
        return i3 + f2;
    }

    public static int t(int i2) {
        if (i2 >= 0) {
            return a(i2);
        }
        return 10;
    }

    public static int u(o8 o8Var, y8 y8Var) {
        h6 h6Var = (h6) o8Var;
        int f2 = h6Var.f();
        if (f2 == -1) {
            f2 = y8Var.e(h6Var);
            h6Var.h(f2);
        }
        return a(f2) + f2;
    }

    public static int v(String str) {
        int i2;
        try {
            i2 = y9.c(str);
        } catch (x9 unused) {
            i2 = str.getBytes(v7.a).length;
        }
        return a(i2) + i2;
    }

    public static int w(int i2) {
        return a(i2 << 3);
    }

    public abstract void c(byte b2) throws IOException;

    public abstract void d(int i2, boolean z) throws IOException;

    public abstract void e(int i2, s6 s6Var) throws IOException;

    public abstract void f(int i2, int i3) throws IOException;

    public abstract void g(int i2) throws IOException;

    public abstract void h(int i2, long j2) throws IOException;

    public abstract void i(long j2) throws IOException;

    public abstract void j(int i2, int i3) throws IOException;

    public abstract void k(int i2) throws IOException;

    public abstract void l(int i2, String str) throws IOException;

    public abstract void m(int i2, int i3) throws IOException;

    public abstract void n(int i2, int i3) throws IOException;

    public abstract void o(int i2) throws IOException;

    public abstract void p(int i2, long j2) throws IOException;

    public abstract void q(long j2) throws IOException;
}
