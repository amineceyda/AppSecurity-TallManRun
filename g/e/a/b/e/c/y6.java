package g.e.a.b.e.c;

import java.io.IOException;
import java.nio.charset.Charset;

public final class y6 {
    public final x6 a;

    public y6(x6 x6Var) {
        Charset charset = v7.a;
        this.a = x6Var;
        x6Var.a = this;
    }

    public final void a(int i2, int i3) throws IOException {
        this.a.n(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void b(int i2, long j2) throws IOException {
        this.a.p(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void c(int i2, double d2) throws IOException {
        this.a.h(i2, Double.doubleToRawLongBits(d2));
    }

    public final void d(int i2, float f2) throws IOException {
        this.a.f(i2, Float.floatToRawIntBits(f2));
    }

    public final void e(int i2, Object obj, y8 y8Var) throws IOException {
        x6 x6Var = this.a;
        x6Var.m(i2, 3);
        y8Var.h((o8) obj, x6Var.a);
        x6Var.m(i2, 4);
    }

    public final void f(int i2, Object obj, y8 y8Var) throws IOException {
        o8 o8Var = (o8) obj;
        w6 w6Var = (w6) this.a;
        w6Var.o((i2 << 3) | 2);
        h6 h6Var = (h6) o8Var;
        int f2 = h6Var.f();
        if (f2 == -1) {
            f2 = y8Var.e(h6Var);
            h6Var.h(f2);
        }
        w6Var.o(f2);
        y8Var.h(o8Var, w6Var.a);
    }
}
