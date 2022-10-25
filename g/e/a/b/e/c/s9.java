package g.e.a.b.e.c;

import sun.misc.Unsafe;

public final class s9 extends u9 {
    public s9(Unsafe unsafe) {
        super(unsafe);
    }

    public final double a(Object obj, long j2) {
        return Double.longBitsToDouble(k(obj, j2));
    }

    public final float b(Object obj, long j2) {
        return Float.intBitsToFloat(j(obj, j2));
    }

    public final void c(Object obj, long j2, boolean z) {
        if (v9.f3061h) {
            v9.c(obj, j2, z);
        } else {
            v9.d(obj, j2, z ? (byte) 1 : 0);
        }
    }

    public final void d(Object obj, long j2, byte b) {
        if (v9.f3061h) {
            v9.c(obj, j2, b);
        } else {
            v9.d(obj, j2, b);
        }
    }

    public final void e(Object obj, long j2, double d2) {
        o(obj, j2, Double.doubleToLongBits(d2));
    }

    public final void f(Object obj, long j2, float f2) {
        n(obj, j2, Float.floatToIntBits(f2));
    }

    public final boolean g(Object obj, long j2) {
        return v9.f3061h ? v9.o(obj, j2) : v9.p(obj, j2);
    }
}
