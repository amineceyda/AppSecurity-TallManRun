package f.a.a.b.s.k;

import g.a.a.a.a;
import java.util.List;

public class g {

    /* renamed from: d  reason: collision with root package name */
    public static g f1782d = new g(41);

    /* renamed from: e  reason: collision with root package name */
    public static g f1783e = new g(1005, "BARE");

    /* renamed from: f  reason: collision with root package name */
    public static g f1784f = new g(37);
    public final int a;
    public final String b;
    public final List<String> c;

    public g(int i2) {
        this.a = i2;
        this.b = null;
        this.c = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a != gVar.a) {
            return false;
        }
        String str = this.b;
        String str2 = gVar.b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i2 = this.a * 29;
        String str = this.b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb;
        int i2 = this.a;
        if (i2 == 37) {
            str = "%";
        } else if (i2 == 41) {
            str = "RIGHT_PARENTHESIS";
        } else if (i2 == 1000) {
            str = "LITERAL";
        } else if (i2 != 1002) {
            switch (i2) {
                case 1004:
                    str = "SIMPLE_KEYWORD";
                    break;
                case 1005:
                    str = "COMPOSITE_KEYWORD";
                    break;
                case 1006:
                    str = "OPTION";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FormatModifier";
        }
        if (this.b == null) {
            sb = a.l("Token(", str);
            str2 = ")";
        } else {
            sb = a.n("Token(", str, ", \"");
            sb.append(this.b);
            str2 = "\")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public g(int i2, String str) {
        this.a = i2;
        this.b = str;
        this.c = null;
    }

    public g(int i2, List<String> list) {
        this.a = i2;
        this.b = null;
        this.c = list;
    }
}
