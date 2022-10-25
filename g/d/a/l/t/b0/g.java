package g.d.a.l.t.b0;

import g.d.a.l.t.b0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class g<K extends l, V> {
    public final a<K, V> a = new a<>(null);
    public final Map<K, a<K, V>> b = new HashMap();

    public static class a<K, V> {
        public final K a;
        public List<V> b;
        public a<K, V> c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f2435d;

        public a() {
            this((Object) null);
        }

        public a(K k2) {
            this.f2435d = this;
            this.c = this;
            this.a = k2;
        }

        public V a() {
            List<V> list = this.b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k2) {
        a<K, V> aVar = this.b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.b.put(k2, aVar);
        } else {
            k2.a();
        }
        a<K, V> aVar2 = aVar.f2435d;
        aVar2.c = aVar.c;
        aVar.c.f2435d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.f2435d = aVar3;
        a<K, V> aVar4 = aVar3.c;
        aVar.c = aVar4;
        aVar4.f2435d = aVar;
        aVar.f2435d.c = aVar;
        return aVar.a();
    }

    public void b(K k2, V v) {
        a<K, V> aVar = this.b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            a<K, V> aVar2 = aVar.f2435d;
            aVar2.c = aVar.c;
            aVar.c.f2435d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.f2435d = aVar3.f2435d;
            aVar.c = aVar3;
            aVar3.f2435d = aVar;
            aVar.f2435d.c = aVar;
            this.b.put(k2, aVar);
        } else {
            k2.a();
        }
        if (aVar.b == null) {
            aVar.b = new ArrayList();
        }
        aVar.b.add(v);
    }

    public V c() {
        a<K, V> aVar = this.a;
        while (true) {
            aVar = aVar.f2435d;
            if (aVar.equals(this.a)) {
                return null;
            }
            V a2 = aVar.a();
            if (a2 != null) {
                return a2;
            }
            a<K, V> aVar2 = aVar.f2435d;
            aVar2.c = aVar.c;
            aVar.c.f2435d = aVar2;
            this.b.remove(aVar.a);
            ((l) aVar.a).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.a.c; !aVar.equals(this.a); aVar = aVar.c) {
            z = true;
            sb.append(MessageFormatter.DELIM_START);
            sb.append(aVar.a);
            sb.append(':');
            List<V> list = aVar.b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
