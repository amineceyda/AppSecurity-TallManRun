package g.e.a.b.e.c;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public final class a9 {
    public static final Class a;
    public static final l9 b = u(false);
    public static final l9 c = u(true);

    /* renamed from: d  reason: collision with root package name */
    public static final l9 f2885d = new n9();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static int A(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.a(i2 << 3) + 8) * size;
    }

    public static int B(List list) {
        return list.size() * 8;
    }

    public static int C(int i2, List list, y8 y8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += x6.s(i2, (o8) list.get(i4), y8Var);
        }
        return i3;
    }

    public static int D(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + E(list);
    }

    public static int E(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += x6.t(p7Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + x6.t(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int F(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (x6.w(i2) * list.size()) + G(list);
    }

    public static int G(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d8) {
            d8 d8Var = (d8) list;
            i2 = 0;
            while (i3 < size) {
                i2 += x6.b(d8Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + x6.b(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int H(int i2, Object obj, y8 y8Var) {
        if (obj instanceof x7) {
            int a2 = x6.a(i2 << 3);
            int a3 = ((x7) obj).a();
            return x6.a(a3) + a3 + a2;
        }
        return x6.u((o8) obj, y8Var) + x6.a(i2 << 3);
    }

    public static int I(int i2, List list, y8 y8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = x6.w(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof x7) {
                int a2 = ((x7) obj).a();
                w += x6.a(a2) + a2;
            } else {
                w = x6.u((o8) obj, y8Var) + w;
            }
        }
        return w;
    }

    public static int J(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + K(list);
    }

    public static int K(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            i2 = 0;
            while (i3 < size) {
                int e2 = p7Var.e(i3);
                i2 += x6.a((e2 >> 31) ^ (e2 + e2));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i4 = i2 + x6.a((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int L(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + M(list);
    }

    public static int M(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d8) {
            d8 d8Var = (d8) list;
            i2 = 0;
            while (i3 < size) {
                long e2 = d8Var.e(i3);
                i2 += x6.b((e2 >> 63) ^ (e2 + e2));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i4 = i2 + x6.b((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int N(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int w = x6.w(i2) * size;
        if (list instanceof z7) {
            z7 z7Var = (z7) list;
            while (i3 < size) {
                Object F = z7Var.F(i3);
                w = (F instanceof s6 ? x6.r((s6) F) : x6.v((String) F)) + w;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                w = (obj instanceof s6 ? x6.r((s6) obj) : x6.v((String) obj)) + w;
                i3++;
            }
        }
        return w;
    }

    public static int O(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + P(list);
    }

    public static int P(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += x6.a(p7Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + x6.a(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int Q(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + R(list);
    }

    public static int R(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d8) {
            d8 d8Var = (d8) list;
            i2 = 0;
            while (i3 < size) {
                i2 += x6.b(d8Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + x6.b(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Boolean) list.get(i5)).booleanValue();
                    i4++;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.c(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : 0);
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.d(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
        }
    }

    public static void c(int i2, List list, y6 y6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            for (int i3 = 0; i3 < list.size(); i3++) {
                y6Var.a.e(i2, (s6) list.get(i3));
            }
        }
    }

    public static void d(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Double) list.get(i5)).doubleValue();
                    i4 += 8;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.i(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.h(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
        }
    }

    public static void e(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += x6.t(((Integer) list.get(i5)).intValue());
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.k(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.j(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void f(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Integer) list.get(i5)).intValue();
                    i4 += 4;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.g(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.f(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void g(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Long) list.get(i5)).longValue();
                    i4 += 8;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.i(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.h(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void h(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Float) list.get(i5)).floatValue();
                    i4 += 4;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.g(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.f(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
        }
    }

    public static void i(int i2, List list, y6 y6Var, y8 y8Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                y6Var.e(i2, list.get(i3), y8Var);
            }
        }
    }

    public static void j(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += x6.t(((Integer) list.get(i5)).intValue());
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.k(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.j(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void k(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += x6.b(((Long) list.get(i5)).longValue());
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.q(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.p(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void l(int i2, List list, y6 y6Var, y8 y8Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                y6Var.f(i2, list.get(i3), y8Var);
            }
        }
    }

    public static void m(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Integer) list.get(i5)).intValue();
                    i4 += 4;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.g(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.f(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void n(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Long) list.get(i5)).longValue();
                    i4 += 8;
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.i(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.h(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void o(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int intValue = ((Integer) list.get(i5)).intValue();
                    i4 += x6.a((intValue >> 31) ^ (intValue + intValue));
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    x6 x6Var = y6Var.a;
                    int intValue2 = ((Integer) list.get(i3)).intValue();
                    x6Var.o((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                x6 x6Var2 = y6Var.a;
                int intValue3 = ((Integer) list.get(i3)).intValue();
                x6Var2.n(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i3++;
            }
        }
    }

    public static void p(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    long longValue = ((Long) list.get(i5)).longValue();
                    i4 += x6.b((longValue >> 63) ^ (longValue + longValue));
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    x6 x6Var = y6Var.a;
                    long longValue2 = ((Long) list.get(i3)).longValue();
                    x6Var.q((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                x6 x6Var2 = y6Var.a;
                long longValue3 = ((Long) list.get(i3)).longValue();
                x6Var2.p(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i3++;
            }
        }
    }

    public static void q(int i2, List list, y6 y6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (list instanceof z7) {
                z7 z7Var = (z7) list;
                while (i3 < list.size()) {
                    Object F = z7Var.F(i3);
                    if (F instanceof String) {
                        y6Var.a.l(i2, (String) F);
                    } else {
                        y6Var.a.e(i2, (s6) F);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.l(i2, (String) list.get(i3));
                i3++;
            }
        }
    }

    public static void r(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += x6.a(((Integer) list.get(i5)).intValue());
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.o(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.n(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.a(i2 << 3) + 1) * size;
    }

    public static void t(int i2, List list, y6 y6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(y6Var);
            int i3 = 0;
            if (z) {
                y6Var.a.m(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += x6.b(((Long) list.get(i5)).longValue());
                }
                y6Var.a.o(i4);
                while (i3 < list.size()) {
                    y6Var.a.q(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y6Var.a.p(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static l9 u(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (l9) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = x6.w(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            w += x6.r((s6) list.get(i3));
        }
        return w;
    }

    public static int w(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.w(i2) * size) + x(list);
    }

    public static int x(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += x6.t(p7Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + x6.t(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int y(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6.a(i2 << 3) + 4) * size;
    }

    public static int z(List list) {
        return list.size() * 4;
    }
}
