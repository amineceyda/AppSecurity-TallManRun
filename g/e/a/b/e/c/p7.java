package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class p7 extends i6 implements RandomAccess, s7, u8 {

    /* renamed from: e  reason: collision with root package name */
    public static final p7 f3018e;
    public int[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f3019d;

    static {
        p7 p7Var = new p7(new int[0], 0);
        f3018e = p7Var;
        p7Var.b = false;
    }

    public p7() {
        this.c = new int[10];
        this.f3019d = 0;
    }

    public p7(int[] iArr, int i2) {
        this.c = iArr;
        this.f3019d = i2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3019d)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        int[] iArr = this.c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.c, i2, iArr2, i2 + 1, this.f3019d - i2);
            this.c = iArr2;
        }
        this.c[i2] = intValue;
        this.f3019d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        Charset charset = v7.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof p7)) {
            return super.addAll(collection);
        }
        p7 p7Var = (p7) collection;
        int i2 = p7Var.f3019d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3019d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.c;
            if (i4 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(p7Var.c, 0, this.c, this.f3019d, p7Var.f3019d);
            this.f3019d = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i2) {
        l(i2);
        return this.c[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return super.equals(obj);
        }
        p7 p7Var = (p7) obj;
        if (this.f3019d != p7Var.f3019d) {
            return false;
        }
        int[] iArr = p7Var.c;
        for (int i2 = 0; i2 < this.f3019d; i2++) {
            if (this.c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final s7 o(int i2) {
        if (i2 >= this.f3019d) {
            return new p7(Arrays.copyOf(this.c, i2), this.f3019d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        l(i2);
        return Integer.valueOf(this.c[i2]);
    }

    public final void h(int i2) {
        c();
        int i3 = this.f3019d;
        int[] iArr = this.c;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i4 = this.f3019d;
        this.f3019d = i4 + 1;
        iArr3[i4] = i2;
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3019d; i3++) {
            i2 = (i2 * 31) + this.c[i3];
        }
        return i2;
    }

    public final String i(int i2) {
        int i3 = this.f3019d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f3019d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f3019d) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        l(i2);
        int[] iArr = this.c;
        int i3 = iArr[i2];
        int i4 = this.f3019d;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f3019d--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i3, iArr, i2, this.f3019d - i3);
            this.f3019d -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        l(i2);
        int[] iArr = this.c;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f3019d;
    }
}
