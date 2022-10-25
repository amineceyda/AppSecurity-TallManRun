package j.a.t1;

import g.a.a.a.a;
import i.m.f;
import j.a.x;

public final class d implements x {
    public final f b;

    public d(f fVar) {
        this.b = fVar;
    }

    public f f() {
        return this.b;
    }

    public String toString() {
        StringBuilder i2 = a.i("CoroutineScope(coroutineContext=");
        i2.append(this.b);
        i2.append(')');
        return i2.toString();
    }
}
