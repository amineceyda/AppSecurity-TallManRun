package f.a.a.a.l;

import g.a.a.a.a;
import java.io.Serializable;

public class i implements Serializable {
    private static final long serialVersionUID = -2374374378980555982L;
    public transient String b;
    private b cpd;
    public final StackTraceElement ste;

    public i(StackTraceElement stackTraceElement) {
        if (stackTraceElement != null) {
            this.ste = stackTraceElement;
            return;
        }
        throw new IllegalArgumentException("ste cannot be null");
    }

    public b a() {
        return this.cpd;
    }

    public void b(b bVar) {
        if (this.cpd == null) {
            this.cpd = bVar;
            return;
        }
        throw new IllegalStateException("Packaging data has been already set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.ste.equals(iVar.ste)) {
            return false;
        }
        b bVar = this.cpd;
        b bVar2 = iVar.cpd;
        if (bVar == null) {
            if (bVar2 != null) {
                return false;
            }
        } else if (!bVar.equals(bVar2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.ste.hashCode();
    }

    public String toString() {
        if (this.b == null) {
            StringBuilder i2 = a.i("at ");
            i2.append(this.ste.toString());
            this.b = i2.toString();
        }
        return this.b;
    }
}
