package e.e.i;

public class d<T> extends d<T> implements c {
    public final Object[] a;
    public int b;
    public final Object c;

    public d(int i2) {
        if (i2 > 0) {
            this.a = new Object[i2];
            this.c = new Object();
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t) {
        boolean z;
        synchronized (this.c) {
            try {
                if (!c(t)) {
                    int i2 = this.b;
                    Object[] objArr = this.a;
                    if (i2 < objArr.length) {
                        objArr[i2] = t;
                        z = true;
                        this.b = i2 + 1;
                    } else {
                        z = false;
                    }
                } else {
                    throw new IllegalStateException("Already in the pool!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public T b() {
        T t;
        synchronized (this.c) {
            int i2 = this.b;
            t = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                T[] tArr = this.a;
                T t2 = tArr[i3];
                tArr[i3] = null;
                this.b = i3;
                t = t2;
            }
        }
        return t;
    }

    public final boolean c(Object obj) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
