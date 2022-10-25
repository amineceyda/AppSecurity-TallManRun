package g.e.a.b.e.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class q implements p {
    public final String b;
    public final ArrayList c;

    public q(String str, List list) {
        this.b = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.addAll(list);
    }

    public final Double d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String e() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.b;
        if (str == null ? qVar.b == null : str.equals(qVar.b)) {
            return this.c.equals(qVar.c);
        }
        return false;
    }

    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final p i(String str, h4 h4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final p l() {
        return this;
    }

    public final Boolean m() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
