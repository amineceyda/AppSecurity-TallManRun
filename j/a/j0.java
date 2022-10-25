package j.a;

import g.a.a.a.a;
import i.j;

public final class j0 extends d {
    public final i0 b;

    public j0(i0 i0Var) {
        this.b = i0Var;
    }

    public void a(Throwable th) {
        this.b.b();
    }

    public Object g(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.b();
        return j.a;
    }

    public String toString() {
        StringBuilder i2 = a.i("DisposeOnCancel[");
        i2.append(this.b);
        i2.append(']');
        return i2.toString();
    }
}
