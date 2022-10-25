package e.d;

import org.slf4j.helpers.MessageFormatter;

public class h<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f1261e = new Object();
    public int[] b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f1262d;

    public h() {
        int e2 = c.e(10);
        this.b = new int[e2];
        this.c = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f1262d;
        if (i3 == 0 || i2 > this.b[i3 - 1]) {
            if (i3 >= this.b.length) {
                int e3 = c.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = iArr;
                this.c = objArr;
            }
            this.b[i3] = i2;
            this.c[i3] = e2;
            this.f1262d = i3 + 1;
            return;
        }
        d(i2, e2);
    }

    /* renamed from: b */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.b = (int[]) this.b.clone();
            hVar.c = (Object[]) this.c.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E c(int i2, E e2) {
        int a = c.a(this.b, this.f1262d, i2);
        if (a >= 0) {
            E[] eArr = this.c;
            if (eArr[a] != f1261e) {
                return eArr[a];
            }
        }
        return e2;
    }

    public void d(int i2, E e2) {
        int a = c.a(this.b, this.f1262d, i2);
        if (a >= 0) {
            this.c[a] = e2;
            return;
        }
        int i3 = a ^ -1;
        int i4 = this.f1262d;
        if (i3 < i4) {
            Object[] objArr = this.c;
            if (objArr[i3] == f1261e) {
                this.b[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (i4 >= this.b.length) {
            int e3 = c.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i5 = this.f1262d - i3;
        if (i5 != 0) {
            int[] iArr3 = this.b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f1262d - i3);
        }
        this.b[i3] = i2;
        this.c[i3] = e2;
        this.f1262d++;
    }

    public int e() {
        return this.f1262d;
    }

    public E f(int i2) {
        return this.c[i2];
    }

    public String toString() {
        if (e() <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb = new StringBuilder(this.f1262d * 28);
        sb.append(MessageFormatter.DELIM_START);
        for (int i2 = 0; i2 < this.f1262d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.b[i2]);
            sb.append('=');
            Object f2 = f(i2);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
