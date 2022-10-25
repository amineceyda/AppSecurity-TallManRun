package i.o.c;

import i.r.a;
import i.r.e;

public abstract class m extends b implements e {
    public m() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (!d().equals(mVar.d()) || !getName().equals(mVar.getName()) || !h().equals(mVar.h()) || !h.a(this.receiver, mVar.receiver)) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return h().hashCode() + ((hashCode + (d().hashCode() * 31)) * 31);
    }

    public String toString() {
        a b = b();
        if (b != this) {
            return b.toString();
        }
        StringBuilder i2 = g.a.a.a.a.i("property ");
        i2.append(getName());
        i2.append(" (Kotlin reflection is not available)");
        return i2.toString();
    }
}
