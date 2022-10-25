package g.e.a.b.e.c;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class u9 {
    public final Unsafe a;

    public u9(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j2);

    public abstract float b(Object obj, long j2);

    public abstract void c(Object obj, long j2, boolean z);

    public abstract void d(Object obj, long j2, byte b);

    public abstract void e(Object obj, long j2, double d2);

    public abstract void f(Object obj, long j2, float f2);

    public abstract boolean g(Object obj, long j2);

    public final int h(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j2) {
        return this.a.getInt(obj, j2);
    }

    public final long k(Object obj, long j2) {
        return this.a.getLong(obj, j2);
    }

    public final long l(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j2) {
        return this.a.getObject(obj, j2);
    }

    public final void n(Object obj, long j2, int i2) {
        this.a.putInt(obj, j2, i2);
    }

    public final void o(Object obj, long j2, long j3) {
        this.a.putLong(obj, j2, j3);
    }

    public final void p(Object obj, long j2, Object obj2) {
        this.a.putObject(obj, j2, obj2);
    }
}
