package j.a.t1;

import i.o.c.h;
import j.a.m0;
import j.a.t1.r;
import java.lang.Comparable;
import java.util.Arrays;

public class q<T extends r & Comparable<? super T>> {
    public volatile int _size = 0;
    public T[] a;

    public final void a(T t) {
        m0.b bVar = (m0.b) t;
        bVar.d(this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = new r[4];
            this.a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            h.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (r[]) copyOf;
            this.a = tArr;
        }
        int i2 = this._size;
        this._size = i2 + 1;
        tArr[i2] = t;
        bVar.c = i2;
        d(i2);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T c(int i2) {
        T[] tArr = this.a;
        h.c(tArr);
        this._size--;
        if (i2 < this._size) {
            e(i2, this._size);
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t = tArr[i2];
                h.c(t);
                T t2 = tArr[i3];
                h.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    e(i2, i3);
                    d(i3);
                }
            }
            while (true) {
                int i4 = (i2 * 2) + 1;
                if (i4 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                h.c(tArr2);
                int i5 = i4 + 1;
                if (i5 < this._size) {
                    T t3 = tArr2[i5];
                    h.c(t3);
                    T t4 = tArr2[i4];
                    h.c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i4 = i5;
                    }
                }
                T t5 = tArr2[i2];
                h.c(t5);
                T t6 = tArr2[i4];
                h.c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                e(i2, i4);
                i2 = i4;
            }
        }
        T t7 = tArr[this._size];
        h.c(t7);
        t7.d((q<?>) null);
        t7.a(-1);
        tArr[this._size] = null;
        return t7;
    }

    public final void d(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            h.c(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            h.c(t);
            T t2 = tArr[i2];
            h.c(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                e(i2, i3);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public final void e(int i2, int i3) {
        T[] tArr = this.a;
        h.c(tArr);
        T t = tArr[i3];
        h.c(t);
        T t2 = tArr[i2];
        h.c(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.a(i2);
        t2.a(i3);
    }
}
