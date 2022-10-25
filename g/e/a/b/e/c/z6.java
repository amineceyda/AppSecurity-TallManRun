package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class z6 extends i6 implements RandomAccess, u7, u8 {

    /* renamed from: e  reason: collision with root package name */
    public static final z6 f3092e;
    public double[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f3093d;

    static {
        z6 z6Var = new z6(new double[0], 0);
        f3092e = z6Var;
        z6Var.b = false;
    }

    public z6() {
        this.c = new double[10];
        this.f3093d = 0;
    }

    public z6(double[] dArr, int i2) {
        this.c = dArr;
        this.f3093d = i2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3093d)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        double[] dArr = this.c;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.c, i2, dArr2, i2 + 1, this.f3093d - i2);
            this.c = dArr2;
        }
        this.c[i2] = doubleValue;
        this.f3093d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        Charset charset = v7.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof z6)) {
            return super.addAll(collection);
        }
        z6 z6Var = (z6) collection;
        int i2 = z6Var.f3093d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3093d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.c;
            if (i4 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(z6Var.c, 0, this.c, this.f3093d, z6Var.f3093d);
            this.f3093d = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d2) {
        c();
        int i2 = this.f3093d;
        double[] dArr = this.c;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.c = dArr2;
        }
        double[] dArr3 = this.c;
        int i3 = this.f3093d;
        this.f3093d = i3 + 1;
        dArr3[i3] = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return super.equals(obj);
        }
        z6 z6Var = (z6) obj;
        if (this.f3093d != z6Var.f3093d) {
            return false;
        }
        double[] dArr = z6Var.c;
        for (int i2 = 0; i2 < this.f3093d; i2++) {
            if (Double.doubleToLongBits(this.c[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i2) {
        int i3 = this.f3093d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ Object get(int i2) {
        h(i2);
        return Double.valueOf(this.c[i2]);
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f3093d) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3093d; i3++) {
            i2 = (i2 * 31) + v7.b(Double.doubleToLongBits(this.c[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f3093d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ u7 o(int i2) {
        if (i2 >= this.f3093d) {
            return new z6(Arrays.copyOf(this.c, i2), this.f3093d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        h(i2);
        double[] dArr = this.c;
        double d2 = dArr[i2];
        int i3 = this.f3093d;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f3093d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i3, dArr, i2, this.f3093d - i3);
            this.f3093d -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        h(i2);
        double[] dArr = this.c;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f3093d;
    }
}
