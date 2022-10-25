package g.e.a.a.e.d;

import g.e.a.a.e.d.p;

public final class j extends p {
    public final p.a a;
    public final a b;

    public j(p.a aVar, a aVar2, a aVar3) {
        this.a = aVar;
        this.b = aVar2;
    }

    public a a() {
        return this.b;
    }

    public p.a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        p.a aVar = this.a;
        if (aVar != null ? aVar.equals(pVar.b()) : pVar.b() == null) {
            a aVar2 = this.b;
            a a2 = pVar.a();
            if (aVar2 == null) {
                if (a2 == null) {
                    return true;
                }
            } else if (aVar2.equals(a2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        p.a aVar = this.a;
        int i2 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ClientInfo{clientType=");
        i2.append(this.a);
        i2.append(", androidClientInfo=");
        i2.append(this.b);
        i2.append("}");
        return i2.toString();
    }
}
