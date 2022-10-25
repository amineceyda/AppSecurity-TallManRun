package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class m implements p, l {
    public final Map b = new HashMap();

    public final boolean c(String str) {
        return this.b.containsKey(str);
    }

    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public final String e() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return this.b.equals(((m) obj).b);
    }

    public final Iterator f() {
        return new k(this.b.keySet().iterator());
    }

    public final p h(String str) {
        return this.b.containsKey(str) ? (p) this.b.get(str) : p.E;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public p i(String str, h4 h4Var, List list) {
        return "toString".equals(str) ? new t(toString()) : e.s(this, new t(str), h4Var, list);
    }

    public final p l() {
        String str;
        Map map;
        p pVar;
        m mVar = new m();
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getValue() instanceof l) {
                map = mVar.b;
                str = (String) entry.getKey();
                pVar = (p) entry.getValue();
            } else {
                map = mVar.b;
                str = (String) entry.getKey();
                pVar = ((p) entry.getValue()).l();
            }
            map.put(str, pVar);
        }
        return mVar;
    }

    public final Boolean m() {
        return Boolean.TRUE;
    }

    public final void p(String str, p pVar) {
        if (pVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, pVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.b.isEmpty()) {
            for (String str : this.b.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.b.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
