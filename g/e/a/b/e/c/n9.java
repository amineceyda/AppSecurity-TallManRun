package g.e.a.b.e.c;

import java.io.IOException;
import java.util.Arrays;

public final class n9 extends l9 {
    public final /* synthetic */ int a(Object obj) {
        return ((m9) obj).a();
    }

    public final int b(Object obj) {
        m9 m9Var = (m9) obj;
        int i2 = m9Var.f3002d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < m9Var.a; i4++) {
            int i5 = m9Var.b[i4];
            int a = x6.a(8);
            int h2 = ((s6) m9Var.c[i4]).h();
            i3 += x6.a(h2) + h2 + x6.a(24) + x6.a(i5 >>> 3) + x6.a(16) + a + a;
        }
        m9Var.f3002d = i3;
        return i3;
    }

    public final /* synthetic */ Object c(Object obj) {
        return ((o7) obj).zzc;
    }

    public final Object d(Object obj, Object obj2) {
        m9 m9Var = (m9) obj2;
        if (m9Var.equals(m9.f3001f)) {
            return obj;
        }
        m9 m9Var2 = (m9) obj;
        int i2 = m9Var2.a + m9Var.a;
        int[] copyOf = Arrays.copyOf(m9Var2.b, i2);
        System.arraycopy(m9Var.b, 0, copyOf, m9Var2.a, m9Var.a);
        Object[] copyOf2 = Arrays.copyOf(m9Var2.c, i2);
        System.arraycopy(m9Var.c, 0, copyOf2, m9Var2.a, m9Var.a);
        return new m9(i2, copyOf, copyOf2, true);
    }

    public final /* synthetic */ Object e() {
        return m9.b();
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, int i2, long j2) {
        ((m9) obj).c(i2 << 3, Long.valueOf(j2));
    }

    public final void g(Object obj) {
        ((o7) obj).zzc.f3003e = false;
    }

    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((o7) obj).zzc = (m9) obj2;
    }

    public final /* synthetic */ void i(Object obj, y6 y6Var) throws IOException {
        ((m9) obj).d(y6Var);
    }
}
