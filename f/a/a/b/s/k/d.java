package f.a.a.b.s.k;

import g.a.a.a.a;

public class d {
    public final int a;
    public final Object b;
    public d c;

    public d(int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    public String a() {
        if (this.c == null) {
            return "";
        }
        StringBuilder i2 = a.i(" -> ");
        i2.append(this.c);
        return i2.toString();
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && ((obj2 = this.b) == null ? dVar.b == null : obj2.equals(dVar.b))) {
            d dVar2 = this.c;
            d dVar3 = dVar.c;
            if (dVar2 != null) {
                if (dVar2.equals(dVar3)) {
                    return true;
                }
            } else if (dVar3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a * 31;
        Object obj = this.b;
        return i2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != 0) {
            str = super.toString();
        } else {
            StringBuilder i2 = a.i("LITERAL(");
            i2.append(this.b);
            i2.append(")");
            str = i2.toString();
        }
        stringBuffer.append(str);
        stringBuffer.append(a());
        return stringBuffer.toString();
    }
}
