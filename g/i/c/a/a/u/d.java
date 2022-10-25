package g.i.c.a.a.u;

import g.i.c.a.a.l.b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;

public class d {
    public final Deque<b> a = new ArrayDeque();
    public WeakReference<Object> b;

    public d a() {
        d dVar = new d();
        dVar.b = this.b;
        for (b addLast : this.a) {
            dVar.a.addLast(addLast);
        }
        return dVar;
    }

    public Object b() {
        WeakReference<Object> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
