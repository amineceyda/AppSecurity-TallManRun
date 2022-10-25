package f.a.a.b.u.j;

import ch.qos.logback.core.spi.ScanException;
import f.a.a.b.s.b;
import f.a.a.b.s.f;
import f.a.a.b.s.k.e;
import f.a.a.b.s.l.a;
import f.a.a.b.w.d;
import java.util.HashMap;
import java.util.Map;

public class i extends d {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String> f1825g;

    /* renamed from: e  reason: collision with root package name */
    public String f1826e;

    /* renamed from: f  reason: collision with root package name */
    public b<Object> f1827f;

    static {
        HashMap hashMap = new HashMap();
        f1825g = hashMap;
        hashMap.put("i", n.class.getName());
        hashMap.put("d", e.class.getName());
    }

    public i(String str, f.a.a.b.d dVar) {
        String replace = str.replace('\\', '/');
        if (replace != null) {
            this.f1826e = replace.trim().replace("//", "/");
        }
        g(dVar);
        try {
            e eVar = new e(this.f1826e.replace(")", "\\)"), new a());
            eVar.g(this.c);
            f.a.a.b.s.k.a aVar = new f.a.a.b.s.k.a(eVar.t(), f1825g);
            aVar.g(eVar.c);
            this.f1827f = aVar.t();
        } catch (ScanException e2) {
            StringBuilder i2 = g.a.a.a.a.i("Failed to parse pattern \"");
            i2.append(this.f1826e);
            i2.append("\".");
            c(i2.toString(), e2);
        }
        e.e.f.b.x(this.f1827f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        String str = this.f1826e;
        String str2 = ((i) obj).f1826e;
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
        String str = this.f1826e;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String s(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (b bVar = this.f1827f; bVar != null; bVar = bVar.b) {
            sb.append(bVar.h(obj));
        }
        return sb.toString();
    }

    public String t(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (b bVar = this.f1827f; bVar != null; bVar = bVar.b) {
            if (bVar instanceof p) {
                p pVar = (p) bVar;
                for (Object obj : objArr) {
                    if (pVar.b(obj)) {
                        sb.append(bVar.h(obj));
                    }
                }
            } else {
                sb.append(bVar.h(objArr));
            }
        }
        return sb.toString();
    }

    public String toString() {
        return this.f1826e;
    }

    public e<Object> u() {
        for (b bVar = this.f1827f; bVar != null; bVar = bVar.b) {
            if (bVar instanceof e) {
                e<Object> eVar = (e) bVar;
                if (eVar.f1824j) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public String v() {
        return w(false, false);
    }

    public String w(boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        for (b bVar = this.f1827f; bVar != null; bVar = bVar.b) {
            if (bVar instanceof f) {
                str = bVar.h(null);
            } else {
                if (bVar instanceof n) {
                    str2 = z2 ? "(\\d+)" : "\\d+";
                } else if (bVar instanceof e) {
                    e eVar = (e) bVar;
                    if (!z || !eVar.f1824j) {
                        str2 = eVar.n();
                    } else {
                        StringBuilder i2 = g.a.a.a.a.i("(");
                        i2.append(eVar.n());
                        i2.append(")");
                        str2 = i2.toString();
                    }
                }
                str = h.c(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
