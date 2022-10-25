package g.d.a.m;

import g.d.a.p.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class n {
    public final Set<b> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<b> b = new ArrayList();
    public boolean c;

    public boolean a(b bVar) {
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.a.remove(bVar);
        if (!this.b.remove(bVar) && !remove) {
            z = false;
        }
        if (z) {
            bVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
