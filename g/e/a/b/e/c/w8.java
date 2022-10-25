package g.e.a.b.e.c;

import java.util.Arrays;
import java.util.RandomAccess;

public final class w8 extends i6 implements RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    public static final w8 f3078e;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f3079d;

    static {
        w8 w8Var = new w8(new Object[0], 0);
        f3078e = w8Var;
        w8Var.b = false;
    }

    public w8(Object[] objArr, int i2) {
        this.c = objArr;
        this.f3079d = i2;
    }

    public final void add(int i2, Object obj) {
        int i3;
        c();
        if (i2 < 0 || i2 > (i3 = this.f3079d)) {
            throw new IndexOutOfBoundsException(e(i2));
        }
        Object[] objArr = this.c;
        if (i3 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        } else {
            Object[] objArr2 = new Object[(((i3 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.c, i2, objArr2, i2 + 1, this.f3079d - i2);
            this.c = objArr2;
        }
        this.c[i2] = obj;
        this.f3079d++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        c();
        int i2 = this.f3079d;
        Object[] objArr = this.c;
        if (i2 == objArr.length) {
            this.c = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c;
        int i3 = this.f3079d;
        this.f3079d = i3 + 1;
        objArr2[i3] = obj;
        this.modCount++;
        return true;
    }

    public final String e(int i2) {
        int i3 = this.f3079d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final void f(int i2) {
        if (i2 < 0 || i2 >= this.f3079d) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    public final Object get(int i2) {
        f(i2);
        return this.c[i2];
    }

    public final /* bridge */ /* synthetic */ u7 o(int i2) {
        if (i2 >= this.f3079d) {
            return new w8(Arrays.copyOf(this.c, i2), this.f3079d);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i2) {
        c();
        f(i2);
        Object[] objArr = this.c;
        Object obj = objArr[i2];
        int i3 = this.f3079d;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f3079d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        c();
        f(i2);
        Object[] objArr = this.c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f3079d;
    }
}
