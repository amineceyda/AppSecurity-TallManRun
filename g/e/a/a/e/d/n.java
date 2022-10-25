package g.e.a.a.e.d;

import g.e.a.a.e.d.t;

public final class n extends t {
    public final t.b a;
    public final t.a b;

    public n(t.b bVar, t.a aVar, a aVar2) {
        this.a = bVar;
        this.b = aVar;
    }

    public t.a a() {
        return this.b;
    }

    public t.b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        t.b bVar = this.a;
        if (bVar != null ? bVar.equals(tVar.b()) : tVar.b() == null) {
            t.a aVar = this.b;
            t.a a2 = tVar.a();
            if (aVar == null) {
                if (a2 == null) {
                    return true;
                }
            } else if (aVar.equals(a2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        t.b bVar = this.a;
        int i2 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        t.a aVar = this.b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("NetworkConnectionInfo{networkType=");
        i2.append(this.a);
        i2.append(", mobileSubtype=");
        i2.append(this.b);
        i2.append("}");
        return i2.toString();
    }
}
