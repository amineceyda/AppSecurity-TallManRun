package f.a.a.b.s.l;

import g.a.a.a.a;

public class c implements b {
    public void a(String str, StringBuffer stringBuffer, char c, int i2) {
        char c2;
        if (str.indexOf(c) >= 0 || c == '\\') {
            stringBuffer.append(c);
        } else if (c != '_') {
            if (c == 'n') {
                c2 = 10;
            } else if (c == 'r') {
                c2 = 13;
            } else if (c != 't') {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < str.length(); i3++) {
                    sb.append(", \\");
                    sb.append(str.charAt(i3));
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal char '");
                sb3.append(c);
                sb3.append(" at column ");
                sb3.append(i2);
                sb3.append(". Only \\\\, \\_");
                throw new IllegalArgumentException(a.f(sb3, sb2, ", \\t, \\n, \\r combinations are allowed as escape characters."));
            } else {
                c2 = 9;
            }
            stringBuffer.append(c2);
        }
    }
}
