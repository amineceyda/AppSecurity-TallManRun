package f.a.a.b.s.k;

import ch.qos.logback.core.spi.ScanException;
import f.a.a.b.s.i;
import f.a.a.b.s.l.b;
import f.a.a.b.w.d;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class e<E> extends d {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String> f1778g;

    /* renamed from: e  reason: collision with root package name */
    public final List<g> f1779e;

    /* renamed from: f  reason: collision with root package name */
    public int f1780f = 0;

    static {
        HashMap hashMap = new HashMap();
        f1778g = hashMap;
        hashMap.put("BARE", f.a.a.b.s.e.class.getName());
        hashMap.put("replace", i.class.getName());
    }

    public e(String str, b bVar) throws ScanException {
        try {
            this.f1779e = new h(str, bVar).c();
        } catch (IllegalArgumentException e2) {
            throw new ScanException("Failed to initialize Parser", e2);
        }
    }

    public c s() throws ScanException {
        g w = w();
        v(w, "a LEFT_PARENTHESIS or KEYWORD");
        int i2 = w.a;
        if (i2 == 1004) {
            f fVar = new f(x().b);
            g w2 = w();
            if (w2 != null && w2.a == 1006) {
                fVar.f1781e = w2.c;
                u();
            }
            return fVar;
        } else if (i2 == 1005) {
            u();
            b bVar = new b(w.b.toString());
            bVar.f1776f = t();
            g x = x();
            if (x == null || x.a != 41) {
                String str = "Expecting RIGHT_PARENTHESIS token but got " + x;
                m(str);
                m("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
                throw new ScanException(str);
            }
            g w3 = w();
            if (w3 != null && w3.a == 1006) {
                bVar.f1781e = w3.c;
                u();
            }
            return bVar;
        } else {
            throw new IllegalStateException("Unexpected token " + w);
        }
    }

    public d t() throws ScanException {
        d dVar;
        c cVar;
        String str;
        g w = w();
        v(w, "a LITERAL or '%'");
        int i2 = w.a;
        d dVar2 = null;
        if (i2 == 37) {
            u();
            g w2 = w();
            v(w2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
            if (w2.a == 1002) {
                String str2 = w2.b;
                Objects.requireNonNull(str2, "Argument cannot be null");
                f.a.a.b.s.d dVar3 = new f.a.a.b.s.d();
                int indexOf = str2.indexOf(46);
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    int i3 = indexOf + 1;
                    if (i3 != str2.length()) {
                        str = str2.substring(i3);
                        str2 = substring;
                    } else {
                        throw new IllegalArgumentException(a.c("Formatting string [", str2, "] should not end with '.'"));
                    }
                } else {
                    str = null;
                }
                if (str2 != null && str2.length() > 0) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt >= 0) {
                        dVar3.a = parseInt;
                    } else {
                        dVar3.a = -parseInt;
                        dVar3.c = false;
                    }
                }
                if (str != null && str.length() > 0) {
                    int parseInt2 = Integer.parseInt(str);
                    if (parseInt2 >= 0) {
                        dVar3.b = parseInt2;
                    } else {
                        dVar3.b = -parseInt2;
                        dVar3.f1761d = false;
                    }
                }
                u();
                cVar = s();
                cVar.f1777d = dVar3;
            } else {
                cVar = s();
            }
            dVar = cVar;
        } else if (i2 != 1000) {
            dVar = null;
        } else {
            u();
            dVar = new d(0, w.b);
        }
        if (dVar == null) {
            return null;
        }
        if (w() != null) {
            dVar2 = t();
        }
        if (dVar2 != null) {
            dVar.c = dVar2;
        }
        return dVar;
    }

    public void u() {
        this.f1780f++;
    }

    public void v(g gVar, String str) {
        if (gVar == null) {
            throw new IllegalStateException(a.w("All tokens consumed but was expecting ", str));
        }
    }

    public g w() {
        if (this.f1780f < this.f1779e.size()) {
            return this.f1779e.get(this.f1780f);
        }
        return null;
    }

    public g x() {
        if (this.f1780f >= this.f1779e.size()) {
            return null;
        }
        List<g> list = this.f1779e;
        int i2 = this.f1780f;
        this.f1780f = i2 + 1;
        return list.get(i2);
    }
}
