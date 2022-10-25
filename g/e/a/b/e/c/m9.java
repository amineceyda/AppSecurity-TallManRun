package g.e.a.b.e.c;

import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkh;
import java.io.IOException;
import java.util.Arrays;

public final class m9 {

    /* renamed from: f  reason: collision with root package name */
    public static final m9 f3001f = new m9(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f3002d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3003e;

    public m9() {
        this(0, new int[8], new Object[8], true);
    }

    public m9(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f3002d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.f3003e = z;
    }

    public static m9 b() {
        return new m9(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i2;
        int i3;
        int i4;
        int i5 = this.f3002d;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.a; i7++) {
            int i8 = this.b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.c[i7]).longValue();
                    i4 = x6.a(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int a2 = x6.a(i9 << 3);
                    int h2 = ((s6) this.c[i7]).h();
                    i6 = x6.a(h2) + h2 + a2 + i6;
                } else if (i10 == 3) {
                    int w = x6.w(i9);
                    i3 = w + w;
                    i2 = ((m9) this.c[i7]).a();
                } else if (i10 == 5) {
                    ((Integer) this.c[i7]).intValue();
                    i4 = x6.a(i9 << 3) + 4;
                } else {
                    int i11 = zzkh.b;
                    throw new IllegalStateException(new zzkg());
                }
                i6 = i4 + i6;
            } else {
                long longValue = ((Long) this.c[i7]).longValue();
                i3 = x6.a(i9 << 3);
                i2 = x6.b(longValue);
            }
            i6 = i2 + i3 + i6;
        }
        this.f3002d = i6;
        return i6;
    }

    public final void c(int i2, Object obj) {
        if (this.f3003e) {
            int i3 = this.a;
            int[] iArr = this.b;
            if (i3 == iArr.length) {
                int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.b;
            int i5 = this.a;
            iArr2[i5] = i2;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(y6 y6Var) throws IOException {
        if (this.a != 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3 = this.b[i2];
                Object obj = this.c[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    y6Var.a.p(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    y6Var.a.h(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    y6Var.a.e(i4, (s6) obj);
                } else if (i5 == 3) {
                    y6Var.a.m(i4, 3);
                    ((m9) obj).d(y6Var);
                    y6Var.a.m(i4, 4);
                } else if (i5 == 5) {
                    y6Var.a.f(i4, ((Integer) obj).intValue());
                } else {
                    int i6 = zzkh.b;
                    throw new RuntimeException(new zzkg());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        int i2 = this.a;
        if (i2 == m9Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = m9Var.b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = m9Var.c;
                    int i4 = this.a;
                    int i5 = 0;
                    while (i5 < i4) {
                        if (objArr[i5].equals(objArr2[i5])) {
                            i5++;
                        }
                    }
                    return true;
                } else if (iArr[i3] != iArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
