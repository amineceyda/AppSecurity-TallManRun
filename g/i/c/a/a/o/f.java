package g.i.c.a.a.o;

import java.util.ArrayList;

public abstract class f<T> extends ArrayList<T> {
    public f(int i2) {
        super(i2);
    }

    public abstract T c();

    public T get(int i2) {
        int i3 = i2 + 1;
        while (size() < i3) {
            add(c());
        }
        return super.get(i2);
    }

    public T set(int i2, T t) {
        int i3 = i2 + 1;
        while (size() < i3) {
            add(c());
        }
        return super.set(i2, t);
    }
}
