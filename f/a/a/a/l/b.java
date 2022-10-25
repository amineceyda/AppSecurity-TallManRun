package f.a.a.a.l;

import java.io.Serializable;

public class b implements Serializable {
    private static final long serialVersionUID = -804643281218337001L;
    public final String codeLocation;
    private final boolean exact;
    public final String version;

    public b(String str, String str2, boolean z) {
        this.codeLocation = str;
        this.version = str2;
        this.exact = z;
    }

    public boolean a() {
        return this.exact;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.codeLocation;
        if (str == null) {
            if (bVar.codeLocation != null) {
                return false;
            }
        } else if (!str.equals(bVar.codeLocation)) {
            return false;
        }
        if (this.exact != bVar.exact) {
            return false;
        }
        String str2 = this.version;
        String str3 = bVar.version;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.codeLocation;
        return 31 + (str == null ? 0 : str.hashCode());
    }
}
