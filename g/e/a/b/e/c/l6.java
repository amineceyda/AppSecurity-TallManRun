package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class l6 extends i6 implements RandomAccess, u7, u8 {

    /* renamed from: e  reason: collision with root package name */
    public static final l6 f2988e;
    public boolean[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f2989d;

    static {
        l6 l6Var = new l6(new boolean[0], 0);
        f2988e = l6Var;
        l6Var.b = false;
    }

    public l6() {
        this.c = new boolean[10];
        this.f2989d = 0;
    }

    public l6(boolean[] zArr, int i2) {
        this.c = zArr;
        this.f2989d = i2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f2989d)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        boolean[] zArr = this.c;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.c, i2, zArr2, i2 + 1, this.f2989d - i2);
            this.c = zArr2;
        }
        this.c[i2] = booleanValue;
        this.f2989d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        Charset charset = v7.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof l6)) {
            return super.addAll(collection);
        }
        l6 l6Var = (l6) collection;
        int i2 = l6Var.f2989d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2989d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.c;
            if (i4 > zArr.length) {
                this.c = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(l6Var.c, 0, this.c, this.f2989d, l6Var.f2989d);
            this.f2989d = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z) {
        c();
        int i2 = this.f2989d;
        boolean[] zArr = this.c;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.c = zArr2;
        }
        boolean[] zArr3 = this.c;
        int i3 = this.f2989d;
        this.f2989d = i3 + 1;
        zArr3[i3] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return super.equals(obj);
        }
        l6 l6Var = (l6) obj;
        if (this.f2989d != l6Var.f2989d) {
            return false;
        }
        boolean[] zArr = l6Var.c;
        for (int i2 = 0; i2 < this.f2989d; i2++) {
            if (this.c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i2) {
        int i3 = this.f2989d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ Object get(int i2) {
        h(i2);
        return Boolean.valueOf(this.c[i2]);
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f2989d) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2989d; i3++) {
            i2 = (i2 * 31) + v7.a(this.c[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f2989d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ u7 o(int i2) {
        if (i2 >= this.f2989d) {
            return new l6(Arrays.copyOf(this.c, i2), this.f2989d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        h(i2);
        boolean[] zArr = this.c;
        boolean z = zArr[i2];
        int i3 = this.f2989d;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f2989d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            boolean[] zArr = this.c;
            System.arraycopy(zArr, i3, zArr, i2, this.f2989d - i3);
            this.f2989d -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        h(i2);
        boolean[] zArr = this.c;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f2989d;
    }
}
