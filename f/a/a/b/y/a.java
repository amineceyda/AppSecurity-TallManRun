package f.a.a.b.y;

import org.slf4j.helpers.MessageFormatter;

public class a {
    public C0057a a;
    public Object b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public a f1853d;

    /* renamed from: f.a.a.b.y.a$a  reason: collision with other inner class name */
    public enum C0057a {
        LITERAL,
        VARIABLE
    }

    public a(C0057a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    public void a(a aVar) {
        if (aVar != null) {
            a aVar2 = this;
            while (true) {
                a aVar3 = aVar2.f1853d;
                if (aVar3 == null) {
                    aVar2.f1853d = aVar;
                    return;
                }
                aVar2 = aVar3;
            }
        }
    }

    public void b(a aVar, StringBuilder sb) {
        while (aVar != null) {
            sb.append(aVar.toString());
            sb.append(" --> ");
            aVar = aVar.f1853d;
        }
        sb.append("null ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a) {
            return false;
        }
        Object obj2 = this.b;
        if (obj2 == null ? aVar.b != null : !obj2.equals(aVar.b)) {
            return false;
        }
        Object obj3 = this.c;
        if (obj3 == null ? aVar.c != null : !obj3.equals(aVar.c)) {
            return false;
        }
        a aVar2 = this.f1853d;
        a aVar3 = aVar.f1853d;
        return aVar2 == null ? aVar3 == null : aVar2.equals(aVar3);
    }

    public int hashCode() {
        C0057a aVar = this.a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.c;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        a aVar2 = this.f1853d;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            StringBuilder i2 = g.a.a.a.a.i("Node{type=");
            i2.append(this.a);
            i2.append(", payload='");
            i2.append(this.b);
            i2.append("'}");
            return i2.toString();
        } else if (ordinal != 1) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Object obj = this.c;
            if (obj != null) {
                b((a) obj, sb2);
            }
            b((a) this.b, sb);
            String str = "Node{type=" + this.a + ", payload='" + sb.toString() + "'";
            if (this.c != null) {
                StringBuilder l2 = g.a.a.a.a.l(str, ", defaultPart=");
                l2.append(sb2.toString());
                str = l2.toString();
            }
            return str + MessageFormatter.DELIM_STOP;
        }
    }
}
