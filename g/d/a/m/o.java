package g.d.a.m;

import g.d.a.p.i.h;
import g.d.a.r.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class o implements i {
    public final Set<h<?>> b = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        Iterator it = ((ArrayList) j.e(this.b)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public void e() {
        Iterator it = ((ArrayList) j.e(this.b)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).e();
        }
    }

    public void k() {
        Iterator it = ((ArrayList) j.e(this.b)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).k();
        }
    }
}
