package g.e.b.k;

import g.e.b.q.b;

public class x<T> implements b<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile b<T> b;

    public x(b<T> bVar) {
        this.b = bVar;
    }

    public T get() {
        T t = this.a;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.a;
                if (t == t2) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
