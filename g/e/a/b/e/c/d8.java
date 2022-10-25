package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class d8 extends i6 implements RandomAccess, t7, u8 {

    /* renamed from: e  reason: collision with root package name */
    public static final d8 f2915e;
    public long[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f2916d;

    static {
        d8 d8Var = new d8(new long[0], 0);
        f2915e = d8Var;
        d8Var.b = false;
    }

    public d8() {
        this.c = new long[10];
        this.f2916d = 0;
    }

    public d8(long[] jArr, int i2) {
        this.c = jArr;
        this.f2916d = i2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f2916d)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        long[] jArr = this.c;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.c, i2, jArr2, i2 + 1, this.f2916d - i2);
            this.c = jArr2;
        }
        this.c[i2] = longValue;
        this.f2916d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        Charset charset = v7.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof d8)) {
            return super.addAll(collection);
        }
        d8 d8Var = (d8) collection;
        int i2 = d8Var.f2916d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2916d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.c;
            if (i4 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(d8Var.c, 0, this.c, this.f2916d, d8Var.f2916d);
            this.f2916d = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i2) {
        l(i2);
        return this.c[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return super.equals(obj);
        }
        d8 d8Var = (d8) obj;
        if (this.f2916d != d8Var.f2916d) {
            return false;
        }
        long[] jArr = d8Var.c;
        for (int i2 = 0; i2 < this.f2916d; i2++) {
            if (this.c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final t7 o(int i2) {
        if (i2 >= this.f2916d) {
            return new d8(Arrays.copyOf(this.c, i2), this.f2916d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        l(i2);
        return Long.valueOf(this.c[i2]);
    }

    public final void h(long j2) {
        c();
        int i2 = this.f2916d;
        long[] jArr = this.c;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.c = jArr2;
        }
        long[] jArr3 = this.c;
        int i3 = this.f2916d;
        this.f2916d = i3 + 1;
        jArr3[i3] = j2;
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2916d; i3++) {
            i2 = (i2 * 31) + v7.b(this.c[i3]);
        }
        return i2;
    }

    public final String i(int i2) {
        int i3 = this.f2916d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f2916d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f2916d) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        l(i2);
        long[] jArr = this.c;
        long j2 = jArr[i2];
        int i3 = this.f2916d;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f2916d--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i3, jArr, i2, this.f2916d - i3);
            this.f2916d -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        l(i2);
        long[] jArr = this.c;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f2916d;
    }
}
