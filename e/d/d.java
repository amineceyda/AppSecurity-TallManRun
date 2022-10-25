package e.d;

import org.slf4j.helpers.MessageFormatter;

public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1243f = new Object();
    public boolean b = false;
    public long[] c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f1244d;

    /* renamed from: e  reason: collision with root package name */
    public int f1245e;

    public d() {
        int f2 = c.f(10);
        this.c = new long[f2];
        this.f1244d = new Object[f2];
    }

    public void a(long j2, E e2) {
        int i2 = this.f1245e;
        if (i2 == 0 || j2 > this.c[i2 - 1]) {
            if (this.b && i2 >= this.c.length) {
                c();
            }
            int i3 = this.f1245e;
            if (i3 >= this.c.length) {
                int f2 = c.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1244d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.f1244d = objArr;
            }
            this.c[i3] = j2;
            this.f1244d[i3] = e2;
            this.f1245e = i3 + 1;
            return;
        }
        e(j2, e2);
    }

    /* renamed from: b */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.c = (long[]) this.c.clone();
            dVar.f1244d = (Object[]) this.f1244d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f1245e;
        long[] jArr = this.c;
        Object[] objArr = this.f1244d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1243f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.b = false;
        this.f1245e = i3;
    }

    public E d(long j2, E e2) {
        int b2 = c.b(this.c, this.f1245e, j2);
        if (b2 >= 0) {
            E[] eArr = this.f1244d;
            if (eArr[b2] != f1243f) {
                return eArr[b2];
            }
        }
        return e2;
    }

    public void e(long j2, E e2) {
        int b2 = c.b(this.c, this.f1245e, j2);
        if (b2 >= 0) {
            this.f1244d[b2] = e2;
            return;
        }
        int i2 = b2 ^ -1;
        int i3 = this.f1245e;
        if (i2 < i3) {
            Object[] objArr = this.f1244d;
            if (objArr[i2] == f1243f) {
                this.c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.b && i3 >= this.c.length) {
            c();
            i2 = c.b(this.c, this.f1245e, j2) ^ -1;
        }
        int i4 = this.f1245e;
        if (i4 >= this.c.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1244d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.f1244d = objArr2;
        }
        int i5 = this.f1245e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1244d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1245e - i2);
        }
        this.c[i2] = j2;
        this.f1244d[i2] = e2;
        this.f1245e++;
    }

    public String toString() {
        if (this.b) {
            c();
        }
        int i2 = this.f1245e;
        if (i2 <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append(MessageFormatter.DELIM_START);
        for (int i3 = 0; i3 < this.f1245e; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.b) {
                c();
            }
            sb.append(this.c[i3]);
            sb.append('=');
            if (this.b) {
                c();
            }
            Object obj = this.f1244d[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
