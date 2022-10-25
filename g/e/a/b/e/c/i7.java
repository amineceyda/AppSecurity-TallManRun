package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class i7 extends i6 implements RandomAccess, u7, u8 {

    /* renamed from: e  reason: collision with root package name */
    public static final i7 f2954e;
    public float[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f2955d;

    static {
        i7 i7Var = new i7(new float[0], 0);
        f2954e = i7Var;
        i7Var.b = false;
    }

    public i7() {
        this.c = new float[10];
        this.f2955d = 0;
    }

    public i7(float[] fArr, int i2) {
        this.c = fArr;
        this.f2955d = i2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f2955d)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        float[] fArr = this.c;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.c, i2, fArr2, i2 + 1, this.f2955d - i2);
            this.c = fArr2;
        }
        this.c[i2] = floatValue;
        this.f2955d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        Charset charset = v7.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof i7)) {
            return super.addAll(collection);
        }
        i7 i7Var = (i7) collection;
        int i2 = i7Var.f2955d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2955d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.c;
            if (i4 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(i7Var.c, 0, this.c, this.f2955d, i7Var.f2955d);
            this.f2955d = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f2) {
        c();
        int i2 = this.f2955d;
        float[] fArr = this.c;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.c = fArr2;
        }
        float[] fArr3 = this.c;
        int i3 = this.f2955d;
        this.f2955d = i3 + 1;
        fArr3[i3] = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return super.equals(obj);
        }
        i7 i7Var = (i7) obj;
        if (this.f2955d != i7Var.f2955d) {
            return false;
        }
        float[] fArr = i7Var.c;
        for (int i2 = 0; i2 < this.f2955d; i2++) {
            if (Float.floatToIntBits(this.c[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i2) {
        int i3 = this.f2955d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ Object get(int i2) {
        h(i2);
        return Float.valueOf(this.c[i2]);
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f2955d) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2955d; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.c[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f2955d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ u7 o(int i2) {
        if (i2 >= this.f2955d) {
            return new i7(Arrays.copyOf(this.c, i2), this.f2955d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        h(i2);
        float[] fArr = this.c;
        float f2 = fArr[i2];
        int i3 = this.f2955d;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f2955d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i3, fArr, i2, this.f2955d - i3);
            this.f2955d -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        h(i2);
        float[] fArr = this.c;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f2955d;
    }
}
