package f.a.a.a.i;

import f.a.a.a.l.b;

public class i extends b0 {
    public void n(StringBuilder sb, f.a.a.a.l.i iVar) {
        b a;
        if (iVar != null && (a = iVar.a()) != null) {
            sb.append(!a.a() ? " ~[" : " [");
            sb.append(a.codeLocation);
            sb.append(':');
            sb.append(a.version);
            sb.append(']');
        }
    }
}
