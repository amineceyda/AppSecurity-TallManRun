package k.h0.g;

import g.a.a.a.a;
import java.io.IOException;
import java.net.ProtocolException;
import k.v;

public final class i {
    public final v a;
    public final int b;
    public final String c;

    public i(v vVar, int i2, String str) {
        this.a = vVar;
        this.b = i2;
        this.c = str;
    }

    public static i a(String str) throws IOException {
        String str2;
        v vVar = v.HTTP_1_0;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.w("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    vVar = v.HTTP_1_1;
                } else {
                    throw new ProtocolException(a.w("Unexpected status line: ", str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i2 = 4;
        } else {
            throw new ProtocolException(a.w("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException(a.w("Unexpected status line: ", str));
                }
                return new i(vVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.w("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.w("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == v.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
