package g.e.b.t;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class d implements h {
    public final String a;
    public final e b;

    public d(Set<f> set, e eVar) {
        this.a = b(set);
        this.b = eVar;
    }

    public static String b(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        Set<T> unmodifiableSet;
        Set<T> unmodifiableSet2;
        e eVar = this.b;
        synchronized (eVar.a) {
            unmodifiableSet = Collections.unmodifiableSet(eVar.a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        e eVar2 = this.b;
        synchronized (eVar2.a) {
            unmodifiableSet2 = Collections.unmodifiableSet(eVar2.a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
