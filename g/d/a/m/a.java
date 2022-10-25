package g.d.a.m;

import g.d.a.r.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class a implements h {
    public final Set<i> a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    public void a(i iVar) {
        this.a.add(iVar);
        if (this.c) {
            iVar.k();
        } else if (this.b) {
            iVar.a();
        } else {
            iVar.e();
        }
    }

    public void b(i iVar) {
        this.a.remove(iVar);
    }

    public void c() {
        this.c = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    public void d() {
        this.b = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public void e() {
        this.b = false;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }
}
