package f.a.a.b.q.d;

public class h {
    public final Class<?> a;
    public final String b;

    public h(Class<?> cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        Class<?> cls = this.a;
        if (cls == null) {
            if (hVar.a != null) {
                return false;
            }
        } else if (!cls.equals(hVar.a)) {
            return false;
        }
        String str = this.b;
        String str2 = hVar.b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Class<?> cls = this.a;
        int i2 = 0;
        int hashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }
}
