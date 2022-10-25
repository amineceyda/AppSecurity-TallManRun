package f.a.a.b.q.d;

import java.util.ArrayList;
import java.util.Iterator;

public class e {
    public ArrayList<String> a = new ArrayList<>();

    public e() {
    }

    public e(String str) {
        String[] split;
        if (str != null && (split = str.split("/")) != null) {
            for (String str2 : split) {
                if (str2.length() > 0) {
                    this.a.add(str2);
                }
            }
        }
    }

    public e a() {
        e eVar = new e();
        eVar.a.addAll(this.a);
        return eVar;
    }

    public String b(int i2) {
        return this.a.get(i2);
    }

    public String c() {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a.get(this.a.size() - 1);
    }

    public int d() {
        return this.a.size();
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            sb.append("[");
            sb.append(it.next());
            sb.append("]");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.d() != d()) {
            return false;
        }
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            if (!b(i2).equalsIgnoreCase(eVar.b(i2))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return e();
    }
}
