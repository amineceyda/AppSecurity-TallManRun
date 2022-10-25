package f.a.a.a.i;

import e.e.f.b;
import f.a.a.a.l.d;
import f.a.a.a.l.j;
import f.a.a.b.e;

public class x extends i {
    public String q(d dVar) {
        StringBuilder sb = new StringBuilder(2048);
        r(sb, (String) null, 1, dVar);
        return sb.toString();
    }

    public void r(StringBuilder sb, String str, int i2, d dVar) {
        if (((j) dVar).f1670f != null) {
            r(sb, str, i2, ((j) dVar).f1670f);
            str = null;
        }
        b.q(sb, i2 - 1);
        if (str != null) {
            sb.append(str);
        }
        j jVar = (j) dVar;
        if (jVar.f1670f != null) {
            sb.append("Wrapped by: ");
        }
        sb.append(jVar.b);
        sb.append(": ");
        sb.append(jVar.c);
        sb.append(e.a);
        p(sb, i2, dVar);
        j[] jVarArr = jVar.f1671g;
        if (jVarArr != null) {
            for (j r : jVarArr) {
                r(sb, "Suppressed: ", i2 + 1, r);
            }
        }
    }
}
